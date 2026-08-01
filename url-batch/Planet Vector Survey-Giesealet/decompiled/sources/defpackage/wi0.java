package defpackage;

import android.util.Log;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public final class wi0 extends vh {
    public static final et0 x = nk.b(rf0.g);
    public static final AtomicReference y = new AtomicReference(Boolean.FALSE);
    public final ya a;
    public final Object b;
    public zz c;
    public Throwable d;
    public final ArrayList e;
    public List f;
    public b70 g;
    public final l70 h;
    public final ArrayList i;
    public final ArrayList j;
    public final a70 k;
    public final j3 l;
    public final a70 m;
    public final a70 n;
    public ArrayList o;
    public LinkedHashSet p;
    public hc q;
    public p01 r;
    public boolean s;
    public final et0 t;
    public final b00 u;
    public final rj v;
    public final pg0 w;

    public wi0(rj rjVar) {
        ya yaVar = new ya(new ab0(1, this));
        this.a = yaVar;
        this.b = new Object();
        this.e = new ArrayList();
        this.g = new b70();
        this.h = new l70(new bi[16]);
        this.i = new ArrayList();
        this.j = new ArrayList();
        this.k = new a70();
        this.l = new j3(6);
        this.m = new a70();
        this.n = new a70();
        this.t = nk.b(si0.f);
        new AtomicReference(d31.g);
        b00 b00Var = new b00((zz) rjVar.k(b2.C));
        b00Var.q(new h(5, this));
        this.u = b00Var;
        this.v = rjVar.i(yaVar).i(b00Var);
        this.w = new pg0(6);
    }

    public static final void G(ArrayList arrayList, wi0 wi0Var, bi biVar) {
        arrayList.clear();
        synchronized (wi0Var.b) {
            Iterator it = wi0Var.j.iterator();
            if (it.hasNext()) {
                ((i60) it.next()).getClass();
                throw null;
            }
        }
    }

    public static final Object r(wi0 wi0Var, vi0 vi0Var) {
        hc hcVar;
        if (wi0Var.C()) {
            return ky0.a;
        }
        hc hcVar2 = new hc(1, d31.B(vi0Var));
        hcVar2.q();
        synchronized (wi0Var.b) {
            if (wi0Var.C()) {
                hcVar = hcVar2;
            } else {
                wi0Var.q = hcVar2;
                hcVar = null;
            }
        }
        if (hcVar != null) {
            hcVar.resumeWith(ky0.a);
        }
        Object p = hcVar2.p();
        return p == ck.d ? p : ky0.a;
    }

    public static final void s(wi0 wi0Var) {
        int i;
        x60 x60Var;
        synchronized (wi0Var.b) {
            try {
                if (wi0Var.k.j()) {
                    x60 b = l60.b(wi0Var.k);
                    wi0Var.k.a();
                    j3 j3Var = wi0Var.l;
                    ((a70) j3Var.e).a();
                    ((a70) j3Var.f).a();
                    wi0Var.n.a();
                    x60Var = new x60(b.b);
                    Object[] objArr = b.a;
                    int i2 = b.b;
                    for (int i3 = 0; i3 < i2; i3++) {
                        i60 i60Var = (i60) objArr[i3];
                        x60Var.a(new pd0(i60Var, wi0Var.m.g(i60Var)));
                    }
                    wi0Var.m.a();
                } else {
                    x60Var = na0.b;
                    x60Var.getClass();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        Object[] objArr2 = x60Var.a;
        int i4 = x60Var.b;
        for (i = 0; i < i4; i++) {
            pd0 pd0Var = (pd0) objArr2[i];
        }
    }

    public static final boolean t(wi0 wi0Var) {
        boolean B;
        synchronized (wi0Var.b) {
            B = wi0Var.B();
        }
        return B;
    }

    public static final List u(wi0 wi0Var) {
        List D;
        synchronized (wi0Var.b) {
            D = wi0Var.D();
        }
        return D;
    }

    public static final bi v(wi0 wi0Var, bi biVar, b70 b70Var) {
        LinkedHashSet linkedHashSet;
        e70 D;
        if (!biVar.w.E) {
            int i = 3;
            if (biVar.x != 3 && ((linkedHashSet = wi0Var.p) == null || !linkedHashSet.contains(biVar))) {
                int i2 = 4;
                h hVar = new h(4, biVar);
                aw awVar = new aw(i, biVar, b70Var);
                or0 k = ur0.k();
                e70 e70Var = k instanceof e70 ? (e70) k : null;
                if (e70Var == null || (D = e70Var.D(hVar, awVar)) == null) {
                    g8.s("Cannot create a mutable snapshot of an read-only snapshot");
                } else {
                    try {
                        or0 j = D.j();
                        if (b70Var != null) {
                            try {
                                if (b70Var.h()) {
                                    f8 f8Var = new f8(i2, b70Var, biVar);
                                    qh qhVar = biVar.w;
                                    if (qhVar.E) {
                                        th.c("Preparing a composition while composing is not supported");
                                    }
                                    qhVar.E = true;
                                    try {
                                        f8Var.a();
                                        qhVar.E = false;
                                    } catch (Throwable th) {
                                        qhVar.E = false;
                                        throw th;
                                    }
                                }
                            } catch (Throwable th2) {
                                or0.q(j);
                                throw th2;
                            }
                        }
                        boolean s = biVar.s();
                        or0.q(j);
                        if (s) {
                            return biVar;
                        }
                    } finally {
                        y(D);
                    }
                }
            }
        }
        return null;
    }

    public static final boolean w(wi0 wi0Var) {
        synchronized (wi0Var.b) {
            boolean z = true;
            if (wi0Var.g.g()) {
                if (wi0Var.h.f == 0 && !wi0Var.B() && !wi0Var.k.j()) {
                    z = false;
                }
                return z;
            }
            List D = wi0Var.D();
            xn0 xn0Var = new xn0(wi0Var.g);
            wi0Var.g = new b70();
            try {
                int size = D.size();
                for (int i = 0; i < size; i++) {
                    ((bi) D.get(i)).t(xn0Var);
                    if (((si0) wi0Var.t.getValue()).compareTo(si0.e) <= 0) {
                        break;
                    }
                }
                synchronized (wi0Var.b) {
                    if (wi0Var.A() != null) {
                        throw new IllegalStateException("called outside of runRecomposeAndApplyChanges");
                    }
                    if (wi0Var.h.f == 0 && !wi0Var.B() && !wi0Var.k.j()) {
                        z = false;
                    }
                }
                return z;
            } catch (Throwable th) {
                synchronized (wi0Var.b) {
                    b70 b70Var = wi0Var.g;
                    b70Var.getClass();
                    Iterator<E> it = xn0Var.iterator();
                    while (it.hasNext()) {
                        b70Var.j(it.next());
                    }
                    throw th;
                }
            }
        }
    }

    public static final void x(wi0 wi0Var, zz zzVar) {
        synchronized (wi0Var.b) {
            Throwable th = wi0Var.d;
            if (th != null) {
                throw th;
            }
            if (((si0) wi0Var.t.getValue()).compareTo(si0.e) <= 0) {
                throw new IllegalStateException("Recomposer shut down");
            }
            if (wi0Var.c != null) {
                throw new IllegalStateException("Recomposer already running");
            }
            wi0Var.c = zzVar;
            wi0Var.A();
        }
    }

    public static void y(e70 e70Var) {
        try {
            if (e70Var.w() instanceof pr0) {
                throw new IllegalStateException("Unsupported concurrent change during composition. A state object was modified by composition as well as being modified outside composition.");
            }
        } finally {
            e70Var.c();
        }
    }

    public final fc A() {
        et0 et0Var = this.t;
        int compareTo = ((si0) et0Var.getValue()).compareTo(si0.e);
        ArrayList arrayList = this.j;
        ArrayList arrayList2 = this.i;
        l70 l70Var = this.h;
        if (compareTo <= 0) {
            for (bi biVar : D()) {
            }
            this.e.clear();
            this.f = wp.d;
            this.g = new b70();
            l70Var.g();
            arrayList2.clear();
            arrayList.clear();
            this.o = null;
            hc hcVar = this.q;
            if (hcVar != null) {
                hcVar.j(null);
            }
            this.q = null;
            this.r = null;
            return null;
        }
        p01 p01Var = this.r;
        si0 si0Var = si0.i;
        si0 si0Var2 = si0.f;
        if (p01Var == null) {
            if (this.c == null) {
                this.g = new b70();
                l70Var.g();
                if (B()) {
                    si0Var2 = si0.g;
                }
            } else {
                si0Var2 = (l70Var.f == 0 && !this.g.h() && arrayList2.isEmpty() && arrayList.isEmpty() && !B() && !this.k.j()) ? si0.h : si0Var;
            }
        }
        et0Var.getClass();
        et0Var.k(null, si0Var2);
        if (si0Var2 != si0Var) {
            return null;
        }
        hc hcVar2 = this.q;
        this.q = null;
        return hcVar2;
    }

    public final boolean B() {
        return !this.s && (this.a.g.get() & 134217727) > 0;
    }

    public final boolean C() {
        boolean z;
        synchronized (this.b) {
            if (!this.g.h() && this.h.f == 0) {
                z = B();
            }
        }
        return z;
    }

    public final List D() {
        List list = this.f;
        if (list != null) {
            return list;
        }
        ArrayList arrayList = this.e;
        List arrayList2 = arrayList.isEmpty() ? wp.d : new ArrayList(arrayList);
        this.f = arrayList2;
        return arrayList2;
    }

    public final void E() {
        synchronized (this.b) {
            this.s = true;
        }
    }

    public final void F(bi biVar) {
        synchronized (this.b) {
            ArrayList arrayList = this.j;
            if (arrayList.size() > 0) {
                ((i60) arrayList.get(0)).getClass();
                throw null;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:60:0x013a, code lost:
    
        r3 = r11.size();
        r4 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x013f, code lost:
    
        if (r4 >= r3) goto L119;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0149, code lost:
    
        if (((defpackage.pd0) r11.get(r4)).e == null) goto L118;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x014b, code lost:
    
        r4 = r4 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x014e, code lost:
    
        r3 = new java.util.ArrayList(r11.size());
        r4 = r11.size();
        r9 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x015c, code lost:
    
        if (r9 >= r4) goto L120;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x015e, code lost:
    
        r12 = (defpackage.pd0) r11.get(r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x0166, code lost:
    
        if (r12.e != null) goto L121;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0168, code lost:
    
        r12 = (defpackage.i60) r12.d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x016f, code lost:
    
        r9 = r9 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x0172, code lost:
    
        r4 = r18.b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x0174, code lost:
    
        monitor-enter(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x0175, code lost:
    
        defpackage.ee.a0(r18.j, r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x017a, code lost:
    
        monitor-exit(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x017b, code lost:
    
        r3 = new java.util.ArrayList(r11.size());
        r4 = r11.size();
        r9 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x0189, code lost:
    
        if (r9 >= r4) goto L123;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x018b, code lost:
    
        r12 = r11.get(r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x0194, code lost:
    
        if (((defpackage.pd0) r12).e == null) goto L125;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x0196, code lost:
    
        r3.add(r12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x0199, code lost:
    
        r9 = r9 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x019c, code lost:
    
        r11 = r3;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final List H(List list, b70 b70Var) {
        e70 D;
        ArrayList arrayList;
        HashMap hashMap = new HashMap(list.size());
        int size = list.size();
        for (int i = 0; i < size; i++) {
            Object obj = list.get(i);
            ((i60) obj).getClass();
            Object obj2 = hashMap.get(null);
            if (obj2 == null) {
                obj2 = new ArrayList();
                hashMap.put(null, obj2);
            }
            ((ArrayList) obj2).add(obj);
        }
        for (Map.Entry entry : hashMap.entrySet()) {
            bi biVar = (bi) entry.getKey();
            List list2 = (List) entry.getValue();
            if (biVar.w.E) {
                th.c("Check failed");
            }
            h hVar = new h(4, biVar);
            aw awVar = new aw(3, biVar, b70Var);
            or0 k = ur0.k();
            e70 e70Var = k instanceof e70 ? (e70) k : null;
            if (e70Var == null || (D = e70Var.D(hVar, awVar)) == null) {
                g8.s("Cannot create a mutable snapshot of an read-only snapshot");
                return null;
            }
            try {
                or0 j = D.j();
                try {
                    synchronized (this.b) {
                        try {
                            arrayList = new ArrayList(list2.size());
                            int size2 = list2.size();
                            for (int i2 = 0; i2 < size2; i2++) {
                                i60 i60Var = (i60) list2.get(i2);
                                a70 a70Var = this.k;
                                i60Var.getClass();
                                Object a = l60.a(a70Var);
                                arrayList.add(new pd0(i60Var, a));
                            }
                            int size3 = arrayList.size();
                            int i3 = 0;
                            while (true) {
                                if (i3 >= size3) {
                                    break;
                                }
                                pd0 pd0Var = (pd0) arrayList.get(i3);
                                if (pd0Var.e == null) {
                                    j3 j3Var = this.l;
                                    ((i60) pd0Var.d).getClass();
                                    if (((a70) j3Var.e).b(null)) {
                                        ArrayList arrayList2 = new ArrayList(ae.Y(arrayList, 10));
                                        int size4 = arrayList.size();
                                        int i4 = 0;
                                        while (i4 < size4) {
                                            Object obj3 = arrayList.get(i4);
                                            i4++;
                                            pd0 pd0Var2 = (pd0) obj3;
                                            if (pd0Var2.e == null) {
                                                j3 j3Var2 = this.l;
                                                ((i60) pd0Var2.d).getClass();
                                                a70 a70Var2 = (a70) j3Var2.e;
                                                if (a70Var2.i()) {
                                                    ((a70) j3Var2.f).a();
                                                }
                                            }
                                            arrayList2.add(pd0Var2);
                                        }
                                        arrayList = arrayList2;
                                    }
                                }
                                i3++;
                            }
                        } finally {
                        }
                    }
                    int size5 = arrayList.size();
                    int i5 = 0;
                    while (true) {
                        if (i5 >= size5) {
                            break;
                        }
                        if (((pd0) arrayList.get(i5)).e != null) {
                            break;
                        }
                        i5++;
                    }
                    biVar.m(arrayList);
                    or0.q(j);
                } catch (Throwable th) {
                    or0.q(j);
                    throw th;
                }
            } finally {
                y(D);
            }
        }
        return zd.o0(hashMap.keySet());
    }

    public final void I(Throwable th, bi biVar) {
        int i = 16;
        if (!((Boolean) y.get()).booleanValue() || (th instanceof vg)) {
            synchronized (this.b) {
                p01 p01Var = this.r;
                if (p01Var != null) {
                    throw ((Throwable) p01Var.e);
                }
                this.r = new p01(i, th);
            }
            throw th;
        }
        synchronized (this.b) {
            try {
                Log.e("ComposeInternal", "Error was captured in composition while live edit was enabled.", th);
                this.i.clear();
                this.h.g();
                this.g = new b70();
                this.j.clear();
                this.k.a();
                this.m.a();
                this.r = new p01(i, th);
                if (biVar != null) {
                    J(biVar);
                }
                A();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void J(bi biVar) {
        ArrayList arrayList = this.o;
        if (arrayList == null) {
            arrayList = new ArrayList();
            this.o = arrayList;
        }
        if (!arrayList.contains(biVar)) {
            arrayList.add(biVar);
        }
        if (this.e.remove(biVar)) {
            this.f = null;
        }
    }

    public final void K() {
        fc fcVar;
        synchronized (this.b) {
            if (this.s) {
                this.s = false;
                fcVar = A();
            } else {
                fcVar = null;
            }
        }
        if (fcVar != null) {
            ((hc) fcVar).resumeWith(ky0.a);
        }
    }

    @Override // defpackage.vh
    public final void a(bi biVar, eg egVar) {
        si0 si0Var;
        boolean contains;
        e70 D;
        boolean z = biVar.w.E;
        synchronized (this.b) {
            si0 si0Var2 = (si0) this.t.getValue();
            si0Var = si0.e;
            contains = si0Var2.compareTo(si0Var) > 0 ? true ^ D().contains(biVar) : true;
        }
        try {
            h hVar = new h(4, biVar);
            aw awVar = new aw(3, biVar, null);
            or0 k = ur0.k();
            e70 e70Var = k instanceof e70 ? (e70) k : null;
            if (e70Var == null || (D = e70Var.D(hVar, awVar)) == null) {
                throw new IllegalStateException("Cannot create a mutable snapshot of an read-only snapshot");
            }
            try {
                or0 j = D.j();
                try {
                    biVar.i(egVar);
                    synchronized (this.b) {
                        if (((si0) this.t.getValue()).compareTo(si0Var) > 0 && !D().contains(biVar)) {
                            this.e.add(biVar);
                            this.f = null;
                        }
                    }
                    if (!z) {
                        ur0.k().m();
                    }
                    try {
                        F(biVar);
                        try {
                            biVar.d();
                            biVar.f();
                            if (z) {
                                return;
                            }
                            ur0.k().m();
                        } catch (Throwable th) {
                            I(th, null);
                        }
                    } catch (Throwable th2) {
                        I(th2, biVar);
                    }
                } finally {
                    or0.q(j);
                }
            } finally {
                y(D);
            }
        } catch (Throwable th3) {
            if (contains) {
                synchronized (this.b) {
                }
            }
            I(th3, biVar);
        }
    }

    @Override // defpackage.vh
    public final boolean c() {
        return ((Boolean) y.get()).booleanValue();
    }

    @Override // defpackage.vh
    public final boolean d() {
        return false;
    }

    @Override // defpackage.vh
    public final boolean e() {
        return false;
    }

    @Override // defpackage.vh
    public final long f() {
        return 1000L;
    }

    @Override // defpackage.vh
    public final uh g() {
        return null;
    }

    @Override // defpackage.vh
    public final rj i() {
        return this.v;
    }

    @Override // defpackage.vh
    public final void j(bi biVar) {
        fc fcVar;
        synchronized (this.b) {
            if (this.h.h(biVar)) {
                fcVar = null;
            } else {
                this.h.b(biVar);
                fcVar = A();
            }
        }
        if (fcVar != null) {
            ((hc) fcVar).resumeWith(ky0.a);
        }
    }

    @Override // defpackage.vh
    public final h60 k(i60 i60Var) {
        h60 h60Var;
        synchronized (this.b) {
            h60Var = (h60) this.m.k(i60Var);
        }
        return h60Var;
    }

    @Override // defpackage.vh
    public final void n(bi biVar) {
        synchronized (this.b) {
            try {
                LinkedHashSet linkedHashSet = this.p;
                if (linkedHashSet == null) {
                    linkedHashSet = new LinkedHashSet();
                    this.p = linkedHashSet;
                }
                linkedHashSet.add(biVar);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.vh
    public final void q(bi biVar) {
        synchronized (this.b) {
            if (this.e.remove(biVar)) {
                this.f = null;
            }
            this.h.i(biVar);
            this.i.remove(biVar);
        }
    }

    public final void z() {
        synchronized (this.b) {
            if (((si0) this.t.getValue()).compareTo(si0.h) >= 0) {
                et0 et0Var = this.t;
                si0 si0Var = si0.e;
                et0Var.getClass();
                et0Var.k(null, si0Var);
            }
        }
        this.u.a(null);
    }

    @Override // defpackage.vh
    public final void l(Set set) {
    }
}
