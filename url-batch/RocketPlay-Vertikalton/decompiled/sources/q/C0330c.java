package q;

import B.j;
import K.C0019l;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Arrays;

/* renamed from: q.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0330c {

    /* renamed from: p, reason: collision with root package name */
    public static boolean f3826p = false;

    /* renamed from: q, reason: collision with root package name */
    public static int f3827q = 1000;

    /* renamed from: c, reason: collision with root package name */
    public final C0331d f3830c;

    /* renamed from: f, reason: collision with root package name */
    public C0329b[] f3832f;

    /* renamed from: l, reason: collision with root package name */
    public final C0019l f3836l;

    /* renamed from: o, reason: collision with root package name */
    public C0329b f3839o;

    /* renamed from: a, reason: collision with root package name */
    public boolean f3828a = false;

    /* renamed from: b, reason: collision with root package name */
    public int f3829b = 0;
    public int d = 32;

    /* renamed from: e, reason: collision with root package name */
    public int f3831e = 32;

    /* renamed from: g, reason: collision with root package name */
    public boolean f3833g = false;
    public boolean[] h = new boolean[32];
    public int i = 1;

    /* renamed from: j, reason: collision with root package name */
    public int f3834j = 0;

    /* renamed from: k, reason: collision with root package name */
    public int f3835k = 32;

    /* renamed from: m, reason: collision with root package name */
    public C0333f[] f3837m = new C0333f[f3827q];

    /* renamed from: n, reason: collision with root package name */
    public int f3838n = 0;

    public C0330c() {
        this.f3832f = null;
        this.f3832f = new C0329b[32];
        s();
        C0019l c0019l = new C0019l();
        c0019l.f683a = new J.b();
        c0019l.f684b = new J.b();
        c0019l.f685c = new C0333f[32];
        this.f3836l = c0019l;
        C0331d c0331d = new C0331d(c0019l);
        c0331d.f3840f = new C0333f[128];
        c0331d.f3841g = new C0333f[128];
        c0331d.h = 0;
        c0331d.i = new j(c0331d);
        this.f3830c = c0331d;
        this.f3839o = new C0329b(c0019l);
    }

    public static int n(Object obj) {
        C0333f c0333f = ((s.c) obj).i;
        if (c0333f != null) {
            return (int) (c0333f.f3846e + 0.5f);
        }
        return 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r4v0 */
    public final C0333f a(int i) {
        J.b bVar = (J.b) this.f3836l.f684b;
        int i2 = bVar.f591b;
        C0333f c0333f = null;
        if (i2 > 0) {
            int i3 = i2 - 1;
            ?? r3 = bVar.f590a;
            ?? r4 = r3[i3];
            r3[i3] = 0;
            bVar.f591b = i3;
            c0333f = r4;
        }
        C0333f c0333f2 = c0333f;
        if (c0333f2 == null) {
            c0333f2 = new C0333f(i);
            c0333f2.f3851l = i;
        } else {
            c0333f2.c();
            c0333f2.f3851l = i;
        }
        int i4 = this.f3838n;
        int i5 = f3827q;
        if (i4 >= i5) {
            int i6 = i5 * 2;
            f3827q = i6;
            this.f3837m = (C0333f[]) Arrays.copyOf(this.f3837m, i6);
        }
        C0333f[] c0333fArr = this.f3837m;
        int i7 = this.f3838n;
        this.f3838n = i7 + 1;
        c0333fArr[i7] = c0333f2;
        return c0333f2;
    }

    public final void b(C0333f c0333f, C0333f c0333f2, int i, float f2, C0333f c0333f3, C0333f c0333f4, int i2, int i3) {
        C0329b l2 = l();
        if (c0333f2 == c0333f3) {
            l2.d.g(c0333f, 1.0f);
            l2.d.g(c0333f4, 1.0f);
            l2.d.g(c0333f2, -2.0f);
        } else if (f2 == 0.5f) {
            l2.d.g(c0333f, 1.0f);
            l2.d.g(c0333f2, -1.0f);
            l2.d.g(c0333f3, -1.0f);
            l2.d.g(c0333f4, 1.0f);
            if (i > 0 || i2 > 0) {
                l2.f3823b = (-i) + i2;
            }
        } else if (f2 <= RecyclerView.f1949A0) {
            l2.d.g(c0333f, -1.0f);
            l2.d.g(c0333f2, 1.0f);
            l2.f3823b = i;
        } else if (f2 >= 1.0f) {
            l2.d.g(c0333f4, -1.0f);
            l2.d.g(c0333f3, 1.0f);
            l2.f3823b = -i2;
        } else {
            float f3 = 1.0f - f2;
            l2.d.g(c0333f, f3 * 1.0f);
            l2.d.g(c0333f2, f3 * (-1.0f));
            l2.d.g(c0333f3, (-1.0f) * f2);
            l2.d.g(c0333f4, 1.0f * f2);
            if (i > 0 || i2 > 0) {
                l2.f3823b = (i2 * f2) + ((-i) * f3);
            }
        }
        if (i3 != 8) {
            l2.a(this, i3);
        }
        c(l2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:68:0x00d0, code lost:
    
        if (r4.f3850k <= 1) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x00d3, code lost:
    
        r12 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x00dd, code lost:
    
        if (r4.f3850k <= 1) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x00f2, code lost:
    
        if (r4.f3850k <= 1) goto L87;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x00f5, code lost:
    
        r14 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x00ff, code lost:
    
        if (r4.f3850k <= 1) goto L87;
     */
    /* JADX WARN: Removed duplicated region for block: B:137:0x01ae  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x01b9 A[ORIG_RETURN, RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void c(C0329b c0329b) {
        boolean z2;
        boolean z3;
        C0333f c0333f;
        C0333f f2;
        ArrayList arrayList;
        if (this.f3834j + 1 >= this.f3835k || this.i + 1 >= this.f3831e) {
            o();
        }
        if (c0329b.f3825e) {
            z2 = false;
        } else {
            if (this.f3832f.length != 0) {
                boolean z4 = false;
                while (!z4) {
                    int d = c0329b.d.d();
                    int i = 0;
                    while (true) {
                        arrayList = c0329b.f3824c;
                        if (i >= d) {
                            break;
                        }
                        C0333f e2 = c0329b.d.e(i);
                        if (e2.f3845c != -1 || e2.f3847f) {
                            arrayList.add(e2);
                        }
                        i++;
                    }
                    int size = arrayList.size();
                    if (size > 0) {
                        for (int i2 = 0; i2 < size; i2++) {
                            C0333f c0333f2 = (C0333f) arrayList.get(i2);
                            if (c0333f2.f3847f) {
                                c0329b.h(this, c0333f2, true);
                            } else {
                                c0329b.i(this, this.f3832f[c0333f2.f3845c], true);
                            }
                        }
                        arrayList.clear();
                    } else {
                        z4 = true;
                    }
                }
                if (c0329b.f3822a != null && c0329b.d.d() == 0) {
                    c0329b.f3825e = true;
                    this.f3828a = true;
                }
            }
            if (c0329b.e()) {
                return;
            }
            float f3 = c0329b.f3823b;
            if (f3 < RecyclerView.f1949A0) {
                c0329b.f3823b = f3 * (-1.0f);
                C0328a c0328a = c0329b.d;
                int i3 = c0328a.h;
                for (int i4 = 0; i3 != -1 && i4 < c0328a.f3815a; i4++) {
                    float[] fArr = c0328a.f3820g;
                    fArr[i3] = fArr[i3] * (-1.0f);
                    i3 = c0328a.f3819f[i3];
                }
            }
            int d2 = c0329b.d.d();
            float f4 = 0.0f;
            float f5 = 0.0f;
            C0333f c0333f3 = null;
            C0333f c0333f4 = null;
            boolean z5 = false;
            boolean z6 = false;
            for (int i5 = 0; i5 < d2; i5++) {
                float f6 = c0329b.d.f(i5);
                C0333f e3 = c0329b.d.e(i5);
                if (e3.f3851l == 1) {
                    if (c0333f3 != null) {
                        if (f4 <= f6) {
                            if (!z5) {
                                if (e3.f3850k > 1) {
                                }
                            }
                        }
                        z5 = true;
                    }
                    c0333f3 = e3;
                    f4 = f6;
                } else if (c0333f3 == null && f6 < RecyclerView.f1949A0) {
                    if (c0333f4 != null) {
                        if (f5 <= f6) {
                            if (!z6) {
                                if (e3.f3850k > 1) {
                                }
                            }
                        }
                        z6 = true;
                    }
                    c0333f4 = e3;
                    f5 = f6;
                }
            }
            if (c0333f3 == null) {
                c0333f3 = c0333f4;
            }
            if (c0333f3 == null) {
                z3 = true;
            } else {
                c0329b.g(c0333f3);
                z3 = false;
            }
            if (c0329b.d.d() == 0) {
                c0329b.f3825e = true;
            }
            if (z3) {
                if (this.i + 1 >= this.f3831e) {
                    o();
                }
                C0333f a2 = a(3);
                int i6 = this.f3829b + 1;
                this.f3829b = i6;
                this.i++;
                a2.f3844b = i6;
                C0019l c0019l = this.f3836l;
                ((C0333f[]) c0019l.f685c)[i6] = a2;
                c0329b.f3822a = a2;
                int i7 = this.f3834j;
                h(c0329b);
                if (this.f3834j == i7 + 1) {
                    C0329b c0329b2 = this.f3839o;
                    c0329b2.f3822a = null;
                    c0329b2.d.b();
                    for (int i8 = 0; i8 < c0329b.d.d(); i8++) {
                        c0329b2.d.a(c0329b.d.e(i8), c0329b.d.f(i8), true);
                    }
                    r(this.f3839o);
                    if (a2.f3845c == -1) {
                        if (c0329b.f3822a == a2 && (f2 = c0329b.f(null, a2)) != null) {
                            c0329b.g(f2);
                        }
                        if (!c0329b.f3825e) {
                            c0329b.f3822a.e(this, c0329b);
                        }
                        ((J.b) c0019l.f683a).b(c0329b);
                        this.f3834j--;
                    }
                    z2 = true;
                    c0333f = c0329b.f3822a;
                    if (c0333f != null) {
                        return;
                    }
                    if (c0333f.f3851l != 1 && c0329b.f3823b < RecyclerView.f1949A0) {
                        return;
                    }
                }
            }
            z2 = false;
            c0333f = c0329b.f3822a;
            if (c0333f != null) {
            }
        }
        if (z2) {
            return;
        }
        h(c0329b);
    }

    public final void d(C0333f c0333f, int i) {
        int i2 = c0333f.f3845c;
        if (i2 == -1) {
            c0333f.d(this, i);
            for (int i3 = 0; i3 < this.f3829b + 1; i3++) {
                C0333f c0333f2 = ((C0333f[]) this.f3836l.f685c)[i3];
            }
            return;
        }
        if (i2 == -1) {
            C0329b l2 = l();
            l2.f3822a = c0333f;
            float f2 = i;
            c0333f.f3846e = f2;
            l2.f3823b = f2;
            l2.f3825e = true;
            c(l2);
            return;
        }
        C0329b c0329b = this.f3832f[i2];
        if (c0329b.f3825e) {
            c0329b.f3823b = i;
            return;
        }
        if (c0329b.d.d() == 0) {
            c0329b.f3825e = true;
            c0329b.f3823b = i;
            return;
        }
        C0329b l3 = l();
        if (i < 0) {
            l3.f3823b = i * (-1);
            l3.d.g(c0333f, 1.0f);
        } else {
            l3.f3823b = i;
            l3.d.g(c0333f, -1.0f);
        }
        c(l3);
    }

    public final void e(C0333f c0333f, C0333f c0333f2, int i, int i2) {
        if (i2 == 8 && c0333f2.f3847f && c0333f.f3845c == -1) {
            c0333f.d(this, c0333f2.f3846e + i);
            return;
        }
        C0329b l2 = l();
        boolean z2 = false;
        if (i != 0) {
            if (i < 0) {
                i *= -1;
                z2 = true;
            }
            l2.f3823b = i;
        }
        if (z2) {
            l2.d.g(c0333f, 1.0f);
            l2.d.g(c0333f2, -1.0f);
        } else {
            l2.d.g(c0333f, -1.0f);
            l2.d.g(c0333f2, 1.0f);
        }
        if (i2 != 8) {
            l2.a(this, i2);
        }
        c(l2);
    }

    public final void f(C0333f c0333f, C0333f c0333f2, int i, int i2) {
        C0329b l2 = l();
        C0333f m2 = m();
        m2.d = 0;
        l2.b(c0333f, c0333f2, m2, i);
        if (i2 != 8) {
            l2.d.g(j(i2), (int) (l2.d.c(m2) * (-1.0f)));
        }
        c(l2);
    }

    public final void g(C0333f c0333f, C0333f c0333f2, int i, int i2) {
        C0329b l2 = l();
        C0333f m2 = m();
        m2.d = 0;
        l2.c(c0333f, c0333f2, m2, i);
        if (i2 != 8) {
            l2.d.g(j(i2), (int) (l2.d.c(m2) * (-1.0f)));
        }
        c(l2);
    }

    public final void h(C0329b c0329b) {
        int i;
        if (c0329b.f3825e) {
            c0329b.f3822a.d(this, c0329b.f3823b);
        } else {
            C0329b[] c0329bArr = this.f3832f;
            int i2 = this.f3834j;
            c0329bArr[i2] = c0329b;
            C0333f c0333f = c0329b.f3822a;
            c0333f.f3845c = i2;
            this.f3834j = i2 + 1;
            c0333f.e(this, c0329b);
        }
        if (this.f3828a) {
            int i3 = 0;
            while (i3 < this.f3834j) {
                if (this.f3832f[i3] == null) {
                    System.out.println("WTF");
                }
                C0329b c0329b2 = this.f3832f[i3];
                if (c0329b2 != null && c0329b2.f3825e) {
                    c0329b2.f3822a.d(this, c0329b2.f3823b);
                    ((J.b) this.f3836l.f683a).b(c0329b2);
                    this.f3832f[i3] = null;
                    int i4 = i3 + 1;
                    int i5 = i4;
                    while (true) {
                        i = this.f3834j;
                        if (i4 >= i) {
                            break;
                        }
                        C0329b[] c0329bArr2 = this.f3832f;
                        int i6 = i4 - 1;
                        C0329b c0329b3 = c0329bArr2[i4];
                        c0329bArr2[i6] = c0329b3;
                        C0333f c0333f2 = c0329b3.f3822a;
                        if (c0333f2.f3845c == i4) {
                            c0333f2.f3845c = i6;
                        }
                        i5 = i4;
                        i4++;
                    }
                    if (i5 < i) {
                        this.f3832f[i5] = null;
                    }
                    this.f3834j = i - 1;
                    i3--;
                }
                i3++;
            }
            this.f3828a = false;
        }
    }

    public final void i() {
        for (int i = 0; i < this.f3834j; i++) {
            C0329b c0329b = this.f3832f[i];
            c0329b.f3822a.f3846e = c0329b.f3823b;
        }
    }

    public final C0333f j(int i) {
        if (this.i + 1 >= this.f3831e) {
            o();
        }
        C0333f a2 = a(4);
        int i2 = this.f3829b + 1;
        this.f3829b = i2;
        this.i++;
        a2.f3844b = i2;
        a2.d = i;
        ((C0333f[]) this.f3836l.f685c)[i2] = a2;
        C0331d c0331d = this.f3830c;
        c0331d.i.f72b = a2;
        float[] fArr = a2.h;
        Arrays.fill(fArr, RecyclerView.f1949A0);
        fArr[a2.d] = 1.0f;
        c0331d.j(a2);
        return a2;
    }

    public final C0333f k(Object obj) {
        C0333f c0333f = null;
        if (obj == null) {
            return null;
        }
        if (this.i + 1 >= this.f3831e) {
            o();
        }
        if (obj instanceof s.c) {
            s.c cVar = (s.c) obj;
            c0333f = cVar.i;
            if (c0333f == null) {
                cVar.k();
                c0333f = cVar.i;
            }
            int i = c0333f.f3844b;
            C0019l c0019l = this.f3836l;
            if (i == -1 || i > this.f3829b || ((C0333f[]) c0019l.f685c)[i] == null) {
                if (i != -1) {
                    c0333f.c();
                }
                int i2 = this.f3829b + 1;
                this.f3829b = i2;
                this.i++;
                c0333f.f3844b = i2;
                c0333f.f3851l = 1;
                ((C0333f[]) c0019l.f685c)[i2] = c0333f;
            }
        }
        return c0333f;
    }

    public final C0329b l() {
        Object obj;
        C0019l c0019l = this.f3836l;
        J.b bVar = (J.b) c0019l.f683a;
        int i = bVar.f591b;
        if (i > 0) {
            int i2 = i - 1;
            Object[] objArr = bVar.f590a;
            obj = objArr[i2];
            objArr[i2] = null;
            bVar.f591b = i2;
        } else {
            obj = null;
        }
        C0329b c0329b = (C0329b) obj;
        if (c0329b == null) {
            return new C0329b(c0019l);
        }
        c0329b.f3822a = null;
        c0329b.d.b();
        c0329b.f3823b = RecyclerView.f1949A0;
        c0329b.f3825e = false;
        return c0329b;
    }

    public final C0333f m() {
        if (this.i + 1 >= this.f3831e) {
            o();
        }
        C0333f a2 = a(3);
        int i = this.f3829b + 1;
        this.f3829b = i;
        this.i++;
        a2.f3844b = i;
        ((C0333f[]) this.f3836l.f685c)[i] = a2;
        return a2;
    }

    public final void o() {
        int i = this.d * 2;
        this.d = i;
        this.f3832f = (C0329b[]) Arrays.copyOf(this.f3832f, i);
        C0019l c0019l = this.f3836l;
        c0019l.f685c = (C0333f[]) Arrays.copyOf((C0333f[]) c0019l.f685c, this.d);
        int i2 = this.d;
        this.h = new boolean[i2];
        this.f3831e = i2;
        this.f3835k = i2;
    }

    public final void p() {
        C0331d c0331d = this.f3830c;
        if (c0331d.e()) {
            i();
            return;
        }
        if (!this.f3833g) {
            q(c0331d);
            return;
        }
        for (int i = 0; i < this.f3834j; i++) {
            if (!this.f3832f[i].f3825e) {
                q(c0331d);
                return;
            }
        }
        i();
    }

    public final void q(C0331d c0331d) {
        int i = 0;
        while (true) {
            if (i >= this.f3834j) {
                break;
            }
            C0329b c0329b = this.f3832f[i];
            int i2 = 1;
            if (c0329b.f3822a.f3851l != 1) {
                float f2 = c0329b.f3823b;
                float f3 = RecyclerView.f1949A0;
                if (f2 < RecyclerView.f1949A0) {
                    boolean z2 = false;
                    int i3 = 0;
                    while (!z2) {
                        i3 += i2;
                        float f4 = Float.MAX_VALUE;
                        int i4 = -1;
                        int i5 = -1;
                        int i6 = 0;
                        int i7 = 0;
                        while (i6 < this.f3834j) {
                            C0329b c0329b2 = this.f3832f[i6];
                            if (c0329b2.f3822a.f3851l != i2 && !c0329b2.f3825e && c0329b2.f3823b < f3) {
                                int d = c0329b2.d.d();
                                int i8 = 0;
                                while (i8 < d) {
                                    C0333f e2 = c0329b2.d.e(i8);
                                    float c2 = c0329b2.d.c(e2);
                                    if (c2 > f3) {
                                        for (int i9 = 0; i9 < 9; i9++) {
                                            float f5 = e2.f3848g[i9] / c2;
                                            if ((f5 < f4 && i9 == i7) || i9 > i7) {
                                                i7 = i9;
                                                i5 = e2.f3844b;
                                                i4 = i6;
                                                f4 = f5;
                                            }
                                        }
                                    }
                                    i8++;
                                    f3 = RecyclerView.f1949A0;
                                }
                            }
                            i6++;
                            f3 = RecyclerView.f1949A0;
                            i2 = 1;
                        }
                        if (i4 != -1) {
                            C0329b c0329b3 = this.f3832f[i4];
                            c0329b3.f3822a.f3845c = -1;
                            c0329b3.g(((C0333f[]) this.f3836l.f685c)[i5]);
                            C0333f c0333f = c0329b3.f3822a;
                            c0333f.f3845c = i4;
                            c0333f.e(this, c0329b3);
                        } else {
                            z2 = true;
                        }
                        if (i3 > this.i / 2) {
                            z2 = true;
                        }
                        f3 = RecyclerView.f1949A0;
                        i2 = 1;
                    }
                }
            }
            i++;
        }
        r(c0331d);
        i();
    }

    public final void r(C0329b c0329b) {
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
            C0333f c0333f = c0329b.f3822a;
            if (c0333f != null) {
                this.h[c0333f.f3844b] = true;
            }
            C0333f d = c0329b.d(this.h);
            if (d != null) {
                boolean[] zArr = this.h;
                int i5 = d.f3844b;
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
                while (i6 < this.f3834j) {
                    C0329b c0329b2 = this.f3832f[i6];
                    if (c0329b2.f3822a.f3851l != i4 && !c0329b2.f3825e) {
                        C0328a c0328a = c0329b2.d;
                        int i8 = c0328a.h;
                        if (i8 != -1) {
                            for (int i9 = 0; i8 != -1 && i9 < c0328a.f3815a; i9++) {
                                if (c0328a.f3818e[i8] == d.f3844b) {
                                    z2 = true;
                                    break;
                                }
                                i8 = c0328a.f3819f[i8];
                            }
                        }
                        z2 = false;
                        if (z2) {
                            float c2 = c0329b2.d.c(d);
                            if (c2 < RecyclerView.f1949A0) {
                                float f3 = (-c0329b2.f3823b) / c2;
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
                    C0329b c0329b3 = this.f3832f[i7];
                    c0329b3.f3822a.f3845c = -1;
                    c0329b3.g(d);
                    C0333f c0333f2 = c0329b3.f3822a;
                    c0333f2.f3845c = i7;
                    c0333f2.e(this, c0329b3);
                }
            } else {
                z3 = true;
            }
            i = 0;
        }
    }

    public final void s() {
        for (int i = 0; i < this.f3834j; i++) {
            C0329b c0329b = this.f3832f[i];
            if (c0329b != null) {
                ((J.b) this.f3836l.f683a).b(c0329b);
            }
            this.f3832f[i] = null;
        }
    }

    public final void t() {
        C0019l c0019l;
        int i = 0;
        while (true) {
            c0019l = this.f3836l;
            C0333f[] c0333fArr = (C0333f[]) c0019l.f685c;
            if (i >= c0333fArr.length) {
                break;
            }
            C0333f c0333f = c0333fArr[i];
            if (c0333f != null) {
                c0333f.c();
            }
            i++;
        }
        J.b bVar = (J.b) c0019l.f684b;
        C0333f[] c0333fArr2 = this.f3837m;
        int i2 = this.f3838n;
        bVar.getClass();
        if (i2 > c0333fArr2.length) {
            i2 = c0333fArr2.length;
        }
        for (int i3 = 0; i3 < i2; i3++) {
            C0333f c0333f2 = c0333fArr2[i3];
            int i4 = bVar.f591b;
            Object[] objArr = bVar.f590a;
            if (i4 < objArr.length) {
                objArr[i4] = c0333f2;
                bVar.f591b = i4 + 1;
            }
        }
        this.f3838n = 0;
        Arrays.fill((C0333f[]) c0019l.f685c, (Object) null);
        this.f3829b = 0;
        C0331d c0331d = this.f3830c;
        c0331d.h = 0;
        c0331d.f3823b = RecyclerView.f1949A0;
        this.i = 1;
        for (int i5 = 0; i5 < this.f3834j; i5++) {
            C0329b c0329b = this.f3832f[i5];
        }
        s();
        this.f3834j = 0;
        this.f3839o = new C0329b(c0019l);
    }
}
