package com.google.android.gms.internal.ads;

import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
final class zzdzd extends zzccr {
    final /* synthetic */ zzdzf zza;

    zzdzd(zzdzf zzdzfVar) {
        this.zza = zzdzfVar;
    }

    @Override // com.google.android.gms.internal.ads.zzccs
    public final void zze(int i) throws RemoteException {
        zzdyu zzdyuVar;
        long j;
        zzdzf zzdzfVar = this.zza;
        zzdyuVar = zzdzfVar.zzb;
        j = zzdzfVar.zza;
        zzdyuVar.zzm(j, i);
    }

    @Override // com.google.android.gms.internal.ads.zzccs
    public final void zzf(com.google.android.gms.ads.internal.client.zze zzeVar) throws RemoteException {
        zzdyu zzdyuVar;
        long j;
        zzdzf zzdzfVar = this.zza;
        zzdyuVar = zzdzfVar.zzb;
        j = zzdzfVar.zza;
        zzdyuVar.zzm(j, zzeVar.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzccs
    public final void zzg() throws RemoteException {
        zzdyu zzdyuVar;
        long j;
        zzdzf zzdzfVar = this.zza;
        zzdyuVar = zzdzfVar.zzb;
        j = zzdzfVar.zza;
        zzdyuVar.zzp(j);
    }
}
