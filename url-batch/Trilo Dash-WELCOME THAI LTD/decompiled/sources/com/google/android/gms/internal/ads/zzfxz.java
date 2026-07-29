package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes2.dex */
public final class zzfxz extends zzgar {
    zzfxz() {
        super(zzgco.class, new zzfxx(zzfwd.class));
    }

    static /* bridge */ /* synthetic */ zzgao zzg(int i, int i2) {
        zzgcq zzc = zzgcr.zzc();
        zzc.zza(i);
        return new zzgao((zzgcr) zzc.zzaj(), i2);
    }

    @Override // com.google.android.gms.internal.ads.zzgar
    public final zzgap zza() {
        return new zzfxy(this, zzgcr.class);
    }

    @Override // com.google.android.gms.internal.ads.zzgar
    public final /* synthetic */ zzgly zzb(zzgjg zzgjgVar) throws zzgla {
        return zzgco.zze(zzgjgVar, zzgka.zza());
    }

    @Override // com.google.android.gms.internal.ads.zzgar
    public final String zzc() {
        return "type.googleapis.com/google.crypto.tink.AesGcmKey";
    }

    @Override // com.google.android.gms.internal.ads.zzgar
    public final /* bridge */ /* synthetic */ void zzd(zzgly zzglyVar) throws GeneralSecurityException {
        zzgco zzgcoVar = (zzgco) zzglyVar;
        zzgik.zzb(zzgcoVar.zza(), 0);
        zzgik.zza(zzgcoVar.zzf().zzd());
    }

    @Override // com.google.android.gms.internal.ads.zzgar
    public final int zze() {
        return 2;
    }

    @Override // com.google.android.gms.internal.ads.zzgar
    public final int zzf() {
        return 3;
    }
}
