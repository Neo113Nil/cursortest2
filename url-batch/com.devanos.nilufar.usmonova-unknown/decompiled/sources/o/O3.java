package o;

import android.view.Choreographer;

/* loaded from: classes.dex */
public final class O3 implements Choreographer.FrameCallback {
    public final /* synthetic */ int h = 0;
    public final /* synthetic */ C0849ca i;
    public final /* synthetic */ InterfaceC2114vp j;

    public O3(C0849ca c0849ca, P3 p3, InterfaceC2114vp interfaceC2114vp) {
        this.i = c0849ca;
        this.j = interfaceC2114vp;
    }

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j) {
        Object d;
        Object d2;
        int i = this.h;
        InterfaceC2114vp interfaceC2114vp = this.j;
        C0849ca c0849ca = this.i;
        switch (i) {
            case 0:
                try {
                    d = interfaceC2114vp.invoke(Long.valueOf(j));
                } catch (Throwable th) {
                    d = AbstractC1494mO.d(th);
                }
                c0849ca.resumeWith(d);
                break;
            default:
                C1907sg c1907sg = C1907sg.h;
                try {
                    d2 = interfaceC2114vp.invoke(Long.valueOf(j));
                } catch (Throwable th2) {
                    d2 = AbstractC1494mO.d(th2);
                }
                c0849ca.resumeWith(d2);
                break;
        }
    }

    public O3(C0849ca c0849ca, InterfaceC2114vp interfaceC2114vp) {
        this.i = c0849ca;
        this.j = interfaceC2114vp;
    }
}
