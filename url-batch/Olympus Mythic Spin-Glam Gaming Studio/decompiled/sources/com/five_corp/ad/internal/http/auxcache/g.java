package com.five_corp.ad.internal.http.auxcache;

/* loaded from: classes3.dex */
public final class g implements Runnable {
    public final /* synthetic */ Object a;
    public final /* synthetic */ h b;

    public g(h hVar, Object obj) {
        this.b = hVar;
        this.a = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.a.equals(this.b.f)) {
            h hVar = this.b;
            hVar.f = null;
            if (hVar.g) {
                return;
            }
            hVar.g = true;
            hVar.i.a();
            hVar.j.a();
            hVar.a((i) null);
        }
    }
}
