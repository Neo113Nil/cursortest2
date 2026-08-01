package U;

import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public final class r {

    /* renamed from: a, reason: collision with root package name */
    public int f1194a = 1;

    /* renamed from: b, reason: collision with root package name */
    public final u f1195b;

    /* renamed from: c, reason: collision with root package name */
    public u f1196c;
    public u d;

    /* renamed from: e, reason: collision with root package name */
    public int f1197e;

    /* renamed from: f, reason: collision with root package name */
    public int f1198f;

    public r(u uVar) {
        this.f1195b = uVar;
        this.f1196c = uVar;
    }

    public final void a() {
        this.f1194a = 1;
        this.f1196c = this.f1195b;
        this.f1198f = 0;
    }

    public final boolean b() {
        V.a c2 = this.f1196c.f1206b.c();
        int a2 = c2.a(6);
        return !(a2 == 0 || ((ByteBuffer) c2.d).get(a2 + c2.f623a) == 0) || this.f1197e == 65039;
    }
}
