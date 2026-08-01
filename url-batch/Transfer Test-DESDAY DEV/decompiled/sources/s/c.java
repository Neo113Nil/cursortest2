package s;

import Y.V;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import q.AbstractC0321e;
import q.C0322f;
import t.n;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: b, reason: collision with root package name */
    public int f3498b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f3499c;
    public final d d;

    /* renamed from: e, reason: collision with root package name */
    public final int f3500e;

    /* renamed from: f, reason: collision with root package name */
    public c f3501f;
    public C0322f i;

    /* renamed from: a, reason: collision with root package name */
    public HashSet f3497a = null;

    /* renamed from: g, reason: collision with root package name */
    public int f3502g = 0;
    public int h = Integer.MIN_VALUE;

    public c(d dVar, int i) {
        this.d = dVar;
        this.f3500e = i;
    }

    public final void a(c cVar, int i) {
        b(cVar, i, Integer.MIN_VALUE, false);
    }

    public final boolean b(c cVar, int i, int i2, boolean z2) {
        if (cVar == null) {
            j();
            return true;
        }
        if (!z2 && !i(cVar)) {
            return false;
        }
        this.f3501f = cVar;
        if (cVar.f3497a == null) {
            cVar.f3497a = new HashSet();
        }
        HashSet hashSet = this.f3501f.f3497a;
        if (hashSet != null) {
            hashSet.add(this);
        }
        this.f3502g = i;
        this.h = i2;
        return true;
    }

    public final void c(int i, ArrayList arrayList, n nVar) {
        HashSet hashSet = this.f3497a;
        if (hashSet != null) {
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                t.h.b(((c) it.next()).d, i, arrayList, nVar);
            }
        }
    }

    public final int d() {
        if (this.f3499c) {
            return this.f3498b;
        }
        return 0;
    }

    public final int e() {
        c cVar;
        if (this.d.f3540g0 == 8) {
            return 0;
        }
        int i = this.h;
        return (i == Integer.MIN_VALUE || (cVar = this.f3501f) == null || cVar.d.f3540g0 != 8) ? this.f3502g : i;
    }

    public final c f() {
        int i = this.f3500e;
        int a2 = AbstractC0321e.a(i);
        d dVar = this.d;
        switch (a2) {
            case 0:
            case 5:
            case 6:
            case 7:
            case 8:
                return null;
            case 1:
                return dVar.f3512K;
            case 2:
                return dVar.f3513L;
            case 3:
                return dVar.f3510I;
            case 4:
                return dVar.f3511J;
            default:
                throw new AssertionError(V.i(i));
        }
    }

    public final boolean g() {
        HashSet hashSet = this.f3497a;
        if (hashSet == null) {
            return false;
        }
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            if (((c) it.next()).f().h()) {
                return true;
            }
        }
        return false;
    }

    public final boolean h() {
        return this.f3501f != null;
    }

    public final boolean i(c cVar) {
        if (cVar == null) {
            return false;
        }
        int i = this.f3500e;
        d dVar = cVar.d;
        int i2 = cVar.f3500e;
        if (i2 == i) {
            return i != 6 || (dVar.f3507E && this.d.f3507E);
        }
        switch (AbstractC0321e.a(i)) {
            case 0:
            case 7:
            case 8:
                return false;
            case 1:
            case 3:
                boolean z2 = i2 == 2 || i2 == 4;
                if (dVar instanceof h) {
                    return z2 || i2 == 8;
                }
                return z2;
            case 2:
            case 4:
                boolean z3 = i2 == 3 || i2 == 5;
                if (dVar instanceof h) {
                    return z3 || i2 == 9;
                }
                return z3;
            case 5:
                return (i2 == 2 || i2 == 4) ? false : true;
            case 6:
                return (i2 == 6 || i2 == 8 || i2 == 9) ? false : true;
            default:
                throw new AssertionError(V.i(i));
        }
    }

    public final void j() {
        HashSet hashSet;
        c cVar = this.f3501f;
        if (cVar != null && (hashSet = cVar.f3497a) != null) {
            hashSet.remove(this);
            if (this.f3501f.f3497a.size() == 0) {
                this.f3501f.f3497a = null;
            }
        }
        this.f3497a = null;
        this.f3501f = null;
        this.f3502g = 0;
        this.h = Integer.MIN_VALUE;
        this.f3499c = false;
        this.f3498b = 0;
    }

    public final void k() {
        C0322f c0322f = this.i;
        if (c0322f == null) {
            this.i = new C0322f(1);
        } else {
            c0322f.c();
        }
    }

    public final void l(int i) {
        this.f3498b = i;
        this.f3499c = true;
    }

    public final String toString() {
        return this.d.f3541h0 + ":" + V.i(this.f3500e);
    }
}
