package com.google.android.gms.internal.ads;

import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes2.dex */
final class zzehi extends zzbvi {
    private final zzefb zza;

    @Override // com.google.android.gms.internal.ads.zzbvj
    public final void zze(String str) throws RemoteException {
        ((zzegu) this.zza.zzc).zzi(0, str);
    }

    @Override // com.google.android.gms.internal.ads.zzbvj
    public final void zzf(com.google.android.gms.ads.internal.client.zze zzeVar) throws RemoteException {
        ((zzegu) this.zza.zzc).zzh(zzeVar);
    }

    @Override // com.google.android.gms.internal.ads.zzbvj
    public final void zzg() throws RemoteException {
        ((zzegu) this.zza.zzc).zzo();
    }
}
