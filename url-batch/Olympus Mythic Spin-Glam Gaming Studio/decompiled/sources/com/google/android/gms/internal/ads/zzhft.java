package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes4.dex */
public final class zzhft {
    public static byte[] zza(zzhfj zzhfjVar) throws GeneralSecurityException {
        return ((zzhot) zzhnw.zza().zzk(zzhfjVar, zzhot.class)).zzc().zzaN();
    }

    public static zzhfj zzb(byte[] bArr) throws GeneralSecurityException {
        try {
            zzhtw zzc = zzhtw.zzc(bArr, zziew.zzb());
            zzhnw zza = zzhnw.zza();
            zzhot zzb = zzhot.zzb(zzc);
            return !zza.zzi(zzb) ? new zzhnf(zzb) : zza.zzj(zzb);
        } catch (IOException e) {
            throw new GeneralSecurityException("Failed to parse proto", e);
        }
    }
}
