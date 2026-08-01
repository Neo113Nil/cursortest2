package p1;

/* renamed from: p1.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0286b {
    public static final v1.i d;

    /* renamed from: e, reason: collision with root package name */
    public static final v1.i f3383e;

    /* renamed from: f, reason: collision with root package name */
    public static final v1.i f3384f;

    /* renamed from: g, reason: collision with root package name */
    public static final v1.i f3385g;
    public static final v1.i h;
    public static final v1.i i;

    /* renamed from: a, reason: collision with root package name */
    public final v1.i f3386a;

    /* renamed from: b, reason: collision with root package name */
    public final v1.i f3387b;

    /* renamed from: c, reason: collision with root package name */
    public final int f3388c;

    static {
        v1.i iVar = v1.i.d;
        d = H0.e.h(":");
        f3383e = H0.e.h(":status");
        f3384f = H0.e.h(":method");
        f3385g = H0.e.h(":path");
        h = H0.e.h(":scheme");
        i = H0.e.h(":authority");
    }

    public C0286b(v1.i iVar, v1.i iVar2) {
        X0.e.e(iVar, "name");
        X0.e.e(iVar2, "value");
        this.f3386a = iVar;
        this.f3387b = iVar2;
        this.f3388c = iVar2.a() + iVar.a() + 32;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0286b)) {
            return false;
        }
        C0286b c0286b = (C0286b) obj;
        return X0.e.a(this.f3386a, c0286b.f3386a) && X0.e.a(this.f3387b, c0286b.f3387b);
    }

    public final int hashCode() {
        return this.f3387b.hashCode() + (this.f3386a.hashCode() * 31);
    }

    public final String toString() {
        return this.f3386a.h() + ": " + this.f3387b.h();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C0286b(String str, String str2) {
        this(H0.e.h(str), H0.e.h(str2));
        X0.e.e(str, "name");
        X0.e.e(str2, "value");
        v1.i iVar = v1.i.d;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C0286b(v1.i iVar, String str) {
        this(iVar, H0.e.h(str));
        X0.e.e(iVar, "name");
        X0.e.e(str, "value");
        v1.i iVar2 = v1.i.d;
    }
}
