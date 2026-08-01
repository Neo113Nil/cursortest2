package defpackage;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public final class ss0 {
    public float a;
    public double b;
    public boolean c;

    public final long a(float f, float f2, long j) {
        if (!this.c) {
            if (this.a == Float.MAX_VALUE) {
                g8.s("Error: Final position of the spring must be set before the animation starts");
                return 0L;
            }
            this.c = true;
        }
        float f3 = f - this.a;
        double d = j / 1000.0d;
        double d2 = this.b;
        double d3 = f3;
        double d4 = (d2 * d3) + f2;
        double d5 = (d4 * d) + d3;
        double exp = Math.exp((-d2) * d) * d5;
        double exp2 = Math.exp((-this.b) * d) * d5;
        double d6 = -this.b;
        double exp3 = (Math.exp(d6 * d) * d4) + (exp2 * d6);
        return (Float.floatToRawIntBits((float) exp3) & 4294967295L) | (Float.floatToRawIntBits((float) (exp + this.a)) << 32);
    }
}
