package com.google.android.gms.internal.ads;

import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes2.dex */
final class zzfbc extends zzfkm {
    final /* synthetic */ com.google.android.gms.ads.internal.client.zzbw zza;
    final /* synthetic */ zzfbd zzb;

    zzfbc(zzfbd zzfbdVar, com.google.android.gms.ads.internal.client.zzbw zzbwVar) {
        this.zzb = zzfbdVar;
        this.zza = zzbwVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfkm
    public final void zzv() {
        zzdss zzdssVar;
        zzdssVar = this.zzb.zzd;
        if (zzdssVar != null) {
            try {
                this.zza.zze();
            } catch (RemoteException e) {
                com.google.android.gms.ads.internal.util.zze.zzl("#007 Could not call remote method.", e);
            }
        }
    }
}
