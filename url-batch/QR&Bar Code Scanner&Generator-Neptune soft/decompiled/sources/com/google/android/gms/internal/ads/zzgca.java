package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
public final class zzgca {
    public static final String zza;
    public static final String zzb;

    @Deprecated
    public static final zzgng zzc;

    @Deprecated
    public static final zzgng zzd;

    @Deprecated
    public static final zzgng zze;

    static {
        new zzgcg();
        zza = "type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey";
        new zzgcp();
        zzb = "type.googleapis.com/google.crypto.tink.AesGcmKey";
        new zzgcs();
        new zzgcm();
        new zzgcy();
        new zzgdc();
        new zzgcv();
        new zzgdf();
        zzgng zzc2 = zzgng.zzc();
        zzc = zzc2;
        zzd = zzc2;
        zze = zzc2;
        try {
            zza();
        } catch (GeneralSecurityException e) {
            throw new ExceptionInInitializerError(e);
        }
    }

    public static void zza() throws GeneralSecurityException {
        zzgby.zzo(new zzgcd());
        zzghe.zza();
        zzgby.zzn(new zzgcg(), true);
        zzgby.zzn(new zzgcp(), true);
        if (zzgdt.zzb()) {
            return;
        }
        zzgby.zzn(new zzgcm(), true);
        zzgcs.zzg(true);
        zzgby.zzn(new zzgcv(), true);
        zzgby.zzn(new zzgcy(), true);
        zzgby.zzn(new zzgdc(), true);
        zzgby.zzn(new zzgdf(), true);
    }
}
