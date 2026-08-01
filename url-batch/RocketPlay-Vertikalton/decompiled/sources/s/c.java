package s;

import E1.AbstractC0001b;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import q.AbstractC0332e;
import q.C0333f;
import t.o;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: b, reason: collision with root package name */
    public int f3949b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f3950c;
    public final d d;

    /* renamed from: e, reason: collision with root package name */
    public final int f3951e;

    /* renamed from: f, reason: collision with root package name */
    public c f3952f;
    public C0333f i;

    /* renamed from: a, reason: collision with root package name */
    public HashSet f3948a = null;

    /* renamed from: g, reason: collision with root package name */
    public int f3953g = 0;
    public int h = Integer.MIN_VALUE;

    public c(d dVar, int i) {
        this.d = dVar;
        this.f3951e = i;
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
        this.f3952f = cVar;
        if (cVar.f3948a == null) {
            cVar.f3948a = new HashSet();
        }
        HashSet hashSet = this.f3952f.f3948a;
        if (hashSet != null) {
            hashSet.add(this);
        }
        this.f3953g = i;
        this.h = i2;
        return true;
    }

    public final void c(int i, ArrayList arrayList, o oVar) {
        HashSet hashSet = this.f3948a;
        if (hashSet != null) {
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                t.h.b(((c) it.next()).d, i, arrayList, oVar);
            }
        }
    }

    public final int d() {
        if (this.f3950c) {
            return this.f3949b;
        }
        return 0;
    }

    public final int e() {
        c cVar;
        if (this.d.f3991g0 == 8) {
            return 0;
        }
        int i = this.h;
        return (i == Integer.MIN_VALUE || (cVar = this.f3952f) == null || cVar.d.f3991g0 != 8) ? this.f3953g : i;
    }

    public final c f() {
        int i = this.f3951e;
        int a2 = AbstractC0332e.a(i);
        d dVar = this.d;
        switch (a2) {
            case 0:
            case 5:
            case 6:
            case 7:
            case 8:
                return null;
            case 1:
                return dVar.f3963K;
            case 2:
                return dVar.f3964L;
            case 3:
                return dVar.f3961I;
            case 4:
                return dVar.f3962J;
            default:
                throw new AssertionError(AbstractC0001b.k(i));
        }
    }

    public final boolean g() {
        HashSet hashSet = this.f3948a;
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
        return this.f3952f != null;
    }

    public final boolean i(c cVar) {
        if (cVar == null) {
            return false;
        }
        int i = this.f3951e;
        d dVar = cVar.d;
        int i2 = cVar.f3951e;
        if (i2 == i) {
            return i != 6 || (dVar.f3958E && this.d.f3958E);
        }
        switch (AbstractC0332e.a(i)) {
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
                throw new AssertionError(AbstractC0001b.k(i));
        }
    }

    public final void j() {
        HashSet hashSet;
        c cVar = this.f3952f;
        if (cVar != null && (hashSet = cVar.f3948a) != null) {
            hashSet.remove(this);
            if (this.f3952f.f3948a.size() == 0) {
                this.f3952f.f3948a = null;
            }
        }
        this.f3948a = null;
        this.f3952f = null;
        this.f3953g = 0;
        this.h = Integer.MIN_VALUE;
        this.f3950c = false;
        this.f3949b = 0;
    }

    public final void k() {
        C0333f c0333f = this.i;
        if (c0333f == null) {
            this.i = new C0333f(1);
        } else {
            c0333f.c();
        }
    }

    public final void l(int i) {
        this.f3949b = i;
        this.f3950c = true;
    }

    public final String toString() {
        return this.d.f3992h0 + ":" + AbstractC0001b.k(this.f3951e);
    }
}
