package com.google.android.gms.ads.internal.client;

import android.os.RemoteException;
import com.google.android.gms.internal.ads.zzcfi;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.0.0 */
/* loaded from: classes.dex */
final class zzem implements Runnable {
    final /* synthetic */ zzeo zza;

    zzem(zzeo zzeoVar) {
        this.zza = zzeoVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzbf zzbfVar;
        zzbf zzbfVar2;
        zzep zzepVar = this.zza.zza;
        zzbfVar = zzepVar.zza;
        if (zzbfVar != null) {
            try {
                zzbfVar2 = zzepVar.zza;
                zzbfVar2.zze(1);
            } catch (RemoteException e) {
                zzcfi.zzk("Could not notify onAdFailedToLoad event.", e);
            }
        }
    }
}
