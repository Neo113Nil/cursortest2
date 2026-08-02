package com.google.android.gms.internal.ads;

import java.io.IOException;
import kotlin.UByte;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
final class zzabl implements zzyt {
    private final zzzv zza;
    private final int zzb;
    private final zzzq zzc = new zzzq();

    /* synthetic */ zzabl(zzzv zzzvVar, int i, zzabk zzabkVar) {
        this.zza = zzzvVar;
        this.zzb = i;
    }

    private final long zzc(zzzj zzzjVar) throws IOException {
        while (zzzjVar.zze() < zzzjVar.zzd() - 6) {
            zzzv zzzvVar = this.zza;
            int i = this.zzb;
            zzzq zzzqVar = this.zzc;
            long zze = zzzjVar.zze();
            byte[] bArr = new byte[2];
            zzyy zzyyVar = (zzyy) zzzjVar;
            zzyyVar.zzm(bArr, 0, 2, false);
            if ((((bArr[0] & UByte.MAX_VALUE) << 8) | (bArr[1] & UByte.MAX_VALUE)) != i) {
                zzzjVar.zzj();
                zzyyVar.zzl((int) (zze - zzzjVar.zzf()), false);
            } else {
                zzef zzefVar = new zzef(16);
                System.arraycopy(bArr, 0, zzefVar.zzH(), 0, 2);
                zzefVar.zzE(zzzm.zza(zzzjVar, zzefVar.zzH(), 2, 14));
                zzzjVar.zzj();
                zzyyVar.zzl((int) (zze - zzzjVar.zzf()), false);
                if (zzzr.zzc(zzefVar, zzzvVar, i, zzzqVar)) {
                    break;
                }
            }
            zzyyVar.zzl(1, false);
        }
        if (zzzjVar.zze() < zzzjVar.zzd() - 6) {
            return this.zzc.zza;
        }
        ((zzyy) zzzjVar).zzl((int) (zzzjVar.zzd() - zzzjVar.zze()), false);
        return this.zza.zzj;
    }

    @Override // com.google.android.gms.internal.ads.zzyt
    public final zzys zza(zzzj zzzjVar, long j) throws IOException {
        long zzf = zzzjVar.zzf();
        long zzc = zzc(zzzjVar);
        long zze = zzzjVar.zze();
        ((zzyy) zzzjVar).zzl(Math.max(6, this.zza.zzc), false);
        long zzc2 = zzc(zzzjVar);
        return (zzc > j || zzc2 <= j) ? zzc2 <= j ? zzys.zzf(zzc2, zzzjVar.zze()) : zzys.zzd(zzc, zzf) : zzys.zze(zze);
    }

    @Override // com.google.android.gms.internal.ads.zzyt
    public final /* synthetic */ void zzb() {
    }
}
