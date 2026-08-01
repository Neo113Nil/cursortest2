package androidx.compose.ui.input.rotary;

import defpackage.o1;
import defpackage.t50;
import defpackage.xl0;
import defpackage.z50;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
final class RotaryInputElement extends z50 {
    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof RotaryInputElement);
    }

    @Override // defpackage.z50
    public final t50 f() {
        o1 o1Var = o1.i;
        xl0 xl0Var = new xl0();
        xl0Var.r = o1Var;
        return xl0Var;
    }

    @Override // defpackage.z50
    public final void g(t50 t50Var) {
        ((xl0) t50Var).r = o1.i;
    }

    public final int hashCode() {
        return o1.i.hashCode() * 31;
    }
}
