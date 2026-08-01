package defpackage;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public final class x90 extends lj {
    public long d;
    public /* synthetic */ Object e;
    public final /* synthetic */ y90 f;
    public int g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x90(y90 y90Var, lj ljVar) {
        super(ljVar);
        this.f = y90Var;
    }

    @Override // defpackage.h9
    public final Object invokeSuspend(Object obj) {
        this.e = obj;
        this.g |= Integer.MIN_VALUE;
        return this.f.m0(0L, this);
    }
}
