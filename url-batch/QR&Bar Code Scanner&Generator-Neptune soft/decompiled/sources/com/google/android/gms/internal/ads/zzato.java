package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
final class zzato implements Runnable {
    final /* synthetic */ zzasw zza;
    final /* synthetic */ zzats zzb;

    zzato(zzats zzatsVar, zzasw zzaswVar) {
        this.zzb = zzatsVar;
        this.zza = zzaswVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzatt zzattVar;
        zzattVar = this.zzb.zzb;
        zzattVar.zzh(this.zza);
    }
}
