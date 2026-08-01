package androidx.compose.ui.input.key;

import defpackage.c3;
import defpackage.t00;
import defpackage.t50;
import defpackage.z50;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
final class KeyInputElement extends z50 {
    public final c3 a;

    public KeyInputElement(c3 c3Var) {
        this.a = c3Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof KeyInputElement) {
            return this.a == ((KeyInputElement) obj).a;
        }
        return false;
    }

    @Override // defpackage.z50
    public final t50 f() {
        t00 t00Var = new t00();
        t00Var.r = this.a;
        return t00Var;
    }

    @Override // defpackage.z50
    public final void g(t50 t50Var) {
        ((t00) t50Var).r = this.a;
    }

    public final int hashCode() {
        return this.a.hashCode() * 31;
    }
}
