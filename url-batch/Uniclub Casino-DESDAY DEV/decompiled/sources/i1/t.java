package i1;

/* loaded from: classes.dex */
public final class t {

    /* renamed from: a, reason: collision with root package name */
    public H.e f2518a;

    /* renamed from: b, reason: collision with root package name */
    public s f2519b;
    public String d;

    /* renamed from: e, reason: collision with root package name */
    public j f2521e;

    /* renamed from: g, reason: collision with root package name */
    public v f2523g;
    public u h;
    public u i;

    /* renamed from: j, reason: collision with root package name */
    public u f2524j;

    /* renamed from: k, reason: collision with root package name */
    public long f2525k;

    /* renamed from: l, reason: collision with root package name */
    public long f2526l;

    /* renamed from: m, reason: collision with root package name */
    public m1.e f2527m;

    /* renamed from: c, reason: collision with root package name */
    public int f2520c = -1;

    /* renamed from: f, reason: collision with root package name */
    public C.g f2522f = new C.g(26);

    public static void b(u uVar, String str) {
        if (uVar != null) {
            if (uVar.f2533g != null) {
                throw new IllegalArgumentException(str.concat(".body != null").toString());
            }
            if (uVar.h != null) {
                throw new IllegalArgumentException(str.concat(".networkResponse != null").toString());
            }
            if (uVar.i != null) {
                throw new IllegalArgumentException(str.concat(".cacheResponse != null").toString());
            }
            if (uVar.f2534j != null) {
                throw new IllegalArgumentException(str.concat(".priorResponse != null").toString());
            }
        }
    }

    public final u a() {
        int i = this.f2520c;
        if (i < 0) {
            throw new IllegalStateException(("code < 0: " + this.f2520c).toString());
        }
        H.e eVar = this.f2518a;
        if (eVar == null) {
            throw new IllegalStateException("request == null");
        }
        s sVar = this.f2519b;
        if (sVar == null) {
            throw new IllegalStateException("protocol == null");
        }
        String str = this.d;
        if (str != null) {
            return new u(eVar, sVar, str, i, this.f2521e, this.f2522f.t(), this.f2523g, this.h, this.i, this.f2524j, this.f2525k, this.f2526l, this.f2527m);
        }
        throw new IllegalStateException("message == null");
    }
}
