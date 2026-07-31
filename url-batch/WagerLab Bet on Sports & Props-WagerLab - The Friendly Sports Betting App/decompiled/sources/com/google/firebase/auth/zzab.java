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
final class zzab extends zzbo<Void> {
    private final /* synthetic */ boolean zza;
    private final /* synthetic */ FirebaseUser zzb;
    private final /* synthetic */ EmailAuthCredential zzc;
    private final /* synthetic */ FirebaseAuth zzd;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v2, types: [com.google.firebase.auth.FirebaseAuth$zzb, com.google.firebase.auth.internal.zzcf] */
    /* JADX WARN: Type inference failed for: r7v0, types: [com.google.firebase.auth.FirebaseAuth$zzb, com.google.firebase.auth.internal.zzcf] */
    @Override // com.google.firebase.auth.internal.zzbo
    public final Task<Void> zza(String str) {
        FirebaseApp firebaseApp;
        FirebaseApp firebaseApp2;
        if (this.zza) {
            if (TextUtils.isEmpty(str)) {
                Log.i("FirebaseAuth", " Email link reauth with empty reCAPTCHA token");
            } else {
                Log.i("FirebaseAuth", "Got reCAPTCHA token for reauth with email link");
            }
            zzacq zzacqVar = this.zzd.zzd;
            firebaseApp2 = this.zzd.zzf;
            return zzacqVar.zza(firebaseApp2, this.zzb, this.zzc, str, (zzcf) new FirebaseAuth.zzb(this.zzd));
        }
        String zzc = this.zzc.zzc();
        String zzd = this.zzc.zzd();
        if (TextUtils.isEmpty(str)) {
            Log.i("FirebaseAuth", "Reauthenticating " + zzc + " with empty reCAPTCHA token");
        } else {
            Log.i("FirebaseAuth", "Got reCAPTCHA token for reauth with " + zzc);
        }
        zzacq zzacqVar2 = this.zzd.zzd;
        firebaseApp = this.zzd.zzf;
        return zzacqVar2.zza(firebaseApp, this.zzb, zzc, Preconditions.checkNotEmpty(zzd), this.zzb.getTenantId(), str, new FirebaseAuth.zzb(this.zzd));
    }

    zzab(FirebaseAuth firebaseAuth, boolean z, FirebaseUser firebaseUser, EmailAuthCredential emailAuthCredential) {
        this.zza = z;
        this.zzb = firebaseUser;
        this.zzc = emailAuthCredential;
        Objects.requireNonNull(firebaseAuth);
        this.zzd = firebaseAuth;
    }
}
