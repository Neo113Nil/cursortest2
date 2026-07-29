package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes2.dex */
final class zzfzo extends zzgar {
    public zzfzo() {
        super(zzgea.class, new zzfzn(zzfwl.class));
    }

    @Override // com.google.android.gms.internal.ads.zzgar
    public final /* synthetic */ zzgly zzb(zzgjg zzgjgVar) throws zzgla {
        return zzgea.zzg(zzgjgVar, zzgka.zza());
    }

    @Override // com.google.android.gms.internal.ads.zzgar
    public final String zzc() {
        return "type.googleapis.com/google.crypto.tink.EciesAeadHkdfPublicKey";
    }

    @Override // com.google.android.gms.internal.ads.zzgar
    public final /* bridge */ /* synthetic */ void zzd(zzgly zzglyVar) throws GeneralSecurityException {
        zzgea zzgeaVar = (zzgea) zzglyVar;
        zzgik.zzb(zzgeaVar.zza(), 0);
        zzfzv.zza(zzgeaVar.zzc());
    }

    @Override // com.google.android.gms.internal.ads.zzgar
    public final int zzf() {
        return 5;
    }
}
