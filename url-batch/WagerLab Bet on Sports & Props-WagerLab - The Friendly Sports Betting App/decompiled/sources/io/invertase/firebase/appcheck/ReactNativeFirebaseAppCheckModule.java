package io.invertase.firebase.appcheck;

import android.content.pm.PackageManager;
import android.util.Log;
import com.amazon.a.a.o.b;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.WritableMap;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.FirebaseApp;
import com.google.firebase.appcheck.AppCheckToken;
import com.google.firebase.appcheck.FirebaseAppCheck;
import io.invertase.firebase.common.ReactNativeFirebaseEvent;
import io.invertase.firebase.common.ReactNativeFirebaseEventEmitter;
import io.invertase.firebase.common.ReactNativeFirebaseJSON;
import io.invertase.firebase.common.ReactNativeFirebaseMeta;
import io.invertase.firebase.common.ReactNativeFirebaseModule;
import io.invertase.firebase.common.ReactNativeFirebasePreferences;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.Callable;

/* loaded from: classes8.dex */
public class ReactNativeFirebaseAppCheckModule extends ReactNativeFirebaseModule {
    private static final String KEY_APPCHECK_TOKEN_REFRESH_ENABLED = "app_check_token_auto_refresh";
    private static final String LOGTAG = "RNFBAppCheck";
    private static final String TAG = "AppCheck";
    private static HashMap<String, FirebaseAppCheck.AppCheckListener> mAppCheckListeners = new HashMap<>();
    ReactNativeFirebaseAppCheckProviderFactory providerFactory;

    static boolean isAppCheckTokenRefreshEnabled() {
        boolean booleanValue;
        ReactNativeFirebaseJSON sharedInstance = ReactNativeFirebaseJSON.getSharedInstance();
        ReactNativeFirebaseMeta sharedInstance2 = ReactNativeFirebaseMeta.getSharedInstance();
        ReactNativeFirebasePreferences sharedInstance3 = ReactNativeFirebasePreferences.getSharedInstance();
        if (sharedInstance3.contains(KEY_APPCHECK_TOKEN_REFRESH_ENABLED)) {
            booleanValue = sharedInstance3.getBooleanValue(KEY_APPCHECK_TOKEN_REFRESH_ENABLED, true);
            Log.d(LOGTAG, "isAppCheckCollectionEnabled via RNFBPreferences: " + booleanValue);
        } else if (sharedInstance.contains(KEY_APPCHECK_TOKEN_REFRESH_ENABLED)) {
            booleanValue = sharedInstance.getBooleanValue(KEY_APPCHECK_TOKEN_REFRESH_ENABLED, true);
            Log.d(LOGTAG, "isAppCheckCollectionEnabled via RNFBJSON: " + booleanValue);
        } else {
            booleanValue = sharedInstance2.getBooleanValue(KEY_APPCHECK_TOKEN_REFRESH_ENABLED, true);
            Log.d(LOGTAG, "isAppCheckCollectionEnabled via RNFBMeta: " + booleanValue);
        }
        Log.d(LOGTAG, "isAppCheckTokenRefreshEnabled final value: " + booleanValue);
        return booleanValue;
    }

    private boolean isAppDebuggable() throws Exception {
        PackageManager packageManager = getContext().getPackageManager();
        boolean z = false;
        if (packageManager != null && (packageManager.getApplicationInfo(getContext().getPackageName(), 0).flags & 2) != 0) {
            z = true;
        }
        Log.d(LOGTAG, "debuggable status? " + z);
        return z;
    }

    ReactNativeFirebaseAppCheckModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext, TAG);
        this.providerFactory = new ReactNativeFirebaseAppCheckProviderFactory();
        FirebaseAppCheck.getInstance().setTokenAutoRefreshEnabled(isAppCheckTokenRefreshEnabled());
    }

    @Override // io.invertase.firebase.common.ReactNativeFirebaseModule, com.facebook.react.bridge.BaseJavaModule, com.facebook.react.bridge.NativeModule, com.facebook.react.turbomodule.core.interfaces.TurboModule
    public void invalidate() {
        super.invalidate();
        Log.d(TAG, "instance-destroyed");
        Iterator<Map.Entry<String, FirebaseAppCheck.AppCheckListener>> it = mAppCheckListeners.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<String, FirebaseAppCheck.AppCheckListener> next = it.next();
            FirebaseAppCheck.getInstance(FirebaseApp.getInstance(next.getKey())).removeAppCheckListener(next.getValue());
            it.remove();
        }
    }

    @ReactMethod
    public void configureProvider(String str, String str2, String str3, Promise promise) {
        Log.d(LOGTAG, "configureProvider - appName/providerName/debugToken: " + str + "/" + str2 + (str3 != null ? "/(not shown)" : "/null"));
        try {
            this.providerFactory.configure(str, str2, str3);
            FirebaseAppCheck.getInstance(FirebaseApp.getInstance(str)).installAppCheckProviderFactory(this.providerFactory);
            promise.resolve(null);
        } catch (Exception e) {
            rejectPromiseWithCodeAndMessage(promise, "unknown", "internal-error", e.getMessage());
        }
    }

    @ReactMethod
    public void activate(String str, String str2, boolean z, Promise promise) {
        try {
            FirebaseAppCheck.getInstance(FirebaseApp.getInstance(str)).setTokenAutoRefreshEnabled(z);
            if (isAppDebuggable()) {
                Log.d(LOGTAG, "app is debuggable, configuring AppCheck for testing mode");
                Log.d(LOGTAG, "no debug app check token found in BuildConfig. Check Log for dynamic test token to configure in console.");
                this.providerFactory.configure(str, b.ar, null);
            } else {
                this.providerFactory.configure(str, "safetyNet", null);
            }
            FirebaseAppCheck.getInstance(FirebaseApp.getInstance(str)).installAppCheckProviderFactory(this.providerFactory);
            promise.resolve(null);
        } catch (Exception e) {
            rejectPromiseWithCodeAndMessage(promise, "unknown", "internal-error", e.getMessage());
        }
    }

    @ReactMethod
    public void setTokenAutoRefreshEnabled(String str, boolean z) {
        FirebaseAppCheck.getInstance(FirebaseApp.getInstance(str)).setTokenAutoRefreshEnabled(z);
    }

    @ReactMethod
    public void getToken(String str, final boolean z, final Promise promise) {
        Log.d(LOGTAG, "getToken appName/forceRefresh: " + str + "/" + z);
        final FirebaseApp firebaseApp = FirebaseApp.getInstance(str);
        Tasks.call(getExecutor(), new Callable() { // from class: io.invertase.firebase.appcheck.ReactNativeFirebaseAppCheckModule$$ExternalSyntheticLambda1
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return ReactNativeFirebaseAppCheckModule.lambda$getToken$0(FirebaseApp.this, z);
            }
        }).addOnCompleteListener(getExecutor(), new OnCompleteListener() { // from class: io.invertase.firebase.appcheck.ReactNativeFirebaseAppCheckModule$$ExternalSyntheticLambda2
            @Override // com.google.android.gms.tasks.OnCompleteListener
            public final void onComplete(Task task) {
                ReactNativeFirebaseAppCheckModule.lambda$getToken$1(Promise.this, task);
            }
        });
    }

    static /* synthetic */ AppCheckToken lambda$getToken$0(FirebaseApp firebaseApp, boolean z) throws Exception {
        return (AppCheckToken) Tasks.await(FirebaseAppCheck.getInstance(firebaseApp).getAppCheckToken(z));
    }

    static /* synthetic */ void lambda$getToken$1(Promise promise, Task task) {
        if (task.isSuccessful()) {
            WritableMap createMap = Arguments.createMap();
            createMap.putString("token", ((AppCheckToken) task.getResult()).getToken());
            promise.resolve(createMap);
        } else {
            Log.e(LOGTAG, "RNFB: Unknown error while fetching AppCheck token " + task.getException().getMessage());
            rejectPromiseWithCodeAndMessage(promise, "token-error", task.getException().getMessage());
        }
    }

    @ReactMethod
    public void getLimitedUseToken(String str, final Promise promise) {
        Log.d(LOGTAG, "getLimitedUseToken appName: " + str);
        final FirebaseApp firebaseApp = FirebaseApp.getInstance(str);
        Tasks.call(getExecutor(), new Callable() { // from class: io.invertase.firebase.appcheck.ReactNativeFirebaseAppCheckModule$$ExternalSyntheticLambda3
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return ReactNativeFirebaseAppCheckModule.lambda$getLimitedUseToken$2(FirebaseApp.this);
            }
        }).addOnCompleteListener(getExecutor(), new OnCompleteListener() { // from class: io.invertase.firebase.appcheck.ReactNativeFirebaseAppCheckModule$$ExternalSyntheticLambda4
            @Override // com.google.android.gms.tasks.OnCompleteListener
            public final void onComplete(Task task) {
                ReactNativeFirebaseAppCheckModule.lambda$getLimitedUseToken$3(Promise.this, task);
            }
        });
    }

    static /* synthetic */ AppCheckToken lambda$getLimitedUseToken$2(FirebaseApp firebaseApp) throws Exception {
        return (AppCheckToken) Tasks.await(FirebaseAppCheck.getInstance(firebaseApp).getLimitedUseAppCheckToken());
    }

    static /* synthetic */ void lambda$getLimitedUseToken$3(Promise promise, Task task) {
        if (task.isSuccessful()) {
            WritableMap createMap = Arguments.createMap();
            createMap.putString("token", ((AppCheckToken) task.getResult()).getToken());
            promise.resolve(createMap);
        } else {
            Log.e(LOGTAG, "Unknown error while fetching limited-use AppCheck token " + task.getException().getMessage());
            rejectPromiseWithCodeAndMessage(promise, "token-error", task.getException().getMessage());
        }
    }

    @ReactMethod
    public void addAppCheckListener(final String str) {
        Log.d(TAG, "addAppCheckListener " + str);
        FirebaseAppCheck firebaseAppCheck = FirebaseAppCheck.getInstance(FirebaseApp.getInstance(str));
        if (mAppCheckListeners.get(str) == null) {
            FirebaseAppCheck.AppCheckListener appCheckListener = new FirebaseAppCheck.AppCheckListener() { // from class: io.invertase.firebase.appcheck.ReactNativeFirebaseAppCheckModule$$ExternalSyntheticLambda0
                @Override // com.google.firebase.appcheck.FirebaseAppCheck.AppCheckListener
                public final void onAppCheckTokenChanged(AppCheckToken appCheckToken) {
                    ReactNativeFirebaseAppCheckModule.lambda$addAppCheckListener$4(str, appCheckToken);
                }
            };
            firebaseAppCheck.addAppCheckListener(appCheckListener);
            mAppCheckListeners.put(str, appCheckListener);
        }
    }

    static /* synthetic */ void lambda$addAppCheckListener$4(String str, AppCheckToken appCheckToken) {
        WritableMap createMap = Arguments.createMap();
        createMap.putString("appName", str);
        createMap.putString("token", appCheckToken.getToken());
        createMap.putDouble("expireTimeMillis", appCheckToken.getExpireTimeMillis());
        ReactNativeFirebaseEventEmitter.getSharedInstance().sendEvent(new ReactNativeFirebaseEvent("appCheck_token_changed", createMap, str));
    }

    @ReactMethod
    public void removeAppCheckListener(String str) {
        Log.d(TAG, "removeAppCheckListener " + str);
        FirebaseAppCheck firebaseAppCheck = FirebaseAppCheck.getInstance(FirebaseApp.getInstance(str));
        FirebaseAppCheck.AppCheckListener appCheckListener = mAppCheckListeners.get(str);
        if (appCheckListener != null) {
            firebaseAppCheck.removeAppCheckListener(appCheckListener);
            mAppCheckListeners.remove(str);
        }
    }
}
