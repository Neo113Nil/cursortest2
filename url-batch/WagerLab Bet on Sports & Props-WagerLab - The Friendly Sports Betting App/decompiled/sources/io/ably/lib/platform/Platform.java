package io.ably.lib.platform;

import android.content.Context;
import io.ably.lib.transport.NetworkConnectivity;
import io.ably.lib.types.AblyException;
import io.ably.lib.types.ErrorInfo;
import io.ably.lib.util.Log;

/* loaded from: classes7.dex */
public class Platform {
    private static final String TAG = "io.ably.lib.platform.Platform";
    public static final String name = "android";
    private Context applicationContext;
    private final NetworkConnectivity.DelegatedNetworkConnectivity networkConnectivity = new NetworkConnectivity.DelegatedNetworkConnectivity();

    public Context getApplicationContext() {
        return this.applicationContext;
    }

    public void setAndroidContext(Context context) throws AblyException {
        String str = TAG;
        Log.v(str, "setAndroidContext: context=" + context);
        Context applicationContext = context.getApplicationContext();
        if (this.applicationContext != null) {
            Log.v(str, "setAndroidContext(): applicationContext has already been set");
            if (applicationContext == this.applicationContext) {
                Log.v(str, "setAndroidContext(): existing applicationContext is compatible with that being set");
                return;
            }
            throw AblyException.fromErrorInfo(new ErrorInfo("Incompatible application context set", 40000, 400));
        }
        Log.v(str, "setAndroidContext(): there was no existing applicationContext");
        this.applicationContext = applicationContext;
        AndroidNetworkConnectivity.getNetworkConnectivity(applicationContext).addListener(this.networkConnectivity);
    }

    public boolean hasApplicationContext() {
        return this.applicationContext != null;
    }

    public NetworkConnectivity getNetworkConnectivity() {
        return this.networkConnectivity;
    }
}
