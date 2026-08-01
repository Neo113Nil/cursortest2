package a;

import h1.InterfaceC0173a;

/* loaded from: classes.dex */
public final class p extends i1.g implements InterfaceC0173a {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f1605b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ x f1606c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ p(x xVar, int i) {
        super(0);
        this.f1605b = i;
        this.f1606c = xVar;
    }

    @Override // h1.InterfaceC0173a
    public final Object c() {
        switch (this.f1605b) {
            case 0:
                this.f1606c.b();
                break;
            case 1:
                this.f1606c.a();
                break;
            default:
                this.f1606c.b();
                break;
        }
        return V0.i.f1250a;
    }
}
