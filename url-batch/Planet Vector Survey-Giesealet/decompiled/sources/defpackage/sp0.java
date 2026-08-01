package defpackage;

import java.util.List;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public final class sp0 {
    public final np0 a;
    public final q60 b;

    public sp0(rp0 rp0Var, zy zyVar) {
        this.a = rp0Var.d;
        this.b = new q60(rp0.j(4, rp0Var).size());
        List j = rp0.j(4, rp0Var);
        int size = j.size();
        for (int i = 0; i < size; i++) {
            rp0 rp0Var2 = (rp0) j.get(i);
            if (zyVar.a(rp0Var2.g)) {
                this.b.a(rp0Var2.g);
            }
        }
    }
}
