package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.common.logging.Logger;
import com.google.android.gms.tasks.OnFailureListener;
import java.util.Objects;

/* compiled from: com.google.firebase:firebase-auth@@24.0.1 */
/* loaded from: classes5.dex */
final class zzage implements OnFailureListener {
    zzage(zzagc zzagcVar) {
        Objects.requireNonNull(zzagcVar);
    }

    @Override // com.google.android.gms.tasks.OnFailureListener
    public final void onFailure(Exception exc) {
        Logger logger;
        logger = zzagc.zza;
        logger.e("SmsRetrieverClient failed to start: " + exc.getMessage(), new Object[0]);
    }
}
