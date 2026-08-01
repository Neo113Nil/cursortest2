package i1;

import java.io.Closeable;

/* loaded from: classes.dex */
public final class t implements Closeable {

    /* renamed from: a, reason: collision with root package name */
    public final H.e f2503a;

    /* renamed from: b, reason: collision with root package name */
    public final q f2504b;

    /* renamed from: c, reason: collision with root package name */
    public final String f2505c;
    public final int d;

    /* renamed from: e, reason: collision with root package name */
    public final j f2506e;

    /* renamed from: f, reason: collision with root package name */
    public final k f2507f;

    /* renamed from: g, reason: collision with root package name */
    public final u f2508g;
    public final t h;
    public final t i;

    /* renamed from: j, reason: collision with root package name */
    public final t f2509j;

    /* renamed from: k, reason: collision with root package name */
    public final long f2510k;

    /* renamed from: l, reason: collision with root package name */
    public final long f2511l;

    /* renamed from: m, reason: collision with root package name */
    public final m1.e f2512m;

    public t(H.e eVar, q qVar, String str, int i, j jVar, k kVar, u uVar, t tVar, t tVar2, t tVar3, long j2, long j3, m1.e eVar2) {
        X0.e.e(eVar, "request");
        X0.e.e(qVar, "protocol");
        X0.e.e(str, "message");
        this.f2503a = eVar;
        this.f2504b = qVar;
        this.f2505c = str;
        this.d = i;
        this.f2506e = jVar;
        this.f2507f = kVar;
        this.f2508g = uVar;
        this.h = tVar;
        this.i = tVar2;
        this.f2509j = tVar3;
        this.f2510k = j2;
        this.f2511l = j3;
        this.f2512m = eVar2;
    }

    public static String e(t tVar, String str) {
        tVar.getClass();
        String a2 = tVar.f2507f.a(str);
        if (a2 == null) {
            return null;
        }
        return a2;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        u uVar = this.f2508g;
        if (uVar == null) {
            throw new IllegalStateException("response is not eligible for a body and must not be closed");
        }
        uVar.close();
    }

    public final s f() {
        s sVar = new s();
        sVar.f2493a = this.f2503a;
        sVar.f2494b = this.f2504b;
        sVar.f2495c = this.d;
        sVar.d = this.f2505c;
        sVar.f2496e = this.f2506e;
        sVar.f2497f = this.f2507f.c();
        sVar.f2498g = this.f2508g;
        sVar.h = this.h;
        sVar.i = this.i;
        sVar.f2499j = this.f2509j;
        sVar.f2500k = this.f2510k;
        sVar.f2501l = this.f2511l;
        sVar.f2502m = this.f2512m;
        return sVar;
    }

    public final String toString() {
        return "Response{protocol=" + this.f2504b + ", code=" + this.d + ", message=" + this.f2505c + ", url=" + ((m) this.f2503a.f213c) + '}';
    }
}
