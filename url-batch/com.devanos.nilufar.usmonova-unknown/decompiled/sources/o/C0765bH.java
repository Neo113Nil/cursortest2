package o;

/* renamed from: o.bH, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0765bH {
    public final DS a;
    public final C2316yt b = C2316yt.H;
    public final C2316yt c = C2316yt.I;
    public final C2316yt d = C2316yt.J;
    public final C2316yt e = C2316yt.D;
    public final C2316yt f = C2316yt.E;
    public final C2316yt g = C2316yt.F;
    public final C2316yt h = C2316yt.G;

    public C0765bH(P2 p2) {
        this.a = new DS(p2);
    }

    public final void a(InterfaceC0699aH interfaceC0699aH, InterfaceC2114vp interfaceC2114vp, InterfaceC1455lp interfaceC1455lp) {
        Object obj;
        CS cs;
        DS ds = this.a;
        synchronized (ds.f) {
            YD yd = ds.f;
            int i = yd.j;
            if (i > 0) {
                Object[] objArr = yd.h;
                int i2 = 0;
                do {
                    obj = objArr[i2];
                    if (((CS) obj).a == interfaceC2114vp) {
                        break;
                    } else {
                        i2++;
                    }
                } while (i2 < i);
            }
            obj = null;
            cs = (CS) obj;
            if (cs == null) {
                AbstractC0048Bt.l(interfaceC2114vp, "null cannot be cast to non-null type kotlin.Function1<kotlin.Any, kotlin.Unit>");
                AbstractC1305jX.i(1, interfaceC2114vp);
                cs = new CS(interfaceC2114vp);
                yd.b(cs);
            }
        }
        CS cs2 = ds.h;
        long j = ds.i;
        if (j == -1 || j == AbstractC0868ct.p()) {
            try {
                ds.h = cs;
                ds.i = AbstractC0868ct.p();
                cs.a(interfaceC0699aH, ds.e, interfaceC1455lp);
                return;
            } finally {
                ds.h = cs2;
                ds.i = j;
            }
        }
        AbstractC1052fg.S("Detected multithreaded access to SnapshotStateObserver: previousThreadId=" + j + "), currentThread={id=" + AbstractC0868ct.p() + ", name=" + Thread.currentThread().getName() + "}. Note that observation on multiple threads in layout/draw is not supported. Make sure your measure/layout/draw for each Owner (AndroidComposeView) is executed on the same thread.");
        throw null;
    }
}
