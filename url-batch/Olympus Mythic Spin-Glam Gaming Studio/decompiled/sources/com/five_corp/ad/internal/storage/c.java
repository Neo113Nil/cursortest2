package com.five_corp.ad.internal.storage;

/* loaded from: classes12.dex */
public final class c implements Runnable {
    public final /* synthetic */ a a;

    public c(a aVar) {
        this.a = aVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        a aVar = this.a;
        aVar.a.a(aVar.b, new byte[0]);
    }
}
