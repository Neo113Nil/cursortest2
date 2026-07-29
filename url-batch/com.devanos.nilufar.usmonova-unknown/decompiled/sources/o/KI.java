package o;

/* loaded from: classes.dex */
public final class KI {
    public final int a;

    public final boolean equals(Object obj) {
        if (obj instanceof KI) {
            return this.a == ((KI) obj).a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }

    public final String toString() {
        return "PointerKeyboardModifiers(packedValue=" + this.a + ')';
    }
}
