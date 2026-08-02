package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
final class zzcam implements Runnable {
    final /* synthetic */ zzcao zza;

    zzcam(zzcao zzcaoVar) {
        this.zza = zzcaoVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzcap zzcapVar;
        boolean z;
        zzcap zzcapVar2;
        zzcap zzcapVar3;
        zzcao zzcaoVar = this.zza;
        zzcapVar = zzcaoVar.zzq;
        if (zzcapVar != null) {
            z = zzcaoVar.zzr;
            if (!z) {
                zzcapVar3 = zzcaoVar.zzq;
                zzcapVar3.zzg();
                this.zza.zzr = true;
            }
            zzcapVar2 = this.zza.zzq;
            zzcapVar2.zze();
        }
    }
}
