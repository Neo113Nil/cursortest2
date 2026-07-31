package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes3.dex */
final class zzcpr implements zzcvq {
    private final zzcpp zza;
    private zzfiy zzb;
    private zzfic zzc;
    private zzdjp zzd;
    private zzdcz zze;

    /* synthetic */ zzcpr(zzcpp zzcppVar, byte[] bArr) {
        this.zza = zzcppVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcvq, com.google.android.gms.internal.ads.zzdcw
    /* renamed from: zza */
    public final zzcvr zzh() {
        zzioe.zzc(this.zzd, zzdjp.class);
        zzioe.zzc(this.zze, zzdcz.class);
        return new zzcps(this.zza, new zzczr(), new zzfnc(), new zzdbu(), new zzeay(), this.zzd, this.zze, zzeqm.zza(), null, this.zzb, this.zzc);
    }

    @Override // com.google.android.gms.internal.ads.zzcvq
    public final /* synthetic */ zzcvq zzb(@Nullable zzfic zzficVar) {
        this.zzc = zzficVar;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzcvq
    public final /* synthetic */ zzcvq zzc(@Nullable zzfiy zzfiyVar) {
        this.zzb = zzfiyVar;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzcvq
    public final /* bridge */ /* synthetic */ zzcvq zzd(zzdcz zzdczVar) {
        this.zze = zzdczVar;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzcvq
    public final /* bridge */ /* synthetic */ zzcvq zze(zzdjp zzdjpVar) {
        this.zzd = zzdjpVar;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzcvq, com.google.android.gms.internal.ads.zzdcw
    public final /* synthetic */ zzdcw zzi(@Nullable zzfic zzficVar) {
        this.zzc = zzficVar;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzcvq, com.google.android.gms.internal.ads.zzdcw
    public final /* synthetic */ zzdcw zzj(@Nullable zzfiy zzfiyVar) {
        this.zzb = zzfiyVar;
        return this;
    }
}
