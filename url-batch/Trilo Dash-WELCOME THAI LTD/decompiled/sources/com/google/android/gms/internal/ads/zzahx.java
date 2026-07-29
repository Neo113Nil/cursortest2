package com.google.android.gms.internal.ads;

import android.util.Log;
import android.util.Pair;
import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes2.dex */
final class zzahx {
    public static Pair zza(zzyt zzytVar) throws IOException {
        zzytVar.zzj();
        zzahw zzd = zzd(1684108385, zzytVar, new zzdy(8));
        ((zzym) zzytVar).zzo(8, false);
        return Pair.create(Long.valueOf(zzytVar.zzf()), Long.valueOf(zzd.zzb));
    }

    public static zzahv zzb(zzyt zzytVar) throws IOException {
        byte[] bArr;
        zzdy zzdyVar = new zzdy(16);
        zzahw zzd = zzd(1718449184, zzytVar, zzdyVar);
        zzcw.zzf(zzd.zzb >= 16);
        zzym zzymVar = (zzym) zzytVar;
        zzymVar.zzm(zzdyVar.zzH(), 0, 16, false);
        zzdyVar.zzF(0);
        int zzi = zzdyVar.zzi();
        int zzi2 = zzdyVar.zzi();
        int zzh = zzdyVar.zzh();
        int zzh2 = zzdyVar.zzh();
        int zzi3 = zzdyVar.zzi();
        int zzi4 = zzdyVar.zzi();
        int i = ((int) zzd.zzb) - 16;
        if (i > 0) {
            bArr = new byte[i];
            zzymVar.zzm(bArr, 0, i, false);
        } else {
            bArr = zzeg.zzf;
        }
        byte[] bArr2 = bArr;
        zzymVar.zzo((int) (zzytVar.zze() - zzytVar.zzf()), false);
        return new zzahv(zzi, zzi2, zzh, zzh2, zzi3, zzi4, bArr2);
    }

    public static boolean zzc(zzyt zzytVar) throws IOException {
        zzdy zzdyVar = new zzdy(8);
        int i = zzahw.zza(zzytVar, zzdyVar).zza;
        if (i != 1380533830 && i != 1380333108) {
            return false;
        }
        ((zzym) zzytVar).zzm(zzdyVar.zzH(), 0, 4, false);
        zzdyVar.zzF(0);
        int zze = zzdyVar.zze();
        if (zze == 1463899717) {
            return true;
        }
        Log.e("WavHeaderReader", "Unsupported form type: " + zze);
        return false;
    }

    private static zzahw zzd(int i, zzyt zzytVar, zzdy zzdyVar) throws IOException {
        zzahw zza = zzahw.zza(zzytVar, zzdyVar);
        while (true) {
            int i2 = zza.zza;
            if (i2 == i) {
                return zza;
            }
            Log.w("WavHeaderReader", "Ignoring unknown WAV chunk: " + i2);
            long j = zza.zzb + 8;
            if (j > 2147483647L) {
                throw zzbp.zzc("Chunk is too large (~2GB+) to skip; id: " + zza.zza);
            }
            ((zzym) zzytVar).zzo((int) j, false);
            zza = zzahw.zza(zzytVar, zzdyVar);
        }
    }
}
