package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
final class zzgqz implements zzgsm {
    private static final zzgqz zza = new zzgqz();

    private zzgqz() {
    }

    public static zzgqz zza() {
        return zza;
    }

    @Override // com.google.android.gms.internal.ads.zzgsm
    public final zzgsl zzb(Class cls) {
        if (!zzgre.class.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Unsupported message type: ".concat(String.valueOf(cls.getName())));
        }
        try {
            return (zzgsl) zzgre.zzaB(cls.asSubclass(zzgre.class)).zzb(3, null, null);
        } catch (Exception e) {
            throw new RuntimeException("Unable to get message info for ".concat(String.valueOf(cls.getName())), e);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgsm
    public final boolean zzc(Class cls) {
        return zzgre.class.isAssignableFrom(cls);
    }
}
