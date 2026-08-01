package s;

import java.util.ArrayList;
import q.AbstractC0332e;
import q.C0329b;
import q.C0330c;
import q.C0333f;

/* loaded from: classes.dex */
public final class h extends d {

    /* renamed from: q0, reason: collision with root package name */
    public float f4085q0 = -1.0f;
    public int r0 = -1;

    /* renamed from: s0, reason: collision with root package name */
    public int f4086s0 = -1;

    /* renamed from: t0, reason: collision with root package name */
    public c f4087t0 = this.f3962J;

    /* renamed from: u0, reason: collision with root package name */
    public int f4088u0 = 0;

    /* renamed from: v0, reason: collision with root package name */
    public boolean f4089v0;

    public h() {
        this.f3970R.clear();
        this.f3970R.add(this.f4087t0);
        int length = this.f3969Q.length;
        for (int i = 0; i < length; i++) {
            this.f3969Q[i] = this.f4087t0;
        }
    }

    @Override // s.d
    public final boolean A() {
        return this.f4089v0;
    }

    @Override // s.d
    public final boolean B() {
        return this.f4089v0;
    }

    @Override // s.d
    public final void Q(C0330c c0330c, boolean z2) {
        if (this.f3972T == null) {
            return;
        }
        c cVar = this.f4087t0;
        c0330c.getClass();
        int n2 = C0330c.n(cVar);
        if (this.f4088u0 == 1) {
            this.f3977Y = n2;
            this.f3978Z = 0;
            L(this.f3972T.k());
            O(0);
            return;
        }
        this.f3977Y = 0;
        this.f3978Z = n2;
        O(this.f3972T.q());
        L(0);
    }

    public final void R(int i) {
        this.f4087t0.l(i);
        this.f4089v0 = true;
    }

    public final void S(int i) {
        if (this.f4088u0 == i) {
            return;
        }
        this.f4088u0 = i;
        ArrayList arrayList = this.f3970R;
        arrayList.clear();
        if (this.f4088u0 == 1) {
            this.f4087t0 = this.f3961I;
        } else {
            this.f4087t0 = this.f3962J;
        }
        arrayList.add(this.f4087t0);
        c[] cVarArr = this.f3969Q;
        int length = cVarArr.length;
        for (int i2 = 0; i2 < length; i2++) {
            cVarArr[i2] = this.f4087t0;
        }
    }

    @Override // s.d
    public final void b(C0330c c0330c, boolean z2) {
        e eVar = (e) this.f3972T;
        if (eVar == null) {
            return;
        }
        Object i = eVar.i(2);
        Object i2 = eVar.i(4);
        d dVar = this.f3972T;
        boolean z3 = dVar != null && dVar.f4006p0[0] == 2;
        if (this.f4088u0 == 0) {
            i = eVar.i(3);
            i2 = eVar.i(5);
            d dVar2 = this.f3972T;
            z3 = dVar2 != null && dVar2.f4006p0[1] == 2;
        }
        if (this.f4089v0) {
            c cVar = this.f4087t0;
            if (cVar.f3950c) {
                C0333f k2 = c0330c.k(cVar);
                c0330c.d(k2, this.f4087t0.d());
                if (this.r0 != -1) {
                    if (z3) {
                        c0330c.f(c0330c.k(i2), k2, 0, 5);
                    }
                } else if (this.f4086s0 != -1 && z3) {
                    C0333f k3 = c0330c.k(i2);
                    c0330c.f(k2, c0330c.k(i), 0, 5);
                    c0330c.f(k3, k2, 0, 5);
                }
                this.f4089v0 = false;
                return;
            }
        }
        if (this.r0 != -1) {
            C0333f k4 = c0330c.k(this.f4087t0);
            c0330c.e(k4, c0330c.k(i), this.r0, 8);
            if (z3) {
                c0330c.f(c0330c.k(i2), k4, 0, 5);
                return;
            }
            return;
        }
        if (this.f4086s0 != -1) {
            C0333f k5 = c0330c.k(this.f4087t0);
            C0333f k6 = c0330c.k(i2);
            c0330c.e(k5, k6, -this.f4086s0, 8);
            if (z3) {
                c0330c.f(k5, c0330c.k(i), 0, 5);
                c0330c.f(k6, k5, 0, 5);
                return;
            }
            return;
        }
        if (this.f4085q0 != -1.0f) {
            C0333f k7 = c0330c.k(this.f4087t0);
            C0333f k8 = c0330c.k(i2);
            float f2 = this.f4085q0;
            C0329b l2 = c0330c.l();
            l2.d.g(k7, -1.0f);
            l2.d.g(k8, f2);
            c0330c.c(l2);
        }
    }

    @Override // s.d
    public final boolean c() {
        return true;
    }

    @Override // s.d
    public final c i(int i) {
        int a2 = AbstractC0332e.a(i);
        if (a2 != 1) {
            if (a2 != 2) {
                if (a2 != 3) {
                    if (a2 != 4) {
                        return null;
                    }
                }
            }
            if (this.f4088u0 == 0) {
                return this.f4087t0;
            }
            return null;
        }
        if (this.f4088u0 == 1) {
            return this.f4087t0;
        }
        return null;
    }
}
