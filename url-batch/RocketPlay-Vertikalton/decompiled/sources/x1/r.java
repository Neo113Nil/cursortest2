package x1;

import l.C0265n;

/* loaded from: classes.dex */
public final class r {

    /* renamed from: a, reason: collision with root package name */
    public H.e f4590a;

    /* renamed from: b, reason: collision with root package name */
    public q f4591b;
    public String d;

    /* renamed from: e, reason: collision with root package name */
    public i f4593e;

    /* renamed from: g, reason: collision with root package name */
    public C1.h f4595g;
    public s h;
    public s i;

    /* renamed from: j, reason: collision with root package name */
    public s f4596j;

    /* renamed from: k, reason: collision with root package name */
    public long f4597k;

    /* renamed from: l, reason: collision with root package name */
    public long f4598l;

    /* renamed from: m, reason: collision with root package name */
    public B1.e f4599m;

    /* renamed from: c, reason: collision with root package name */
    public int f4592c = -1;

    /* renamed from: f, reason: collision with root package name */
    public C0265n f4594f = new C0265n(5);

    public static void b(String str, s sVar) {
        if (sVar != null) {
            if (sVar.f4605g != null) {
                throw new IllegalArgumentException(str.concat(".body != null").toString());
            }
            if (sVar.h != null) {
                throw new IllegalArgumentException(str.concat(".networkResponse != null").toString());
            }
            if (sVar.i != null) {
                throw new IllegalArgumentException(str.concat(".cacheResponse != null").toString());
            }
            if (sVar.f4606j != null) {
                throw new IllegalArgumentException(str.concat(".priorResponse != null").toString());
            }
        }
    }

    public final s a() {
        int i = this.f4592c;
        if (i < 0) {
            throw new IllegalStateException(("code < 0: " + this.f4592c).toString());
        }
        H.e eVar = this.f4590a;
        if (eVar == null) {
            throw new IllegalStateException("request == null");
        }
        q qVar = this.f4591b;
        if (qVar == null) {
            throw new IllegalStateException("protocol == null");
        }
        String str = this.d;
        if (str != null) {
            return new s(eVar, qVar, str, i, this.f4593e, this.f4594f.i(), this.f4595g, this.h, this.i, this.f4596j, this.f4597k, this.f4598l, this.f4599m);
        }
        throw new IllegalStateException("message == null");
    }
}
