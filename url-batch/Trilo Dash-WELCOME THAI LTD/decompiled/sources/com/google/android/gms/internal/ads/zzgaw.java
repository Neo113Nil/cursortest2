package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes2.dex */
public final class zzgaw extends zzgar {
    zzgaw() {
        super(zzgbh.class, new zzgau(zzfwv.class));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void zzm(zzgbn zzgbnVar) throws GeneralSecurityException {
        if (zzgbnVar.zza() < 10) {
            throw new GeneralSecurityException("tag size too short");
        }
        if (zzgbnVar.zza() > 16) {
            throw new GeneralSecurityException("tag size too long");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void zzn(int i) throws GeneralSecurityException {
        if (i != 32) {
            throw new GeneralSecurityException("AesCmacKey size wrong, must be 32 bytes");
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgar
    public final zzgap zza() {
        return new zzgav(this, zzgbk.class);
    }

    @Override // com.google.android.gms.internal.ads.zzgar
    public final /* synthetic */ zzgly zzb(zzgjg zzgjgVar) throws zzgla {
        return zzgbh.zze(zzgjgVar, zzgka.zza());
    }

    @Override // com.google.android.gms.internal.ads.zzgar
    public final String zzc() {
        return "type.googleapis.com/google.crypto.tink.AesCmacKey";
    }

    @Override // com.google.android.gms.internal.ads.zzgar
    public final /* bridge */ /* synthetic */ void zzd(zzgly zzglyVar) throws GeneralSecurityException {
        zzgbh zzgbhVar = (zzgbh) zzglyVar;
        zzgik.zzb(zzgbhVar.zza(), 0);
        zzn(zzgbhVar.zzg().zzd());
        zzm(zzgbhVar.zzf());
    }

    @Override // com.google.android.gms.internal.ads.zzgar
    public final int zzf() {
        return 3;
    }
}
