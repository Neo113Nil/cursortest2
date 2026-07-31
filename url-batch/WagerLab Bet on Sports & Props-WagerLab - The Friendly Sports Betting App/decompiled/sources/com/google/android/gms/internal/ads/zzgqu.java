package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
/* loaded from: classes5.dex */
public final class zzgqu {
    public static byte[] zza(zzgqs zzgqsVar) throws GeneralSecurityException {
        return ((zzgzk) zzgyo.zza().zzk(zzgqsVar, zzgzk.class)).zzc().zzaN();
    }

    public static zzgqs zzb(byte[] bArr) throws GeneralSecurityException {
        try {
            zzhdw zzd = zzhdw.zzd(bArr, zzhhr.zza());
            zzgyo zza = zzgyo.zza();
            zzgzk zzb = zzgzk.zzb(zzd);
            return !zza.zzi(zzb) ? new zzgxw(zzb) : zza.zzj(zzb);
        } catch (IOException e) {
            throw new GeneralSecurityException("Failed to parse proto", e);
        }
    }
}
