package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import javax.crypto.spec.SecretKeySpec;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes2.dex */
final class zzgax extends zzgaq {
    zzgax(Class cls) {
        super(cls);
    }

    @Override // com.google.android.gms.internal.ads.zzgaq
    public final /* bridge */ /* synthetic */ Object zza(zzgly zzglyVar) throws GeneralSecurityException {
        zzgek zzgekVar = (zzgek) zzglyVar;
        int zzg = zzgekVar.zzg().zzg();
        SecretKeySpec secretKeySpec = new SecretKeySpec(zzgekVar.zzh().zzE(), "HMAC");
        int zza = zzgekVar.zzg().zza();
        int i = zzg - 2;
        if (i == 1) {
            return new zzgig(new zzgif("HMACSHA1", secretKeySpec), zza);
        }
        if (i == 2) {
            return new zzgig(new zzgif("HMACSHA384", secretKeySpec), zza);
        }
        if (i == 3) {
            return new zzgig(new zzgif("HMACSHA256", secretKeySpec), zza);
        }
        if (i == 4) {
            return new zzgig(new zzgif("HMACSHA512", secretKeySpec), zza);
        }
        if (i == 5) {
            return new zzgig(new zzgif("HMACSHA224", secretKeySpec), zza);
        }
        throw new GeneralSecurityException("unknown hash");
    }
}
