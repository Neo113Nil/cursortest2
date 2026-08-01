package defpackage;

import android.graphics.ColorFilter;
import android.graphics.PorterDuffColorFilter;
import android.os.Build;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public final class q9 {
    public final ColorFilter a;
    public final long b;
    public final int c;

    public q9(long j, int i) {
        ColorFilter porterDuffColorFilter;
        if (Build.VERSION.SDK_INT >= 29) {
            n2.g();
            porterDuffColorFilter = n2.c(d31.I(j), x40.O(i));
        } else {
            porterDuffColorFilter = new PorterDuffColorFilter(d31.I(j), x40.T(i));
        }
        this.a = porterDuffColorFilter;
        this.b = j;
        this.c = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q9)) {
            return false;
        }
        q9 q9Var = (q9) obj;
        return ge.c(this.b, q9Var.b) && this.c == q9Var.c;
    }

    public final int hashCode() {
        return (ge.i(this.b) * 31) + this.c;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BlendModeColorFilter(color=");
        y6.z(this.b, sb, ", blendMode=");
        sb.append((Object) nz.g0(this.c));
        sb.append(')');
        return sb.toString();
    }
}
