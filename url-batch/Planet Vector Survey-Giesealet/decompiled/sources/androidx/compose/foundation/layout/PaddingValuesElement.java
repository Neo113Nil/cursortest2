package androidx.compose.foundation.layout;

import defpackage.id0;
import defpackage.jd0;
import defpackage.nz;
import defpackage.t50;
import defpackage.z50;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
final class PaddingValuesElement extends z50 {
    public final id0 a;

    public PaddingValuesElement(id0 id0Var) {
        this.a = id0Var;
    }

    public final boolean equals(Object obj) {
        PaddingValuesElement paddingValuesElement = obj instanceof PaddingValuesElement ? (PaddingValuesElement) obj : null;
        if (paddingValuesElement == null) {
            return false;
        }
        return nz.l(this.a, paddingValuesElement.a);
    }

    @Override // defpackage.z50
    public final t50 f() {
        jd0 jd0Var = new jd0();
        jd0Var.r = this.a;
        return jd0Var;
    }

    @Override // defpackage.z50
    public final void g(t50 t50Var) {
        ((jd0) t50Var).r = this.a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
