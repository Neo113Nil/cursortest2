package com.google.android.gms.internal.ads;

import android.view.View;
import com.facebook.appevents.AppEventsConstants;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
/* loaded from: classes5.dex */
public final class zzdjv {
    private final zzdsm zza;

    zzdjv(zzdsm zzdsmVar) {
        this.zza = zzdsmVar;
    }

    public final void zza(View view, zzfcj zzfcjVar) {
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zznK)).booleanValue() || view == null) {
            return;
        }
        String str = true != com.google.android.gms.ads.internal.util.zzab.zza(view) ? AppEventsConstants.EVENT_PARAM_VALUE_NO : "1";
        zzdsl zza = this.zza.zza();
        zza.zzc("action", "hcp");
        zza.zzc("hcp", str);
        zza.zzb(zzfcjVar);
        zza.zzd();
    }
}
