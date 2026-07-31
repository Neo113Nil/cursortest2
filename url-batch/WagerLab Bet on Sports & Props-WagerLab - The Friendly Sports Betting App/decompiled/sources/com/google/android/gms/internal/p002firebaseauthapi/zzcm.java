package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.internal.p002firebaseauthapi.zzwx;
import com.google.android.gms.internal.p002firebaseauthapi.zzxh;
import com.google.android.gms.internal.p002firebaseauthapi.zzxk;
import java.nio.charset.Charset;
import java.security.GeneralSecurityException;

/* compiled from: com.google.firebase:firebase-auth@@24.0.1 */
/* loaded from: classes5.dex */
final class zzcm {
    public static zzxk zza(zzxh zzxhVar) {
        zzxk.zza zza = zzxk.zza().zza(zzxhVar.zzb());
        for (zzxh.zzb zzbVar : zzxhVar.zze()) {
            zza.zza((zzxk.zzb) ((zzalf) zzxk.zzb.zza().zza(zzbVar.zzb().zzf()).zza(zzbVar.zzc()).zza(zzbVar.zzf()).zza(zzbVar.zza()).zze()));
        }
        return (zzxk) ((zzalf) zza.zze());
    }

    static {
        Charset.forName("UTF-8");
    }

    public static void zzb(zzxh zzxhVar) throws GeneralSecurityException {
        int zzb = zzxhVar.zzb();
        int i = 0;
        boolean z = false;
        boolean z2 = true;
        for (zzxh.zzb zzbVar : zzxhVar.zze()) {
            if (zzbVar.zzc() == zzxc.ENABLED) {
                if (!zzbVar.zzg()) {
                    throw new GeneralSecurityException(String.format("key %d has no key data", Integer.valueOf(zzbVar.zza())));
                }
                if (zzbVar.zzf() == zzxz.UNKNOWN_PREFIX) {
                    throw new GeneralSecurityException(String.format("key %d has unknown prefix", Integer.valueOf(zzbVar.zza())));
                }
                if (zzbVar.zzc() == zzxc.UNKNOWN_STATUS) {
                    throw new GeneralSecurityException(String.format("key %d has unknown status", Integer.valueOf(zzbVar.zza())));
                }
                if (zzbVar.zza() == zzb) {
                    if (z) {
                        throw new GeneralSecurityException("keyset contains multiple primary keys");
                    }
                    z = true;
                }
                if (zzbVar.zzb().zzb() != zzwx.zzb.ASYMMETRIC_PUBLIC) {
                    z2 = false;
                }
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
