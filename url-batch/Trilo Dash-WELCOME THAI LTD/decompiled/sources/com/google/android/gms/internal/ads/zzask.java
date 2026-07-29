package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes2.dex */
final class zzask implements Runnable {
    final /* synthetic */ zzars zza;
    final /* synthetic */ zzaso zzb;

    zzask(zzaso zzasoVar, zzars zzarsVar) {
        this.zzb = zzasoVar;
        this.zza = zzarsVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzasp zzaspVar;
        zzaspVar = this.zzb.zzb;
        zzaspVar.zzh(this.zza);
    }
}
