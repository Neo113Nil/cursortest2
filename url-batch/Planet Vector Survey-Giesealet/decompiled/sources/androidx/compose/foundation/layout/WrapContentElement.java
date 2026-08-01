package androidx.compose.foundation.layout;

import defpackage.o9;
import defpackage.qu;
import defpackage.t50;
import defpackage.x21;
import defpackage.y6;
import defpackage.z50;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
final class WrapContentElement extends z50 {
    public final int a;
    public final qu b;
    public final o9 c;

    public WrapContentElement(int i, qu quVar, o9 o9Var) {
        this.a = i;
        this.b = quVar;
        this.c = o9Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || WrapContentElement.class != obj.getClass()) {
            return false;
        }
        WrapContentElement wrapContentElement = (WrapContentElement) obj;
        return this.a == wrapContentElement.a && this.c.equals(wrapContentElement.c);
    }

    @Override // defpackage.z50
    public final t50 f() {
        x21 x21Var = new x21();
        x21Var.r = this.a;
        x21Var.s = this.b;
        return x21Var;
    }

    @Override // defpackage.z50
    public final void g(t50 t50Var) {
        x21 x21Var = (x21) t50Var;
        x21Var.r = this.a;
        x21Var.s = this.b;
    }

    public final int hashCode() {
        return this.c.hashCode() + (((y6.D(this.a) * 31) + 1237) * 31);
    }
}
