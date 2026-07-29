package o;

/* renamed from: o.fh, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1053fh {
    public int a;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C1053fh) && this.a == ((C1053fh) obj).a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }

    public final String toString() {
        return "DeltaCounter(count=" + this.a + ')';
    }
}
