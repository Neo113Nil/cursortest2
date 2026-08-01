package v1;

/* loaded from: classes.dex */
public final class p {

    /* renamed from: a, reason: collision with root package name */
    public final byte[] f4089a;

    /* renamed from: b, reason: collision with root package name */
    public int f4090b;

    /* renamed from: c, reason: collision with root package name */
    public int f4091c;
    public boolean d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f4092e;

    /* renamed from: f, reason: collision with root package name */
    public p f4093f;

    /* renamed from: g, reason: collision with root package name */
    public p f4094g;

    public p() {
        this.f4089a = new byte[8192];
        this.f4092e = true;
        this.d = false;
    }

    public final p a() {
        p pVar = this.f4093f;
        if (pVar == this) {
            pVar = null;
        }
        p pVar2 = this.f4094g;
        X0.e.b(pVar2);
        pVar2.f4093f = this.f4093f;
        p pVar3 = this.f4093f;
        X0.e.b(pVar3);
        pVar3.f4094g = this.f4094g;
        this.f4093f = null;
        this.f4094g = null;
        return pVar;
    }

    public final void b(p pVar) {
        X0.e.e(pVar, "segment");
        pVar.f4094g = this;
        pVar.f4093f = this.f4093f;
        p pVar2 = this.f4093f;
        X0.e.b(pVar2);
        pVar2.f4094g = pVar;
        this.f4093f = pVar;
    }

    public final p c() {
        this.d = true;
        return new p(this.f4089a, this.f4090b, this.f4091c, true);
    }

    public final void d(p pVar, int i) {
        X0.e.e(pVar, "sink");
        if (!pVar.f4092e) {
            throw new IllegalStateException("only owner can write");
        }
        int i2 = pVar.f4091c;
        int i3 = i2 + i;
        byte[] bArr = pVar.f4089a;
        if (i3 > 8192) {
            if (pVar.d) {
                throw new IllegalArgumentException();
            }
            int i4 = pVar.f4090b;
            if (i3 - i4 > 8192) {
                throw new IllegalArgumentException();
            }
            Q0.c.d0(0, i4, i2, bArr, bArr);
            pVar.f4091c -= pVar.f4090b;
            pVar.f4090b = 0;
        }
        int i5 = pVar.f4091c;
        int i6 = this.f4090b;
        Q0.c.d0(i5, i6, i6 + i, this.f4089a, bArr);
        pVar.f4091c += i;
        this.f4090b += i;
    }

    public p(byte[] bArr, int i, int i2, boolean z2) {
        X0.e.e(bArr, "data");
        this.f4089a = bArr;
        this.f4090b = i;
        this.f4091c = i2;
        this.d = z2;
        this.f4092e = false;
    }
}
