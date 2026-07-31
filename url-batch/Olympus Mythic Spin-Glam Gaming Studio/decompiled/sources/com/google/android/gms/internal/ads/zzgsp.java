package com.google.android.gms.internal.ads;

import android.os.Bundle;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes5.dex */
final class zzgsp extends zzgrn {
    final /* synthetic */ zzgsr zza;
    private final zzgsw zzb;

    zzgsp(zzgsr zzgsrVar, zzgsw zzgswVar) {
        Objects.requireNonNull(zzgsrVar);
        this.zza = zzgsrVar;
        this.zzb = zzgswVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgro
    public final void zza(Bundle bundle) {
        int i = bundle.getInt("statusCode", 8150);
        String string = bundle.getString("sessionToken");
        int i2 = bundle.getInt("uiMode", 0);
        zzgsu zze = zzgsv.zze();
        zze.zza(i);
        if (string != null) {
            zze.zzb(string);
        }
        zze.zzc(i2);
        if (bundle.containsKey("userInteracted")) {
            zze.zzd(Boolean.valueOf(bundle.getBoolean("userInteracted")));
        }
        this.zzb.zza(zze.zze());
        if (i == 8157) {
            this.zza.zzd();
        }
    }
}
