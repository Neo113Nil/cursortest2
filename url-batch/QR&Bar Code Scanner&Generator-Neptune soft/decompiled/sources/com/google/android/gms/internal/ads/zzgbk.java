package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
@Deprecated
/* loaded from: classes2.dex */
public final class zzgbk {
    @Deprecated
    public static final zzgbf zza(byte[] bArr) throws GeneralSecurityException {
        try {
            zzgmk zzg = zzgmk.zzg(bArr, zzgqq.zza());
            for (zzgmj zzgmjVar : zzg.zzh()) {
                if (zzgmjVar.zzc().zzi() == 2 || zzgmjVar.zzc().zzi() == 3 || zzgmjVar.zzc().zzi() == 4) {
                    throw new GeneralSecurityException("keyset contains secret key material");
                }
            }
            return zzgbf.zza(zzg);
        } catch (zzgrq unused) {
            throw new GeneralSecurityException("invalid keyset");
        }
    }
}
