package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
public final class zzgec extends zzggg {
    private static final byte[] zza = new byte[0];

    zzgec() {
        super(zzgkn.class, zzgkq.class, new zzgea(zzgar.class));
    }

    static /* bridge */ /* synthetic */ zzgfp zzh(int i, int i2, int i3, zzgbd zzgbdVar, byte[] bArr, int i4) {
        zzgkg zza2 = zzgkh.zza();
        zzgks zza3 = zzgkt.zza();
        int i5 = 4;
        zza3.zzb(4);
        zza3.zzc(5);
        zza3.zza(zzgpw.zzv(bArr));
        zzgkt zzgktVar = (zzgkt) zza3.zzam();
        zzgmb zza4 = zzgmc.zza();
        zza4.zza(zzgbdVar.zzb());
        zza4.zzb(zzgpw.zzv(zzgbdVar.zzc()));
        int zzd = zzgbdVar.zzd() - 1;
        if (zzd == 0) {
            i5 = 3;
        } else if (zzd != 1) {
            i5 = zzd != 2 ? 6 : 5;
        }
        zza4.zzc(i5);
        zzgmc zzgmcVar = (zzgmc) zza4.zzam();
        zzgkd zza5 = zzgke.zza();
        zza5.zza(zzgmcVar);
        zzgke zzgkeVar = (zzgke) zza5.zzam();
        zzgkj zzc = zzgkk.zzc();
        zzc.zzb(zzgktVar);
        zzc.zza(zzgkeVar);
        zzc.zzc(i3);
        zza2.zza((zzgkk) zzc.zzam());
        return new zzgfp((zzgkh) zza2.zzam(), i4);
    }

    @Override // com.google.android.gms.internal.ads.zzgfr
    public final zzgfq zza() {
        return new zzgeb(this, zzgkh.class);
    }

    @Override // com.google.android.gms.internal.ads.zzgfr
    public final /* synthetic */ zzgso zzb(zzgpw zzgpwVar) throws zzgrq {
        return zzgkn.zze(zzgpwVar, zzgqq.zza());
    }

    @Override // com.google.android.gms.internal.ads.zzgfr
    public final String zzc() {
        return "type.googleapis.com/google.crypto.tink.EciesAeadHkdfPrivateKey";
    }

    @Override // com.google.android.gms.internal.ads.zzgfr
    public final /* bridge */ /* synthetic */ void zzd(zzgso zzgsoVar) throws GeneralSecurityException {
        zzgkn zzgknVar = (zzgkn) zzgsoVar;
        if (zzgknVar.zzg().zzD()) {
            throw new GeneralSecurityException("invalid ECIES private key");
        }
        zzgoz.zzb(zzgknVar.zza(), 0);
        zzgel.zza(zzgknVar.zzf().zzc());
    }

    @Override // com.google.android.gms.internal.ads.zzgfr
    public final int zzf() {
        return 4;
    }
}
