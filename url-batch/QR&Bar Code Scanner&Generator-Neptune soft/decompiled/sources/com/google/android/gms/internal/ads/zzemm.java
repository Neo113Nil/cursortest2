package com.google.android.gms.internal.ads;

import android.view.View;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
final class zzemm implements com.google.android.gms.ads.internal.zzf {
    final /* synthetic */ zzchh zza;
    final /* synthetic */ zzfdw zzb;
    final /* synthetic */ zzfdk zzc;
    final /* synthetic */ zzems zzd;
    final /* synthetic */ zzemn zze;

    zzemm(zzemn zzemnVar, zzchh zzchhVar, zzfdw zzfdwVar, zzfdk zzfdkVar, zzems zzemsVar) {
        this.zze = zzemnVar;
        this.zza = zzchhVar;
        this.zzb = zzfdwVar;
        this.zzc = zzfdkVar;
        this.zzd = zzemsVar;
    }

    @Override // com.google.android.gms.ads.internal.zzf
    public final void zza(View view) {
        zzemw zzemwVar;
        zzchh zzchhVar = this.zza;
        zzemwVar = this.zze.zzd;
        zzchhVar.zzd(zzemwVar.zza(this.zzb, this.zzc, view, this.zzd));
    }

    @Override // com.google.android.gms.ads.internal.zzf
    public final void zzb() {
    }

    @Override // com.google.android.gms.ads.internal.zzf
    public final void zzc() {
    }
}
