package yads;

import android.content.Context;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Objects;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt;

/* loaded from: classes14.dex */
public final class jx1 {
    public final Context a;
    public final v3 b;
    public final t8 c;
    public final q92 d;
    public final d42 e;
    public final String f;
    public final r9 g;
    public final u9 h;
    public final vw2 i;
    public final a83 j;
    public final t83 k;
    public final lx l;
    public t41 m;
    public boolean n;
    public boolean o;
    public final ArrayList p;

    public jx1(Context context, v3 v3Var, yu2 yu2Var, t8 t8Var, q92 q92Var, d42 d42Var, String str, r9 r9Var) {
        vw2 vw2Var;
        u9 u9Var = new u9(context, v3Var, yu2Var);
        vw2 vw2Var2 = vw2.l;
        if (vw2Var2 == null) {
            synchronized (vw2.k) {
                vw2Var = vw2.l;
                if (vw2Var == null) {
                    vw2Var = new vw2();
                    vw2.l = vw2Var;
                }
            }
            vw2Var2 = vw2Var;
        }
        a83 a83Var = new a83(q92Var);
        t83 t83Var = new t83();
        lx lxVar = new lx();
        this.a = context;
        this.b = v3Var;
        this.c = t8Var;
        this.d = q92Var;
        this.e = d42Var;
        this.f = str;
        this.g = r9Var;
        this.h = u9Var;
        this.i = vw2Var2;
        this.j = a83Var;
        this.k = t83Var;
        this.l = lxVar;
        this.p = new ArrayList();
    }

    public final synchronized void a(s83 s83Var, cc3 cc3Var) {
        a93 a93Var;
        try {
            int ordinal = s83Var.d.ordinal();
            if (ordinal == 0) {
                a93Var = a93.e;
            } else if (ordinal == 1) {
                a93Var = a93.f;
            } else {
                if (ordinal != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                a93Var = a93.k;
            }
            u9.a(this.h, s83Var.a, a93Var, this.l.a(this.b, this.c), 4);
            if (!this.n) {
                this.n = true;
                t41 t41Var = this.m;
                if (t41Var != null) {
                    t41Var.c();
                }
            }
            if (!this.o && this.p.isEmpty()) {
                this.o = true;
                t41 t41Var2 = this.m;
                if (t41Var2 != null) {
                    t41Var2.g();
                }
            }
            this.d.a(s83Var.d, cc3Var);
            q92 q92Var = this.d;
            fz2 fz2Var = s83Var.d;
            ArrayList arrayList = this.p;
            ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList, 10));
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                arrayList2.add(((s83) it.next()).d);
            }
            q92Var.a(fz2Var, arrayList2, cc3Var);
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void b() {
        boolean z = ob1.a;
        this.j.b();
        Iterator it = this.p.iterator();
        while (it.hasNext()) {
            ((s83) it.next()).e = null;
        }
    }

    public final ec3 b(s83 s83Var) {
        ec3 b = this.e.b(s83Var.a());
        Objects.toString(b);
        boolean z = ob1.a;
        return b;
    }

    public final synchronized void a(t8 t8Var, ArrayList arrayList) {
        boolean z = ob1.a;
        this.d.a(t8Var);
        this.p.clear();
        this.d.invalidate();
        this.o = false;
        b();
        a(arrayList);
    }

    public final synchronized void a(ArrayList arrayList) {
        fz2 fz2Var;
        fz2 fz2Var2;
        try {
            this.p.clear();
            t83 t83Var = this.k;
            r9 r9Var = this.g;
            t83Var.getClass();
            ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList, 10));
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                arrayList2.add(((ez2) it.next()).d);
            }
            Set set = CollectionsKt.toSet(arrayList2);
            int ordinal = r9Var.ordinal();
            if (ordinal == 0) {
                if (!(set instanceof Collection) || !set.isEmpty()) {
                    Iterator it2 = set.iterator();
                    while (it2.hasNext()) {
                        if (((fz2) it2.next()) == fz2.c) {
                            fz2Var = null;
                            break;
                        }
                    }
                }
                fz2Var = fz2.b;
            } else if (ordinal == 1) {
                fz2Var = fz2.c;
            } else if (ordinal == 2) {
                fz2Var = fz2.b;
            } else {
                throw new NoWhenBranchMatchedException();
            }
            ArrayList arrayList3 = new ArrayList();
            ArrayList arrayList4 = new ArrayList();
            Iterator it3 = arrayList.iterator();
            while (it3.hasNext()) {
                Object next = it3.next();
                String str = ((ez2) next).b;
                arrayList4.add(next);
            }
            Iterator it4 = arrayList4.iterator();
            while (it4.hasNext()) {
                ez2 ez2Var = (ez2) it4.next();
                String str2 = ez2Var.b;
                long j = ez2Var.a;
                int i = ez2Var.c;
                fz2 fz2Var3 = ez2Var.d;
                if (fz2Var3 == fz2.d && fz2Var != null) {
                    fz2Var2 = fz2Var;
                    arrayList3.add(new s83(i, j, str2, fz2Var2));
                }
                fz2Var2 = fz2Var3;
                arrayList3.add(new s83(i, j, str2, fz2Var2));
            }
            this.p.addAll(arrayList3);
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void a() {
        boolean z = ob1.a;
        if (id2.h.a(this.a).a() && !this.p.isEmpty() && !this.j.a()) {
            this.j.a(this);
        }
    }

    public final ec3 a(s83 s83Var) {
        ec3 a;
        bu2 a2 = this.i.a(this.a);
        if (a2 != null ? a2.w0() : false) {
            a = this.e.b(s83Var.a());
        } else {
            a = this.e.a(s83Var.a());
        }
        Objects.toString(a);
        boolean z = ob1.a;
        return a;
    }

    public final synchronized void a(dd2 dd2Var, boolean z) {
        try {
            Objects.toString(dd2Var);
            boolean z2 = ob1.a;
            int ordinal = dd2Var.ordinal();
            if (ordinal != 0) {
                if (ordinal == 1) {
                    b();
                } else if (ordinal != 2) {
                }
            }
            if (z) {
                a();
            }
        } finally {
        }
    }
}
