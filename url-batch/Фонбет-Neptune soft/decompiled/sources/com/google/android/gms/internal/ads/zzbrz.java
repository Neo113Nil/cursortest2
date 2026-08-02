package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.nativead.NativeCustomFormatAd;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.3.0 */
/* loaded from: classes2.dex */
final class zzbrz extends zzbgj {
    final /* synthetic */ zzbsa zza;

    /* synthetic */ zzbrz(zzbsa zzbsaVar, zzbry zzbryVar) {
        this.zza = zzbsaVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbgk
    public final void zze(zzbfx zzbfxVar) {
        NativeCustomFormatAd.OnCustomFormatAdLoadedListener onCustomFormatAdLoadedListener;
        NativeCustomFormatAd zzf;
        zzbsa zzbsaVar = this.zza;
        onCustomFormatAdLoadedListener = zzbsaVar.zza;
        zzf = zzbsaVar.zzf(zzbfxVar);
        onCustomFormatAdLoadedListener.onCustomFormatAdLoaded(zzf);
    }
}
