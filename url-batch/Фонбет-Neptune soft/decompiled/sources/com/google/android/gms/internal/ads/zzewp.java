package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzewp implements zzevn {
    private final AdvertisingIdClient.Info zza;
    private final String zzb;
    private final zzfry zzc;

    public zzewp(AdvertisingIdClient.Info info, String str, zzfry zzfryVar) {
        this.zza = info;
        this.zzb = str;
        this.zzc = zzfryVar;
    }

    @Override // com.google.android.gms.internal.ads.zzevn
    public final /* bridge */ /* synthetic */ void zzj(Object obj) {
        try {
            JSONObject zzg = com.google.android.gms.ads.internal.util.zzbs.zzg((JSONObject) obj, "pii");
            AdvertisingIdClient.Info info = this.zza;
            if (info == null || TextUtils.isEmpty(info.getId())) {
                String str = this.zzb;
                if (str != null) {
                    zzg.put("pdid", str);
                    zzg.put("pdidtype", "ssaid");
                    return;
                }
                return;
            }
            zzg.put("rdid", this.zza.getId());
            zzg.put("is_lat", this.zza.isLimitAdTrackingEnabled());
            zzg.put("idtype", "adid");
            zzfry zzfryVar = this.zzc;
            if (zzfryVar.zzc()) {
                zzg.put("paidv1_id_android_3p", zzfryVar.zzb());
                zzg.put("paidv1_creation_time_android_3p", this.zzc.zza());
            }
        } catch (JSONException e) {
            com.google.android.gms.ads.internal.util.zze.zzb("Failed putting Ad ID.", e);
        }
    }
}
