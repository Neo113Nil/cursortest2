package o;

/* loaded from: classes.dex */
public final class Z7 {
    public final float a;

    public final boolean equals(Object obj) {
        if (obj instanceof Z7) {
            return Float.compare(this.a, ((Z7) obj).a) == 0;
        }
        return false;
    }

    public final int hashCode() {
        return Float.hashCode(this.a);
    }

    public final String toString() {
        return "BaselineShift(multiplier=" + this.a + ')';
    }
}
