package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
public final class zzggu extends zzgfr {
    zzggu() {
        super(zzghx.class, new zzggs(zzgbj.class));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void zzm(zzgid zzgidVar) throws GeneralSecurityException {
        if (zzgidVar.zza() < 10) {
            throw new GeneralSecurityException("tag size too short");
        }
        if (zzgidVar.zza() > 16) {
            throw new GeneralSecurityException("tag size too long");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void zzn(int i) throws GeneralSecurityException {
        if (i != 32) {
            throw new GeneralSecurityException("AesCmacKey size wrong, must be 32 bytes");
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgfr
    public final zzgfq zza() {
        return new zzggt(this, zzgia.class);
    }

    @Override // com.google.android.gms.internal.ads.zzgfr
    public final /* synthetic */ zzgso zzb(zzgpw zzgpwVar) throws zzgrq {
        return zzghx.zze(zzgpwVar, zzgqq.zza());
    }

    @Override // com.google.android.gms.internal.ads.zzgfr
    public final String zzc() {
        return "type.googleapis.com/google.crypto.tink.AesCmacKey";
    }

    @Override // com.google.android.gms.internal.ads.zzgfr
    public final /* bridge */ /* synthetic */ void zzd(zzgso zzgsoVar) throws GeneralSecurityException {
        zzghx zzghxVar = (zzghx) zzgsoVar;
        zzgoz.zzb(zzghxVar.zza(), 0);
        zzn(zzghxVar.zzg().zzd());
        zzm(zzghxVar.zzf());
    }

    @Override // com.google.android.gms.internal.ads.zzgfr
    public final int zzf() {
        return 3;
    }
}
