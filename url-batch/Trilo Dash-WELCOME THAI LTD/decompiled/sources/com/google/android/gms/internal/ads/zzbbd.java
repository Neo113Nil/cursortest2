package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes2.dex */
final class zzbbd implements Runnable {
    final /* synthetic */ zzbbe zza;

    zzbbd(zzbbe zzbbeVar) {
        this.zza = zzbbeVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object obj;
        boolean z;
        boolean z2;
        List list;
        obj = this.zza.zzc;
        synchronized (obj) {
            zzbbe zzbbeVar = this.zza;
            z = zzbbeVar.zzd;
            if (z) {
                z2 = zzbbeVar.zze;
                if (z2) {
                    zzbbeVar.zzd = false;
                    com.google.android.gms.ads.internal.util.zze.zze("App went background");
                    list = this.zza.zzf;
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        try {
                            ((zzbbf) it.next()).zza(false);
                        } catch (Exception e) {
                            zzcfi.zzh("", e);
                        }
                    }
                }
            }
            com.google.android.gms.ads.internal.util.zze.zze("App is still foreground");
        }
    }
}
