package x1;

import java.io.Closeable;

/* loaded from: classes.dex */
public final class s implements Closeable {

    /* renamed from: a, reason: collision with root package name */
    public final H.e f4600a;

    /* renamed from: b, reason: collision with root package name */
    public final q f4601b;

    /* renamed from: c, reason: collision with root package name */
    public final String f4602c;
    public final int d;

    /* renamed from: e, reason: collision with root package name */
    public final i f4603e;

    /* renamed from: f, reason: collision with root package name */
    public final j f4604f;

    /* renamed from: g, reason: collision with root package name */
    public final C1.h f4605g;
    public final s h;
    public final s i;

    /* renamed from: j, reason: collision with root package name */
    public final s f4606j;

    /* renamed from: k, reason: collision with root package name */
    public final long f4607k;

    /* renamed from: l, reason: collision with root package name */
    public final long f4608l;

    /* renamed from: m, reason: collision with root package name */
    public final B1.e f4609m;

    public s(H.e eVar, q qVar, String str, int i, i iVar, j jVar, C1.h hVar, s sVar, s sVar2, s sVar3, long j2, long j3, B1.e eVar2) {
        i1.f.e(eVar, "request");
        i1.f.e(qVar, "protocol");
        i1.f.e(str, "message");
        this.f4600a = eVar;
        this.f4601b = qVar;
        this.f4602c = str;
        this.d = i;
        this.f4603e = iVar;
        this.f4604f = jVar;
        this.f4605g = hVar;
        this.h = sVar;
        this.i = sVar2;
        this.f4606j = sVar3;
        this.f4607k = j2;
        this.f4608l = j3;
        this.f4609m = eVar2;
    }

    public static String a(String str, s sVar) {
        sVar.getClass();
        String a2 = sVar.f4604f.a(str);
        if (a2 == null) {
            return null;
        }
        return a2;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        C1.h hVar = this.f4605g;
        if (hVar == null) {
            throw new IllegalStateException("response is not eligible for a body and must not be closed");
        }
        hVar.close();
    }

    public final r f() {
        r rVar = new r();
        rVar.f4590a = this.f4600a;
        rVar.f4591b = this.f4601b;
        rVar.f4592c = this.d;
        rVar.d = this.f4602c;
        rVar.f4593e = this.f4603e;
        rVar.f4594f = this.f4604f.c();
        rVar.f4595g = this.f4605g;
        rVar.h = this.h;
        rVar.i = this.i;
        rVar.f4596j = this.f4606j;
        rVar.f4597k = this.f4607k;
        rVar.f4598l = this.f4608l;
        rVar.f4599m = this.f4609m;
        return rVar;
    }

    public final String toString() {
        return "Response{protocol=" + this.f4601b + ", code=" + this.d + ", message=" + this.f4602c + ", url=" + ((l) this.f4600a.f547c) + '}';
    }
}
