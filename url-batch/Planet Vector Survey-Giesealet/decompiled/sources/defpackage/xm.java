package defpackage;

import android.os.Build;
import android.view.DisplayCutout;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public final class xm {
    public final DisplayCutout a;

    public xm(DisplayCutout displayCutout) {
        this.a = displayCutout;
    }

    public final oy a() {
        return Build.VERSION.SDK_INT >= 30 ? oy.d(z0.b(this.a)) : oy.e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || xm.class != obj.getClass()) {
            return false;
        }
        return this.a.equals(((xm) obj).a);
    }

    public final int hashCode() {
        int hashCode;
        hashCode = this.a.hashCode();
        return hashCode;
    }

    public final String toString() {
        return "DisplayCutoutCompat{" + this.a + "}";
    }
}
