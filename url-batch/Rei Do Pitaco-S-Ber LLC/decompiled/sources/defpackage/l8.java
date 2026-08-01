package defpackage;

import android.content.res.Resources;
import android.view.View;
import com.ionia.reidopitaco.libya.MainActivity;
import java.io.IOException;

/* compiled from: r8-map-id-f3f55b5b0d2db012739781e1ba4f8511a2ab0ca5e8856dea8785f50c2c15a0e8 */
/* loaded from: classes.dex */
public final /* synthetic */ class l8 implements hv, ol, v40, y50 {
    public final /* synthetic */ int f;

    public /* synthetic */ l8(int i) {
        this.f = i;
    }

    public static /* synthetic */ void c() {
        throw new ClassCastException();
    }

    public static /* synthetic */ void d(int i, Object obj, String str) {
        throw new IllegalArgumentException(str + i + obj);
    }

    public static /* synthetic */ void e(Object obj) {
        throw new IllegalArgumentException(obj.toString());
    }

    public static /* synthetic */ void f(Object obj, Object obj2) {
        throw new w30("Fragment " + obj + obj2);
    }

    public static /* synthetic */ void g(Object obj, Object obj2, Object obj3, Throwable th) {
        StringBuilder sb = new StringBuilder();
        sb.append(obj);
        sb.append(obj2);
        sb.append(obj3);
        throw new IllegalStateException(sb.toString(), th);
    }

    public static /* synthetic */ void h(Object obj, Object obj2, String str) {
        throw new IllegalStateException(str + obj + obj2);
    }

    public static /* synthetic */ void i(Object obj, Object obj2, Throwable th) {
        throw new ck("Unable to instantiate fragment " + obj + obj2, th);
    }

    public static /* synthetic */ void j(Object obj, String str) {
        throw new IllegalArgumentException((str + obj + '\"').toString());
    }

    public static /* synthetic */ void l(String str) {
        throw new IllegalArgumentException(str);
    }

    public static /* synthetic */ void m(String str, int i) {
        throw new IllegalStateException((str + i).toString());
    }

    public static /* synthetic */ void n(String str, int i, Object obj, int i2) {
        throw new IllegalArgumentException((str + i + obj + i2).toString());
    }

    public static /* synthetic */ void o(String str, long j) {
        throw new IllegalArgumentException((str + j).toString());
    }

    public static /* synthetic */ void p(String str, Object obj, Object obj2, Object obj3) {
        throw new IllegalArgumentException(str + obj + obj2 + obj3);
    }

    public static /* synthetic */ void q(StringBuilder sb, Object obj) {
        sb.append(obj);
        throw new IllegalArgumentException(sb.toString());
    }

    public static /* synthetic */ void r(int i, Object obj, String str) {
        throw new IllegalArgumentException((str + i + obj).toString());
    }

    public static /* synthetic */ void s(Object obj, Object obj2, String str) {
        throw new IllegalStateException((str + obj + obj2).toString());
    }

    public static /* synthetic */ void t(Object obj, String str) {
        throw new IllegalStateException((str + obj).toString());
    }

    public static /* synthetic */ void u(String str) {
        throw new IllegalStateException(str);
    }

    public static /* synthetic */ void v(Object obj, Object obj2, String str) {
        throw new IllegalArgumentException((str + obj + obj2).toString());
    }

    public static /* synthetic */ void w(Object obj, String str) {
        throw new IllegalArgumentException(str + obj);
    }

    public static /* synthetic */ void x(String str) {
        throw new UnsupportedOperationException(str);
    }

    public static /* synthetic */ void y(String str) {
        throw new IOException(str);
    }

    @Override // defpackage.ol
    public Object a(Object obj) {
        Resources resources = (Resources) obj;
        resources.getClass();
        return Boolean.valueOf((resources.getConfiguration().uiMode & 48) == 32);
    }

    @Override // defpackage.y50
    public void b(w50 w50Var, z50 z50Var) {
        switch (this.f) {
            case 27:
                w50Var.e(z50Var);
                break;
            case 28:
                w50Var.d(z50Var);
                break;
            default:
                w50Var.f(z50Var);
                break;
        }
    }

    @Override // defpackage.hv
    public db0 k(View view, db0 db0Var) {
        int i = MainActivity.L;
        view.getClass();
        io h = db0Var.a.h(519);
        h.getClass();
        view.setPadding(h.a, h.b, h.c, h.d);
        return db0Var;
    }
}
