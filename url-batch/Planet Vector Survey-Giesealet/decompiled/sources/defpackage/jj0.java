package defpackage;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public final class jj0 extends lj {
    public /* synthetic */ Object d;
    public final /* synthetic */ kj0 e;
    public int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jj0(kj0 kj0Var, lj ljVar) {
        super(ljVar);
        this.e = kj0Var;
    }

    @Override // defpackage.h9
    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.f |= Integer.MIN_VALUE;
        return this.e.a(0.0f, this);
    }
}
