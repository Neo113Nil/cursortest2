package s;

import X.V;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import q.AbstractC0291e;
import q.C0292f;
import t.AbstractC0309h;
import t.C0315n;

/* renamed from: s.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0298c {

    /* renamed from: b, reason: collision with root package name */
    public int f3611b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f3612c;
    public final C0299d d;

    /* renamed from: e, reason: collision with root package name */
    public final int f3613e;

    /* renamed from: f, reason: collision with root package name */
    public C0298c f3614f;
    public C0292f i;

    /* renamed from: a, reason: collision with root package name */
    public HashSet f3610a = null;

    /* renamed from: g, reason: collision with root package name */
    public int f3615g = 0;
    public int h = Integer.MIN_VALUE;

    public C0298c(C0299d c0299d, int i) {
        this.d = c0299d;
        this.f3613e = i;
    }

    public final void a(C0298c c0298c, int i) {
        b(c0298c, i, Integer.MIN_VALUE, false);
    }

    public final boolean b(C0298c c0298c, int i, int i2, boolean z2) {
        if (c0298c == null) {
            j();
            return true;
        }
        if (!z2 && !i(c0298c)) {
            return false;
        }
        this.f3614f = c0298c;
        if (c0298c.f3610a == null) {
            c0298c.f3610a = new HashSet();
        }
        HashSet hashSet = this.f3614f.f3610a;
        if (hashSet != null) {
            hashSet.add(this);
        }
        this.f3615g = i;
        this.h = i2;
        return true;
    }

    public final void c(int i, ArrayList arrayList, C0315n c0315n) {
        HashSet hashSet = this.f3610a;
        if (hashSet != null) {
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                AbstractC0309h.b(((C0298c) it.next()).d, i, arrayList, c0315n);
            }
        }
    }

    public final int d() {
        if (this.f3612c) {
            return this.f3611b;
        }
        return 0;
    }

    public final int e() {
        C0298c c0298c;
        if (this.d.f3653g0 == 8) {
            return 0;
        }
        int i = this.h;
        return (i == Integer.MIN_VALUE || (c0298c = this.f3614f) == null || c0298c.d.f3653g0 != 8) ? this.f3615g : i;
    }

    public final C0298c f() {
        int i = this.f3613e;
        int a2 = AbstractC0291e.a(i);
        C0299d c0299d = this.d;
        switch (a2) {
            case 0:
            case 5:
            case 6:
            case 7:
            case 8:
                return null;
            case 1:
                return c0299d.f3625K;
            case 2:
                return c0299d.f3626L;
            case 3:
                return c0299d.f3623I;
            case 4:
                return c0299d.f3624J;
            default:
                throw new AssertionError(V.h(i));
        }
    }

    public final boolean g() {
        HashSet hashSet = this.f3610a;
        if (hashSet == null) {
            return false;
        }
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            if (((C0298c) it.next()).f().h()) {
                return true;
            }
        }
        return false;
    }

    public final boolean h() {
        return this.f3614f != null;
    }

    public final boolean i(C0298c c0298c) {
        if (c0298c == null) {
            return false;
        }
        int i = this.f3613e;
        C0299d c0299d = c0298c.d;
        int i2 = c0298c.f3613e;
        if (i2 == i) {
            return i != 6 || (c0299d.f3620E && this.d.f3620E);
        }
        switch (AbstractC0291e.a(i)) {
            case 0:
            case 7:
            case 8:
                return false;
            case 1:
            case 3:
                boolean z2 = i2 == 2 || i2 == 4;
                if (c0299d instanceof h) {
                    return z2 || i2 == 8;
                }
                return z2;
            case 2:
            case 4:
                boolean z3 = i2 == 3 || i2 == 5;
                if (c0299d instanceof h) {
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
        C0298c c0298c = this.f3614f;
        if (c0298c != null && (hashSet = c0298c.f3610a) != null) {
            hashSet.remove(this);
            if (this.f3614f.f3610a.size() == 0) {
                this.f3614f.f3610a = null;
            }
        }
        this.f3610a = null;
        this.f3614f = null;
        this.f3615g = 0;
        this.h = Integer.MIN_VALUE;
        this.f3612c = false;
        this.f3611b = 0;
    }

    public final void k() {
        C0292f c0292f = this.i;
        if (c0292f == null) {
            this.i = new C0292f(1);
        } else {
            c0292f.c();
        }
    }

    public final void l(int i) {
        this.f3611b = i;
        this.f3612c = true;
    }

    public final String toString() {
        return this.d.f3654h0 + ":" + V.h(this.f3613e);
    }
}
