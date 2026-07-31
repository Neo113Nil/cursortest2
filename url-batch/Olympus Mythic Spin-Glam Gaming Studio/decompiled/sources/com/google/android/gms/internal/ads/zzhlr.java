package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import javax.crypto.Cipher;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes6.dex */
final class zzhlr extends ThreadLocal {
    zzhlr() {
    }

    protected static final Cipher zza() {
        try {
            Cipher cipher = (Cipher) zzibh.zza.zzb("AES/GCM-SIV/NoPadding");
            if (zzhkh.zzb(cipher)) {
                return cipher;
            }
            return null;
        } catch (GeneralSecurityException e) {
            throw new IllegalStateException(e);
        }
    }

    @Override // java.lang.ThreadLocal
    protected final /* bridge */ /* synthetic */ Object initialValue() {
        return zza();
    }
}
