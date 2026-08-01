package defpackage;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public final class vr extends lj {
    public t6 d;
    public Object e;
    public /* synthetic */ Object f;
    public final /* synthetic */ t6 g;
    public int h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vr(t6 t6Var, kj kjVar) {
        super(kjVar);
        this.g = t6Var;
    }

    @Override // defpackage.h9
    public final Object invokeSuspend(Object obj) {
        this.f = obj;
        this.h |= Integer.MIN_VALUE;
        return this.g.e(null, this);
    }
}
