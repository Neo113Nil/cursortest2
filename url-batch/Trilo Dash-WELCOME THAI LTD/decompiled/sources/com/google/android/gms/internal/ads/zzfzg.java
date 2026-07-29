package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes2.dex */
public final class zzfzg extends zzgar {
    zzfzg() {
        super(zzgda.class, new zzfze(zzfwj.class));
    }

    @Override // com.google.android.gms.internal.ads.zzgar
    public final zzgap zza() {
        return new zzfzf(this, zzgdd.class);
    }

    @Override // com.google.android.gms.internal.ads.zzgar
    public final /* synthetic */ zzgly zzb(zzgjg zzgjgVar) throws zzgla {
        return zzgda.zze(zzgjgVar, zzgka.zza());
    }

    @Override // com.google.android.gms.internal.ads.zzgar
    public final String zzc() {
        return "type.googleapis.com/google.crypto.tink.AesSivKey";
    }

    @Override // com.google.android.gms.internal.ads.zzgar
    public final /* bridge */ /* synthetic */ void zzd(zzgly zzglyVar) throws GeneralSecurityException {
        zzgda zzgdaVar = (zzgda) zzglyVar;
        zzgik.zzb(zzgdaVar.zza(), 0);
        if (zzgdaVar.zzf().zzd() == 64) {
            return;
        }
        throw new InvalidKeyException("invalid key size: " + zzgdaVar.zzf().zzd() + ". Valid keys must have 64 bytes.");
    }

    @Override // com.google.android.gms.internal.ads.zzgar
    public final int zzf() {
        return 3;
    }
}
