package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
final class zzfhw implements zzfzc {
    final /* synthetic */ zzfhm zza;
    final /* synthetic */ zzfhy zzb;

    zzfhw(zzfhy zzfhyVar, zzfhm zzfhmVar) {
        this.zzb = zzfhyVar;
        this.zza = zzfhmVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfzc
    public final void zza(Throwable th) {
        zzfia zzfiaVar;
        zzfiaVar = this.zzb.zza.zzd;
        zzfiaVar.zzb(this.zza, th);
    }

    @Override // com.google.android.gms.internal.ads.zzfzc
    public final void zzb(Object obj) {
        zzfia zzfiaVar;
        zzfiaVar = this.zzb.zza.zzd;
        zzfiaVar.zzd(this.zza);
    }
}
