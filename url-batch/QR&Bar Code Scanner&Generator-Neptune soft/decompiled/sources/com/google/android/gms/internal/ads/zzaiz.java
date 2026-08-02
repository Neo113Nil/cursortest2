package com.google.android.gms.internal.ads;

import android.util.Pair;
import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
final class zzaiz {
    public static Pair zza(zzzj zzzjVar) throws IOException {
        zzzjVar.zzj();
        zzaiy zzd = zzd(1684108385, zzzjVar, new zzef(8));
        ((zzyy) zzzjVar).zzo(8, false);
        return Pair.create(Long.valueOf(zzzjVar.zzf()), Long.valueOf(zzd.zzb));
    }

    public static zzaix zzb(zzzj zzzjVar) throws IOException {
        byte[] bArr;
        zzef zzefVar = new zzef(16);
        zzaiy zzd = zzd(1718449184, zzzjVar, zzefVar);
        zzdd.zzf(zzd.zzb >= 16);
        zzyy zzyyVar = (zzyy) zzzjVar;
        zzyyVar.zzm(zzefVar.zzH(), 0, 16, false);
        zzefVar.zzF(0);
        int zzi = zzefVar.zzi();
        int zzi2 = zzefVar.zzi();
        int zzh = zzefVar.zzh();
        int zzh2 = zzefVar.zzh();
        int zzi3 = zzefVar.zzi();
        int zzi4 = zzefVar.zzi();
        int i = ((int) zzd.zzb) - 16;
        if (i > 0) {
            byte[] bArr2 = new byte[i];
            zzyyVar.zzm(bArr2, 0, i, false);
            bArr = bArr2;
        } else {
            bArr = zzen.zzf;
        }
        zzyyVar.zzo((int) (zzzjVar.zze() - zzzjVar.zzf()), false);
        return new zzaix(zzi, zzi2, zzh, zzh2, zzi3, zzi4, bArr);
    }

    public static boolean zzc(zzzj zzzjVar) throws IOException {
        zzef zzefVar = new zzef(8);
        int i = zzaiy.zza(zzzjVar, zzefVar).zza;
        if (i != 1380533830 && i != 1380333108) {
            return false;
        }
        ((zzyy) zzzjVar).zzm(zzefVar.zzH(), 0, 4, false);
        zzefVar.zzF(0);
        int zze = zzefVar.zze();
        if (zze == 1463899717) {
            return true;
        }
        zzdw.zzb("WavHeaderReader", "Unsupported form type: " + zze);
        return false;
    }

    private static zzaiy zzd(int i, zzzj zzzjVar, zzef zzefVar) throws IOException {
        zzaiy zza = zzaiy.zza(zzzjVar, zzefVar);
        while (true) {
            int i2 = zza.zza;
            if (i2 == i) {
                return zza;
            }
            zzdw.zze("WavHeaderReader", "Ignoring unknown WAV chunk: " + i2);
            long j = zza.zzb + 8;
            if (j > 2147483647L) {
                throw zzbu.zzc("Chunk is too large (~2GB+) to skip; id: " + zza.zza);
            }
            ((zzyy) zzzjVar).zzo((int) j, false);
            zza = zzaiy.zza(zzzjVar, zzefVar);
        }
    }
}
