package com.google.android.gms.internal.ads;

import com.google.android.gms.dynamic.IObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
final class zzelr extends zzccc {
    final /* synthetic */ zzdfg zza;
    final /* synthetic */ zzdcy zzb;
    final /* synthetic */ zzdeh zzc;
    final /* synthetic */ zzdkw zzd;

    zzelr(zzels zzelsVar, zzdfg zzdfgVar, zzdcy zzdcyVar, zzdeh zzdehVar, zzdkw zzdkwVar) {
        this.zza = zzdfgVar;
        this.zzb = zzdcyVar;
        this.zzc = zzdehVar;
        this.zzd = zzdkwVar;
    }

    @Override // com.google.android.gms.internal.ads.zzccd
    public final void zze(IObjectWrapper iObjectWrapper) {
        this.zzb.onAdClicked();
    }

    @Override // com.google.android.gms.internal.ads.zzccd
    public final void zzf(IObjectWrapper iObjectWrapper) {
        this.zza.zzf(4);
    }

    @Override // com.google.android.gms.internal.ads.zzccd
    public final void zzg(IObjectWrapper iObjectWrapper, int i) {
    }

    @Override // com.google.android.gms.internal.ads.zzccd
    public final void zzh(IObjectWrapper iObjectWrapper) {
        this.zzc.zzb();
    }

    @Override // com.google.android.gms.internal.ads.zzccd
    public final void zzi(IObjectWrapper iObjectWrapper) {
    }

    @Override // com.google.android.gms.internal.ads.zzccd
    public final void zzj(IObjectWrapper iObjectWrapper) {
        this.zza.zzb();
    }

    @Override // com.google.android.gms.internal.ads.zzccd
    public final void zzk(IObjectWrapper iObjectWrapper, int i) {
    }

    @Override // com.google.android.gms.internal.ads.zzccd
    public final void zzl(IObjectWrapper iObjectWrapper) {
    }

    @Override // com.google.android.gms.internal.ads.zzccd
    public final void zzm(IObjectWrapper iObjectWrapper, zzcce zzcceVar) {
        this.zzd.zza(zzcceVar);
    }

    @Override // com.google.android.gms.internal.ads.zzccd
    public final void zzn(IObjectWrapper iObjectWrapper) {
        this.zzc.zze();
    }

    @Override // com.google.android.gms.internal.ads.zzccd
    public final void zzo(IObjectWrapper iObjectWrapper) {
        this.zzd.zzc();
    }
}
