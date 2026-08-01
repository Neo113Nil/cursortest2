package androidx.compose.foundation.layout;

import defpackage.g8;
import defpackage.hd0;
import defpackage.jn;
import defpackage.t50;
import defpackage.y6;
import defpackage.z50;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
final class PaddingElement extends z50 {
    public final float a;
    public final float b;
    public final float c;
    public final float d;

    public PaddingElement(float f, float f2, float f3, float f4) {
        this.a = f;
        this.b = f2;
        this.c = f3;
        this.d = f4;
        if ((f >= 0.0f || jn.a(f, Float.NaN)) && ((f2 >= 0.0f || jn.a(f2, Float.NaN)) && ((f3 >= 0.0f || jn.a(f3, Float.NaN)) && (f4 >= 0.0f || jn.a(f4, Float.NaN))))) {
            return;
        }
        g8.r("Padding must be non-negative");
        throw null;
    }

    public final boolean equals(Object obj) {
        PaddingElement paddingElement = obj instanceof PaddingElement ? (PaddingElement) obj : null;
        return paddingElement != null && jn.a(this.a, paddingElement.a) && jn.a(this.b, paddingElement.b) && jn.a(this.c, paddingElement.c) && jn.a(this.d, paddingElement.d);
    }

    @Override // defpackage.z50
    public final t50 f() {
        hd0 hd0Var = new hd0();
        hd0Var.r = this.a;
        hd0Var.s = this.b;
        hd0Var.t = this.c;
        hd0Var.u = this.d;
        hd0Var.v = true;
        return hd0Var;
    }

    @Override // defpackage.z50
    public final void g(t50 t50Var) {
        hd0 hd0Var = (hd0) t50Var;
        hd0Var.r = this.a;
        hd0Var.s = this.b;
        hd0Var.t = this.c;
        hd0Var.u = this.d;
        hd0Var.v = true;
    }

    public final int hashCode() {
        return ((Float.floatToIntBits(this.d) + y6.t(this.c, y6.t(this.b, Float.floatToIntBits(this.a) * 31, 31), 31)) * 31) + 1231;
    }
}
