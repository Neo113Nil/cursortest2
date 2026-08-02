package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
public final class zzgdx {
    public static final String zza;

    @Deprecated
    public static final zzgng zzb;

    @Deprecated
    public static final zzgng zzc;

    static {
        new zzgdw();
        zza = "type.googleapis.com/google.crypto.tink.AesSivKey";
        zzb = zzgng.zzc();
        zzc = zzgng.zzc();
        try {
            zzgby.zzo(new zzgdz());
            if (zzgdt.zzb()) {
                return;
            }
            zzgby.zzn(new zzgdw(), true);
        } catch (GeneralSecurityException e) {
            throw new ExceptionInInitializerError(e);
        }
    }
}
