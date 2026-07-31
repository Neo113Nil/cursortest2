package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
/* loaded from: classes5.dex */
public final class zzadn implements zzadv {
    private final zzdt zza;
    private final zzdt zzb;
    private long zzc;

    public zzadn(long[] jArr, long[] jArr2, long j) {
        int length = jArr.length;
        int length2 = jArr2.length;
        zzghc.zza(length == length2);
        if (length2 <= 0 || jArr2[0] <= 0) {
            this.zza = new zzdt(length2);
            this.zzb = new zzdt(length2);
        } else {
            int i = length2 + 1;
            zzdt zzdtVar = new zzdt(i);
            this.zza = zzdtVar;
            zzdt zzdtVar2 = new zzdt(i);
            this.zzb = zzdtVar2;
            zzdtVar.zza(0L);
            zzdtVar2.zza(0L);
        }
        this.zza.zzb(jArr);
        this.zzb.zzb(jArr2);
        this.zzc = j;
    }

    @Override // com.google.android.gms.internal.ads.zzadv
    public final long zza() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzadv
    public final boolean zzb() {
        return this.zzb.zzd() > 0;
    }

    @Override // com.google.android.gms.internal.ads.zzadv
    public final zzadt zzc(long j) {
        zzdt zzdtVar = this.zzb;
        if (zzdtVar.zzd() == 0) {
            zzadw zzadwVar = zzadw.zza;
            return new zzadt(zzadwVar, zzadwVar);
        }
        int zzn = zzeo.zzn(zzdtVar, j, true, true);
        long zzc = zzdtVar.zzc(zzn);
        zzdt zzdtVar2 = this.zza;
        zzadw zzadwVar2 = new zzadw(zzc, zzdtVar2.zzc(zzn));
        if (zzadwVar2.zzb == j || zzn == zzdtVar.zzd() - 1) {
            return new zzadt(zzadwVar2, zzadwVar2);
        }
        int i = zzn + 1;
        return new zzadt(zzadwVar2, new zzadw(zzdtVar.zzc(i), zzdtVar2.zzc(i)));
    }
}
