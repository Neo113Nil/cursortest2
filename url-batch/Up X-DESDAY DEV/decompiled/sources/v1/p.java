package v1;

/* loaded from: classes.dex */
public final class p {

    /* renamed from: a, reason: collision with root package name */
    public final byte[] f4073a;

    /* renamed from: b, reason: collision with root package name */
    public int f4074b;

    /* renamed from: c, reason: collision with root package name */
    public int f4075c;
    public boolean d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f4076e;

    /* renamed from: f, reason: collision with root package name */
    public p f4077f;

    /* renamed from: g, reason: collision with root package name */
    public p f4078g;

    public p() {
        this.f4073a = new byte[8192];
        this.f4076e = true;
        this.d = false;
    }

    public final p a() {
        p pVar = this.f4077f;
        if (pVar == this) {
            pVar = null;
        }
        p pVar2 = this.f4078g;
        X0.e.b(pVar2);
        pVar2.f4077f = this.f4077f;
        p pVar3 = this.f4077f;
        X0.e.b(pVar3);
        pVar3.f4078g = this.f4078g;
        this.f4077f = null;
        this.f4078g = null;
        return pVar;
    }

    public final void b(p pVar) {
        X0.e.e(pVar, "segment");
        pVar.f4078g = this;
        pVar.f4077f = this.f4077f;
        p pVar2 = this.f4077f;
        X0.e.b(pVar2);
        pVar2.f4078g = pVar;
        this.f4077f = pVar;
    }

    public final p c() {
        this.d = true;
        return new p(this.f4073a, this.f4074b, this.f4075c, true);
    }

    public final void d(p pVar, int i) {
        X0.e.e(pVar, "sink");
        if (!pVar.f4076e) {
            throw new IllegalStateException("only owner can write");
        }
        int i2 = pVar.f4075c;
        int i3 = i2 + i;
        byte[] bArr = pVar.f4073a;
        if (i3 > 8192) {
            if (pVar.d) {
                throw new IllegalArgumentException();
            }
            int i4 = pVar.f4074b;
            if (i3 - i4 > 8192) {
                throw new IllegalArgumentException();
            }
            Q0.c.d0(0, i4, i2, bArr, bArr);
            pVar.f4075c -= pVar.f4074b;
            pVar.f4074b = 0;
        }
        int i5 = pVar.f4075c;
        int i6 = this.f4074b;
        Q0.c.d0(i5, i6, i6 + i, this.f4073a, bArr);
        pVar.f4075c += i;
        this.f4074b += i;
    }

    public p(byte[] bArr, int i, int i2, boolean z2) {
        X0.e.e(bArr, "data");
        this.f4073a = bArr;
        this.f4074b = i;
        this.f4075c = i2;
        this.d = z2;
        this.f4076e = false;
    }
}
