package a;

/* loaded from: classes.dex */
public final class p extends X0.f implements W0.a {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f1079b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ x f1080c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ p(x xVar, int i) {
        super(0);
        this.f1079b = i;
        this.f1080c = xVar;
    }

    @Override // W0.a
    public final Object a() {
        switch (this.f1079b) {
            case 0:
                this.f1080c.b();
                break;
            case 1:
                this.f1080c.a();
                break;
            default:
                this.f1080c.b();
                break;
        }
        return P0.d.f626c;
    }
}
