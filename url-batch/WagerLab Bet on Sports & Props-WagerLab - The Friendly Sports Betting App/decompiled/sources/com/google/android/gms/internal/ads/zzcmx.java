package com.google.android.gms.internal.ads;

import java.util.Map;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
/* loaded from: classes5.dex */
final class zzcmx implements zzbjl {
    final /* synthetic */ zzcna zza;

    zzcmx(zzcna zzcnaVar) {
        Objects.requireNonNull(zzcnaVar);
        this.zza = zzcnaVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbjl
    public final void zza(Object obj, Map map) {
        zzcna zzcnaVar = this.zza;
        if (zzcnaVar.zze(map)) {
            zzcnaVar.zzf().execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcmw
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    zzcmx.this.zza.zzg().zzl();
                }
            });
        }
    }
}
