package defpackage;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public final class o4 extends lj {
    public q4 d;
    public long e;
    public /* synthetic */ Object f;
    public final /* synthetic */ q4 g;
    public int h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o4(q4 q4Var, lj ljVar) {
        super(ljVar);
        this.g = q4Var;
    }

    @Override // defpackage.h9
    public final Object invokeSuspend(Object obj) {
        this.f = obj;
        this.h |= Integer.MIN_VALUE;
        return this.g.j(0L, null, this);
    }
}
