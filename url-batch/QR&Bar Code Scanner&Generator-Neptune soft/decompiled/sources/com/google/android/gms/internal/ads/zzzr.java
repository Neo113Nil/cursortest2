package com.google.android.gms.internal.ads;

import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
public final class zzzr {
    public static int zza(zzef zzefVar, int i) {
        switch (i) {
            case 1:
                return 192;
            case 2:
            case 3:
            case 4:
            case 5:
                return 576 << (i - 2);
            case 6:
                return zzefVar.zzk() + 1;
            case 7:
                return zzefVar.zzo() + 1;
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
                return 256 << (i - 8);
            default:
                return -1;
        }
    }

    public static long zzb(zzzj zzzjVar, zzzv zzzvVar) throws IOException {
        zzzjVar.zzj();
        zzyy zzyyVar = (zzyy) zzzjVar;
        zzyyVar.zzl(1, false);
        byte[] bArr = new byte[1];
        zzyyVar.zzm(bArr, 0, 1, false);
        int i = bArr[0] & 1;
        zzyyVar.zzl(2, false);
        int i2 = 1 != i ? 6 : 7;
        zzef zzefVar = new zzef(i2);
        zzefVar.zzE(zzzm.zza(zzzjVar, zzefVar.zzH(), 0, i2));
        zzzjVar.zzj();
        zzzq zzzqVar = new zzzq();
        if (zzd(zzefVar, zzzvVar, 1 == i, zzzqVar)) {
            return zzzqVar.zza;
        }
        throw zzbu.zza(null, null);
    }

    public static boolean zzc(zzef zzefVar, zzzv zzzvVar, int i, zzzq zzzqVar) {
        int zza;
        int zzc = zzefVar.zzc();
        long zzs = zzefVar.zzs();
        long j = zzs >>> 16;
        if (j != i) {
            return false;
        }
        boolean z = (j & 1) == 1;
        int i2 = (int) ((zzs >> 12) & 15);
        int i3 = (int) ((zzs >> 8) & 15);
        int i4 = (int) (15 & (zzs >> 4));
        int i5 = (int) ((zzs >> 1) & 7);
        long j2 = zzs & 1;
        if (i4 <= 7) {
            if (i4 != zzzvVar.zzg - 1) {
                return false;
            }
        } else if (i4 > 10 || zzzvVar.zzg != 2) {
            return false;
        }
        if (!(i5 == 0 || i5 == zzzvVar.zzi) || j2 == 1 || !zzd(zzefVar, zzzvVar, z, zzzqVar) || (zza = zza(zzefVar, i2)) == -1 || zza > zzzvVar.zzb) {
            return false;
        }
        int i6 = zzzvVar.zze;
        if (i3 != 0) {
            if (i3 <= 11) {
                if (i3 != zzzvVar.zzf) {
                    return false;
                }
            } else if (i3 == 12) {
                if (zzefVar.zzk() * 1000 != i6) {
                    return false;
                }
            } else {
                if (i3 > 14) {
                    return false;
                }
                int zzo = zzefVar.zzo();
                if (i3 == 14) {
                    zzo *= 10;
                }
                if (zzo != i6) {
                    return false;
                }
            }
        }
        return zzefVar.zzk() == zzen.zzh(zzefVar.zzH(), zzc, zzefVar.zzc() + (-1), 0);
    }

    private static boolean zzd(zzef zzefVar, zzzv zzzvVar, boolean z, zzzq zzzqVar) {
        try {
            long zzu = zzefVar.zzu();
            if (!z) {
                zzu *= zzzvVar.zzb;
            }
            zzzqVar.zza = zzu;
            return true;
        } catch (NumberFormatException unused) {
            return false;
        }
    }
}
