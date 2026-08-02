package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.concurrent.ExecutorService;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.3.0 */
/* loaded from: classes2.dex */
public final class zzbev {
    zzase zza;
    boolean zzb;
    private final ExecutorService zzc;

    public zzbev() {
        this.zzc = zzcge.zzb;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: zzc, reason: merged with bridge method [inline-methods] */
    public final void zzb(Context context) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbjc.zzea)).booleanValue()) {
            try {
                this.zza = (zzase) zzcgt.zzb(context, "com.google.android.gms.ads.clearcut.DynamiteClearcutLogger", new zzcgr() { // from class: com.google.android.gms.internal.ads.zzber
                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // com.google.android.gms.internal.ads.zzcgr
                    public final Object zza(Object obj) {
                        return zzasd.zzb(obj);
                    }
                });
                this.zza.zze(ObjectWrapper.wrap(context), "GMA_SDK");
                this.zzb = true;
            } catch (RemoteException | zzcgs | NullPointerException unused) {
                zzcgp.zze("Cannot dynamite load clearcut");
            }
        }
    }

    public zzbev(final Context context) {
        ExecutorService executorService = zzcge.zzb;
        this.zzc = executorService;
        zzbjc.zzc(context);
        if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbjc.zziG)).booleanValue()) {
            executorService.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzbeq
                @Override // java.lang.Runnable
                public final void run() {
                    zzbev.this.zzb(context);
                }
            });
        } else {
            zzb(context);
        }
    }
}
