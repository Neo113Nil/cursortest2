package i1;

import java.io.Closeable;

/* loaded from: classes.dex */
public final class u implements Closeable {

    /* renamed from: a, reason: collision with root package name */
    public final H.e f2528a;

    /* renamed from: b, reason: collision with root package name */
    public final s f2529b;

    /* renamed from: c, reason: collision with root package name */
    public final String f2530c;
    public final int d;

    /* renamed from: e, reason: collision with root package name */
    public final j f2531e;

    /* renamed from: f, reason: collision with root package name */
    public final l f2532f;

    /* renamed from: g, reason: collision with root package name */
    public final v f2533g;
    public final u h;
    public final u i;

    /* renamed from: j, reason: collision with root package name */
    public final u f2534j;

    /* renamed from: k, reason: collision with root package name */
    public final long f2535k;

    /* renamed from: l, reason: collision with root package name */
    public final long f2536l;

    /* renamed from: m, reason: collision with root package name */
    public final m1.e f2537m;

    public u(H.e eVar, s sVar, String str, int i, j jVar, l lVar, v vVar, u uVar, u uVar2, u uVar3, long j2, long j3, m1.e eVar2) {
        X0.d.e(eVar, "request");
        X0.d.e(sVar, "protocol");
        X0.d.e(str, "message");
        this.f2528a = eVar;
        this.f2529b = sVar;
        this.f2530c = str;
        this.d = i;
        this.f2531e = jVar;
        this.f2532f = lVar;
        this.f2533g = vVar;
        this.h = uVar;
        this.i = uVar2;
        this.f2534j = uVar3;
        this.f2535k = j2;
        this.f2536l = j3;
        this.f2537m = eVar2;
    }

    public static String e(u uVar, String str) {
        uVar.getClass();
        String a2 = uVar.f2532f.a(str);
        if (a2 == null) {
            return null;
        }
        return a2;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        v vVar = this.f2533g;
        if (vVar == null) {
            throw new IllegalStateException("response is not eligible for a body and must not be closed");
        }
        vVar.close();
    }

    public final t f() {
        t tVar = new t();
        tVar.f2518a = this.f2528a;
        tVar.f2519b = this.f2529b;
        tVar.f2520c = this.d;
        tVar.d = this.f2530c;
        tVar.f2521e = this.f2531e;
        tVar.f2522f = this.f2532f.c();
        tVar.f2523g = this.f2533g;
        tVar.h = this.h;
        tVar.i = this.i;
        tVar.f2524j = this.f2534j;
        tVar.f2525k = this.f2535k;
        tVar.f2526l = this.f2536l;
        tVar.f2527m = this.f2537m;
        return tVar;
    }

    public final String toString() {
        return "Response{protocol=" + this.f2529b + ", code=" + this.d + ", message=" + this.f2530c + ", url=" + ((n) this.f2528a.f206c) + '}';
    }
}
