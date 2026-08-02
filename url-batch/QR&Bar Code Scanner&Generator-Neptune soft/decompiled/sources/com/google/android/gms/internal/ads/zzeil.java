package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import android.view.View;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
final class zzeil extends zzbwq {
    final /* synthetic */ zzeim zza;
    private final zzehf zzb;

    /* synthetic */ zzeil(zzeim zzeimVar, zzehf zzehfVar, zzeik zzeikVar) {
        this.zza = zzeimVar;
        this.zzb = zzehfVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbwr
    public final void zze(String str) throws RemoteException {
        ((zzeix) this.zzb.zzc).zzi(0, str);
    }

    @Override // com.google.android.gms.internal.ads.zzbwr
    public final void zzf(com.google.android.gms.ads.internal.client.zze zzeVar) throws RemoteException {
        ((zzeix) this.zzb.zzc).zzh(zzeVar);
    }

    @Override // com.google.android.gms.internal.ads.zzbwr
    public final void zzg(IObjectWrapper iObjectWrapper) throws RemoteException {
        this.zza.zzc = (View) ObjectWrapper.unwrap(iObjectWrapper);
        ((zzeix) this.zzb.zzc).zzo();
    }

    @Override // com.google.android.gms.internal.ads.zzbwr
    public final void zzh(zzbvt zzbvtVar) throws RemoteException {
        this.zza.zzd = zzbvtVar;
        ((zzeix) this.zzb.zzc).zzo();
    }
}
