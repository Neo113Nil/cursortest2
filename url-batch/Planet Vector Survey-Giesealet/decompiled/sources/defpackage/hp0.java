package defpackage;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public final class hp0 extends lj {
    public jp0 d;
    public Object e;
    public /* synthetic */ Object f;
    public final /* synthetic */ jp0 g;
    public int h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hp0(jp0 jp0Var, lj ljVar) {
        super(ljVar);
        this.g = jp0Var;
    }

    @Override // defpackage.h9
    public final Object invokeSuspend(Object obj) {
        this.f = obj;
        this.h |= Integer.MIN_VALUE;
        return jp0.k(this.g, this);
    }
}
