package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
final class zzgcc implements zzgak {
    private final zzgbu zza;
    private final zzghn zzb;
    private final zzghn zzc;

    /* synthetic */ zzgcc(zzgbu zzgbuVar, zzgcb zzgcbVar) {
        zzghn zzghnVar;
        this.zza = zzgbuVar;
        if (zzgbuVar.zzf()) {
            zzgho zzb = zzgfx.zza().zzb();
            zzght zza = zzgfu.zza(zzgbuVar);
            this.zzb = zzb.zza(zza, "aead", "encrypt");
            zzghnVar = zzb.zza(zza, "aead", "decrypt");
        } else {
            zzghnVar = zzgfu.zza;
            this.zzb = zzghnVar;
        }
        this.zzc = zzghnVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgak
    public final byte[] zza(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        Logger logger;
        int length = bArr.length;
        if (length > 5) {
            byte[] copyOf = Arrays.copyOf(bArr, 5);
            byte[] copyOfRange = Arrays.copyOfRange(bArr, 5, length);
            for (zzgbo zzgboVar : this.zza.zze(copyOf)) {
                try {
                    byte[] zza = ((zzgak) zzgboVar.zzc()).zza(copyOfRange, bArr2);
                    zzgboVar.zza();
                    int length2 = copyOfRange.length;
                    return zza;
                } catch (GeneralSecurityException e) {
                    logger = zzgcd.zza;
                    logger.logp(Level.INFO, "com.google.crypto.tink.aead.AeadWrapper$WrappedAead", "decrypt", "ciphertext prefix matches a key, but cannot decrypt: ".concat(e.toString()));
                }
            }
        }
        for (zzgbo zzgboVar2 : this.zza.zze(zzgap.zza)) {
            try {
                byte[] zza2 = ((zzgak) zzgboVar2.zzc()).zza(bArr, bArr2);
                zzgboVar2.zza();
                int length3 = bArr.length;
                return zza2;
            } catch (GeneralSecurityException unused) {
            }
        }
        throw new GeneralSecurityException("decryption failed");
    }

    @Override // com.google.android.gms.internal.ads.zzgak
    public final byte[] zzb(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        try {
            byte[] zzc = zzgnv.zzc(this.zza.zza().zzd(), ((zzgak) this.zza.zza().zzc()).zzb(bArr, bArr2));
            this.zza.zza().zza();
            int length = bArr.length;
            return zzc;
        } catch (GeneralSecurityException e) {
            throw e;
        }
    }
}
