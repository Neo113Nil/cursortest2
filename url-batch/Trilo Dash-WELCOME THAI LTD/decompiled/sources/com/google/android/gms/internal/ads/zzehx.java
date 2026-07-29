package com.google.android.gms.internal.ads;

import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes2.dex */
final class zzehx extends zzbvl {
    final /* synthetic */ zzehy zza;
    private final zzefb zzb;

    /* synthetic */ zzehx(zzehy zzehyVar, zzefb zzefbVar, zzehw zzehwVar) {
        this.zza = zzehyVar;
        this.zzb = zzefbVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbvm
    public final void zze(String str) throws RemoteException {
        ((zzegu) this.zzb.zzc).zzi(0, str);
    }

    @Override // com.google.android.gms.internal.ads.zzbvm
    public final void zzf(com.google.android.gms.ads.internal.client.zze zzeVar) throws RemoteException {
        ((zzegu) this.zzb.zzc).zzh(zzeVar);
    }

    @Override // com.google.android.gms.internal.ads.zzbvm
    public final void zzg(zzbuo zzbuoVar) throws RemoteException {
        this.zza.zzc = zzbuoVar;
        ((zzegu) this.zzb.zzc).zzo();
    }
}
