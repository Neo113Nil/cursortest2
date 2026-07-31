package yads;

import android.graphics.drawable.Drawable;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class mk0 {
    public final lk0 a;
    public final Drawable b;
    public final hm3 c;

    public mk0(lk0 lk0Var, Drawable drawable, hm3 hm3Var) {
        this.a = lk0Var;
        this.b = drawable;
        this.c = hm3Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mk0)) {
            return false;
        }
        mk0 mk0Var = (mk0) obj;
        return Intrinsics.areEqual(this.a, mk0Var.a) && Intrinsics.areEqual(this.b, mk0Var.b) && Intrinsics.areEqual(this.c, mk0Var.c);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        Drawable drawable = this.b;
        int hashCode2 = (hashCode + (drawable == null ? 0 : drawable.hashCode())) * 31;
        hm3 hm3Var = this.c;
        return hashCode2 + (hm3Var != null ? hm3Var.hashCode() : 0);
    }

    public final String toString() {
        return "BatchedResponse(request=" + this.a + ", drawable=" + this.b + ", error=" + this.c + ")";
    }
}
