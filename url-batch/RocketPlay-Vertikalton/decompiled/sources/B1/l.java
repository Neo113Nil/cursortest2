package B1;

import h1.InterfaceC0173a;

/* loaded from: classes.dex */
public final class l extends i1.g implements InterfaceC0173a {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ x1.d f202b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ x1.i f203c;
    public final /* synthetic */ x1.a d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(x1.d dVar, x1.i iVar, x1.a aVar) {
        super(0);
        this.f202b = dVar;
        this.f203c = iVar;
        this.d = aVar;
    }

    @Override // h1.InterfaceC0173a
    public final Object c() {
        F1.d dVar = this.f202b.f4490b;
        i1.f.b(dVar);
        return dVar.q(this.f203c.a(), this.d.h.d);
    }
}
