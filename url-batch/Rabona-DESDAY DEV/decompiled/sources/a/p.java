package a;

/* loaded from: classes.dex */
public final class p extends X0.e implements W0.a {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f1082b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ x f1083c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ p(x xVar, int i) {
        super(0);
        this.f1082b = i;
        this.f1083c = xVar;
    }

    @Override // W0.a
    public final Object a() {
        switch (this.f1082b) {
            case 0:
                this.f1083c.b();
                break;
            case 1:
                this.f1083c.a();
                break;
            default:
                this.f1083c.b();
                break;
        }
        return P0.d.f626c;
    }
}
