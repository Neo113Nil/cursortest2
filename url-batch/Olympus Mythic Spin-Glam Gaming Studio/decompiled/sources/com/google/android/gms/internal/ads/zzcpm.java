package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes3.dex */
final class zzcpm implements zzdoz {
    private final zzcpp zza;
    private zzfiy zzb;
    private zzfic zzc;
    private zzdjp zzd;
    private zzdcz zze;
    private zzdov zzf;
    private zzcwa zzg;

    /* synthetic */ zzcpm(zzcpp zzcppVar, byte[] bArr) {
        this.zza = zzcppVar;
    }

    @Override // com.google.android.gms.internal.ads.zzdoz, com.google.android.gms.internal.ads.zzdcw
    /* renamed from: zza */
    public final zzdpa zzh() {
        zzioe.zzc(this.zzd, zzdjp.class);
        zzioe.zzc(this.zze, zzdcz.class);
        zzioe.zzc(this.zzf, zzdov.class);
        zzioe.zzc(this.zzg, zzcwa.class);
        return new zzcpn(this.zza, this.zzg, this.zzf, new zzczr(), new zzfnc(), new zzdbu(), new zzeay(), this.zzd, this.zze, zzeqm.zza(), null, this.zzb, this.zzc);
    }

    @Override // com.google.android.gms.internal.ads.zzdoz
    public final /* synthetic */ zzdoz zzb(@Nullable zzfic zzficVar) {
        this.zzc = zzficVar;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzdoz
    public final /* synthetic */ zzdoz zzc(@Nullable zzfiy zzfiyVar) {
        this.zzb = zzfiyVar;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzdoz
    public final /* bridge */ /* synthetic */ zzdoz zzd(zzcwa zzcwaVar) {
        this.zzg = zzcwaVar;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzdoz
    public final /* bridge */ /* synthetic */ zzdoz zze(zzdov zzdovVar) {
        this.zzf = zzdovVar;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzdoz
    public final /* bridge */ /* synthetic */ zzdoz zzf(zzdcz zzdczVar) {
        this.zze = zzdczVar;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzdoz
    public final /* bridge */ /* synthetic */ zzdoz zzg(zzdjp zzdjpVar) {
        this.zzd = zzdjpVar;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzdoz, com.google.android.gms.internal.ads.zzdcw
    public final /* synthetic */ zzdcw zzi(@Nullable zzfic zzficVar) {
        this.zzc = zzficVar;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzdoz, com.google.android.gms.internal.ads.zzdcw
    public final /* synthetic */ zzdcw zzj(@Nullable zzfiy zzfiyVar) {
        this.zzb = zzfiyVar;
        return this;
    }
}
