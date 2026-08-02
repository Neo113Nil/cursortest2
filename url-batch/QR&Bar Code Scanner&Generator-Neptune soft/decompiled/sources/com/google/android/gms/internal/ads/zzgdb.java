package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
final class zzgdb extends zzgfq {
    final /* synthetic */ zzgdc zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzgdb(zzgdc zzgdcVar, Class cls) {
        super(cls);
        this.zza = zzgdcVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgfq
    public final /* bridge */ /* synthetic */ zzgso zza(zzgso zzgsoVar) throws GeneralSecurityException {
        zzgmx zzc = zzgmy.zzc();
        zzc.zza((zzgnb) zzgsoVar);
        zzc.zzb(0);
        return (zzgmy) zzc.zzam();
    }

    @Override // com.google.android.gms.internal.ads.zzgfq
    public final /* synthetic */ zzgso zzb(zzgpw zzgpwVar) throws zzgrq {
        return zzgnb.zze(zzgpwVar, zzgqq.zza());
    }

    @Override // com.google.android.gms.internal.ads.zzgfq
    public final /* bridge */ /* synthetic */ void zzd(zzgso zzgsoVar) throws GeneralSecurityException {
        zzgnb zzgnbVar = (zzgnb) zzgsoVar;
        if (zzgnbVar.zzf().isEmpty() || !zzgnbVar.zzg()) {
            throw new GeneralSecurityException("invalid key format: missing KEK URI or DEK template");
        }
    }
}
