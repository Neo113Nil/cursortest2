package o;

/* renamed from: o.sQ, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1891sQ extends C1347k9 {
    public final transient byte[][] l;
    public final transient int[] m;

    public C1891sQ(byte[][] bArr, int[] iArr) {
        super(C1347k9.k.h);
        this.l = bArr;
        this.m = iArr;
    }

    @Override // o.C1347k9
    public final int b() {
        return this.m[this.l.length - 1];
    }

    @Override // o.C1347k9
    public final String c() {
        return r().c();
    }

    @Override // o.C1347k9
    public final int d(byte[] bArr, int i) {
        AbstractC0048Bt.n(bArr, "other");
        return r().d(bArr, i);
    }

    @Override // o.C1347k9
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C1347k9) {
            C1347k9 c1347k9 = (C1347k9) obj;
            if (c1347k9.b() == b() && k(0, c1347k9, b())) {
                return true;
            }
        }
        return false;
    }

    @Override // o.C1347k9
    public final byte[] f() {
        return q();
    }

    @Override // o.C1347k9
    public final byte g(int i) {
        byte[][] bArr = this.l;
        int length = bArr.length - 1;
        int[] iArr = this.m;
        EB.f(iArr[length], i, 1L);
        int a0 = AbstractC0048Bt.a0(this, i);
        return bArr[a0][(i - (a0 == 0 ? 0 : iArr[a0 - 1])) + iArr[bArr.length + a0]];
    }

    @Override // o.C1347k9
    public final int h(byte[] bArr) {
        AbstractC0048Bt.n(bArr, "other");
        return r().h(bArr);
    }

    @Override // o.C1347k9
    public final int hashCode() {
        int i = this.i;
        if (i != 0) {
            return i;
        }
        byte[][] bArr = this.l;
        int length = bArr.length;
        int i2 = 0;
        int i3 = 1;
        int i4 = 0;
        while (i2 < length) {
            int[] iArr = this.m;
            int i5 = iArr[length + i2];
            int i6 = iArr[i2];
            byte[] bArr2 = bArr[i2];
            int i7 = (i6 - i4) + i5;
            while (i5 < i7) {
                i3 = (i3 * 31) + bArr2[i5];
                i5++;
            }
            i2++;
            i4 = i6;
        }
        this.i = i3;
        return i3;
    }

    @Override // o.C1347k9
    public final boolean j(int i, int i2, int i3, byte[] bArr) {
        AbstractC0048Bt.n(bArr, "other");
        if (i < 0 || i > b() - i3 || i2 < 0 || i2 > bArr.length - i3) {
            return false;
        }
        int i4 = i3 + i;
        int a0 = AbstractC0048Bt.a0(this, i);
        while (i < i4) {
            int[] iArr = this.m;
            int i5 = a0 == 0 ? 0 : iArr[a0 - 1];
            int i6 = iArr[a0] - i5;
            byte[][] bArr2 = this.l;
            int i7 = iArr[bArr2.length + a0];
            int min = Math.min(i4, i6 + i5) - i;
            if (!EB.e((i - i5) + i7, i2, min, bArr2[a0], bArr)) {
                return false;
            }
            i2 += min;
            i += min;
            a0++;
        }
        return true;
    }

    @Override // o.C1347k9
    public final boolean k(int i, C1347k9 c1347k9, int i2) {
        AbstractC0048Bt.n(c1347k9, "other");
        if (i >= 0 && i <= b() - i2) {
            int i3 = i2 + i;
            int a0 = AbstractC0048Bt.a0(this, i);
            int i4 = 0;
            while (i < i3) {
                int[] iArr = this.m;
                int i5 = a0 == 0 ? 0 : iArr[a0 - 1];
                int i6 = iArr[a0] - i5;
                byte[][] bArr = this.l;
                int i7 = iArr[bArr.length + a0];
                int min = Math.min(i3, i6 + i5) - i;
                if (c1347k9.j(i4, (i - i5) + i7, min, bArr[a0])) {
                    i4 += min;
                    i += min;
                    a0++;
                }
            }
            return true;
        }
        return false;
    }

    @Override // o.C1347k9
    public final C1347k9 l(int i, int i2) {
        if (i2 == -1234567890) {
            i2 = b();
        }
        if (i < 0) {
            throw new IllegalArgumentException(AbstractC1888sN.h(i, "beginIndex=", " < 0").toString());
        }
        if (i2 > b()) {
            StringBuilder i3 = AbstractC2188wx.i(i2, "endIndex=", " > length(");
            i3.append(b());
            i3.append(')');
            throw new IllegalArgumentException(i3.toString().toString());
        }
        int i4 = i2 - i;
        if (i4 < 0) {
            throw new IllegalArgumentException(AbstractC1888sN.g(i2, i, "endIndex=", " < beginIndex=").toString());
        }
        if (i == 0 && i2 == b()) {
            return this;
        }
        if (i == i2) {
            return C1347k9.k;
        }
        int a0 = AbstractC0048Bt.a0(this, i);
        int a02 = AbstractC0048Bt.a0(this, i2 - 1);
        byte[][] bArr = this.l;
        byte[][] bArr2 = (byte[][]) P6.f0(bArr, a0, a02 + 1);
        int[] iArr = new int[bArr2.length * 2];
        int[] iArr2 = this.m;
        if (a0 <= a02) {
            int i5 = a0;
            int i6 = 0;
            while (true) {
                iArr[i6] = Math.min(iArr2[i5] - i, i4);
                int i7 = i6 + 1;
                iArr[i6 + bArr2.length] = iArr2[bArr.length + i5];
                if (i5 == a02) {
                    break;
                }
                i5++;
                i6 = i7;
            }
        }
        int i8 = a0 != 0 ? iArr2[a0 - 1] : 0;
        int length = bArr2.length;
        iArr[length] = (i - i8) + iArr[length];
        return new C1891sQ(bArr2, iArr);
    }

    @Override // o.C1347k9
    public final C1347k9 n() {
        return r().n();
    }

    @Override // o.C1347k9
    public final void p(G8 g8, int i) {
        int a0 = AbstractC0048Bt.a0(this, 0);
        int i2 = 0;
        while (i2 < i) {
            int[] iArr = this.m;
            int i3 = a0 == 0 ? 0 : iArr[a0 - 1];
            int i4 = iArr[a0] - i3;
            byte[][] bArr = this.l;
            int i5 = iArr[bArr.length + a0];
            int min = Math.min(i, i4 + i3) - i2;
            int i6 = (i2 - i3) + i5;
            C1694pQ c1694pQ = new C1694pQ(bArr[a0], i6, i6 + min, true);
            C1694pQ c1694pQ2 = g8.h;
            if (c1694pQ2 == null) {
                c1694pQ.g = c1694pQ;
                c1694pQ.f = c1694pQ;
                g8.h = c1694pQ;
            } else {
                C1694pQ c1694pQ3 = c1694pQ2.g;
                AbstractC0048Bt.k(c1694pQ3);
                c1694pQ3.b(c1694pQ);
            }
            i2 += min;
            a0++;
        }
        g8.i += i;
    }

    public final byte[] q() {
        byte[] bArr = new byte[b()];
        byte[][] bArr2 = this.l;
        int length = bArr2.length;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        while (i < length) {
            int[] iArr = this.m;
            int i4 = iArr[length + i];
            int i5 = iArr[i];
            int i6 = i5 - i2;
            P6.Z(i3, i4, i4 + i6, bArr2[i], bArr);
            i3 += i6;
            i++;
            i2 = i5;
        }
        return bArr;
    }

    public final C1347k9 r() {
        return new C1347k9(q());
    }

    @Override // o.C1347k9
    public final String toString() {
        return r().toString();
    }
}
