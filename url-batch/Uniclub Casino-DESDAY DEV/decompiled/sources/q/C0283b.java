package q;

import K.C0011l;
import X.V;
import java.util.ArrayList;

/* renamed from: q.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0283b {
    public final C0282a d;

    /* renamed from: a, reason: collision with root package name */
    public C0287f f3520a = null;

    /* renamed from: b, reason: collision with root package name */
    public float f3521b = 0.0f;

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f3522c = new ArrayList();

    /* renamed from: e, reason: collision with root package name */
    public boolean f3523e = false;

    public C0283b(C0011l c0011l) {
        this.d = new C0282a(this, c0011l);
    }

    public final void a(C0284c c0284c, int i) {
        this.d.g(c0284c.j(i), 1.0f);
        this.d.g(c0284c.j(i), -1.0f);
    }

    public final void b(C0287f c0287f, C0287f c0287f2, C0287f c0287f3, int i) {
        boolean z2 = false;
        if (i != 0) {
            if (i < 0) {
                i *= -1;
                z2 = true;
            }
            this.f3521b = i;
        }
        if (z2) {
            this.d.g(c0287f, 1.0f);
            this.d.g(c0287f2, -1.0f);
            this.d.g(c0287f3, -1.0f);
        } else {
            this.d.g(c0287f, -1.0f);
            this.d.g(c0287f2, 1.0f);
            this.d.g(c0287f3, 1.0f);
        }
    }

    public final void c(C0287f c0287f, C0287f c0287f2, C0287f c0287f3, int i) {
        boolean z2 = false;
        if (i != 0) {
            if (i < 0) {
                i *= -1;
                z2 = true;
            }
            this.f3521b = i;
        }
        if (z2) {
            this.d.g(c0287f, 1.0f);
            this.d.g(c0287f2, -1.0f);
            this.d.g(c0287f3, 1.0f);
        } else {
            this.d.g(c0287f, -1.0f);
            this.d.g(c0287f2, 1.0f);
            this.d.g(c0287f3, -1.0f);
        }
    }

    public C0287f d(boolean[] zArr) {
        return f(zArr, null);
    }

    public boolean e() {
        return this.f3520a == null && this.f3521b == 0.0f && this.d.d() == 0;
    }

    public final C0287f f(boolean[] zArr, C0287f c0287f) {
        int i;
        int d = this.d.d();
        C0287f c0287f2 = null;
        float f2 = 0.0f;
        for (int i2 = 0; i2 < d; i2++) {
            float f3 = this.d.f(i2);
            if (f3 < 0.0f) {
                C0287f e2 = this.d.e(i2);
                if ((zArr == null || !zArr[e2.f3542b]) && e2 != c0287f && (((i = e2.f3549l) == 3 || i == 4) && f3 < f2)) {
                    f2 = f3;
                    c0287f2 = e2;
                }
            }
        }
        return c0287f2;
    }

    public final void g(C0287f c0287f) {
        C0287f c0287f2 = this.f3520a;
        if (c0287f2 != null) {
            this.d.g(c0287f2, -1.0f);
            this.f3520a.f3543c = -1;
            this.f3520a = null;
        }
        float h = this.d.h(c0287f, true) * (-1.0f);
        this.f3520a = c0287f;
        if (h == 1.0f) {
            return;
        }
        this.f3521b /= h;
        C0282a c0282a = this.d;
        int i = c0282a.h;
        for (int i2 = 0; i != -1 && i2 < c0282a.f3513a; i2++) {
            float[] fArr = c0282a.f3518g;
            fArr[i] = fArr[i] / h;
            i = c0282a.f3517f[i];
        }
    }

    public final void h(C0284c c0284c, C0287f c0287f, boolean z2) {
        if (c0287f == null || !c0287f.f3545f) {
            return;
        }
        float c2 = this.d.c(c0287f);
        this.f3521b = (c0287f.f3544e * c2) + this.f3521b;
        this.d.h(c0287f, z2);
        if (z2) {
            c0287f.b(this);
        }
        if (this.d.d() == 0) {
            this.f3523e = true;
            c0284c.f3526a = true;
        }
    }

    public void i(C0284c c0284c, C0283b c0283b, boolean z2) {
        C0282a c0282a = this.d;
        c0282a.getClass();
        float c2 = c0282a.c(c0283b.f3520a);
        c0282a.h(c0283b.f3520a, z2);
        C0282a c0282a2 = c0283b.d;
        int d = c0282a2.d();
        for (int i = 0; i < d; i++) {
            C0287f e2 = c0282a2.e(i);
            c0282a.a(e2, c0282a2.c(e2) * c2, z2);
        }
        this.f3521b = (c0283b.f3521b * c2) + this.f3521b;
        if (z2) {
            c0283b.f3520a.b(this);
        }
        if (this.f3520a == null || this.d.d() != 0) {
            return;
        }
        this.f3523e = true;
        c0284c.f3526a = true;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0085  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public String toString() {
        boolean z2;
        String e2 = V.e(this.f3520a == null ? "0" : "" + this.f3520a, " = ");
        if (this.f3521b != 0.0f) {
            e2 = e2 + this.f3521b;
            z2 = true;
        } else {
            z2 = false;
        }
        int d = this.d.d();
        for (int i = 0; i < d; i++) {
            C0287f e3 = this.d.e(i);
            if (e3 != null) {
                float f2 = this.d.f(i);
                if (f2 != 0.0f) {
                    String c0287f = e3.toString();
                    if (!z2) {
                        if (f2 < 0.0f) {
                            e2 = V.e(e2, "- ");
                            f2 *= -1.0f;
                        }
                        e2 = f2 == 1.0f ? V.e(e2, c0287f) : e2 + f2 + " " + c0287f;
                        z2 = true;
                    } else if (f2 > 0.0f) {
                        e2 = V.e(e2, " + ");
                        if (f2 == 1.0f) {
                        }
                        z2 = true;
                    } else {
                        e2 = V.e(e2, " - ");
                        f2 *= -1.0f;
                        if (f2 == 1.0f) {
                        }
                        z2 = true;
                    }
                }
            }
        }
        return !z2 ? V.e(e2, "0.0") : e2;
    }
}
