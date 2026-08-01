package defpackage;

import android.view.WindowInsets;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public class n11 extends r11 {
    public final WindowInsets.Builder c;

    public n11(d21 d21Var) {
        super(d21Var);
        WindowInsets b = d21Var.b();
        this.c = b != null ? e60.d(b) : e60.c();
    }

    @Override // defpackage.r11
    public d21 b() {
        WindowInsets build;
        a();
        build = this.c.build();
        d21 c = d21.c(build, null);
        c.a.q(this.b);
        return c;
    }

    @Override // defpackage.r11
    public void d(oy oyVar) {
        this.c.setMandatorySystemGestureInsets(oyVar.e());
    }

    @Override // defpackage.r11
    public void e(oy oyVar) {
        this.c.setStableInsets(oyVar.e());
    }

    @Override // defpackage.r11
    public void f(oy oyVar) {
        this.c.setSystemGestureInsets(oyVar.e());
    }

    @Override // defpackage.r11
    public void g(oy oyVar) {
        this.c.setSystemWindowInsets(oyVar.e());
    }

    @Override // defpackage.r11
    public void h(oy oyVar) {
        this.c.setTappableElementInsets(oyVar.e());
    }

    public n11() {
        this.c = e60.c();
    }
}
