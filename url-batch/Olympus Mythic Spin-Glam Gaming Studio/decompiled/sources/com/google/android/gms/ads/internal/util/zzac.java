package com.google.android.gms.ads.internal.util;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.google.android.gms.internal.ads.zzbjg;
import com.google.android.gms.internal.ads.zzgdn;
import com.google.android.gms.internal.ads.zzgdo;
import com.google.android.gms.internal.ads.zzgdp;
import com.google.android.gms.internal.ads.zzgty;
import com.google.android.gms.internal.ads.zzguz;
import java.io.IOException;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes4.dex */
public final class zzac {
    public static void zza(Context context) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzhn)).booleanValue() && context != null) {
            context.deleteDatabase("OfflineUpload.db");
        }
        try {
            zzgdn zzh = zzgdn.zzh(context);
            zzgdo zzh2 = zzgdo.zzh(context);
            zzgdp zza = zzgdp.zza(context);
            zzh.zzk();
            zzh.zzl();
            zzh2.zzj();
            zza.zzb(null);
        } catch (IOException e) {
            com.google.android.gms.ads.internal.zzt.zzh().zzh(e, "clearStorageOnIdlessMode");
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:5:0x001c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    @NonNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Bundle zzb(Context context, String str) {
        JSONArray jSONArray;
        Object obj;
        SharedPreferences sharedPreferences;
        String str2;
        if (!TextUtils.isEmpty(str)) {
            try {
                jSONArray = new JSONArray(str);
            } catch (JSONException e) {
                int i = zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zze("JSON parsing error", e);
            }
            if (jSONArray != null) {
                return Bundle.EMPTY;
            }
            Bundle bundle = new Bundle();
            for (int i2 = 0; i2 < jSONArray.length(); i2++) {
                JSONObject optJSONObject = jSONArray.optJSONObject(i2);
                String optString = optJSONObject.optString("bk");
                String optString2 = optJSONObject.optString("sk");
                int optInt = optJSONObject.optInt("type", -1);
                int i3 = optInt != 0 ? optInt != 1 ? optInt != 2 ? 0 : 3 : 2 : 1;
                if (!TextUtils.isEmpty(optString) && !TextUtils.isEmpty(optString2) && i3 != 0) {
                    List zzg = zzguz.zza(zzgty.zzd('/')).zzg(optString2);
                    if (zzg.size() > 2 || zzg.isEmpty()) {
                        obj = null;
                    } else {
                        if (zzg.size() == 1) {
                            sharedPreferences = PreferenceManager.getDefaultSharedPreferences(context);
                            str2 = (String) zzg.get(0);
                        } else {
                            sharedPreferences = context.getSharedPreferences((String) zzg.get(0), 0);
                            str2 = (String) zzg.get(1);
                        }
                        obj = sharedPreferences.getAll().get(str2);
                    }
                    if (obj != null) {
                        int i4 = i3 - 1;
                        if (i4 != 0) {
                            if (i4 != 1) {
                                if (obj instanceof Boolean) {
                                    bundle.putBoolean(optString, ((Boolean) obj).booleanValue());
                                }
                            } else if (obj instanceof Integer) {
                                bundle.putInt(optString, ((Integer) obj).intValue());
                            } else if (obj instanceof Long) {
                                bundle.putLong(optString, ((Long) obj).longValue());
                            } else if (obj instanceof Float) {
                                bundle.putFloat(optString, ((Float) obj).floatValue());
                            }
                        } else if (obj instanceof String) {
                            bundle.putString(optString, (String) obj);
                        }
                    }
                }
            }
            return bundle;
        }
        jSONArray = null;
        if (jSONArray != null) {
        }
    }

    public static Bundle zzc(Context context, String str, SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener) {
        if (TextUtils.isEmpty(str)) {
            return Bundle.EMPTY;
        }
        PreferenceManager.getDefaultSharedPreferences(context).registerOnSharedPreferenceChangeListener(onSharedPreferenceChangeListener);
        return zzb(context, str);
    }
}
