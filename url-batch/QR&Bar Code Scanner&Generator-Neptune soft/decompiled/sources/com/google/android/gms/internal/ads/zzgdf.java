package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
public final class zzgdf extends zzgfr {
    zzgdf() {
        super(zzgnj.class, new zzgdd(zzgak.class));
    }

    @Override // com.google.android.gms.internal.ads.zzgfr
    public final zzgfq zza() {
        return new zzgde(this, zzgnm.class);
    }

    @Override // com.google.android.gms.internal.ads.zzgfr
    public final /* synthetic */ zzgso zzb(zzgpw zzgpwVar) throws zzgrq {
        return zzgnj.zze(zzgpwVar, zzgqq.zza());
    }

    @Override // com.google.android.gms.internal.ads.zzgfr
    public final String zzc() {
        return "type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key";
    }

    @Override // com.google.android.gms.internal.ads.zzgfr
    public final /* bridge */ /* synthetic */ void zzd(zzgso zzgsoVar) throws GeneralSecurityException {
        zzgnj zzgnjVar = (zzgnj) zzgsoVar;
        zzgoz.zzb(zzgnjVar.zza(), 0);
        if (zzgnjVar.zzf().zzd() != 32) {
            throw new GeneralSecurityException("invalid XChaCha20Poly1305Key: incorrect key length");
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgfr
    public final int zzf() {
        return 3;
    }
}
