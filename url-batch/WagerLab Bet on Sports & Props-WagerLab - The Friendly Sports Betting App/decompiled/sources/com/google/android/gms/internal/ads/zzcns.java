package com.google.android.gms.internal.ads;

import androidx.media3.exoplayer.upstream.CmcdData;
import com.google.firebase.analytics.FirebaseAnalytics;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
/* loaded from: classes5.dex */
public final class zzcns {
    private final zzdsm zza;
    private final zzfcu zzb;

    zzcns(zzdsm zzdsmVar, zzfcu zzfcuVar) {
        this.zza = zzdsmVar;
        this.zzb = zzfcuVar;
    }

    public final void zza(long j, int i) {
        zzdsl zza = this.zza.zza();
        zza.zza(this.zzb.zzb.zzb);
        zza.zzc("action", "ad_closed");
        zza.zzc("show_time", String.valueOf(j));
        zza.zzc(FirebaseAnalytics.Param.AD_FORMAT, "app_open_ad");
        int i2 = i - 1;
        zza.zzc("acr", i2 != 0 ? i2 != 1 ? i2 != 2 ? i2 != 3 ? i2 != 4 ? "u" : "ac" : "cb" : "cc" : "bb" : CmcdData.STREAMING_FORMAT_HLS);
        zza.zzd();
    }
}
