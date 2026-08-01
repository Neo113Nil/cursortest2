package defpackage;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public final class v90 extends lj {
    public /* synthetic */ Object d;
    public final /* synthetic */ k2 e;
    public int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v90(k2 k2Var, lj ljVar) {
        super(ljVar);
        this.e = k2Var;
    }

    @Override // defpackage.h9
    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.f |= Integer.MIN_VALUE;
        return this.e.e(0L, this);
    }
}
