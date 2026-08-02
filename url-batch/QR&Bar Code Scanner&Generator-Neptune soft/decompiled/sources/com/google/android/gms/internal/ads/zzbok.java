package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.admanager.AdManagerAdView;
import com.google.android.gms.ads.formats.OnAdManagerAdViewLoadedListener;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.3.0 */
/* loaded from: classes2.dex */
final class zzbok implements Runnable {
    final /* synthetic */ AdManagerAdView zza;
    final /* synthetic */ com.google.android.gms.ads.internal.client.zzbs zzb;
    final /* synthetic */ zzbol zzc;

    zzbok(zzbol zzbolVar, AdManagerAdView adManagerAdView, com.google.android.gms.ads.internal.client.zzbs zzbsVar) {
        this.zzc = zzbolVar;
        this.zza = adManagerAdView;
        this.zzb = zzbsVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        OnAdManagerAdViewLoadedListener onAdManagerAdViewLoadedListener;
        if (!this.zza.zzb(this.zzb)) {
            zzcgp.zzj("Could not bind.");
        } else {
            onAdManagerAdViewLoadedListener = this.zzc.zza;
            onAdManagerAdViewLoadedListener.onAdManagerAdViewLoaded(this.zza);
        }
    }
}
