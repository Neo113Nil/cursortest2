package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* compiled from: r8-map-id-f3f55b5b0d2db012739781e1ba4f8511a2ab0ca5e8856dea8785f50c2c15a0e8 */
/* loaded from: classes.dex */
public final class qu {
    public final f30 a = new f30(ru.o);
    public final f30 b;
    public final uv c;
    public final e6 d;
    public final e6 e;
    public kv f;
    public int g;
    public pu h;
    public final LinkedHashSet i;
    public final LinkedHashSet j;
    public final LinkedHashSet k;
    public boolean l;
    public boolean m;
    public boolean n;

    public qu() {
        f30 f30Var = new f30(new ou());
        this.b = f30Var;
        this.c = new uv(f30Var);
        this.d = new e6();
        this.e = new e6();
        this.i = new LinkedHashSet();
        this.j = new LinkedHashSet();
        this.k = new LinkedHashSet();
    }

    public final void a(oe oeVar, pu puVar, int i) {
        oeVar.getClass();
        if (puVar.a == null) {
            (i != 0 ? i != 1 ? this.i : this.j : this.k).add(puVar);
            puVar.a = oeVar;
            ((ou) ((f30) this.c.f).a()).getClass();
            puVar.b(i != 0 ? i != 1 ? this.n : this.l : this.m);
            return;
        }
        StringBuilder sb = new StringBuilder("Input '");
        sb.append(puVar);
        oe oeVar2 = puVar.a;
        sb.append("' is already added to dispatcher ");
        sb.append(oeVar2);
        sb.append('.');
        throw new IllegalArgumentException(sb.toString().toString());
    }

    public final void b() {
        boolean z;
        boolean z2;
        ou ouVar;
        e6 e6Var = this.d;
        if (e6Var == null || !e6Var.isEmpty()) {
            Iterator it = e6Var.iterator();
            while (it.hasNext()) {
                if (((kv) it.next()).b) {
                    z = true;
                    break;
                }
            }
        }
        z = false;
        e6 e6Var2 = this.e;
        if (e6Var2 == null || !e6Var2.isEmpty()) {
            Iterator it2 = e6Var2.iterator();
            while (it2.hasNext()) {
                if (((kv) it2.next()).b) {
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
                ((pu) it3.next()).b(z);
            }
        }
        LinkedHashSet linkedHashSet2 = this.j;
        if (z5) {
            Iterator it4 = linkedHashSet2.iterator();
            while (it4.hasNext()) {
                ((pu) it4.next()).b(z2);
            }
        }
        LinkedHashSet linkedHashSet3 = this.i;
        if (z6) {
            Iterator it5 = linkedHashSet3.iterator();
            while (it5.hasNext()) {
                ((pu) it5.next()).b(z3);
            }
        }
        this.m = z;
        this.l = z2;
        this.n = z3;
        kv kvVar = this.f;
        if (kvVar == null) {
            kvVar = c(0);
        }
        kv kvVar2 = this.f;
        if (kvVar2 == null) {
            kvVar2 = c(0);
        }
        if (oo.b(kvVar2, kvVar)) {
            if (kvVar2 == null) {
                ouVar = new ou();
            } else {
                ArrayList arrayList = new ArrayList();
                Iterator<E> it6 = e6Var.iterator();
                while (it6.hasNext()) {
                    ((kv) it6.next()).getClass();
                }
                Iterator<E> it7 = e6Var2.iterator();
                while (it7.hasNext()) {
                    ((kv) it7.next()).getClass();
                }
                lv lvVar = kvVar2.a;
                zp zpVar = new zp(10);
                ab.Z(zpVar, arrayList);
                zpVar.add(lvVar);
                ab.Z(zpVar, uh.f);
                zpVar.f();
                zpVar.h = true;
                if (zpVar.g <= 0) {
                    zpVar = zp.i;
                }
                ouVar = new ou(zpVar, arrayList.size());
            }
            f30 f30Var = this.b;
            if (oo.b((ou) f30Var.a(), ouVar)) {
                return;
            }
            f30Var.b(ouVar);
            Iterator it8 = linkedHashSet.iterator();
            while (it8.hasNext()) {
                ((pu) it8.next()).getClass();
            }
            Iterator it9 = linkedHashSet2.iterator();
            while (it9.hasNext()) {
                ((pu) it9.next()).getClass();
            }
            Iterator it10 = linkedHashSet3.iterator();
            while (it10.hasNext()) {
                ((pu) it10.next()).getClass();
            }
        }
    }

    public final kv c(int i) {
        Object obj;
        Object obj2;
        e6 e6Var = this.e;
        e6 e6Var2 = this.d;
        Object obj3 = null;
        if (i == -1) {
            Iterator it = e6Var2.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (((kv) obj).b) {
                    break;
                }
            }
            kv kvVar = (kv) obj;
            if (kvVar != null) {
                return kvVar;
            }
            Iterator it2 = e6Var.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                Object next = it2.next();
                if (((kv) next).b) {
                    obj3 = next;
                    break;
                }
            }
            return (kv) obj3;
        }
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException(("Unsupported direction: '" + i + "'.").toString());
            }
            Iterator it3 = e6Var2.iterator();
            while (it3.hasNext()) {
                ((kv) it3.next()).getClass();
            }
            Iterator it4 = e6Var.iterator();
            while (it4.hasNext()) {
                ((kv) it4.next()).getClass();
            }
            return null;
        }
        Iterator it5 = e6Var2.iterator();
        while (true) {
            if (!it5.hasNext()) {
                obj2 = null;
                break;
            }
            obj2 = it5.next();
            if (((kv) obj2).b) {
                break;
            }
        }
        kv kvVar2 = (kv) obj2;
        if (kvVar2 != null) {
            return kvVar2;
        }
        Iterator it6 = e6Var.iterator();
        while (true) {
            if (!it6.hasNext()) {
                break;
            }
            Object next2 = it6.next();
            if (((kv) next2).b) {
                obj3 = next2;
                break;
            }
        }
        return (kv) obj3;
    }
}
