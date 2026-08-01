package q;

import B.j;
import K.C0014m;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Arrays;

/* renamed from: q.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0319c {

    /* renamed from: p, reason: collision with root package name */
    public static boolean f3442p = false;

    /* renamed from: q, reason: collision with root package name */
    public static int f3443q = 1000;

    /* renamed from: c, reason: collision with root package name */
    public final C0320d f3446c;

    /* renamed from: f, reason: collision with root package name */
    public C0318b[] f3448f;

    /* renamed from: l, reason: collision with root package name */
    public final C0014m f3452l;

    /* renamed from: o, reason: collision with root package name */
    public C0318b f3455o;

    /* renamed from: a, reason: collision with root package name */
    public boolean f3444a = false;

    /* renamed from: b, reason: collision with root package name */
    public int f3445b = 0;
    public int d = 32;

    /* renamed from: e, reason: collision with root package name */
    public int f3447e = 32;

    /* renamed from: g, reason: collision with root package name */
    public boolean f3449g = false;
    public boolean[] h = new boolean[32];
    public int i = 1;

    /* renamed from: j, reason: collision with root package name */
    public int f3450j = 0;

    /* renamed from: k, reason: collision with root package name */
    public int f3451k = 32;

    /* renamed from: m, reason: collision with root package name */
    public C0322f[] f3453m = new C0322f[f3443q];

    /* renamed from: n, reason: collision with root package name */
    public int f3454n = 0;

    public C0319c() {
        this.f3448f = null;
        this.f3448f = new C0318b[32];
        s();
        C0014m c0014m = new C0014m();
        c0014m.f424a = new J.b();
        c0014m.f425b = new J.b();
        c0014m.f426c = new C0322f[32];
        this.f3452l = c0014m;
        C0320d c0320d = new C0320d(c0014m);
        c0320d.f3456f = new C0322f[128];
        c0320d.f3457g = new C0322f[128];
        c0320d.h = 0;
        c0320d.i = new j(c0320d);
        this.f3446c = c0320d;
        this.f3455o = new C0318b(c0014m);
    }

    public static int n(Object obj) {
        C0322f c0322f = ((s.c) obj).i;
        if (c0322f != null) {
            return (int) (c0322f.f3461e + 0.5f);
        }
        return 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r4v0 */
    public final C0322f a(int i) {
        J.b bVar = (J.b) this.f3452l.f425b;
        int i2 = bVar.f351b;
        C0322f c0322f = null;
        if (i2 > 0) {
            int i3 = i2 - 1;
            ?? r3 = bVar.f350a;
            ?? r4 = r3[i3];
            r3[i3] = 0;
            bVar.f351b = i3;
            c0322f = r4;
        }
        C0322f c0322f2 = c0322f;
        if (c0322f2 == null) {
            c0322f2 = new C0322f(i);
            c0322f2.f3466l = i;
        } else {
            c0322f2.c();
            c0322f2.f3466l = i;
        }
        int i4 = this.f3454n;
        int i5 = f3443q;
        if (i4 >= i5) {
            int i6 = i5 * 2;
            f3443q = i6;
            this.f3453m = (C0322f[]) Arrays.copyOf(this.f3453m, i6);
        }
        C0322f[] c0322fArr = this.f3453m;
        int i7 = this.f3454n;
        this.f3454n = i7 + 1;
        c0322fArr[i7] = c0322f2;
        return c0322f2;
    }

    public final void b(C0322f c0322f, C0322f c0322f2, int i, float f2, C0322f c0322f3, C0322f c0322f4, int i2, int i3) {
        C0318b l2 = l();
        if (c0322f2 == c0322f3) {
            l2.d.g(c0322f, 1.0f);
            l2.d.g(c0322f4, 1.0f);
            l2.d.g(c0322f2, -2.0f);
        } else if (f2 == 0.5f) {
            l2.d.g(c0322f, 1.0f);
            l2.d.g(c0322f2, -1.0f);
            l2.d.g(c0322f3, -1.0f);
            l2.d.g(c0322f4, 1.0f);
            if (i > 0 || i2 > 0) {
                l2.f3439b = (-i) + i2;
            }
        } else if (f2 <= RecyclerView.f1570A0) {
            l2.d.g(c0322f, -1.0f);
            l2.d.g(c0322f2, 1.0f);
            l2.f3439b = i;
        } else if (f2 >= 1.0f) {
            l2.d.g(c0322f4, -1.0f);
            l2.d.g(c0322f3, 1.0f);
            l2.f3439b = -i2;
        } else {
            float f3 = 1.0f - f2;
            l2.d.g(c0322f, f3 * 1.0f);
            l2.d.g(c0322f2, f3 * (-1.0f));
            l2.d.g(c0322f3, (-1.0f) * f2);
            l2.d.g(c0322f4, 1.0f * f2);
            if (i > 0 || i2 > 0) {
                l2.f3439b = (i2 * f2) + ((-i) * f3);
            }
        }
        if (i3 != 8) {
            l2.a(this, i3);
        }
        c(l2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:68:0x00d0, code lost:
    
        if (r4.f3465k <= 1) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x00d3, code lost:
    
        r12 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x00dd, code lost:
    
        if (r4.f3465k <= 1) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x00f2, code lost:
    
        if (r4.f3465k <= 1) goto L87;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x00f5, code lost:
    
        r14 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x00ff, code lost:
    
        if (r4.f3465k <= 1) goto L87;
     */
    /* JADX WARN: Removed duplicated region for block: B:137:0x01ae  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x01b9 A[ORIG_RETURN, RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void c(C0318b c0318b) {
        boolean z2;
        boolean z3;
        C0322f c0322f;
        C0322f f2;
        ArrayList arrayList;
        if (this.f3450j + 1 >= this.f3451k || this.i + 1 >= this.f3447e) {
            o();
        }
        if (c0318b.f3441e) {
            z2 = false;
        } else {
            if (this.f3448f.length != 0) {
                boolean z4 = false;
                while (!z4) {
                    int d = c0318b.d.d();
                    int i = 0;
                    while (true) {
                        arrayList = c0318b.f3440c;
                        if (i >= d) {
                            break;
                        }
                        C0322f e2 = c0318b.d.e(i);
                        if (e2.f3460c != -1 || e2.f3462f) {
                            arrayList.add(e2);
                        }
                        i++;
                    }
                    int size = arrayList.size();
                    if (size > 0) {
                        for (int i2 = 0; i2 < size; i2++) {
                            C0322f c0322f2 = (C0322f) arrayList.get(i2);
                            if (c0322f2.f3462f) {
                                c0318b.h(this, c0322f2, true);
                            } else {
                                c0318b.i(this, this.f3448f[c0322f2.f3460c], true);
                            }
                        }
                        arrayList.clear();
                    } else {
                        z4 = true;
                    }
                }
                if (c0318b.f3438a != null && c0318b.d.d() == 0) {
                    c0318b.f3441e = true;
                    this.f3444a = true;
                }
            }
            if (c0318b.e()) {
                return;
            }
            float f3 = c0318b.f3439b;
            if (f3 < RecyclerView.f1570A0) {
                c0318b.f3439b = f3 * (-1.0f);
                C0317a c0317a = c0318b.d;
                int i3 = c0317a.h;
                for (int i4 = 0; i3 != -1 && i4 < c0317a.f3431a; i4++) {
                    float[] fArr = c0317a.f3436g;
                    fArr[i3] = fArr[i3] * (-1.0f);
                    i3 = c0317a.f3435f[i3];
                }
            }
            int d2 = c0318b.d.d();
            float f4 = 0.0f;
            float f5 = 0.0f;
            C0322f c0322f3 = null;
            C0322f c0322f4 = null;
            boolean z5 = false;
            boolean z6 = false;
            for (int i5 = 0; i5 < d2; i5++) {
                float f6 = c0318b.d.f(i5);
                C0322f e3 = c0318b.d.e(i5);
                if (e3.f3466l == 1) {
                    if (c0322f3 != null) {
                        if (f4 <= f6) {
                            if (!z5) {
                                if (e3.f3465k > 1) {
                                }
                            }
                        }
                        z5 = true;
                    }
                    c0322f3 = e3;
                    f4 = f6;
                } else if (c0322f3 == null && f6 < RecyclerView.f1570A0) {
                    if (c0322f4 != null) {
                        if (f5 <= f6) {
                            if (!z6) {
                                if (e3.f3465k > 1) {
                                }
                            }
                        }
                        z6 = true;
                    }
                    c0322f4 = e3;
                    f5 = f6;
                }
            }
            if (c0322f3 == null) {
                c0322f3 = c0322f4;
            }
            if (c0322f3 == null) {
                z3 = true;
            } else {
                c0318b.g(c0322f3);
                z3 = false;
            }
            if (c0318b.d.d() == 0) {
                c0318b.f3441e = true;
            }
            if (z3) {
                if (this.i + 1 >= this.f3447e) {
                    o();
                }
                C0322f a2 = a(3);
                int i6 = this.f3445b + 1;
                this.f3445b = i6;
                this.i++;
                a2.f3459b = i6;
                C0014m c0014m = this.f3452l;
                ((C0322f[]) c0014m.f426c)[i6] = a2;
                c0318b.f3438a = a2;
                int i7 = this.f3450j;
                h(c0318b);
                if (this.f3450j == i7 + 1) {
                    C0318b c0318b2 = this.f3455o;
                    c0318b2.f3438a = null;
                    c0318b2.d.b();
                    for (int i8 = 0; i8 < c0318b.d.d(); i8++) {
                        c0318b2.d.a(c0318b.d.e(i8), c0318b.d.f(i8), true);
                    }
                    r(this.f3455o);
                    if (a2.f3460c == -1) {
                        if (c0318b.f3438a == a2 && (f2 = c0318b.f(null, a2)) != null) {
                            c0318b.g(f2);
                        }
                        if (!c0318b.f3441e) {
                            c0318b.f3438a.e(this, c0318b);
                        }
                        ((J.b) c0014m.f424a).b(c0318b);
                        this.f3450j--;
                    }
                    z2 = true;
                    c0322f = c0318b.f3438a;
                    if (c0322f != null) {
                        return;
                    }
                    if (c0322f.f3466l != 1 && c0318b.f3439b < RecyclerView.f1570A0) {
                        return;
                    }
                }
            }
            z2 = false;
            c0322f = c0318b.f3438a;
            if (c0322f != null) {
            }
        }
        if (z2) {
            return;
        }
        h(c0318b);
    }

    public final void d(C0322f c0322f, int i) {
        int i2 = c0322f.f3460c;
        if (i2 == -1) {
            c0322f.d(this, i);
            for (int i3 = 0; i3 < this.f3445b + 1; i3++) {
                C0322f c0322f2 = ((C0322f[]) this.f3452l.f426c)[i3];
            }
            return;
        }
        if (i2 == -1) {
            C0318b l2 = l();
            l2.f3438a = c0322f;
            float f2 = i;
            c0322f.f3461e = f2;
            l2.f3439b = f2;
            l2.f3441e = true;
            c(l2);
            return;
        }
        C0318b c0318b = this.f3448f[i2];
        if (c0318b.f3441e) {
            c0318b.f3439b = i;
            return;
        }
        if (c0318b.d.d() == 0) {
            c0318b.f3441e = true;
            c0318b.f3439b = i;
            return;
        }
        C0318b l3 = l();
        if (i < 0) {
            l3.f3439b = i * (-1);
            l3.d.g(c0322f, 1.0f);
        } else {
            l3.f3439b = i;
            l3.d.g(c0322f, -1.0f);
        }
        c(l3);
    }

    public final void e(C0322f c0322f, C0322f c0322f2, int i, int i2) {
        if (i2 == 8 && c0322f2.f3462f && c0322f.f3460c == -1) {
            c0322f.d(this, c0322f2.f3461e + i);
            return;
        }
        C0318b l2 = l();
        boolean z2 = false;
        if (i != 0) {
            if (i < 0) {
                i *= -1;
                z2 = true;
            }
            l2.f3439b = i;
        }
        if (z2) {
            l2.d.g(c0322f, 1.0f);
            l2.d.g(c0322f2, -1.0f);
        } else {
            l2.d.g(c0322f, -1.0f);
            l2.d.g(c0322f2, 1.0f);
        }
        if (i2 != 8) {
            l2.a(this, i2);
        }
        c(l2);
    }

    public final void f(C0322f c0322f, C0322f c0322f2, int i, int i2) {
        C0318b l2 = l();
        C0322f m2 = m();
        m2.d = 0;
        l2.b(c0322f, c0322f2, m2, i);
        if (i2 != 8) {
            l2.d.g(j(i2), (int) (l2.d.c(m2) * (-1.0f)));
        }
        c(l2);
    }

    public final void g(C0322f c0322f, C0322f c0322f2, int i, int i2) {
        C0318b l2 = l();
        C0322f m2 = m();
        m2.d = 0;
        l2.c(c0322f, c0322f2, m2, i);
        if (i2 != 8) {
            l2.d.g(j(i2), (int) (l2.d.c(m2) * (-1.0f)));
        }
        c(l2);
    }

    public final void h(C0318b c0318b) {
        int i;
        if (c0318b.f3441e) {
            c0318b.f3438a.d(this, c0318b.f3439b);
        } else {
            C0318b[] c0318bArr = this.f3448f;
            int i2 = this.f3450j;
            c0318bArr[i2] = c0318b;
            C0322f c0322f = c0318b.f3438a;
            c0322f.f3460c = i2;
            this.f3450j = i2 + 1;
            c0322f.e(this, c0318b);
        }
        if (this.f3444a) {
            int i3 = 0;
            while (i3 < this.f3450j) {
                if (this.f3448f[i3] == null) {
                    System.out.println("WTF");
                }
                C0318b c0318b2 = this.f3448f[i3];
                if (c0318b2 != null && c0318b2.f3441e) {
                    c0318b2.f3438a.d(this, c0318b2.f3439b);
                    ((J.b) this.f3452l.f424a).b(c0318b2);
                    this.f3448f[i3] = null;
                    int i4 = i3 + 1;
                    int i5 = i4;
                    while (true) {
                        i = this.f3450j;
                        if (i4 >= i) {
                            break;
                        }
                        C0318b[] c0318bArr2 = this.f3448f;
                        int i6 = i4 - 1;
                        C0318b c0318b3 = c0318bArr2[i4];
                        c0318bArr2[i6] = c0318b3;
                        C0322f c0322f2 = c0318b3.f3438a;
                        if (c0322f2.f3460c == i4) {
                            c0322f2.f3460c = i6;
                        }
                        i5 = i4;
                        i4++;
                    }
                    if (i5 < i) {
                        this.f3448f[i5] = null;
                    }
                    this.f3450j = i - 1;
                    i3--;
                }
                i3++;
            }
            this.f3444a = false;
        }
    }

    public final void i() {
        for (int i = 0; i < this.f3450j; i++) {
            C0318b c0318b = this.f3448f[i];
            c0318b.f3438a.f3461e = c0318b.f3439b;
        }
    }

    public final C0322f j(int i) {
        if (this.i + 1 >= this.f3447e) {
            o();
        }
        C0322f a2 = a(4);
        int i2 = this.f3445b + 1;
        this.f3445b = i2;
        this.i++;
        a2.f3459b = i2;
        a2.d = i;
        ((C0322f[]) this.f3452l.f426c)[i2] = a2;
        C0320d c0320d = this.f3446c;
        c0320d.i.f56b = a2;
        float[] fArr = a2.h;
        Arrays.fill(fArr, RecyclerView.f1570A0);
        fArr[a2.d] = 1.0f;
        c0320d.j(a2);
        return a2;
    }

    public final C0322f k(Object obj) {
        C0322f c0322f = null;
        if (obj == null) {
            return null;
        }
        if (this.i + 1 >= this.f3447e) {
            o();
        }
        if (obj instanceof s.c) {
            s.c cVar = (s.c) obj;
            c0322f = cVar.i;
            if (c0322f == null) {
                cVar.k();
                c0322f = cVar.i;
            }
            int i = c0322f.f3459b;
            C0014m c0014m = this.f3452l;
            if (i == -1 || i > this.f3445b || ((C0322f[]) c0014m.f426c)[i] == null) {
                if (i != -1) {
                    c0322f.c();
                }
                int i2 = this.f3445b + 1;
                this.f3445b = i2;
                this.i++;
                c0322f.f3459b = i2;
                c0322f.f3466l = 1;
                ((C0322f[]) c0014m.f426c)[i2] = c0322f;
            }
        }
        return c0322f;
    }

    public final C0318b l() {
        Object obj;
        C0014m c0014m = this.f3452l;
        J.b bVar = (J.b) c0014m.f424a;
        int i = bVar.f351b;
        if (i > 0) {
            int i2 = i - 1;
            Object[] objArr = bVar.f350a;
            obj = objArr[i2];
            objArr[i2] = null;
            bVar.f351b = i2;
        } else {
            obj = null;
        }
        C0318b c0318b = (C0318b) obj;
        if (c0318b == null) {
            return new C0318b(c0014m);
        }
        c0318b.f3438a = null;
        c0318b.d.b();
        c0318b.f3439b = RecyclerView.f1570A0;
        c0318b.f3441e = false;
        return c0318b;
    }

    public final C0322f m() {
        if (this.i + 1 >= this.f3447e) {
            o();
        }
        C0322f a2 = a(3);
        int i = this.f3445b + 1;
        this.f3445b = i;
        this.i++;
        a2.f3459b = i;
        ((C0322f[]) this.f3452l.f426c)[i] = a2;
        return a2;
    }

    public final void o() {
        int i = this.d * 2;
        this.d = i;
        this.f3448f = (C0318b[]) Arrays.copyOf(this.f3448f, i);
        C0014m c0014m = this.f3452l;
        c0014m.f426c = (C0322f[]) Arrays.copyOf((C0322f[]) c0014m.f426c, this.d);
        int i2 = this.d;
        this.h = new boolean[i2];
        this.f3447e = i2;
        this.f3451k = i2;
    }

    public final void p() {
        C0320d c0320d = this.f3446c;
        if (c0320d.e()) {
            i();
            return;
        }
        if (!this.f3449g) {
            q(c0320d);
            return;
        }
        for (int i = 0; i < this.f3450j; i++) {
            if (!this.f3448f[i].f3441e) {
                q(c0320d);
                return;
            }
        }
        i();
    }

    public final void q(C0320d c0320d) {
        int i = 0;
        while (true) {
            if (i >= this.f3450j) {
                break;
            }
            C0318b c0318b = this.f3448f[i];
            int i2 = 1;
            if (c0318b.f3438a.f3466l != 1) {
                float f2 = c0318b.f3439b;
                float f3 = RecyclerView.f1570A0;
                if (f2 < RecyclerView.f1570A0) {
                    boolean z2 = false;
                    int i3 = 0;
                    while (!z2) {
                        i3 += i2;
                        float f4 = Float.MAX_VALUE;
                        int i4 = -1;
                        int i5 = -1;
                        int i6 = 0;
                        int i7 = 0;
                        while (i6 < this.f3450j) {
                            C0318b c0318b2 = this.f3448f[i6];
                            if (c0318b2.f3438a.f3466l != i2 && !c0318b2.f3441e && c0318b2.f3439b < f3) {
                                int d = c0318b2.d.d();
                                int i8 = 0;
                                while (i8 < d) {
                                    C0322f e2 = c0318b2.d.e(i8);
                                    float c2 = c0318b2.d.c(e2);
                                    if (c2 > f3) {
                                        for (int i9 = 0; i9 < 9; i9++) {
                                            float f5 = e2.f3463g[i9] / c2;
                                            if ((f5 < f4 && i9 == i7) || i9 > i7) {
                                                i7 = i9;
                                                i5 = e2.f3459b;
                                                i4 = i6;
                                                f4 = f5;
                                            }
                                        }
                                    }
                                    i8++;
                                    f3 = RecyclerView.f1570A0;
                                }
                            }
                            i6++;
                            f3 = RecyclerView.f1570A0;
                            i2 = 1;
                        }
                        if (i4 != -1) {
                            C0318b c0318b3 = this.f3448f[i4];
                            c0318b3.f3438a.f3460c = -1;
                            c0318b3.g(((C0322f[]) this.f3452l.f426c)[i5]);
                            C0322f c0322f = c0318b3.f3438a;
                            c0322f.f3460c = i4;
                            c0322f.e(this, c0318b3);
                        } else {
                            z2 = true;
                        }
                        if (i3 > this.i / 2) {
                            z2 = true;
                        }
                        f3 = RecyclerView.f1570A0;
                        i2 = 1;
                    }
                }
            }
            i++;
        }
        r(c0320d);
        i();
    }

    public final void r(C0318b c0318b) {
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
            C0322f c0322f = c0318b.f3438a;
            if (c0322f != null) {
                this.h[c0322f.f3459b] = true;
            }
            C0322f d = c0318b.d(this.h);
            if (d != null) {
                boolean[] zArr = this.h;
                int i5 = d.f3459b;
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
                while (i6 < this.f3450j) {
                    C0318b c0318b2 = this.f3448f[i6];
                    if (c0318b2.f3438a.f3466l != i4 && !c0318b2.f3441e) {
                        C0317a c0317a = c0318b2.d;
                        int i8 = c0317a.h;
                        if (i8 != -1) {
                            for (int i9 = 0; i8 != -1 && i9 < c0317a.f3431a; i9++) {
                                if (c0317a.f3434e[i8] == d.f3459b) {
                                    z2 = true;
                                    break;
                                }
                                i8 = c0317a.f3435f[i8];
                            }
                        }
                        z2 = false;
                        if (z2) {
                            float c2 = c0318b2.d.c(d);
                            if (c2 < RecyclerView.f1570A0) {
                                float f3 = (-c0318b2.f3439b) / c2;
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
                    C0318b c0318b3 = this.f3448f[i7];
                    c0318b3.f3438a.f3460c = -1;
                    c0318b3.g(d);
                    C0322f c0322f2 = c0318b3.f3438a;
                    c0322f2.f3460c = i7;
                    c0322f2.e(this, c0318b3);
                }
            } else {
                z3 = true;
            }
            i = 0;
        }
    }

    public final void s() {
        for (int i = 0; i < this.f3450j; i++) {
            C0318b c0318b = this.f3448f[i];
            if (c0318b != null) {
                ((J.b) this.f3452l.f424a).b(c0318b);
            }
            this.f3448f[i] = null;
        }
    }

    public final void t() {
        C0014m c0014m;
        int i = 0;
        while (true) {
            c0014m = this.f3452l;
            C0322f[] c0322fArr = (C0322f[]) c0014m.f426c;
            if (i >= c0322fArr.length) {
                break;
            }
            C0322f c0322f = c0322fArr[i];
            if (c0322f != null) {
                c0322f.c();
            }
            i++;
        }
        J.b bVar = (J.b) c0014m.f425b;
        C0322f[] c0322fArr2 = this.f3453m;
        int i2 = this.f3454n;
        bVar.getClass();
        if (i2 > c0322fArr2.length) {
            i2 = c0322fArr2.length;
        }
        for (int i3 = 0; i3 < i2; i3++) {
            C0322f c0322f2 = c0322fArr2[i3];
            int i4 = bVar.f351b;
            Object[] objArr = bVar.f350a;
            if (i4 < objArr.length) {
                objArr[i4] = c0322f2;
                bVar.f351b = i4 + 1;
            }
        }
        this.f3454n = 0;
        Arrays.fill((C0322f[]) c0014m.f426c, (Object) null);
        this.f3445b = 0;
        C0320d c0320d = this.f3446c;
        c0320d.h = 0;
        c0320d.f3439b = RecyclerView.f1570A0;
        this.i = 1;
        for (int i5 = 0; i5 < this.f3450j; i5++) {
            C0318b c0318b = this.f3448f[i5];
        }
        s();
        this.f3450j = 0;
        this.f3455o = new C0318b(c0014m);
    }
}
