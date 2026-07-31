package com.fyber.inneractive.sdk.config;

import android.content.Context;
import android.text.TextUtils;
import com.fyber.inneractive.sdk.external.InneractiveAdManager;
import com.fyber.inneractive.sdk.util.IAlog;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;

/* loaded from: classes5.dex */
public final class m0 implements Runnable {
    public final /* synthetic */ Context a;
    public final /* synthetic */ w b;

    public m0(Context context, w wVar) {
        this.a = context;
        this.b = wVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (InneractiveAdManager.isCurrentUserAChild()) {
            return;
        }
        try {
            int i = AdvertisingIdClient.$r8$clinit;
            n0.a(this.a, this.b);
            v vVar = u.a.b;
            if (TextUtils.isEmpty(vVar != null ? vVar.a : null)) {
                n.a(this.a, this.b);
            }
        } catch (Throwable th) {
            IAlog.a("SDK internal error: Make sure that Google Play Services for Mobile Ads is added to the compile dependencies of your project", th, new Object[0]);
        }
    }
}
