package o;

/* loaded from: classes.dex */
public final class B7 {
    public final long a;
    public final F7 b;
    public final C2070v7 c;

    public B7(long j, F7 f7, C2070v7 c2070v7) {
        this.a = j;
        this.b = f7;
        this.c = c2070v7;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof B7) {
            B7 b7 = (B7) obj;
            if (this.a == b7.a && this.b.equals(b7.b) && this.c.equals(b7.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j = this.a;
        return ((((((int) ((j >>> 32) ^ j)) ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode();
    }

    public final String toString() {
        return "PersistedEvent{id=" + this.a + ", transportContext=" + this.b + ", event=" + this.c + "}";
    }
}
