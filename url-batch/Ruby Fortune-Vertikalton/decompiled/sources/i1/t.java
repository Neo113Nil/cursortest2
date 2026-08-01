package i1;

/* loaded from: classes.dex */
public final class t {

    /* renamed from: a, reason: collision with root package name */
    public H.e f2509a;

    /* renamed from: b, reason: collision with root package name */
    public r f2510b;
    public String d;

    /* renamed from: e, reason: collision with root package name */
    public j f2512e;

    /* renamed from: g, reason: collision with root package name */
    public v f2514g;
    public u h;
    public u i;

    /* renamed from: j, reason: collision with root package name */
    public u f2515j;

    /* renamed from: k, reason: collision with root package name */
    public long f2516k;

    /* renamed from: l, reason: collision with root package name */
    public long f2517l;

    /* renamed from: m, reason: collision with root package name */
    public m1.e f2518m;

    /* renamed from: c, reason: collision with root package name */
    public int f2511c = -1;

    /* renamed from: f, reason: collision with root package name */
    public B0.d f2513f = new B0.d(27);

    public static void b(u uVar, String str) {
        if (uVar != null) {
            if (uVar.f2524g != null) {
                throw new IllegalArgumentException(str.concat(".body != null").toString());
            }
            if (uVar.h != null) {
                throw new IllegalArgumentException(str.concat(".networkResponse != null").toString());
            }
            if (uVar.i != null) {
                throw new IllegalArgumentException(str.concat(".cacheResponse != null").toString());
            }
            if (uVar.f2525j != null) {
                throw new IllegalArgumentException(str.concat(".priorResponse != null").toString());
            }
        }
    }

    public final u a() {
        int i = this.f2511c;
        if (i < 0) {
            throw new IllegalStateException(("code < 0: " + this.f2511c).toString());
        }
        H.e eVar = this.f2509a;
        if (eVar == null) {
            throw new IllegalStateException("request == null");
        }
        r rVar = this.f2510b;
        if (rVar == null) {
            throw new IllegalStateException("protocol == null");
        }
        String str = this.d;
        if (str != null) {
            return new u(eVar, rVar, str, i, this.f2512e, this.f2513f.r(), this.f2514g, this.h, this.i, this.f2515j, this.f2516k, this.f2517l, this.f2518m);
        }
        throw new IllegalStateException("message == null");
    }
}
