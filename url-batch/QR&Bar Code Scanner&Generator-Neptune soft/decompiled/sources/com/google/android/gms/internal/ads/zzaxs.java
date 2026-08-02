package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
final class zzaxs implements Runnable {
    final /* synthetic */ zzaxy zza;

    zzaxs(zzaxy zzaxyVar) {
        this.zza = zzaxyVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z;
        zzayb zzaybVar;
        zzaxy zzaxyVar = this.zza;
        z = zzaxyVar.zzF;
        if (z) {
            return;
        }
        zzaybVar = zzaxyVar.zzo;
        zzaybVar.zze(zzaxyVar);
    }
}
