package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
final class zzgee extends zzgfr {
    public zzgee() {
        super(zzgkq.class, new zzged(zzgas.class));
    }

    @Override // com.google.android.gms.internal.ads.zzgfr
    public final /* synthetic */ zzgso zzb(zzgpw zzgpwVar) throws zzgrq {
        return zzgkq.zzg(zzgpwVar, zzgqq.zza());
    }

    @Override // com.google.android.gms.internal.ads.zzgfr
    public final String zzc() {
        return "type.googleapis.com/google.crypto.tink.EciesAeadHkdfPublicKey";
    }

    @Override // com.google.android.gms.internal.ads.zzgfr
    public final /* bridge */ /* synthetic */ void zzd(zzgso zzgsoVar) throws GeneralSecurityException {
        zzgkq zzgkqVar = (zzgkq) zzgsoVar;
        zzgoz.zzb(zzgkqVar.zza(), 0);
        zzgel.zza(zzgkqVar.zzc());
    }

    @Override // com.google.android.gms.internal.ads.zzgfr
    public final int zzf() {
        return 5;
    }
}
