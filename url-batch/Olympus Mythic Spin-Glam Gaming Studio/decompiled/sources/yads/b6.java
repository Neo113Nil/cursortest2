package yads;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class b6 {
    public final List a;
    public final int b;
    public final int c;

    public b6(List list, int i, int i2) {
        this.a = list;
        this.b = i;
        this.c = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b6)) {
            return false;
        }
        b6 b6Var = (b6) obj;
        return Intrinsics.areEqual(this.a, b6Var.a) && this.b == b6Var.b && this.c == b6Var.c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + yd3.a(this.b, this.a.hashCode() * 31, 31);
    }

    public final String toString() {
        return "AdPod(items=" + this.a + ", closableAdPosition=" + this.b + ", rewardAdPosition=" + this.c + ")";
    }
}
