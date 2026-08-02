package com.google.android.gms.internal.ads;

import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
final class zzto implements zzus, zzre {
    final /* synthetic */ zztq zza;
    private final Object zzb;
    private zzur zzc;
    private zzrd zzd;

    public zzto(zztq zztqVar, Object obj) {
        this.zza = zztqVar;
        this.zzc = zztqVar.zze(null);
        this.zzd = zztqVar.zzc(null);
        this.zzb = obj;
    }

    private final zzue zzf(zzue zzueVar, zzui zzuiVar) {
        zztq zztqVar = this.zza;
        Object obj = this.zzb;
        long j = zzueVar.zzc;
        zztqVar.zzx(obj, j, zzuiVar);
        zztq zztqVar2 = this.zza;
        Object obj2 = this.zzb;
        long j2 = zzueVar.zzd;
        zztqVar2.zzx(obj2, j2, zzuiVar);
        return (j == zzueVar.zzc && j2 == zzueVar.zzd) ? zzueVar : new zzue(1, zzueVar.zza, zzueVar.zzb, 0, null, j, j2);
    }

    private final boolean zzg(int i, zzui zzuiVar) {
        zzui zzuiVar2;
        if (zzuiVar != null) {
            zzuiVar2 = this.zza.zzy(this.zzb, zzuiVar);
            if (zzuiVar2 == null) {
                return false;
            }
        } else {
            zzuiVar2 = null;
        }
        this.zza.zzw(this.zzb, 0);
        zzur zzurVar = this.zzc;
        int i2 = zzurVar.zza;
        if (!zzet.zzG(zzurVar.zzb, zzuiVar2)) {
            this.zzc = this.zza.zzf(0, zzuiVar2);
        }
        zzrd zzrdVar = this.zzd;
        int i3 = zzrdVar.zza;
        if (zzet.zzG(zzrdVar.zzb, zzuiVar2)) {
            return true;
        }
        this.zzd = this.zza.zzd(0, zzuiVar2);
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzus
    public final void zzae(int i, zzui zzuiVar, zzue zzueVar) {
        if (zzg(0, zzuiVar)) {
            this.zzc.zzc(zzf(zzueVar, zzuiVar));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzus
    public final void zzaf(int i, zzui zzuiVar, zztz zztzVar, zzue zzueVar) {
        if (zzg(0, zzuiVar)) {
            this.zzc.zzd(zztzVar, zzf(zzueVar, zzuiVar));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzus
    public final void zzag(int i, zzui zzuiVar, zztz zztzVar, zzue zzueVar) {
        if (zzg(0, zzuiVar)) {
            this.zzc.zze(zztzVar, zzf(zzueVar, zzuiVar));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzus
    public final void zzah(int i, zzui zzuiVar, zztz zztzVar, zzue zzueVar, IOException iOException, boolean z) {
        if (zzg(0, zzuiVar)) {
            this.zzc.zzf(zztzVar, zzf(zzueVar, zzuiVar), iOException, z);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzus
    public final void zzai(int i, zzui zzuiVar, zztz zztzVar, zzue zzueVar) {
        if (zzg(0, zzuiVar)) {
            this.zzc.zzg(zztzVar, zzf(zzueVar, zzuiVar));
        }
    }
}
