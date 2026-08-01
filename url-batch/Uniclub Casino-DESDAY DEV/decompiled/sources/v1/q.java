package v1;

/* loaded from: classes.dex */
public final class q {

    /* renamed from: a, reason: collision with root package name */
    public final byte[] f4072a;

    /* renamed from: b, reason: collision with root package name */
    public int f4073b;

    /* renamed from: c, reason: collision with root package name */
    public int f4074c;
    public boolean d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f4075e;

    /* renamed from: f, reason: collision with root package name */
    public q f4076f;

    /* renamed from: g, reason: collision with root package name */
    public q f4077g;

    public q() {
        this.f4072a = new byte[8192];
        this.f4075e = true;
        this.d = false;
    }

    public final q a() {
        q qVar = this.f4076f;
        if (qVar == this) {
            qVar = null;
        }
        q qVar2 = this.f4077g;
        X0.d.b(qVar2);
        qVar2.f4076f = this.f4076f;
        q qVar3 = this.f4076f;
        X0.d.b(qVar3);
        qVar3.f4077g = this.f4077g;
        this.f4076f = null;
        this.f4077g = null;
        return qVar;
    }

    public final void b(q qVar) {
        X0.d.e(qVar, "segment");
        qVar.f4077g = this;
        qVar.f4076f = this.f4076f;
        q qVar2 = this.f4076f;
        X0.d.b(qVar2);
        qVar2.f4077g = qVar;
        this.f4076f = qVar;
    }

    public final q c() {
        this.d = true;
        return new q(this.f4072a, this.f4073b, this.f4074c, true);
    }

    public final void d(q qVar, int i) {
        X0.d.e(qVar, "sink");
        if (!qVar.f4075e) {
            throw new IllegalStateException("only owner can write");
        }
        int i2 = qVar.f4074c;
        int i3 = i2 + i;
        byte[] bArr = qVar.f4072a;
        if (i3 > 8192) {
            if (qVar.d) {
                throw new IllegalArgumentException();
            }
            int i4 = qVar.f4073b;
            if (i3 - i4 > 8192) {
                throw new IllegalArgumentException();
            }
            Q0.g.b0(0, i4, i2, bArr, bArr);
            qVar.f4074c -= qVar.f4073b;
            qVar.f4073b = 0;
        }
        int i5 = qVar.f4074c;
        int i6 = this.f4073b;
        Q0.g.b0(i5, i6, i6 + i, this.f4072a, bArr);
        qVar.f4074c += i;
        this.f4073b += i;
    }

    public q(byte[] bArr, int i, int i2, boolean z2) {
        X0.d.e(bArr, "data");
        this.f4072a = bArr;
        this.f4073b = i;
        this.f4074c = i2;
        this.d = z2;
        this.f4075e = false;
    }
}
