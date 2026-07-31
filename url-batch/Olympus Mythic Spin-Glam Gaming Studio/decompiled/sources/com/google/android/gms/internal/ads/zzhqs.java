package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.Provider;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes6.dex */
public final class zzhqs implements zzhpn {
    public zzhqs(zzhpf zzhpfVar) {
    }

    public static zzhpn zza(zzhpf zzhpfVar) throws GeneralSecurityException {
        if (!zzhlx.zza(1)) {
            throw new GeneralSecurityException("Cannot use AES-CMAC in FIPS-mode.");
        }
        Provider zza = zzhmb.zza();
        if (zza != null) {
            try {
                return zzhqr.zza(zzhpfVar, zza);
            } catch (GeneralSecurityException unused) {
            }
        }
        return new zzhqs(zzhpfVar);
    }
}
