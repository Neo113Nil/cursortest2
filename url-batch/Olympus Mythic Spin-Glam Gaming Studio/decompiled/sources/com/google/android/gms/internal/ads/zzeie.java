package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes13.dex */
public final class zzeie {
    private final zzcob zza;
    private final Context zzb;
    private final Executor zzc;

    zzeie(zzcob zzcobVar, Context context, Executor executor) {
        this.zza = zzcobVar;
        this.zzb = context;
        this.zzc = executor;
    }

    public final void zza() {
        this.zzc.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzeid
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                zzeie.this.zzb();
            }
        });
    }

    final /* synthetic */ void zzb() {
        zzeig zzh = this.zza.zzh();
        zzh.zzb(this.zzb);
        zzh.zza().zza().zza();
    }
}
