package com.five_corp.ad.internal.http.auxcache;

/* loaded from: classes3.dex */
public final class b implements Runnable {
    public final /* synthetic */ com.five_corp.ad.internal.context.h a;
    public final /* synthetic */ h b;

    public b(h hVar, com.five_corp.ad.internal.context.h hVar2) {
        this.b = hVar;
        this.a = hVar2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        j a = this.b.a(new com.five_corp.ad.internal.http.a(this.a, 2));
        if (a == null) {
            return;
        }
        this.b.j.b.addLast(a);
        this.b.a();
    }
}
