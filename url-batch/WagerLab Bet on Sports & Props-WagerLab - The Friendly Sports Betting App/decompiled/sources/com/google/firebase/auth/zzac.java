package com.google.firebase.auth;

import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.p002firebaseauthapi.zzacq;
import com.google.android.gms.tasks.Task;
import com.google.firebase.FirebaseApp;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.internal.zzbo;
import com.google.firebase.auth.internal.zzcf;
import java.util.Objects;

/* compiled from: com.google.firebase:firebase-auth@@24.0.1 */
/* loaded from: classes6.dex */
final class zzac extends zzbo<AuthResult> {
    private final /* synthetic */ boolean zza;
    private final /* synthetic */ FirebaseUser zzb;
    private final /* synthetic */ EmailAuthCredential zzc;
    private final /* synthetic */ FirebaseAuth zzd;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v0, types: [com.google.firebase.auth.FirebaseAuth$zzb, com.google.firebase.auth.internal.zzcf] */
    @Override // com.google.firebase.auth.internal.zzbo
    public final Task<AuthResult> zza(String str) {
        FirebaseApp firebaseApp;
        FirebaseApp firebaseApp2;
        if (TextUtils.isEmpty(str)) {
            Log.i("FirebaseAuth", "Email link login/reauth with empty reCAPTCHA token");
        } else {
            Log.i("FirebaseAuth", "Got reCAPTCHA token for login/reauth with email link");
        }
        if (this.zza) {
            zzacq zzacqVar = this.zzd.zzd;
            firebaseApp2 = this.zzd.zzf;
            return zzacqVar.zzb(firebaseApp2, (FirebaseUser) Preconditions.checkNotNull(this.zzb), this.zzc, str, (zzcf) new FirebaseAuth.zzb(this.zzd));
        }
        zzacq zzacqVar2 = this.zzd.zzd;
        firebaseApp = this.zzd.zzf;
        return zzacqVar2.zza(firebaseApp, this.zzc, str, (com.google.firebase.auth.internal.zzl) new FirebaseAuth.zza(this.zzd));
    }

    zzac(FirebaseAuth firebaseAuth, boolean z, FirebaseUser firebaseUser, EmailAuthCredential emailAuthCredential) {
        this.zza = z;
        this.zzb = firebaseUser;
        this.zzc = emailAuthCredential;
        Objects.requireNonNull(firebaseAuth);
        this.zzd = firebaseAuth;
    }
}
