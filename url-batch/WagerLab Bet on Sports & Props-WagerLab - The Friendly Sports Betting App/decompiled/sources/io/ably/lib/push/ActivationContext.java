package io.ably.lib.push;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.messaging.FirebaseMessaging;
import io.ably.lib.push.ActivationStateMachine;
import io.ably.lib.rest.AblyRest;
import io.ably.lib.types.AblyException;
import io.ably.lib.types.Callback;
import io.ably.lib.types.ClientOptions;
import io.ably.lib.types.ErrorInfo;
import io.ably.lib.types.RegistrationToken;
import io.ably.lib.util.Log;
import java.util.WeakHashMap;

/* loaded from: classes7.dex */
public class ActivationContext {
    protected AblyRest ably;
    protected ActivationStateMachine activationStateMachine;
    protected String clientId;
    protected final Context context;
    protected LocalDevice localDevice;
    protected final SharedPreferences prefs;
    private static final WeakHashMap<Context, ActivationContext> activationContexts = new WeakHashMap<>();
    private static final String TAG = ActivationContext.class.getName();

    public ActivationContext(Context context) {
        this.context = context;
        this.prefs = PreferenceManager.getDefaultSharedPreferences(context);
    }

    Context getContext() {
        return this.context;
    }

    SharedPreferences getPreferences() {
        return this.prefs;
    }

    public synchronized LocalDevice getLocalDevice() {
        if (this.localDevice == null) {
            Log.v(TAG, "getLocalDevice(): creating new instance and returning that");
            AblyRest ablyRest = this.ably;
            this.localDevice = new LocalDevice(this, ablyRest != null ? ablyRest.options.localStorage : null);
        } else {
            Log.v(TAG, "getLocalDevice(): returning existing instance");
        }
        return this.localDevice;
    }

    public synchronized void setActivationStateMachine(ActivationStateMachine activationStateMachine) {
        Log.v(TAG, "setActivationStateMachine(): activationStateMachine=" + activationStateMachine);
        this.activationStateMachine = activationStateMachine;
    }

    public synchronized ActivationStateMachine getActivationStateMachine() {
        if (this.activationStateMachine == null) {
            Log.v(TAG, "getActivationStateMachine(): creating new instance and returning that");
            this.activationStateMachine = new ActivationStateMachine(this);
        } else {
            Log.v(TAG, "getActivationStateMachine(): returning existing instance");
        }
        return this.activationStateMachine;
    }

    public void setAbly(AblyRest ablyRest) {
        this.ably = ablyRest;
        this.clientId = ablyRest.auth.clientId;
    }

    AblyRest getAbly() throws AblyException {
        if (this.ably != null) {
            Log.v(TAG, "getAbly(): returning existing Ably instance");
            return this.ably;
        }
        String str = TAG;
        Log.v(str, "getAbly(): creating new Ably instance");
        String str2 = getLocalDevice().deviceIdentityToken;
        if (str2 == null) {
            Log.e(str, "getAbly(): unable to create Ably instance using deviceIdentityToken");
            throw AblyException.fromErrorInfo(new ErrorInfo("Unable to get Ably library instance; no device identity token", 40000, 400));
        }
        Log.v(str, "getAbly(): returning Ably instance using deviceIdentityToken");
        AblyRest ablyRest = new AblyRest(str2);
        this.ably = ablyRest;
        return ablyRest;
    }

    AblyRest getDeviceIdentityTokenBasedAblyClient(String str) throws AblyException {
        ClientOptions copy = this.ably.options.copy();
        copy.clearAuthOptions();
        copy.token = str;
        return new AblyRest(copy);
    }

    public boolean setClientId(String str, boolean z) {
        ActivationStateMachine activationStateMachine;
        String str2 = TAG;
        Log.v(str2, "setClientId(): clientId=" + str + ", propagateGotPushDeviceDetails=" + z);
        boolean equals = str.equals(this.clientId);
        boolean z2 = !equals;
        if (!equals) {
            this.clientId = str;
            if (this.localDevice != null) {
                Log.v(str2, "setClientId(): local device exists");
                this.localDevice.setClientId(str);
                if (this.localDevice.isRegistered() && (activationStateMachine = this.activationStateMachine) != null && z) {
                    activationStateMachine.handleEvent(new ActivationStateMachine.GotPushDeviceDetails());
                    return z2;
                }
            } else {
                Log.v(str2, "setClientId(): local device doest not exist");
            }
        }
        return z2;
    }

    public void onNewRegistrationToken(RegistrationToken.Type type, String str) {
        String str2 = TAG;
        Log.v(str2, "onNewRegistrationToken(): type=" + type + ", token=" + str);
        LocalDevice localDevice = getLocalDevice();
        RegistrationToken registrationToken = localDevice.getRegistrationToken();
        if (registrationToken != null) {
            if (registrationToken.type != type) {
                Log.e(str2, "trying to register device with " + type + ", but it was already registered with " + registrationToken.type);
                return;
            } else if (registrationToken.token.equals(str)) {
                return;
            }
        }
        Log.v(str2, "onNewRegistrationToken(): updating token");
        localDevice.setAndPersistRegistrationToken(new RegistrationToken(type, str));
        getActivationStateMachine().handleEvent(new ActivationStateMachine.GotPushDeviceDetails());
    }

    public void reset() {
        Log.v(TAG, "reset()");
        this.ably = null;
        getActivationStateMachine().reset();
        this.activationStateMachine = null;
        getLocalDevice().reset();
        this.localDevice = null;
    }

    public static ActivationContext getActivationContext(Context context) {
        return getActivationContext(context, null);
    }

    public static ActivationContext getActivationContext(Context context, AblyRest ablyRest) {
        ActivationContext activationContext;
        WeakHashMap<Context, ActivationContext> weakHashMap = activationContexts;
        synchronized (weakHashMap) {
            activationContext = weakHashMap.get(context);
            if (activationContext == null) {
                Log.v(TAG, "getActivationContext(): creating new ActivationContext for this application");
                activationContext = new ActivationContext(context);
                weakHashMap.put(context, activationContext);
            } else {
                Log.v(TAG, "getActivationContext(): returning existing ActivationContext for this application");
            }
            if (ablyRest != null) {
                Log.v(TAG, "Setting Ably instance on the activation context");
                activationContext.setAbly(ablyRest);
            } else {
                Log.v(TAG, "Not setting Ably instance on the activation context");
            }
        }
        return activationContext;
    }

    protected void getRegistrationToken(final Callback<String> callback) {
        Log.v(TAG, "getRegistrationToken(): callback=" + callback);
        FirebaseMessaging.getInstance().getToken().addOnCompleteListener(new OnCompleteListener() { // from class: io.ably.lib.push.ActivationContext$$ExternalSyntheticLambda0
            @Override // com.google.android.gms.tasks.OnCompleteListener
            public final void onComplete(Task task) {
                ActivationContext.lambda$getRegistrationToken$0(Callback.this, task);
            }
        });
    }

    static /* synthetic */ void lambda$getRegistrationToken$0(Callback callback, Task task) {
        Log.v(TAG, "getRegistrationToken(): FirebaseMessaging#getToken() completed: task=" + task);
        if (task.isSuccessful()) {
            callback.onSuccess((String) task.getResult());
        } else {
            callback.onError(ErrorInfo.fromThrowable(task.getException()));
        }
    }

    public static void setActivationContext(Context context, ActivationContext activationContext) {
        Log.v(TAG, "setActivationContext(): applicationContext=" + context + ", activationContext=" + activationContext);
        activationContexts.put(context, activationContext);
    }
}
