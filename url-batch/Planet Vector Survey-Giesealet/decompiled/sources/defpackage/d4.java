package defpackage;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public final class d4 extends lj {
    public db d;
    public /* synthetic */ Object e;
    public final /* synthetic */ e4 f;
    public int g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d4(e4 e4Var, lj ljVar) {
        super(ljVar);
        this.f = e4Var;
    }

    @Override // defpackage.h9
    public final Object invokeSuspend(Object obj) {
        this.e = obj;
        this.g |= Integer.MIN_VALUE;
        return this.f.h(this);
    }
}
