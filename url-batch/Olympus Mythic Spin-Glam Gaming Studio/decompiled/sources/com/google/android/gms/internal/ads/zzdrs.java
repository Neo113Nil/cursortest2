package com.google.android.gms.internal.ads;

import android.view.View;
import androidx.annotation.Nullable;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes5.dex */
public final class zzdrs {
    private final zzeaj zza;

    zzdrs(zzeaj zzeajVar) {
        this.zza = zzeajVar;
    }

    public final void zza(@Nullable View view, zzfld zzfldVar) {
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzoK)).booleanValue() || view == null) {
            return;
        }
        String str = true != com.google.android.gms.ads.internal.util.zzab.zza(view) ? "0" : "1";
        zzeai zza = this.zza.zza();
        zza.zzc("action", "hcp");
        zza.zzc("hcp", str);
        zza.zzb(zzfldVar);
        zza.zzd();
    }
}
