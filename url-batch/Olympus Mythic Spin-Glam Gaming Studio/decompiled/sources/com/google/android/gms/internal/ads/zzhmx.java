package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes6.dex */
public abstract class zzhmx {
    private final zzich zza;
    private final Class zzb;

    /* synthetic */ zzhmx(zzich zzichVar, Class cls, byte[] bArr) {
        this.zza = zzichVar;
        this.zzb = cls;
    }

    public static zzhmx zzd(zzhmw zzhmwVar, zzich zzichVar, Class cls) {
        return new zzhmv(zzichVar, cls, zzhmwVar);
    }

    public abstract zzhes zza(zzhow zzhowVar, zzhfr zzhfrVar) throws GeneralSecurityException;

    public final zzich zzb() {
        return this.zza;
    }

    public final Class zzc() {
        return this.zzb;
    }
}
