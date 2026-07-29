package o;

/* renamed from: o.f8, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1018f8 {
    public final float a;

    public C1018f8(float f) {
        this.a = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C1018f8) && Float.compare(this.a, ((C1018f8) obj).a) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.a);
    }

    public final String toString() {
        return "Horizontal(bias=" + this.a + ')';
    }
}
