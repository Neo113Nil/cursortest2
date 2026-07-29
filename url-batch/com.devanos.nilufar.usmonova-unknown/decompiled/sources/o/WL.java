package o;

/* loaded from: classes.dex */
public final class WL {
    public int a;
    public C2036ud b;
    public C1471m2 c;
    public InterfaceC2312yp d;
    public int e;
    public GD f;
    public MD g;

    public WL(C2036ud c2036ud) {
        this.b = c2036ud;
    }

    public static boolean a(C1645oh c1645oh, MD md) {
        AbstractC0048Bt.l(c1645oh, "null cannot be cast to non-null type androidx.compose.runtime.DerivedState<kotlin.Any?>");
        return !AbstractC0048Bt.h(c1645oh.h().f, md.e(c1645oh));
    }

    public final boolean b() {
        if (this.b != null) {
            C1471m2 c1471m2 = this.c;
            if (c1471m2 != null ? c1471m2.a() : false) {
                return true;
            }
        }
        return false;
    }

    public final int c(Object obj) {
        int m;
        C2036ud c2036ud = this.b;
        if (c2036ud == null || (m = c2036ud.m(this, obj)) == 0) {
            return 1;
        }
        return m;
    }

    public final void d() {
        C2036ud c2036ud = this.b;
        if (c2036ud != null) {
            c2036ud.v = true;
        }
        this.b = null;
        this.f = null;
        this.g = null;
    }

    public final void e(boolean z) {
        if (z) {
            this.a |= 32;
        } else {
            this.a &= -33;
        }
    }
}
