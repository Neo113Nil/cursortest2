package com.google.android.gms.ads.internal.client;

import android.os.RemoteException;
import com.google.android.gms.internal.ads.zzcgp;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.3.0 */
/* loaded from: classes.dex */
final class zzel implements Runnable {
    final /* synthetic */ zzen zza;

    zzel(zzen zzenVar) {
        this.zza = zzenVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzbf zzbfVar;
        zzbf zzbfVar2;
        zzeo zzeoVar = this.zza.zza;
        zzbfVar = zzeoVar.zza;
        if (zzbfVar != null) {
            try {
                zzbfVar2 = zzeoVar.zza;
                zzbfVar2.zze(1);
            } catch (RemoteException e) {
                zzcgp.zzk("Could not notify onAdFailedToLoad event.", e);
            }
        }
    }
}
