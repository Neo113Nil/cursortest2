package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads-api@@25.4.0 */
/* loaded from: classes5.dex */
final class zziff implements zzigu {
    private static final zziff zza = new zziff();

    private zziff() {
    }

    public static zziff zza() {
        return zza;
    }

    @Override // com.google.android.gms.internal.ads.zzigu
    public final boolean zzb(Class cls) {
        return zzifm.class.isAssignableFrom(cls);
    }

    @Override // com.google.android.gms.internal.ads.zzigu
    public final zzigt zzc(Class cls) {
        if (!zzifm.class.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Unsupported message type: ".concat(cls.getName()));
        }
        try {
            return (zzigt) zzifm.zzbt(cls.asSubclass(zzifm.class)).zzbs();
        } catch (Exception e) {
            throw new RuntimeException("Unable to get message info for ".concat(cls.getName()), e);
        }
    }
}
