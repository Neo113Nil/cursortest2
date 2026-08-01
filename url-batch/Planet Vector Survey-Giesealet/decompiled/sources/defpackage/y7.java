package defpackage;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.graphics.Typeface;
import android.os.Bundle;
import java.util.Arrays;
import java.util.UUID;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public class y7 implements x7, w7, a8, qj, js0, og0 {
    public final /* synthetic */ int d;

    public y7() {
        this.d = 3;
        new n40(16);
        long[] jArr = vn0.a;
        new a70();
    }

    public static final float e(float f, float[] fArr, float[] fArr2) {
        float f2;
        float f3;
        float f4;
        float f5;
        float abs = Math.abs(f);
        float signum = Math.signum(f);
        int binarySearch = Arrays.binarySearch(fArr, abs);
        if (binarySearch >= 0) {
            return signum * fArr2[binarySearch];
        }
        int i = -(binarySearch + 1);
        int i2 = i - 1;
        if (i2 >= fArr.length - 1) {
            float f6 = fArr[fArr.length - 1];
            float f7 = fArr2[fArr.length - 1];
            if (f6 == 0.0f) {
                return 0.0f;
            }
            return (f7 / f6) * f;
        }
        if (i2 == -1) {
            float f8 = fArr[0];
            f4 = fArr2[0];
            f5 = f8;
            f3 = 0.0f;
            f2 = 0.0f;
        } else {
            float f9 = fArr[i2];
            float f10 = fArr[i];
            f2 = fArr2[i2];
            f3 = f9;
            f4 = fArr2[i];
            f5 = f10;
        }
        return (((f4 - f2) * Math.max(0.0f, Math.min(1.0f, f3 == f5 ? 0.0f : (abs - f3) / (f5 - f3)))) + f2) * signum;
    }

    public static y70 g(Context context, m80 m80Var, Bundle bundle, f20 f20Var, e80 e80Var) {
        String uuid = UUID.randomUUID().toString();
        uuid.getClass();
        m80Var.getClass();
        f20Var.getClass();
        return new y70(context, m80Var, bundle, f20Var, e80Var, uuid, null);
    }

    public static Typeface h(String str, ut utVar, int i) {
        Typeface create;
        if (i == 0 && nz.l(utVar, ut.f) && (str == null || str.length() == 0)) {
            return Typeface.DEFAULT;
        }
        create = Typeface.create(str == null ? Typeface.DEFAULT : Typeface.create(str, 0), utVar.d, i == 1);
        return create;
    }

    @Override // defpackage.og0
    public Typeface a(ut utVar, int i) {
        return h(null, utVar, i);
    }

    @Override // defpackage.w7, defpackage.a8
    public float b() {
        switch (this.d) {
        }
        return 0.0f;
    }

    @Override // defpackage.og0
    public Typeface c(ev evVar, ut utVar, int i) {
        evVar.getClass();
        return h("sans-serif", utVar, i);
    }

    @Override // defpackage.w7
    public void d(f40 f40Var, int i, int[] iArr, c10 c10Var, int[] iArr2) {
        int i2 = this.d;
        c10 c10Var2 = c10.d;
        int i3 = 0;
        switch (i2) {
            case 0:
                if (c10Var == c10Var2) {
                    nz.P(i, iArr, iArr2, false);
                    break;
                } else {
                    nz.P(i, iArr, iArr2, true);
                    break;
                }
            default:
                if (c10Var == c10Var2) {
                    int length = iArr.length;
                    int i4 = 0;
                    int i5 = 0;
                    while (i3 < length) {
                        int i6 = iArr[i3];
                        iArr2[i4] = i5;
                        i5 += i6;
                        i3++;
                        i4++;
                    }
                    break;
                } else {
                    int length2 = iArr.length;
                    int i7 = 0;
                    while (i3 < length2) {
                        i7 += iArr[i3];
                        i3++;
                    }
                    int i8 = i - i7;
                    for (int length3 = iArr.length - 1; -1 < length3; length3--) {
                        int i9 = iArr[length3];
                        iArr2[length3] = i8;
                        i8 += i9;
                    }
                    break;
                }
        }
    }

    public long f(long j, long j2) {
        switch (this.d) {
            case 9:
                float max = Math.max(Float.intBitsToFloat((int) (j2 >> 32)) / Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (j2 & 4294967295L)) / Float.intBitsToFloat((int) (j & 4294967295L)));
                long floatToRawIntBits = (Float.floatToRawIntBits(max) << 32) | (Float.floatToRawIntBits(max) & 4294967295L);
                int i = un0.a;
                return floatToRawIntBits;
            case 10:
                float g = d31.g(j, j2);
                long floatToRawIntBits2 = (Float.floatToRawIntBits(g) << 32) | (Float.floatToRawIntBits(g) & 4294967295L);
                int i2 = un0.a;
                return floatToRawIntBits2;
            default:
                if (Float.intBitsToFloat((int) (j >> 32)) <= Float.intBitsToFloat((int) (j2 >> 32)) && Float.intBitsToFloat((int) (j & 4294967295L)) <= Float.intBitsToFloat((int) (j2 & 4294967295L))) {
                    long floatToRawIntBits3 = (Float.floatToRawIntBits(1.0f) << 32) | (Float.floatToRawIntBits(1.0f) & 4294967295L);
                    int i3 = un0.a;
                    return floatToRawIntBits3;
                }
                float g2 = d31.g(j, j2);
                long floatToRawIntBits4 = (Float.floatToRawIntBits(g2) << 32) | (Float.floatToRawIntBits(g2) & 4294967295L);
                int i4 = un0.a;
                return floatToRawIntBits4;
        }
    }

    public int i() {
        switch (this.d) {
            case 26:
                return 16;
            default:
                return 8;
        }
    }

    public Signature[] j(PackageManager packageManager, String str) {
        return packageManager.getPackageInfo(str, 64).signatures;
    }

    @Override // defpackage.a8
    public void k(int i, f40 f40Var, int[] iArr, int[] iArr2) {
        int i2 = 0;
        switch (this.d) {
            case 0:
                nz.P(i, iArr, iArr2, false);
                break;
            default:
                int length = iArr.length;
                int i3 = 0;
                int i4 = 0;
                while (i2 < length) {
                    int i5 = iArr[i2];
                    iArr2[i3] = i4;
                    i4 += i5;
                    i2++;
                    i3++;
                }
                break;
        }
    }

    public String toString() {
        switch (this.d) {
            case 0:
                return "Arrangement#SpaceBetween";
            case 1:
                return "Arrangement#Start";
            case 2:
                return "Arrangement#Top";
            case 3:
            case 4:
            case 5:
            default:
                return super.toString();
            case 6:
                return "Empty";
            case 7:
                return "CompositionErrorContext";
        }
    }

    public /* synthetic */ y7(int i) {
        this.d = i;
    }

    public y7(vh vhVar) {
        this.d = 8;
    }
}
