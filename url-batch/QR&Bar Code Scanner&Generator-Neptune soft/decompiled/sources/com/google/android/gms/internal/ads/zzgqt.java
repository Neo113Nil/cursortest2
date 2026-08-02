package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
final class zzgqt {
    private static final zzgqr zza = new zzgqs();
    private static final zzgqr zzb;

    static {
        zzgqr zzgqrVar;
        try {
            zzgqrVar = (zzgqr) Class.forName("com.google.protobuf.ExtensionSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            zzgqrVar = null;
        }
        zzb = zzgqrVar;
    }

    static zzgqr zza() {
        zzgqr zzgqrVar = zzb;
        if (zzgqrVar != null) {
            return zzgqrVar;
        }
        throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
    }

    static zzgqr zzb() {
        return zza;
    }
}
