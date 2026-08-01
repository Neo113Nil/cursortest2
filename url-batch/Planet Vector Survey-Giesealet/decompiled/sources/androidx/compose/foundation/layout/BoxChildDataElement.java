package androidx.compose.foundation.layout;

import defpackage.aa;
import defpackage.b2;
import defpackage.o9;
import defpackage.t50;
import defpackage.z50;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
final class BoxChildDataElement extends z50 {
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof BoxChildDataElement ? (BoxChildDataElement) obj : null) == null) {
            return false;
        }
        o9 o9Var = b2.f;
        return o9Var.equals(o9Var);
    }

    @Override // defpackage.z50
    public final t50 f() {
        o9 o9Var = b2.f;
        aa aaVar = new aa();
        aaVar.r = o9Var;
        return aaVar;
    }

    @Override // defpackage.z50
    public final void g(t50 t50Var) {
        ((aa) t50Var).r = b2.f;
    }

    public final int hashCode() {
        return ((Float.floatToIntBits(-1.0f) + (Float.floatToIntBits(0.0f) * 31)) * 31) + 1237;
    }
}
