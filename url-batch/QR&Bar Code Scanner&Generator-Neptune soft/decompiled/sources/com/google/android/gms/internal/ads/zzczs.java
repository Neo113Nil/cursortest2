package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
public final class zzczs {
    private final Executor zza;
    private final ScheduledExecutorService zzb;
    private final zzfzp zzc;
    private volatile boolean zzd = true;

    public zzczs(Executor executor, ScheduledExecutorService scheduledExecutorService, zzfzp zzfzpVar) {
        this.zza = executor;
        this.zzb = scheduledExecutorService;
        this.zzc = zzfzpVar;
    }

    static /* bridge */ /* synthetic */ void zzb(final zzczs zzczsVar, List list, final zzfzc zzfzcVar) {
        if (list == null || list.isEmpty()) {
            zzczsVar.zza.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzczm
                @Override // java.lang.Runnable
                public final void run() {
                    zzfzc.this.zza(new zzebh(3));
                }
            });
            return;
        }
        zzfzp zzi = zzfzg.zzi(null);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            final zzfzp zzfzpVar = (zzfzp) it.next();
            zzi = zzfzg.zzn(zzfzg.zzg(zzi, Throwable.class, new zzfyn() { // from class: com.google.android.gms.internal.ads.zzczn
                @Override // com.google.android.gms.internal.ads.zzfyn
                public final zzfzp zza(Object obj) {
                    zzfzc.this.zza((Throwable) obj);
                    return zzfzg.zzi(null);
                }
            }, zzczsVar.zza), new zzfyn() { // from class: com.google.android.gms.internal.ads.zzczo
                @Override // com.google.android.gms.internal.ads.zzfyn
                public final zzfzp zza(Object obj) {
                    return zzczs.this.zza(zzfzcVar, zzfzpVar, (zzcze) obj);
                }
            }, zzczsVar.zza);
        }
        zzfzg.zzr(zzi, new zzczr(zzczsVar, zzfzcVar), zzczsVar.zza);
    }

    final /* synthetic */ zzfzp zza(zzfzc zzfzcVar, zzfzp zzfzpVar, zzcze zzczeVar) throws Exception {
        if (zzczeVar != null) {
            zzfzcVar.zzb(zzczeVar);
        }
        return zzfzg.zzo(zzfzpVar, ((Long) zzble.zzb.zze()).longValue(), TimeUnit.MILLISECONDS, this.zzb);
    }

    final /* synthetic */ void zzd() {
        this.zzd = false;
    }

    public final void zze(zzfzc zzfzcVar) {
        zzfzg.zzr(this.zzc, new zzczq(this, zzfzcVar), this.zza);
    }

    public final boolean zzf() {
        return this.zzd;
    }
}
