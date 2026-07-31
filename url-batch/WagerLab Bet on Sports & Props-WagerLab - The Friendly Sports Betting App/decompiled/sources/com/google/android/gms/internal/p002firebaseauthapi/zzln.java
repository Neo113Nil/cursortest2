package com.google.android.gms.internal.p002firebaseauthapi;

import java.security.GeneralSecurityException;

/* compiled from: com.google.firebase:firebase-auth@@24.0.1 */
/* loaded from: classes5.dex */
public final class zzln {
    private static final byte[] zza = new byte[0];

    public static zzlr zza(zzkb zzkbVar) throws GeneralSecurityException {
        zzcb zzb = zzkbVar.zzb();
        if (zzb instanceof zzdx) {
            return new zzlp((zzdx) zzb);
        }
        if (zzb instanceof zzdi) {
            return new zzlm((zzdi) zzb);
        }
        if (zzb instanceof zzjf) {
            return new zzlo((zzjf) zzb);
        }
        throw new GeneralSecurityException("Unsupported DEM parameters: " + String.valueOf(zzb));
    }
}
