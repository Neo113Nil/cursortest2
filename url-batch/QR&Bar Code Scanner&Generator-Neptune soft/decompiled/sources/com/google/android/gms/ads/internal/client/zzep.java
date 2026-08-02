package com.google.android.gms.ads.internal.client;

import android.os.RemoteException;
import com.google.android.gms.internal.ads.zzcgp;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.3.0 */
/* loaded from: classes.dex */
final class zzep implements Runnable {
    final /* synthetic */ zzeq zza;

    zzep(zzeq zzeqVar) {
        this.zza = zzeqVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzbf zzbfVar;
        zzbf zzbfVar2;
        zzeq zzeqVar = this.zza;
        zzbfVar = zzeqVar.zza;
        if (zzbfVar != null) {
            try {
                zzbfVar2 = zzeqVar.zza;
                zzbfVar2.zze(1);
            } catch (RemoteException e) {
                zzcgp.zzk("Could not notify onAdFailedToLoad event.", e);
            }
        }
    }
}
