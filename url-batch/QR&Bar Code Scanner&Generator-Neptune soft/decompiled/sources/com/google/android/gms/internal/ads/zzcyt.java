package com.google.android.gms.internal.ads;

import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
public final class zzcyt implements zzdeo, zzbbq {
    private final zzfdk zza;
    private final zzdds zzb;
    private final zzdex zzc;
    private final AtomicBoolean zzd = new AtomicBoolean();
    private final AtomicBoolean zze = new AtomicBoolean();

    public zzcyt(zzfdk zzfdkVar, zzdds zzddsVar, zzdex zzdexVar) {
        this.zza = zzfdkVar;
        this.zzb = zzddsVar;
        this.zzc = zzdexVar;
    }

    private final void zza() {
        if (this.zzd.compareAndSet(false, true)) {
            this.zzb.zza();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbbq
    public final void zzc(zzbbp zzbbpVar) {
        if (this.zza.zzf == 1 && zzbbpVar.zzj) {
            zza();
        }
        if (zzbbpVar.zzj && this.zze.compareAndSet(false, true)) {
            this.zzc.zza();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdeo
    public final synchronized void zzn() {
        if (this.zza.zzf != 1) {
            zza();
        }
    }
}
