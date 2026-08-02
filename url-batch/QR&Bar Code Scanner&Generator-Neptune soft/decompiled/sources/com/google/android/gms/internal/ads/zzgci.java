package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
final class zzgci extends zzgfq {
    final /* synthetic */ zzgcj zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzgci(zzgcj zzgcjVar, Class cls) {
        super(cls);
        this.zza = zzgcjVar;
    }

    public static final zzgim zzf(zzgip zzgipVar) throws GeneralSecurityException {
        zzgil zzc = zzgim.zzc();
        zzc.zzb(zzgipVar.zzg());
        zzc.zza(zzgpw.zzv(zzgox.zza(zzgipVar.zza())));
        zzc.zzc(0);
        return (zzgim) zzc.zzam();
    }

    @Override // com.google.android.gms.internal.ads.zzgfq
    public final /* bridge */ /* synthetic */ zzgso zza(zzgso zzgsoVar) throws GeneralSecurityException {
        return zzf((zzgip) zzgsoVar);
    }

    @Override // com.google.android.gms.internal.ads.zzgfq
    public final /* synthetic */ zzgso zzb(zzgpw zzgpwVar) throws zzgrq {
        return zzgip.zzf(zzgpwVar, zzgqq.zza());
    }

    @Override // com.google.android.gms.internal.ads.zzgfq
    /* renamed from: zze, reason: merged with bridge method [inline-methods] */
    public final void zzd(zzgip zzgipVar) throws GeneralSecurityException {
        zzgoz.zza(zzgipVar.zza());
        zzgcj zzgcjVar = this.zza;
        zzgcj.zzm(zzgipVar.zzg());
    }
}
