package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes2.dex */
final class zzcgt implements Runnable {
    final /* synthetic */ zzcgv zza;

    zzcgt(zzcgv zzcgvVar) {
        this.zza = zzcgvVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzcgw zzcgwVar;
        boolean z;
        zzcgw zzcgwVar2;
        zzcgw zzcgwVar3;
        zzcgv zzcgvVar = this.zza;
        zzcgwVar = zzcgvVar.zzq;
        if (zzcgwVar != null) {
            z = zzcgvVar.zzr;
            if (!z) {
                zzcgwVar3 = zzcgvVar.zzq;
                zzcgwVar3.zzg();
                this.zza.zzr = true;
            }
            zzcgwVar2 = this.zza.zzq;
            zzcgwVar2.zze();
        }
    }
}
