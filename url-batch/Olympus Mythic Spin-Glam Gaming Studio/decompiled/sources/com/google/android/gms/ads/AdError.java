package com.google.android.gms.ads;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.pubmatic.sdk.common.POBCommonConstants;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads-api@@25.4.0 */
/* loaded from: classes10.dex */
public class AdError {

    @NonNull
    public static final String UNDEFINED_DOMAIN = "undefined";
    private final int zza;

    @NonNull
    private final String zzb;

    @NonNull
    private final String zzc;

    @Nullable
    private final AdError zzd;

    public AdError(int i, @NonNull String str, @NonNull String str2) {
        this(i, str, str2, null);
    }

    public AdError(int i, @NonNull String str, @NonNull String str2, @Nullable AdError adError) {
        this.zza = i;
        this.zzb = str;
        this.zzc = str2;
        this.zzd = adError;
    }

    @Nullable
    public AdError getCause() {
        return this.zzd;
    }

    public int getCode() {
        return this.zza;
    }

    @NonNull
    public String getDomain() {
        return this.zzc;
    }

    @NonNull
    public String getMessage() {
        return this.zzb;
    }

    @NonNull
    public String toString() {
        try {
            return zzb().toString(2);
        } catch (JSONException unused) {
            return "Error forming toString output.";
        }
    }

    @NonNull
    public JSONObject zzb() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("Code", this.zza);
        jSONObject.put("Message", this.zzb);
        jSONObject.put("Domain", this.zzc);
        AdError adError = this.zzd;
        if (adError == null) {
            jSONObject.put("Cause", POBCommonConstants.NULL_VALUE);
        } else {
            jSONObject.put("Cause", adError.zzb());
        }
        return jSONObject;
    }

    @NonNull
    public final com.google.android.gms.ads.internal.client.zze zza() {
        com.google.android.gms.ads.internal.client.zze zzeVar;
        AdError adError = this.zzd;
        if (adError == null) {
            zzeVar = null;
        } else {
            String str = adError.zzc;
            zzeVar = new com.google.android.gms.ads.internal.client.zze(adError.zza, adError.zzb, str, null, null);
        }
        return new com.google.android.gms.ads.internal.client.zze(this.zza, this.zzb, this.zzc, zzeVar, null);
    }
}
