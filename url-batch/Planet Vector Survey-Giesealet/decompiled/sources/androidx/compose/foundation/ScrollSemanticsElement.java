package androidx.compose.foundation;

import defpackage.fo0;
import defpackage.ho0;
import defpackage.nz;
import defpackage.t50;
import defpackage.z50;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
final class ScrollSemanticsElement extends z50 {
    public final ho0 a;

    public ScrollSemanticsElement(ho0 ho0Var) {
        this.a = ho0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ScrollSemanticsElement) && nz.l(this.a, ((ScrollSemanticsElement) obj).a);
    }

    @Override // defpackage.z50
    public final t50 f() {
        fo0 fo0Var = new fo0();
        fo0Var.r = this.a;
        fo0Var.s = true;
        return fo0Var;
    }

    @Override // defpackage.z50
    public final void g(t50 t50Var) {
        fo0 fo0Var = (fo0) t50Var;
        fo0Var.r = this.a;
        fo0Var.s = true;
    }

    public final int hashCode() {
        return (((((this.a.hashCode() * 31) + 1237) * 961) + 1231) * 31) + 1231;
    }

    public final String toString() {
        return "ScrollSemanticsElement(state=" + this.a + ", reverseScrolling=false, flingBehavior=null, isScrollable=true, isVertical=true)";
    }
}
