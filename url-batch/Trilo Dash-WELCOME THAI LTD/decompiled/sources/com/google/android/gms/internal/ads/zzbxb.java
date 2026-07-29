package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.nativead.NativeCustomFormatAd;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.0.0 */
/* loaded from: classes2.dex */
final class zzbxb extends zzbmd {
    final /* synthetic */ zzbxe zza;

    /* synthetic */ zzbxb(zzbxe zzbxeVar, zzbxa zzbxaVar) {
        this.zza = zzbxeVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbme
    public final void zze(zzblu zzbluVar, String str) {
        NativeCustomFormatAd.OnCustomClickListener onCustomClickListener;
        NativeCustomFormatAd.OnCustomClickListener onCustomClickListener2;
        NativeCustomFormatAd zzf;
        zzbxe zzbxeVar = this.zza;
        onCustomClickListener = zzbxeVar.zzb;
        if (onCustomClickListener == null) {
            return;
        }
        onCustomClickListener2 = zzbxeVar.zzb;
        zzf = zzbxeVar.zzf(zzbluVar);
        onCustomClickListener2.onCustomClick(zzf, str);
    }
}
