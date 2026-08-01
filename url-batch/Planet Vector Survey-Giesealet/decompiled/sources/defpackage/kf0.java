package defpackage;

import java.util.ConcurrentModificationException;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public class kf0 extends if0 {
    public final jf0 g;
    public Object h;
    public boolean i;
    public int j;

    public kf0(jf0 jf0Var, lx0[] lx0VarArr) {
        super(jf0Var.e, lx0VarArr);
        this.g = jf0Var;
        this.j = jf0Var.g;
    }

    public final void c(int i, kx0 kx0Var, Object obj, int i2) {
        int i3 = i2 * 5;
        lx0[] lx0VarArr = this.d;
        if (i3 <= 30) {
            int l = 1 << ld0.l(i, i3);
            if (kx0Var.h(l)) {
                lx0VarArr[i2].a(kx0Var.d, Integer.bitCount(kx0Var.a) * 2, kx0Var.f(l));
                this.e = i2;
                return;
            } else {
                int t = kx0Var.t(l);
                kx0 s = kx0Var.s(t);
                lx0VarArr[i2].a(kx0Var.d, Integer.bitCount(kx0Var.a) * 2, t);
                c(i, s, obj, i2 + 1);
                return;
            }
        }
        lx0 lx0Var = lx0VarArr[i2];
        Object[] objArr = kx0Var.d;
        lx0Var.a(objArr, objArr.length, 0);
        while (true) {
            lx0 lx0Var2 = lx0VarArr[i2];
            if (nz.l(lx0Var2.d[lx0Var2.f], obj)) {
                this.e = i2;
                return;
            } else {
                lx0VarArr[i2].f += 2;
            }
        }
    }

    @Override // defpackage.if0, java.util.Iterator
    public final Object next() {
        if (this.g.g != this.j) {
            throw new ConcurrentModificationException();
        }
        if (!this.f) {
            g8.k();
            return null;
        }
        lx0 lx0Var = this.d[this.e];
        this.h = lx0Var.d[lx0Var.f];
        this.i = true;
        return super.next();
    }

    @Override // defpackage.if0, java.util.Iterator
    public final void remove() {
        if (!this.i) {
            throw new IllegalStateException();
        }
        boolean z = this.f;
        jf0 jf0Var = this.g;
        if (!z) {
            px0.i(jf0Var).remove(this.h);
        } else {
            if (!z) {
                g8.k();
                return;
            }
            lx0 lx0Var = this.d[this.e];
            Object obj = lx0Var.d[lx0Var.f];
            px0.i(jf0Var).remove(this.h);
            c(obj != null ? obj.hashCode() : 0, jf0Var.e, obj, 0);
        }
        this.h = null;
        this.i = false;
        this.j = jf0Var.g;
    }
}
