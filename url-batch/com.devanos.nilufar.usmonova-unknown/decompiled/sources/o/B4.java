package o;

/* loaded from: classes.dex */
public final class B4 extends AbstractC2367ze {
    public String h;
    public ZD i;
    public String j;
    public int k;
    public int l;
    public /* synthetic */ Object m;
    public final /* synthetic */ C4 n;

    /* renamed from: o, reason: collision with root package name */
    public int f17o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public B4(C4 c4, AbstractC2367ze abstractC2367ze) {
        super(abstractC2367ze);
        this.n = c4;
    }

    @Override // o.Y7
    public final Object invokeSuspend(Object obj) {
        this.m = obj;
        this.f17o |= Integer.MIN_VALUE;
        return this.n.f(null, this);
    }
}
