package com.google.android.gms.internal.ads;

import android.os.Binder;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
public final class zzecf {
    private final ScheduledExecutorService zza;
    private final zzfzq zzb;
    private final zzecw zzc;
    private final zzgxc zzd;

    public zzecf(ScheduledExecutorService scheduledExecutorService, zzfzq zzfzqVar, zzecw zzecwVar, zzgxc zzgxcVar) {
        this.zza = scheduledExecutorService;
        this.zzb = zzfzqVar;
        this.zzc = zzecwVar;
        this.zzd = zzgxcVar;
    }

    final /* synthetic */ zzfzp zza(zzcbc zzcbcVar, int i, Throwable th) throws Exception {
        return ((zzeek) this.zzd.zzb()).zzd(zzcbcVar, i);
    }

    public final zzfzp zzb(final zzcbc zzcbcVar) {
        zzfzp zzfzpVar;
        String str = zzcbcVar.zzd;
        com.google.android.gms.ads.internal.zzt.zzp();
        if (com.google.android.gms.ads.internal.util.zzs.zzy(str)) {
            zzfzpVar = zzfzg.zzh(new zzedj(1));
        } else {
            final zzecw zzecwVar = this.zzc;
            synchronized (zzecwVar.zzb) {
                if (zzecwVar.zzc) {
                    zzfzpVar = zzecwVar.zza;
                } else {
                    zzecwVar.zzc = true;
                    zzecwVar.zze = zzcbcVar;
                    zzecwVar.zzf.checkAvailabilityAndConnect();
                    zzecwVar.zza.zzc(new Runnable() { // from class: com.google.android.gms.internal.ads.zzecv
                        @Override // java.lang.Runnable
                        public final void run() {
                            zzecw.this.zza();
                        }
                    }, zzchc.zzf);
                    zzfzpVar = zzecwVar.zza;
                }
            }
        }
        final int callingUid = Binder.getCallingUid();
        return zzfzg.zzg((zzfyx) zzfzg.zzo(zzfyx.zzv(zzfzpVar), ((Integer) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbjc.zzeE)).intValue(), TimeUnit.SECONDS, this.zza), Throwable.class, new zzfyn() { // from class: com.google.android.gms.internal.ads.zzece
            @Override // com.google.android.gms.internal.ads.zzfyn
            public final zzfzp zza(Object obj) {
                return zzecf.this.zza(zzcbcVar, callingUid, (Throwable) obj);
            }
        }, this.zzb);
    }
}
