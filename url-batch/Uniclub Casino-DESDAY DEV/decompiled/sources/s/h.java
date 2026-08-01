package s;

import java.util.ArrayList;
import q.AbstractC0286e;
import q.C0283b;
import q.C0284c;
import q.C0287f;

/* loaded from: classes.dex */
public final class h extends C0296d {

    /* renamed from: q0, reason: collision with root package name */
    public float f3752q0 = -1.0f;

    /* renamed from: r0, reason: collision with root package name */
    public int f3753r0 = -1;

    /* renamed from: s0, reason: collision with root package name */
    public int f3754s0 = -1;

    /* renamed from: t0, reason: collision with root package name */
    public C0295c f3755t0 = this.f3629J;

    /* renamed from: u0, reason: collision with root package name */
    public int f3756u0 = 0;

    /* renamed from: v0, reason: collision with root package name */
    public boolean f3757v0;

    public h() {
        this.f3637R.clear();
        this.f3637R.add(this.f3755t0);
        int length = this.f3636Q.length;
        for (int i = 0; i < length; i++) {
            this.f3636Q[i] = this.f3755t0;
        }
    }

    @Override // s.C0296d
    public final boolean A() {
        return this.f3757v0;
    }

    @Override // s.C0296d
    public final boolean B() {
        return this.f3757v0;
    }

    @Override // s.C0296d
    public final void Q(C0284c c0284c, boolean z2) {
        if (this.f3639T == null) {
            return;
        }
        C0295c c0295c = this.f3755t0;
        c0284c.getClass();
        int n2 = C0284c.n(c0295c);
        if (this.f3756u0 == 1) {
            this.f3644Y = n2;
            this.f3645Z = 0;
            L(this.f3639T.k());
            O(0);
            return;
        }
        this.f3644Y = 0;
        this.f3645Z = n2;
        O(this.f3639T.q());
        L(0);
    }

    public final void R(int i) {
        this.f3755t0.l(i);
        this.f3757v0 = true;
    }

    public final void S(int i) {
        if (this.f3756u0 == i) {
            return;
        }
        this.f3756u0 = i;
        ArrayList arrayList = this.f3637R;
        arrayList.clear();
        if (this.f3756u0 == 1) {
            this.f3755t0 = this.f3628I;
        } else {
            this.f3755t0 = this.f3629J;
        }
        arrayList.add(this.f3755t0);
        C0295c[] c0295cArr = this.f3636Q;
        int length = c0295cArr.length;
        for (int i2 = 0; i2 < length; i2++) {
            c0295cArr[i2] = this.f3755t0;
        }
    }

    @Override // s.C0296d
    public final void b(C0284c c0284c, boolean z2) {
        C0297e c0297e = (C0297e) this.f3639T;
        if (c0297e == null) {
            return;
        }
        Object i = c0297e.i(2);
        Object i2 = c0297e.i(4);
        C0296d c0296d = this.f3639T;
        boolean z3 = c0296d != null && c0296d.f3673p0[0] == 2;
        if (this.f3756u0 == 0) {
            i = c0297e.i(3);
            i2 = c0297e.i(5);
            C0296d c0296d2 = this.f3639T;
            z3 = c0296d2 != null && c0296d2.f3673p0[1] == 2;
        }
        if (this.f3757v0) {
            C0295c c0295c = this.f3755t0;
            if (c0295c.f3617c) {
                C0287f k2 = c0284c.k(c0295c);
                c0284c.d(k2, this.f3755t0.d());
                if (this.f3753r0 != -1) {
                    if (z3) {
                        c0284c.f(c0284c.k(i2), k2, 0, 5);
                    }
                } else if (this.f3754s0 != -1 && z3) {
                    C0287f k3 = c0284c.k(i2);
                    c0284c.f(k2, c0284c.k(i), 0, 5);
                    c0284c.f(k3, k2, 0, 5);
                }
                this.f3757v0 = false;
                return;
            }
        }
        if (this.f3753r0 != -1) {
            C0287f k4 = c0284c.k(this.f3755t0);
            c0284c.e(k4, c0284c.k(i), this.f3753r0, 8);
            if (z3) {
                c0284c.f(c0284c.k(i2), k4, 0, 5);
                return;
            }
            return;
        }
        if (this.f3754s0 != -1) {
            C0287f k5 = c0284c.k(this.f3755t0);
            C0287f k6 = c0284c.k(i2);
            c0284c.e(k5, k6, -this.f3754s0, 8);
            if (z3) {
                c0284c.f(k5, c0284c.k(i), 0, 5);
                c0284c.f(k6, k5, 0, 5);
                return;
            }
            return;
        }
        if (this.f3752q0 != -1.0f) {
            C0287f k7 = c0284c.k(this.f3755t0);
            C0287f k8 = c0284c.k(i2);
            float f2 = this.f3752q0;
            C0283b l2 = c0284c.l();
            l2.d.g(k7, -1.0f);
            l2.d.g(k8, f2);
            c0284c.c(l2);
        }
    }

    @Override // s.C0296d
    public final boolean c() {
        return true;
    }

    @Override // s.C0296d
    public final C0295c i(int i) {
        int a2 = AbstractC0286e.a(i);
        if (a2 != 1) {
            if (a2 != 2) {
                if (a2 != 3) {
                    if (a2 != 4) {
                        return null;
                    }
                }
            }
            if (this.f3756u0 == 0) {
                return this.f3755t0;
            }
            return null;
        }
        if (this.f3756u0 == 1) {
            return this.f3755t0;
        }
        return null;
    }
}
