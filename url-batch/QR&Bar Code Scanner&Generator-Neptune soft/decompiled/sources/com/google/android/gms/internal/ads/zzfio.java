package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
public final class zzfio {
    private final Executor zza;
    private final zzcgu zzb;

    public zzfio(Executor executor, zzcgu zzcguVar) {
        this.zza = executor;
        this.zzb = zzcguVar;
    }

    final /* synthetic */ void zza(String str) {
        this.zzb.zza(str);
    }

    public final void zzb(final String str) {
        this.zza.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzfin
            @Override // java.lang.Runnable
            public final void run() {
                zzfio.this.zza(str);
            }
        });
    }
}
