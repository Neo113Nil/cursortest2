package o;

import android.view.DisplayCutout;
import java.util.Objects;

/* renamed from: o.Gi, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0167Gi {
    public final DisplayCutout a;

    public C0167Gi(DisplayCutout displayCutout) {
        this.a = displayCutout;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C0167Gi.class != obj.getClass()) {
            return false;
        }
        return Objects.equals(this.a, ((C0167Gi) obj).a);
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
