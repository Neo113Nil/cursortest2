package com.google.firebase.auth;

import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.internal.p002firebaseauthapi.zzacq;
import com.google.android.gms.tasks.Task;
import com.google.firebase.FirebaseApp;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.internal.zzbo;
import java.util.Objects;

/* compiled from: com.google.firebase:firebase-auth@@24.0.1 */
/* loaded from: classes6.dex */
final class zzn extends zzbo<AuthResult> {
    private final /* synthetic */ String zza;
    private final /* synthetic */ String zzb;
    private final /* synthetic */ FirebaseAuth zzc;

    @Override // com.google.firebase.auth.internal.zzbo
    public final Task<AuthResult> zza(String str) {
        FirebaseApp firebaseApp;
        String str2;
        if (TextUtils.isEmpty(str)) {
            Log.i("FirebaseAuth", "Creating user with " + this.zza + " with empty reCAPTCHA token");
        } else {
            Log.i("FirebaseAuth", "Got reCAPTCHA token for sign up with email " + this.zza);
        }
        zzacq zzacqVar = this.zzc.zzd;
        firebaseApp = this.zzc.zzf;
        String str3 = this.zza;
        String str4 = this.zzb;
        str2 = this.zzc.zzl;
        return zzacqVar.zza(firebaseApp, str3, str4, str2, str, new FirebaseAuth.zza(this.zzc));
    }

    zzn(FirebaseAuth firebaseAuth, String str, String str2) {
        this.zza = str;
        this.zzb = str2;
        Objects.requireNonNull(firebaseAuth);
        this.zzc = firebaseAuth;
    }
}
