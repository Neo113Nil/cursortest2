package K1;

/* loaded from: classes.dex */
public final class q {

    /* renamed from: a, reason: collision with root package name */
    public final byte[] f767a;

    /* renamed from: b, reason: collision with root package name */
    public int f768b;

    /* renamed from: c, reason: collision with root package name */
    public int f769c;
    public boolean d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f770e;

    /* renamed from: f, reason: collision with root package name */
    public q f771f;

    /* renamed from: g, reason: collision with root package name */
    public q f772g;

    public q() {
        this.f767a = new byte[8192];
        this.f770e = true;
        this.d = false;
    }

    public final q a() {
        q qVar = this.f771f;
        if (qVar == this) {
            qVar = null;
        }
        q qVar2 = this.f772g;
        i1.f.b(qVar2);
        qVar2.f771f = this.f771f;
        q qVar3 = this.f771f;
        i1.f.b(qVar3);
        qVar3.f772g = this.f772g;
        this.f771f = null;
        this.f772g = null;
        return qVar;
    }

    public final void b(q qVar) {
        i1.f.e(qVar, "segment");
        qVar.f772g = this;
        qVar.f771f = this.f771f;
        q qVar2 = this.f771f;
        i1.f.b(qVar2);
        qVar2.f772g = qVar;
        this.f771f = qVar;
    }

    public final q c() {
        this.d = true;
        return new q(this.f767a, this.f768b, this.f769c, true);
    }

    public final void d(q qVar, int i) {
        i1.f.e(qVar, "sink");
        if (!qVar.f770e) {
            throw new IllegalStateException("only owner can write");
        }
        int i2 = qVar.f769c;
        int i3 = i2 + i;
        byte[] bArr = qVar.f767a;
        if (i3 > 8192) {
            if (qVar.d) {
                throw new IllegalArgumentException();
            }
            int i4 = qVar.f768b;
            if (i3 - i4 > 8192) {
                throw new IllegalArgumentException();
            }
            W0.i.s0(0, i4, i2, bArr, bArr);
            qVar.f769c -= qVar.f768b;
            qVar.f768b = 0;
        }
        int i5 = qVar.f769c;
        int i6 = this.f768b;
        W0.i.s0(i5, i6, i6 + i, this.f767a, bArr);
        qVar.f769c += i;
        this.f768b += i;
    }

    public q(byte[] bArr, int i, int i2, boolean z2) {
        i1.f.e(bArr, "data");
        this.f767a = bArr;
        this.f768b = i;
        this.f769c = i2;
        this.d = z2;
        this.f770e = false;
    }
}
