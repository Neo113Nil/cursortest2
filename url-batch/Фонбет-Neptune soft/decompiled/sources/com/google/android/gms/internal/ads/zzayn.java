package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
final class zzayn implements Runnable {
    final /* synthetic */ zzayo zza;

    zzayn(zzayo zzayoVar) {
        this.zza = zzayoVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object obj;
        boolean z;
        boolean z2;
        List list;
        obj = this.zza.zzc;
        synchronized (obj) {
            zzayo zzayoVar = this.zza;
            z = zzayoVar.zzd;
            if (z) {
                z2 = zzayoVar.zze;
                if (z2) {
                    zzayoVar.zzd = false;
                    com.google.android.gms.ads.internal.util.client.zzm.zze("App went background");
                    list = this.zza.zzf;
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        try {
                            ((zzayp) it.next()).zza(false);
                        } catch (Exception e) {
                            com.google.android.gms.ads.internal.util.client.zzm.zzh("", e);
                        }
                    }
                }
            }
            com.google.android.gms.ads.internal.util.client.zzm.zze("App is still foreground");
        }
    }
}
