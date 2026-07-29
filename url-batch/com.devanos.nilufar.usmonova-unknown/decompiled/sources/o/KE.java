package o;

/* loaded from: classes.dex */
public final class KE extends AbstractC1596ny implements InterfaceC1455lp {
    public final /* synthetic */ ME h;
    public final /* synthetic */ TC i;
    public final /* synthetic */ IE j;
    public final /* synthetic */ long k;
    public final /* synthetic */ C2182wr l;
    public final /* synthetic */ boolean m;
    public final /* synthetic */ boolean n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ float f56o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KE(ME me, TC tc, IE ie, long j, C2182wr c2182wr, boolean z, boolean z2, float f) {
        super(0);
        this.h = me;
        this.i = tc;
        this.j = ie;
        this.k = j;
        this.l = c2182wr;
        this.m = z;
        this.n = z2;
        this.f56o = f;
    }

    @Override // o.InterfaceC1455lp
    public final Object invoke() {
        TC f = AbstractC0022At.f(this.i, this.j.b());
        ME me = this.h;
        IE ie = this.j;
        long j = this.k;
        C2182wr c2182wr = this.l;
        boolean z = this.m;
        boolean z2 = this.n;
        if (f == null) {
            me.m0(ie, j, c2182wr, z, z2);
        } else {
            float f2 = this.f56o;
            c2182wr.k(f, f2, z2, new KE(me, f, ie, j, c2182wr, z, z2, f2));
        }
        return C0782bY.a;
    }
}
