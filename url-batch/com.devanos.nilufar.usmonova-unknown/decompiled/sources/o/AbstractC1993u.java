package o;

/* renamed from: o.u, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1993u extends C0283Ku implements InterfaceC2235xe, InterfaceC0422Qe {
    public final InterfaceC0189He j;

    public AbstractC1993u(InterfaceC0189He interfaceC0189He, boolean z) {
        super(z);
        J((InterfaceC0075Cu) interfaceC0189He.k(C0460Rq.K));
        this.j = interfaceC0189He.D(this);
    }

    @Override // o.C0283Ku
    public final void H(C0057Cc c0057Cc) {
        AbstractC1807r8.J(c0057Cc, this.j);
    }

    @Override // o.C0283Ku
    public final void S(Object obj) {
        if (!(obj instanceof C0031Bc)) {
            b0(obj);
        } else {
            C0031Bc c0031Bc = (C0031Bc) obj;
            a0(c0031Bc.a, C0031Bc.b.get(c0031Bc) != 0);
        }
    }

    public final void c0(EnumC0500Te enumC0500Te, AbstractC1993u abstractC1993u, InterfaceC2312yp interfaceC2312yp) {
        Object invoke;
        int ordinal = enumC0500Te.ordinal();
        C0782bY c0782bY = C0782bY.a;
        if (ordinal == 0) {
            try {
                AbstractC0022At.I(c0782bY, AbstractC1473m3.L(AbstractC1473m3.t(abstractC1993u, this, interfaceC2312yp)));
                return;
            } finally {
                resumeWith(AbstractC1494mO.d(th));
            }
        }
        if (ordinal != 1) {
            if (ordinal == 2) {
                AbstractC0048Bt.n(interfaceC2312yp, "<this>");
                AbstractC1473m3.L(AbstractC1473m3.t(abstractC1993u, this, interfaceC2312yp)).resumeWith(c0782bY);
                return;
            }
            if (ordinal != 3) {
                throw new C0057Cc();
            }
            try {
                InterfaceC0189He interfaceC0189He = this.j;
                Object R0 = PX.R0(interfaceC0189He, null);
                try {
                    if (interfaceC2312yp instanceof Y7) {
                        AbstractC1305jX.i(2, interfaceC2312yp);
                        invoke = interfaceC2312yp.invoke(abstractC1993u, this);
                    } else {
                        invoke = AbstractC1473m3.e0(interfaceC2312yp, abstractC1993u, this);
                    }
                    PX.K0(interfaceC0189He, R0);
                    if (invoke != EnumC0448Re.h) {
                        resumeWith(invoke);
                    }
                } catch (Throwable th) {
                    PX.K0(interfaceC0189He, R0);
                    throw th;
                }
            } catch (Throwable th2) {
            }
        }
    }

    @Override // o.InterfaceC2235xe
    public final InterfaceC0189He getContext() {
        return this.j;
    }

    @Override // o.InterfaceC0422Qe
    public final InterfaceC0189He m() {
        return this.j;
    }

    @Override // o.C0283Ku
    public final String r() {
        return getClass().getSimpleName().concat(" was cancelled");
    }

    @Override // o.InterfaceC2235xe
    public final void resumeWith(Object obj) {
        Throwable a = C1428lO.a(obj);
        if (a != null) {
            obj = new C0031Bc(a, false);
        }
        Object O = O(obj);
        if (O == EB.i) {
            return;
        }
        l(O);
    }

    public void b0(Object obj) {
    }

    public void a0(Throwable th, boolean z) {
    }
}
