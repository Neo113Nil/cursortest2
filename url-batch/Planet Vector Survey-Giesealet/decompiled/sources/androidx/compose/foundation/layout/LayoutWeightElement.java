package androidx.compose.foundation.layout;

import defpackage.t10;
import defpackage.t50;
import defpackage.z50;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public final class LayoutWeightElement extends z50 {
    public final float a;

    public LayoutWeightElement(float f) {
        this.a = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        LayoutWeightElement layoutWeightElement = obj instanceof LayoutWeightElement ? (LayoutWeightElement) obj : null;
        return layoutWeightElement != null && this.a == layoutWeightElement.a;
    }

    @Override // defpackage.z50
    public final t50 f() {
        t10 t10Var = new t10();
        t10Var.r = this.a;
        t10Var.s = true;
        return t10Var;
    }

    @Override // defpackage.z50
    public final void g(t50 t50Var) {
        t10 t10Var = (t10) t50Var;
        t10Var.r = this.a;
        t10Var.s = true;
    }

    public final int hashCode() {
        return (Float.floatToIntBits(this.a) * 31) + 1231;
    }
}
