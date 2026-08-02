package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import javax.annotation.Nullable;
import javax.crypto.Cipher;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
final class zzgjr extends ThreadLocal {
    zzgjr() {
    }

    @Nullable
    protected static final Cipher zza() {
        boolean zzf;
        try {
            Cipher cipher = (Cipher) zzguz.zza.zza("ChaCha20-Poly1305");
            zzf = zzgjs.zzf(cipher);
            if (zzf) {
                return cipher;
            }
            return null;
        } catch (GeneralSecurityException unused) {
            return null;
        }
    }

    @Override // java.lang.ThreadLocal
    @Nullable
    protected final /* bridge */ /* synthetic */ Object initialValue() {
        return zza();
    }
}
