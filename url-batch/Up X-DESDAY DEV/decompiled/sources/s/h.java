package s;

import java.util.ArrayList;
import q.AbstractC0291e;
import q.C0288b;
import q.C0289c;
import q.C0292f;

/* loaded from: classes.dex */
public final class h extends C0299d {

    /* renamed from: q0, reason: collision with root package name */
    public float f3725q0 = -1.0f;

    /* renamed from: r0, reason: collision with root package name */
    public int f3726r0 = -1;

    /* renamed from: s0, reason: collision with root package name */
    public int f3727s0 = -1;

    /* renamed from: t0, reason: collision with root package name */
    public C0298c f3728t0 = this.f3602J;

    /* renamed from: u0, reason: collision with root package name */
    public int f3729u0 = 0;

    /* renamed from: v0, reason: collision with root package name */
    public boolean f3730v0;

    public h() {
        this.f3610R.clear();
        this.f3610R.add(this.f3728t0);
        int length = this.f3609Q.length;
        for (int i = 0; i < length; i++) {
            this.f3609Q[i] = this.f3728t0;
        }
    }

    @Override // s.C0299d
    public final boolean A() {
        return this.f3730v0;
    }

    @Override // s.C0299d
    public final boolean B() {
        return this.f3730v0;
    }

    @Override // s.C0299d
    public final void Q(C0289c c0289c, boolean z2) {
        if (this.f3612T == null) {
            return;
        }
        C0298c c0298c = this.f3728t0;
        c0289c.getClass();
        int n2 = C0289c.n(c0298c);
        if (this.f3729u0 == 1) {
            this.f3617Y = n2;
            this.f3618Z = 0;
            L(this.f3612T.k());
            O(0);
            return;
        }
        this.f3617Y = 0;
        this.f3618Z = n2;
        O(this.f3612T.q());
        L(0);
    }

    public final void R(int i) {
        this.f3728t0.l(i);
        this.f3730v0 = true;
    }

    public final void S(int i) {
        if (this.f3729u0 == i) {
            return;
        }
        this.f3729u0 = i;
        ArrayList arrayList = this.f3610R;
        arrayList.clear();
        if (this.f3729u0 == 1) {
            this.f3728t0 = this.f3601I;
        } else {
            this.f3728t0 = this.f3602J;
        }
        arrayList.add(this.f3728t0);
        C0298c[] c0298cArr = this.f3609Q;
        int length = c0298cArr.length;
        for (int i2 = 0; i2 < length; i2++) {
            c0298cArr[i2] = this.f3728t0;
        }
    }

    @Override // s.C0299d
    public final void b(C0289c c0289c, boolean z2) {
        C0300e c0300e = (C0300e) this.f3612T;
        if (c0300e == null) {
            return;
        }
        Object i = c0300e.i(2);
        Object i2 = c0300e.i(4);
        C0299d c0299d = this.f3612T;
        boolean z3 = c0299d != null && c0299d.f3646p0[0] == 2;
        if (this.f3729u0 == 0) {
            i = c0300e.i(3);
            i2 = c0300e.i(5);
            C0299d c0299d2 = this.f3612T;
            z3 = c0299d2 != null && c0299d2.f3646p0[1] == 2;
        }
        if (this.f3730v0) {
            C0298c c0298c = this.f3728t0;
            if (c0298c.f3590c) {
                C0292f k2 = c0289c.k(c0298c);
                c0289c.d(k2, this.f3728t0.d());
                if (this.f3726r0 != -1) {
                    if (z3) {
                        c0289c.f(c0289c.k(i2), k2, 0, 5);
                    }
                } else if (this.f3727s0 != -1 && z3) {
                    C0292f k3 = c0289c.k(i2);
                    c0289c.f(k2, c0289c.k(i), 0, 5);
                    c0289c.f(k3, k2, 0, 5);
                }
                this.f3730v0 = false;
                return;
            }
        }
        if (this.f3726r0 != -1) {
            C0292f k4 = c0289c.k(this.f3728t0);
            c0289c.e(k4, c0289c.k(i), this.f3726r0, 8);
            if (z3) {
                c0289c.f(c0289c.k(i2), k4, 0, 5);
                return;
            }
            return;
        }
        if (this.f3727s0 != -1) {
            C0292f k5 = c0289c.k(this.f3728t0);
            C0292f k6 = c0289c.k(i2);
            c0289c.e(k5, k6, -this.f3727s0, 8);
            if (z3) {
                c0289c.f(k5, c0289c.k(i), 0, 5);
                c0289c.f(k6, k5, 0, 5);
                return;
            }
            return;
        }
        if (this.f3725q0 != -1.0f) {
            C0292f k7 = c0289c.k(this.f3728t0);
            C0292f k8 = c0289c.k(i2);
            float f2 = this.f3725q0;
            C0288b l2 = c0289c.l();
            l2.d.g(k7, -1.0f);
            l2.d.g(k8, f2);
            c0289c.c(l2);
        }
    }

    @Override // s.C0299d
    public final boolean c() {
        return true;
    }

    @Override // s.C0299d
    public final C0298c i(int i) {
        int a2 = AbstractC0291e.a(i);
        if (a2 != 1) {
            if (a2 != 2) {
                if (a2 != 3) {
                    if (a2 != 4) {
                        return null;
                    }
                }
            }
            if (this.f3729u0 == 0) {
                return this.f3728t0;
            }
            return null;
        }
        if (this.f3729u0 == 1) {
            return this.f3728t0;
        }
        return null;
    }
}
