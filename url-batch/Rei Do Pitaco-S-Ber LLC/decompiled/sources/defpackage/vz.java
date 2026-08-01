package defpackage;

import android.content.res.Resources;
import java.util.Objects;

/* compiled from: r8-map-id-f3f55b5b0d2db012739781e1ba4f8511a2ab0ca5e8856dea8785f50c2c15a0e8 */
/* loaded from: classes.dex */
public final class vz {
    public final Resources a;
    public final Resources.Theme b;

    public vz(Resources resources, Resources.Theme theme) {
        this.a = resources;
        this.b = theme;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && vz.class == obj.getClass()) {
            vz vzVar = (vz) obj;
            if (this.a.equals(vzVar.a) && Objects.equals(this.b, vzVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.a, this.b);
    }
}
