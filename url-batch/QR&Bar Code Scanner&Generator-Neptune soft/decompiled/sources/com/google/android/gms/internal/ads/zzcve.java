package com.google.android.gms.internal.ads;

import java.util.Map;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
final class zzcve implements zzbpu {
    final /* synthetic */ zzcvf zza;

    zzcve(zzcvf zzcvfVar) {
        this.zza = zzcvfVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbpu
    public final void zza(Object obj, Map map) {
        Executor executor;
        if (zzcvf.zzg(this.zza, map)) {
            executor = this.zza.zzc;
            executor.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcvd
                @Override // java.lang.Runnable
                public final void run() {
                    zzcvk zzcvkVar;
                    zzcvkVar = zzcve.this.zza.zzd;
                    zzcvkVar.zzj();
                }
            });
        }
    }
}
