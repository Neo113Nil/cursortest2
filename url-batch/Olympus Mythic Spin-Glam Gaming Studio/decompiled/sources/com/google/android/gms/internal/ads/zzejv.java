package com.google.android.gms.internal.ads;

import android.database.sqlite.SQLiteDatabase;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes12.dex */
final class zzejv implements zzhcv {
    final /* synthetic */ zzfpi zza;

    zzejv(zzejx zzejxVar, zzfpi zzfpiVar) {
        this.zza = zzfpiVar;
        Objects.requireNonNull(zzejxVar);
    }

    @Override // com.google.android.gms.internal.ads.zzhcv
    public final void zza(Throwable th) {
        String valueOf = String.valueOf(th.getMessage());
        int i = com.google.android.gms.ads.internal.util.zze.zza;
        com.google.android.gms.ads.internal.util.client.zzo.zzf("Failed to get offline signal database: ".concat(valueOf));
    }

    @Override // com.google.android.gms.internal.ads.zzhcv
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        try {
            this.zza.zza((SQLiteDatabase) obj);
        } catch (Exception e) {
            String valueOf = String.valueOf(e.getMessage());
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzf("Error executing function on offline signal database: ".concat(valueOf));
        }
    }
}
