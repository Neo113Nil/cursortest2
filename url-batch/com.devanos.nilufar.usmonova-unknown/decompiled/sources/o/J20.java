package o;

import java.util.concurrent.CountDownLatch;

/* loaded from: classes.dex */
public final class J20 implements InterfaceC1224iG, InterfaceC0960eG, InterfaceC0698aG, InterfaceC0764bG {
    public final CountDownLatch h;

    @Override // o.InterfaceC0698aG
    public void b() {
        this.h.countDown();
    }

    @Override // o.InterfaceC1224iG
    public void c(Object obj) {
        this.h.countDown();
    }

    @Override // o.InterfaceC0960eG
    public void d(Exception exc) {
        this.h.countDown();
    }

    @Override // o.InterfaceC0764bG
    public void onComplete(MU mu) {
        this.h.countDown();
    }

    public /* synthetic */ J20() {
        this.h = new CountDownLatch(1);
    }
}
