package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.formats.NativeCustomTemplateAd;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.3.0 */
/* loaded from: classes2.dex */
final class zzboi extends zzbnk {
    final /* synthetic */ zzboj zza;

    /* synthetic */ zzboi(zzboj zzbojVar, zzboh zzbohVar) {
        this.zza = zzbojVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbnl
    public final void zze(zzbmy zzbmyVar) {
        NativeCustomTemplateAd.OnCustomTemplateAdLoadedListener onCustomTemplateAdLoadedListener;
        NativeCustomTemplateAd zzf;
        zzboj zzbojVar = this.zza;
        onCustomTemplateAdLoadedListener = zzbojVar.zza;
        zzf = zzbojVar.zzf(zzbmyVar);
        onCustomTemplateAdLoadedListener.onCustomTemplateAdLoaded(zzf);
    }
}
