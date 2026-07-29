package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes2.dex */
public final class zzfzh {
    public static final String zza;

    @Deprecated
    public static final zzggq zzb;

    @Deprecated
    public static final zzggq zzc;

    static {
        new zzfzg();
        zza = "type.googleapis.com/google.crypto.tink.AesSivKey";
        zzb = zzggq.zzc();
        zzc = zzggq.zzc();
        try {
            zzfxi.zzn(new zzfzj());
            if (zzfzd.zzb()) {
                return;
            }
            zzfxi.zzm(new zzfzg(), true);
        } catch (GeneralSecurityException e) {
            throw new ExceptionInInitializerError(e);
        }
    }
}
