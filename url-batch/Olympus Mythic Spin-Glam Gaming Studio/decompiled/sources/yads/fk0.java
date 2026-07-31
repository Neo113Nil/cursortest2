package yads;

import android.graphics.drawable.Drawable;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes14.dex */
public final class fk0 {
    public final Drawable a;
    public final o31 b;

    public fk0(Drawable drawable, o31 o31Var) {
        this.a = drawable;
        this.b = o31Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fk0)) {
            return false;
        }
        fk0 fk0Var = (fk0) obj;
        return Intrinsics.areEqual(this.a, fk0Var.a) && this.b == fk0Var.b;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "CachedDrawable(drawable=" + this.a + ", imageType=" + this.b + ")";
    }
}
