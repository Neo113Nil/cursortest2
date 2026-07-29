package com.google.android.gms.internal.ads;

import android.view.View;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes2.dex */
final class zzekj implements com.google.android.gms.ads.internal.zzf {
    final /* synthetic */ zzcga zza;
    final /* synthetic */ zzfbs zzb;
    final /* synthetic */ zzfbg zzc;
    final /* synthetic */ zzekp zzd;
    final /* synthetic */ zzekk zze;

    zzekj(zzekk zzekkVar, zzcga zzcgaVar, zzfbs zzfbsVar, zzfbg zzfbgVar, zzekp zzekpVar) {
        this.zze = zzekkVar;
        this.zza = zzcgaVar;
        this.zzb = zzfbsVar;
        this.zzc = zzfbgVar;
        this.zzd = zzekpVar;
    }

    @Override // com.google.android.gms.ads.internal.zzf
    public final void zza(View view) {
        zzekt zzektVar;
        zzcga zzcgaVar = this.zza;
        zzektVar = this.zze.zzd;
        zzcgaVar.zzd(zzektVar.zza(this.zzb, this.zzc, view, this.zzd));
    }

    @Override // com.google.android.gms.ads.internal.zzf
    public final void zzb() {
    }

    @Override // com.google.android.gms.ads.internal.zzf
    public final void zzc() {
    }
}
