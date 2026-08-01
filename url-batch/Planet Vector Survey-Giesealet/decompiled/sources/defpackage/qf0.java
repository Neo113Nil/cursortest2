package defpackage;

import java.util.Iterator;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public final class qf0 extends i {
    public final hf0 d;

    public qf0(hf0 hf0Var) {
        this.d = hf0Var;
    }

    @Override // defpackage.i
    public final int a() {
        hf0 hf0Var = this.d;
        hf0Var.getClass();
        return hf0Var.e;
    }

    @Override // defpackage.i, java.util.Collection
    public final boolean contains(Object obj) {
        return this.d.containsValue(obj);
    }

    @Override // java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        kx0 kx0Var = this.d.d;
        lx0[] lx0VarArr = new lx0[8];
        for (int i = 0; i < 8; i++) {
            lx0VarArr[i] = new mx0(2);
        }
        return new pf0(kx0Var, lx0VarArr);
    }
}
