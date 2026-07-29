package o;

/* renamed from: o.g8, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1084g8 {
    public final float a;

    public C1084g8(float f) {
        this.a = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C1084g8) && Float.compare(this.a, ((C1084g8) obj).a) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.a);
    }

    public final String toString() {
        return "Vertical(bias=" + this.a + ')';
    }
}
