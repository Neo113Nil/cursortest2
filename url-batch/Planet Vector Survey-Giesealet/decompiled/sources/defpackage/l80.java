package defpackage;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public final class l80 extends v00 implements mu {
    public final /* synthetic */ int e;
    public final /* synthetic */ i80 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l80(i80 i80Var, int i) {
        super(1);
        this.e = i;
        this.f = i80Var;
    }

    @Override // defpackage.mu
    public final Object c(Object obj) {
        int i = this.e;
        i80 i80Var = this.f;
        switch (i) {
            case 0:
                ((String) obj).getClass();
                return Boolean.valueOf(!i80Var.c().contains(r2));
            default:
                ((String) obj).getClass();
                return Boolean.valueOf(!i80Var.c().contains(r2));
        }
    }
}
