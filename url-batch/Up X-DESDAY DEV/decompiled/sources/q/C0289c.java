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
    public static boolean f3503p = false;

    /* renamed from: q, reason: collision with root package name */
    public static int f3504q = 1000;

    /* renamed from: c, reason: collision with root package name */
    public final C0290d f3507c;

    /* renamed from: f, reason: collision with root package name */
    public C0288b[] f3509f;

    /* renamed from: l, reason: collision with root package name */
    public final C0012l f3513l;

    /* renamed from: o, reason: collision with root package name */
    public C0288b f3516o;

    /* renamed from: a, reason: collision with root package name */
    public boolean f3505a = false;

    /* renamed from: b, reason: collision with root package name */
    public int f3506b = 0;
    public int d = 32;

    /* renamed from: e, reason: collision with root package name */
    public int f3508e = 32;

    /* renamed from: g, reason: collision with root package name */
    public boolean f3510g = false;
    public boolean[] h = new boolean[32];
    public int i = 1;

    /* renamed from: j, reason: collision with root package name */
    public int f3511j = 0;

    /* renamed from: k, reason: collision with root package name */
    public int f3512k = 32;

    /* renamed from: m, reason: collision with root package name */
    public C0292f[] f3514m = new C0292f[f3504q];

    /* renamed from: n, reason: collision with root package name */
    public int f3515n = 0;

    public C0289c() {
        this.f3509f = null;
        this.f3509f = new C0288b[32];
        s();
        C0012l c0012l = new C0012l();
        c0012l.f431b = new J.b();
        c0012l.f432c = new J.b();
        c0012l.d = new C0292f[32];
        this.f3513l = c0012l;
        C0290d c0290d = new C0290d(c0012l);
        c0290d.f3517f = new C0292f[128];
        c0290d.f3518g = new C0292f[128];
        c0290d.h = 0;
        c0290d.i = new j(c0290d);
        this.f3507c = c0290d;
        this.f3516o = new C0288b(c0012l);
    }

    public static int n(Object obj) {
        C0292f c0292f = ((C0298c) obj).i;
        if (c0292f != null) {
            return (int) (c0292f.f3523e + 0.5f);
        }
        return 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r4v0 */
    public final C0292f a(int i) {
        J.b bVar = (J.b) this.f3513l.f432c;
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
            c0292f2.f3528l = i;
        } else {
            c0292f2.c();
            c0292f2.f3528l = i;
        }
        int i4 = this.f3515n;
        int i5 = f3504q;
        if (i4 >= i5) {
            int i6 = i5 * 2;
            f3504q = i6;
            this.f3514m = (C0292f[]) Arrays.copyOf(this.f3514m, i6);
        }
        C0292f[] c0292fArr = this.f3514m;
        int i7 = this.f3515n;
        this.f3515n = i7 + 1;
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
                l2.f3500b = (-i) + i2;
            }
        } else if (f2 <= 0.0f) {
            l2.d.g(c0292f, -1.0f);
            l2.d.g(c0292f2, 1.0f);
            l2.f3500b = i;
        } else if (f2 >= 1.0f) {
            l2.d.g(c0292f4, -1.0f);
            l2.d.g(c0292f3, 1.0f);
            l2.f3500b = -i2;
        } else {
            float f3 = 1.0f - f2;
            l2.d.g(c0292f, f3 * 1.0f);
            l2.d.g(c0292f2, f3 * (-1.0f));
            l2.d.g(c0292f3, (-1.0f) * f2);
            l2.d.g(c0292f4, 1.0f * f2);
            if (i > 0 || i2 > 0) {
                l2.f3500b = (i2 * f2) + ((-i) * f3);
            }
        }
        if (i3 != 8) {
            l2.a(this, i3);
        }
        c(l2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:68:0x00d0, code lost:
    
        if (r4.f3527k <= 1) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x00d3, code lost:
    
        r12 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x00dd, code lost:
    
        if (r4.f3527k <= 1) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x00f2, code lost:
    
        if (r4.f3527k <= 1) goto L87;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x00f5, code lost:
    
        r14 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x00ff, code lost:
    
        if (r4.f3527k <= 1) goto L87;
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
        if (this.f3511j + 1 >= this.f3512k || this.i + 1 >= this.f3508e) {
            o();
        }
        if (c0288b.f3502e) {
            z2 = false;
        } else {
            if (this.f3509f.length != 0) {
                boolean z4 = false;
                while (!z4) {
                    int d = c0288b.d.d();
                    int i = 0;
                    while (true) {
                        arrayList = c0288b.f3501c;
                        if (i >= d) {
                            break;
                        }
                        C0292f e2 = c0288b.d.e(i);
                        if (e2.f3522c != -1 || e2.f3524f) {
                            arrayList.add(e2);
                        }
                        i++;
                    }
                    int size = arrayList.size();
                    if (size > 0) {
                        for (int i2 = 0; i2 < size; i2++) {
                            C0292f c0292f2 = (C0292f) arrayList.get(i2);
                            if (c0292f2.f3524f) {
                                c0288b.h(this, c0292f2, true);
                            } else {
                                c0288b.i(this, this.f3509f[c0292f2.f3522c], true);
                            }
                        }
                        arrayList.clear();
                    } else {
                        z4 = true;
                    }
                }
                if (c0288b.f3499a != null && c0288b.d.d() == 0) {
                    c0288b.f3502e = true;
                    this.f3505a = true;
                }
            }
            if (c0288b.e()) {
                return;
            }
            float f3 = c0288b.f3500b;
            if (f3 < 0.0f) {
                c0288b.f3500b = f3 * (-1.0f);
                C0287a c0287a = c0288b.d;
                int i3 = c0287a.h;
                for (int i4 = 0; i3 != -1 && i4 < c0287a.f3492a; i4++) {
                    float[] fArr = c0287a.f3497g;
                    fArr[i3] = fArr[i3] * (-1.0f);
                    i3 = c0287a.f3496f[i3];
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
                if (e3.f3528l == 1) {
                    if (c0292f3 != null) {
                        if (f4 <= f6) {
                            if (!z5) {
                                if (e3.f3527k > 1) {
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
                                if (e3.f3527k > 1) {
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
                c0288b.f3502e = true;
            }
            if (z3) {
                if (this.i + 1 >= this.f3508e) {
                    o();
                }
                C0292f a2 = a(3);
                int i6 = this.f3506b + 1;
                this.f3506b = i6;
                this.i++;
                a2.f3521b = i6;
                C0012l c0012l = this.f3513l;
                ((C0292f[]) c0012l.d)[i6] = a2;
                c0288b.f3499a = a2;
                int i7 = this.f3511j;
                h(c0288b);
                if (this.f3511j == i7 + 1) {
                    C0288b c0288b2 = this.f3516o;
                    c0288b2.f3499a = null;
                    c0288b2.d.b();
                    for (int i8 = 0; i8 < c0288b.d.d(); i8++) {
                        c0288b2.d.a(c0288b.d.e(i8), c0288b.d.f(i8), true);
                    }
                    r(this.f3516o);
                    if (a2.f3522c == -1) {
                        if (c0288b.f3499a == a2 && (f2 = c0288b.f(null, a2)) != null) {
                            c0288b.g(f2);
                        }
                        if (!c0288b.f3502e) {
                            c0288b.f3499a.e(this, c0288b);
                        }
                        ((J.b) c0012l.f431b).b(c0288b);
                        this.f3511j--;
                    }
                    z2 = true;
                    c0292f = c0288b.f3499a;
                    if (c0292f != null) {
                        return;
                    }
                    if (c0292f.f3528l != 1 && c0288b.f3500b < 0.0f) {
                        return;
                    }
                }
            }
            z2 = false;
            c0292f = c0288b.f3499a;
            if (c0292f != null) {
            }
        }
        if (z2) {
            return;
        }
        h(c0288b);
    }

    public final void d(C0292f c0292f, int i) {
        int i2 = c0292f.f3522c;
        if (i2 == -1) {
            c0292f.d(this, i);
            for (int i3 = 0; i3 < this.f3506b + 1; i3++) {
                C0292f c0292f2 = ((C0292f[]) this.f3513l.d)[i3];
            }
            return;
        }
        if (i2 == -1) {
            C0288b l2 = l();
            l2.f3499a = c0292f;
            float f2 = i;
            c0292f.f3523e = f2;
            l2.f3500b = f2;
            l2.f3502e = true;
            c(l2);
            return;
        }
        C0288b c0288b = this.f3509f[i2];
        if (c0288b.f3502e) {
            c0288b.f3500b = i;
            return;
        }
        if (c0288b.d.d() == 0) {
            c0288b.f3502e = true;
            c0288b.f3500b = i;
            return;
        }
        C0288b l3 = l();
        if (i < 0) {
            l3.f3500b = i * (-1);
            l3.d.g(c0292f, 1.0f);
        } else {
            l3.f3500b = i;
            l3.d.g(c0292f, -1.0f);
        }
        c(l3);
    }

    public final void e(C0292f c0292f, C0292f c0292f2, int i, int i2) {
        if (i2 == 8 && c0292f2.f3524f && c0292f.f3522c == -1) {
            c0292f.d(this, c0292f2.f3523e + i);
            return;
        }
        C0288b l2 = l();
        boolean z2 = false;
        if (i != 0) {
            if (i < 0) {
                i *= -1;
                z2 = true;
            }
            l2.f3500b = i;
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
        if (c0288b.f3502e) {
            c0288b.f3499a.d(this, c0288b.f3500b);
        } else {
            C0288b[] c0288bArr = this.f3509f;
            int i2 = this.f3511j;
            c0288bArr[i2] = c0288b;
            C0292f c0292f = c0288b.f3499a;
            c0292f.f3522c = i2;
            this.f3511j = i2 + 1;
            c0292f.e(this, c0288b);
        }
        if (this.f3505a) {
            int i3 = 0;
            while (i3 < this.f3511j) {
                if (this.f3509f[i3] == null) {
                    System.out.println("WTF");
                }
                C0288b c0288b2 = this.f3509f[i3];
                if (c0288b2 != null && c0288b2.f3502e) {
                    c0288b2.f3499a.d(this, c0288b2.f3500b);
                    ((J.b) this.f3513l.f431b).b(c0288b2);
                    this.f3509f[i3] = null;
                    int i4 = i3 + 1;
                    int i5 = i4;
                    while (true) {
                        i = this.f3511j;
                        if (i4 >= i) {
                            break;
                        }
                        C0288b[] c0288bArr2 = this.f3509f;
                        int i6 = i4 - 1;
                        C0288b c0288b3 = c0288bArr2[i4];
                        c0288bArr2[i6] = c0288b3;
                        C0292f c0292f2 = c0288b3.f3499a;
                        if (c0292f2.f3522c == i4) {
                            c0292f2.f3522c = i6;
                        }
                        i5 = i4;
                        i4++;
                    }
                    if (i5 < i) {
                        this.f3509f[i5] = null;
                    }
                    this.f3511j = i - 1;
                    i3--;
                }
                i3++;
            }
            this.f3505a = false;
        }
    }

    public final void i() {
        for (int i = 0; i < this.f3511j; i++) {
            C0288b c0288b = this.f3509f[i];
            c0288b.f3499a.f3523e = c0288b.f3500b;
        }
    }

    public final C0292f j(int i) {
        if (this.i + 1 >= this.f3508e) {
            o();
        }
        C0292f a2 = a(4);
        int i2 = this.f3506b + 1;
        this.f3506b = i2;
        this.i++;
        a2.f3521b = i2;
        a2.d = i;
        ((C0292f[]) this.f3513l.d)[i2] = a2;
        C0290d c0290d = this.f3507c;
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
        if (this.i + 1 >= this.f3508e) {
            o();
        }
        if (obj instanceof C0298c) {
            C0298c c0298c = (C0298c) obj;
            c0292f = c0298c.i;
            if (c0292f == null) {
                c0298c.k();
                c0292f = c0298c.i;
            }
            int i = c0292f.f3521b;
            C0012l c0012l = this.f3513l;
            if (i == -1 || i > this.f3506b || ((C0292f[]) c0012l.d)[i] == null) {
                if (i != -1) {
                    c0292f.c();
                }
                int i2 = this.f3506b + 1;
                this.f3506b = i2;
                this.i++;
                c0292f.f3521b = i2;
                c0292f.f3528l = 1;
                ((C0292f[]) c0012l.d)[i2] = c0292f;
            }
        }
        return c0292f;
    }

    public final C0288b l() {
        Object obj;
        C0012l c0012l = this.f3513l;
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
        c0288b.f3499a = null;
        c0288b.d.b();
        c0288b.f3500b = 0.0f;
        c0288b.f3502e = false;
        return c0288b;
    }

    public final C0292f m() {
        if (this.i + 1 >= this.f3508e) {
            o();
        }
        C0292f a2 = a(3);
        int i = this.f3506b + 1;
        this.f3506b = i;
        this.i++;
        a2.f3521b = i;
        ((C0292f[]) this.f3513l.d)[i] = a2;
        return a2;
    }

    public final void o() {
        int i = this.d * 2;
        this.d = i;
        this.f3509f = (C0288b[]) Arrays.copyOf(this.f3509f, i);
        C0012l c0012l = this.f3513l;
        c0012l.d = (C0292f[]) Arrays.copyOf((C0292f[]) c0012l.d, this.d);
        int i2 = this.d;
        this.h = new boolean[i2];
        this.f3508e = i2;
        this.f3512k = i2;
    }

    public final void p() {
        C0290d c0290d = this.f3507c;
        if (c0290d.e()) {
            i();
            return;
        }
        if (!this.f3510g) {
            q(c0290d);
            return;
        }
        for (int i = 0; i < this.f3511j; i++) {
            if (!this.f3509f[i].f3502e) {
                q(c0290d);
                return;
            }
        }
        i();
    }

    public final void q(C0290d c0290d) {
        int i = 0;
        while (true) {
            if (i >= this.f3511j) {
                break;
            }
            C0288b c0288b = this.f3509f[i];
            int i2 = 1;
            if (c0288b.f3499a.f3528l != 1) {
                float f2 = 0.0f;
                if (c0288b.f3500b < 0.0f) {
                    boolean z2 = false;
                    int i3 = 0;
                    while (!z2) {
                        i3 += i2;
                        float f3 = Float.MAX_VALUE;
                        int i4 = -1;
                        int i5 = -1;
                        int i6 = 0;
                        int i7 = 0;
                        while (i6 < this.f3511j) {
                            C0288b c0288b2 = this.f3509f[i6];
                            if (c0288b2.f3499a.f3528l != i2 && !c0288b2.f3502e && c0288b2.f3500b < f2) {
                                int d = c0288b2.d.d();
                                int i8 = 0;
                                while (i8 < d) {
                                    C0292f e2 = c0288b2.d.e(i8);
                                    float c2 = c0288b2.d.c(e2);
                                    if (c2 > f2) {
                                        for (int i9 = 0; i9 < 9; i9++) {
                                            float f4 = e2.f3525g[i9] / c2;
                                            if ((f4 < f3 && i9 == i7) || i9 > i7) {
                                                i7 = i9;
                                                i5 = e2.f3521b;
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
                            C0288b c0288b3 = this.f3509f[i4];
                            c0288b3.f3499a.f3522c = -1;
                            c0288b3.g(((C0292f[]) this.f3513l.d)[i5]);
                            C0292f c0292f = c0288b3.f3499a;
                            c0292f.f3522c = i4;
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
            C0292f c0292f = c0288b.f3499a;
            if (c0292f != null) {
                this.h[c0292f.f3521b] = true;
            }
            C0292f d = c0288b.d(this.h);
            if (d != null) {
                boolean[] zArr = this.h;
                int i5 = d.f3521b;
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
                while (i6 < this.f3511j) {
                    C0288b c0288b2 = this.f3509f[i6];
                    if (c0288b2.f3499a.f3528l != i4 && !c0288b2.f3502e) {
                        C0287a c0287a = c0288b2.d;
                        int i8 = c0287a.h;
                        if (i8 != -1) {
                            for (int i9 = 0; i8 != -1 && i9 < c0287a.f3492a; i9++) {
                                if (c0287a.f3495e[i8] == d.f3521b) {
                                    z2 = true;
                                    break;
                                }
                                i8 = c0287a.f3496f[i8];
                            }
                        }
                        z2 = false;
                        if (z2) {
                            float c2 = c0288b2.d.c(d);
                            if (c2 < 0.0f) {
                                float f3 = (-c0288b2.f3500b) / c2;
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
                    C0288b c0288b3 = this.f3509f[i7];
                    c0288b3.f3499a.f3522c = -1;
                    c0288b3.g(d);
                    C0292f c0292f2 = c0288b3.f3499a;
                    c0292f2.f3522c = i7;
                    c0292f2.e(this, c0288b3);
                }
            } else {
                z3 = true;
            }
            i = 0;
        }
    }

    public final void s() {
        for (int i = 0; i < this.f3511j; i++) {
            C0288b c0288b = this.f3509f[i];
            if (c0288b != null) {
                ((J.b) this.f3513l.f431b).b(c0288b);
            }
            this.f3509f[i] = null;
        }
    }

    public final void t() {
        C0012l c0012l;
        int i = 0;
        while (true) {
            c0012l = this.f3513l;
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
        C0292f[] c0292fArr2 = this.f3514m;
        int i2 = this.f3515n;
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
        this.f3515n = 0;
        Arrays.fill((C0292f[]) c0012l.d, (Object) null);
        this.f3506b = 0;
        C0290d c0290d = this.f3507c;
        c0290d.h = 0;
        c0290d.f3500b = 0.0f;
        this.i = 1;
        for (int i5 = 0; i5 < this.f3511j; i5++) {
            C0288b c0288b = this.f3509f[i5];
        }
        s();
        this.f3511j = 0;
        this.f3516o = new C0288b(c0012l);
    }
}
