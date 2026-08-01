package k1;

/* loaded from: classes.dex */
public final class c extends a {
    static {
        new c(1, 0, 1);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof c) {
            if (!isEmpty() || !((c) obj).isEmpty()) {
                c cVar = (c) obj;
                if (this.f2847a == cVar.f2847a) {
                    if (this.f2848b == cVar.f2848b) {
                    }
                }
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (this.f2847a * 31) + this.f2848b;
    }

    public final boolean isEmpty() {
        return this.f2847a > this.f2848b;
    }

    public final String toString() {
        return this.f2847a + ".." + this.f2848b;
    }
}
