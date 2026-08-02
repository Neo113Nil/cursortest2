package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
public final class zzaiq {
    public static int zza(byte[] bArr, int i, int i2) {
        while (i < i2 && bArr[i] != 71) {
            i++;
        }
        return i;
    }

    public static long zzb(zzef zzefVar, int i, int i2) {
        zzefVar.zzF(i);
        if (zzefVar.zza() < 5) {
            return -9223372036854775807L;
        }
        int zze = zzefVar.zze();
        if ((8388608 & zze) != 0 || ((zze >> 8) & 8191) != i2 || (zze & 32) == 0 || zzefVar.zzk() < 7 || zzefVar.zza() < 7 || (zzefVar.zzk() & 16) != 16) {
            return -9223372036854775807L;
        }
        byte[] bArr = new byte[6];
        zzefVar.zzB(bArr, 0, 6);
        byte b = bArr[0];
        long j = bArr[3] & 255;
        return ((bArr[1] & 255) << 17) | ((b & 255) << 25) | ((bArr[2] & 255) << 9) | (j + j) | ((bArr[4] & 255) >> 7);
    }
}
