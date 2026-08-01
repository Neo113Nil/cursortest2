package B;

import android.content.res.Resources;
import java.util.Objects;

/* loaded from: classes.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    public final Resources f77a;

    /* renamed from: b, reason: collision with root package name */
    public final Resources.Theme f78b;

    public n(Resources resources, Resources.Theme theme) {
        this.f77a = resources;
        this.f78b = theme;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || n.class != obj.getClass()) {
            return false;
        }
        n nVar = (n) obj;
        return this.f77a.equals(nVar.f77a) && Objects.equals(this.f78b, nVar.f78b);
    }

    public final int hashCode() {
        return Objects.hash(this.f77a, this.f78b);
    }
}
