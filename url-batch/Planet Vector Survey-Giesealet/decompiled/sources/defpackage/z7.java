package defpackage;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public final class z7 implements x7 {
    public final float d;
    public final float e;

    public z7(float f) {
        this.d = f;
        this.e = f;
    }

    @Override // defpackage.w7, defpackage.a8
    public final float b() {
        return this.e;
    }

    @Override // defpackage.w7
    public final void d(f40 f40Var, int i, int[] iArr, c10 c10Var, int[] iArr2) {
        int i2;
        int i3;
        if (iArr.length == 0) {
            return;
        }
        int c = y6.c(this.d, f40Var);
        if (c10Var == c10.e) {
            int length = iArr.length - 1;
            i2 = 0;
            i3 = 0;
            while (-1 < length) {
                int i4 = iArr[length];
                int min = Math.min(i2, i - i4);
                iArr2[length] = min;
                int min2 = Math.min(c, (i - min) - i4);
                int i5 = iArr2[length] + i4 + min2;
                length--;
                i3 = min2;
                i2 = i5;
            }
        } else {
            int length2 = iArr.length;
            i2 = 0;
            i3 = 0;
            int i6 = 0;
            int i7 = 0;
            while (i6 < length2) {
                int i8 = iArr[i6];
                int min3 = Math.min(i2, i - i8);
                iArr2[i7] = min3;
                int min4 = Math.min(c, (i - min3) - i8);
                int i9 = iArr2[i7] + i8 + min4;
                i6++;
                i3 = min4;
                i2 = i9;
                i7++;
            }
        }
        if (i2 - i3 < i) {
            int round = Math.round((1.0f + (c10Var == c10.d ? -1.0f : 1.0f)) * ((i - r1) / 2.0f));
            int length3 = iArr2.length;
            for (int i10 = 0; i10 < length3; i10++) {
                iArr2[i10] = iArr2[i10] + round;
            }
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof z7) && jn.a(this.d, ((z7) obj).d);
    }

    public final int hashCode() {
        return h6.g.hashCode() + (((Float.floatToIntBits(this.d) * 31) + 1231) * 31);
    }

    @Override // defpackage.a8
    public final void k(int i, f40 f40Var, int[] iArr, int[] iArr2) {
        d(f40Var, i, iArr, c10.d, iArr2);
    }

    public final String toString() {
        return "Arrangement#spacedAligned(" + ((Object) jn.b(this.d)) + ", " + h6.g + ')';
    }
}
