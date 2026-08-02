package com.google.android.gms.internal.ads;

import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
public final class zzeos {
    private final zzdpb zza;
    private final zzeof zzb;
    private final zzddd zzc;

    public zzeos(zzdpb zzdpbVar, zzfir zzfirVar) {
        this.zza = zzdpbVar;
        final zzeof zzeofVar = new zzeof(zzfirVar);
        this.zzb = zzeofVar;
        final zzbsl zzg = zzdpbVar.zzg();
        this.zzc = new zzddd() { // from class: com.google.android.gms.internal.ads.zzeor
            @Override // com.google.android.gms.internal.ads.zzddd
            public final void zza(com.google.android.gms.ads.internal.client.zze zzeVar) {
                zzeof zzeofVar2 = zzeof.this;
                zzbsl zzbslVar = zzg;
                zzeofVar2.zza(zzeVar);
                if (zzbslVar != null) {
                    try {
                        zzbslVar.zzf(zzeVar);
                    } catch (RemoteException e) {
                        zzcgp.zzl("#007 Could not call remote method.", e);
                    }
                }
                if (zzbslVar != null) {
                    try {
                        zzbslVar.zze(zzeVar.zza);
                    } catch (RemoteException e2) {
                        zzcgp.zzl("#007 Could not call remote method.", e2);
                    }
                }
            }
        };
    }

    public final zzddd zza() {
        return this.zzc;
    }

    public final zzdeo zzb() {
        return this.zzb;
    }

    public final zzdmy zzc() {
        return new zzdmy(this.zza, this.zzb.zzc());
    }

    public final zzeof zzd() {
        return this.zzb;
    }

    public final void zze(com.google.android.gms.ads.internal.client.zzbf zzbfVar) {
        this.zzb.zze(zzbfVar);
    }
}
