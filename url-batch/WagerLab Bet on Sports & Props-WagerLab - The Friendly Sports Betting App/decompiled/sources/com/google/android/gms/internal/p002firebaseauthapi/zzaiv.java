package com.google.android.gms.internal.p002firebaseauthapi;

import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.firebase:firebase-auth@@24.0.1 */
/* loaded from: classes5.dex */
public final class zzaiv extends zzair {
    private static final String zza = "zzaiv";
    private String zzb;

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzair, com.google.android.gms.internal.p002firebaseauthapi.zzaez
    public final /* synthetic */ zzair zza(String str) throws zzacn {
        return (zzaiv) zza(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzair
    /* renamed from: zzc, reason: merged with bridge method [inline-methods] */
    public final zzaiv zza(String str) throws zzacn {
        try {
            JSONObject optJSONObject = new JSONObject(str).optJSONObject("phoneSessionInfo");
            if (optJSONObject != null) {
                this.zzb = zzac.zza(optJSONObject.optString("sessionInfo"));
            }
            return this;
        } catch (NullPointerException | JSONException e) {
            throw zzajk.zza(e, zza, str);
        }
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzair
    public final String zza() {
        return this.zzb;
    }
}
