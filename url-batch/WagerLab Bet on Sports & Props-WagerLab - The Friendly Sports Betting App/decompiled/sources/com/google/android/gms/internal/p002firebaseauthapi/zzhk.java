package com.google.android.gms.internal.p002firebaseauthapi;

import java.security.GeneralSecurityException;
import javax.annotation.Nullable;
import javax.crypto.Cipher;

/* compiled from: com.google.firebase:firebase-auth@@24.0.1 */
/* loaded from: classes5.dex */
final class zzhk extends ThreadLocal<Cipher> {
    @Override // java.lang.ThreadLocal
    @Nullable
    protected final /* synthetic */ Cipher initialValue() {
        return zza();
    }

    @Nullable
    private static Cipher zza() {
        boolean zzb;
        try {
            Cipher zza = zzzj.zza.zza("ChaCha20-Poly1305");
            zzb = zzhh.zzb(zza);
            if (zzb) {
                return zza;
            }
            return null;
        } catch (GeneralSecurityException unused) {
            return null;
        }
    }

    zzhk() {
    }
}
