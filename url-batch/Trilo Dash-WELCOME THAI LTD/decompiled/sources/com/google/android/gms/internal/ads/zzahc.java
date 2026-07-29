package com.google.android.gms.internal.ads;

import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes2.dex */
final class zzahc implements zzyh {
    private final zzee zza;
    private final zzdy zzb = new zzdy();
    private final int zzc;

    public zzahc(int i, zzee zzeeVar, int i2) {
        this.zzc = i;
        this.zza = zzeeVar;
    }

    @Override // com.google.android.gms.internal.ads.zzyh
    public final zzyg zza(zzyt zzytVar, long j) throws IOException {
        int zza;
        int zza2;
        long j2;
        long zzf = zzytVar.zzf();
        int min = (int) Math.min(112800L, zzytVar.zzd() - zzf);
        this.zzb.zzC(min);
        ((zzym) zzytVar).zzm(this.zzb.zzH(), 0, min, false);
        zzdy zzdyVar = this.zzb;
        int zzd = zzdyVar.zzd();
        long j3 = -1;
        long j4 = -1;
        long j5 = -9223372036854775807L;
        while (zzdyVar.zza() >= 188 && (zza2 = (zza = zzaho.zza(zzdyVar.zzH(), zzdyVar.zzc(), zzd)) + 188) <= zzd) {
            long zzb = zzaho.zzb(zzdyVar, zza, this.zzc);
            if (zzb != -9223372036854775807L) {
                long zzb2 = this.zza.zzb(zzb);
                if (zzb2 > j) {
                    if (j5 == -9223372036854775807L) {
                        return zzyg.zzd(zzb2, zzf);
                    }
                    j2 = zzf + j4;
                } else if (100000 + zzb2 > j) {
                    j2 = zzf + zza;
                } else {
                    j4 = zza;
                    j5 = zzb2;
                }
                return zzyg.zze(j2);
            }
            zzdyVar.zzF(zza2);
            j3 = zza2;
        }
        return j5 != -9223372036854775807L ? zzyg.zzf(j5, zzf + j3) : zzyg.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzyh
    public final void zzb() {
        zzdy zzdyVar = this.zzb;
        byte[] bArr = zzeg.zzf;
        int length = bArr.length;
        zzdyVar.zzD(bArr, 0);
    }
}
