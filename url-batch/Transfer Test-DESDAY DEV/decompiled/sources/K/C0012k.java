package K;

import android.view.DisplayCutout;
import java.util.Objects;

/* renamed from: K.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0012k {

    /* renamed from: a, reason: collision with root package name */
    public final DisplayCutout f419a;

    public C0012k(DisplayCutout displayCutout) {
        this.f419a = displayCutout;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C0012k.class != obj.getClass()) {
            return false;
        }
        return Objects.equals(this.f419a, ((C0012k) obj).f419a);
    }

    public final int hashCode() {
        int hashCode;
        hashCode = this.f419a.hashCode();
        return hashCode;
    }

    public final String toString() {
        return "DisplayCutoutCompat{" + this.f419a + "}";
    }
}
