package defpackage;

import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
@o90("dialog")
/* loaded from: classes.dex */
public final class lm extends p90 {
    @Override // defpackage.p90
    public final m80 a() {
        eg egVar = lg.a;
        return new km(this);
    }

    @Override // defpackage.p90
    public final void d(List list, c90 c90Var) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            b().f((y70) it.next());
        }
    }

    @Override // defpackage.p90
    public final void e(y70 y70Var, boolean z) {
        b().e(y70Var, z);
        int e0 = zd.e0((Iterable) b().f.d.getValue(), y70Var);
        int i = 0;
        for (Object obj : (Iterable) b().f.d.getValue()) {
            int i2 = i + 1;
            if (i < 0) {
                px0.V();
                throw null;
            }
            y70 y70Var2 = (y70) obj;
            if (i > e0) {
                b().b(y70Var2);
            }
            i = i2;
        }
    }
}
