package o;

import android.content.res.Resources;
import java.util.Objects;

/* loaded from: classes.dex */
public final class YN {
    public final Resources a;
    public final Resources.Theme b;

    public YN(Resources resources, Resources.Theme theme) {
        this.a = resources;
        this.b = theme;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && YN.class == obj.getClass()) {
            YN yn = (YN) obj;
            if (this.a.equals(yn.a) && Objects.equals(this.b, yn.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.a, this.b);
    }
}
