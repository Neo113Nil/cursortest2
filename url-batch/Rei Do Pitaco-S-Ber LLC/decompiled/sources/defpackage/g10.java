package defpackage;

/* compiled from: r8-map-id-f3f55b5b0d2db012739781e1ba4f8511a2ab0ca5e8856dea8785f50c2c15a0e8 */
/* loaded from: classes.dex */
public final class g10 extends r8 {
    public final transient byte[][] j;
    public final transient int[] k;

    public g10(byte[][] bArr, int[] iArr) {
        super(r8.i.f);
        this.j = bArr;
        this.k = iArr;
    }

    @Override // defpackage.r8
    public final int a() {
        return this.k[this.j.length - 1];
    }

    @Override // defpackage.r8
    public final String b() {
        return new r8(j()).b();
    }

    @Override // defpackage.r8
    public final byte[] c() {
        return j();
    }

    @Override // defpackage.r8
    public final byte d(int i) {
        byte[][] bArr = this.j;
        int length = bArr.length - 1;
        int[] iArr = this.k;
        vv.f(iArr[length], i, 1L);
        int M = oo.M(this, i);
        return bArr[M][(i - (M == 0 ? 0 : iArr[M - 1])) + iArr[bArr.length + M]];
    }

    @Override // defpackage.r8
    public final boolean e(int i, byte[] bArr, int i2, int i3) {
        bArr.getClass();
        if (i >= 0 && i <= a() - i3 && i2 >= 0 && i2 <= bArr.length - i3) {
            int i4 = i3 + i;
            int M = oo.M(this, i);
            while (i < i4) {
                int[] iArr = this.k;
                int i5 = M == 0 ? 0 : iArr[M - 1];
                int i6 = iArr[M] - i5;
                byte[][] bArr2 = this.j;
                int i7 = iArr[bArr2.length + M];
                int min = Math.min(i4, i6 + i5) - i;
                int i8 = (i - i5) + i7;
                byte[] bArr3 = bArr2[M];
                bArr3.getClass();
                for (int i9 = 0; i9 < min; i9++) {
                    if (bArr3[i9 + i8] == bArr[i9 + i2]) {
                    }
                }
                i2 += min;
                i += min;
                M++;
            }
            return true;
        }
        return false;
    }

    @Override // defpackage.r8
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof r8)) {
            return false;
        }
        r8 r8Var = (r8) obj;
        return r8Var.a() == a() && f(r8Var, a());
    }

    @Override // defpackage.r8
    public final boolean f(r8 r8Var, int i) {
        r8Var.getClass();
        if (a() - i >= 0) {
            int M = oo.M(this, 0);
            int i2 = 0;
            int i3 = 0;
            while (i2 < i) {
                int[] iArr = this.k;
                int i4 = M == 0 ? 0 : iArr[M - 1];
                int i5 = iArr[M] - i4;
                byte[][] bArr = this.j;
                int i6 = iArr[bArr.length + M];
                int min = Math.min(i, i5 + i4) - i2;
                if (r8Var.e(i3, bArr[M], (i2 - i4) + i6, min)) {
                    i3 += min;
                    i2 += min;
                    M++;
                }
            }
            return true;
        }
        return false;
    }

    @Override // defpackage.r8
    public final r8 g() {
        return new r8(j()).g();
    }

    @Override // defpackage.r8
    public final int hashCode() {
        int i = this.g;
        if (i != 0) {
            return i;
        }
        byte[][] bArr = this.j;
        int length = bArr.length;
        int i2 = 0;
        int i3 = 1;
        int i4 = 0;
        while (i2 < length) {
            int[] iArr = this.k;
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
        this.g = i3;
        return i3;
    }

    @Override // defpackage.r8
    public final void i(m8 m8Var, int i) {
        int M = oo.M(this, 0);
        int i2 = 0;
        while (i2 < i) {
            int[] iArr = this.k;
            int i3 = M == 0 ? 0 : iArr[M - 1];
            int i4 = iArr[M] - i3;
            byte[][] bArr = this.j;
            int i5 = iArr[bArr.length + M];
            int min = Math.min(i, i4 + i3) - i2;
            int i6 = (i2 - i3) + i5;
            e10 e10Var = new e10(bArr[M], i6, i6 + min, true);
            e10 e10Var2 = m8Var.f;
            if (e10Var2 == null) {
                e10Var.g = e10Var;
                e10Var.f = e10Var;
                m8Var.f = e10Var;
            } else {
                e10 e10Var3 = e10Var2.g;
                e10Var3.getClass();
                e10Var3.b(e10Var);
            }
            i2 += min;
            M++;
        }
        m8Var.g += i;
    }

    public final byte[] j() {
        byte[] bArr = new byte[a()];
        byte[][] bArr2 = this.j;
        int length = bArr2.length;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        while (i < length) {
            int[] iArr = this.k;
            int i4 = iArr[length + i];
            int i5 = iArr[i];
            int i6 = i5 - i2;
            o6.n0(bArr2[i], bArr, i3, i4, i4 + i6);
            i3 += i6;
            i++;
            i2 = i5;
        }
        return bArr;
    }

    @Override // defpackage.r8
    public final String toString() {
        return new r8(j()).toString();
    }
}
