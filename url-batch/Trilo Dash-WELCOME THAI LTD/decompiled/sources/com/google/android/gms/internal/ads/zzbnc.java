package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.formats.NativeCustomTemplateAd;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.0.0 */
/* loaded from: classes2.dex */
final class zzbnc extends zzbmd {
    final /* synthetic */ zzbnf zza;

    /* synthetic */ zzbnc(zzbnf zzbnfVar, zzbnb zzbnbVar) {
        this.zza = zzbnfVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbme
    public final void zze(zzblu zzbluVar, String str) {
        NativeCustomTemplateAd.OnCustomClickListener onCustomClickListener;
        NativeCustomTemplateAd.OnCustomClickListener onCustomClickListener2;
        NativeCustomTemplateAd zzf;
        zzbnf zzbnfVar = this.zza;
        onCustomClickListener = zzbnfVar.zzb;
        if (onCustomClickListener == null) {
            return;
        }
        onCustomClickListener2 = zzbnfVar.zzb;
        zzf = zzbnfVar.zzf(zzbluVar);
        onCustomClickListener2.onCustomClick(zzf, str);
    }
}
