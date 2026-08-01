package b1;

/* loaded from: classes.dex */
public final class c extends a {
    public static final c d = new c(1, 0, 1);

    @Override // b1.a
    public final boolean equals(Object obj) {
        if (obj instanceof c) {
            if (!isEmpty() || !((c) obj).isEmpty()) {
                c cVar = (c) obj;
                if (this.f1507a == cVar.f1507a) {
                    if (this.f1508b == cVar.f1508b) {
                    }
                }
            }
            return true;
        }
        return false;
    }

    @Override // b1.a
    public final int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (this.f1507a * 31) + this.f1508b;
    }

    @Override // b1.a
    public final boolean isEmpty() {
        return this.f1507a > this.f1508b;
    }

    @Override // b1.a
    public final String toString() {
        return this.f1507a + ".." + this.f1508b;
    }
}
