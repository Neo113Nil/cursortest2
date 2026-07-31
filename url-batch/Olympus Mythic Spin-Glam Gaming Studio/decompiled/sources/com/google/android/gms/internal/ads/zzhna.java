package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes6.dex */
public abstract class zzhna {
    private final Class zza;
    private final Class zzb;

    /* synthetic */ zzhna(Class cls, Class cls2, byte[] bArr) {
        this.zza = cls;
        this.zzb = cls2;
    }

    public static zzhna zzd(zzhmz zzhmzVar, Class cls, Class cls2) {
        return new zzhmy(cls, cls2, zzhmzVar);
    }

    public abstract zzhow zza(zzhes zzhesVar, zzhfr zzhfrVar) throws GeneralSecurityException;

    public final Class zzb() {
        return this.zza;
    }

    public final Class zzc() {
        return this.zzb;
    }
}
