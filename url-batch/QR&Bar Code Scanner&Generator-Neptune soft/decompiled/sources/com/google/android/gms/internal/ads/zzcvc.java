package com.google.android.gms.internal.ads;

import java.util.Map;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
final class zzcvc implements zzbpu {
    final /* synthetic */ zzcvf zza;

    zzcvc(zzcvf zzcvfVar) {
        this.zza = zzcvfVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbpu
    public final void zza(Object obj, Map map) {
        Executor executor;
        if (zzcvf.zzg(this.zza, map)) {
            executor = this.zza.zzc;
            executor.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcvb
                @Override // java.lang.Runnable
                public final void run() {
                    zzcvk zzcvkVar;
                    zzcvkVar = zzcvc.this.zza.zzd;
                    zzcvkVar.zzg();
                }
            });
        }
    }
}
