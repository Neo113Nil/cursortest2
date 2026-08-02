package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.admanager.AdManagerAdView;
import com.google.android.gms.ads.formats.OnAdManagerAdViewLoadedListener;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.3.0 */
/* loaded from: classes2.dex */
final class zzbhj implements Runnable {
    final /* synthetic */ AdManagerAdView zza;
    final /* synthetic */ com.google.android.gms.ads.internal.client.zzbu zzb;
    final /* synthetic */ zzbhk zzc;

    zzbhj(zzbhk zzbhkVar, AdManagerAdView adManagerAdView, com.google.android.gms.ads.internal.client.zzbu zzbuVar) {
        this.zza = adManagerAdView;
        this.zzb = zzbuVar;
        this.zzc = zzbhkVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        OnAdManagerAdViewLoadedListener onAdManagerAdViewLoadedListener;
        if (!this.zza.zzb(this.zzb)) {
            com.google.android.gms.ads.internal.util.client.zzm.zzj("Could not bind.");
            return;
        }
        zzbhk zzbhkVar = this.zzc;
        AdManagerAdView adManagerAdView = this.zza;
        onAdManagerAdViewLoadedListener = zzbhkVar.zza;
        onAdManagerAdViewLoadedListener.onAdManagerAdViewLoaded(adManagerAdView);
    }
}
