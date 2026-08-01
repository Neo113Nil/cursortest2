package defpackage;

import android.os.Build;
import android.view.View;
import java.util.Objects;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public class z11 {
    public static final d21 b;
    public final d21 a;

    static {
        int i = Build.VERSION.SDK_INT;
        b = (i >= 34 ? new q11() : i >= 31 ? new p11() : i >= 30 ? new o11() : i >= 29 ? new n11() : new m11()).b().a.a().a.b().a.c();
    }

    public z11(d21 d21Var) {
        this.a = d21Var;
    }

    public d21 a() {
        return this.a;
    }

    public d21 b() {
        return this.a;
    }

    public d21 c() {
        return this.a;
    }

    public xm e() {
        return null;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z11)) {
            return false;
        }
        z11 z11Var = (z11) obj;
        return o() == z11Var.o() && n() == z11Var.n() && Objects.equals(k(), z11Var.k()) && Objects.equals(i(), z11Var.i()) && Objects.equals(e(), z11Var.e());
    }

    public oy f(int i) {
        return oy.e;
    }

    public oy g(int i) {
        if ((i & 8) == 0) {
            return oy.e;
        }
        g8.r("Unable to query the maximum insets for IME");
        return null;
    }

    public oy h() {
        return k();
    }

    public int hashCode() {
        return Objects.hash(Boolean.valueOf(o()), Boolean.valueOf(n()), k(), i(), e());
    }

    public oy i() {
        return oy.e;
    }

    public oy j() {
        return k();
    }

    public oy k() {
        return oy.e;
    }

    public oy l() {
        return k();
    }

    public d21 m(int i, int i2, int i3, int i4) {
        return b;
    }

    public boolean n() {
        return false;
    }

    public boolean o() {
        return false;
    }

    public boolean p(int i) {
        return true;
    }

    public void d(View view) {
    }

    public void q(oy[] oyVarArr) {
    }

    public void r(d21 d21Var) {
    }

    public void s(oy oyVar) {
    }

    public void t(int i) {
    }
}
