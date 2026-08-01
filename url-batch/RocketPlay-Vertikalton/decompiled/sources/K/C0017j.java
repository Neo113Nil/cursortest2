package K;

import android.view.DisplayCutout;
import java.util.Objects;

/* renamed from: K.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0017j {

    /* renamed from: a, reason: collision with root package name */
    public final DisplayCutout f678a;

    public C0017j(DisplayCutout displayCutout) {
        this.f678a = displayCutout;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C0017j.class != obj.getClass()) {
            return false;
        }
        return Objects.equals(this.f678a, ((C0017j) obj).f678a);
    }

    public final int hashCode() {
        int hashCode;
        hashCode = this.f678a.hashCode();
        return hashCode;
    }

    public final String toString() {
        return "DisplayCutoutCompat{" + this.f678a + "}";
    }
}
