package o;

import android.graphics.Paint;

/* renamed from: o.xy, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2255xy extends ME {
    public static final C1143h2 J;
    public InterfaceC2123vy H;
    public C2189wy I;

    static {
        C1143h2 b = AbstractC0946e20.b();
        ((Paint) b.i).setColor(AbstractC0022At.L(C1114gc.d));
        ((Paint) b.i).setStrokeWidth(1.0f);
        b.m(1);
        J = b;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C2255xy(C0027Ay c0027Ay, InterfaceC2123vy interfaceC2123vy) {
        super(c0027Ay);
        this.H = interfaceC2123vy;
        this.I = c0027Ay.d != null ? new C2189wy(this) : null;
        if ((((TC) interfaceC2123vy).b.c & 512) != 0) {
            throw new ClassCastException();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void D0(InterfaceC2123vy interfaceC2123vy) {
        if (!interfaceC2123vy.equals(this.H) && (((TC) interfaceC2123vy).b.c & 512) != 0) {
            throw new ClassCastException();
        }
        this.H = interfaceC2123vy;
    }

    @Override // o.AbstractC0700aI
    public final void E(long j, float f, InterfaceC2114vp interfaceC2114vp) {
        v0(j, f, interfaceC2114vp);
        if (this.g) {
            return;
        }
        t0();
        P().r();
        AbstractC0048Bt.k(this.m);
    }

    @Override // o.AbstractC1415lB
    public final int H(AbstractC2248xr abstractC2248xr) {
        C2189wy c2189wy = this.I;
        if (c2189wy == null) {
            return AbstractC1052fg.d(this, abstractC2248xr);
        }
        Integer num = (Integer) c2189wy.q.get(abstractC2248xr);
        if (num != null) {
            return num.intValue();
        }
        return Integer.MIN_VALUE;
    }

    @Override // o.IB
    public final AbstractC0700aI a(long j) {
        G(j);
        InterfaceC2123vy interfaceC2123vy = this.H;
        ME me = this.m;
        AbstractC0048Bt.k(me);
        x0(interfaceC2123vy.d(this, me, j));
        s0();
        return this;
    }

    @Override // o.ME
    public final void c0() {
        if (this.I == null) {
            this.I = new C2189wy(this);
        }
    }

    @Override // o.ME
    public final AbstractC1547nB f0() {
        return this.I;
    }

    @Override // o.ME
    public final TC h0() {
        return ((TC) this.H).b;
    }

    @Override // o.ME
    public final void u0(InterfaceC0980ea interfaceC0980ea, C0512Tq c0512Tq) {
        ME me = this.m;
        AbstractC0048Bt.k(me);
        me.Z(interfaceC0980ea, c0512Tq);
        if (((S2) PX.J0(this.l)).getShowLayoutBounds()) {
            a0(interfaceC0980ea, J);
        }
    }
}
