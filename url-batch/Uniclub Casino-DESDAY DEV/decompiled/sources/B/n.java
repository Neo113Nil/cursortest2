package B;

import android.content.res.Resources;
import java.util.Objects;

/* loaded from: classes.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    public final Resources f33a;

    /* renamed from: b, reason: collision with root package name */
    public final Resources.Theme f34b;

    public n(Resources resources, Resources.Theme theme) {
        this.f33a = resources;
        this.f34b = theme;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || n.class != obj.getClass()) {
            return false;
        }
        n nVar = (n) obj;
        return this.f33a.equals(nVar.f33a) && Objects.equals(this.f34b, nVar.f34b);
    }

    public final int hashCode() {
        return Objects.hash(this.f33a, this.f34b);
    }
}
