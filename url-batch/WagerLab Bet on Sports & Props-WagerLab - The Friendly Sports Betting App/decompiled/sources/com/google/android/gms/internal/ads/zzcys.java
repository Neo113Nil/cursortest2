package com.google.android.gms.internal.ads;

import java.lang.ref.WeakReference;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
/* loaded from: classes5.dex */
final class zzcys implements Runnable {
    private final WeakReference zza;

    @Override // java.lang.Runnable
    public final void run() {
        zzcyt zzcytVar = (zzcyt) this.zza.get();
        if (zzcytVar != null) {
            zzcytVar.zzs(zzcyp.zza);
        }
    }
}
