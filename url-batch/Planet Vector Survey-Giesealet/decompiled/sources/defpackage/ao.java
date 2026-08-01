package defpackage;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public final class ao extends lj {
    public qo0 d;
    public rn e;
    public /* synthetic */ Object f;
    public final /* synthetic */ qo0 g;
    public int h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ao(qo0 qo0Var, lj ljVar) {
        super(ljVar);
        this.g = qo0Var;
    }

    @Override // defpackage.h9
    public final Object invokeSuspend(Object obj) {
        this.f = obj;
        this.h |= Integer.MIN_VALUE;
        return qo0.o0(this.g, null, this);
    }
}
