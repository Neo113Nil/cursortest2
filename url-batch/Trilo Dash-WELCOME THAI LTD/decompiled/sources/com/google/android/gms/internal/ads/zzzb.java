package com.google.android.gms.internal.ads;

import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes2.dex */
public final class zzzb {
    public static int zza(zzdy zzdyVar, int i) {
        switch (i) {
            case 1:
                return 192;
            case 2:
            case 3:
            case 4:
            case 5:
                return 576 << (i - 2);
            case 6:
                return zzdyVar.zzk() + 1;
            case 7:
                return zzdyVar.zzo() + 1;
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

    public static long zzb(zzyt zzytVar, zzzf zzzfVar) throws IOException {
        zzytVar.zzj();
        zzym zzymVar = (zzym) zzytVar;
        zzymVar.zzl(1, false);
        byte[] bArr = new byte[1];
        zzymVar.zzm(bArr, 0, 1, false);
        int i = bArr[0] & 1;
        zzymVar.zzl(2, false);
        int i2 = 1 != i ? 6 : 7;
        zzdy zzdyVar = new zzdy(i2);
        zzdyVar.zzE(zzyw.zza(zzytVar, zzdyVar.zzH(), 0, i2));
        zzytVar.zzj();
        zzza zzzaVar = new zzza();
        if (zzd(zzdyVar, zzzfVar, 1 == i, zzzaVar)) {
            return zzzaVar.zza;
        }
        throw zzbp.zza(null, null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x007f, code lost:
    
        if (r7 != r18.zzf) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x008c, code lost:
    
        if ((r17.zzk() * 1000) == r3) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x009b, code lost:
    
        if (r4 == r3) goto L50;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean zzc(zzdy zzdyVar, zzzf zzzfVar, int i, zzza zzzaVar) {
        int zza;
        int zzc = zzdyVar.zzc();
        long zzs = zzdyVar.zzs();
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
        if (i4 > 7 ? !(i4 > 10 || zzzfVar.zzg != 2) : i4 == zzzfVar.zzg - 1) {
            if ((i5 == 0 || i5 == zzzfVar.zzi) && j2 != 1 && zzd(zzdyVar, zzzfVar, z, zzzaVar) && (zza = zza(zzdyVar, i2)) != -1 && zza <= zzzfVar.zzb) {
                int i6 = zzzfVar.zze;
                if (i3 != 0) {
                    if (i3 > 11) {
                        if (i3 != 12) {
                            if (i3 <= 14) {
                                int zzo = zzdyVar.zzo();
                                if (i3 == 14) {
                                    zzo *= 10;
                                }
                            }
                        }
                    }
                }
                if (zzdyVar.zzk() == zzeg.zzh(zzdyVar.zzH(), zzc, zzdyVar.zzc() - 1, 0)) {
                    return true;
                }
            }
        }
        return false;
    }

    private static boolean zzd(zzdy zzdyVar, zzzf zzzfVar, boolean z, zzza zzzaVar) {
        try {
            long zzu = zzdyVar.zzu();
            if (!z) {
                zzu *= zzzfVar.zzb;
            }
            zzzaVar.zza = zzu;
            return true;
        } catch (NumberFormatException unused) {
            return false;
        }
    }
}
