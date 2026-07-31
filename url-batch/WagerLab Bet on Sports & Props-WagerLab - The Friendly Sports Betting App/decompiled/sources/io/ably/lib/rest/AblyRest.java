package io.ably.lib.rest;

import android.content.Context;
import io.ably.lib.push.LocalDevice;
import io.ably.lib.types.AblyException;
import io.ably.lib.types.ClientOptions;
import io.ably.lib.util.AndroidPlatformAgentProvider;
import io.ably.lib.util.Log;

/* loaded from: classes7.dex */
public class AblyRest extends AblyBase {
    private static final String TAG = "io.ably.lib.rest.AblyRest";

    public AblyRest(String str) throws AblyException {
        super(str, new AndroidPlatformAgentProvider());
    }

    public AblyRest(ClientOptions clientOptions) throws AblyException {
        super(clientOptions, new AndroidPlatformAgentProvider());
    }

    public LocalDevice device() throws AblyException {
        return this.push.getLocalDevice();
    }

    public void setAndroidContext(Context context) throws AblyException {
        Log.v(TAG, "setAndroidContext(): context=" + context);
        this.platform.setAndroidContext(context);
        this.push.tryRequestRegistrationToken();
    }

    @Override // io.ably.lib.rest.AblyBase
    protected void onClientIdSet(String str) {
        Log.v(TAG, "onClientIdSet(): clientId=" + str);
        if (this.push == null || !this.platform.hasApplicationContext()) {
            return;
        }
        try {
            this.push.getActivationContext().setClientId(str, true);
        } catch (AblyException unused) {
            Log.e(TAG, "unable to update local device state");
        }
    }
}
