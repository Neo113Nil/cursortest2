package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Clock;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
public final class zzdar implements zzdeo, com.google.android.gms.ads.internal.client.zza, zzdfv, zzddu, zzdda, zzdig {
    private final Clock zza;
    private final zzcfr zzb;

    public zzdar(Clock clock, zzcfr zzcfrVar) {
        this.zza = clock;
        this.zzb = zzcfrVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zza
    public final void onAdClicked() {
        this.zzb.zzd();
    }

    @Override // com.google.android.gms.internal.ads.zzdfv
    public final void zzb(zzfdw zzfdwVar) {
        this.zzb.zzk(this.zza.elapsedRealtime());
    }

    @Override // com.google.android.gms.internal.ads.zzdfv
    public final void zzbE(zzcbc zzcbcVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzdda
    public final void zzbv() {
    }

    public final String zzc() {
        return this.zzb.zzc();
    }

    @Override // com.google.android.gms.internal.ads.zzdig
    public final void zzd() {
    }

    @Override // com.google.android.gms.internal.ads.zzdig
    public final void zze(zzbfk zzbfkVar) {
        this.zzb.zzi();
    }

    @Override // com.google.android.gms.internal.ads.zzdig
    public final void zzf(zzbfk zzbfkVar) {
    }

    public final void zzg(com.google.android.gms.ads.internal.client.zzl zzlVar) {
        this.zzb.zzj(zzlVar);
    }

    @Override // com.google.android.gms.internal.ads.zzdig
    public final void zzh(boolean z) {
    }

    @Override // com.google.android.gms.internal.ads.zzdig
    public final void zzi(zzbfk zzbfkVar) {
        this.zzb.zzg();
    }

    @Override // com.google.android.gms.internal.ads.zzdda
    public final void zzj() {
        this.zzb.zze();
    }

    @Override // com.google.android.gms.internal.ads.zzdig
    public final void zzk(boolean z) {
    }

    @Override // com.google.android.gms.internal.ads.zzddu
    public final void zzl() {
        this.zzb.zzf();
    }

    @Override // com.google.android.gms.internal.ads.zzdda
    public final void zzm() {
    }

    @Override // com.google.android.gms.internal.ads.zzdeo
    public final void zzn() {
        this.zzb.zzh(true);
    }

    @Override // com.google.android.gms.internal.ads.zzdda
    public final void zzo() {
    }

    @Override // com.google.android.gms.internal.ads.zzdda
    public final void zzp(zzcbs zzcbsVar, String str, String str2) {
    }

    @Override // com.google.android.gms.internal.ads.zzdda
    public final void zzr() {
    }
}
