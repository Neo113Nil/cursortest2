package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
final class zzady implements zzadi {
    final /* synthetic */ zzaeb zza;
    private final long zzb;

    public zzady(zzaeb zzaebVar, long j) {
        this.zza = zzaebVar;
        this.zzb = j;
    }

    @Override // com.google.android.gms.internal.ads.zzadi
    public final long zza() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzadi
    public final zzadg zzg(long j) {
        zzaee[] zzaeeVarArr;
        zzaee[] zzaeeVarArr2;
        zzaee[] zzaeeVarArr3;
        zzaeeVarArr = this.zza.zzi;
        zzadg zza = zzaeeVarArr[0].zza(j);
        int i = 1;
        while (true) {
            zzaeb zzaebVar = this.zza;
            zzaeeVarArr2 = zzaebVar.zzi;
            if (i >= zzaeeVarArr2.length) {
                return zza;
            }
            zzaeeVarArr3 = zzaebVar.zzi;
            zzadg zza2 = zzaeeVarArr3[i].zza(j);
            if (zza2.zza.zzc < zza.zza.zzc) {
                zza = zza2;
            }
            i++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzadi
    public final boolean zzh() {
        return true;
    }
}
