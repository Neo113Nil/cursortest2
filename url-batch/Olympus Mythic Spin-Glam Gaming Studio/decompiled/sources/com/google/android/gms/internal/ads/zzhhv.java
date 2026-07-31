package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes6.dex */
public final class zzhhv {
    public static final /* synthetic */ int zza = 0;
    private static final zzhok zzb = zzhok.zzd(zzhhu.zza, zzhia.class, zzhek.class);
    private static final zzhet zzc = zzhnc.zzf("type.googleapis.com/google.crypto.tink.KmsAeadKey", zzhek.class, 6, zzhui.zze());
    private static final zzhmt zzd = zzhht.zza;

    public static void zza(boolean z) throws GeneralSecurityException {
        if (!zzhlx.zza(1)) {
            throw new GeneralSecurityException("Registering KMS AEAD is not supported in FIPS mode");
        }
        int i = zzhih.zza;
        zzhih.zza(zzhnw.zza());
        zzhnt.zza().zzb(zzb);
        zzhnn.zza().zzb(zzd, zzhic.class);
        zzhmu.zza().zzb(zzc, true);
    }
}
