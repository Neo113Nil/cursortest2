package o;

/* renamed from: o.kR, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1365kR extends AbstractC0679a0 {
    public long a;
    public C0849ca b;

    @Override // o.AbstractC0679a0
    public final boolean a(Z z) {
        C1299jR c1299jR = (C1299jR) z;
        if (this.a >= 0) {
            return false;
        }
        long j = c1299jR.p;
        if (j < c1299jR.q) {
            c1299jR.q = j;
        }
        this.a = j;
        return true;
    }

    @Override // o.AbstractC0679a0
    public final InterfaceC2235xe[] b(Z z) {
        long j = this.a;
        this.a = -1L;
        this.b = null;
        return ((C1299jR) z).u(j);
    }
}
