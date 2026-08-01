package defpackage;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public final class z80 extends v00 implements mu {
    public final /* synthetic */ int e;
    public final /* synthetic */ rg f;
    public final /* synthetic */ mu g;
    public final /* synthetic */ mu h;
    public final /* synthetic */ f70 i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ z80(rg rgVar, mu muVar, mu muVar2, f70 f70Var, int i) {
        super(1);
        this.e = i;
        this.f = rgVar;
        this.g = muVar;
        this.h = muVar2;
        this.i = f70Var;
    }

    @Override // defpackage.mu
    public final Object c(Object obj) {
        int i = this.e;
        mu muVar = this.g;
        mu muVar2 = this.h;
        f70 f70Var = this.i;
        rg rgVar = this.f;
        switch (i) {
            case 0:
                p6 p6Var = (p6) obj;
                j80 j80Var = j80.f;
                m80 m80Var = ((y70) p6Var.c()).e;
                m80Var.getClass();
                qg qgVar = (qg) m80Var;
                if (((Boolean) rgVar.c.getValue()).booleanValue() || x40.i(f70Var)) {
                    int i2 = m80.l;
                    for (m80 m80Var2 : kq0.z(qgVar, j80Var)) {
                    }
                    return (kq) muVar.c(p6Var);
                }
                int i3 = m80.l;
                for (m80 m80Var3 : kq0.z(qgVar, j80Var)) {
                }
                return (kq) muVar2.c(p6Var);
            default:
                p6 p6Var2 = (p6) obj;
                j80 j80Var2 = j80.f;
                m80 m80Var4 = ((y70) p6Var2.b()).e;
                m80Var4.getClass();
                qg qgVar2 = (qg) m80Var4;
                if (((Boolean) rgVar.c.getValue()).booleanValue() || x40.i(f70Var)) {
                    int i4 = m80.l;
                    for (m80 m80Var5 : kq0.z(qgVar2, j80Var2)) {
                    }
                    return (wq) muVar.c(p6Var2);
                }
                int i5 = m80.l;
                for (m80 m80Var6 : kq0.z(qgVar2, j80Var2)) {
                }
                return (wq) muVar2.c(p6Var2);
        }
    }
}
