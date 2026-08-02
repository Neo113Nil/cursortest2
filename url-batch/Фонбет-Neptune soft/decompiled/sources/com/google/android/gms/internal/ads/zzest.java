package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.Intent;
import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzest implements zzevo {
    private final Context zza;
    private final Intent zzb;

    zzest(Context context, Intent intent) {
        this.zza = context;
        this.zzb = intent;
    }

    @Override // com.google.android.gms.internal.ads.zzevo
    public final int zza() {
        return 60;
    }

    @Override // com.google.android.gms.internal.ads.zzevo
    public final ListenableFuture zzb() {
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbbw.zzlQ)).booleanValue()) {
            return zzgcj.zzh(new zzesu(null));
        }
        boolean z = false;
        try {
            if (this.zzb.resolveActivity(this.zza.getPackageManager()) != null) {
                z = true;
            }
        } catch (Exception e) {
            com.google.android.gms.ads.internal.zzu.zzo().zzw(e, "HsdpMigrationSignal.isHsdpMigrationSupported");
        }
        return zzgcj.zzh(new zzesu(Boolean.valueOf(z)));
    }
}
