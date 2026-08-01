package s;

import java.util.ArrayList;
import q.AbstractC0321e;
import q.C0318b;
import q.C0319c;
import q.C0322f;

/* loaded from: classes.dex */
public final class h extends d {

    /* renamed from: q0, reason: collision with root package name */
    public float f3634q0 = -1.0f;
    public int r0 = -1;

    /* renamed from: s0, reason: collision with root package name */
    public int f3635s0 = -1;

    /* renamed from: t0, reason: collision with root package name */
    public c f3636t0 = this.f3511J;

    /* renamed from: u0, reason: collision with root package name */
    public int f3637u0 = 0;

    /* renamed from: v0, reason: collision with root package name */
    public boolean f3638v0;

    public h() {
        this.f3519R.clear();
        this.f3519R.add(this.f3636t0);
        int length = this.f3518Q.length;
        for (int i = 0; i < length; i++) {
            this.f3518Q[i] = this.f3636t0;
        }
    }

    @Override // s.d
    public final boolean A() {
        return this.f3638v0;
    }

    @Override // s.d
    public final boolean B() {
        return this.f3638v0;
    }

    @Override // s.d
    public final void Q(C0319c c0319c, boolean z2) {
        if (this.f3521T == null) {
            return;
        }
        c cVar = this.f3636t0;
        c0319c.getClass();
        int n2 = C0319c.n(cVar);
        if (this.f3637u0 == 1) {
            this.f3526Y = n2;
            this.f3527Z = 0;
            L(this.f3521T.k());
            O(0);
            return;
        }
        this.f3526Y = 0;
        this.f3527Z = n2;
        O(this.f3521T.q());
        L(0);
    }

    public final void R(int i) {
        this.f3636t0.l(i);
        this.f3638v0 = true;
    }

    public final void S(int i) {
        if (this.f3637u0 == i) {
            return;
        }
        this.f3637u0 = i;
        ArrayList arrayList = this.f3519R;
        arrayList.clear();
        if (this.f3637u0 == 1) {
            this.f3636t0 = this.f3510I;
        } else {
            this.f3636t0 = this.f3511J;
        }
        arrayList.add(this.f3636t0);
        c[] cVarArr = this.f3518Q;
        int length = cVarArr.length;
        for (int i2 = 0; i2 < length; i2++) {
            cVarArr[i2] = this.f3636t0;
        }
    }

    @Override // s.d
    public final void b(C0319c c0319c, boolean z2) {
        e eVar = (e) this.f3521T;
        if (eVar == null) {
            return;
        }
        Object i = eVar.i(2);
        Object i2 = eVar.i(4);
        d dVar = this.f3521T;
        boolean z3 = dVar != null && dVar.f3555p0[0] == 2;
        if (this.f3637u0 == 0) {
            i = eVar.i(3);
            i2 = eVar.i(5);
            d dVar2 = this.f3521T;
            z3 = dVar2 != null && dVar2.f3555p0[1] == 2;
        }
        if (this.f3638v0) {
            c cVar = this.f3636t0;
            if (cVar.f3499c) {
                C0322f k2 = c0319c.k(cVar);
                c0319c.d(k2, this.f3636t0.d());
                if (this.r0 != -1) {
                    if (z3) {
                        c0319c.f(c0319c.k(i2), k2, 0, 5);
                    }
                } else if (this.f3635s0 != -1 && z3) {
                    C0322f k3 = c0319c.k(i2);
                    c0319c.f(k2, c0319c.k(i), 0, 5);
                    c0319c.f(k3, k2, 0, 5);
                }
                this.f3638v0 = false;
                return;
            }
        }
        if (this.r0 != -1) {
            C0322f k4 = c0319c.k(this.f3636t0);
            c0319c.e(k4, c0319c.k(i), this.r0, 8);
            if (z3) {
                c0319c.f(c0319c.k(i2), k4, 0, 5);
                return;
            }
            return;
        }
        if (this.f3635s0 != -1) {
            C0322f k5 = c0319c.k(this.f3636t0);
            C0322f k6 = c0319c.k(i2);
            c0319c.e(k5, k6, -this.f3635s0, 8);
            if (z3) {
                c0319c.f(k5, c0319c.k(i), 0, 5);
                c0319c.f(k6, k5, 0, 5);
                return;
            }
            return;
        }
        if (this.f3634q0 != -1.0f) {
            C0322f k7 = c0319c.k(this.f3636t0);
            C0322f k8 = c0319c.k(i2);
            float f2 = this.f3634q0;
            C0318b l2 = c0319c.l();
            l2.d.g(k7, -1.0f);
            l2.d.g(k8, f2);
            c0319c.c(l2);
        }
    }

    @Override // s.d
    public final boolean c() {
        return true;
    }

    @Override // s.d
    public final c i(int i) {
        int a2 = AbstractC0321e.a(i);
        if (a2 != 1) {
            if (a2 != 2) {
                if (a2 != 3) {
                    if (a2 != 4) {
                        return null;
                    }
                }
            }
            if (this.f3637u0 == 0) {
                return this.f3636t0;
            }
            return null;
        }
        if (this.f3637u0 == 1) {
            return this.f3636t0;
        }
        return null;
    }
}
