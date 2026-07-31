package com.google.android.gms.internal.ads;

import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes11.dex */
final class zzarl implements zzafs {
    private final zzfj zza;
    private final zzeu zzb = new zzeu();
    private final int zzc;

    public zzarl(int i, zzfj zzfjVar, int i2) {
        this.zzc = i;
        this.zza = zzfjVar;
    }

    @Override // com.google.android.gms.internal.ads.zzafs
    public final zzafr zza(zzagi zzagiVar, long j) throws IOException {
        int zza;
        int zza2;
        long zzn = zzagiVar.zzn();
        int min = (int) Math.min(112800L, zzagiVar.zzo() - zzn);
        zzeu zzeuVar = this.zzb;
        zzeuVar.zza(min);
        zzagiVar.zzi(zzeuVar.zzi(), 0, min);
        int zze = zzeuVar.zze();
        long j2 = -1;
        long j3 = -9223372036854775807L;
        long j4 = -1;
        while (zzeuVar.zzd() >= 188 && (zza2 = (zza = zzarx.zza(zzeuVar.zzi(), zzeuVar.zzg(), zze)) + 188) <= zze) {
            long zzb = zzarx.zzb(zzeuVar, zza, this.zzc);
            if (zzb != -9223372036854775807L) {
                long zze2 = this.zza.zze(zzb);
                if (zze2 <= j) {
                    j4 = zza;
                    if (100000 + zze2 <= j) {
                        j3 = zze2;
                    }
                } else if (j3 == -9223372036854775807L) {
                    return zzafr.zza(zze2, zzn);
                }
                return zzafr.zzc(zzn + j4);
            }
            zzeuVar.zzh(zza2);
            j2 = zza2;
        }
        return j3 != -9223372036854775807L ? zzafr.zzb(j3, zzn + j2) : zzafr.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzafs
    public final void zzb() {
        byte[] bArr = zzfm.zzb;
        int length = bArr.length;
        this.zzb.zzb(bArr, 0);
    }
}
