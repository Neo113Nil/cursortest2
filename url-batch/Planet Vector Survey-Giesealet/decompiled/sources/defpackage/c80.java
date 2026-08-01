package defpackage;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public final class c80 extends v00 implements mu {
    public final /* synthetic */ int e;
    public final /* synthetic */ s80 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c80(s80 s80Var, int i) {
        super(1);
        this.e = i;
        this.f = s80Var;
    }

    @Override // defpackage.mu
    public final Object c(Object obj) {
        int i = this.e;
        s80 s80Var = this.f;
        switch (i) {
            case 0:
                ((m80) obj).getClass();
                return Boolean.valueOf(!s80Var.m.containsKey(Integer.valueOf(r2.i)));
            default:
                ((m80) obj).getClass();
                return Boolean.valueOf(!s80Var.m.containsKey(Integer.valueOf(r2.i)));
        }
    }
}
