package defpackage;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public final class ir {
    public final float a;
    public final float b;

    public ir(float f, sl slVar) {
        this.a = f;
        float a = slVar.a();
        float f2 = jr.a;
        this.b = a * 386.0878f * 160.0f * 0.84f;
    }

    public final hr a(float f) {
        double b = b(f);
        double d = jr.a;
        double d2 = d - 1.0d;
        return new hr(f, (float) (Math.exp((d / d2) * b) * this.a * this.b), (long) (Math.exp(b / d2) * 1000.0d));
    }

    public final double b(float f) {
        float[] fArr = t4.a;
        return Math.log((Math.abs(f) * 0.35f) / (this.a * this.b));
    }
}
