package com.google.android.gms.internal.ads;

import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes15.dex */
final class zzbtw implements zzcgq {
    final /* synthetic */ zzbul zza;
    final /* synthetic */ zzfqw zzb;
    final /* synthetic */ zzbum zzc;

    zzbtw(zzbum zzbumVar, zzbul zzbulVar, zzfqw zzfqwVar) {
        this.zza = zzbulVar;
        this.zzb = zzfqwVar;
        Objects.requireNonNull(zzbumVar);
        this.zzc = zzbumVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcgq
    public final void zza() {
        com.google.android.gms.ads.internal.util.zze.zza("loadNewJavascriptEngine (failure): Trying to acquire lock");
        zzbum zzbumVar = this.zzc;
        synchronized (zzbumVar.zzg()) {
            try {
                com.google.android.gms.ads.internal.util.zze.zza("loadNewJavascriptEngine (failure): Lock acquired");
                zzbumVar.zzl(1);
                com.google.android.gms.ads.internal.util.zze.zza("Failed loading new engine. Marking new engine destroyable.");
                this.zza.zzc();
                if (((Boolean) zzbla.zzd.zze()).booleanValue() && zzbumVar.zzh() != null) {
                    zzfrj zzh = zzbumVar.zzh();
                    zzfqw zzfqwVar = this.zzb;
                    zzfqwVar.zzk("Failed loading new engine");
                    zzfqwVar.zzd(false);
                    zzh.zzb(zzfqwVar.zzm());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        com.google.android.gms.ads.internal.util.zze.zza("loadNewJavascriptEngine (failure): Lock released");
    }
}
