package com.google.android.gms.internal.ads;

import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
@Deprecated
/* loaded from: classes2.dex */
public class zzcho {
    private final zzchh zza;
    private final AtomicInteger zzb;

    public zzcho() {
        zzchh zzchhVar = new zzchh();
        this.zza = zzchhVar;
        this.zzb = new AtomicInteger(0);
        zzfzg.zzr(zzchhVar, new zzchm(this), zzchc.zzf);
    }

    @Deprecated
    public final int zze() {
        return this.zzb.get();
    }

    @Deprecated
    public final void zzg() {
        this.zza.zze(new Exception());
    }

    @Deprecated
    public final void zzh(Object obj) {
        this.zza.zzd(obj);
    }

    @Deprecated
    public final void zzi(zzchl zzchlVar, zzchj zzchjVar) {
        zzfzg.zzr(this.zza, new zzchn(this, zzchlVar, zzchjVar), zzchc.zzf);
    }
}
