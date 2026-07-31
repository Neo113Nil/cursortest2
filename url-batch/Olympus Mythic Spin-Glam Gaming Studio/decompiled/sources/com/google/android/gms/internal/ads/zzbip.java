package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.SharedPreferences;
import androidx.annotation.Nullable;
import com.applovin.impl.sdk.utils.JsonUtils;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads-api@@25.4.0 */
/* loaded from: classes13.dex */
public final class zzbip implements SharedPreferences.OnSharedPreferenceChangeListener {
    private final Object zza = new Object();

    @Nullable
    private SharedPreferences zzb = null;
    private JSONObject zzc = new JSONObject();

    private final void zzg(@Nullable final SharedPreferences sharedPreferences) {
        if (sharedPreferences != null) {
            try {
                this.zzc = new JSONObject((String) zzbji.zza(new zzgvc() { // from class: com.google.android.gms.internal.ads.zzbio
                    @Override // com.google.android.gms.internal.ads.zzgvc
                    public final /* synthetic */ Object zza() {
                        return sharedPreferences.getString("flag_configuration", JsonUtils.EMPTY_JSON);
                    }
                }));
            } catch (JSONException unused) {
            }
        }
    }

    @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
    public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences, @Nullable String str) {
        if ("flag_configuration".equals(str)) {
            zzg(sharedPreferences);
        }
    }

    public final void zza(Context context) {
        SharedPreferences sharedPreferences;
        synchronized (this.zza) {
            try {
                if (this.zzb != null) {
                    return;
                }
                if (context.getApplicationContext() != null) {
                    context = context.getApplicationContext();
                }
                com.google.android.gms.ads.internal.client.zzba.zza();
                SharedPreferences zza = zzbiz.zza(context);
                this.zzb = zza;
                zzg(zza);
                if (!((Boolean) zzblh.zzb.zze()).booleanValue() && (sharedPreferences = this.zzb) != null) {
                    sharedPreferences.registerOnSharedPreferenceChangeListener(this);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final String zzb(String str, String str2) {
        return !str.startsWith("adapter:") ? str2 : this.zzc.optString(str, str2);
    }

    public final long zzc(String str, long j) {
        return !str.startsWith("adapter:") ? j : this.zzc.optLong(str, j);
    }

    public final int zzd(String str, int i) {
        return !str.startsWith("adapter:") ? i : this.zzc.optInt(str, i);
    }

    public final float zze(String str, float f) {
        return !str.startsWith("adapter:") ? f : (float) this.zzc.optDouble(str, f);
    }

    public final boolean zzf(String str, boolean z) {
        return !str.startsWith("adapter:") ? z : this.zzc.optBoolean(str, z);
    }
}
