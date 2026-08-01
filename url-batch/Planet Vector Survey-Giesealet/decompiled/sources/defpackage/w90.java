package defpackage;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public final class w90 extends lj {
    public long d;
    public long e;
    public /* synthetic */ Object f;
    public final /* synthetic */ y90 g;
    public int h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w90(y90 y90Var, lj ljVar) {
        super(ljVar);
        this.g = y90Var;
    }

    @Override // defpackage.h9
    public final Object invokeSuspend(Object obj) {
        this.f = obj;
        this.h |= Integer.MIN_VALUE;
        return this.g.k0(0L, 0L, this);
    }
}
