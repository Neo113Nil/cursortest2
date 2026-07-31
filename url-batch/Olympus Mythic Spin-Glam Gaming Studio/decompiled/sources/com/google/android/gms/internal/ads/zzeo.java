package com.google.android.gms.internal.ads;

import java.lang.ref.WeakReference;
import java.util.Objects;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes14.dex */
final class zzeo {
    final /* synthetic */ zzes zza;
    private final WeakReference zzb;
    private final Executor zzc;

    public zzeo(zzes zzesVar, zzem zzemVar, Executor executor) {
        Objects.requireNonNull(zzesVar);
        this.zza = zzesVar;
        this.zzb = new WeakReference(zzemVar);
        this.zzc = executor;
    }

    public final boolean zza() {
        return this.zzb.get() == null;
    }

    public final void zzb() {
        this.zzc.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzen
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                zzeo.this.zzc();
            }
        });
    }

    final /* synthetic */ void zzc() {
        zzem zzemVar = (zzem) this.zzb.get();
        if (zzemVar != null) {
            zzemVar.zza(this.zza.zzc());
        }
    }
}
