package com.google.android.gms.internal.ads;

import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
/* loaded from: classes5.dex */
final class zzcmn implements zzgoq {
    final /* synthetic */ zzcmu zza;

    zzcmn(zzcmu zzcmuVar) {
        Objects.requireNonNull(zzcmuVar);
        this.zza = zzcmuVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgoq
    public final void zza(Throwable th) {
    }

    @Override // com.google.android.gms.internal.ads.zzgoq
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        zzcmu zzcmuVar = this.zza;
        zzcmuVar.zzu().zzb(zzcmuVar.zzt().zzb(zzcmuVar.zzr(), zzcmuVar.zzs(), false, "", (String) obj, zzcmuVar.zzs().zzc, null), true == com.google.android.gms.ads.internal.zzt.zzh().zzs(zzcmuVar.zzq()) ? 2 : 1);
    }
}
