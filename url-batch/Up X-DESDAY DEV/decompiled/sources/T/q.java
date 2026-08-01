package T;

import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public final class q {

    /* renamed from: a, reason: collision with root package name */
    public int f733a = 1;

    /* renamed from: b, reason: collision with root package name */
    public final t f734b;

    /* renamed from: c, reason: collision with root package name */
    public t f735c;
    public t d;

    /* renamed from: e, reason: collision with root package name */
    public int f736e;

    /* renamed from: f, reason: collision with root package name */
    public int f737f;

    public q(t tVar) {
        this.f734b = tVar;
        this.f735c = tVar;
    }

    public final void a() {
        this.f733a = 1;
        this.f735c = this.f734b;
        this.f737f = 0;
    }

    public final boolean b() {
        U.a c2 = this.f735c.f745b.c();
        int a2 = c2.a(6);
        return !(a2 == 0 || ((ByteBuffer) c2.d).get(a2 + c2.f371a) == 0) || this.f736e == 65039;
    }
}
