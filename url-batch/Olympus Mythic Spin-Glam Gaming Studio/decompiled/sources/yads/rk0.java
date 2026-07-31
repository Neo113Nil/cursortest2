package yads;

import android.graphics.drawable.Drawable;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes12.dex */
public final class rk0 {
    public final Drawable a;
    public final o31 b;

    public rk0(Drawable drawable, o31 o31Var) {
        this.a = drawable;
        this.b = o31Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rk0)) {
            return false;
        }
        rk0 rk0Var = (rk0) obj;
        return Intrinsics.areEqual(this.a, rk0Var.a) && this.b == rk0Var.b;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "DrawableResponse(drawable=" + this.a + ", imageType=" + this.b + ")";
    }
}
