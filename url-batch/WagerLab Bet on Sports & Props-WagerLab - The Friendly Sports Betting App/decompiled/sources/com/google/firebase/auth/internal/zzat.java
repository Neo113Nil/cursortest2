package com.google.firebase.auth.internal;

import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.logging.Logger;
import com.google.android.gms.tasks.Task;
import com.google.firebase.FirebaseApp;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.GetTokenResult;
import java.util.Objects;

/* compiled from: com.google.firebase:firebase-auth@@24.0.1 */
/* loaded from: classes6.dex */
final class zzat implements Runnable {
    final /* synthetic */ zzaq zza;
    private final String zzb;

    zzat(zzaq zzaqVar, String str) {
        Objects.requireNonNull(zzaqVar);
        this.zza = zzaqVar;
        this.zzb = Preconditions.checkNotEmpty(str);
    }

    @Override // java.lang.Runnable
    public final void run() {
        Logger logger;
        FirebaseAuth firebaseAuth = FirebaseAuth.getInstance(FirebaseApp.getInstance(this.zzb));
        if (firebaseAuth.getCurrentUser() != null) {
            Task<GetTokenResult> accessToken = firebaseAuth.getAccessToken(true);
            logger = zzaq.zzc;
            logger.v("Token refreshing started", new Object[0]);
            accessToken.addOnFailureListener(new zzas(this));
        }
    }
}
