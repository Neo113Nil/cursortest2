package s;

import X.V;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import q.AbstractC0286e;
import q.C0287f;
import t.AbstractC0306h;
import t.C0312n;

/* renamed from: s.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0295c {

    /* renamed from: b, reason: collision with root package name */
    public int f3616b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f3617c;
    public final C0296d d;

    /* renamed from: e, reason: collision with root package name */
    public final int f3618e;

    /* renamed from: f, reason: collision with root package name */
    public C0295c f3619f;
    public C0287f i;

    /* renamed from: a, reason: collision with root package name */
    public HashSet f3615a = null;

    /* renamed from: g, reason: collision with root package name */
    public int f3620g = 0;
    public int h = Integer.MIN_VALUE;

    public C0295c(C0296d c0296d, int i) {
        this.d = c0296d;
        this.f3618e = i;
    }

    public final void a(C0295c c0295c, int i) {
        b(c0295c, i, Integer.MIN_VALUE, false);
    }

    public final boolean b(C0295c c0295c, int i, int i2, boolean z2) {
        if (c0295c == null) {
            j();
            return true;
        }
        if (!z2 && !i(c0295c)) {
            return false;
        }
        this.f3619f = c0295c;
        if (c0295c.f3615a == null) {
            c0295c.f3615a = new HashSet();
        }
        HashSet hashSet = this.f3619f.f3615a;
        if (hashSet != null) {
            hashSet.add(this);
        }
        this.f3620g = i;
        this.h = i2;
        return true;
    }

    public final void c(int i, ArrayList arrayList, C0312n c0312n) {
        HashSet hashSet = this.f3615a;
        if (hashSet != null) {
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                AbstractC0306h.b(((C0295c) it.next()).d, i, arrayList, c0312n);
            }
        }
    }

    public final int d() {
        if (this.f3617c) {
            return this.f3616b;
        }
        return 0;
    }

    public final int e() {
        C0295c c0295c;
        if (this.d.f3658g0 == 8) {
            return 0;
        }
        int i = this.h;
        return (i == Integer.MIN_VALUE || (c0295c = this.f3619f) == null || c0295c.d.f3658g0 != 8) ? this.f3620g : i;
    }

    public final C0295c f() {
        int i = this.f3618e;
        int a2 = AbstractC0286e.a(i);
        C0296d c0296d = this.d;
        switch (a2) {
            case 0:
            case 5:
            case 6:
            case 7:
            case 8:
                return null;
            case 1:
                return c0296d.f3630K;
            case 2:
                return c0296d.f3631L;
            case 3:
                return c0296d.f3628I;
            case 4:
                return c0296d.f3629J;
            default:
                throw new AssertionError(V.h(i));
        }
    }

    public final boolean g() {
        HashSet hashSet = this.f3615a;
        if (hashSet == null) {
            return false;
        }
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            if (((C0295c) it.next()).f().h()) {
                return true;
            }
        }
        return false;
    }

    public final boolean h() {
        return this.f3619f != null;
    }

    public final boolean i(C0295c c0295c) {
        if (c0295c == null) {
            return false;
        }
        int i = this.f3618e;
        C0296d c0296d = c0295c.d;
        int i2 = c0295c.f3618e;
        if (i2 == i) {
            return i != 6 || (c0296d.f3625E && this.d.f3625E);
        }
        switch (AbstractC0286e.a(i)) {
            case 0:
            case 7:
            case 8:
                return false;
            case 1:
            case 3:
                boolean z2 = i2 == 2 || i2 == 4;
                if (c0296d instanceof h) {
                    return z2 || i2 == 8;
                }
                return z2;
            case 2:
            case 4:
                boolean z3 = i2 == 3 || i2 == 5;
                if (c0296d instanceof h) {
                    return z3 || i2 == 9;
                }
                return z3;
            case 5:
                return (i2 == 2 || i2 == 4) ? false : true;
            case 6:
                return (i2 == 6 || i2 == 8 || i2 == 9) ? false : true;
            default:
                throw new AssertionError(V.h(i));
        }
    }

    public final void j() {
        HashSet hashSet;
        C0295c c0295c = this.f3619f;
        if (c0295c != null && (hashSet = c0295c.f3615a) != null) {
            hashSet.remove(this);
            if (this.f3619f.f3615a.size() == 0) {
                this.f3619f.f3615a = null;
            }
        }
        this.f3615a = null;
        this.f3619f = null;
        this.f3620g = 0;
        this.h = Integer.MIN_VALUE;
        this.f3617c = false;
        this.f3616b = 0;
    }

    public final void k() {
        C0287f c0287f = this.i;
        if (c0287f == null) {
            this.i = new C0287f(1);
        } else {
            c0287f.c();
        }
    }

    public final void l(int i) {
        this.f3616b = i;
        this.f3617c = true;
    }

    public final String toString() {
        return this.d.f3659h0 + ":" + V.h(this.f3618e);
    }
}
