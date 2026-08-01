package T;

import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public final class q {

    /* renamed from: a, reason: collision with root package name */
    public int f737a = 1;

    /* renamed from: b, reason: collision with root package name */
    public final t f738b;

    /* renamed from: c, reason: collision with root package name */
    public t f739c;
    public t d;

    /* renamed from: e, reason: collision with root package name */
    public int f740e;

    /* renamed from: f, reason: collision with root package name */
    public int f741f;

    public q(t tVar) {
        this.f738b = tVar;
        this.f739c = tVar;
    }

    public final void a() {
        this.f737a = 1;
        this.f739c = this.f738b;
        this.f741f = 0;
    }

    public final boolean b() {
        U.a c2 = this.f739c.f749b.c();
        int a2 = c2.a(6);
        return !(a2 == 0 || ((ByteBuffer) c2.d).get(a2 + c2.f350a) == 0) || this.f740e == 65039;
    }
}
