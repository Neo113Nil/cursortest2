package yads;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class zd3 implements Comparable {
    public final int b;
    public final int c;
    public final int d;

    public zd3(int i, int i2, int i3) {
        this.b = i;
        this.c = i2;
        this.d = i3;
    }

    @Override // java.lang.Comparable
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final int compareTo(zd3 zd3Var) {
        int i = this.b;
        int i2 = zd3Var.b;
        if (i != i2) {
            return Intrinsics.compare(i, i2);
        }
        int i3 = this.c;
        int i4 = zd3Var.c;
        return i3 != i4 ? Intrinsics.compare(i3, i4) : Intrinsics.compare(this.d, zd3Var.d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zd3)) {
            return false;
        }
        zd3 zd3Var = (zd3) obj;
        return this.b == zd3Var.b && this.c == zd3Var.c && this.d == zd3Var.d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.d) + yd3.a(this.c, Integer.hashCode(this.b) * 31, 31);
    }

    public final String toString() {
        return this.b + "." + this.c + "." + this.d;
    }
}
