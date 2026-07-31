package yads;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class j03 implements Comparable {
    public final int b;
    public final int c;

    public j03(int i, int i2) {
        this.b = i;
        this.c = i2;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        j03 j03Var = (j03) obj;
        return Intrinsics.compare(this.b * this.c, j03Var.b * j03Var.c);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j03)) {
            return false;
        }
        j03 j03Var = (j03) obj;
        return this.b == j03Var.b && this.c == j03Var.c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + (Integer.hashCode(this.b) * 31);
    }

    public final String toString() {
        return "Size(width=" + this.b + ", height=" + this.c + ")";
    }
}
