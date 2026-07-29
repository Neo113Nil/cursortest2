package o;

import java.util.Arrays;

/* renamed from: o.mo, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1520mo implements InterfaceC1388ko {
    public final float[] a;
    public final float[] b;

    public C1520mo(float[] fArr, float[] fArr2) {
        if (fArr.length != fArr2.length || fArr.length == 0) {
            throw new IllegalArgumentException("Array lengths must match and be nonzero");
        }
        this.a = fArr;
        this.b = fArr2;
    }

    @Override // o.InterfaceC1388ko
    public final float a(float f) {
        float f2;
        float f3;
        float f4;
        float f5;
        float abs = Math.abs(f);
        float signum = Math.signum(f);
        float[] fArr = this.a;
        int binarySearch = Arrays.binarySearch(fArr, abs);
        float[] fArr2 = this.b;
        if (binarySearch >= 0) {
            f = fArr2[binarySearch];
        } else {
            int i = -(binarySearch + 1);
            int i2 = i - 1;
            if (i2 < fArr.length - 1) {
                if (i2 == -1) {
                    float f6 = fArr[0];
                    f4 = fArr2[0];
                    f5 = f6;
                    f3 = 0.0f;
                    f2 = 0.0f;
                } else {
                    float f7 = fArr[i2];
                    float f8 = fArr[i];
                    f2 = fArr2[i2];
                    f3 = f7;
                    f4 = fArr2[i];
                    f5 = f8;
                }
                return (((f4 - f2) * Math.max(0.0f, Math.min(1.0f, f3 == f5 ? 0.0f : (abs - f3) / (f5 - f3)))) + f2) * signum;
            }
            float f9 = fArr[fArr.length - 1];
            float f10 = fArr2[fArr.length - 1];
            if (f9 == 0.0f) {
                return 0.0f;
            }
            signum = f10 / f9;
        }
        return signum * f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof C1520mo)) {
            return false;
        }
        C1520mo c1520mo = (C1520mo) obj;
        return Arrays.equals(this.a, c1520mo.a) && Arrays.equals(this.b, c1520mo.b);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.b) + (Arrays.hashCode(this.a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FontScaleConverter{fromSpValues=");
        String arrays = Arrays.toString(this.a);
        AbstractC0048Bt.m(arrays, "toString(this)");
        sb.append(arrays);
        sb.append(", toDpValues=");
        String arrays2 = Arrays.toString(this.b);
        AbstractC0048Bt.m(arrays2, "toString(this)");
        sb.append(arrays2);
        sb.append('}');
        return sb.toString();
    }
}
