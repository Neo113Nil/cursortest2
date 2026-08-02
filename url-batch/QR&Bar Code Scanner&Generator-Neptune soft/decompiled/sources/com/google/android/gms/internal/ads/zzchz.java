package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
final class zzchz implements Runnable {
    final /* synthetic */ zzcic zza;

    zzchz(zzcic zzcicVar) {
        this.zza = zzcicVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzcid zzcidVar;
        zzcid zzcidVar2;
        zzcid zzcidVar3;
        zzcic zzcicVar = this.zza;
        zzcidVar = zzcicVar.zzr;
        if (zzcidVar != null) {
            zzcidVar2 = zzcicVar.zzr;
            zzcidVar2.zzd();
            zzcidVar3 = this.zza.zzr;
            zzcidVar3.zzi();
        }
    }
}
