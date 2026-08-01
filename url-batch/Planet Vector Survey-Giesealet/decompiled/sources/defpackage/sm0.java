package defpackage;

import java.util.Iterator;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public final class sm0 extends tm0 implements Iterator {
    public rm0 d;
    public boolean e = true;
    public final /* synthetic */ zq f;

    public sm0(zq zqVar) {
        this.f = zqVar;
    }

    @Override // defpackage.tm0
    public final void a(rm0 rm0Var) {
        rm0 rm0Var2 = this.d;
        if (rm0Var == rm0Var2) {
            rm0 rm0Var3 = rm0Var2.g;
            this.d = rm0Var3;
            this.e = rm0Var3 == null;
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.e) {
            return this.f.d != null;
        }
        rm0 rm0Var = this.d;
        return (rm0Var == null || rm0Var.f == null) ? false : true;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (this.e) {
            this.e = false;
            this.d = this.f.d;
        } else {
            rm0 rm0Var = this.d;
            this.d = rm0Var != null ? rm0Var.f : null;
        }
        return this.d;
    }
}
