package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.Intent;
import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes11.dex */
public final class zzfat implements zzfdi {
    private final Context zza;
    private final Intent zzb;

    zzfat(Context context, Intent intent) {
        this.zza = context;
        this.zzb = intent;
    }

    @Override // com.google.android.gms.internal.ads.zzfdi
    public final ListenableFuture zza() {
        com.google.android.gms.ads.internal.util.zze.zza("HsdpMigrationSignal.produce");
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzoy)).booleanValue()) {
            return zzhcy.zza(new zzfau(null));
        }
        boolean z = false;
        try {
            if (this.zzb.resolveActivity(this.zza.getPackageManager()) != null) {
                com.google.android.gms.ads.internal.util.zze.zza("HSDP intent is supported");
                z = true;
            }
        } catch (Exception e) {
            com.google.android.gms.ads.internal.zzt.zzh().zzh(e, "HsdpMigrationSignal.isHsdpMigrationSupported");
        }
        return zzhcy.zza(new zzfau(Boolean.valueOf(z)));
    }

    @Override // com.google.android.gms.internal.ads.zzfdi
    public final int zzb() {
        return 60;
    }
}
