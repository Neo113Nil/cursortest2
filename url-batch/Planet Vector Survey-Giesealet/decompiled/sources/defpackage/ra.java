package defpackage;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public final class ra implements ta {
    @Override // defpackage.ta
    public final float a(float f, float f2, float f3) {
        ta.a.getClass();
        float f4 = f2 + f;
        if ((f >= 0.0f && f4 <= f3) || (f < 0.0f && f4 > f3)) {
            return 0.0f;
        }
        float f5 = f4 - f3;
        return Math.abs(f) < Math.abs(f5) ? f : f5;
    }

    @Override // defpackage.ta
    public final c7 b() {
        ta.a.getClass();
        return sa.b;
    }
}
