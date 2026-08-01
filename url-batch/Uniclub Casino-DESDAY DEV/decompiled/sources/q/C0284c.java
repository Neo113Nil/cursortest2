package q;

import B.j;
import K.C0011l;
import java.util.ArrayList;
import java.util.Arrays;
import s.C0295c;

/* renamed from: q.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0284c {

    /* renamed from: p, reason: collision with root package name */
    public static boolean f3524p = false;

    /* renamed from: q, reason: collision with root package name */
    public static int f3525q = 1000;

    /* renamed from: c, reason: collision with root package name */
    public final C0285d f3528c;

    /* renamed from: f, reason: collision with root package name */
    public C0283b[] f3530f;

    /* renamed from: l, reason: collision with root package name */
    public final C0011l f3534l;

    /* renamed from: o, reason: collision with root package name */
    public C0283b f3537o;

    /* renamed from: a, reason: collision with root package name */
    public boolean f3526a = false;

    /* renamed from: b, reason: collision with root package name */
    public int f3527b = 0;
    public int d = 32;

    /* renamed from: e, reason: collision with root package name */
    public int f3529e = 32;

    /* renamed from: g, reason: collision with root package name */
    public boolean f3531g = false;
    public boolean[] h = new boolean[32];
    public int i = 1;

    /* renamed from: j, reason: collision with root package name */
    public int f3532j = 0;

    /* renamed from: k, reason: collision with root package name */
    public int f3533k = 32;

    /* renamed from: m, reason: collision with root package name */
    public C0287f[] f3535m = new C0287f[f3525q];

    /* renamed from: n, reason: collision with root package name */
    public int f3536n = 0;

    public C0284c() {
        this.f3530f = null;
        this.f3530f = new C0283b[32];
        s();
        C0011l c0011l = new C0011l();
        c0011l.f413b = new J.b();
        c0011l.f414c = new J.b();
        c0011l.d = new C0287f[32];
        this.f3534l = c0011l;
        C0285d c0285d = new C0285d(c0011l);
        c0285d.f3538f = new C0287f[128];
        c0285d.f3539g = new C0287f[128];
        c0285d.h = 0;
        c0285d.i = new j(c0285d);
        this.f3528c = c0285d;
        this.f3537o = new C0283b(c0011l);
    }

    public static int n(Object obj) {
        C0287f c0287f = ((C0295c) obj).i;
        if (c0287f != null) {
            return (int) (c0287f.f3544e + 0.5f);
        }
        return 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r4v0 */
    public final C0287f a(int i) {
        J.b bVar = (J.b) this.f3534l.f414c;
        int i2 = bVar.f259b;
        C0287f c0287f = null;
        if (i2 > 0) {
            int i3 = i2 - 1;
            ?? r3 = bVar.f258a;
            ?? r4 = r3[i3];
            r3[i3] = 0;
            bVar.f259b = i3;
            c0287f = r4;
        }
        C0287f c0287f2 = c0287f;
        if (c0287f2 == null) {
            c0287f2 = new C0287f(i);
            c0287f2.f3549l = i;
        } else {
            c0287f2.c();
            c0287f2.f3549l = i;
        }
        int i4 = this.f3536n;
        int i5 = f3525q;
        if (i4 >= i5) {
            int i6 = i5 * 2;
            f3525q = i6;
            this.f3535m = (C0287f[]) Arrays.copyOf(this.f3535m, i6);
        }
        C0287f[] c0287fArr = this.f3535m;
        int i7 = this.f3536n;
        this.f3536n = i7 + 1;
        c0287fArr[i7] = c0287f2;
        return c0287f2;
    }

    public final void b(C0287f c0287f, C0287f c0287f2, int i, float f2, C0287f c0287f3, C0287f c0287f4, int i2, int i3) {
        C0283b l2 = l();
        if (c0287f2 == c0287f3) {
            l2.d.g(c0287f, 1.0f);
            l2.d.g(c0287f4, 1.0f);
            l2.d.g(c0287f2, -2.0f);
        } else if (f2 == 0.5f) {
            l2.d.g(c0287f, 1.0f);
            l2.d.g(c0287f2, -1.0f);
            l2.d.g(c0287f3, -1.0f);
            l2.d.g(c0287f4, 1.0f);
            if (i > 0 || i2 > 0) {
                l2.f3521b = (-i) + i2;
            }
        } else if (f2 <= 0.0f) {
            l2.d.g(c0287f, -1.0f);
            l2.d.g(c0287f2, 1.0f);
            l2.f3521b = i;
        } else if (f2 >= 1.0f) {
            l2.d.g(c0287f4, -1.0f);
            l2.d.g(c0287f3, 1.0f);
            l2.f3521b = -i2;
        } else {
            float f3 = 1.0f - f2;
            l2.d.g(c0287f, f3 * 1.0f);
            l2.d.g(c0287f2, f3 * (-1.0f));
            l2.d.g(c0287f3, (-1.0f) * f2);
            l2.d.g(c0287f4, 1.0f * f2);
            if (i > 0 || i2 > 0) {
                l2.f3521b = (i2 * f2) + ((-i) * f3);
            }
        }
        if (i3 != 8) {
            l2.a(this, i3);
        }
        c(l2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:68:0x00d0, code lost:
    
        if (r4.f3548k <= 1) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x00d3, code lost:
    
        r12 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x00dd, code lost:
    
        if (r4.f3548k <= 1) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x00f2, code lost:
    
        if (r4.f3548k <= 1) goto L87;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x00f5, code lost:
    
        r14 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x00ff, code lost:
    
        if (r4.f3548k <= 1) goto L87;
     */
    /* JADX WARN: Removed duplicated region for block: B:137:0x01ae  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x01b9 A[ORIG_RETURN, RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void c(C0283b c0283b) {
        boolean z2;
        boolean z3;
        C0287f c0287f;
        C0287f f2;
        ArrayList arrayList;
        if (this.f3532j + 1 >= this.f3533k || this.i + 1 >= this.f3529e) {
            o();
        }
        if (c0283b.f3523e) {
            z2 = false;
        } else {
            if (this.f3530f.length != 0) {
                boolean z4 = false;
                while (!z4) {
                    int d = c0283b.d.d();
                    int i = 0;
                    while (true) {
                        arrayList = c0283b.f3522c;
                        if (i >= d) {
                            break;
                        }
                        C0287f e2 = c0283b.d.e(i);
                        if (e2.f3543c != -1 || e2.f3545f) {
                            arrayList.add(e2);
                        }
                        i++;
                    }
                    int size = arrayList.size();
                    if (size > 0) {
                        for (int i2 = 0; i2 < size; i2++) {
                            C0287f c0287f2 = (C0287f) arrayList.get(i2);
                            if (c0287f2.f3545f) {
                                c0283b.h(this, c0287f2, true);
                            } else {
                                c0283b.i(this, this.f3530f[c0287f2.f3543c], true);
                            }
                        }
                        arrayList.clear();
                    } else {
                        z4 = true;
                    }
                }
                if (c0283b.f3520a != null && c0283b.d.d() == 0) {
                    c0283b.f3523e = true;
                    this.f3526a = true;
                }
            }
            if (c0283b.e()) {
                return;
            }
            float f3 = c0283b.f3521b;
            if (f3 < 0.0f) {
                c0283b.f3521b = f3 * (-1.0f);
                C0282a c0282a = c0283b.d;
                int i3 = c0282a.h;
                for (int i4 = 0; i3 != -1 && i4 < c0282a.f3513a; i4++) {
                    float[] fArr = c0282a.f3518g;
                    fArr[i3] = fArr[i3] * (-1.0f);
                    i3 = c0282a.f3517f[i3];
                }
            }
            int d2 = c0283b.d.d();
            float f4 = 0.0f;
            float f5 = 0.0f;
            C0287f c0287f3 = null;
            C0287f c0287f4 = null;
            boolean z5 = false;
            boolean z6 = false;
            for (int i5 = 0; i5 < d2; i5++) {
                float f6 = c0283b.d.f(i5);
                C0287f e3 = c0283b.d.e(i5);
                if (e3.f3549l == 1) {
                    if (c0287f3 != null) {
                        if (f4 <= f6) {
                            if (!z5) {
                                if (e3.f3548k > 1) {
                                }
                            }
                        }
                        z5 = true;
                    }
                    c0287f3 = e3;
                    f4 = f6;
                } else if (c0287f3 == null && f6 < 0.0f) {
                    if (c0287f4 != null) {
                        if (f5 <= f6) {
                            if (!z6) {
                                if (e3.f3548k > 1) {
                                }
                            }
                        }
                        z6 = true;
                    }
                    c0287f4 = e3;
                    f5 = f6;
                }
            }
            if (c0287f3 == null) {
                c0287f3 = c0287f4;
            }
            if (c0287f3 == null) {
                z3 = true;
            } else {
                c0283b.g(c0287f3);
                z3 = false;
            }
            if (c0283b.d.d() == 0) {
                c0283b.f3523e = true;
            }
            if (z3) {
                if (this.i + 1 >= this.f3529e) {
                    o();
                }
                C0287f a2 = a(3);
                int i6 = this.f3527b + 1;
                this.f3527b = i6;
                this.i++;
                a2.f3542b = i6;
                C0011l c0011l = this.f3534l;
                ((C0287f[]) c0011l.d)[i6] = a2;
                c0283b.f3520a = a2;
                int i7 = this.f3532j;
                h(c0283b);
                if (this.f3532j == i7 + 1) {
                    C0283b c0283b2 = this.f3537o;
                    c0283b2.f3520a = null;
                    c0283b2.d.b();
                    for (int i8 = 0; i8 < c0283b.d.d(); i8++) {
                        c0283b2.d.a(c0283b.d.e(i8), c0283b.d.f(i8), true);
                    }
                    r(this.f3537o);
                    if (a2.f3543c == -1) {
                        if (c0283b.f3520a == a2 && (f2 = c0283b.f(null, a2)) != null) {
                            c0283b.g(f2);
                        }
                        if (!c0283b.f3523e) {
                            c0283b.f3520a.e(this, c0283b);
                        }
                        ((J.b) c0011l.f413b).b(c0283b);
                        this.f3532j--;
                    }
                    z2 = true;
                    c0287f = c0283b.f3520a;
                    if (c0287f != null) {
                        return;
                    }
                    if (c0287f.f3549l != 1 && c0283b.f3521b < 0.0f) {
                        return;
                    }
                }
            }
            z2 = false;
            c0287f = c0283b.f3520a;
            if (c0287f != null) {
            }
        }
        if (z2) {
            return;
        }
        h(c0283b);
    }

    public final void d(C0287f c0287f, int i) {
        int i2 = c0287f.f3543c;
        if (i2 == -1) {
            c0287f.d(this, i);
            for (int i3 = 0; i3 < this.f3527b + 1; i3++) {
                C0287f c0287f2 = ((C0287f[]) this.f3534l.d)[i3];
            }
            return;
        }
        if (i2 == -1) {
            C0283b l2 = l();
            l2.f3520a = c0287f;
            float f2 = i;
            c0287f.f3544e = f2;
            l2.f3521b = f2;
            l2.f3523e = true;
            c(l2);
            return;
        }
        C0283b c0283b = this.f3530f[i2];
        if (c0283b.f3523e) {
            c0283b.f3521b = i;
            return;
        }
        if (c0283b.d.d() == 0) {
            c0283b.f3523e = true;
            c0283b.f3521b = i;
            return;
        }
        C0283b l3 = l();
        if (i < 0) {
            l3.f3521b = i * (-1);
            l3.d.g(c0287f, 1.0f);
        } else {
            l3.f3521b = i;
            l3.d.g(c0287f, -1.0f);
        }
        c(l3);
    }

    public final void e(C0287f c0287f, C0287f c0287f2, int i, int i2) {
        if (i2 == 8 && c0287f2.f3545f && c0287f.f3543c == -1) {
            c0287f.d(this, c0287f2.f3544e + i);
            return;
        }
        C0283b l2 = l();
        boolean z2 = false;
        if (i != 0) {
            if (i < 0) {
                i *= -1;
                z2 = true;
            }
            l2.f3521b = i;
        }
        if (z2) {
            l2.d.g(c0287f, 1.0f);
            l2.d.g(c0287f2, -1.0f);
        } else {
            l2.d.g(c0287f, -1.0f);
            l2.d.g(c0287f2, 1.0f);
        }
        if (i2 != 8) {
            l2.a(this, i2);
        }
        c(l2);
    }

    public final void f(C0287f c0287f, C0287f c0287f2, int i, int i2) {
        C0283b l2 = l();
        C0287f m2 = m();
        m2.d = 0;
        l2.b(c0287f, c0287f2, m2, i);
        if (i2 != 8) {
            l2.d.g(j(i2), (int) (l2.d.c(m2) * (-1.0f)));
        }
        c(l2);
    }

    public final void g(C0287f c0287f, C0287f c0287f2, int i, int i2) {
        C0283b l2 = l();
        C0287f m2 = m();
        m2.d = 0;
        l2.c(c0287f, c0287f2, m2, i);
        if (i2 != 8) {
            l2.d.g(j(i2), (int) (l2.d.c(m2) * (-1.0f)));
        }
        c(l2);
    }

    public final void h(C0283b c0283b) {
        int i;
        if (c0283b.f3523e) {
            c0283b.f3520a.d(this, c0283b.f3521b);
        } else {
            C0283b[] c0283bArr = this.f3530f;
            int i2 = this.f3532j;
            c0283bArr[i2] = c0283b;
            C0287f c0287f = c0283b.f3520a;
            c0287f.f3543c = i2;
            this.f3532j = i2 + 1;
            c0287f.e(this, c0283b);
        }
        if (this.f3526a) {
            int i3 = 0;
            while (i3 < this.f3532j) {
                if (this.f3530f[i3] == null) {
                    System.out.println("WTF");
                }
                C0283b c0283b2 = this.f3530f[i3];
                if (c0283b2 != null && c0283b2.f3523e) {
                    c0283b2.f3520a.d(this, c0283b2.f3521b);
                    ((J.b) this.f3534l.f413b).b(c0283b2);
                    this.f3530f[i3] = null;
                    int i4 = i3 + 1;
                    int i5 = i4;
                    while (true) {
                        i = this.f3532j;
                        if (i4 >= i) {
                            break;
                        }
                        C0283b[] c0283bArr2 = this.f3530f;
                        int i6 = i4 - 1;
                        C0283b c0283b3 = c0283bArr2[i4];
                        c0283bArr2[i6] = c0283b3;
                        C0287f c0287f2 = c0283b3.f3520a;
                        if (c0287f2.f3543c == i4) {
                            c0287f2.f3543c = i6;
                        }
                        i5 = i4;
                        i4++;
                    }
                    if (i5 < i) {
                        this.f3530f[i5] = null;
                    }
                    this.f3532j = i - 1;
                    i3--;
                }
                i3++;
            }
            this.f3526a = false;
        }
    }

    public final void i() {
        for (int i = 0; i < this.f3532j; i++) {
            C0283b c0283b = this.f3530f[i];
            c0283b.f3520a.f3544e = c0283b.f3521b;
        }
    }

    public final C0287f j(int i) {
        if (this.i + 1 >= this.f3529e) {
            o();
        }
        C0287f a2 = a(4);
        int i2 = this.f3527b + 1;
        this.f3527b = i2;
        this.i++;
        a2.f3542b = i2;
        a2.d = i;
        ((C0287f[]) this.f3534l.d)[i2] = a2;
        C0285d c0285d = this.f3528c;
        c0285d.i.f28b = a2;
        float[] fArr = a2.h;
        Arrays.fill(fArr, 0.0f);
        fArr[a2.d] = 1.0f;
        c0285d.j(a2);
        return a2;
    }

    public final C0287f k(Object obj) {
        C0287f c0287f = null;
        if (obj == null) {
            return null;
        }
        if (this.i + 1 >= this.f3529e) {
            o();
        }
        if (obj instanceof C0295c) {
            C0295c c0295c = (C0295c) obj;
            c0287f = c0295c.i;
            if (c0287f == null) {
                c0295c.k();
                c0287f = c0295c.i;
            }
            int i = c0287f.f3542b;
            C0011l c0011l = this.f3534l;
            if (i == -1 || i > this.f3527b || ((C0287f[]) c0011l.d)[i] == null) {
                if (i != -1) {
                    c0287f.c();
                }
                int i2 = this.f3527b + 1;
                this.f3527b = i2;
                this.i++;
                c0287f.f3542b = i2;
                c0287f.f3549l = 1;
                ((C0287f[]) c0011l.d)[i2] = c0287f;
            }
        }
        return c0287f;
    }

    public final C0283b l() {
        Object obj;
        C0011l c0011l = this.f3534l;
        J.b bVar = (J.b) c0011l.f413b;
        int i = bVar.f259b;
        if (i > 0) {
            int i2 = i - 1;
            Object[] objArr = bVar.f258a;
            obj = objArr[i2];
            objArr[i2] = null;
            bVar.f259b = i2;
        } else {
            obj = null;
        }
        C0283b c0283b = (C0283b) obj;
        if (c0283b == null) {
            return new C0283b(c0011l);
        }
        c0283b.f3520a = null;
        c0283b.d.b();
        c0283b.f3521b = 0.0f;
        c0283b.f3523e = false;
        return c0283b;
    }

    public final C0287f m() {
        if (this.i + 1 >= this.f3529e) {
            o();
        }
        C0287f a2 = a(3);
        int i = this.f3527b + 1;
        this.f3527b = i;
        this.i++;
        a2.f3542b = i;
        ((C0287f[]) this.f3534l.d)[i] = a2;
        return a2;
    }

    public final void o() {
        int i = this.d * 2;
        this.d = i;
        this.f3530f = (C0283b[]) Arrays.copyOf(this.f3530f, i);
        C0011l c0011l = this.f3534l;
        c0011l.d = (C0287f[]) Arrays.copyOf((C0287f[]) c0011l.d, this.d);
        int i2 = this.d;
        this.h = new boolean[i2];
        this.f3529e = i2;
        this.f3533k = i2;
    }

    public final void p() {
        C0285d c0285d = this.f3528c;
        if (c0285d.e()) {
            i();
            return;
        }
        if (!this.f3531g) {
            q(c0285d);
            return;
        }
        for (int i = 0; i < this.f3532j; i++) {
            if (!this.f3530f[i].f3523e) {
                q(c0285d);
                return;
            }
        }
        i();
    }

    public final void q(C0285d c0285d) {
        int i = 0;
        while (true) {
            if (i >= this.f3532j) {
                break;
            }
            C0283b c0283b = this.f3530f[i];
            int i2 = 1;
            if (c0283b.f3520a.f3549l != 1) {
                float f2 = 0.0f;
                if (c0283b.f3521b < 0.0f) {
                    boolean z2 = false;
                    int i3 = 0;
                    while (!z2) {
                        i3 += i2;
                        float f3 = Float.MAX_VALUE;
                        int i4 = -1;
                        int i5 = -1;
                        int i6 = 0;
                        int i7 = 0;
                        while (i6 < this.f3532j) {
                            C0283b c0283b2 = this.f3530f[i6];
                            if (c0283b2.f3520a.f3549l != i2 && !c0283b2.f3523e && c0283b2.f3521b < f2) {
                                int d = c0283b2.d.d();
                                int i8 = 0;
                                while (i8 < d) {
                                    C0287f e2 = c0283b2.d.e(i8);
                                    float c2 = c0283b2.d.c(e2);
                                    if (c2 > f2) {
                                        for (int i9 = 0; i9 < 9; i9++) {
                                            float f4 = e2.f3546g[i9] / c2;
                                            if ((f4 < f3 && i9 == i7) || i9 > i7) {
                                                i7 = i9;
                                                i5 = e2.f3542b;
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
                            C0283b c0283b3 = this.f3530f[i4];
                            c0283b3.f3520a.f3543c = -1;
                            c0283b3.g(((C0287f[]) this.f3534l.d)[i5]);
                            C0287f c0287f = c0283b3.f3520a;
                            c0287f.f3543c = i4;
                            c0287f.e(this, c0283b3);
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
        r(c0285d);
        i();
    }

    public final void r(C0283b c0283b) {
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
            C0287f c0287f = c0283b.f3520a;
            if (c0287f != null) {
                this.h[c0287f.f3542b] = true;
            }
            C0287f d = c0283b.d(this.h);
            if (d != null) {
                boolean[] zArr = this.h;
                int i5 = d.f3542b;
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
                while (i6 < this.f3532j) {
                    C0283b c0283b2 = this.f3530f[i6];
                    if (c0283b2.f3520a.f3549l != i4 && !c0283b2.f3523e) {
                        C0282a c0282a = c0283b2.d;
                        int i8 = c0282a.h;
                        if (i8 != -1) {
                            for (int i9 = 0; i8 != -1 && i9 < c0282a.f3513a; i9++) {
                                if (c0282a.f3516e[i8] == d.f3542b) {
                                    z2 = true;
                                    break;
                                }
                                i8 = c0282a.f3517f[i8];
                            }
                        }
                        z2 = false;
                        if (z2) {
                            float c2 = c0283b2.d.c(d);
                            if (c2 < 0.0f) {
                                float f3 = (-c0283b2.f3521b) / c2;
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
                    C0283b c0283b3 = this.f3530f[i7];
                    c0283b3.f3520a.f3543c = -1;
                    c0283b3.g(d);
                    C0287f c0287f2 = c0283b3.f3520a;
                    c0287f2.f3543c = i7;
                    c0287f2.e(this, c0283b3);
                }
            } else {
                z3 = true;
            }
            i = 0;
        }
    }

    public final void s() {
        for (int i = 0; i < this.f3532j; i++) {
            C0283b c0283b = this.f3530f[i];
            if (c0283b != null) {
                ((J.b) this.f3534l.f413b).b(c0283b);
            }
            this.f3530f[i] = null;
        }
    }

    public final void t() {
        C0011l c0011l;
        int i = 0;
        while (true) {
            c0011l = this.f3534l;
            C0287f[] c0287fArr = (C0287f[]) c0011l.d;
            if (i >= c0287fArr.length) {
                break;
            }
            C0287f c0287f = c0287fArr[i];
            if (c0287f != null) {
                c0287f.c();
            }
            i++;
        }
        J.b bVar = (J.b) c0011l.f414c;
        C0287f[] c0287fArr2 = this.f3535m;
        int i2 = this.f3536n;
        bVar.getClass();
        if (i2 > c0287fArr2.length) {
            i2 = c0287fArr2.length;
        }
        for (int i3 = 0; i3 < i2; i3++) {
            C0287f c0287f2 = c0287fArr2[i3];
            int i4 = bVar.f259b;
            Object[] objArr = bVar.f258a;
            if (i4 < objArr.length) {
                objArr[i4] = c0287f2;
                bVar.f259b = i4 + 1;
            }
        }
        this.f3536n = 0;
        Arrays.fill((C0287f[]) c0011l.d, (Object) null);
        this.f3527b = 0;
        C0285d c0285d = this.f3528c;
        c0285d.h = 0;
        c0285d.f3521b = 0.0f;
        this.i = 1;
        for (int i5 = 0; i5 < this.f3532j; i5++) {
            C0283b c0283b = this.f3530f[i5];
        }
        s();
        this.f3532j = 0;
        this.f3537o = new C0283b(c0011l);
    }
}
