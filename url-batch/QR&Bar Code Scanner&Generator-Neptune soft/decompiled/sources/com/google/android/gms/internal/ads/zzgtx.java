package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
public final class zzgtx extends RuntimeException {
    public zzgtx(zzgso zzgsoVar) {
        super("Message was missing required fields.  (Lite runtime could not determine which fields were missing).");
    }

    public final zzgrq zza() {
        return new zzgrq(getMessage());
    }
}
