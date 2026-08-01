package defpackage;

/* compiled from: r8-map-id-f3f55b5b0d2db012739781e1ba4f8511a2ab0ca5e8856dea8785f50c2c15a0e8 */
/* loaded from: classes.dex */
public final class h00 extends m60 {
    @Override // defpackage.m60
    public final void w(y10 y10Var, float f, float f2) {
        float f3 = f2 * f;
        y10Var.d(f3, 180.0f, 90.0f);
        float f4 = f3 * 2.0f;
        u10 u10Var = new u10(0.0f, 0.0f, f4, f4);
        u10Var.f = 180.0f;
        u10Var.g = 90.0f;
        y10Var.f.add(u10Var);
        s10 s10Var = new s10(u10Var);
        y10Var.a(180.0f);
        y10Var.g.add(s10Var);
        y10Var.d = 270.0f;
        float f5 = (0.0f + f4) * 0.5f;
        float f6 = (f4 - 0.0f) / 2.0f;
        y10Var.b = (((float) Math.cos(Math.toRadians(270.0d))) * f6) + f5;
        y10Var.c = (f6 * ((float) Math.sin(Math.toRadians(270.0d)))) + f5;
    }
}
