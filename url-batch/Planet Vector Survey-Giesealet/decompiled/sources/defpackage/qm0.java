package defpackage;

import java.util.Iterator;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public final class qm0 extends tm0 implements Iterator {
    public rm0 d;
    public rm0 e;
    public final /* synthetic */ int f;

    public qm0(rm0 rm0Var, rm0 rm0Var2, int i) {
        this.f = i;
        this.d = rm0Var2;
        this.e = rm0Var;
    }

    @Override // defpackage.tm0
    public final void a(rm0 rm0Var) {
        rm0 rm0Var2;
        rm0 rm0Var3 = null;
        if (this.d == rm0Var && rm0Var == this.e) {
            this.e = null;
            this.d = null;
        }
        rm0 rm0Var4 = this.d;
        if (rm0Var4 == rm0Var) {
            switch (this.f) {
                case 0:
                    rm0Var2 = rm0Var4.g;
                    break;
                default:
                    rm0Var2 = rm0Var4.f;
                    break;
            }
            this.d = rm0Var2;
        }
        rm0 rm0Var5 = this.e;
        if (rm0Var5 == rm0Var) {
            rm0 rm0Var6 = this.d;
            if (rm0Var5 != rm0Var6 && rm0Var6 != null) {
                rm0Var3 = b(rm0Var5);
            }
            this.e = rm0Var3;
        }
    }

    public final rm0 b(rm0 rm0Var) {
        switch (this.f) {
            case 0:
                return rm0Var.f;
            default:
                return rm0Var.g;
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.e != null;
    }

    @Override // java.util.Iterator
    public final Object next() {
        rm0 rm0Var = this.e;
        rm0 rm0Var2 = this.d;
        this.e = (rm0Var == rm0Var2 || rm0Var2 == null) ? null : b(rm0Var);
        return rm0Var;
    }
}
