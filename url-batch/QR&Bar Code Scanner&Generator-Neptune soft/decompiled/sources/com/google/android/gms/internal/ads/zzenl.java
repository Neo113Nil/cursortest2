package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
final class zzenl implements zzeou {
    final /* synthetic */ zzenm zza;

    zzenl(zzenm zzenmVar) {
        this.zza = zzenmVar;
    }

    @Override // com.google.android.gms.internal.ads.zzeou
    public final void zza() {
        synchronized (this.zza) {
            this.zza.zzh = null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzeou
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        zzcxc zzcxcVar;
        zzcxc zzcxcVar2;
        zzcxc zzcxcVar3;
        zzcxc zzcxcVar4 = (zzcxc) obj;
        synchronized (this.zza) {
            zzenm zzenmVar = this.zza;
            zzcxcVar = zzenmVar.zzh;
            if (zzcxcVar != null) {
                zzcxcVar3 = zzenmVar.zzh;
                zzcxcVar3.zzV();
            }
            this.zza.zzh = zzcxcVar4;
            zzcxcVar2 = this.zza.zzh;
            zzcxcVar2.zzW();
        }
    }
}
