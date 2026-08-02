package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
public final class zzgfa extends zzggg {
    public zzgfa() {
        super(zzglr.class, zzglu.class, new zzgey(zzgar.class));
    }

    static /* bridge */ /* synthetic */ zzgfp zzg(int i, int i2, int i3, int i4) {
        zzgln zza = zzglo.zza();
        zza.zzc(i);
        zza.zzb(i2);
        zza.zza(i3);
        zzglo zzgloVar = (zzglo) zza.zzam();
        zzglk zza2 = zzgll.zza();
        zza2.zza(zzgloVar);
        return new zzgfp((zzgll) zza2.zzam(), i4);
    }

    @Override // com.google.android.gms.internal.ads.zzgfr
    public final zzgfq zza() {
        return new zzgez(this, zzgll.class);
    }

    @Override // com.google.android.gms.internal.ads.zzgfr
    public final /* synthetic */ zzgso zzb(zzgpw zzgpwVar) throws zzgrq {
        return zzglr.zze(zzgpwVar, zzgqq.zza());
    }

    @Override // com.google.android.gms.internal.ads.zzgfr
    public final String zzc() {
        return "type.googleapis.com/google.crypto.tink.HpkePrivateKey";
    }

    @Override // com.google.android.gms.internal.ads.zzgfr
    public final /* bridge */ /* synthetic */ void zzd(zzgso zzgsoVar) throws GeneralSecurityException {
        zzglr zzglrVar = (zzglr) zzgsoVar;
        if (zzglrVar.zzg().zzD()) {
            throw new GeneralSecurityException("Private key is empty.");
        }
        if (!zzglrVar.zzk()) {
            throw new GeneralSecurityException("Missing public key.");
        }
        zzgoz.zzb(zzglrVar.zza(), 0);
        zzgfd.zza(zzglrVar.zzf().zzc());
    }

    @Override // com.google.android.gms.internal.ads.zzgfr
    public final int zzf() {
        return 4;
    }
}
