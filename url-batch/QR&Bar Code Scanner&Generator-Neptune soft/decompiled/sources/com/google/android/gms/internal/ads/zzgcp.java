package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
public final class zzgcp extends zzgfr {
    zzgcp() {
        super(zzgje.class, new zzgcn(zzgak.class));
    }

    static /* bridge */ /* synthetic */ zzgfp zzg(int i, int i2) {
        zzgjg zzc = zzgjh.zzc();
        zzc.zza(i);
        return new zzgfp((zzgjh) zzc.zzam(), i2);
    }

    @Override // com.google.android.gms.internal.ads.zzgfr
    public final zzgfq zza() {
        return new zzgco(this, zzgjh.class);
    }

    @Override // com.google.android.gms.internal.ads.zzgfr
    public final /* synthetic */ zzgso zzb(zzgpw zzgpwVar) throws zzgrq {
        return zzgje.zze(zzgpwVar, zzgqq.zza());
    }

    @Override // com.google.android.gms.internal.ads.zzgfr
    public final String zzc() {
        return "type.googleapis.com/google.crypto.tink.AesGcmKey";
    }

    @Override // com.google.android.gms.internal.ads.zzgfr
    public final /* bridge */ /* synthetic */ void zzd(zzgso zzgsoVar) throws GeneralSecurityException {
        zzgje zzgjeVar = (zzgje) zzgsoVar;
        zzgoz.zzb(zzgjeVar.zza(), 0);
        zzgoz.zza(zzgjeVar.zzf().zzd());
    }

    @Override // com.google.android.gms.internal.ads.zzgfr
    public final int zze() {
        return 2;
    }

    @Override // com.google.android.gms.internal.ads.zzgfr
    public final int zzf() {
        return 3;
    }
}
