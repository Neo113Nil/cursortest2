package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
/* loaded from: classes5.dex */
public final class zzade {
    public static boolean zzb(zzacv zzacvVar, zzadd zzaddVar) throws IOException {
        zzacvVar.zzl();
        zzee zzeeVar = new zzee(new byte[4], 4);
        zzacvVar.zzi(zzeeVar.zza, 0, 4);
        boolean zzi = zzeeVar.zzi();
        int zzj = zzeeVar.zzj(7);
        int zzj2 = zzeeVar.zzj(24) + 4;
        if (zzj == 0) {
            byte[] bArr = new byte[38];
            zzacvVar.zzc(bArr, 0, 38);
            zzaddVar.zza = new zzadh(bArr, 4);
            return zzi;
        }
        zzadh zzadhVar = zzaddVar.zza;
        if (zzadhVar == null) {
            throw new IllegalArgumentException();
        }
        if (zzj == 3) {
            zzef zzefVar = new zzef(zzj2);
            zzacvVar.zzc(zzefVar.zzi(), 0, zzj2);
            zzaddVar.zza = zzadhVar.zze(zzc(zzefVar));
            return zzi;
        }
        if (zzj == 4) {
            zzef zzefVar2 = new zzef(zzj2);
            zzacvVar.zzc(zzefVar2.zzi(), 0, zzj2);
            zzefVar2.zzk(4);
            zzaddVar.zza = new zzadh(zzadhVar.zza, zzadhVar.zzb, zzadhVar.zzc, zzadhVar.zzd, zzadhVar.zze, zzadhVar.zzg, zzadhVar.zzh, zzadhVar.zzj, zzadhVar.zzk, zzadhVar.zzd(zzaeh.zzc(Arrays.asList(zzaeh.zzb(zzefVar2, false, false).zza))));
            return zzi;
        }
        if (zzj != 6) {
            zzacvVar.zzf(zzj2);
            return zzi;
        }
        zzef zzefVar3 = new zzef(zzj2);
        zzacvVar.zzc(zzefVar3.zzi(), 0, zzj2);
        zzefVar3.zzk(4);
        zzaddVar.zza = new zzadh(zzadhVar.zza, zzadhVar.zzb, zzadhVar.zzc, zzadhVar.zzd, zzadhVar.zze, zzadhVar.zzg, zzadhVar.zzh, zzadhVar.zzj, zzadhVar.zzk, zzadhVar.zzd(new zzao(zzgjz.zzj(zzafu.zzb(zzefVar3)))));
        return zzi;
    }

    public static zzadg zzc(zzef zzefVar) {
        zzefVar.zzk(1);
        int zzx = zzefVar.zzx();
        long zzg = zzefVar.zzg();
        long j = zzx;
        int i = zzx / 18;
        long[] jArr = new long[i];
        long[] jArr2 = new long[i];
        int i2 = 0;
        while (true) {
            if (i2 >= i) {
                break;
            }
            long zzD = zzefVar.zzD();
            if (zzD == -1) {
                jArr = Arrays.copyOf(jArr, i2);
                jArr2 = Arrays.copyOf(jArr2, i2);
                break;
            }
            jArr[i2] = zzD;
            jArr2[i2] = zzefVar.zzD();
            zzefVar.zzk(2);
            i2++;
        }
        zzefVar.zzk((int) ((zzg + j) - zzefVar.zzg()));
        return new zzadg(jArr, jArr2);
    }

    public static zzao zza(zzacv zzacvVar, boolean z) throws IOException {
        zzao zza = new zzadm().zza(zzacvVar, z ? null : zzagg.zza, 0);
        if (zza == null || zza.zza() == 0) {
            return null;
        }
        return zza;
    }
}
