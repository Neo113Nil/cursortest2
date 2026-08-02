package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.nativead.NativeCustomFormatAd;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.3.0 */
/* loaded from: classes2.dex */
final class zzbym extends zzbnh {
    final /* synthetic */ zzbyp zza;

    /* synthetic */ zzbym(zzbyp zzbypVar, zzbyl zzbylVar) {
        this.zza = zzbypVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbni
    public final void zze(zzbmy zzbmyVar, String str) {
        NativeCustomFormatAd.OnCustomClickListener onCustomClickListener;
        NativeCustomFormatAd.OnCustomClickListener onCustomClickListener2;
        NativeCustomFormatAd zzf;
        zzbyp zzbypVar = this.zza;
        onCustomClickListener = zzbypVar.zzb;
        if (onCustomClickListener == null) {
            return;
        }
        onCustomClickListener2 = zzbypVar.zzb;
        zzf = zzbypVar.zzf(zzbmyVar);
        onCustomClickListener2.onCustomClick(zzf, str);
    }
}
