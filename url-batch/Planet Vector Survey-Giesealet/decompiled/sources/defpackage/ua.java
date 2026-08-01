package defpackage;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public final class ua implements ta {
    public final ox0 b = nk.Q(125, 2, new ik(0.25f, 0.1f, 0.25f));

    @Override // defpackage.ta
    public final float a(float f, float f2, float f3) {
        float abs = Math.abs((f2 + f) - f);
        float f4 = (0.3f * f3) - (0.0f * abs);
        float f5 = f3 - f4;
        if ((abs <= f3) && f5 < abs) {
            f4 = f3 - abs;
        }
        return f - f4;
    }

    @Override // defpackage.ta
    public final c7 b() {
        return this.b;
    }
}
