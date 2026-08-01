package defpackage;

import java.util.List;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public final class hm extends v00 implements mu {
    public final /* synthetic */ y70 e;
    public final /* synthetic */ boolean f;
    public final /* synthetic */ List g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hm(y70 y70Var, List list, boolean z) {
        super(1);
        this.e = y70Var;
        this.f = z;
        this.g = list;
    }

    @Override // defpackage.mu
    public final Object c(Object obj) {
        final y70 y70Var = this.e;
        final List list = this.g;
        final boolean z = this.f;
        m20 m20Var = new m20() { // from class: gm
            @Override // defpackage.m20
            public final void g(o20 o20Var, e20 e20Var) {
                boolean z2 = z;
                List list2 = list;
                y70 y70Var2 = y70Var;
                if (z2 && !list2.contains(y70Var2)) {
                    list2.add(y70Var2);
                }
                if (e20Var == e20.ON_START && !list2.contains(y70Var2)) {
                    list2.add(y70Var2);
                }
                if (e20Var == e20.ON_STOP) {
                    list2.remove(y70Var2);
                }
            }
        };
        y70Var.k.a(m20Var);
        return new x3(2, y70Var, m20Var);
    }
}
