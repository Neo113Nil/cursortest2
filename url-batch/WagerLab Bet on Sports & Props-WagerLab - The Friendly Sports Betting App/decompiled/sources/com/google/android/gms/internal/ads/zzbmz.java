package com.google.android.gms.internal.ads;

import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
/* loaded from: classes5.dex */
final class zzbmz implements zzbzo {
    final /* synthetic */ zzbno zza;
    final /* synthetic */ zzfhr zzb;
    final /* synthetic */ zzbnp zzc;

    zzbmz(zzbnp zzbnpVar, zzbno zzbnoVar, zzfhr zzfhrVar) {
        this.zza = zzbnoVar;
        this.zzb = zzfhrVar;
        Objects.requireNonNull(zzbnpVar);
        this.zzc = zzbnpVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbzo
    public final void zza() {
        com.google.android.gms.ads.internal.util.zze.zza("loadNewJavascriptEngine (failure): Trying to acquire lock");
        zzbnp zzbnpVar = this.zzc;
        synchronized (zzbnpVar.zzf()) {
            com.google.android.gms.ads.internal.util.zze.zza("loadNewJavascriptEngine (failure): Lock acquired");
            zzbnpVar.zzk(1);
            com.google.android.gms.ads.internal.util.zze.zza("Failed loading new engine. Marking new engine destroyable.");
            this.zza.zzc();
            if (((Boolean) zzbeb.zzd.zze()).booleanValue() && zzbnpVar.zzg() != null) {
                zzfie zzg = zzbnpVar.zzg();
                zzfhr zzfhrVar = this.zzb;
                zzfhrVar.zzk("Failed loading new engine");
                zzfhrVar.zzd(false);
                zzg.zzb(zzfhrVar.zzm());
            }
        }
        com.google.android.gms.ads.internal.util.zze.zza("loadNewJavascriptEngine (failure): Lock released");
    }
}
