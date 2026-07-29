package com.google.android.gms.internal.ads;

import java.nio.charset.Charset;
import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes2.dex */
final class zzfxj {
    public static final Charset zza = Charset.forName("UTF-8");

    public static zzgfz zza(zzgfu zzgfuVar) {
        zzgfw zza2 = zzgfz.zza();
        zza2.zzb(zzgfuVar.zzc());
        for (zzgft zzgftVar : zzgfuVar.zzh()) {
            zzgfx zza3 = zzgfy.zza();
            zza3.zzb(zzgftVar.zzc().zzf());
            zza3.zzd(zzgftVar.zzi());
            zza3.zzc(zzgftVar.zzj());
            zza3.zza(zzgftVar.zza());
            zza2.zza((zzgfy) zza3.zzaj());
        }
        return (zzgfz) zza2.zzaj();
    }

    public static void zzb(zzgfu zzgfuVar) throws GeneralSecurityException {
        int zzc = zzgfuVar.zzc();
        int i = 0;
        boolean z = false;
        boolean z2 = true;
        for (zzgft zzgftVar : zzgfuVar.zzh()) {
            if (zzgftVar.zzi() == 3) {
                if (!zzgftVar.zzh()) {
                    throw new GeneralSecurityException(String.format("key %d has no key data", Integer.valueOf(zzgftVar.zza())));
                }
                if (zzgftVar.zzj() == 2) {
                    throw new GeneralSecurityException(String.format("key %d has unknown prefix", Integer.valueOf(zzgftVar.zza())));
                }
                if (zzgftVar.zzi() == 2) {
                    throw new GeneralSecurityException(String.format("key %d has unknown status", Integer.valueOf(zzgftVar.zza())));
                }
                if (zzgftVar.zza() == zzc) {
                    if (z) {
                        throw new GeneralSecurityException("keyset contains multiple primary keys");
                    }
                    z = true;
                }
                z2 &= zzgftVar.zzc().zzi() == 5;
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
