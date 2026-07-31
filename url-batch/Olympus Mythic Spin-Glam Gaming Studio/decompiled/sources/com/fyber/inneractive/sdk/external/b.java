package com.fyber.inneractive.sdk.external;

import android.content.SharedPreferences;
import com.fyber.inneractive.sdk.config.IAConfigManager;
import com.fyber.inneractive.sdk.network.u;
import com.fyber.inneractive.sdk.network.w;
import com.fyber.inneractive.sdk.util.o;

/* loaded from: classes4.dex */
public final class b implements Runnable {
    @Override // java.lang.Runnable
    public final void run() {
        IAConfigManager iAConfigManager = IAConfigManager.N;
        SharedPreferences sharedPreferences = o.a.getSharedPreferences("IAConfigurationPreferences", 0);
        if (sharedPreferences == null || !sharedPreferences.contains("IAConfigFQE")) {
            IAConfigManager.f();
            new w(u.FIRST_OPENED, (InneractiveAdRequest) null, (com.fyber.inneractive.sdk.response.e) null).a((String) null);
        }
    }
}
