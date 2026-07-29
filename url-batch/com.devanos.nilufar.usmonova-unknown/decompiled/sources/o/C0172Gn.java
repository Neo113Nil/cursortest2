package o;

/* renamed from: o.Gn, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0172Gn {
    public final M2 a;
    public final J2 b;
    public final QD c;
    public final QD d;
    public final QD e;
    public final QD f;

    public C0172Gn(M2 m2, J2 j2) {
        this.a = m2;
        this.b = j2;
        int i = WP.a;
        this.c = new QD();
        this.d = new QD();
        this.e = new QD();
        this.f = new QD();
    }

    public final boolean a() {
        return this.c.h() || this.e.h() || this.d.h();
    }

    public final void b(QD qd, Object obj) {
        if (qd.a(obj) && this.c.d + this.d.d + this.e.d == 1) {
            this.a.invoke(new J2(0, this, C0172Gn.class, "invalidateNodes", "invalidateNodes()V", 0, 3));
        }
    }
}
