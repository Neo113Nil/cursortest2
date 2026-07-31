package com.five_corp.ad.internal.cache;

/* loaded from: classes5.dex */
public final class j implements Runnable {
    public final /* synthetic */ n a;

    public j(n nVar) {
        this.a = nVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean isEmpty;
        n nVar;
        synchronized (this.a.a) {
            isEmpty = this.a.f.isEmpty();
            nVar = this.a;
            nVar.d = true;
        }
        if (isEmpty) {
            return;
        }
        nVar.b.post(new k(nVar));
    }
}
