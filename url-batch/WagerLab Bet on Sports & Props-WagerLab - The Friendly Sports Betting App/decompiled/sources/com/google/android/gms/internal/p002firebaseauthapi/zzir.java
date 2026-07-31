package com.google.android.gms.internal.p002firebaseauthapi;

import java.security.GeneralSecurityException;
import javax.annotation.Nullable;
import javax.crypto.Cipher;

/* compiled from: com.google.firebase:firebase-auth@@24.0.1 */
/* loaded from: classes5.dex */
final class zzir extends ThreadLocal<Cipher> {
    @Override // java.lang.ThreadLocal
    @Nullable
    protected final /* synthetic */ Cipher initialValue() {
        return zza();
    }

    @Nullable
    private static Cipher zza() {
        try {
            Cipher zza = zzzj.zza.zza("AES/GCM-SIV/NoPadding");
            if (zzgz.zza(zza)) {
                return zza;
            }
            return null;
        } catch (GeneralSecurityException e) {
            throw new IllegalStateException(e);
        }
    }

    zzir() {
    }
}
