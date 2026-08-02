package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
final class zzcqg implements zzcwe {
    private final zzcpw zza;
    private zzfbf zzb;
    private zzfag zzc;
    private zzdim zzd;
    private zzdcm zze;

    /* synthetic */ zzcqg(zzcpw zzcpwVar, zzcqf zzcqfVar) {
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

    @Override // com.google.android.gms.internal.ads.zzcwe
    public final /* synthetic */ zzcwe zzc(zzdim zzdimVar) {
        this.zzd = zzdimVar;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzcwe
    public final /* synthetic */ zzcwe zzd(zzdcm zzdcmVar) {
        this.zze = zzdcmVar;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzdci
    public final /* bridge */ /* synthetic */ Object zzh() {
        zzgxq.zzc(this.zzd, zzdim.class);
        zzgxq.zzc(this.zze, zzdcm.class);
        return new zzcqi(this.zza, new zzdaj(), new zzffi(), new zzdbu(), new zzdyd(), this.zzd, this.zze, null, this.zzb, this.zzc, null);
    }
}
