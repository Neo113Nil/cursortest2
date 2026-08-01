package defpackage;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public final class mo0 extends lj {
    public long d;
    public /* synthetic */ Object e;
    public final /* synthetic */ p01 f;
    public int g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mo0(p01 p01Var, lj ljVar) {
        super(ljVar);
        this.f = p01Var;
    }

    @Override // defpackage.h9
    public final Object invokeSuspend(Object obj) {
        this.e = obj;
        this.g |= Integer.MIN_VALUE;
        return this.f.q(0L, 0L, this);
    }
}
