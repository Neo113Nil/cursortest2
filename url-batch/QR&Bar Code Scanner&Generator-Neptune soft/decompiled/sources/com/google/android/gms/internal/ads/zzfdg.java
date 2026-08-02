package com.google.android.gms.internal.ads;

import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
final class zzfdg extends zzfmr {
    final /* synthetic */ com.google.android.gms.ads.internal.client.zzbw zza;
    final /* synthetic */ zzfdh zzb;

    zzfdg(zzfdh zzfdhVar, com.google.android.gms.ads.internal.client.zzbw zzbwVar) {
        this.zzb = zzfdhVar;
        this.zza = zzbwVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfmr
    public final void zzv() {
        zzduc zzducVar;
        zzducVar = this.zzb.zzd;
        if (zzducVar != null) {
            try {
                this.zza.zze();
            } catch (RemoteException e) {
                com.google.android.gms.ads.internal.util.zze.zzl("#007 Could not call remote method.", e);
            }
        }
    }
}
