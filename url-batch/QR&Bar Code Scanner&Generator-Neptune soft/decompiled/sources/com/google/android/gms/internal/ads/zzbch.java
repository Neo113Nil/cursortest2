package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
final class zzbch implements Runnable {
    final /* synthetic */ zzbci zza;

    zzbch(zzbci zzbciVar) {
        this.zza = zzbciVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object obj;
        boolean z;
        boolean z2;
        List list;
        obj = this.zza.zzc;
        synchronized (obj) {
            zzbci zzbciVar = this.zza;
            z = zzbciVar.zzd;
            if (z) {
                z2 = zzbciVar.zze;
                if (z2) {
                    zzbciVar.zzd = false;
                    com.google.android.gms.ads.internal.util.zze.zze("App went background");
                    list = this.zza.zzf;
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        try {
                            ((zzbcj) it.next()).zza(false);
                        } catch (Exception e) {
                            zzcgp.zzh("", e);
                        }
                    }
                }
            }
            com.google.android.gms.ads.internal.util.zze.zze("App is still foreground");
        }
    }
}
