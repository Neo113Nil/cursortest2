package i1;

import java.io.Closeable;

/* loaded from: classes.dex */
public final class u implements Closeable {

    /* renamed from: a, reason: collision with root package name */
    public final H.e f2519a;

    /* renamed from: b, reason: collision with root package name */
    public final r f2520b;

    /* renamed from: c, reason: collision with root package name */
    public final String f2521c;
    public final int d;

    /* renamed from: e, reason: collision with root package name */
    public final j f2522e;

    /* renamed from: f, reason: collision with root package name */
    public final k f2523f;

    /* renamed from: g, reason: collision with root package name */
    public final v f2524g;
    public final u h;
    public final u i;

    /* renamed from: j, reason: collision with root package name */
    public final u f2525j;

    /* renamed from: k, reason: collision with root package name */
    public final long f2526k;

    /* renamed from: l, reason: collision with root package name */
    public final long f2527l;

    /* renamed from: m, reason: collision with root package name */
    public final m1.e f2528m;

    public u(H.e eVar, r rVar, String str, int i, j jVar, k kVar, v vVar, u uVar, u uVar2, u uVar3, long j2, long j3, m1.e eVar2) {
        X0.e.e(eVar, "request");
        X0.e.e(rVar, "protocol");
        X0.e.e(str, "message");
        this.f2519a = eVar;
        this.f2520b = rVar;
        this.f2521c = str;
        this.d = i;
        this.f2522e = jVar;
        this.f2523f = kVar;
        this.f2524g = vVar;
        this.h = uVar;
        this.i = uVar2;
        this.f2525j = uVar3;
        this.f2526k = j2;
        this.f2527l = j3;
        this.f2528m = eVar2;
    }

    public static String e(u uVar, String str) {
        uVar.getClass();
        String a2 = uVar.f2523f.a(str);
        if (a2 == null) {
            return null;
        }
        return a2;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        v vVar = this.f2524g;
        if (vVar == null) {
            throw new IllegalStateException("response is not eligible for a body and must not be closed");
        }
        vVar.close();
    }

    public final t f() {
        t tVar = new t();
        tVar.f2509a = this.f2519a;
        tVar.f2510b = this.f2520b;
        tVar.f2511c = this.d;
        tVar.d = this.f2521c;
        tVar.f2512e = this.f2522e;
        tVar.f2513f = this.f2523f.c();
        tVar.f2514g = this.f2524g;
        tVar.h = this.h;
        tVar.i = this.i;
        tVar.f2515j = this.f2525j;
        tVar.f2516k = this.f2526k;
        tVar.f2517l = this.f2527l;
        tVar.f2518m = this.f2528m;
        return tVar;
    }

    public final String toString() {
        return "Response{protocol=" + this.f2520b + ", code=" + this.d + ", message=" + this.f2521c + ", url=" + ((m) this.f2519a.f213c) + '}';
    }
}
