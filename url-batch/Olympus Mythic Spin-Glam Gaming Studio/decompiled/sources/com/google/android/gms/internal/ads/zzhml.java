package com.google.android.gms.internal.ads;

import java.math.BigInteger;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes6.dex */
final class zzhml {
    static final zzhml zzd;
    final BigInteger zza;
    final BigInteger zzb;
    final BigInteger zzc;

    static {
        BigInteger bigInteger = BigInteger.ONE;
        zzd = new zzhml(bigInteger, bigInteger, BigInteger.ZERO);
    }

    zzhml(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3) {
        this.zza = bigInteger;
        this.zzb = bigInteger2;
        this.zzc = bigInteger3;
    }

    final boolean zza() {
        return this.zzc.equals(BigInteger.ZERO);
    }
}
