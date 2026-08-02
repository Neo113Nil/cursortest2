package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
public final class zzcpl implements zzgxi {
    private final zzgxv zza;
    private final zzgxv zzb;

    public zzcpl(zzgxv zzgxvVar, zzgxv zzgxvVar2) {
        this.zza = zzgxvVar;
        this.zzb = zzgxvVar2;
    }

    @Override // com.google.android.gms.internal.ads.zzgxv
    /* renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final zzcbn zzb() {
        Context zza = ((zzcos) this.zza).zza();
        zzfjw zzfjwVar = (zzfjw) this.zzb.zzb();
        com.google.android.gms.ads.internal.zzt.zzf().zzb(zza, zzcgv.zza(), zzfjwVar).zza("google.afma.request.getAdDictionary", zzbuh.zza, zzbuh.zza);
        zzbuk zzb = com.google.android.gms.ads.internal.zzt.zzf().zzb(zza, zzcgv.zza(), zzfjwVar);
        zzbue zzbueVar = zzbuh.zza;
        return new zzcbm(zza, zzb.zza("google.afma.sdkConstants.getSdkConstants", zzbueVar, zzbueVar));
    }
}
