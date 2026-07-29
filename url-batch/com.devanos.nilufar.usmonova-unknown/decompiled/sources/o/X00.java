package o;

import android.view.WindowInsets;

/* loaded from: classes.dex */
public class X00 extends Z00 {
    public final WindowInsets.Builder a;

    public X00() {
        this.a = AbstractC1099gN.c();
    }

    @Override // o.Z00
    public C1142h10 b() {
        WindowInsets build;
        a();
        build = this.a.build();
        C1142h10 c = C1142h10.c(build, null);
        c.a.o(null);
        return c;
    }

    @Override // o.Z00
    public void c(C0644Ys c0644Ys) {
        this.a.setStableInsets(c0644Ys.c());
    }

    @Override // o.Z00
    public void d(C0644Ys c0644Ys) {
        this.a.setSystemWindowInsets(c0644Ys.c());
    }

    public X00(C1142h10 c1142h10) {
        super(c1142h10);
        WindowInsets.Builder c;
        WindowInsets b = c1142h10.b();
        if (b != null) {
            c = AbstractC1099gN.d(b);
        } else {
            c = AbstractC1099gN.c();
        }
        this.a = c;
    }
}
