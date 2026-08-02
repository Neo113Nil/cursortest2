package com.google.android.gms.internal.ads;

import android.util.Pair;
import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
final class zzaoc {
    public static Pair zza(zzacl zzaclVar) throws IOException {
        zzaclVar.zzj();
        zzaob zzd = zzd(1684108385, zzaclVar, new zzek(8));
        ((zzaby) zzaclVar).zzo(8, false);
        return Pair.create(Long.valueOf(zzaclVar.zzf()), Long.valueOf(zzd.zzb));
    }

    public static zzaoa zzb(zzacl zzaclVar) throws IOException {
        byte[] bArr;
        zzek zzekVar = new zzek(16);
        zzaob zzd = zzd(1718449184, zzaclVar, zzekVar);
        zzdi.zzf(zzd.zzb >= 16);
        zzaby zzabyVar = (zzaby) zzaclVar;
        zzabyVar.zzm(zzekVar.zzM(), 0, 16, false);
        zzekVar.zzK(0);
        int zzk = zzekVar.zzk();
        int zzk2 = zzekVar.zzk();
        int zzj = zzekVar.zzj();
        int zzj2 = zzekVar.zzj();
        int zzk3 = zzekVar.zzk();
        int zzk4 = zzekVar.zzk();
        int i = ((int) zzd.zzb) - 16;
        if (i > 0) {
            bArr = new byte[i];
            zzabyVar.zzm(bArr, 0, i, false);
        } else {
            bArr = zzet.zzf;
        }
        byte[] bArr2 = bArr;
        zzabyVar.zzo((int) (zzaclVar.zze() - zzaclVar.zzf()), false);
        return new zzaoa(zzk, zzk2, zzj, zzj2, zzk3, zzk4, bArr2);
    }

    public static boolean zzc(zzacl zzaclVar) throws IOException {
        zzek zzekVar = new zzek(8);
        int i = zzaob.zza(zzaclVar, zzekVar).zza;
        if (i != 1380533830 && i != 1380333108) {
            return false;
        }
        ((zzaby) zzaclVar).zzm(zzekVar.zzM(), 0, 4, false);
        zzekVar.zzK(0);
        int zzg = zzekVar.zzg();
        if (zzg == 1463899717) {
            return true;
        }
        zzea.zzc("WavHeaderReader", "Unsupported form type: " + zzg);
        return false;
    }

    private static zzaob zzd(int i, zzacl zzaclVar, zzek zzekVar) throws IOException {
        zzaob zza = zzaob.zza(zzaclVar, zzekVar);
        while (true) {
            int i2 = zza.zza;
            if (i2 == i) {
                return zza;
            }
            zzea.zzf("WavHeaderReader", "Ignoring unknown WAV chunk: " + i2);
            long j = zza.zzb;
            long j2 = 8 + j;
            if ((1 & j) != 0) {
                j2 = 9 + j;
            }
            if (j2 > 2147483647L) {
                throw zzbo.zzc("Chunk is too large (~2GB+) to skip; id: " + zza.zza);
            }
            ((zzaby) zzaclVar).zzo((int) j2, false);
            zza = zzaob.zza(zzaclVar, zzekVar);
        }
    }
}
