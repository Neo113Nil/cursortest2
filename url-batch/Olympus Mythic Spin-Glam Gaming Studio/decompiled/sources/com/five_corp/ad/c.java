package com.five_corp.ad;

/* loaded from: classes5.dex */
public final class c implements Runnable {
    public int a = 0;
    public final /* synthetic */ f b;

    public c(f fVar) {
        this.b = fVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        this.a = i + 1;
        if (i > 25) {
            return;
        }
        if (f.a(this.b.a)) {
            this.b.d.postDelayed(this, 200L);
            return;
        }
        try {
            this.b.h();
        } catch (Exception e) {
            f fVar = this.b;
            fVar.a(fVar.h.getCurrentPositionMs(), new com.five_corp.ad.internal.l(com.five_corp.ad.internal.m.e4, null, e));
        }
    }
}
