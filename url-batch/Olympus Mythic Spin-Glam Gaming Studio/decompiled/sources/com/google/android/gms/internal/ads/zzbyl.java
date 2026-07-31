package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes4.dex */
final class zzbyl implements Runnable {
    final /* synthetic */ AdOverlayInfoParcel zza;
    final /* synthetic */ zzbym zzb;

    zzbyl(zzbym zzbymVar, AdOverlayInfoParcel adOverlayInfoParcel) {
        this.zza = adOverlayInfoParcel;
        Objects.requireNonNull(zzbymVar);
        this.zzb = zzbymVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.google.android.gms.ads.internal.zzt.zzb();
        com.google.android.gms.ads.internal.overlay.zzn.zza(this.zzb.zza(), this.zza, true, null);
    }
}
