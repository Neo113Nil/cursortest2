package q;

import K.C0014m;
import Y.V;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;

/* renamed from: q.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0318b {
    public final C0317a d;

    /* renamed from: a, reason: collision with root package name */
    public C0322f f3438a = null;

    /* renamed from: b, reason: collision with root package name */
    public float f3439b = RecyclerView.f1570A0;

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f3440c = new ArrayList();

    /* renamed from: e, reason: collision with root package name */
    public boolean f3441e = false;

    public C0318b(C0014m c0014m) {
        this.d = new C0317a(this, c0014m);
    }

    public final void a(C0319c c0319c, int i) {
        this.d.g(c0319c.j(i), 1.0f);
        this.d.g(c0319c.j(i), -1.0f);
    }

    public final void b(C0322f c0322f, C0322f c0322f2, C0322f c0322f3, int i) {
        boolean z2 = false;
        if (i != 0) {
            if (i < 0) {
                i *= -1;
                z2 = true;
            }
            this.f3439b = i;
        }
        if (z2) {
            this.d.g(c0322f, 1.0f);
            this.d.g(c0322f2, -1.0f);
            this.d.g(c0322f3, -1.0f);
        } else {
            this.d.g(c0322f, -1.0f);
            this.d.g(c0322f2, 1.0f);
            this.d.g(c0322f3, 1.0f);
        }
    }

    public final void c(C0322f c0322f, C0322f c0322f2, C0322f c0322f3, int i) {
        boolean z2 = false;
        if (i != 0) {
            if (i < 0) {
                i *= -1;
                z2 = true;
            }
            this.f3439b = i;
        }
        if (z2) {
            this.d.g(c0322f, 1.0f);
            this.d.g(c0322f2, -1.0f);
            this.d.g(c0322f3, 1.0f);
        } else {
            this.d.g(c0322f, -1.0f);
            this.d.g(c0322f2, 1.0f);
            this.d.g(c0322f3, -1.0f);
        }
    }

    public C0322f d(boolean[] zArr) {
        return f(zArr, null);
    }

    public boolean e() {
        return this.f3438a == null && this.f3439b == RecyclerView.f1570A0 && this.d.d() == 0;
    }

    public final C0322f f(boolean[] zArr, C0322f c0322f) {
        int i;
        int d = this.d.d();
        C0322f c0322f2 = null;
        float f2 = 0.0f;
        for (int i2 = 0; i2 < d; i2++) {
            float f3 = this.d.f(i2);
            if (f3 < RecyclerView.f1570A0) {
                C0322f e2 = this.d.e(i2);
                if ((zArr == null || !zArr[e2.f3459b]) && e2 != c0322f && (((i = e2.f3466l) == 3 || i == 4) && f3 < f2)) {
                    f2 = f3;
                    c0322f2 = e2;
                }
            }
        }
        return c0322f2;
    }

    public final void g(C0322f c0322f) {
        C0322f c0322f2 = this.f3438a;
        if (c0322f2 != null) {
            this.d.g(c0322f2, -1.0f);
            this.f3438a.f3460c = -1;
            this.f3438a = null;
        }
        float h = this.d.h(c0322f, true) * (-1.0f);
        this.f3438a = c0322f;
        if (h == 1.0f) {
            return;
        }
        this.f3439b /= h;
        C0317a c0317a = this.d;
        int i = c0317a.h;
        for (int i2 = 0; i != -1 && i2 < c0317a.f3431a; i2++) {
            float[] fArr = c0317a.f3436g;
            fArr[i] = fArr[i] / h;
            i = c0317a.f3435f[i];
        }
    }

    public final void h(C0319c c0319c, C0322f c0322f, boolean z2) {
        if (c0322f == null || !c0322f.f3462f) {
            return;
        }
        float c2 = this.d.c(c0322f);
        this.f3439b = (c0322f.f3461e * c2) + this.f3439b;
        this.d.h(c0322f, z2);
        if (z2) {
            c0322f.b(this);
        }
        if (this.d.d() == 0) {
            this.f3441e = true;
            c0319c.f3444a = true;
        }
    }

    public void i(C0319c c0319c, C0318b c0318b, boolean z2) {
        C0317a c0317a = this.d;
        c0317a.getClass();
        float c2 = c0317a.c(c0318b.f3438a);
        c0317a.h(c0318b.f3438a, z2);
        C0317a c0317a2 = c0318b.d;
        int d = c0317a2.d();
        for (int i = 0; i < d; i++) {
            C0322f e2 = c0317a2.e(i);
            c0317a.a(e2, c0317a2.c(e2) * c2, z2);
        }
        this.f3439b = (c0318b.f3439b * c2) + this.f3439b;
        if (z2) {
            c0318b.f3438a.b(this);
        }
        if (this.f3438a == null || this.d.d() != 0) {
            return;
        }
        this.f3441e = true;
        c0319c.f3444a = true;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0085  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public String toString() {
        boolean z2;
        String f2 = V.f(this.f3438a == null ? "0" : "" + this.f3438a, " = ");
        if (this.f3439b != RecyclerView.f1570A0) {
            f2 = f2 + this.f3439b;
            z2 = true;
        } else {
            z2 = false;
        }
        int d = this.d.d();
        for (int i = 0; i < d; i++) {
            C0322f e2 = this.d.e(i);
            if (e2 != null) {
                float f3 = this.d.f(i);
                if (f3 != RecyclerView.f1570A0) {
                    String c0322f = e2.toString();
                    if (!z2) {
                        if (f3 < RecyclerView.f1570A0) {
                            f2 = V.f(f2, "- ");
                            f3 *= -1.0f;
                        }
                        f2 = f3 == 1.0f ? V.f(f2, c0322f) : f2 + f3 + " " + c0322f;
                        z2 = true;
                    } else if (f3 > RecyclerView.f1570A0) {
                        f2 = V.f(f2, " + ");
                        if (f3 == 1.0f) {
                        }
                        z2 = true;
                    } else {
                        f2 = V.f(f2, " - ");
                        f3 *= -1.0f;
                        if (f3 == 1.0f) {
                        }
                        z2 = true;
                    }
                }
            }
        }
        return !z2 ? V.f(f2, "0.0") : f2;
    }
}
