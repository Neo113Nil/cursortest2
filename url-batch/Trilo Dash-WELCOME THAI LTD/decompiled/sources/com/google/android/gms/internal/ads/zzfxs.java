package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes2.dex */
final class zzfxs extends zzgap {
    final /* synthetic */ zzfxt zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzfxs(zzfxt zzfxtVar, Class cls) {
        super(cls);
        this.zza = zzfxtVar;
    }

    public static final zzgbw zzf(zzgbz zzgbzVar) throws GeneralSecurityException {
        zzgbv zzc = zzgbw.zzc();
        zzc.zzb(zzgbzVar.zzg());
        zzc.zza(zzgjg.zzv(zzgii.zza(zzgbzVar.zza())));
        zzc.zzc(0);
        return (zzgbw) zzc.zzaj();
    }

    @Override // com.google.android.gms.internal.ads.zzgap
    public final /* bridge */ /* synthetic */ zzgly zza(zzgly zzglyVar) throws GeneralSecurityException {
        return zzf((zzgbz) zzglyVar);
    }

    @Override // com.google.android.gms.internal.ads.zzgap
    public final /* synthetic */ zzgly zzb(zzgjg zzgjgVar) throws zzgla {
        return zzgbz.zzf(zzgjgVar, zzgka.zza());
    }

    @Override // com.google.android.gms.internal.ads.zzgap
    /* renamed from: zze, reason: merged with bridge method [inline-methods] */
    public final void zzd(zzgbz zzgbzVar) throws GeneralSecurityException {
        zzgik.zza(zzgbzVar.zza());
        zzfxt zzfxtVar = this.zza;
        zzfxt.zzm(zzgbzVar.zzg());
    }
}
