package i1;

import java.io.Closeable;

/* loaded from: classes.dex */
public final class u implements Closeable {

    /* renamed from: a, reason: collision with root package name */
    public final H.e f2525a;

    /* renamed from: b, reason: collision with root package name */
    public final r f2526b;

    /* renamed from: c, reason: collision with root package name */
    public final String f2527c;
    public final int d;

    /* renamed from: e, reason: collision with root package name */
    public final j f2528e;

    /* renamed from: f, reason: collision with root package name */
    public final k f2529f;

    /* renamed from: g, reason: collision with root package name */
    public final v f2530g;
    public final u h;
    public final u i;

    /* renamed from: j, reason: collision with root package name */
    public final u f2531j;

    /* renamed from: k, reason: collision with root package name */
    public final long f2532k;

    /* renamed from: l, reason: collision with root package name */
    public final long f2533l;

    /* renamed from: m, reason: collision with root package name */
    public final m1.e f2534m;

    public u(H.e eVar, r rVar, String str, int i, j jVar, k kVar, v vVar, u uVar, u uVar2, u uVar3, long j2, long j3, m1.e eVar2) {
        X0.d.e(eVar, "request");
        X0.d.e(rVar, "protocol");
        X0.d.e(str, "message");
        this.f2525a = eVar;
        this.f2526b = rVar;
        this.f2527c = str;
        this.d = i;
        this.f2528e = jVar;
        this.f2529f = kVar;
        this.f2530g = vVar;
        this.h = uVar;
        this.i = uVar2;
        this.f2531j = uVar3;
        this.f2532k = j2;
        this.f2533l = j3;
        this.f2534m = eVar2;
    }

    public static String e(u uVar, String str) {
        uVar.getClass();
        String a2 = uVar.f2529f.a(str);
        if (a2 == null) {
            return null;
        }
        return a2;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        v vVar = this.f2530g;
        if (vVar == null) {
            throw new IllegalStateException("response is not eligible for a body and must not be closed");
        }
        vVar.close();
    }

    public final t f() {
        t tVar = new t();
        tVar.f2515a = this.f2525a;
        tVar.f2516b = this.f2526b;
        tVar.f2517c = this.d;
        tVar.d = this.f2527c;
        tVar.f2518e = this.f2528e;
        tVar.f2519f = this.f2529f.c();
        tVar.f2520g = this.f2530g;
        tVar.h = this.h;
        tVar.i = this.i;
        tVar.f2521j = this.f2531j;
        tVar.f2522k = this.f2532k;
        tVar.f2523l = this.f2533l;
        tVar.f2524m = this.f2534m;
        return tVar;
    }

    public final String toString() {
        return "Response{protocol=" + this.f2526b + ", code=" + this.d + ", message=" + this.f2527c + ", url=" + ((m) this.f2525a.f213c) + '}';
    }
}
