package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes15.dex */
public final class zzfei implements zzfdg {

    @Nullable
    private final AdvertisingIdClient.Info zza;

    @Nullable
    private final String zzb;
    private final zzgdj zzc;

    public zzfei(@Nullable AdvertisingIdClient.Info info, @Nullable String str, zzgdj zzgdjVar) {
        this.zza = info;
        this.zzb = str;
        this.zzc = zzgdjVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfdg
    public final /* bridge */ /* synthetic */ void zza(Object obj) {
        try {
            JSONObject zzh = com.google.android.gms.ads.internal.util.zzbp.zzh((JSONObject) obj, "pii");
            AdvertisingIdClient.Info info = this.zza;
            if (info == null || TextUtils.isEmpty(info.getId())) {
                String str = this.zzb;
                if (str != null) {
                    zzh.put("pdid", str);
                    zzh.put("pdidtype", "ssaid");
                    return;
                }
                return;
            }
            zzh.put("rdid", info.getId());
            zzh.put("is_lat", info.isLimitAdTrackingEnabled());
            zzh.put("idtype", "adid");
            zzgdj zzgdjVar = this.zzc;
            if (zzgdjVar.zzc()) {
                zzh.put("paidv1_id_android_3p", zzgdjVar.zza());
                zzh.put("paidv1_creation_time_android_3p", zzgdjVar.zzb());
            }
        } catch (JSONException e) {
            com.google.android.gms.ads.internal.util.zze.zzb("Failed putting Ad ID.", e);
        }
    }
}
