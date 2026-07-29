package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes2.dex */
public final class zzfxq extends zzgar {
    zzfxq() {
        super(zzgbq.class, new zzfxo(zzfwd.class));
    }

    static /* bridge */ /* synthetic */ zzgao zzg(int i, int i2, int i3, int i4, int i5, int i6) {
        zzgby zzc = zzgbz.zzc();
        zzgcb zzc2 = zzgcc.zzc();
        zzc2.zza(16);
        zzc.zzb((zzgcc) zzc2.zzaj());
        zzc.zza(i);
        zzgbz zzgbzVar = (zzgbz) zzc.zzaj();
        zzgem zzc3 = zzgen.zzc();
        zzgep zzc4 = zzgeq.zzc();
        zzc4.zzb(5);
        zzc4.zza(i4);
        zzc3.zzb((zzgeq) zzc4.zzaj());
        zzc3.zza(32);
        zzgen zzgenVar = (zzgen) zzc3.zzaj();
        zzgbs zza = zzgbt.zza();
        zza.zza(zzgbzVar);
        zza.zzb(zzgenVar);
        return new zzgao((zzgbt) zza.zzaj(), i6);
    }

    @Override // com.google.android.gms.internal.ads.zzgar
    public final zzgap zza() {
        return new zzfxp(this, zzgbt.class);
    }

    @Override // com.google.android.gms.internal.ads.zzgar
    public final /* synthetic */ zzgly zzb(zzgjg zzgjgVar) throws zzgla {
        return zzgbq.zze(zzgjgVar, zzgka.zza());
    }

    @Override // com.google.android.gms.internal.ads.zzgar
    public final String zzc() {
        return "type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey";
    }

    @Override // com.google.android.gms.internal.ads.zzgar
    public final /* bridge */ /* synthetic */ void zzd(zzgly zzglyVar) throws GeneralSecurityException {
        zzgbq zzgbqVar = (zzgbq) zzglyVar;
        zzgik.zzb(zzgbqVar.zza(), 0);
        new zzfxt();
        zzfxt.zzh(zzgbqVar.zzf());
        new zzgaz();
        zzgaz.zzh(zzgbqVar.zzg());
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
