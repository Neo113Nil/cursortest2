package com.google.android.gms.internal.ads;

import java.util.Arrays;
import kotlin.UByte;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes2.dex */
public final class zzfyz {
    public static byte[] zza(byte[] bArr, byte[] bArr2) {
        long zzb = zzb(bArr, 0, 0);
        long zzb2 = zzb(bArr, 3, 2) & 67108611;
        long zzb3 = zzb(bArr, 6, 4) & 67092735;
        long zzb4 = zzb(bArr, 9, 6) & 66076671;
        long zzb5 = zzb(bArr, 12, 8) & 1048575;
        long j = zzb2 * 5;
        long j2 = zzb3 * 5;
        long j3 = zzb4 * 5;
        long j4 = zzb5 * 5;
        int i = 17;
        byte[] bArr3 = new byte[17];
        long j5 = 0;
        long j6 = 0;
        long j7 = 0;
        long j8 = 0;
        long j9 = 0;
        int i2 = 0;
        while (true) {
            int length = bArr2.length;
            if (i2 >= length) {
                long j10 = j5 + (j6 >> 26);
                long j11 = j10 & 67108863;
                long j12 = j7 + (j10 >> 26);
                long j13 = j12 & 67108863;
                long j14 = j8 + (j12 >> 26);
                long j15 = j14 & 67108863;
                long j16 = j9 + ((j14 >> 26) * 5);
                long j17 = j16 & 67108863;
                long j18 = (j6 & 67108863) + (j16 >> 26);
                long j19 = j17 + 5;
                long j20 = (j19 >> 26) + j18;
                long j21 = j11 + (j20 >> 26);
                long j22 = j13 + (j21 >> 26);
                long j23 = (j15 + (j22 >> 26)) - 67108864;
                long j24 = j23 >> 63;
                long j25 = j24 ^ (-1);
                long j26 = (j18 & j24) | (j20 & 67108863 & j25);
                long j27 = (j11 & j24) | (j21 & 67108863 & j25);
                long j28 = (j13 & j24) | (j22 & 67108863 & j25);
                long zzc = (((j17 & j24) | (j19 & 67108863 & j25) | (j26 << 26)) & 4294967295L) + zzc(bArr, 16);
                long zzc2 = (((j26 >> 6) | (j27 << 20)) & 4294967295L) + zzc(bArr, 20) + (zzc >> 32);
                long zzc3 = (((j27 >> 12) | (j28 << 14)) & 4294967295L) + zzc(bArr, 24) + (zzc2 >> 32);
                long zzc4 = zzc(bArr, 28);
                byte[] bArr4 = new byte[16];
                zzd(bArr4, zzc & 4294967295L, 0);
                zzd(bArr4, zzc2 & 4294967295L, 4);
                zzd(bArr4, zzc3 & 4294967295L, 8);
                zzd(bArr4, ((((j28 >> 18) | (((j15 & j24) | (j23 & j25)) << 8)) & 4294967295L) + zzc4 + (zzc3 >> 32)) & 4294967295L, 12);
                return bArr4;
            }
            int min = Math.min(16, length - i2);
            System.arraycopy(bArr2, i2, bArr3, 0, min);
            bArr3[min] = 1;
            if (min != 16) {
                Arrays.fill(bArr3, min + 1, i, (byte) 0);
            }
            long zzb6 = j9 + zzb(bArr3, 0, 0);
            long zzb7 = j6 + zzb(bArr3, 3, 2);
            long zzb8 = j5 + zzb(bArr3, 6, 4);
            long zzb9 = j7 + zzb(bArr3, 9, 6);
            long zzb10 = j8 + (zzb(bArr3, 12, 8) | (bArr3[16] << 24));
            long j29 = (zzb6 * zzb) + (zzb7 * j4) + (zzb8 * j3) + (zzb9 * j2) + (zzb10 * j);
            long j30 = (zzb6 * zzb2) + (zzb7 * zzb) + (zzb8 * j4) + (zzb9 * j3) + (zzb10 * j2) + (j29 >> 26);
            long j31 = (zzb6 * zzb3) + (zzb7 * zzb2) + (zzb8 * zzb) + (zzb9 * j4) + (zzb10 * j3) + (j30 >> 26);
            long j32 = (zzb6 * zzb4) + (zzb7 * zzb3) + (zzb8 * zzb2) + (zzb9 * zzb) + (zzb10 * j4) + (j31 >> 26);
            long j33 = (zzb6 * zzb5) + (zzb7 * zzb4) + (zzb8 * zzb3) + (zzb9 * zzb2) + (zzb10 * zzb) + (j32 >> 26);
            j8 = j33 & 67108863;
            long j34 = (j29 & 67108863) + ((j33 >> 26) * 5);
            j9 = j34 & 67108863;
            j6 = (j30 & 67108863) + (j34 >> 26);
            i2 += 16;
            j7 = j32 & 67108863;
            j5 = j31 & 67108863;
            i = 17;
        }
    }

    private static long zzb(byte[] bArr, int i, int i2) {
        return (zzc(bArr, i) >> i2) & 67108863;
    }

    private static long zzc(byte[] bArr, int i) {
        return (((bArr[i + 3] & UByte.MAX_VALUE) << 24) | (bArr[i] & UByte.MAX_VALUE) | ((bArr[i + 1] & UByte.MAX_VALUE) << 8) | ((bArr[i + 2] & UByte.MAX_VALUE) << 16)) & 4294967295L;
    }

    private static void zzd(byte[] bArr, long j, int i) {
        int i2 = 0;
        while (i2 < 4) {
            bArr[i + i2] = (byte) (255 & j);
            i2++;
            j >>= 8;
        }
    }
}
