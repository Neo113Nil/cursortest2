package com.five_corp.ad.internal.http.auxcache;

/* loaded from: classes3.dex */
public final class c implements Runnable {
    public final /* synthetic */ h a;

    public c(h hVar) {
        this.a = hVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        h hVar = this.a;
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
