package com.five_corp.ad.internal.http.auxcache;

/* loaded from: classes3.dex */
public final class a implements Runnable {
    public final /* synthetic */ com.five_corp.ad.internal.context.h a;
    public final /* synthetic */ h b;

    public a(h hVar, com.five_corp.ad.internal.context.h hVar2) {
        this.b = hVar;
        this.a = hVar2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        j a = this.b.a(new com.five_corp.ad.internal.http.a(this.a, 1));
        if (a == null) {
            return;
        }
        this.b.i.b.addLast(a);
        this.b.a();
    }
}
