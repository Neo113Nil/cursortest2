package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
final class zzcro implements zzdmg {
    private final zzcpw zza;
    private zzfbf zzb;
    private zzfag zzc;
    private zzdim zzd;
    private zzdcm zze;
    private zzemp zzf;

    /* synthetic */ zzcro(zzcpw zzcpwVar, zzcrn zzcrnVar) {
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

    @Override // com.google.android.gms.internal.ads.zzdmg
    public final /* synthetic */ zzdmg zzc(zzemp zzempVar) {
        this.zzf = zzempVar;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzdmg
    public final /* synthetic */ zzdmg zzd(zzdim zzdimVar) {
        this.zzd = zzdimVar;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzdmg
    public final /* synthetic */ zzdmg zze(zzdcm zzdcmVar) {
        this.zze = zzdcmVar;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzdci
    /* renamed from: zzf, reason: merged with bridge method [inline-methods] */
    public final zzdmh zzh() {
        zzgxq.zzc(this.zzd, zzdim.class);
        zzgxq.zzc(this.zze, zzdcm.class);
        zzgxq.zzc(this.zzf, zzemp.class);
        return new zzcrq(this.zza, new zzdaj(), new zzffi(), new zzdbu(), new zzdyd(), this.zzd, this.zze, this.zzf, null, this.zzb, this.zzc, null);
    }
}
