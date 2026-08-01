package defpackage;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public final class iq extends v00 implements mu {
    public final /* synthetic */ int e;
    public final /* synthetic */ jq f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ iq(jq jqVar, int i) {
        super(1);
        this.e = i;
        this.f = jqVar;
    }

    @Override // defpackage.mu
    public final Object c(Object obj) {
        int i = this.e;
        cq cqVar = cq.f;
        cq cqVar2 = cq.e;
        cq cqVar3 = cq.d;
        jq jqVar = this.f;
        switch (i) {
            case 0:
                yw0 yw0Var = (yw0) obj;
                boolean a = yw0Var.a(cqVar3, cqVar2);
                ts0 ts0Var = null;
                if (!a) {
                    if (yw0Var.a(cqVar2, cqVar)) {
                        dx0 dx0Var = jqVar.s.a;
                    } else {
                        ts0Var = gq.d;
                    }
                }
                return ts0Var == null ? gq.d : ts0Var;
            default:
                yw0 yw0Var2 = (yw0) obj;
                if (yw0Var2.a(cqVar3, cqVar2)) {
                    return gq.c;
                }
                if (!yw0Var2.a(cqVar2, cqVar)) {
                    return gq.c;
                }
                dx0 dx0Var2 = jqVar.s.a;
                return gq.c;
        }
    }
}
