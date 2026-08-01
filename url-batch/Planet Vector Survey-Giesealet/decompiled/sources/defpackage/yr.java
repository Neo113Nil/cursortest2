package defpackage;

/* loaded from: classes.dex */
public final class yr extends lj {
    public fn d;
    public /* synthetic */ Object e;
    public int f;
    public final /* synthetic */ fn g;
    public Object h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yr(fn fnVar, kj kjVar) {
        super(kjVar);
        this.g = fnVar;
    }

    @Override // defpackage.h9
    public final Object invokeSuspend(Object obj) {
        this.e = obj;
        this.f |= Integer.MIN_VALUE;
        return this.g.e(null, this);
    }
}
