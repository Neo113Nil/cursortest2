package defpackage;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public final class we0 extends ye0 {
    public final float c;

    public we0(float f) {
        super(3);
        this.c = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof we0) && Float.compare(this.c, ((we0) obj).c) == 0;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.c);
    }

    public final String toString() {
        return y6.w(new StringBuilder("RelativeVerticalTo(dy="), this.c, ')');
    }
}
