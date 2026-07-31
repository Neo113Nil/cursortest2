package com.google.android.gms.internal.ads;

import android.util.JsonReader;
import androidx.annotation.Nullable;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.io.IOException;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes3.dex */
public final class zzfli {

    @Nullable
    public final String zza;

    @Nullable
    public final String zzb;
    public final JSONObject zzc;
    public final JSONObject zzd;

    zzfli(JsonReader jsonReader) throws IllegalStateException, IOException, JSONException, NumberFormatException {
        JSONObject zzd = com.google.android.gms.ads.internal.util.zzbp.zzd(jsonReader);
        this.zzd = zzd;
        this.zza = zzd.optString(CampaignEx.JSON_KEY_AD_HTML, null);
        this.zzb = zzd.optString("ad_base_url", null);
        this.zzc = zzd.optJSONObject("ad_json");
    }
}
