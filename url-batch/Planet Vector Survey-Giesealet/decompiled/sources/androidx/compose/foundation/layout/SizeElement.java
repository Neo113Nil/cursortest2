package androidx.compose.foundation.layout;

import defpackage.gr0;
import defpackage.jn;
import defpackage.t50;
import defpackage.y6;
import defpackage.z50;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
final class SizeElement extends z50 {
    public final float a;
    public final float b;
    public final float c;
    public final float d;
    public final boolean e;

    public /* synthetic */ SizeElement(float f, float f2, float f3, float f4, int i) {
        this((i & 1) != 0 ? Float.NaN : f, (i & 2) != 0 ? Float.NaN : f2, (i & 4) != 0 ? Float.NaN : f3, (i & 8) != 0 ? Float.NaN : f4);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SizeElement)) {
            return false;
        }
        SizeElement sizeElement = (SizeElement) obj;
        return jn.a(this.a, sizeElement.a) && jn.a(this.b, sizeElement.b) && jn.a(this.c, sizeElement.c) && jn.a(this.d, sizeElement.d) && this.e == sizeElement.e;
    }

    @Override // defpackage.z50
    public final t50 f() {
        gr0 gr0Var = new gr0();
        gr0Var.r = this.a;
        gr0Var.s = this.b;
        gr0Var.t = this.c;
        gr0Var.u = this.d;
        gr0Var.v = this.e;
        return gr0Var;
    }

    @Override // defpackage.z50
    public final void g(t50 t50Var) {
        gr0 gr0Var = (gr0) t50Var;
        gr0Var.r = this.a;
        gr0Var.s = this.b;
        gr0Var.t = this.c;
        gr0Var.u = this.d;
        gr0Var.v = this.e;
    }

    public final int hashCode() {
        return y6.t(this.d, y6.t(this.c, y6.t(this.b, Float.floatToIntBits(this.a) * 31, 31), 31), 31) + (this.e ? 1231 : 1237);
    }

    public SizeElement(float f, float f2, float f3, float f4) {
        this.a = f;
        this.b = f2;
        this.c = f3;
        this.d = f4;
        this.e = true;
    }
}
