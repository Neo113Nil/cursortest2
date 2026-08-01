package defpackage;

import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public final class w80 extends v00 implements mu {
    public final /* synthetic */ Map e;
    public final /* synthetic */ rg f;
    public final /* synthetic */ mu g;
    public final /* synthetic */ mu h;
    public final /* synthetic */ mu i;
    public final /* synthetic */ bt0 j;
    public final /* synthetic */ f70 k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w80(Map map, rg rgVar, mu muVar, mu muVar2, mu muVar3, bt0 bt0Var, f70 f70Var) {
        super(1);
        this.e = map;
        this.f = rgVar;
        this.g = muVar;
        this.h = muVar2;
        this.i = muVar3;
        this.j = bt0Var;
        this.k = f70Var;
    }

    @Override // defpackage.mu
    public final Object c(Object obj) {
        p6 p6Var = (p6) obj;
        float f = 0.0f;
        if (!((List) this.j.getValue()).contains(p6Var.b())) {
            return new fj(kq.b, wq.b, 0.0f, new hr0(h6.f));
        }
        String str = ((y70) p6Var.b()).i;
        Map map = this.e;
        Float f2 = (Float) map.get(str);
        if (f2 != null) {
            f = f2.floatValue();
        } else {
            map.put(((y70) p6Var.b()).i, Float.valueOf(0.0f));
        }
        if (!nz.l(((y70) p6Var.c()).i, ((y70) p6Var.b()).i)) {
            f = (((Boolean) this.f.c.getValue()).booleanValue() || ((Boolean) this.k.getValue()).booleanValue()) ? f - 1.0f : f + 1.0f;
        }
        map.put(((y70) p6Var.c()).i, Float.valueOf(f));
        return new fj((kq) this.g.c(p6Var), (wq) this.h.c(p6Var), f, (hr0) this.i.c(p6Var));
    }
}
