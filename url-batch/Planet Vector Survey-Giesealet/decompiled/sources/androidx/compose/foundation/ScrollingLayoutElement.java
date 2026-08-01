package androidx.compose.foundation;

import defpackage.ho0;
import defpackage.nz;
import defpackage.t50;
import defpackage.to0;
import defpackage.z50;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public final class ScrollingLayoutElement extends z50 {
    public final ho0 a;

    public ScrollingLayoutElement(ho0 ho0Var) {
        this.a = ho0Var;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof ScrollingLayoutElement) {
            return nz.l(this.a, ((ScrollingLayoutElement) obj).a);
        }
        return false;
    }

    @Override // defpackage.z50
    public final t50 f() {
        to0 to0Var = new to0();
        to0Var.r = this.a;
        to0Var.s = true;
        return to0Var;
    }

    @Override // defpackage.z50
    public final void g(t50 t50Var) {
        to0 to0Var = (to0) t50Var;
        to0Var.r = this.a;
        to0Var.s = true;
    }

    public final int hashCode() {
        return (((this.a.hashCode() * 31) + 1237) * 31) + 1231;
    }
}
