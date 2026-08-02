package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
public final class zzgdw extends zzgfr {
    zzgdw() {
        super(zzgjq.class, new zzgdu(zzgaq.class));
    }

    @Override // com.google.android.gms.internal.ads.zzgfr
    public final zzgfq zza() {
        return new zzgdv(this, zzgjt.class);
    }

    @Override // com.google.android.gms.internal.ads.zzgfr
    public final /* synthetic */ zzgso zzb(zzgpw zzgpwVar) throws zzgrq {
        return zzgjq.zze(zzgpwVar, zzgqq.zza());
    }

    @Override // com.google.android.gms.internal.ads.zzgfr
    public final String zzc() {
        return "type.googleapis.com/google.crypto.tink.AesSivKey";
    }

    @Override // com.google.android.gms.internal.ads.zzgfr
    public final /* bridge */ /* synthetic */ void zzd(zzgso zzgsoVar) throws GeneralSecurityException {
        zzgjq zzgjqVar = (zzgjq) zzgsoVar;
        zzgoz.zzb(zzgjqVar.zza(), 0);
        if (zzgjqVar.zzf().zzd() == 64) {
            return;
        }
        throw new InvalidKeyException("invalid key size: " + zzgjqVar.zzf().zzd() + ". Valid keys must have 64 bytes.");
    }

    @Override // com.google.android.gms.internal.ads.zzgfr
    public final int zzf() {
        return 3;
    }
}
