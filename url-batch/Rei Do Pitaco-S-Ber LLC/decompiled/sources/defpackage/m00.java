package defpackage;

import java.util.Iterator;

/* compiled from: r8-map-id-f3f55b5b0d2db012739781e1ba4f8511a2ab0ca5e8856dea8785f50c2c15a0e8 */
/* loaded from: classes.dex */
public final class m00 extends p00 implements Iterator {
    public n00 f;
    public n00 g;
    public final /* synthetic */ int h;

    public m00(n00 n00Var, n00 n00Var2, int i) {
        this.h = i;
        this.f = n00Var2;
        this.g = n00Var;
    }

    @Override // defpackage.p00
    public final void a(n00 n00Var) {
        n00 n00Var2;
        n00 n00Var3 = null;
        if (this.f == n00Var && n00Var == this.g) {
            this.g = null;
            this.f = null;
        }
        n00 n00Var4 = this.f;
        if (n00Var4 == n00Var) {
            switch (this.h) {
                case 0:
                    n00Var2 = n00Var4.i;
                    break;
                default:
                    n00Var2 = n00Var4.h;
                    break;
            }
            this.f = n00Var2;
        }
        n00 n00Var5 = this.g;
        if (n00Var5 == n00Var) {
            n00 n00Var6 = this.f;
            if (n00Var5 != n00Var6 && n00Var6 != null) {
                n00Var3 = b(n00Var5);
            }
            this.g = n00Var3;
        }
    }

    public final n00 b(n00 n00Var) {
        switch (this.h) {
            case 0:
                return n00Var.h;
            default:
                return n00Var.i;
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.g != null;
    }

    @Override // java.util.Iterator
    public final Object next() {
        n00 n00Var = this.g;
        n00 n00Var2 = this.f;
        this.g = (n00Var == n00Var2 || n00Var2 == null) ? null : b(n00Var);
        return n00Var;
    }
}
