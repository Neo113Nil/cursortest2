package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes2.dex */
final class zzgme {
    private static final zzgmd zza;
    private static final zzgmd zzb;

    static {
        zzgmd zzgmdVar;
        try {
            zzgmdVar = (zzgmd) Class.forName("com.google.protobuf.NewInstanceSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            zzgmdVar = null;
        }
        zza = zzgmdVar;
        zzb = new zzgmd();
    }

    static zzgmd zza() {
        return zza;
    }

    static zzgmd zzb() {
        return zzb;
    }
}
