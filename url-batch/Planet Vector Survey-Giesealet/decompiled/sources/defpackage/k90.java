package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public final class k90 {
    public final et0 a = nk.b(l90.u);
    public final et0 b;
    public final pi0 c;
    public final h8 d;
    public final h8 e;
    public h90 f;
    public int g;
    public j90 h;
    public final LinkedHashSet i;
    public final LinkedHashSet j;
    public final LinkedHashSet k;
    public boolean l;
    public boolean m;
    public boolean n;

    public k90() {
        et0 b = nk.b(new i90());
        this.b = b;
        this.c = new pi0(b);
        this.d = new h8();
        this.e = new h8();
        this.i = new LinkedHashSet();
        this.j = new LinkedHashSet();
        this.k = new LinkedHashSet();
    }

    public final void a(f90 f90Var, j90 j90Var, int i) {
        f90Var.getClass();
        if (j90Var.a == null) {
            (i != 0 ? i != 1 ? this.i : this.j : this.k).add(j90Var);
            j90Var.a = f90Var;
            ((i90) this.c.d.getValue()).getClass();
            j90Var.b(i != 0 ? i != 1 ? this.n : this.l : this.m);
            return;
        }
        StringBuilder sb = new StringBuilder("Input '");
        sb.append(j90Var);
        f90 f90Var2 = j90Var.a;
        sb.append("' is already added to dispatcher ");
        sb.append(f90Var2);
        sb.append('.');
        throw new IllegalArgumentException(sb.toString().toString());
    }

    public final void b() {
        boolean z;
        boolean z2;
        i90 i90Var;
        h8 h8Var = this.d;
        if (h8Var == null || !h8Var.isEmpty()) {
            Iterator it = h8Var.iterator();
            while (it.hasNext()) {
                if (((h90) it.next()).b) {
                    z = true;
                    break;
                }
            }
        }
        z = false;
        h8 h8Var2 = this.e;
        if (h8Var2 == null || !h8Var2.isEmpty()) {
            Iterator it2 = h8Var2.iterator();
            while (it2.hasNext()) {
                if (((h90) it2.next()).b) {
                    z2 = true;
                    break;
                }
            }
        }
        z2 = false;
        boolean z3 = z || z2;
        boolean z4 = this.m != z;
        boolean z5 = this.l != z2;
        boolean z6 = this.n != z3;
        LinkedHashSet linkedHashSet = this.k;
        if (z4) {
            Iterator it3 = linkedHashSet.iterator();
            while (it3.hasNext()) {
                ((j90) it3.next()).b(z);
            }
        }
        LinkedHashSet linkedHashSet2 = this.j;
        if (z5) {
            Iterator it4 = linkedHashSet2.iterator();
            while (it4.hasNext()) {
                ((j90) it4.next()).b(z2);
            }
        }
        LinkedHashSet linkedHashSet3 = this.i;
        if (z6) {
            Iterator it5 = linkedHashSet3.iterator();
            while (it5.hasNext()) {
                ((j90) it5.next()).b(z3);
            }
        }
        this.m = z;
        this.l = z2;
        this.n = z3;
        h90 h90Var = this.f;
        if (h90Var == null) {
            h90Var = c(0);
        }
        h90 h90Var2 = this.f;
        if (h90Var2 == null) {
            h90Var2 = c(0);
        }
        if (nz.l(h90Var2, h90Var)) {
            if (h90Var2 == null) {
                i90Var = new i90();
            } else {
                ArrayList arrayList = new ArrayList();
                Iterator<E> it6 = h8Var.iterator();
                while (it6.hasNext()) {
                    boolean z7 = ((h90) it6.next()).b;
                }
                Iterator<E> it7 = h8Var2.iterator();
                while (it7.hasNext()) {
                    boolean z8 = ((h90) it7.next()).b;
                }
                nz nzVar = h90Var2.a;
                j30 j30Var = new j30(10);
                ee.a0(j30Var, arrayList);
                j30Var.add(nzVar);
                ee.a0(j30Var, wp.d);
                i90Var = new i90(px0.l(j30Var), arrayList.size());
            }
            et0 et0Var = this.b;
            if (nz.l((i90) et0Var.getValue(), i90Var)) {
                return;
            }
            et0Var.k(null, i90Var);
            Iterator it8 = linkedHashSet.iterator();
            while (it8.hasNext()) {
                ((j90) it8.next()).getClass();
            }
            Iterator it9 = linkedHashSet2.iterator();
            while (it9.hasNext()) {
                ((j90) it9.next()).getClass();
            }
            Iterator it10 = linkedHashSet3.iterator();
            while (it10.hasNext()) {
                ((j90) it10.next()).getClass();
            }
        }
    }

    public final h90 c(int i) {
        Object obj;
        Object obj2;
        h8 h8Var = this.e;
        h8 h8Var2 = this.d;
        Object obj3 = null;
        if (i == -1) {
            Iterator it = h8Var2.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (((h90) obj).b) {
                    break;
                }
            }
            h90 h90Var = (h90) obj;
            if (h90Var != null) {
                return h90Var;
            }
            Iterator it2 = h8Var.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                Object next = it2.next();
                if (((h90) next).b) {
                    obj3 = next;
                    break;
                }
            }
            return (h90) obj3;
        }
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException(("Unsupported direction: '" + i + "'.").toString());
            }
            Iterator it3 = h8Var2.iterator();
            while (it3.hasNext()) {
                ((h90) it3.next()).getClass();
            }
            Iterator it4 = h8Var.iterator();
            while (it4.hasNext()) {
                ((h90) it4.next()).getClass();
            }
            return null;
        }
        Iterator it5 = h8Var2.iterator();
        while (true) {
            if (!it5.hasNext()) {
                obj2 = null;
                break;
            }
            obj2 = it5.next();
            if (((h90) obj2).b) {
                break;
            }
        }
        h90 h90Var2 = (h90) obj2;
        if (h90Var2 != null) {
            return h90Var2;
        }
        Iterator it6 = h8Var.iterator();
        while (true) {
            if (!it6.hasNext()) {
                break;
            }
            Object next2 = it6.next();
            if (((h90) next2).b) {
                obj3 = next2;
                break;
            }
        }
        return (h90) obj3;
    }
}
