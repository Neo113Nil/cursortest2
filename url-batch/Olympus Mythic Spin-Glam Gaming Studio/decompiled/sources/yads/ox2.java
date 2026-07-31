package yads;

import com.ironsource.X3;

/* loaded from: classes5.dex */
public final class ox2 {
    public static final ox2 c = new ox2(0, 0);
    public final long a;
    public final long b;

    public ox2(long j, long j2) {
        this.a = j;
        this.b = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ox2.class != obj.getClass()) {
            return false;
        }
        ox2 ox2Var = (ox2) obj;
        return this.a == ox2Var.a && this.b == ox2Var.b;
    }

    public final int hashCode() {
        return (((int) this.a) * 31) + ((int) this.b);
    }

    public final String toString() {
        return "[timeUs=" + this.a + ", position=" + this.b + X3.j.e;
    }
}
