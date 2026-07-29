package o;

/* renamed from: o.pS, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1696pS {
    public C1959tS a;
    public int b;
    public boolean c;
    public int d;

    public AbstractC1696pS(int i, C1959tS c1959tS) {
        int i2;
        int numberOfTrailingZeros;
        this.a = c1959tS;
        this.b = i;
        if (i != 0) {
            C1959tS e = e();
            C0950e6 c0950e6 = AbstractC2025uS.a;
            int i3 = e.j;
            int[] iArr = e.k;
            if (iArr != null) {
                i = iArr[0];
            } else {
                long j = e.i;
                if (j != 0) {
                    numberOfTrailingZeros = Long.numberOfTrailingZeros(j);
                } else {
                    long j2 = e.h;
                    if (j2 != 0) {
                        i3 += 64;
                        numberOfTrailingZeros = Long.numberOfTrailingZeros(j2);
                    }
                }
                i = numberOfTrailingZeros + i3;
            }
            synchronized (AbstractC2025uS.b) {
                i2 = AbstractC2025uS.e.a(i);
            }
        } else {
            i2 = -1;
        }
        this.d = i2;
    }

    public static void p(AbstractC1696pS abstractC1696pS) {
        AbstractC2025uS.a.O(abstractC1696pS);
    }

    public final void a() {
        synchronized (AbstractC2025uS.b) {
            b();
            o();
        }
    }

    public void b() {
        AbstractC2025uS.c = AbstractC2025uS.c.k(d());
    }

    public abstract void c();

    public int d() {
        return this.b;
    }

    public C1959tS e() {
        return this.a;
    }

    public abstract InterfaceC2114vp f();

    public abstract boolean g();

    public int h() {
        return 0;
    }

    public abstract InterfaceC2114vp i();

    public final AbstractC1696pS j() {
        C0950e6 c0950e6 = AbstractC2025uS.a;
        AbstractC1696pS abstractC1696pS = (AbstractC1696pS) c0950e6.get();
        c0950e6.O(this);
        return abstractC1696pS;
    }

    public abstract void k();

    public abstract void l();

    public abstract void m();

    public abstract void n(GT gt);

    public void o() {
        int i = this.d;
        if (i >= 0) {
            AbstractC2025uS.s(i);
            this.d = -1;
        }
    }

    public void q(int i) {
        this.b = i;
    }

    public void r(C1959tS c1959tS) {
        this.a = c1959tS;
    }

    public void s(int i) {
        throw new IllegalStateException("Updating write count is not supported for this snapshot");
    }

    public abstract AbstractC1696pS t(InterfaceC2114vp interfaceC2114vp);
}
