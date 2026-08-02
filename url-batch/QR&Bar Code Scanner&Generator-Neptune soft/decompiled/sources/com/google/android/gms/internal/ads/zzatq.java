package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
final class zzatq implements Runnable {
    final /* synthetic */ zzauq zza;
    final /* synthetic */ zzats zzb;

    zzatq(zzats zzatsVar, zzauq zzauqVar) {
        this.zzb = zzatsVar;
        this.zza = zzauqVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zza.zza();
    }
}
