package androidx.compose.ui.input.pointer;

import defpackage.gu0;
import defpackage.ku0;
import defpackage.nz;
import defpackage.t50;
import defpackage.z50;
import defpackage.ze0;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public final class SuspendPointerInputElement extends z50 {
    public final Object a;
    public final Object b;
    public final gu0 c;

    public SuspendPointerInputElement(Object obj, ze0 ze0Var, gu0 gu0Var, int i) {
        ze0Var = (i & 2) != 0 ? null : ze0Var;
        this.a = obj;
        this.b = ze0Var;
        this.c = gu0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SuspendPointerInputElement)) {
            return false;
        }
        SuspendPointerInputElement suspendPointerInputElement = (SuspendPointerInputElement) obj;
        return this.a.equals(suspendPointerInputElement.a) && nz.l(this.b, suspendPointerInputElement.b) && this.c == suspendPointerInputElement.c;
    }

    @Override // defpackage.z50
    public final t50 f() {
        return new ku0(this.a, this.b, this.c);
    }

    @Override // defpackage.z50
    public final void g(t50 t50Var) {
        ku0 ku0Var = (ku0) t50Var;
        Object obj = ku0Var.r;
        Object obj2 = this.a;
        boolean z = !nz.l(obj, obj2);
        ku0Var.r = obj2;
        Object obj3 = ku0Var.s;
        Object obj4 = this.b;
        if (!nz.l(obj3, obj4)) {
            z = true;
        }
        ku0Var.s = obj4;
        if (ku0Var.u.getClass() == gu0.class ? z : true) {
            ku0Var.k0();
        }
        ku0Var.u = this.c;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        Object obj = this.b;
        return this.c.hashCode() + ((hashCode + (obj != null ? obj.hashCode() : 0)) * 961);
    }
}
