package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.internal.p002firebaseauthapi.zziv;
import java.security.GeneralSecurityException;
import java.security.Provider;

/* compiled from: com.google.firebase:firebase-auth@@24.0.1 */
/* loaded from: classes5.dex */
public final class zzsh implements zzqw {
    private static final zziv.zza zza = zziv.zza.zza;

    public static zzqw zza(zzqp zzqpVar) throws GeneralSecurityException {
        if (!zza.zza()) {
            throw new GeneralSecurityException("Cannot use AES-CMAC in FIPS-mode.");
        }
        Provider zza2 = zznh.zza();
        if (zza2 != null) {
            try {
                return zzse.zza(zzqpVar, zza2);
            } catch (GeneralSecurityException unused) {
            }
        }
        return new zzsh(zzqpVar);
    }

    private zzsh(zzqp zzqpVar) {
    }
}
