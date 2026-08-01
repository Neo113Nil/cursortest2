package i1;

/* loaded from: classes.dex */
public final class s {

    /* renamed from: a, reason: collision with root package name */
    public H.e f2493a;

    /* renamed from: b, reason: collision with root package name */
    public q f2494b;
    public String d;

    /* renamed from: e, reason: collision with root package name */
    public j f2496e;

    /* renamed from: g, reason: collision with root package name */
    public u f2498g;
    public t h;
    public t i;

    /* renamed from: j, reason: collision with root package name */
    public t f2499j;

    /* renamed from: k, reason: collision with root package name */
    public long f2500k;

    /* renamed from: l, reason: collision with root package name */
    public long f2501l;

    /* renamed from: m, reason: collision with root package name */
    public m1.e f2502m;

    /* renamed from: c, reason: collision with root package name */
    public int f2495c = -1;

    /* renamed from: f, reason: collision with root package name */
    public B0.d f2497f = new B0.d(26);

    public static void b(t tVar, String str) {
        if (tVar != null) {
            if (tVar.f2508g != null) {
                throw new IllegalArgumentException(str.concat(".body != null").toString());
            }
            if (tVar.h != null) {
                throw new IllegalArgumentException(str.concat(".networkResponse != null").toString());
            }
            if (tVar.i != null) {
                throw new IllegalArgumentException(str.concat(".cacheResponse != null").toString());
            }
            if (tVar.f2509j != null) {
                throw new IllegalArgumentException(str.concat(".priorResponse != null").toString());
            }
        }
    }

    public final t a() {
        int i = this.f2495c;
        if (i < 0) {
            throw new IllegalStateException(("code < 0: " + this.f2495c).toString());
        }
        H.e eVar = this.f2493a;
        if (eVar == null) {
            throw new IllegalStateException("request == null");
        }
        q qVar = this.f2494b;
        if (qVar == null) {
            throw new IllegalStateException("protocol == null");
        }
        String str = this.d;
        if (str != null) {
            return new t(eVar, qVar, str, i, this.f2496e, this.f2497f.t(), this.f2498g, this.h, this.i, this.f2499j, this.f2500k, this.f2501l, this.f2502m);
        }
        throw new IllegalStateException("message == null");
    }
}
