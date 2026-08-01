package q;

import K.C0012l;
import X.V;
import java.util.ArrayList;

/* renamed from: q.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0288b {
    public final C0287a d;

    /* renamed from: a, reason: collision with root package name */
    public C0292f f3521a = null;

    /* renamed from: b, reason: collision with root package name */
    public float f3522b = 0.0f;

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f3523c = new ArrayList();

    /* renamed from: e, reason: collision with root package name */
    public boolean f3524e = false;

    public C0288b(C0012l c0012l) {
        this.d = new C0287a(this, c0012l);
    }

    public final void a(C0289c c0289c, int i) {
        this.d.g(c0289c.j(i), 1.0f);
        this.d.g(c0289c.j(i), -1.0f);
    }

    public final void b(C0292f c0292f, C0292f c0292f2, C0292f c0292f3, int i) {
        boolean z2 = false;
        if (i != 0) {
            if (i < 0) {
                i *= -1;
                z2 = true;
            }
            this.f3522b = i;
        }
        if (z2) {
            this.d.g(c0292f, 1.0f);
            this.d.g(c0292f2, -1.0f);
            this.d.g(c0292f3, -1.0f);
        } else {
            this.d.g(c0292f, -1.0f);
            this.d.g(c0292f2, 1.0f);
            this.d.g(c0292f3, 1.0f);
        }
    }

    public final void c(C0292f c0292f, C0292f c0292f2, C0292f c0292f3, int i) {
        boolean z2 = false;
        if (i != 0) {
            if (i < 0) {
                i *= -1;
                z2 = true;
            }
            this.f3522b = i;
        }
        if (z2) {
            this.d.g(c0292f, 1.0f);
            this.d.g(c0292f2, -1.0f);
            this.d.g(c0292f3, 1.0f);
        } else {
            this.d.g(c0292f, -1.0f);
            this.d.g(c0292f2, 1.0f);
            this.d.g(c0292f3, -1.0f);
        }
    }

    public C0292f d(boolean[] zArr) {
        return f(zArr, null);
    }

    public boolean e() {
        return this.f3521a == null && this.f3522b == 0.0f && this.d.d() == 0;
    }

    public final C0292f f(boolean[] zArr, C0292f c0292f) {
        int i;
        int d = this.d.d();
        C0292f c0292f2 = null;
        float f2 = 0.0f;
        for (int i2 = 0; i2 < d; i2++) {
            float f3 = this.d.f(i2);
            if (f3 < 0.0f) {
                C0292f e2 = this.d.e(i2);
                if ((zArr == null || !zArr[e2.f3543b]) && e2 != c0292f && (((i = e2.f3550l) == 3 || i == 4) && f3 < f2)) {
                    f2 = f3;
                    c0292f2 = e2;
                }
            }
        }
        return c0292f2;
    }

    public final void g(C0292f c0292f) {
        C0292f c0292f2 = this.f3521a;
        if (c0292f2 != null) {
            this.d.g(c0292f2, -1.0f);
            this.f3521a.f3544c = -1;
            this.f3521a = null;
        }
        float h = this.d.h(c0292f, true) * (-1.0f);
        this.f3521a = c0292f;
        if (h == 1.0f) {
            return;
        }
        this.f3522b /= h;
        C0287a c0287a = this.d;
        int i = c0287a.h;
        for (int i2 = 0; i != -1 && i2 < c0287a.f3514a; i2++) {
            float[] fArr = c0287a.f3519g;
            fArr[i] = fArr[i] / h;
            i = c0287a.f3518f[i];
        }
    }

    public final void h(C0289c c0289c, C0292f c0292f, boolean z2) {
        if (c0292f == null || !c0292f.f3546f) {
            return;
        }
        float c2 = this.d.c(c0292f);
        this.f3522b = (c0292f.f3545e * c2) + this.f3522b;
        this.d.h(c0292f, z2);
        if (z2) {
            c0292f.b(this);
        }
        if (this.d.d() == 0) {
            this.f3524e = true;
            c0289c.f3527a = true;
        }
    }

    public void i(C0289c c0289c, C0288b c0288b, boolean z2) {
        C0287a c0287a = this.d;
        c0287a.getClass();
        float c2 = c0287a.c(c0288b.f3521a);
        c0287a.h(c0288b.f3521a, z2);
        C0287a c0287a2 = c0288b.d;
        int d = c0287a2.d();
        for (int i = 0; i < d; i++) {
            C0292f e2 = c0287a2.e(i);
            c0287a.a(e2, c0287a2.c(e2) * c2, z2);
        }
        this.f3522b = (c0288b.f3522b * c2) + this.f3522b;
        if (z2) {
            c0288b.f3521a.b(this);
        }
        if (this.f3521a == null || this.d.d() != 0) {
            return;
        }
        this.f3524e = true;
        c0289c.f3527a = true;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0085  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public String toString() {
        boolean z2;
        String e2 = V.e(this.f3521a == null ? "0" : "" + this.f3521a, " = ");
        if (this.f3522b != 0.0f) {
            e2 = e2 + this.f3522b;
            z2 = true;
        } else {
            z2 = false;
        }
        int d = this.d.d();
        for (int i = 0; i < d; i++) {
            C0292f e3 = this.d.e(i);
            if (e3 != null) {
                float f2 = this.d.f(i);
                if (f2 != 0.0f) {
                    String c0292f = e3.toString();
                    if (!z2) {
                        if (f2 < 0.0f) {
                            e2 = V.e(e2, "- ");
                            f2 *= -1.0f;
                        }
                        e2 = f2 == 1.0f ? V.e(e2, c0292f) : e2 + f2 + " " + c0292f;
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
