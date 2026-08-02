package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
final class zzchy implements Runnable {
    final /* synthetic */ int zza;
    final /* synthetic */ int zzb;
    final /* synthetic */ zzcic zzc;

    zzchy(zzcic zzcicVar, int i, int i2) {
        this.zzc = zzcicVar;
        this.zza = i;
        this.zzb = i2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzcid zzcidVar;
        zzcid zzcidVar2;
        zzcic zzcicVar = this.zzc;
        zzcidVar = zzcicVar.zzr;
        if (zzcidVar != null) {
            zzcidVar2 = zzcicVar.zzr;
            zzcidVar2.zzj(this.zza, this.zzb);
        }
    }
}
