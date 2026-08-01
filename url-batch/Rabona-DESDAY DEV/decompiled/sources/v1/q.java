package v1;

/* loaded from: classes.dex */
public final class q {

    /* renamed from: a, reason: collision with root package name */
    public final byte[] f4096a;

    /* renamed from: b, reason: collision with root package name */
    public int f4097b;

    /* renamed from: c, reason: collision with root package name */
    public int f4098c;
    public boolean d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f4099e;

    /* renamed from: f, reason: collision with root package name */
    public q f4100f;

    /* renamed from: g, reason: collision with root package name */
    public q f4101g;

    public q() {
        this.f4096a = new byte[8192];
        this.f4099e = true;
        this.d = false;
    }

    public final q a() {
        q qVar = this.f4100f;
        if (qVar == this) {
            qVar = null;
        }
        q qVar2 = this.f4101g;
        X0.d.b(qVar2);
        qVar2.f4100f = this.f4100f;
        q qVar3 = this.f4100f;
        X0.d.b(qVar3);
        qVar3.f4101g = this.f4101g;
        this.f4100f = null;
        this.f4101g = null;
        return qVar;
    }

    public final void b(q qVar) {
        X0.d.e(qVar, "segment");
        qVar.f4101g = this;
        qVar.f4100f = this.f4100f;
        q qVar2 = this.f4100f;
        X0.d.b(qVar2);
        qVar2.f4101g = qVar;
        this.f4100f = qVar;
    }

    public final q c() {
        this.d = true;
        return new q(this.f4096a, this.f4097b, this.f4098c, true);
    }

    public final void d(q qVar, int i) {
        X0.d.e(qVar, "sink");
        if (!qVar.f4099e) {
            throw new IllegalStateException("only owner can write");
        }
        int i2 = qVar.f4098c;
        int i3 = i2 + i;
        byte[] bArr = qVar.f4096a;
        if (i3 > 8192) {
            if (qVar.d) {
                throw new IllegalArgumentException();
            }
            int i4 = qVar.f4097b;
            if (i3 - i4 > 8192) {
                throw new IllegalArgumentException();
            }
            Q0.g.d0(0, i4, i2, bArr, bArr);
            qVar.f4098c -= qVar.f4097b;
            qVar.f4097b = 0;
        }
        int i5 = qVar.f4098c;
        int i6 = this.f4097b;
        Q0.g.d0(i5, i6, i6 + i, this.f4096a, bArr);
        qVar.f4098c += i;
        this.f4097b += i;
    }

    public q(byte[] bArr, int i, int i2, boolean z2) {
        X0.d.e(bArr, "data");
        this.f4096a = bArr;
        this.f4097b = i;
        this.f4098c = i2;
        this.d = z2;
        this.f4099e = false;
    }
}
