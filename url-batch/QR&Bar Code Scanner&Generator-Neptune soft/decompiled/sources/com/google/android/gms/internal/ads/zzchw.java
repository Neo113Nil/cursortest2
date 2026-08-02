package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
final class zzchw implements Runnable {
    final /* synthetic */ String zza;
    final /* synthetic */ String zzb;
    final /* synthetic */ zzcic zzc;

    zzchw(zzcic zzcicVar, String str, String str2) {
        this.zzc = zzcicVar;
        this.zza = str;
        this.zzb = str2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzcid zzcidVar;
        zzcid zzcidVar2;
        zzcic zzcicVar = this.zzc;
        zzcidVar = zzcicVar.zzr;
        if (zzcidVar != null) {
            zzcidVar2 = zzcicVar.zzr;
            zzcidVar2.zzb(this.zza, this.zzb);
        }
    }
}
