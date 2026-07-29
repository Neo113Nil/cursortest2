package o;

/* renamed from: o.vf, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2104vf extends AbstractC2367ze {
    public Object h;
    public Object i;
    public Object j;
    public C1360kM k;
    public C0657Zf l;
    public /* synthetic */ Object m;
    public final /* synthetic */ C2170wf n;

    /* renamed from: o, reason: collision with root package name */
    public int f233o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2104vf(C2170wf c2170wf, AbstractC2367ze abstractC2367ze) {
        super(abstractC2367ze);
        this.n = c2170wf;
    }

    @Override // o.Y7
    public final Object invokeSuspend(Object obj) {
        this.m = obj;
        this.f233o |= Integer.MIN_VALUE;
        return this.n.a(null, this);
    }
}
