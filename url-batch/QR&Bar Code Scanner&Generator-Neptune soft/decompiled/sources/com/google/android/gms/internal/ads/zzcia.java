package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
final class zzcia implements Runnable {
    final /* synthetic */ zzcic zza;

    zzcia(zzcic zzcicVar) {
        this.zza = zzcicVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzcid zzcidVar;
        boolean z;
        zzcid zzcidVar2;
        zzcid zzcidVar3;
        zzcic zzcicVar = this.zza;
        zzcidVar = zzcicVar.zzr;
        if (zzcidVar != null) {
            z = zzcicVar.zzs;
            if (!z) {
                zzcidVar3 = zzcicVar.zzr;
                zzcidVar3.zzg();
                this.zza.zzs = true;
            }
            zzcidVar2 = this.zza.zzr;
            zzcidVar2.zze();
        }
    }
}
