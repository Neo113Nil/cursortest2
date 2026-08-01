package defpackage;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public final class zn extends lj {
    public qo0 d;
    public qn e;
    public eo f;
    public /* synthetic */ Object g;
    public final /* synthetic */ qo0 h;
    public int i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zn(qo0 qo0Var, lj ljVar) {
        super(ljVar);
        this.h = qo0Var;
    }

    @Override // defpackage.h9
    public final Object invokeSuspend(Object obj) {
        this.g = obj;
        this.i |= Integer.MIN_VALUE;
        return qo0.n0(this.h, null, this);
    }
}
