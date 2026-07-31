package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
/* loaded from: classes5.dex */
public final class zzgwj implements zzgpx {
    private final zzgpx zza;
    private final byte[] zzb;

    private zzgwj(zzgpx zzgpxVar, byte[] bArr) {
        this.zza = zzgpxVar;
        int length = bArr.length;
        if (length != 0 && length != 5) {
            throw new IllegalArgumentException("identifier has an invalid length");
        }
        this.zzb = bArr;
    }

    public static zzgpx zzb(zzgxv zzgxvVar) throws GeneralSecurityException {
        byte[] zzc;
        zzgzj zzc2 = zzgxvVar.zzc(zzgqc.zza());
        zzgpx zzgpxVar = (zzgpx) zzgxk.zza().zzc(zzc2.zzg(), zzgpx.class).zza(zzc2.zzb());
        zzhep zzd = zzc2.zzd();
        int ordinal = zzd.ordinal();
        if (ordinal != 1) {
            if (ordinal != 2) {
                if (ordinal == 3) {
                    zzc = zzgyp.zza.zzc();
                } else if (ordinal != 4) {
                    String valueOf = String.valueOf(zzd);
                    String.valueOf(valueOf);
                    throw new GeneralSecurityException("unknown output prefix type ".concat(String.valueOf(valueOf)));
                }
            }
            zzc = zzgyp.zza(zzgxvVar.zzb().intValue()).zzc();
        } else {
            zzc = zzgyp.zzb(zzgxvVar.zzb().intValue()).zzc();
        }
        return new zzgwj(zzgpxVar, zzc);
    }

    public static zzgpx zzc(zzgpx zzgpxVar, zzhgg zzhggVar) {
        return new zzgwj(zzgpxVar, zzhggVar.zzc());
    }

    @Override // com.google.android.gms.internal.ads.zzgpx
    public final byte[] zza(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        byte[] bArr3 = this.zzb;
        if (bArr3.length == 0) {
            return this.zza.zza(bArr, bArr2);
        }
        if (zzgzu.zzc(bArr3, bArr)) {
            return this.zza.zza(Arrays.copyOfRange(bArr, 5, bArr.length), bArr2);
        }
        throw new GeneralSecurityException("wrong prefix");
    }
}
