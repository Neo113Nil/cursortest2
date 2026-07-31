package com.google.android.gms.internal.p002firebaseauthapi;

import android.text.TextUtils;
import androidx.autofill.HintConstants;
import com.google.android.gms.common.internal.Preconditions;
import io.invertase.firebase.functions.UniversalFirebaseFunctionsModule;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.firebase:firebase-auth@@24.0.1 */
/* loaded from: classes5.dex */
public final class zzajg implements zzafa {
    private String zza;
    private String zzb;
    private String zzc;
    private String zzd;
    private String zze;
    private boolean zzf;

    public static zzajg zza(String str, String str2, boolean z) {
        zzajg zzajgVar = new zzajg();
        zzajgVar.zzb = Preconditions.checkNotEmpty(str);
        zzajgVar.zzc = Preconditions.checkNotEmpty(str2);
        zzajgVar.zzf = z;
        return zzajgVar;
    }

    public static zzajg zzb(String str, String str2, boolean z) {
        zzajg zzajgVar = new zzajg();
        zzajgVar.zza = Preconditions.checkNotEmpty(str);
        zzajgVar.zzd = Preconditions.checkNotEmpty(str2);
        zzajgVar.zzf = z;
        return zzajgVar;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzafa
    public final String zza() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        if (!TextUtils.isEmpty(this.zzd)) {
            jSONObject.put(HintConstants.AUTOFILL_HINT_PHONE_NUMBER, this.zza);
            jSONObject.put("temporaryProof", this.zzd);
        } else {
            jSONObject.put("sessionInfo", this.zzb);
            jSONObject.put(UniversalFirebaseFunctionsModule.CODE_KEY, this.zzc);
        }
        String str = this.zze;
        if (str != null) {
            jSONObject.put("idToken", str);
        }
        if (!this.zzf) {
            jSONObject.put("operation", 2);
        }
        return jSONObject.toString();
    }

    private zzajg() {
    }

    public final void zza(String str) {
        this.zze = str;
    }
}
