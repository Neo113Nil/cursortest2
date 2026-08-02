package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
public final class zzeiv implements zzehc {
    private final zzcxz zza;
    private final zzeic zzb;
    private final zzfzq zzc;
    private final zzddc zzd;
    private final ScheduledExecutorService zze;

    public zzeiv(zzcxz zzcxzVar, zzeic zzeicVar, zzddc zzddcVar, ScheduledExecutorService scheduledExecutorService, zzfzq zzfzqVar) {
        this.zza = zzcxzVar;
        this.zzb = zzeicVar;
        this.zzd = zzddcVar;
        this.zze = scheduledExecutorService;
        this.zzc = zzfzqVar;
    }

    @Override // com.google.android.gms.internal.ads.zzehc
    public final zzfzp zza(final zzfdw zzfdwVar, final zzfdk zzfdkVar) {
        return this.zzc.zzb(new Callable() { // from class: com.google.android.gms.internal.ads.zzeis
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return zzeiv.this.zzc(zzfdwVar, zzfdkVar);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzehc
    public final boolean zzb(zzfdw zzfdwVar, zzfdk zzfdkVar) {
        return zzfdwVar.zza.zza.zza() != null && this.zzb.zzb(zzfdwVar, zzfdkVar);
    }

    final /* synthetic */ zzcxc zzc(final zzfdw zzfdwVar, final zzfdk zzfdkVar) throws Exception {
        return this.zza.zzb(new zzczt(zzfdwVar, zzfdkVar, null), new zzcym(zzfdwVar.zza.zza.zza(), new Runnable() { // from class: com.google.android.gms.internal.ads.zzeit
            @Override // java.lang.Runnable
            public final void run() {
                zzeiv.this.zzf(zzfdwVar, zzfdkVar);
            }
        })).zza();
    }

    final /* synthetic */ void zzf(zzfdw zzfdwVar, zzfdk zzfdkVar) {
        zzfzg.zzr(zzfzg.zzo(this.zzb.zza(zzfdwVar, zzfdkVar), zzfdkVar.zzS, TimeUnit.SECONDS, this.zze), new zzeiu(this), this.zzc);
    }
}
