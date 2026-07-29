package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes2.dex */
public final class zzfxw extends zzgar {
    zzfxw() {
        super(zzgcf.class, new zzfxu(zzfwd.class));
    }

    static /* bridge */ /* synthetic */ zzgao zzg(int i, int i2, int i3) {
        zzgch zzc = zzgci.zzc();
        zzc.zza(i);
        zzgck zzc2 = zzgcl.zzc();
        zzc2.zza(16);
        zzc.zzb((zzgcl) zzc2.zzaj());
        return new zzgao((zzgci) zzc.zzaj(), i3);
    }

    @Override // com.google.android.gms.internal.ads.zzgar
    public final zzgap zza() {
        return new zzfxv(this, zzgci.class);
    }

    @Override // com.google.android.gms.internal.ads.zzgar
    public final /* synthetic */ zzgly zzb(zzgjg zzgjgVar) throws zzgla {
        return zzgcf.zze(zzgjgVar, zzgka.zza());
    }

    @Override // com.google.android.gms.internal.ads.zzgar
    public final String zzc() {
        return "type.googleapis.com/google.crypto.tink.AesEaxKey";
    }

    @Override // com.google.android.gms.internal.ads.zzgar
    public final /* bridge */ /* synthetic */ void zzd(zzgly zzglyVar) throws GeneralSecurityException {
        zzgcf zzgcfVar = (zzgcf) zzglyVar;
        zzgik.zzb(zzgcfVar.zza(), 0);
        zzgik.zza(zzgcfVar.zzg().zzd());
        if (zzgcfVar.zzf().zza() != 12 && zzgcfVar.zzf().zza() != 16) {
            throw new GeneralSecurityException("invalid IV size; acceptable values have 12 or 16 bytes");
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgar
    public final int zzf() {
        return 3;
    }
}
