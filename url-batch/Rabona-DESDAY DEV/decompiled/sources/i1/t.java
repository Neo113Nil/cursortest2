package i1;

/* loaded from: classes.dex */
public final class t {

    /* renamed from: a, reason: collision with root package name */
    public H.e f2515a;

    /* renamed from: b, reason: collision with root package name */
    public r f2516b;
    public String d;

    /* renamed from: e, reason: collision with root package name */
    public j f2518e;

    /* renamed from: g, reason: collision with root package name */
    public v f2520g;
    public u h;
    public u i;

    /* renamed from: j, reason: collision with root package name */
    public u f2521j;

    /* renamed from: k, reason: collision with root package name */
    public long f2522k;

    /* renamed from: l, reason: collision with root package name */
    public long f2523l;

    /* renamed from: m, reason: collision with root package name */
    public m1.e f2524m;

    /* renamed from: c, reason: collision with root package name */
    public int f2517c = -1;

    /* renamed from: f, reason: collision with root package name */
    public B0.d f2519f = new B0.d(26);

    public static void b(u uVar, String str) {
        if (uVar != null) {
            if (uVar.f2530g != null) {
                throw new IllegalArgumentException(str.concat(".body != null").toString());
            }
            if (uVar.h != null) {
                throw new IllegalArgumentException(str.concat(".networkResponse != null").toString());
            }
            if (uVar.i != null) {
                throw new IllegalArgumentException(str.concat(".cacheResponse != null").toString());
            }
            if (uVar.f2531j != null) {
                throw new IllegalArgumentException(str.concat(".priorResponse != null").toString());
            }
        }
    }

    public final u a() {
        int i = this.f2517c;
        if (i < 0) {
            throw new IllegalStateException(("code < 0: " + this.f2517c).toString());
        }
        H.e eVar = this.f2515a;
        if (eVar == null) {
            throw new IllegalStateException("request == null");
        }
        r rVar = this.f2516b;
        if (rVar == null) {
            throw new IllegalStateException("protocol == null");
        }
        String str = this.d;
        if (str != null) {
            return new u(eVar, rVar, str, i, this.f2518e, this.f2519f.t(), this.f2520g, this.h, this.i, this.f2521j, this.f2522k, this.f2523l, this.f2524m);
        }
        throw new IllegalStateException("message == null");
    }
}
