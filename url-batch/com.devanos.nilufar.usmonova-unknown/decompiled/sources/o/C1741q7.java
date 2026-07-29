package o;

/* renamed from: o.q7, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1741q7 {
    public final int a;
    public final long b;

    public C1741q7(long j, int i) {
        if (i == 0) {
            throw new NullPointerException("Null status");
        }
        this.a = i;
        this.b = j;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C1741q7)) {
            return false;
        }
        C1741q7 c1741q7 = (C1741q7) obj;
        int i = c1741q7.a;
        int i2 = this.a;
        if (i2 != 0) {
            return (i2 == i) && this.b == c1741q7.b;
        }
        throw null;
    }

    public final int hashCode() {
        int v = (AbstractC1888sN.v(this.a) ^ 1000003) * 1000003;
        long j = this.b;
        return v ^ ((int) ((j >>> 32) ^ j));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BackendResponse{status=");
        int i = this.a;
        sb.append(i != 1 ? i != 2 ? i != 3 ? i != 4 ? "null" : "INVALID_PAYLOAD" : "FATAL_ERROR" : "TRANSIENT_ERROR" : "OK");
        sb.append(", nextRequestWaitMillis=");
        sb.append(this.b);
        sb.append("}");
        return sb.toString();
    }
}
