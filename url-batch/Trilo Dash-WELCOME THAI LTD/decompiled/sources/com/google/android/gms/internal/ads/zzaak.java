package com.google.android.gms.internal.ads;

import java.io.IOException;
import kotlin.UByte;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes2.dex */
final class zzaak implements zzyh {
    private final zzzf zza;
    private final int zzb;
    private final zzza zzc = new zzza();

    /* synthetic */ zzaak(zzzf zzzfVar, int i, zzaaj zzaajVar) {
        this.zza = zzzfVar;
        this.zzb = i;
    }

    private final long zzc(zzyt zzytVar) throws IOException {
        while (zzytVar.zze() < zzytVar.zzd() - 6) {
            zzzf zzzfVar = this.zza;
            int i = this.zzb;
            zzza zzzaVar = this.zzc;
            long zze = zzytVar.zze();
            byte[] bArr = new byte[2];
            zzym zzymVar = (zzym) zzytVar;
            zzymVar.zzm(bArr, 0, 2, false);
            if ((((bArr[0] & UByte.MAX_VALUE) << 8) | (bArr[1] & UByte.MAX_VALUE)) != i) {
                zzytVar.zzj();
                zzymVar.zzl((int) (zze - zzytVar.zzf()), false);
            } else {
                zzdy zzdyVar = new zzdy(16);
                System.arraycopy(bArr, 0, zzdyVar.zzH(), 0, 2);
                zzdyVar.zzE(zzyw.zza(zzytVar, zzdyVar.zzH(), 2, 14));
                zzytVar.zzj();
                zzymVar.zzl((int) (zze - zzytVar.zzf()), false);
                if (zzzb.zzc(zzdyVar, zzzfVar, i, zzzaVar)) {
                    break;
                }
            }
            zzymVar.zzl(1, false);
        }
        if (zzytVar.zze() < zzytVar.zzd() - 6) {
            return this.zzc.zza;
        }
        ((zzym) zzytVar).zzl((int) (zzytVar.zzd() - zzytVar.zze()), false);
        return this.zza.zzj;
    }

    @Override // com.google.android.gms.internal.ads.zzyh
    public final zzyg zza(zzyt zzytVar, long j) throws IOException {
        long zzf = zzytVar.zzf();
        long zzc = zzc(zzytVar);
        long zze = zzytVar.zze();
        ((zzym) zzytVar).zzl(Math.max(6, this.zza.zzc), false);
        long zzc2 = zzc(zzytVar);
        return (zzc > j || zzc2 <= j) ? zzc2 <= j ? zzyg.zzf(zzc2, zzytVar.zze()) : zzyg.zzd(zzc, zzf) : zzyg.zze(zze);
    }

    @Override // com.google.android.gms.internal.ads.zzyh
    public final /* synthetic */ void zzb() {
    }
}
