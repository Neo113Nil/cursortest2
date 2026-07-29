package o;

/* renamed from: o.f9, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1019f9 extends C1151h9 {
    public final int l;
    public final int m;

    public C1019f9(byte[] bArr, int i, int i2) {
        super(bArr);
        C1151h9.k(i, i + i2, bArr.length);
        this.l = i;
        this.m = i2;
    }

    @Override // o.C1151h9
    public final byte j(int i) {
        int i2 = this.m;
        if (((i2 - (i + 1)) | i) >= 0) {
            return this.i[this.l + i];
        }
        if (i < 0) {
            throw new ArrayIndexOutOfBoundsException(AbstractC2188wx.g(i, "Index < 0: "));
        }
        throw new ArrayIndexOutOfBoundsException(AbstractC1888sN.g(i, i2, "Index > length: ", ", "));
    }

    @Override // o.C1151h9
    public final void m(byte[] bArr, int i) {
        System.arraycopy(this.i, this.l, bArr, 0, i);
    }

    @Override // o.C1151h9
    public final int n() {
        return this.l;
    }

    @Override // o.C1151h9
    public final byte o(int i) {
        return this.i[this.l + i];
    }

    @Override // o.C1151h9
    public final int size() {
        return this.m;
    }
}
