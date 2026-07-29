package o;

/* renamed from: o.Wi, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0582Wi {
    public final float a;

    public C0582Wi(float f) {
        this.a = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C0582Wi) && AbstractC0556Vi.a(this.a, ((C0582Wi) obj).a);
    }

    public final int hashCode() {
        return Float.hashCode(this.a);
    }

    public final String toString() {
        return "CornerSize(size = " + this.a + ".dp)";
    }
}
