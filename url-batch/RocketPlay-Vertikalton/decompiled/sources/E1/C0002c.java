package E1;

/* renamed from: E1.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0002c {
    public static final K1.i d;

    /* renamed from: e, reason: collision with root package name */
    public static final K1.i f291e;

    /* renamed from: f, reason: collision with root package name */
    public static final K1.i f292f;

    /* renamed from: g, reason: collision with root package name */
    public static final K1.i f293g;
    public static final K1.i h;
    public static final K1.i i;

    /* renamed from: a, reason: collision with root package name */
    public final K1.i f294a;

    /* renamed from: b, reason: collision with root package name */
    public final K1.i f295b;

    /* renamed from: c, reason: collision with root package name */
    public final int f296c;

    static {
        K1.i iVar = K1.i.d;
        d = M0.e.h(":");
        f291e = M0.e.h(":status");
        f292f = M0.e.h(":method");
        f293g = M0.e.h(":path");
        h = M0.e.h(":scheme");
        i = M0.e.h(":authority");
    }

    public C0002c(K1.i iVar, K1.i iVar2) {
        i1.f.e(iVar, "name");
        i1.f.e(iVar2, "value");
        this.f294a = iVar;
        this.f295b = iVar2;
        this.f296c = iVar2.a() + iVar.a() + 32;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0002c)) {
            return false;
        }
        C0002c c0002c = (C0002c) obj;
        return i1.f.a(this.f294a, c0002c.f294a) && i1.f.a(this.f295b, c0002c.f295b);
    }

    public final int hashCode() {
        return this.f295b.hashCode() + (this.f294a.hashCode() * 31);
    }

    public final String toString() {
        return this.f294a.h() + ": " + this.f295b.h();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C0002c(String str, String str2) {
        this(M0.e.h(str), M0.e.h(str2));
        i1.f.e(str, "name");
        i1.f.e(str2, "value");
        K1.i iVar = K1.i.d;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C0002c(K1.i iVar, String str) {
        this(iVar, M0.e.h(str));
        i1.f.e(iVar, "name");
        i1.f.e(str, "value");
        K1.i iVar2 = K1.i.d;
    }
}
