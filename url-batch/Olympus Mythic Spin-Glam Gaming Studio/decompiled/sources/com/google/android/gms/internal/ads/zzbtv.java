package com.google.android.gms.internal.ads;

import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes15.dex */
final class zzbtv implements zzcgs {
    final /* synthetic */ zzbul zza;
    final /* synthetic */ zzfqw zzb;
    final /* synthetic */ zzbum zzc;

    zzbtv(zzbum zzbumVar, zzbul zzbulVar, zzfqw zzfqwVar) {
        this.zza = zzbulVar;
        this.zzb = zzfqwVar;
        Objects.requireNonNull(zzbumVar);
        this.zzc = zzbumVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcgs
    public final /* bridge */ /* synthetic */ void zza(Object obj) {
        com.google.android.gms.ads.internal.util.zze.zza("loadNewJavascriptEngine (success): Trying to acquire lock");
        zzbum zzbumVar = this.zzc;
        synchronized (zzbumVar.zzg()) {
            try {
                com.google.android.gms.ads.internal.util.zze.zza("loadNewJavascriptEngine (success): Lock acquired");
                zzbumVar.zzl(0);
                if (zzbumVar.zzi() != null && this.zza != zzbumVar.zzi()) {
                    com.google.android.gms.ads.internal.util.zze.zza("New JS engine is loaded, marking previous one as destroyable.");
                    zzbumVar.zzi().zzc();
                }
                zzbumVar.zzj(this.zza);
                if (((Boolean) zzbla.zzd.zze()).booleanValue() && zzbumVar.zzh() != null) {
                    zzfrj zzh = zzbumVar.zzh();
                    zzfqw zzfqwVar = this.zzb;
                    zzfqwVar.zzd(true);
                    zzh.zzb(zzfqwVar.zzm());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        com.google.android.gms.ads.internal.util.zze.zza("loadNewJavascriptEngine (success): Lock released");
    }
}
