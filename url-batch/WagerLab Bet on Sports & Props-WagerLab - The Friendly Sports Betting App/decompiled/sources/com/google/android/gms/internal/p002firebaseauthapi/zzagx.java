package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.logging.Logger;
import com.google.firebase.auth.ActionCodeUrl;
import com.google.firebase.auth.EmailAuthCredential;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.firebase:firebase-auth@@24.0.1 */
/* loaded from: classes5.dex */
public class zzagx implements zzafa {
    private static final String zza = "zzagx";
    private final String zzb;
    private final String zzc;
    private final EmailAuthCredential zzd;
    private final String zze;
    private final String zzf;

    public final EmailAuthCredential zzb() {
        return this.zzd;
    }

    public final String zzc() {
        return this.zzf;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzafa
    public final String zza() throws JSONException {
        ActionCodeUrl parseLink = ActionCodeUrl.parseLink(this.zzc);
        String code = parseLink != null ? parseLink.getCode() : null;
        String zza2 = parseLink != null ? parseLink.zza() : null;
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("email", this.zzb);
        if (code != null) {
            jSONObject.put("oobCode", code);
        }
        if (zza2 != null) {
            jSONObject.put("tenantId", zza2);
        }
        String str = this.zze;
        if (str != null) {
            jSONObject.put("idToken", str);
        }
        String str2 = this.zzf;
        if (str2 != null) {
            zzajk.zza(jSONObject, "captchaResp", str2);
        } else {
            zzajk.zza(jSONObject);
        }
        return jSONObject.toString();
    }

    static {
        new Logger(zza, new String[0]);
    }

    public zzagx(EmailAuthCredential emailAuthCredential, String str, String str2) {
        this.zzd = (EmailAuthCredential) Preconditions.checkNotNull(emailAuthCredential);
        this.zzb = Preconditions.checkNotEmpty(emailAuthCredential.zzc());
        this.zzc = Preconditions.checkNotEmpty(emailAuthCredential.zze());
        this.zze = str;
        this.zzf = str2;
    }
}
