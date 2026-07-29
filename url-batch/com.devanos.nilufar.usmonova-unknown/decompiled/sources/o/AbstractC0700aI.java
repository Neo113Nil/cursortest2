package o;

/* renamed from: o.aI, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0700aI {
    public int b;
    public int c;
    public long d = AbstractC0946e20.a(0, 0);
    public long e = AbstractC0766bI.a;
    public long f = 0;

    public final int C() {
        return (int) (this.d >> 32);
    }

    public final void D() {
        this.b = AbstractC1807r8.q((int) (this.d >> 32), C0603Xd.f(this.e), C0603Xd.d(this.e));
        int q = AbstractC1807r8.q((int) (this.d & 4294967295L), C0603Xd.e(this.e), C0603Xd.c(this.e));
        this.c = q;
        int i = this.b;
        long j = this.d;
        this.f = AbstractC1305jX.c((i - ((int) (j >> 32))) / 2, (q - ((int) (j & 4294967295L))) / 2);
    }

    public abstract void E(long j, float f, InterfaceC2114vp interfaceC2114vp);

    public final void F(long j) {
        if (PX.G(this.d, j)) {
            return;
        }
        this.d = j;
        D();
    }

    public final void G(long j) {
        if (this.e == j) {
            return;
        }
        this.e = j;
        D();
    }
}
