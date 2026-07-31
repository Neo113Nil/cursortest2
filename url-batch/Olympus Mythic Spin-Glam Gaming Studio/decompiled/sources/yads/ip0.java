package yads;

import android.graphics.RectF;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes12.dex */
public final class ip0 {
    public final int a;
    public final RectF b;

    public ip0(int i, RectF rectF) {
        this.a = i;
        this.b = rectF;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ip0)) {
            return false;
        }
        ip0 ip0Var = (ip0) obj;
        return this.a == ip0Var.a && Intrinsics.areEqual(this.b, ip0Var.b);
    }

    public final int hashCode() {
        int hashCode = Integer.hashCode(this.a) * 31;
        RectF rectF = this.b;
        return hashCode + (rectF == null ? 0 : rectF.hashCode());
    }

    public final String toString() {
        return "Exposure(exposedPercentage=" + this.a + ", visibleRectangle=" + this.b + ")";
    }
}
