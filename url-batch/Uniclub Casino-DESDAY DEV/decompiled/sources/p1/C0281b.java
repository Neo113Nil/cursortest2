package p1;

/* renamed from: p1.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0281b {
    public static final v1.i d;

    /* renamed from: e, reason: collision with root package name */
    public static final v1.i f3404e;

    /* renamed from: f, reason: collision with root package name */
    public static final v1.i f3405f;

    /* renamed from: g, reason: collision with root package name */
    public static final v1.i f3406g;
    public static final v1.i h;
    public static final v1.i i;

    /* renamed from: a, reason: collision with root package name */
    public final v1.i f3407a;

    /* renamed from: b, reason: collision with root package name */
    public final v1.i f3408b;

    /* renamed from: c, reason: collision with root package name */
    public final int f3409c;

    static {
        v1.i iVar = v1.i.d;
        d = J0.e.h(":");
        f3404e = J0.e.h(":status");
        f3405f = J0.e.h(":method");
        f3406g = J0.e.h(":path");
        h = J0.e.h(":scheme");
        i = J0.e.h(":authority");
    }

    public C0281b(v1.i iVar, v1.i iVar2) {
        X0.d.e(iVar, "name");
        X0.d.e(iVar2, "value");
        this.f3407a = iVar;
        this.f3408b = iVar2;
        this.f3409c = iVar2.a() + iVar.a() + 32;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0281b)) {
            return false;
        }
        C0281b c0281b = (C0281b) obj;
        return X0.d.a(this.f3407a, c0281b.f3407a) && X0.d.a(this.f3408b, c0281b.f3408b);
    }

    public final int hashCode() {
        return this.f3408b.hashCode() + (this.f3407a.hashCode() * 31);
    }

    public final String toString() {
        return this.f3407a.h() + ": " + this.f3408b.h();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C0281b(String str, String str2) {
        this(J0.e.h(str), J0.e.h(str2));
        X0.d.e(str, "name");
        X0.d.e(str2, "value");
        v1.i iVar = v1.i.d;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C0281b(v1.i iVar, String str) {
        this(iVar, J0.e.h(str));
        X0.d.e(iVar, "name");
        X0.d.e(str, "value");
        v1.i iVar2 = v1.i.d;
    }
}
