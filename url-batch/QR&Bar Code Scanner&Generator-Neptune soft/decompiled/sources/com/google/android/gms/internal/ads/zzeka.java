package com.google.android.gms.internal.ads;

import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
final class zzeka extends zzbww {
    final /* synthetic */ zzekb zza;
    private final zzehf zzb;

    /* synthetic */ zzeka(zzekb zzekbVar, zzehf zzehfVar, zzejz zzejzVar) {
        this.zza = zzekbVar;
        this.zzb = zzehfVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbwx
    public final void zze(String str) throws RemoteException {
        ((zzeix) this.zzb.zzc).zzi(0, str);
    }

    @Override // com.google.android.gms.internal.ads.zzbwx
    public final void zzf(com.google.android.gms.ads.internal.client.zze zzeVar) throws RemoteException {
        ((zzeix) this.zzb.zzc).zzh(zzeVar);
    }

    @Override // com.google.android.gms.internal.ads.zzbwx
    public final void zzg(zzbvz zzbvzVar) throws RemoteException {
        this.zza.zzc = zzbvzVar;
        ((zzeix) this.zzb.zzc).zzo();
    }
}
