package androidx.compose.foundation.layout;

import defpackage.jn;
import defpackage.ry0;
import defpackage.t50;
import defpackage.z50;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
final class UnspecifiedConstraintsElement extends z50 {
    public final float a;
    public final float b;

    public UnspecifiedConstraintsElement(float f, float f2) {
        this.a = f;
        this.b = f2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof UnspecifiedConstraintsElement)) {
            return false;
        }
        UnspecifiedConstraintsElement unspecifiedConstraintsElement = (UnspecifiedConstraintsElement) obj;
        return jn.a(this.a, unspecifiedConstraintsElement.a) && jn.a(this.b, unspecifiedConstraintsElement.b);
    }

    @Override // defpackage.z50
    public final t50 f() {
        ry0 ry0Var = new ry0();
        ry0Var.r = this.a;
        ry0Var.s = this.b;
        return ry0Var;
    }

    @Override // defpackage.z50
    public final void g(t50 t50Var) {
        ry0 ry0Var = (ry0) t50Var;
        ry0Var.r = this.a;
        ry0Var.s = this.b;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.b) + (Float.floatToIntBits(this.a) * 31);
    }
}
