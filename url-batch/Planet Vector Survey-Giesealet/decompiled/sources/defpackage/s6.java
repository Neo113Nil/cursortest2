package defpackage;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public final class s6 extends v00 implements bu {
    public final /* synthetic */ int e;
    public final /* synthetic */ cx0 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ s6(cx0 cx0Var, int i) {
        super(0);
        this.e = i;
        this.f = cx0Var;
    }

    @Override // defpackage.bu
    public final Object a() {
        int i = this.e;
        cx0 cx0Var = this.f;
        switch (i) {
            case 0:
                Object b = cx0Var.a.b();
                cq cqVar = cq.f;
                return Boolean.valueOf(b == cqVar && cx0Var.d.getValue() == cqVar);
            default:
                return Long.valueOf(cx0Var.b());
        }
    }
}
