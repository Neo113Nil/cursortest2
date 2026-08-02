package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
public final class zzgfc extends zzgfr {
    public zzgfc() {
        super(zzglu.class, new zzgfb(zzgas.class));
    }

    @Override // com.google.android.gms.internal.ads.zzgfr
    public final /* synthetic */ zzgso zzb(zzgpw zzgpwVar) throws zzgrq {
        return zzglu.zzg(zzgpwVar, zzgqq.zza());
    }

    @Override // com.google.android.gms.internal.ads.zzgfr
    public final String zzc() {
        return "type.googleapis.com/google.crypto.tink.HpkePublicKey";
    }

    @Override // com.google.android.gms.internal.ads.zzgfr
    public final /* bridge */ /* synthetic */ void zzd(zzgso zzgsoVar) throws GeneralSecurityException {
        zzglu zzgluVar = (zzglu) zzgsoVar;
        zzgoz.zzb(zzgluVar.zza(), 0);
        if (!zzgluVar.zzl()) {
            throw new GeneralSecurityException("Missing HPKE key params.");
        }
        zzgfd.zza(zzgluVar.zzc());
    }

    @Override // com.google.android.gms.internal.ads.zzgfr
    public final int zzf() {
        return 5;
    }
}
