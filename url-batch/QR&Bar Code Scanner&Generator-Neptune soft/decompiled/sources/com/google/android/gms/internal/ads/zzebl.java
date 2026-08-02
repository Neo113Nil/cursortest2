package com.google.android.gms.internal.ads;

import android.os.Binder;
import java.io.InputStream;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
public final class zzebl {
    private final zzfzq zza;
    private final zzfzq zzb;
    private final zzecs zzc;
    private final zzgxc zzd;

    public zzebl(zzfzq zzfzqVar, zzfzq zzfzqVar2, zzecs zzecsVar, zzgxc zzgxcVar) {
        this.zza = zzfzqVar;
        this.zzb = zzfzqVar2;
        this.zzc = zzecsVar;
        this.zzd = zzgxcVar;
    }

    final /* synthetic */ zzfzp zza(zzcbc zzcbcVar, int i, zzedj zzedjVar) throws Exception {
        return ((zzeek) this.zzd.zzb()).zzc(zzcbcVar, i);
    }

    public final zzfzp zzb(final zzcbc zzcbcVar) {
        String str = zzcbcVar.zzd;
        com.google.android.gms.ads.internal.zzt.zzp();
        zzfzp zzh = com.google.android.gms.ads.internal.util.zzs.zzy(str) ? zzfzg.zzh(new zzedj(1)) : zzfzg.zzg(this.zza.zzb(new Callable() { // from class: com.google.android.gms.internal.ads.zzebi
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return zzebl.this.zzc(zzcbcVar);
            }
        }), ExecutionException.class, new zzfyn() { // from class: com.google.android.gms.internal.ads.zzebj
            @Override // com.google.android.gms.internal.ads.zzfyn
            public final zzfzp zza(Object obj) {
                return zzfzg.zzh(((ExecutionException) obj).getCause());
            }
        }, this.zzb);
        final int callingUid = Binder.getCallingUid();
        return zzfzg.zzg(zzh, zzedj.class, new zzfyn() { // from class: com.google.android.gms.internal.ads.zzebk
            @Override // com.google.android.gms.internal.ads.zzfyn
            public final zzfzp zza(Object obj) {
                return zzebl.this.zza(zzcbcVar, callingUid, (zzedj) obj);
            }
        }, this.zzb);
    }

    /* JADX WARN: Multi-variable type inference failed */
    final /* synthetic */ InputStream zzc(zzcbc zzcbcVar) throws Exception {
        zzchh zzchhVar;
        final zzecs zzecsVar = this.zzc;
        synchronized (zzecsVar.zzb) {
            if (zzecsVar.zzc) {
                zzchhVar = zzecsVar.zza;
            } else {
                zzecsVar.zzc = true;
                zzecsVar.zze = zzcbcVar;
                zzecsVar.zzf.checkAvailabilityAndConnect();
                zzecsVar.zza.zzc(new Runnable() { // from class: com.google.android.gms.internal.ads.zzecr
                    @Override // java.lang.Runnable
                    public final void run() {
                        zzecs.this.zza();
                    }
                }, zzchc.zzf);
                zzchhVar = zzecsVar.zza;
            }
        }
        return (InputStream) zzchhVar.get(((Integer) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbjc.zzeE)).intValue(), TimeUnit.SECONDS);
    }
}
