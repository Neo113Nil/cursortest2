package com.google.firebase.auth;

import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.internal.p002firebaseauthapi.zzacq;
import com.google.android.gms.tasks.Task;
import com.google.firebase.FirebaseApp;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.internal.zzbo;
import com.google.firebase.auth.internal.zzcf;
import java.util.Objects;

/* compiled from: com.google.firebase:firebase-auth@@24.0.1 */
/* loaded from: classes6.dex */
final class zzo extends zzbo<AuthResult> {
    private final /* synthetic */ FirebaseUser zza;
    private final /* synthetic */ EmailAuthCredential zzb;
    private final /* synthetic */ FirebaseAuth zzc;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v0, types: [com.google.firebase.auth.FirebaseAuth$zzb, com.google.firebase.auth.internal.zzcf] */
    @Override // com.google.firebase.auth.internal.zzbo
    public final Task<AuthResult> zza(String str) {
        FirebaseApp firebaseApp;
        if (TextUtils.isEmpty(str)) {
            Log.i("FirebaseAuth", "Linking email account with empty reCAPTCHA token");
        } else {
            Log.i("FirebaseAuth", "Got reCAPTCHA token for linking email account");
        }
        zzacq zzacqVar = this.zzc.zzd;
        firebaseApp = this.zzc.zzf;
        return zzacqVar.zza(firebaseApp, this.zza, (AuthCredential) this.zzb, str, (zzcf) new FirebaseAuth.zzb(this.zzc));
    }

    zzo(FirebaseAuth firebaseAuth, FirebaseUser firebaseUser, EmailAuthCredential emailAuthCredential) {
        this.zza = firebaseUser;
        this.zzb = emailAuthCredential;
        Objects.requireNonNull(firebaseAuth);
        this.zzc = firebaseAuth;
    }
}
