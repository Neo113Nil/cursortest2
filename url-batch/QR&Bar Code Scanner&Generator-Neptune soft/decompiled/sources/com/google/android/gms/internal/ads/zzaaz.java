package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
final class zzaaz implements zzaal {
    final /* synthetic */ zzabc zza;
    private final long zzb;

    public zzaaz(zzabc zzabcVar, long j) {
        this.zza = zzabcVar;
        this.zzb = j;
    }

    @Override // com.google.android.gms.internal.ads.zzaal
    public final long zze() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzaal
    public final zzaaj zzg(long j) {
        zzabf[] zzabfVarArr;
        zzabf[] zzabfVarArr2;
        zzabf[] zzabfVarArr3;
        zzabfVarArr = this.zza.zzg;
        zzaaj zza = zzabfVarArr[0].zza(j);
        int i = 1;
        while (true) {
            zzabc zzabcVar = this.zza;
            zzabfVarArr2 = zzabcVar.zzg;
            if (i >= zzabfVarArr2.length) {
                return zza;
            }
            zzabfVarArr3 = zzabcVar.zzg;
            zzaaj zza2 = zzabfVarArr3[i].zza(j);
            if (zza2.zza.zzc < zza.zza.zzc) {
                zza = zza2;
            }
            i++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaal
    public final boolean zzh() {
        return true;
    }
}
