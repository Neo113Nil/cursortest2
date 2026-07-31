package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes4.dex */
final class zzgeu implements zzghm {
    final zziof zza;
    final zziof zzb;
    final zziof zzc;
    final zziof zzd;
    final zziof zze;
    private final zzgeo zzf;
    private final zzgeu zzg = this;

    zzgeu(zzgeo zzgeoVar) {
        this.zzf = zzgeoVar;
        zziof zza = zzinv.zza(zzghp.zza());
        this.zza = zza;
        zziof zza2 = zzinv.zza(zzgiz.zza(zzgeoVar.zza, zzgeoVar.zzc, zzgeoVar.zzG, zza, zzgeoVar.zzJ, zzgeoVar.zzu, zzgeoVar.zzj, zzgjc.zza()));
        this.zzb = zza2;
        zziof zza3 = zzinv.zza(zzghu.zza());
        this.zzc = zza3;
        zzget zzgetVar = new zzget(this);
        this.zzd = zzgetVar;
        this.zze = zzinv.zza(zzghn.zza(zzgeoVar.zzc, zza2, zzgeoVar.zzG, zzgeoVar.zzF, zza3, zzgetVar, zzgeoVar.zzj));
    }

    @Override // com.google.android.gms.internal.ads.zzghm
    public final zzggu zza() {
        return (zzggu) this.zze.zzb();
    }

    final /* synthetic */ zzgeo zzb() {
        return this.zzf;
    }

    final /* synthetic */ zzgeu zzc() {
        return this.zzg;
    }
}
