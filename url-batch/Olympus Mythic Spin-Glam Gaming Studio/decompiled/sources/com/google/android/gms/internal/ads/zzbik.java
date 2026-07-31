package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import androidx.annotation.VisibleForTesting;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.concurrent.ExecutorService;

/* compiled from: com.google.android.gms:play-services-ads-api@@25.4.0 */
/* loaded from: classes13.dex */
public final class zzbik {

    @VisibleForTesting
    zzbfc zza;

    @VisibleForTesting
    boolean zzb;
    private final ExecutorService zzc;

    public zzbik() {
        this.zzc = com.google.android.gms.ads.internal.util.client.zzb.zzb;
    }

    final /* synthetic */ ExecutorService zza() {
        return this.zzc;
    }

    public zzbik(final Context context) {
        ExecutorService executorService = com.google.android.gms.ads.internal.util.client.zzb.zzb;
        this.zzc = executorService;
        executorService.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzbig
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                boolean booleanValue = ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzgk)).booleanValue();
                Context context2 = context;
                zzbik zzbikVar = zzbik.this;
                if (booleanValue) {
                    try {
                        zzbikVar.zza = (zzbfc) com.google.android.gms.ads.internal.util.client.zzs.zza(context2, "com.google.android.gms.ads.clearcut.DynamiteClearcutLogger", zzbih.zza);
                        zzbikVar.zza.zze(ObjectWrapper.wrap(context2), "GMA_SDK");
                        zzbikVar.zzb = true;
                    } catch (RemoteException | com.google.android.gms.ads.internal.util.client.zzr | NullPointerException unused) {
                        com.google.android.gms.ads.internal.util.client.zzo.zzd("Cannot dynamite load clearcut");
                    }
                }
            }
        });
    }
}
