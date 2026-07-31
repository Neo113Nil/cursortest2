package com.five_corp.ad.internal.cache;

/* loaded from: classes5.dex */
public final class d implements Runnable {
    public final /* synthetic */ e a;
    public final /* synthetic */ com.five_corp.ad.internal.util.b b;

    public d(e eVar, com.five_corp.ad.internal.util.b bVar) {
        this.a = eVar;
        this.b = bVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.a.a(this.b.b);
    }
}
