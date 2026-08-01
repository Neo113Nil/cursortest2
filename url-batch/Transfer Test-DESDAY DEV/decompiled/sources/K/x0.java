package K;

import android.os.Build;
import android.view.View;
import java.util.Objects;

/* loaded from: classes.dex */
public class x0 {

    /* renamed from: b, reason: collision with root package name */
    public static final z0 f461b;

    /* renamed from: a, reason: collision with root package name */
    public final z0 f462a;

    static {
        int i = Build.VERSION.SDK_INT;
        f461b = (i >= 30 ? new q0() : i >= 29 ? new p0() : new o0()).b().f465a.a().f465a.b().f465a.c();
    }

    public x0(z0 z0Var) {
        this.f462a = z0Var;
    }

    public z0 a() {
        return this.f462a;
    }

    public z0 b() {
        return this.f462a;
    }

    public z0 c() {
        return this.f462a;
    }

    public void d(View view) {
    }

    public C0012k e() {
        return null;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x0)) {
            return false;
        }
        x0 x0Var = (x0) obj;
        return n() == x0Var.n() && m() == x0Var.m() && Objects.equals(j(), x0Var.j()) && Objects.equals(h(), x0Var.h()) && Objects.equals(e(), x0Var.e());
    }

    public C.d f(int i) {
        return C.d.f93e;
    }

    public C.d g() {
        return j();
    }

    public C.d h() {
        return C.d.f93e;
    }

    public int hashCode() {
        return Objects.hash(Boolean.valueOf(n()), Boolean.valueOf(m()), j(), h(), e());
    }

    public C.d i() {
        return j();
    }

    public C.d j() {
        return C.d.f93e;
    }

    public C.d k() {
        return j();
    }

    public z0 l(int i, int i2, int i3, int i4) {
        return f461b;
    }

    public boolean m() {
        return false;
    }

    public boolean n() {
        return false;
    }

    public void o(C.d[] dVarArr) {
    }

    public void p(z0 z0Var) {
    }

    public void q(C.d dVar) {
    }
}
