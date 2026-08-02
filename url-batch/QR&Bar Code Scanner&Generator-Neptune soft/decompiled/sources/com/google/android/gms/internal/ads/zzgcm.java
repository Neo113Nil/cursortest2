package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
public final class zzgcm extends zzgfr {
    zzgcm() {
        super(zzgiv.class, new zzgck(zzgak.class));
    }

    static /* bridge */ /* synthetic */ zzgfp zzg(int i, int i2, int i3) {
        zzgix zzc = zzgiy.zzc();
        zzc.zza(i);
        zzgja zzc2 = zzgjb.zzc();
        zzc2.zza(16);
        zzc.zzb((zzgjb) zzc2.zzam());
        return new zzgfp((zzgiy) zzc.zzam(), i3);
    }

    @Override // com.google.android.gms.internal.ads.zzgfr
    public final zzgfq zza() {
        return new zzgcl(this, zzgiy.class);
    }

    @Override // com.google.android.gms.internal.ads.zzgfr
    public final /* synthetic */ zzgso zzb(zzgpw zzgpwVar) throws zzgrq {
        return zzgiv.zze(zzgpwVar, zzgqq.zza());
    }

    @Override // com.google.android.gms.internal.ads.zzgfr
    public final String zzc() {
        return "type.googleapis.com/google.crypto.tink.AesEaxKey";
    }

    @Override // com.google.android.gms.internal.ads.zzgfr
    public final /* bridge */ /* synthetic */ void zzd(zzgso zzgsoVar) throws GeneralSecurityException {
        zzgiv zzgivVar = (zzgiv) zzgsoVar;
        zzgoz.zzb(zzgivVar.zza(), 0);
        zzgoz.zza(zzgivVar.zzg().zzd());
        if (zzgivVar.zzf().zza() != 12 && zzgivVar.zzf().zza() != 16) {
            throw new GeneralSecurityException("invalid IV size; acceptable values have 12 or 16 bytes");
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgfr
    public final int zzf() {
        return 3;
    }
}
