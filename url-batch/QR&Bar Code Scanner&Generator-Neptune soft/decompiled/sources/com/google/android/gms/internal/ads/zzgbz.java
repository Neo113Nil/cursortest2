package com.google.android.gms.internal.ads;

import java.nio.charset.Charset;
import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
final class zzgbz {
    public static final Charset zza = Charset.forName("UTF-8");

    public static zzgmp zza(zzgmk zzgmkVar) {
        zzgmm zza2 = zzgmp.zza();
        zza2.zzb(zzgmkVar.zzc());
        for (zzgmj zzgmjVar : zzgmkVar.zzh()) {
            zzgmn zza3 = zzgmo.zza();
            zza3.zzb(zzgmjVar.zzc().zzf());
            zza3.zzd(zzgmjVar.zzi());
            zza3.zzc(zzgmjVar.zzj());
            zza3.zza(zzgmjVar.zza());
            zza2.zza((zzgmo) zza3.zzam());
        }
        return (zzgmp) zza2.zzam();
    }

    public static void zzb(zzgmk zzgmkVar) throws GeneralSecurityException {
        int zzc = zzgmkVar.zzc();
        int i = 0;
        boolean z = false;
        boolean z2 = true;
        for (zzgmj zzgmjVar : zzgmkVar.zzh()) {
            if (zzgmjVar.zzi() == 3) {
                if (!zzgmjVar.zzh()) {
                    throw new GeneralSecurityException(String.format("key %d has no key data", Integer.valueOf(zzgmjVar.zza())));
                }
                if (zzgmjVar.zzj() == 2) {
                    throw new GeneralSecurityException(String.format("key %d has unknown prefix", Integer.valueOf(zzgmjVar.zza())));
                }
                if (zzgmjVar.zzi() == 2) {
                    throw new GeneralSecurityException(String.format("key %d has unknown status", Integer.valueOf(zzgmjVar.zza())));
                }
                if (zzgmjVar.zza() == zzc) {
                    if (z) {
                        throw new GeneralSecurityException("keyset contains multiple primary keys");
                    }
                    z = true;
                }
                z2 &= zzgmjVar.zzc().zzi() == 5;
                i++;
            }
        }
        if (i == 0) {
            throw new GeneralSecurityException("keyset must contain at least one ENABLED key");
        }
        if (!z && !z2) {
            throw new GeneralSecurityException("keyset doesn't contain a valid primary key");
        }
    }
}
