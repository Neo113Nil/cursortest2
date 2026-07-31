package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes6.dex */
public final class zzhpk {
    private Integer zza = null;
    private Integer zzb = null;
    private zzhpl zzc = zzhpl.zzd;

    private zzhpk() {
    }

    /* synthetic */ zzhpk(byte[] bArr) {
    }

    public final zzhpk zzc(zzhpl zzhplVar) {
        this.zzc = zzhplVar;
        return this;
    }

    public final zzhpm zzd() throws GeneralSecurityException {
        Integer num = this.zza;
        if (num == null) {
            throw new GeneralSecurityException("key size not set");
        }
        if (this.zzb == null) {
            throw new GeneralSecurityException("tag size not set");
        }
        if (this.zzc != null) {
            return new zzhpm(num.intValue(), this.zzb.intValue(), this.zzc, null);
        }
        throw new GeneralSecurityException("variant not set");
    }

    public final zzhpk zza(int i) throws GeneralSecurityException {
        if (i != 16 && i != 32) {
            throw new InvalidAlgorithmParameterException(String.format("Invalid key size %d; only 128-bit and 256-bit AES keys are supported", Integer.valueOf(i * 8)));
        }
        this.zza = Integer.valueOf(i);
        return this;
    }

    public final zzhpk zzb(int i) throws GeneralSecurityException {
        if (i >= 10 && i <= 16) {
            this.zzb = Integer.valueOf(i);
            return this;
        }
        StringBuilder sb = new StringBuilder(String.valueOf(i).length() + 40);
        sb.append("Invalid tag size for AesCmacParameters: ");
        sb.append(i);
        throw new GeneralSecurityException(sb.toString());
    }
}
