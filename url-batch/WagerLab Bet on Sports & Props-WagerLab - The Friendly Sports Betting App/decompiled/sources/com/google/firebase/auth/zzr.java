package com.google.firebase.auth;

import com.google.android.gms.common.api.Status;
import com.google.firebase.auth.internal.zzav;
import java.util.Objects;

/* compiled from: com.google.firebase:firebase-auth@@24.0.1 */
/* loaded from: classes6.dex */
final class zzr implements zzav {
    private final /* synthetic */ FirebaseUser zza;
    private final /* synthetic */ FirebaseAuth zzb;

    zzr(FirebaseAuth firebaseAuth, FirebaseUser firebaseUser) {
        this.zza = firebaseUser;
        Objects.requireNonNull(firebaseAuth);
        this.zzb = firebaseAuth;
    }

    @Override // com.google.firebase.auth.internal.zzav
    public final void zza() {
        FirebaseUser firebaseUser;
        FirebaseUser firebaseUser2;
        firebaseUser = this.zzb.zzg;
        if (firebaseUser != null) {
            firebaseUser2 = this.zzb.zzg;
            if (firebaseUser2.getUid().equalsIgnoreCase(this.zza.getUid())) {
                this.zzb.zzg();
            }
        }
    }

    @Override // com.google.firebase.auth.internal.zzau
    public final void zza(Status status) {
        if (status.getStatusCode() == 17011 || status.getStatusCode() == 17021 || status.getStatusCode() == 17005) {
            this.zzb.signOut();
        }
    }
}
