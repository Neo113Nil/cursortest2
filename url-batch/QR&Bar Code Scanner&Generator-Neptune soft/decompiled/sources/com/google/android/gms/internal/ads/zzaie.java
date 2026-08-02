package com.google.android.gms.internal.ads;

import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
final class zzaie implements zzyt {
    private final zzel zza;
    private final zzef zzb = new zzef();
    private final int zzc;

    public zzaie(int i, zzel zzelVar, int i2) {
        this.zzc = i;
        this.zza = zzelVar;
    }

    @Override // com.google.android.gms.internal.ads.zzyt
    public final zzys zza(zzzj zzzjVar, long j) throws IOException {
        int zza;
        int zza2;
        long j2;
        long zzf = zzzjVar.zzf();
        int min = (int) Math.min(112800L, zzzjVar.zzd() - zzf);
        this.zzb.zzC(min);
        ((zzyy) zzzjVar).zzm(this.zzb.zzH(), 0, min, false);
        zzef zzefVar = this.zzb;
        int zzd = zzefVar.zzd();
        long j3 = -1;
        long j4 = -1;
        long j5 = -9223372036854775807L;
        while (zzefVar.zza() >= 188 && (zza2 = (zza = zzaiq.zza(zzefVar.zzH(), zzefVar.zzc(), zzd)) + 188) <= zzd) {
            long zzb = zzaiq.zzb(zzefVar, zza, this.zzc);
            if (zzb != -9223372036854775807L) {
                long zzb2 = this.zza.zzb(zzb);
                if (zzb2 > j) {
                    if (j5 == -9223372036854775807L) {
                        return zzys.zzd(zzb2, zzf);
                    }
                    j2 = zzf + j4;
                } else if (100000 + zzb2 > j) {
                    j2 = zzf + zza;
                } else {
                    j4 = zza;
                    j5 = zzb2;
                }
                return zzys.zze(j2);
            }
            zzefVar.zzF(zza2);
            j3 = zza2;
        }
        return j5 != -9223372036854775807L ? zzys.zzf(j5, zzf + j3) : zzys.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzyt
    public final void zzb() {
        zzef zzefVar = this.zzb;
        byte[] bArr = zzen.zzf;
        int length = bArr.length;
        zzefVar.zzD(bArr, 0);
    }
}
