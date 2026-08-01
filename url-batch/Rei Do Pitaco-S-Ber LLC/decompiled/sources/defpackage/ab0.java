package defpackage;

import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

/* compiled from: r8-map-id-f3f55b5b0d2db012739781e1ba4f8511a2ab0ca5e8856dea8785f50c2c15a0e8 */
/* loaded from: classes.dex */
public class ab0 {
    public static final db0 b;
    public final db0 a;

    static {
        int i = Build.VERSION.SDK_INT;
        b = (i >= 36 ? new qa0() : i >= 35 ? new pa0() : i >= 34 ? new oa0() : i >= 31 ? new na0() : i >= 30 ? new ma0() : i >= 29 ? new la0() : new ka0()).b().a.a().a.b().a.c();
    }

    public ab0(db0 db0Var) {
        this.a = db0Var;
    }

    public db0 a() {
        return this.a;
    }

    public db0 b() {
        return this.a;
    }

    public db0 c() {
        return this.a;
    }

    public List<Rect> e(int i) {
        return Collections.EMPTY_LIST;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ab0)) {
            return false;
        }
        ab0 ab0Var = (ab0) obj;
        return s() == ab0Var.s() && r() == ab0Var.r() && Objects.equals(m(), ab0Var.m()) && Objects.equals(k(), ab0Var.k()) && Objects.equals(g(), ab0Var.g());
    }

    public List<Rect> f(int i) {
        return Collections.EMPTY_LIST;
    }

    public pf g() {
        return null;
    }

    public io h(int i) {
        return io.e;
    }

    public int hashCode() {
        return Objects.hash(Boolean.valueOf(s()), Boolean.valueOf(r()), m(), k(), g());
    }

    public io i(int i) {
        if ((i & 8) == 0) {
            return io.e;
        }
        l8.l("Unable to query the maximum insets for IME");
        return null;
    }

    public io j() {
        return m();
    }

    public io k() {
        return io.e;
    }

    public io l() {
        return m();
    }

    public io m() {
        return io.e;
    }

    public io n() {
        return m();
    }

    public db0 q(int i, int i2, int i3, int i4) {
        return b;
    }

    public boolean r() {
        return false;
    }

    public boolean s() {
        return false;
    }

    public void d(View view) {
    }

    public void o(View view) {
    }

    public void t(rf rfVar) {
    }

    public void u(io[] ioVarArr) {
    }

    public void v(db0 db0Var) {
    }

    public void w(io ioVar) {
    }

    public void x(int i) {
    }

    public void y(Rect[][] rectArr) {
    }

    public void z(Rect[][] rectArr) {
    }

    public void p() {
    }
}
