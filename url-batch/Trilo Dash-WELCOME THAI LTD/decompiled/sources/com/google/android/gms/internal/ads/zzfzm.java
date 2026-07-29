package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes2.dex */
public final class zzfzm extends zzgas {
    private static final byte[] zza = new byte[0];

    zzfzm() {
        super(zzgdx.class, zzgea.class, new zzfzk(zzfwk.class));
    }

    static /* bridge */ /* synthetic */ zzgao zzh(int i, int i2, int i3, zzfwp zzfwpVar, byte[] bArr, int i4) {
        zzgdq zza2 = zzgdr.zza();
        zzgec zza3 = zzged.zza();
        int i5 = 4;
        zza3.zzb(4);
        zza3.zzc(5);
        zza3.zza(zzgjg.zzv(bArr));
        zzged zzgedVar = (zzged) zza3.zzaj();
        zzgfl zza4 = zzgfm.zza();
        zza4.zza(zzfwpVar.zzb());
        zza4.zzb(zzgjg.zzv(zzfwpVar.zzc()));
        int zzd = zzfwpVar.zzd() - 1;
        if (zzd == 0) {
            i5 = 3;
        } else if (zzd != 1) {
            i5 = zzd != 2 ? 6 : 5;
        }
        zza4.zzc(i5);
        zzgfm zzgfmVar = (zzgfm) zza4.zzaj();
        zzgdn zza5 = zzgdo.zza();
        zza5.zza(zzgfmVar);
        zzgdo zzgdoVar = (zzgdo) zza5.zzaj();
        zzgdt zzc = zzgdu.zzc();
        zzc.zzb(zzgedVar);
        zzc.zza(zzgdoVar);
        zzc.zzc(i3);
        zza2.zza((zzgdu) zzc.zzaj());
        return new zzgao((zzgdr) zza2.zzaj(), i4);
    }

    @Override // com.google.android.gms.internal.ads.zzgar
    public final zzgap zza() {
        return new zzfzl(this, zzgdr.class);
    }

    @Override // com.google.android.gms.internal.ads.zzgar
    public final /* synthetic */ zzgly zzb(zzgjg zzgjgVar) throws zzgla {
        return zzgdx.zze(zzgjgVar, zzgka.zza());
    }

    @Override // com.google.android.gms.internal.ads.zzgar
    public final String zzc() {
        return "type.googleapis.com/google.crypto.tink.EciesAeadHkdfPrivateKey";
    }

    @Override // com.google.android.gms.internal.ads.zzgar
    public final /* bridge */ /* synthetic */ void zzd(zzgly zzglyVar) throws GeneralSecurityException {
        zzgdx zzgdxVar = (zzgdx) zzglyVar;
        if (zzgdxVar.zzg().zzD()) {
            throw new GeneralSecurityException("invalid ECIES private key");
        }
        zzgik.zzb(zzgdxVar.zza(), 0);
        zzfzv.zza(zzgdxVar.zzf().zzc());
    }

    @Override // com.google.android.gms.internal.ads.zzgar
    public final int zzf() {
        return 4;
    }
}
