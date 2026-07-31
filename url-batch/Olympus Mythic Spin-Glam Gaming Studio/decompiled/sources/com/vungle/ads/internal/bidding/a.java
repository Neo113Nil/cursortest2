package com.vungle.ads.internal.bidding;

import com.pubmatic.sdk.video.POBVastError;
import com.vungle.ads.internal.ConfigManager;
import com.vungle.ads.internal.model.v2;
import com.vungle.ads.internal.util.t;
import com.vungle.ads.internal.util.u;

/* loaded from: classes5.dex */
public final class a extends com.vungle.ads.internal.util.b {
    public final /* synthetic */ e a;

    public a(e eVar) {
        this.a = eVar;
    }

    @Override // com.vungle.ads.internal.util.b
    public final void a() {
        e eVar = this.a;
        eVar.getClass();
        boolean z = u.a;
        t.a("BidTokenEncoder", "BidTokenEncoder#onBackground()");
        eVar.e = System.currentTimeMillis();
    }

    @Override // com.vungle.ads.internal.util.b
    public final void b() {
        Integer num;
        e eVar = this.a;
        eVar.getClass();
        boolean z = u.a;
        t.a("BidTokenEncoder", "BidTokenEncoder#onForeground()");
        long currentTimeMillis = System.currentTimeMillis();
        ConfigManager.INSTANCE.getClass();
        v2 v2Var = ConfigManager.a;
        if (currentTimeMillis > eVar.e + (((v2Var == null || (num = v2Var.j) == null) ? POBVastError.UNDEFINED_ERROR : num.intValue()) * 1000)) {
            eVar.c = 0;
            eVar.e = 0L;
        }
    }
}
