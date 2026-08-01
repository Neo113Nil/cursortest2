package U;

import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public final class r {

    /* renamed from: a, reason: collision with root package name */
    public int f836a = 1;

    /* renamed from: b, reason: collision with root package name */
    public final u f837b;

    /* renamed from: c, reason: collision with root package name */
    public u f838c;
    public u d;

    /* renamed from: e, reason: collision with root package name */
    public int f839e;

    /* renamed from: f, reason: collision with root package name */
    public int f840f;

    public r(u uVar) {
        this.f837b = uVar;
        this.f838c = uVar;
    }

    public final void a() {
        this.f836a = 1;
        this.f838c = this.f837b;
        this.f840f = 0;
    }

    public final boolean b() {
        V.a c2 = this.f838c.f848b.c();
        int a2 = c2.a(6);
        return !(a2 == 0 || ((ByteBuffer) c2.d).get(a2 + c2.f362a) == 0) || this.f839e == 65039;
    }
}
