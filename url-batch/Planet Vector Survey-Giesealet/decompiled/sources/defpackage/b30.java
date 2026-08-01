package defpackage;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public final class b30 implements pt {
    public final float a;

    public b30(float f) {
        this.a = f;
    }

    @Override // defpackage.pt
    public final float a(float f) {
        return f / this.a;
    }

    @Override // defpackage.pt
    public final float b(float f) {
        return f * this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof b30) && Float.compare(this.a, ((b30) obj).a) == 0;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.a);
    }

    public final String toString() {
        return y6.w(new StringBuilder("LinearFontScaleConverter(fontScale="), this.a, ')');
    }
}
