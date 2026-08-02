package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
final class zzcpq implements zzdnc {
    private final zzcpw zza;
    private zzfbf zzb;
    private zzfag zzc;
    private zzdim zzd;
    private zzdcm zze;
    private zzdmy zzf;
    private zzcwz zzg;

    /* synthetic */ zzcpq(zzcpw zzcpwVar, zzcpp zzcppVar) {
        this.zza = zzcpwVar;
    }

    @Override // com.google.android.gms.internal.ads.zzdci
    public final /* synthetic */ zzdci zza(zzfag zzfagVar) {
        this.zzc = zzfagVar;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzdci
    public final /* synthetic */ zzdci zzb(zzfbf zzfbfVar) {
        this.zzb = zzfbfVar;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzdnc
    public final /* synthetic */ zzdnc zzc(zzcwz zzcwzVar) {
        this.zzg = zzcwzVar;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzdnc
    public final /* synthetic */ zzdnc zzd(zzdmy zzdmyVar) {
        this.zzf = zzdmyVar;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzdnc
    public final /* synthetic */ zzdnc zze(zzdim zzdimVar) {
        this.zzd = zzdimVar;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzdnc
    public final /* synthetic */ zzdnc zzf(zzdcm zzdcmVar) {
        this.zze = zzdcmVar;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzdci
    /* renamed from: zzg, reason: merged with bridge method [inline-methods] */
    public final zzdnd zzh() {
        zzgxq.zzc(this.zzd, zzdim.class);
        zzgxq.zzc(this.zze, zzdcm.class);
        zzgxq.zzc(this.zzf, zzdmy.class);
        zzgxq.zzc(this.zzg, zzcwz.class);
        return new zzcps(this.zza, this.zzg, this.zzf, new zzdaj(), new zzffi(), new zzdbu(), new zzdyd(), this.zzd, this.zze, null, this.zzb, this.zzc, null);
    }
}
