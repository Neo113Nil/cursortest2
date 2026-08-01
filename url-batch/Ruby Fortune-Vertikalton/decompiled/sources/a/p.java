package a;

/* loaded from: classes.dex */
public final class p extends X0.f implements W0.a {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f1076b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ x f1077c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ p(x xVar, int i) {
        super(0);
        this.f1076b = i;
        this.f1077c = xVar;
    }

    @Override // W0.a
    public final Object a() {
        switch (this.f1076b) {
            case 0:
                this.f1077c.b();
                break;
            case 1:
                this.f1077c.a();
                break;
            default:
                this.f1077c.b();
                break;
        }
        return P0.d.f626c;
    }
}
