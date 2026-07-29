package o;

/* loaded from: classes.dex */
public final class YX extends C1102gQ {
    public final ThreadLocal l;
    private volatile boolean threadLocalIsSet;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public YX(InterfaceC2235xe interfaceC2235xe, InterfaceC0189He interfaceC0189He) {
        super(interfaceC2235xe, interfaceC0189He.k(r0) == null ? interfaceC0189He.D(r0) : interfaceC0189He);
        ZX zx = ZX.h;
        this.l = new ThreadLocal();
        if (interfaceC2235xe.getContext().k(C0460Rq.w) instanceof AbstractC0267Ke) {
            return;
        }
        Object R0 = PX.R0(interfaceC0189He, null);
        PX.K0(interfaceC0189He, R0);
        e0(interfaceC0189He, R0);
    }

    public final boolean d0() {
        boolean z = this.threadLocalIsSet && this.l.get() == null;
        this.l.remove();
        return !z;
    }

    public final void e0(InterfaceC0189He interfaceC0189He, Object obj) {
        this.threadLocalIsSet = true;
        this.l.set(new C1619oH(interfaceC0189He, obj));
    }

    @Override // o.C1102gQ, o.C0283Ku
    public final void l(Object obj) {
        if (this.threadLocalIsSet) {
            C1619oH c1619oH = (C1619oH) this.l.get();
            if (c1619oH != null) {
                PX.K0((InterfaceC0189He) c1619oH.h, c1619oH.i);
            }
            this.l.remove();
        }
        Object H0 = PX.H0(obj);
        InterfaceC2235xe interfaceC2235xe = this.k;
        InterfaceC0189He context = interfaceC2235xe.getContext();
        Object R0 = PX.R0(context, null);
        YX V = R0 != PX.l ? AbstractC0946e20.V(interfaceC2235xe, context, R0) : null;
        try {
            this.k.resumeWith(H0);
            if (V == null || V.d0()) {
                PX.K0(context, R0);
            }
        } catch (Throwable th) {
            if (V == null || V.d0()) {
                PX.K0(context, R0);
            }
            throw th;
        }
    }
}
