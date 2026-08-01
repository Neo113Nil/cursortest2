package m1;

import i1.r;

/* loaded from: classes.dex */
public final class l extends X0.e implements W0.a {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ i1.d f3247b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ i1.j f3248c;
    public final /* synthetic */ i1.a d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(i1.d dVar, i1.j jVar, i1.a aVar) {
        super(0);
        this.f3247b = dVar;
        this.f3248c = jVar;
        this.d = aVar;
    }

    @Override // W0.a
    public final Object a() {
        r rVar = this.f3247b.f2411b;
        X0.d.b(rVar);
        return rVar.c(this.f3248c.a(), this.d.h.d);
    }
}
