package defpackage;

import java.util.ArrayList;
import java.util.Arrays;

/* compiled from: r8-map-id-f3f55b5b0d2db012739781e1ba4f8511a2ab0ca5e8856dea8785f50c2c15a0e8 */
/* loaded from: classes.dex */
public final class vp {
    public static boolean q = false;
    public final rw d;
    public final y5 m;
    public m6 p;
    public int a = 1000;
    public boolean b = false;
    public int c = 0;
    public int e = 32;
    public int f = 32;
    public boolean h = false;
    public boolean[] i = new boolean[32];
    public int j = 1;
    public int k = 0;
    public int l = 32;
    public o20[] n = new o20[1000];
    public int o = 0;
    public m6[] g = new m6[32];

    public vp() {
        s();
        y5 y5Var = new y5();
        y5Var.a = new nw();
        y5Var.b = new nw();
        y5Var.c = new o20[32];
        this.m = y5Var;
        rw rwVar = new rw(y5Var);
        rwVar.f = new o20[128];
        rwVar.g = new o20[128];
        rwVar.h = 0;
        rwVar.i = new o4(20, rwVar);
        this.d = rwVar;
        this.p = new m6(y5Var);
    }

    public static int n(Object obj) {
        o20 o20Var = ((ec) obj).i;
        if (o20Var != null) {
            return (int) (o20Var.j + 0.5f);
        }
        return 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r4v0 */
    public final o20 a(int i) {
        nw nwVar = (nw) this.m.b;
        int i2 = nwVar.b;
        o20 o20Var = null;
        if (i2 > 0) {
            int i3 = i2 - 1;
            ?? r3 = nwVar.a;
            ?? r4 = r3[i3];
            r3[i3] = 0;
            nwVar.b = i3;
            o20Var = r4;
        }
        o20 o20Var2 = o20Var;
        if (o20Var2 == null) {
            o20Var2 = new o20(i);
            o20Var2.q = i;
        } else {
            o20Var2.c();
            o20Var2.q = i;
        }
        int i4 = this.o;
        int i5 = this.a;
        if (i4 >= i5) {
            int i6 = i5 * 2;
            this.a = i6;
            this.n = (o20[]) Arrays.copyOf(this.n, i6);
        }
        o20[] o20VarArr = this.n;
        int i7 = this.o;
        this.o = i7 + 1;
        o20VarArr[i7] = o20Var2;
        return o20Var2;
    }

    public final void b(o20 o20Var, o20 o20Var2, int i, float f, o20 o20Var3, o20 o20Var4, int i2, int i3) {
        m6 l = l();
        if (o20Var2 == o20Var3) {
            l.d.g(o20Var, 1.0f);
            l.d.g(o20Var4, 1.0f);
            l.d.g(o20Var2, -2.0f);
        } else {
            f6 f6Var = l.d;
            if (f == 0.5f) {
                f6Var.g(o20Var, 1.0f);
                l.d.g(o20Var2, -1.0f);
                l.d.g(o20Var3, -1.0f);
                l.d.g(o20Var4, 1.0f);
                if (i > 0 || i2 > 0) {
                    l.b = (-i) + i2;
                }
            } else if (f <= 0.0f) {
                f6Var.g(o20Var, -1.0f);
                l.d.g(o20Var2, 1.0f);
                l.b = i;
            } else if (f >= 1.0f) {
                f6Var.g(o20Var4, -1.0f);
                l.d.g(o20Var3, 1.0f);
                l.b = -i2;
            } else {
                float f2 = 1.0f - f;
                f6Var.g(o20Var, f2 * 1.0f);
                l.d.g(o20Var2, f2 * (-1.0f));
                l.d.g(o20Var3, (-1.0f) * f);
                l.d.g(o20Var4, 1.0f * f);
                if (i > 0 || i2 > 0) {
                    l.b = (i2 * f) + ((-i) * f2);
                }
            }
        }
        if (i3 != 8) {
            l.a(this, i3);
        }
        c(l);
    }

    /* JADX WARN: Code restructure failed: missing block: B:64:0x00d0, code lost:
    
        if (r4.p <= 1) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x00d3, code lost:
    
        r12 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x00dd, code lost:
    
        if (r4.p <= 1) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x00f2, code lost:
    
        if (r4.p <= 1) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x00f5, code lost:
    
        r14 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x00ff, code lost:
    
        if (r4.p <= 1) goto L85;
     */
    /* JADX WARN: Removed duplicated region for block: B:134:0x01b0  */
    /* JADX WARN: Removed duplicated region for block: B:144:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void c(m6 m6Var) {
        boolean z;
        boolean z2;
        o20 o20Var;
        o20 f;
        if (this.k + 1 >= this.l || this.j + 1 >= this.f) {
            o();
        }
        if (m6Var.e) {
            z = false;
        } else {
            ArrayList arrayList = m6Var.c;
            if (this.g.length != 0) {
                boolean z3 = false;
                while (!z3) {
                    int d = m6Var.d.d();
                    for (int i = 0; i < d; i++) {
                        o20 e = m6Var.d.e(i);
                        if (e.h != -1 || e.k) {
                            arrayList.add(e);
                        }
                    }
                    int size = arrayList.size();
                    if (size > 0) {
                        for (int i2 = 0; i2 < size; i2++) {
                            o20 o20Var2 = (o20) arrayList.get(i2);
                            if (o20Var2.k) {
                                m6Var.h(this, o20Var2, true);
                            } else {
                                m6Var.i(this, this.g[o20Var2.h], true);
                            }
                        }
                        arrayList.clear();
                    } else {
                        z3 = true;
                    }
                }
                if (m6Var.a != null && m6Var.d.d() == 0) {
                    m6Var.e = true;
                    this.b = true;
                }
            }
            if (m6Var.e()) {
                return;
            }
            float f2 = m6Var.b;
            float f3 = 0.0f;
            if (f2 < 0.0f) {
                m6Var.b = f2 * (-1.0f);
                f6 f6Var = m6Var.d;
                int i3 = f6Var.h;
                for (int i4 = 0; i3 != -1 && i4 < f6Var.a; i4++) {
                    float[] fArr = f6Var.g;
                    fArr[i3] = fArr[i3] * (-1.0f);
                    i3 = f6Var.f[i3];
                }
            }
            int d2 = m6Var.d.d();
            float f4 = 0.0f;
            float f5 = 0.0f;
            o20 o20Var3 = null;
            o20 o20Var4 = null;
            int i5 = 0;
            boolean z4 = false;
            boolean z5 = false;
            while (i5 < d2) {
                float f6 = m6Var.d.f(i5);
                o20 e2 = m6Var.d.e(i5);
                float f7 = f3;
                if (e2.q == 1) {
                    if (o20Var3 != null) {
                        if (f4 <= f6) {
                            if (!z4) {
                                if (e2.p > 1) {
                                }
                            }
                        }
                        z4 = true;
                    }
                    o20Var3 = e2;
                    f4 = f6;
                } else if (o20Var3 == null && f6 < f7) {
                    if (o20Var4 != null) {
                        if (f5 <= f6) {
                            if (!z5) {
                                if (e2.p > 1) {
                                }
                            }
                        }
                        z5 = true;
                    }
                    o20Var4 = e2;
                    f5 = f6;
                }
                i5++;
                f3 = f7;
            }
            float f8 = f3;
            if (o20Var3 == null) {
                o20Var3 = o20Var4;
            }
            if (o20Var3 == null) {
                z2 = true;
            } else {
                m6Var.g(o20Var3);
                z2 = false;
            }
            if (m6Var.d.d() == 0) {
                m6Var.e = true;
            }
            if (z2) {
                if (this.j + 1 >= this.f) {
                    o();
                }
                o20 a = a(3);
                int i6 = this.c + 1;
                this.c = i6;
                this.j++;
                a.g = i6;
                y5 y5Var = this.m;
                ((o20[]) y5Var.c)[i6] = a;
                m6Var.a = a;
                int i7 = this.k;
                h(m6Var);
                if (this.k == i7 + 1) {
                    m6 m6Var2 = this.p;
                    m6Var2.a = null;
                    m6Var2.d.b();
                    for (int i8 = 0; i8 < m6Var.d.d(); i8++) {
                        m6Var2.d.a(m6Var.d.e(i8), m6Var.d.f(i8), true);
                    }
                    r(this.p);
                    if (a.h == -1) {
                        if (m6Var.a == a && (f = m6Var.f(null, a)) != null) {
                            m6Var.g(f);
                        }
                        if (!m6Var.e) {
                            m6Var.a.e(this, m6Var);
                        }
                        ((nw) y5Var.a).b(m6Var);
                        this.k--;
                    }
                    z = true;
                    o20Var = m6Var.a;
                    if (o20Var != null) {
                        return;
                    }
                    if (o20Var.q != 1 && m6Var.b < f8) {
                        return;
                    }
                }
            }
            z = false;
            o20Var = m6Var.a;
            if (o20Var != null) {
            }
        }
        if (z) {
            return;
        }
        h(m6Var);
    }

    public final void d(o20 o20Var, int i) {
        int i2 = o20Var.h;
        if (i2 == -1) {
            o20Var.d(this, i);
            for (int i3 = 0; i3 < this.c + 1; i3++) {
                o20 o20Var2 = ((o20[]) this.m.c)[i3];
            }
            return;
        }
        if (i2 == -1) {
            m6 l = l();
            l.a = o20Var;
            float f = i;
            o20Var.j = f;
            l.b = f;
            l.e = true;
            c(l);
            return;
        }
        m6 m6Var = this.g[i2];
        if (m6Var.e) {
            m6Var.b = i;
            return;
        }
        if (m6Var.d.d() == 0) {
            m6Var.e = true;
            m6Var.b = i;
            return;
        }
        m6 l2 = l();
        if (i < 0) {
            l2.b = i * (-1);
            l2.d.g(o20Var, 1.0f);
        } else {
            l2.b = i;
            l2.d.g(o20Var, -1.0f);
        }
        c(l2);
    }

    public final void e(o20 o20Var, o20 o20Var2, int i, int i2) {
        if (i2 == 8 && o20Var2.k && o20Var.h == -1) {
            o20Var.d(this, o20Var2.j + i);
            return;
        }
        m6 l = l();
        boolean z = false;
        if (i != 0) {
            if (i < 0) {
                i *= -1;
                z = true;
            }
            l.b = i;
        }
        f6 f6Var = l.d;
        if (z) {
            f6Var.g(o20Var, 1.0f);
            l.d.g(o20Var2, -1.0f);
        } else {
            f6Var.g(o20Var, -1.0f);
            l.d.g(o20Var2, 1.0f);
        }
        if (i2 != 8) {
            l.a(this, i2);
        }
        c(l);
    }

    public final void f(o20 o20Var, o20 o20Var2, int i, int i2) {
        m6 l = l();
        o20 m = m();
        m.i = 0;
        l.b(o20Var, o20Var2, m, i);
        if (i2 != 8) {
            l.d.g(j(i2), (int) (l.d.c(m) * (-1.0f)));
        }
        c(l);
    }

    public final void g(o20 o20Var, o20 o20Var2, int i, int i2) {
        m6 l = l();
        o20 m = m();
        m.i = 0;
        l.c(o20Var, o20Var2, m, i);
        if (i2 != 8) {
            l.d.g(j(i2), (int) (l.d.c(m) * (-1.0f)));
        }
        c(l);
    }

    public final void h(m6 m6Var) {
        int i;
        if (m6Var.e) {
            m6Var.a.d(this, m6Var.b);
        } else {
            m6[] m6VarArr = this.g;
            int i2 = this.k;
            m6VarArr[i2] = m6Var;
            o20 o20Var = m6Var.a;
            o20Var.h = i2;
            this.k = i2 + 1;
            o20Var.e(this, m6Var);
        }
        if (this.b) {
            int i3 = 0;
            while (i3 < this.k) {
                if (this.g[i3] == null) {
                    System.out.println("WTF");
                }
                m6 m6Var2 = this.g[i3];
                if (m6Var2 != null && m6Var2.e) {
                    m6Var2.a.d(this, m6Var2.b);
                    ((nw) this.m.a).b(m6Var2);
                    this.g[i3] = null;
                    int i4 = i3 + 1;
                    int i5 = i4;
                    while (true) {
                        i = this.k;
                        if (i4 >= i) {
                            break;
                        }
                        m6[] m6VarArr2 = this.g;
                        int i6 = i4 - 1;
                        m6 m6Var3 = m6VarArr2[i4];
                        m6VarArr2[i6] = m6Var3;
                        o20 o20Var2 = m6Var3.a;
                        if (o20Var2.h == i4) {
                            o20Var2.h = i6;
                        }
                        i5 = i4;
                        i4++;
                    }
                    if (i5 < i) {
                        this.g[i5] = null;
                    }
                    this.k = i - 1;
                    i3--;
                }
                i3++;
            }
            this.b = false;
        }
    }

    public final void i() {
        for (int i = 0; i < this.k; i++) {
            m6 m6Var = this.g[i];
            m6Var.a.j = m6Var.b;
        }
    }

    public final o20 j(int i) {
        if (this.j + 1 >= this.f) {
            o();
        }
        o20 a = a(4);
        float[] fArr = a.m;
        int i2 = this.c + 1;
        this.c = i2;
        this.j++;
        a.g = i2;
        a.i = i;
        ((o20[]) this.m.c)[i2] = a;
        rw rwVar = this.d;
        rwVar.i.g = a;
        Arrays.fill(fArr, 0.0f);
        fArr[a.i] = 1.0f;
        rwVar.j(a);
        return a;
    }

    public final o20 k(Object obj) {
        if (obj == null) {
            return null;
        }
        if (this.j + 1 >= this.f) {
            o();
        }
        if (!(obj instanceof ec)) {
            return null;
        }
        ec ecVar = (ec) obj;
        o20 o20Var = ecVar.i;
        if (o20Var == null) {
            ecVar.k();
            o20Var = ecVar.i;
        }
        int i = o20Var.g;
        y5 y5Var = this.m;
        if (i != -1 && i <= this.c && ((o20[]) y5Var.c)[i] != null) {
            return o20Var;
        }
        if (i != -1) {
            o20Var.c();
        }
        int i2 = this.c + 1;
        this.c = i2;
        this.j++;
        o20Var.g = i2;
        o20Var.q = 1;
        ((o20[]) y5Var.c)[i2] = o20Var;
        return o20Var;
    }

    public final m6 l() {
        Object obj;
        y5 y5Var = this.m;
        nw nwVar = (nw) y5Var.a;
        int i = nwVar.b;
        if (i > 0) {
            int i2 = i - 1;
            Object[] objArr = nwVar.a;
            obj = objArr[i2];
            objArr[i2] = null;
            nwVar.b = i2;
        } else {
            obj = null;
        }
        m6 m6Var = (m6) obj;
        if (m6Var == null) {
            return new m6(y5Var);
        }
        m6Var.a = null;
        m6Var.d.b();
        m6Var.b = 0.0f;
        m6Var.e = false;
        return m6Var;
    }

    public final o20 m() {
        if (this.j + 1 >= this.f) {
            o();
        }
        o20 a = a(3);
        int i = this.c + 1;
        this.c = i;
        this.j++;
        a.g = i;
        ((o20[]) this.m.c)[i] = a;
        return a;
    }

    public final void o() {
        int i = this.e * 2;
        this.e = i;
        this.g = (m6[]) Arrays.copyOf(this.g, i);
        y5 y5Var = this.m;
        y5Var.c = (o20[]) Arrays.copyOf((o20[]) y5Var.c, this.e);
        int i2 = this.e;
        this.i = new boolean[i2];
        this.f = i2;
        this.l = i2;
    }

    public final void p() {
        rw rwVar = this.d;
        if (rwVar.e()) {
            i();
            return;
        }
        if (!this.h) {
            q(rwVar);
            return;
        }
        for (int i = 0; i < this.k; i++) {
            if (!this.g[i].e) {
                q(rwVar);
                return;
            }
        }
        i();
    }

    public final void q(rw rwVar) {
        int i = 0;
        while (true) {
            if (i >= this.k) {
                break;
            }
            m6 m6Var = this.g[i];
            int i2 = 1;
            if (m6Var.a.q != 1) {
                float f = 0.0f;
                if (m6Var.b < 0.0f) {
                    boolean z = false;
                    int i3 = 0;
                    while (!z) {
                        i3 += i2;
                        float f2 = Float.MAX_VALUE;
                        int i4 = -1;
                        int i5 = -1;
                        int i6 = 0;
                        int i7 = 0;
                        while (i6 < this.k) {
                            m6 m6Var2 = this.g[i6];
                            if (m6Var2.a.q != i2 && !m6Var2.e && m6Var2.b < f) {
                                int d = m6Var2.d.d();
                                int i8 = 0;
                                while (i8 < d) {
                                    o20 e = m6Var2.d.e(i8);
                                    float c = m6Var2.d.c(e);
                                    if (c > f) {
                                        for (int i9 = 0; i9 < 9; i9++) {
                                            float f3 = e.l[i9] / c;
                                            if ((f3 < f2 && i9 == i7) || i9 > i7) {
                                                i7 = i9;
                                                i5 = e.g;
                                                i4 = i6;
                                                f2 = f3;
                                            }
                                        }
                                    }
                                    i8++;
                                    f = 0.0f;
                                }
                            }
                            i6++;
                            f = 0.0f;
                            i2 = 1;
                        }
                        if (i4 != -1) {
                            m6 m6Var3 = this.g[i4];
                            m6Var3.a.h = -1;
                            m6Var3.g(((o20[]) this.m.c)[i5]);
                            o20 o20Var = m6Var3.a;
                            o20Var.h = i4;
                            o20Var.e(this, m6Var3);
                        } else {
                            z = true;
                        }
                        if (i3 > this.j / 2) {
                            z = true;
                        }
                        f = 0.0f;
                        i2 = 1;
                    }
                }
            }
            i++;
        }
        r(rwVar);
        i();
    }

    public final void r(m6 m6Var) {
        boolean z;
        int i = 0;
        for (int i2 = 0; i2 < this.j; i2++) {
            this.i[i2] = false;
        }
        boolean z2 = false;
        int i3 = 0;
        while (!z2) {
            i3++;
            if (i3 >= this.j * 2) {
                return;
            }
            o20 o20Var = m6Var.a;
            if (o20Var != null) {
                this.i[o20Var.g] = true;
            }
            o20 d = m6Var.d(this.i);
            if (d != null) {
                boolean[] zArr = this.i;
                int i4 = d.g;
                if (zArr[i4]) {
                    return;
                } else {
                    zArr[i4] = true;
                }
            }
            if (d != null) {
                float f = Float.MAX_VALUE;
                int i5 = i;
                int i6 = -1;
                while (i5 < this.k) {
                    m6 m6Var2 = this.g[i5];
                    if (m6Var2.a.q != 1 && !m6Var2.e) {
                        f6 f6Var = m6Var2.d;
                        int i7 = f6Var.h;
                        if (i7 != -1) {
                            for (int i8 = i; i7 != -1 && i8 < f6Var.a; i8++) {
                                if (f6Var.e[i7] == d.g) {
                                    z = true;
                                    break;
                                }
                                i7 = f6Var.f[i7];
                            }
                        }
                        z = false;
                        if (z) {
                            float c = m6Var2.d.c(d);
                            if (c < 0.0f) {
                                float f2 = (-m6Var2.b) / c;
                                if (f2 < f) {
                                    i6 = i5;
                                    f = f2;
                                }
                            }
                        }
                    }
                    i5++;
                    i = 0;
                }
                if (i6 > -1) {
                    m6 m6Var3 = this.g[i6];
                    m6Var3.a.h = -1;
                    m6Var3.g(d);
                    o20 o20Var2 = m6Var3.a;
                    o20Var2.h = i6;
                    o20Var2.e(this, m6Var3);
                }
            } else {
                z2 = true;
            }
            i = 0;
        }
    }

    public final void s() {
        for (int i = 0; i < this.k; i++) {
            m6 m6Var = this.g[i];
            if (m6Var != null) {
                ((nw) this.m.a).b(m6Var);
            }
            this.g[i] = null;
        }
    }

    public final void t() {
        y5 y5Var;
        int i = 0;
        while (true) {
            y5Var = this.m;
            o20[] o20VarArr = (o20[]) y5Var.c;
            if (i >= o20VarArr.length) {
                break;
            }
            o20 o20Var = o20VarArr[i];
            if (o20Var != null) {
                o20Var.c();
            }
            i++;
        }
        nw nwVar = (nw) y5Var.b;
        o20[] o20VarArr2 = this.n;
        int i2 = this.o;
        nwVar.getClass();
        if (i2 > o20VarArr2.length) {
            i2 = o20VarArr2.length;
        }
        for (int i3 = 0; i3 < i2; i3++) {
            o20 o20Var2 = o20VarArr2[i3];
            int i4 = nwVar.b;
            Object[] objArr = nwVar.a;
            if (i4 < objArr.length) {
                objArr[i4] = o20Var2;
                nwVar.b = i4 + 1;
            }
        }
        this.o = 0;
        Arrays.fill((o20[]) y5Var.c, (Object) null);
        this.c = 0;
        rw rwVar = this.d;
        rwVar.h = 0;
        rwVar.b = 0.0f;
        this.j = 1;
        for (int i5 = 0; i5 < this.k; i5++) {
            m6 m6Var = this.g[i5];
        }
        s();
        this.k = 0;
        this.p = new m6(y5Var);
    }
}
