package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
final class zzbbj implements Runnable {
    final /* synthetic */ zzauq zza;
    final /* synthetic */ zzbbk zzb;

    zzbbj(zzbbk zzbbkVar, zzauq zzauqVar) {
        this.zzb = zzbbkVar;
        this.zza = zzauqVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zza.zza();
    }
}
