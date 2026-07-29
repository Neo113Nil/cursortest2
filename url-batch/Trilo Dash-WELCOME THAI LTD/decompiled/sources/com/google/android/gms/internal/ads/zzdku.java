package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes2.dex */
public final class zzdku implements com.google.android.gms.ads.internal.overlay.zzo {
    private final zzddy zza;
    private final zzdiw zzb;

    public zzdku(zzddy zzddyVar, zzdiw zzdiwVar) {
        this.zza = zzddyVar;
        this.zzb = zzdiwVar;
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final void zzb() {
        this.zza.zzb();
        this.zzb.zzb();
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final void zzbC() {
        this.zza.zzbC();
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final void zzbK() {
        this.zza.zzbK();
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final void zzbr() {
        this.zza.zzbr();
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final void zze() {
        this.zza.zze();
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final void zzf(int i) {
        this.zza.zzf(i);
        this.zzb.zza();
    }
}
