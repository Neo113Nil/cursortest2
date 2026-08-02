package t;

import D.C0018t;
import U.g;
import W.d;
import Y.f;
import d0.p;
import k0.r;
import n0.c;

/* renamed from: t.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0097a extends f implements p {

    /* renamed from: f, reason: collision with root package name */
    public int f1258f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ c f1259g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ C0018t f1260h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0097a(c cVar, C0018t c0018t, d dVar) {
        super(dVar);
        this.f1259g = cVar;
        this.f1260h = c0018t;
    }

    @Override // Y.b
    public final d b(Object obj, d dVar) {
        return new C0097a(this.f1259g, this.f1260h, dVar);
    }

    @Override // Y.b
    public final Object c(Object obj) {
        X.a aVar = X.a.f395b;
        int i2 = this.f1258f;
        if (i2 == 0) {
            a.a.B(obj);
            io.flutter.plugin.platform.c cVar = new io.flutter.plugin.platform.c(5, this.f1260h);
            this.f1258f = 1;
            if (this.f1259g.a(cVar, this) == aVar) {
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
        return ((C0097a) b((r) obj, (d) obj2)).c(g.f378a);
    }
}
