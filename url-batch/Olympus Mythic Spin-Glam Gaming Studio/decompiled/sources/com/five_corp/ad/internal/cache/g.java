package com.five_corp.ad.internal.cache;

/* loaded from: classes5.dex */
public final class g implements Runnable {
    public final /* synthetic */ e a;
    public final /* synthetic */ com.five_corp.ad.internal.l b;

    public g(e eVar, com.five_corp.ad.internal.l lVar) {
        this.a = eVar;
        this.b = lVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.a.a(this.b);
    }
}
