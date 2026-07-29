package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Arrays;
import java.util.Iterator;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes2.dex */
final class zzfxm implements zzfwd {
    private final zzfxa zza;

    /* synthetic */ zzfxm(zzfxa zzfxaVar, zzfxl zzfxlVar) {
        this.zza = zzfxaVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfwd
    public final byte[] zza(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        Logger logger;
        int length = bArr.length;
        if (length > 5) {
            byte[] copyOfRange = Arrays.copyOfRange(bArr, 0, 5);
            byte[] copyOfRange2 = Arrays.copyOfRange(bArr, 5, length);
            Iterator it = this.zza.zze(copyOfRange).iterator();
            while (it.hasNext()) {
                try {
                    return ((zzfwd) ((zzfwx) it.next()).zza()).zza(copyOfRange2, bArr2);
                } catch (GeneralSecurityException e) {
                    logger = zzfxn.zza;
                    logger.logp(Level.INFO, "com.google.crypto.tink.aead.AeadWrapper$WrappedAead", "decrypt", "ciphertext prefix matches a key, but cannot decrypt: ".concat(String.valueOf(e.toString())));
                }
            }
        }
        Iterator it2 = this.zza.zze(zzfwi.zza).iterator();
        while (it2.hasNext()) {
            try {
                return ((zzfwd) ((zzfwx) it2.next()).zza()).zza(bArr, bArr2);
            } catch (GeneralSecurityException unused) {
            }
        }
        throw new GeneralSecurityException("decryption failed");
    }

    @Override // com.google.android.gms.internal.ads.zzfwd
    public final byte[] zzb(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        return zzghf.zzc(this.zza.zzb().zzb(), ((zzfwd) this.zza.zzb().zza()).zzb(bArr, bArr2));
    }
}
