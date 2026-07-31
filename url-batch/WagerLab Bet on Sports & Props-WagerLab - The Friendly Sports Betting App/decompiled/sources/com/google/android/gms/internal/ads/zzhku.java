package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads-api@@24.6.0 */
/* loaded from: classes5.dex */
public final class zzhku extends RuntimeException {
    public zzhku(zzhjs zzhjsVar) {
        super("Message was missing required fields.  (Lite runtime could not determine which fields were missing).");
    }

    public final zzhiw zza() {
        return new zzhiw(getMessage());
    }
}
