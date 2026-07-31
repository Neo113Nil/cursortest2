package com.google.android.gms.internal.p002firebaseauthapi;

/* compiled from: com.google.firebase:firebase-auth@@24.0.1 */
/* loaded from: classes5.dex */
public final class zzanv extends RuntimeException {
    public final zzall zza() {
        return new zzall(getMessage());
    }

    public zzanv(zzamm zzammVar) {
        super("Message was missing required fields.  (Lite runtime could not determine which fields were missing).");
    }
}
