package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes2.dex */
public final class zzgai extends zzgas {
    public zzgai() {
        super(zzgfb.class, zzgfe.class, new zzgag(zzfwk.class));
    }

    static /* bridge */ /* synthetic */ zzgao zzg(int i, int i2, int i3, int i4) {
        zzgex zza = zzgey.zza();
        zza.zzc(3);
        zza.zzb(3);
        zza.zza(i3);
        zzgey zzgeyVar = (zzgey) zza.zzaj();
        zzgeu zza2 = zzgev.zza();
        zza2.zza(zzgeyVar);
        return new zzgao((zzgev) zza2.zzaj(), i4);
    }

    @Override // com.google.android.gms.internal.ads.zzgar
    public final zzgap zza() {
        return new zzgah(this, zzgev.class);
    }

    @Override // com.google.android.gms.internal.ads.zzgar
    public final /* synthetic */ zzgly zzb(zzgjg zzgjgVar) throws zzgla {
        return zzgfb.zze(zzgjgVar, zzgka.zza());
    }

    @Override // com.google.android.gms.internal.ads.zzgar
    public final String zzc() {
        return "type.googleapis.com/google.crypto.tink.HpkePrivateKey";
    }

    @Override // com.google.android.gms.internal.ads.zzgar
    public final /* bridge */ /* synthetic */ void zzd(zzgly zzglyVar) throws GeneralSecurityException {
        zzgfb zzgfbVar = (zzgfb) zzglyVar;
        if (zzgfbVar.zzg().zzD()) {
            throw new GeneralSecurityException("Private key is empty.");
        }
        if (!zzgfbVar.zzk()) {
            throw new GeneralSecurityException("Missing public key.");
        }
        zzgik.zzb(zzgfbVar.zza(), 0);
        zzgal.zza(zzgfbVar.zzf().zzc());
    }

    @Override // com.google.android.gms.internal.ads.zzgar
    public final int zzf() {
        return 4;
    }
}
