package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzeac extends zzeai {
    private zzbug zzh;

    zzeac(Context context, ScheduledExecutorService scheduledExecutorService) {
        this.zze = context;
        this.zzf = com.google.android.gms.ads.internal.zzu.zzt().zzb();
        this.zzg = scheduledExecutorService;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks
    public final synchronized void onConnected(Bundle bundle) {
        if (this.zzc) {
            return;
        }
        this.zzc = true;
        try {
            try {
                this.zzd.zzp().zze(this.zzh, new zzeah(this));
            } catch (RemoteException unused) {
                this.zza.zzd(new zzdyp(1));
            }
        } catch (Throwable th) {
            com.google.android.gms.ads.internal.zzu.zzo().zzw(th, "RemoteAdsServiceProxyClientTask.onConnected");
            this.zza.zzd(th);
        }
    }

    public final synchronized ListenableFuture zza(zzbug zzbugVar, long j) {
        if (this.zzb) {
            return zzgcj.zzo(this.zza, j, TimeUnit.MILLISECONDS, this.zzg);
        }
        this.zzb = true;
        this.zzh = zzbugVar;
        zzb();
        ListenableFuture zzo = zzgcj.zzo(this.zza, j, TimeUnit.MILLISECONDS, this.zzg);
        zzo.addListener(new Runnable() { // from class: com.google.android.gms.internal.ads.zzeab
            @Override // java.lang.Runnable
            public final void run() {
                zzeac.this.zzc();
            }
        }, zzbzo.zzf);
        return zzo;
    }
}
