package a;

/* loaded from: classes.dex */
public final class o extends g1.g implements f1.a {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f1211b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ w f1212c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ o(w wVar, int i) {
        super(0);
        this.f1211b = i;
        this.f1212c = wVar;
    }

    @Override // f1.a
    public final Object c() {
        switch (this.f1211b) {
            case 0:
                this.f1212c.b();
                break;
            case 1:
                this.f1212c.a();
                break;
            default:
                this.f1212c.b();
                break;
        }
        return U0.i.f870a;
    }
}
