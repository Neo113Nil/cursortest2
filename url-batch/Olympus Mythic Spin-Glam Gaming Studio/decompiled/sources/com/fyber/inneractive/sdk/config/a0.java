package com.fyber.inneractive.sdk.config;

import android.content.Context;
import com.iab.omid.library.fyber.Omid;

/* loaded from: classes4.dex */
public final class a0 implements Runnable {
    public final /* synthetic */ IAConfigManager a;
    public final /* synthetic */ Context b;

    public a0(IAConfigManager iAConfigManager, Context context) {
        this.a = iAConfigManager;
        this.b = context;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            int i = Omid.$r8$clinit;
            com.fyber.inneractive.sdk.util.r.b.post(new z(this));
        } catch (Throwable unused) {
        }
    }
}
