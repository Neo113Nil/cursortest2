package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes2.dex */
final class zzasm implements Runnable {
    final /* synthetic */ zzatm zza;
    final /* synthetic */ zzaso zzb;

    zzasm(zzaso zzasoVar, zzatm zzatmVar) {
        this.zzb = zzasoVar;
        this.zza = zzatmVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zza.zza();
    }
}
