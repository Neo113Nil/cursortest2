package com.google.android.gms.internal.ads;

import java.lang.ref.WeakReference;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
final class zzdfo implements Runnable {
    private final WeakReference zza;

    @Override // java.lang.Runnable
    public final void run() {
        zzdfp zzdfpVar = (zzdfp) this.zza.get();
        if (zzdfpVar != null) {
            zzdfpVar.zzo(new zzdii() { // from class: com.google.android.gms.internal.ads.zzdfm
                @Override // com.google.android.gms.internal.ads.zzdii
                public final void zza(Object obj) {
                    ((zzdfq) obj).zza();
                }
            });
        }
    }
}
