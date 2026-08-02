package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.nativead.NativeCustomFormatAd;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.3.0 */
/* loaded from: classes2.dex */
final class zzbyo extends zzbnk {
    final /* synthetic */ zzbyp zza;

    /* synthetic */ zzbyo(zzbyp zzbypVar, zzbyn zzbynVar) {
        this.zza = zzbypVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbnl
    public final void zze(zzbmy zzbmyVar) {
        NativeCustomFormatAd.OnCustomFormatAdLoadedListener onCustomFormatAdLoadedListener;
        NativeCustomFormatAd zzf;
        zzbyp zzbypVar = this.zza;
        onCustomFormatAdLoadedListener = zzbypVar.zza;
        zzf = zzbypVar.zzf(zzbmyVar);
        onCustomFormatAdLoadedListener.onCustomFormatAdLoaded(zzf);
    }
}
