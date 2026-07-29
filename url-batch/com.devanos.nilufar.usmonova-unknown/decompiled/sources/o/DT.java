package o;

/* loaded from: classes.dex */
public final class DT extends AbstractC2367ze {
    public ET h;
    public InterfaceC2309ym i;
    public FT j;
    public InterfaceC0075Cu k;
    public Object l;
    public /* synthetic */ Object m;
    public final /* synthetic */ ET n;

    /* renamed from: o, reason: collision with root package name */
    public int f31o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DT(ET et, InterfaceC2235xe interfaceC2235xe) {
        super(interfaceC2235xe);
        this.n = et;
    }

    @Override // o.Y7
    public final Object invokeSuspend(Object obj) {
        this.m = obj;
        this.f31o |= Integer.MIN_VALUE;
        this.n.collect(null, this);
        return EnumC0448Re.h;
    }
}
