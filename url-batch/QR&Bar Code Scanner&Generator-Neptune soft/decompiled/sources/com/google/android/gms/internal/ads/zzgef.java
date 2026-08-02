package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
public final class zzgef {

    @Deprecated
    public static final zzgng zza;

    @Deprecated
    public static final zzgng zzb;

    @Deprecated
    public static final zzgng zzc;

    static {
        new zzgee();
        new zzgec();
        zza = zzgng.zzc();
        zzb = zzgng.zzc();
        zzc = zzgng.zzc();
        try {
            zzgby.zzo(new zzgeh());
            zzgby.zzo(new zzgek());
            zzgca.zza();
            if (zzgdt.zzb()) {
                return;
            }
            zzgby.zzl(new zzgec(), new zzgee(), true);
            zzgby.zzl(new zzgfa(), new zzgfc(), true);
        } catch (GeneralSecurityException e) {
            throw new ExceptionInInitializerError(e);
        }
    }
}
