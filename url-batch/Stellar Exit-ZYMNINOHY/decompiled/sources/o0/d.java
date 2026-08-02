package o0;

import U.g;
import Y.f;
import d0.p;
import m0.r;

/* loaded from: classes.dex */
public final class d extends f implements p {

    /* renamed from: f, reason: collision with root package name */
    public int f1120f;

    /* renamed from: g, reason: collision with root package name */
    public /* synthetic */ Object f1121g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ n0.b f1122h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(n0.b bVar, W.d dVar) {
        super(dVar);
        this.f1122h = bVar;
    }

    @Override // Y.b
    public final W.d b(Object obj, W.d dVar) {
        d dVar2 = new d(this.f1122h, dVar);
        dVar2.f1121g = obj;
        return dVar2;
    }

    @Override // Y.b
    public final Object c(Object obj) {
        X.a aVar = X.a.f395b;
        int i2 = this.f1120f;
        if (i2 == 0) {
            a.a.B(obj);
            r rVar = (r) this.f1121g;
            this.f1120f = 1;
            if (this.f1122h.b(rVar, this) == aVar) {
                return aVar;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            a.a.B(obj);
        }
        return g.f378a;
    }

    @Override // d0.p
    public final Object e(Object obj, Object obj2) {
        return ((d) b((r) obj, (W.d) obj2)).c(g.f378a);
    }
}
