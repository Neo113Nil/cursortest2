package com.google.android.gms.internal.ads;

import java.math.RoundingMode;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzgah {
    public static int zza(int i, int i2) {
        long j = i + i2;
        int i3 = (int) j;
        if (j == i3) {
            return i3;
        }
        throw new ArithmeticException("overflow: checkedAdd(" + i + ", " + i2 + ")");
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x003e, code lost:
    
        if (((r6 & 1) & (r7 != java.math.RoundingMode.HALF_EVEN ? 0 : 1)) != 0) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0041, code lost:
    
        if (r0 > 0) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0044, code lost:
    
        if (r5 > 0) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0047, code lost:
    
        if (r5 < 0) goto L25;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int zzb(int i, int i2, RoundingMode roundingMode) {
        roundingMode.getClass();
        int i3 = i / 8;
        int i4 = i - (i3 * 8);
        if (i4 != 0) {
            int i5 = ((i ^ 8) >> 31) | 1;
            switch (zzgag.zza[roundingMode.ordinal()]) {
                case 1:
                    zzgak.zzb(false);
                case 2:
                    return i3;
                case 3:
                    break;
                case 4:
                    return i3 + i5;
                case 5:
                    break;
                case 6:
                case 7:
                case 8:
                    int abs = Math.abs(i4);
                    int abs2 = abs - (Math.abs(8) - abs);
                    if (abs2 == 0) {
                        if (roundingMode != RoundingMode.HALF_UP) {
                            break;
                        }
                        return i3 + i5;
                    }
                    break;
                default:
                    throw new AssertionError();
            }
        }
        return i3;
    }
}
