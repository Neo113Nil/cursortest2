package o;

/* renamed from: o.u4, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2001u4 extends AbstractC2367ze {
    public int h;
    public int i;
    public int j;
    public int k;
    public String l;
    public InterfaceC2114vp m;
    public C1360kM n;

    /* renamed from: o, reason: collision with root package name */
    public /* synthetic */ Object f228o;
    public final /* synthetic */ C4 p;
    public int q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2001u4(C4 c4, AbstractC2367ze abstractC2367ze) {
        super(abstractC2367ze);
        this.p = c4;
    }

    @Override // o.Y7
    public final Object invokeSuspend(Object obj) {
        this.f228o = obj;
        this.q |= Integer.MIN_VALUE;
        Object b = this.p.b(0, null, null, this);
        return b == EnumC0448Re.h ? b : new C1428lO(b);
    }
}
