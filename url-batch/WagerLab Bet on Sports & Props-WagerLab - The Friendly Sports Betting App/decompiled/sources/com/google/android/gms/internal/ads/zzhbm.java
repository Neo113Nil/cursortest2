package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.Provider;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
/* loaded from: classes5.dex */
public final class zzhbm implements zzhae {
    public zzhbm(zzgzw zzgzwVar) {
    }

    public static zzhae zza(zzgzw zzgzwVar) throws GeneralSecurityException {
        if (!zzgxd.zza(1)) {
            throw new GeneralSecurityException("Cannot use AES-CMAC in FIPS-mode.");
        }
        Provider zza = zzgxf.zza();
        if (zza != null) {
            try {
                return zzhbl.zza(zzgzwVar, zza);
            } catch (GeneralSecurityException unused) {
            }
        }
        return new zzhbm(zzgzwVar);
    }
}
