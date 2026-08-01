package q;

import E1.AbstractC0001b;
import K.C0019l;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;

/* renamed from: q.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0329b {
    public final C0328a d;

    /* renamed from: a, reason: collision with root package name */
    public C0333f f3822a = null;

    /* renamed from: b, reason: collision with root package name */
    public float f3823b = RecyclerView.f1949A0;

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f3824c = new ArrayList();

    /* renamed from: e, reason: collision with root package name */
    public boolean f3825e = false;

    public C0329b(C0019l c0019l) {
        this.d = new C0328a(this, c0019l);
    }

    public final void a(C0330c c0330c, int i) {
        this.d.g(c0330c.j(i), 1.0f);
        this.d.g(c0330c.j(i), -1.0f);
    }

    public final void b(C0333f c0333f, C0333f c0333f2, C0333f c0333f3, int i) {
        boolean z2 = false;
        if (i != 0) {
            if (i < 0) {
                i *= -1;
                z2 = true;
            }
            this.f3823b = i;
        }
        if (z2) {
            this.d.g(c0333f, 1.0f);
            this.d.g(c0333f2, -1.0f);
            this.d.g(c0333f3, -1.0f);
        } else {
            this.d.g(c0333f, -1.0f);
            this.d.g(c0333f2, 1.0f);
            this.d.g(c0333f3, 1.0f);
        }
    }

    public final void c(C0333f c0333f, C0333f c0333f2, C0333f c0333f3, int i) {
        boolean z2 = false;
        if (i != 0) {
            if (i < 0) {
                i *= -1;
                z2 = true;
            }
            this.f3823b = i;
        }
        if (z2) {
            this.d.g(c0333f, 1.0f);
            this.d.g(c0333f2, -1.0f);
            this.d.g(c0333f3, 1.0f);
        } else {
            this.d.g(c0333f, -1.0f);
            this.d.g(c0333f2, 1.0f);
            this.d.g(c0333f3, -1.0f);
        }
    }

    public C0333f d(boolean[] zArr) {
        return f(zArr, null);
    }

    public boolean e() {
        return this.f3822a == null && this.f3823b == RecyclerView.f1949A0 && this.d.d() == 0;
    }

    public final C0333f f(boolean[] zArr, C0333f c0333f) {
        int i;
        int d = this.d.d();
        C0333f c0333f2 = null;
        float f2 = 0.0f;
        for (int i2 = 0; i2 < d; i2++) {
            float f3 = this.d.f(i2);
            if (f3 < RecyclerView.f1949A0) {
                C0333f e2 = this.d.e(i2);
                if ((zArr == null || !zArr[e2.f3844b]) && e2 != c0333f && (((i = e2.f3851l) == 3 || i == 4) && f3 < f2)) {
                    f2 = f3;
                    c0333f2 = e2;
                }
            }
        }
        return c0333f2;
    }

    public final void g(C0333f c0333f) {
        C0333f c0333f2 = this.f3822a;
        if (c0333f2 != null) {
            this.d.g(c0333f2, -1.0f);
            this.f3822a.f3845c = -1;
            this.f3822a = null;
        }
        float h = this.d.h(c0333f, true) * (-1.0f);
        this.f3822a = c0333f;
        if (h == 1.0f) {
            return;
        }
        this.f3823b /= h;
        C0328a c0328a = this.d;
        int i = c0328a.h;
        for (int i2 = 0; i != -1 && i2 < c0328a.f3815a; i2++) {
            float[] fArr = c0328a.f3820g;
            fArr[i] = fArr[i] / h;
            i = c0328a.f3819f[i];
        }
    }

    public final void h(C0330c c0330c, C0333f c0333f, boolean z2) {
        if (c0333f == null || !c0333f.f3847f) {
            return;
        }
        float c2 = this.d.c(c0333f);
        this.f3823b = (c0333f.f3846e * c2) + this.f3823b;
        this.d.h(c0333f, z2);
        if (z2) {
            c0333f.b(this);
        }
        if (this.d.d() == 0) {
            this.f3825e = true;
            c0330c.f3828a = true;
        }
    }

    public void i(C0330c c0330c, C0329b c0329b, boolean z2) {
        C0328a c0328a = this.d;
        c0328a.getClass();
        float c2 = c0328a.c(c0329b.f3822a);
        c0328a.h(c0329b.f3822a, z2);
        C0328a c0328a2 = c0329b.d;
        int d = c0328a2.d();
        for (int i = 0; i < d; i++) {
            C0333f e2 = c0328a2.e(i);
            c0328a.a(e2, c0328a2.c(e2) * c2, z2);
        }
        this.f3823b = (c0329b.f3823b * c2) + this.f3823b;
        if (z2) {
            c0329b.f3822a.b(this);
        }
        if (this.f3822a == null || this.d.d() != 0) {
            return;
        }
        this.f3825e = true;
        c0330c.f3828a = true;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0085  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public String toString() {
        boolean z2;
        String g2 = AbstractC0001b.g(this.f3822a == null ? "0" : "" + this.f3822a, " = ");
        if (this.f3823b != RecyclerView.f1949A0) {
            g2 = g2 + this.f3823b;
            z2 = true;
        } else {
            z2 = false;
        }
        int d = this.d.d();
        for (int i = 0; i < d; i++) {
            C0333f e2 = this.d.e(i);
            if (e2 != null) {
                float f2 = this.d.f(i);
                if (f2 != RecyclerView.f1949A0) {
                    String c0333f = e2.toString();
                    if (!z2) {
                        if (f2 < RecyclerView.f1949A0) {
                            g2 = AbstractC0001b.g(g2, "- ");
                            f2 *= -1.0f;
                        }
                        g2 = f2 == 1.0f ? AbstractC0001b.g(g2, c0333f) : g2 + f2 + " " + c0333f;
                        z2 = true;
                    } else if (f2 > RecyclerView.f1949A0) {
                        g2 = AbstractC0001b.g(g2, " + ");
                        if (f2 == 1.0f) {
                        }
                        z2 = true;
                    } else {
                        g2 = AbstractC0001b.g(g2, " - ");
                        f2 *= -1.0f;
                        if (f2 == 1.0f) {
                        }
                        z2 = true;
                    }
                }
            }
        }
        return !z2 ? AbstractC0001b.g(g2, "0.0") : g2;
    }
}
