package q;

import B.j;
import K.C0012l;
import java.util.ArrayList;
import java.util.Arrays;
import s.C0298c;

/* renamed from: q.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0289c {

    /* renamed from: p, reason: collision with root package name */
    public static boolean f3525p = false;

    /* renamed from: q, reason: collision with root package name */
    public static int f3526q = 1000;

    /* renamed from: c, reason: collision with root package name */
    public final C0290d f3529c;

    /* renamed from: f, reason: collision with root package name */
    public C0288b[] f3531f;

    /* renamed from: l, reason: collision with root package name */
    public final C0012l f3535l;

    /* renamed from: o, reason: collision with root package name */
    public C0288b f3538o;

    /* renamed from: a, reason: collision with root package name */
    public boolean f3527a = false;

    /* renamed from: b, reason: collision with root package name */
    public int f3528b = 0;
    public int d = 32;

    /* renamed from: e, reason: collision with root package name */
    public int f3530e = 32;

    /* renamed from: g, reason: collision with root package name */
    public boolean f3532g = false;
    public boolean[] h = new boolean[32];
    public int i = 1;

    /* renamed from: j, reason: collision with root package name */
    public int f3533j = 0;

    /* renamed from: k, reason: collision with root package name */
    public int f3534k = 32;

    /* renamed from: m, reason: collision with root package name */
    public C0292f[] f3536m = new C0292f[f3526q];

    /* renamed from: n, reason: collision with root package name */
    public int f3537n = 0;

    public C0289c() {
        this.f3531f = null;
        this.f3531f = new C0288b[32];
        s();
        C0012l c0012l = new C0012l();
        c0012l.f431b = new J.b();
        c0012l.f432c = new J.b();
        c0012l.d = new C0292f[32];
        this.f3535l = c0012l;
        C0290d c0290d = new C0290d(c0012l);
        c0290d.f3539f = new C0292f[128];
        c0290d.f3540g = new C0292f[128];
        c0290d.h = 0;
        c0290d.i = new j(c0290d);
        this.f3529c = c0290d;
        this.f3538o = new C0288b(c0012l);
    }

    public static int n(Object obj) {
        C0292f c0292f = ((C0298c) obj).i;
        if (c0292f != null) {
            return (int) (c0292f.f3545e + 0.5f);
        }
        return 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r4v0 */
    public final C0292f a(int i) {
        J.b bVar = (J.b) this.f3535l.f432c;
        int i2 = bVar.f353b;
        C0292f c0292f = null;
        if (i2 > 0) {
            int i3 = i2 - 1;
            ?? r3 = bVar.f352a;
            ?? r4 = r3[i3];
            r3[i3] = 0;
            bVar.f353b = i3;
            c0292f = r4;
        }
        C0292f c0292f2 = c0292f;
        if (c0292f2 == null) {
            c0292f2 = new C0292f(i);
            c0292f2.f3550l = i;
        } else {
            c0292f2.c();
            c0292f2.f3550l = i;
        }
        int i4 = this.f3537n;
        int i5 = f3526q;
        if (i4 >= i5) {
            int i6 = i5 * 2;
            f3526q = i6;
            this.f3536m = (C0292f[]) Arrays.copyOf(this.f3536m, i6);
        }
        C0292f[] c0292fArr = this.f3536m;
        int i7 = this.f3537n;
        this.f3537n = i7 + 1;
        c0292fArr[i7] = c0292f2;
        return c0292f2;
    }

    public final void b(C0292f c0292f, C0292f c0292f2, int i, float f2, C0292f c0292f3, C0292f c0292f4, int i2, int i3) {
        C0288b l2 = l();
        if (c0292f2 == c0292f3) {
            l2.d.g(c0292f, 1.0f);
            l2.d.g(c0292f4, 1.0f);
            l2.d.g(c0292f2, -2.0f);
        } else if (f2 == 0.5f) {
            l2.d.g(c0292f, 1.0f);
            l2.d.g(c0292f2, -1.0f);
            l2.d.g(c0292f3, -1.0f);
            l2.d.g(c0292f4, 1.0f);
            if (i > 0 || i2 > 0) {
                l2.f3522b = (-i) + i2;
            }
        } else if (f2 <= 0.0f) {
            l2.d.g(c0292f, -1.0f);
            l2.d.g(c0292f2, 1.0f);
            l2.f3522b = i;
        } else if (f2 >= 1.0f) {
            l2.d.g(c0292f4, -1.0f);
            l2.d.g(c0292f3, 1.0f);
            l2.f3522b = -i2;
        } else {
            float f3 = 1.0f - f2;
            l2.d.g(c0292f, f3 * 1.0f);
            l2.d.g(c0292f2, f3 * (-1.0f));
            l2.d.g(c0292f3, (-1.0f) * f2);
            l2.d.g(c0292f4, 1.0f * f2);
            if (i > 0 || i2 > 0) {
                l2.f3522b = (i2 * f2) + ((-i) * f3);
            }
        }
        if (i3 != 8) {
            l2.a(this, i3);
        }
        c(l2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:68:0x00d0, code lost:
    
        if (r4.f3549k <= 1) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x00d3, code lost:
    
        r12 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x00dd, code lost:
    
        if (r4.f3549k <= 1) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x00f2, code lost:
    
        if (r4.f3549k <= 1) goto L87;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x00f5, code lost:
    
        r14 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x00ff, code lost:
    
        if (r4.f3549k <= 1) goto L87;
     */
    /* JADX WARN: Removed duplicated region for block: B:137:0x01ae  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x01b9 A[ORIG_RETURN, RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void c(C0288b c0288b) {
        boolean z2;
        boolean z3;
        C0292f c0292f;
        C0292f f2;
        ArrayList arrayList;
        if (this.f3533j + 1 >= this.f3534k || this.i + 1 >= this.f3530e) {
            o();
        }
        if (c0288b.f3524e) {
            z2 = false;
        } else {
            if (this.f3531f.length != 0) {
                boolean z4 = false;
                while (!z4) {
                    int d = c0288b.d.d();
                    int i = 0;
                    while (true) {
                        arrayList = c0288b.f3523c;
                        if (i >= d) {
                            break;
                        }
                        C0292f e2 = c0288b.d.e(i);
                        if (e2.f3544c != -1 || e2.f3546f) {
                            arrayList.add(e2);
                        }
                        i++;
                    }
                    int size = arrayList.size();
                    if (size > 0) {
                        for (int i2 = 0; i2 < size; i2++) {
                            C0292f c0292f2 = (C0292f) arrayList.get(i2);
                            if (c0292f2.f3546f) {
                                c0288b.h(this, c0292f2, true);
                            } else {
                                c0288b.i(this, this.f3531f[c0292f2.f3544c], true);
                            }
                        }
                        arrayList.clear();
                    } else {
                        z4 = true;
                    }
                }
                if (c0288b.f3521a != null && c0288b.d.d() == 0) {
                    c0288b.f3524e = true;
                    this.f3527a = true;
                }
            }
            if (c0288b.e()) {
                return;
            }
            float f3 = c0288b.f3522b;
            if (f3 < 0.0f) {
                c0288b.f3522b = f3 * (-1.0f);
                C0287a c0287a = c0288b.d;
                int i3 = c0287a.h;
                for (int i4 = 0; i3 != -1 && i4 < c0287a.f3514a; i4++) {
                    float[] fArr = c0287a.f3519g;
                    fArr[i3] = fArr[i3] * (-1.0f);
                    i3 = c0287a.f3518f[i3];
                }
            }
            int d2 = c0288b.d.d();
            float f4 = 0.0f;
            float f5 = 0.0f;
            C0292f c0292f3 = null;
            C0292f c0292f4 = null;
            boolean z5 = false;
            boolean z6 = false;
            for (int i5 = 0; i5 < d2; i5++) {
                float f6 = c0288b.d.f(i5);
                C0292f e3 = c0288b.d.e(i5);
                if (e3.f3550l == 1) {
                    if (c0292f3 != null) {
                        if (f4 <= f6) {
                            if (!z5) {
                                if (e3.f3549k > 1) {
                                }
                            }
                        }
                        z5 = true;
                    }
                    c0292f3 = e3;
                    f4 = f6;
                } else if (c0292f3 == null && f6 < 0.0f) {
                    if (c0292f4 != null) {
                        if (f5 <= f6) {
                            if (!z6) {
                                if (e3.f3549k > 1) {
                                }
                            }
                        }
                        z6 = true;
                    }
                    c0292f4 = e3;
                    f5 = f6;
                }
            }
            if (c0292f3 == null) {
                c0292f3 = c0292f4;
            }
            if (c0292f3 == null) {
                z3 = true;
            } else {
                c0288b.g(c0292f3);
                z3 = false;
            }
            if (c0288b.d.d() == 0) {
                c0288b.f3524e = true;
            }
            if (z3) {
                if (this.i + 1 >= this.f3530e) {
                    o();
                }
                C0292f a2 = a(3);
                int i6 = this.f3528b + 1;
                this.f3528b = i6;
                this.i++;
                a2.f3543b = i6;
                C0012l c0012l = this.f3535l;
                ((C0292f[]) c0012l.d)[i6] = a2;
                c0288b.f3521a = a2;
                int i7 = this.f3533j;
                h(c0288b);
                if (this.f3533j == i7 + 1) {
                    C0288b c0288b2 = this.f3538o;
                    c0288b2.f3521a = null;
                    c0288b2.d.b();
                    for (int i8 = 0; i8 < c0288b.d.d(); i8++) {
                        c0288b2.d.a(c0288b.d.e(i8), c0288b.d.f(i8), true);
                    }
                    r(this.f3538o);
                    if (a2.f3544c == -1) {
                        if (c0288b.f3521a == a2 && (f2 = c0288b.f(null, a2)) != null) {
                            c0288b.g(f2);
                        }
                        if (!c0288b.f3524e) {
                            c0288b.f3521a.e(this, c0288b);
                        }
                        ((J.b) c0012l.f431b).b(c0288b);
                        this.f3533j--;
                    }
                    z2 = true;
                    c0292f = c0288b.f3521a;
                    if (c0292f != null) {
                        return;
                    }
                    if (c0292f.f3550l != 1 && c0288b.f3522b < 0.0f) {
                        return;
                    }
                }
            }
            z2 = false;
            c0292f = c0288b.f3521a;
            if (c0292f != null) {
            }
        }
        if (z2) {
            return;
        }
        h(c0288b);
    }

    public final void d(C0292f c0292f, int i) {
        int i2 = c0292f.f3544c;
        if (i2 == -1) {
            c0292f.d(this, i);
            for (int i3 = 0; i3 < this.f3528b + 1; i3++) {
                C0292f c0292f2 = ((C0292f[]) this.f3535l.d)[i3];
            }
            return;
        }
        if (i2 == -1) {
            C0288b l2 = l();
            l2.f3521a = c0292f;
            float f2 = i;
            c0292f.f3545e = f2;
            l2.f3522b = f2;
            l2.f3524e = true;
            c(l2);
            return;
        }
        C0288b c0288b = this.f3531f[i2];
        if (c0288b.f3524e) {
            c0288b.f3522b = i;
            return;
        }
        if (c0288b.d.d() == 0) {
            c0288b.f3524e = true;
            c0288b.f3522b = i;
            return;
        }
        C0288b l3 = l();
        if (i < 0) {
            l3.f3522b = i * (-1);
            l3.d.g(c0292f, 1.0f);
        } else {
            l3.f3522b = i;
            l3.d.g(c0292f, -1.0f);
        }
        c(l3);
    }

    public final void e(C0292f c0292f, C0292f c0292f2, int i, int i2) {
        if (i2 == 8 && c0292f2.f3546f && c0292f.f3544c == -1) {
            c0292f.d(this, c0292f2.f3545e + i);
            return;
        }
        C0288b l2 = l();
        boolean z2 = false;
        if (i != 0) {
            if (i < 0) {
                i *= -1;
                z2 = true;
            }
            l2.f3522b = i;
        }
        if (z2) {
            l2.d.g(c0292f, 1.0f);
            l2.d.g(c0292f2, -1.0f);
        } else {
            l2.d.g(c0292f, -1.0f);
            l2.d.g(c0292f2, 1.0f);
        }
        if (i2 != 8) {
            l2.a(this, i2);
        }
        c(l2);
    }

    public final void f(C0292f c0292f, C0292f c0292f2, int i, int i2) {
        C0288b l2 = l();
        C0292f m2 = m();
        m2.d = 0;
        l2.b(c0292f, c0292f2, m2, i);
        if (i2 != 8) {
            l2.d.g(j(i2), (int) (l2.d.c(m2) * (-1.0f)));
        }
        c(l2);
    }

    public final void g(C0292f c0292f, C0292f c0292f2, int i, int i2) {
        C0288b l2 = l();
        C0292f m2 = m();
        m2.d = 0;
        l2.c(c0292f, c0292f2, m2, i);
        if (i2 != 8) {
            l2.d.g(j(i2), (int) (l2.d.c(m2) * (-1.0f)));
        }
        c(l2);
    }

    public final void h(C0288b c0288b) {
        int i;
        if (c0288b.f3524e) {
            c0288b.f3521a.d(this, c0288b.f3522b);
        } else {
            C0288b[] c0288bArr = this.f3531f;
            int i2 = this.f3533j;
            c0288bArr[i2] = c0288b;
            C0292f c0292f = c0288b.f3521a;
            c0292f.f3544c = i2;
            this.f3533j = i2 + 1;
            c0292f.e(this, c0288b);
        }
        if (this.f3527a) {
            int i3 = 0;
            while (i3 < this.f3533j) {
                if (this.f3531f[i3] == null) {
                    System.out.println("WTF");
                }
                C0288b c0288b2 = this.f3531f[i3];
                if (c0288b2 != null && c0288b2.f3524e) {
                    c0288b2.f3521a.d(this, c0288b2.f3522b);
                    ((J.b) this.f3535l.f431b).b(c0288b2);
                    this.f3531f[i3] = null;
                    int i4 = i3 + 1;
                    int i5 = i4;
                    while (true) {
                        i = this.f3533j;
                        if (i4 >= i) {
                            break;
                        }
                        C0288b[] c0288bArr2 = this.f3531f;
                        int i6 = i4 - 1;
                        C0288b c0288b3 = c0288bArr2[i4];
                        c0288bArr2[i6] = c0288b3;
                        C0292f c0292f2 = c0288b3.f3521a;
                        if (c0292f2.f3544c == i4) {
                            c0292f2.f3544c = i6;
                        }
                        i5 = i4;
                        i4++;
                    }
                    if (i5 < i) {
                        this.f3531f[i5] = null;
                    }
                    this.f3533j = i - 1;
                    i3--;
                }
                i3++;
            }
            this.f3527a = false;
        }
    }

    public final void i() {
        for (int i = 0; i < this.f3533j; i++) {
            C0288b c0288b = this.f3531f[i];
            c0288b.f3521a.f3545e = c0288b.f3522b;
        }
    }

    public final C0292f j(int i) {
        if (this.i + 1 >= this.f3530e) {
            o();
        }
        C0292f a2 = a(4);
        int i2 = this.f3528b + 1;
        this.f3528b = i2;
        this.i++;
        a2.f3543b = i2;
        a2.d = i;
        ((C0292f[]) this.f3535l.d)[i2] = a2;
        C0290d c0290d = this.f3529c;
        c0290d.i.f30b = a2;
        float[] fArr = a2.h;
        Arrays.fill(fArr, 0.0f);
        fArr[a2.d] = 1.0f;
        c0290d.j(a2);
        return a2;
    }

    public final C0292f k(Object obj) {
        C0292f c0292f = null;
        if (obj == null) {
            return null;
        }
        if (this.i + 1 >= this.f3530e) {
            o();
        }
        if (obj instanceof C0298c) {
            C0298c c0298c = (C0298c) obj;
            c0292f = c0298c.i;
            if (c0292f == null) {
                c0298c.k();
                c0292f = c0298c.i;
            }
            int i = c0292f.f3543b;
            C0012l c0012l = this.f3535l;
            if (i == -1 || i > this.f3528b || ((C0292f[]) c0012l.d)[i] == null) {
                if (i != -1) {
                    c0292f.c();
                }
                int i2 = this.f3528b + 1;
                this.f3528b = i2;
                this.i++;
                c0292f.f3543b = i2;
                c0292f.f3550l = 1;
                ((C0292f[]) c0012l.d)[i2] = c0292f;
            }
        }
        return c0292f;
    }

    public final C0288b l() {
        Object obj;
        C0012l c0012l = this.f3535l;
        J.b bVar = (J.b) c0012l.f431b;
        int i = bVar.f353b;
        if (i > 0) {
            int i2 = i - 1;
            Object[] objArr = bVar.f352a;
            obj = objArr[i2];
            objArr[i2] = null;
            bVar.f353b = i2;
        } else {
            obj = null;
        }
        C0288b c0288b = (C0288b) obj;
        if (c0288b == null) {
            return new C0288b(c0012l);
        }
        c0288b.f3521a = null;
        c0288b.d.b();
        c0288b.f3522b = 0.0f;
        c0288b.f3524e = false;
        return c0288b;
    }

    public final C0292f m() {
        if (this.i + 1 >= this.f3530e) {
            o();
        }
        C0292f a2 = a(3);
        int i = this.f3528b + 1;
        this.f3528b = i;
        this.i++;
        a2.f3543b = i;
        ((C0292f[]) this.f3535l.d)[i] = a2;
        return a2;
    }

    public final void o() {
        int i = this.d * 2;
        this.d = i;
        this.f3531f = (C0288b[]) Arrays.copyOf(this.f3531f, i);
        C0012l c0012l = this.f3535l;
        c0012l.d = (C0292f[]) Arrays.copyOf((C0292f[]) c0012l.d, this.d);
        int i2 = this.d;
        this.h = new boolean[i2];
        this.f3530e = i2;
        this.f3534k = i2;
    }

    public final void p() {
        C0290d c0290d = this.f3529c;
        if (c0290d.e()) {
            i();
            return;
        }
        if (!this.f3532g) {
            q(c0290d);
            return;
        }
        for (int i = 0; i < this.f3533j; i++) {
            if (!this.f3531f[i].f3524e) {
                q(c0290d);
                return;
            }
        }
        i();
    }

    public final void q(C0290d c0290d) {
        int i = 0;
        while (true) {
            if (i >= this.f3533j) {
                break;
            }
            C0288b c0288b = this.f3531f[i];
            int i2 = 1;
            if (c0288b.f3521a.f3550l != 1) {
                float f2 = 0.0f;
                if (c0288b.f3522b < 0.0f) {
                    boolean z2 = false;
                    int i3 = 0;
                    while (!z2) {
                        i3 += i2;
                        float f3 = Float.MAX_VALUE;
                        int i4 = -1;
                        int i5 = -1;
                        int i6 = 0;
                        int i7 = 0;
                        while (i6 < this.f3533j) {
                            C0288b c0288b2 = this.f3531f[i6];
                            if (c0288b2.f3521a.f3550l != i2 && !c0288b2.f3524e && c0288b2.f3522b < f2) {
                                int d = c0288b2.d.d();
                                int i8 = 0;
                                while (i8 < d) {
                                    C0292f e2 = c0288b2.d.e(i8);
                                    float c2 = c0288b2.d.c(e2);
                                    if (c2 > f2) {
                                        for (int i9 = 0; i9 < 9; i9++) {
                                            float f4 = e2.f3547g[i9] / c2;
                                            if ((f4 < f3 && i9 == i7) || i9 > i7) {
                                                i7 = i9;
                                                i5 = e2.f3543b;
                                                i4 = i6;
                                                f3 = f4;
                                            }
                                        }
                                    }
                                    i8++;
                                    f2 = 0.0f;
                                }
                            }
                            i6++;
                            f2 = 0.0f;
                            i2 = 1;
                        }
                        if (i4 != -1) {
                            C0288b c0288b3 = this.f3531f[i4];
                            c0288b3.f3521a.f3544c = -1;
                            c0288b3.g(((C0292f[]) this.f3535l.d)[i5]);
                            C0292f c0292f = c0288b3.f3521a;
                            c0292f.f3544c = i4;
                            c0292f.e(this, c0288b3);
                        } else {
                            z2 = true;
                        }
                        if (i3 > this.i / 2) {
                            z2 = true;
                        }
                        f2 = 0.0f;
                        i2 = 1;
                    }
                }
            }
            i++;
        }
        r(c0290d);
        i();
    }

    public final void r(C0288b c0288b) {
        boolean z2;
        int i = 0;
        for (int i2 = 0; i2 < this.i; i2++) {
            this.h[i2] = false;
        }
        boolean z3 = false;
        int i3 = 0;
        while (!z3) {
            int i4 = 1;
            i3++;
            if (i3 >= this.i * 2) {
                return;
            }
            C0292f c0292f = c0288b.f3521a;
            if (c0292f != null) {
                this.h[c0292f.f3543b] = true;
            }
            C0292f d = c0288b.d(this.h);
            if (d != null) {
                boolean[] zArr = this.h;
                int i5 = d.f3543b;
                if (zArr[i5]) {
                    return;
                } else {
                    zArr[i5] = true;
                }
            }
            if (d != null) {
                float f2 = Float.MAX_VALUE;
                int i6 = i;
                int i7 = -1;
                while (i6 < this.f3533j) {
                    C0288b c0288b2 = this.f3531f[i6];
                    if (c0288b2.f3521a.f3550l != i4 && !c0288b2.f3524e) {
                        C0287a c0287a = c0288b2.d;
                        int i8 = c0287a.h;
                        if (i8 != -1) {
                            for (int i9 = 0; i8 != -1 && i9 < c0287a.f3514a; i9++) {
                                if (c0287a.f3517e[i8] == d.f3543b) {
                                    z2 = true;
                                    break;
                                }
                                i8 = c0287a.f3518f[i8];
                            }
                        }
                        z2 = false;
                        if (z2) {
                            float c2 = c0288b2.d.c(d);
                            if (c2 < 0.0f) {
                                float f3 = (-c0288b2.f3522b) / c2;
                                if (f3 < f2) {
                                    f2 = f3;
                                    i7 = i6;
                                }
                            }
                        }
                    }
                    i6++;
                    i4 = 1;
                }
                if (i7 > -1) {
                    C0288b c0288b3 = this.f3531f[i7];
                    c0288b3.f3521a.f3544c = -1;
                    c0288b3.g(d);
                    C0292f c0292f2 = c0288b3.f3521a;
                    c0292f2.f3544c = i7;
                    c0292f2.e(this, c0288b3);
                }
            } else {
                z3 = true;
            }
            i = 0;
        }
    }

    public final void s() {
        for (int i = 0; i < this.f3533j; i++) {
            C0288b c0288b = this.f3531f[i];
            if (c0288b != null) {
                ((J.b) this.f3535l.f431b).b(c0288b);
            }
            this.f3531f[i] = null;
        }
    }

    public final void t() {
        C0012l c0012l;
        int i = 0;
        while (true) {
            c0012l = this.f3535l;
            C0292f[] c0292fArr = (C0292f[]) c0012l.d;
            if (i >= c0292fArr.length) {
                break;
            }
            C0292f c0292f = c0292fArr[i];
            if (c0292f != null) {
                c0292f.c();
            }
            i++;
        }
        J.b bVar = (J.b) c0012l.f432c;
        C0292f[] c0292fArr2 = this.f3536m;
        int i2 = this.f3537n;
        bVar.getClass();
        if (i2 > c0292fArr2.length) {
            i2 = c0292fArr2.length;
        }
        for (int i3 = 0; i3 < i2; i3++) {
            C0292f c0292f2 = c0292fArr2[i3];
            int i4 = bVar.f353b;
            Object[] objArr = bVar.f352a;
            if (i4 < objArr.length) {
                objArr[i4] = c0292f2;
                bVar.f353b = i4 + 1;
            }
        }
        this.f3537n = 0;
        Arrays.fill((C0292f[]) c0012l.d, (Object) null);
        this.f3528b = 0;
        C0290d c0290d = this.f3529c;
        c0290d.h = 0;
        c0290d.f3522b = 0.0f;
        this.i = 1;
        for (int i5 = 0; i5 < this.f3533j; i5++) {
            C0288b c0288b = this.f3531f[i5];
        }
        s();
        this.f3533j = 0;
        this.f3538o = new C0288b(c0012l);
    }
}
