package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
final class zzcsc implements zzdug {
    private final zzcpw zza;
    private zzfbf zzb;
    private zzfag zzc;
    private zzdim zzd;
    private zzdcm zze;

    /* synthetic */ zzcsc(zzcpw zzcpwVar, zzcsb zzcsbVar) {
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

    @Override // com.google.android.gms.internal.ads.zzdug
    public final /* synthetic */ zzdug zzc(zzdim zzdimVar) {
        this.zzd = zzdimVar;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzdug
    public final /* synthetic */ zzdug zzd(zzdcm zzdcmVar) {
        this.zze = zzdcmVar;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzdci
    /* renamed from: zze, reason: merged with bridge method [inline-methods] */
    public final zzduh zzh() {
        zzgxq.zzc(this.zzd, zzdim.class);
        zzgxq.zzc(this.zze, zzdcm.class);
        return new zzcse(this.zza, new zzdaj(), new zzffi(), new zzdbu(), new zzdyd(), this.zzd, this.zze, null, this.zzb, this.zzc, null);
    }
}
