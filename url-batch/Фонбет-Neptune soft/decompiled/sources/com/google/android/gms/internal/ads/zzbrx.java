package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.nativead.NativeCustomFormatAd;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.3.0 */
/* loaded from: classes2.dex */
final class zzbrx extends zzbgg {
    final /* synthetic */ zzbsa zza;

    /* synthetic */ zzbrx(zzbsa zzbsaVar, zzbrw zzbrwVar) {
        this.zza = zzbsaVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbgh
    public final void zze(zzbfx zzbfxVar, String str) {
        NativeCustomFormatAd.OnCustomClickListener onCustomClickListener;
        NativeCustomFormatAd.OnCustomClickListener onCustomClickListener2;
        NativeCustomFormatAd zzf;
        zzbsa zzbsaVar = this.zza;
        onCustomClickListener = zzbsaVar.zzb;
        if (onCustomClickListener == null) {
            return;
        }
        onCustomClickListener2 = zzbsaVar.zzb;
        zzf = zzbsaVar.zzf(zzbfxVar);
        onCustomClickListener2.onCustomClick(zzf, str);
    }
}
