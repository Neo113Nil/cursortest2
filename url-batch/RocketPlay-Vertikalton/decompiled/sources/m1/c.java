package m1;

/* loaded from: classes.dex */
public final class c extends a {
    public static final c d = new c(1, 0, 1);

    @Override // m1.a
    public final boolean equals(Object obj) {
        if (obj instanceof c) {
            if (!isEmpty() || !((c) obj).isEmpty()) {
                c cVar = (c) obj;
                if (this.f3557a == cVar.f3557a) {
                    if (this.f3558b == cVar.f3558b) {
                    }
                }
            }
            return true;
        }
        return false;
    }

    @Override // m1.a
    public final int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (this.f3557a * 31) + this.f3558b;
    }

    @Override // m1.a
    public final boolean isEmpty() {
        return this.f3557a > this.f3558b;
    }

    @Override // m1.a
    public final String toString() {
        return this.f3557a + ".." + this.f3558b;
    }
}
