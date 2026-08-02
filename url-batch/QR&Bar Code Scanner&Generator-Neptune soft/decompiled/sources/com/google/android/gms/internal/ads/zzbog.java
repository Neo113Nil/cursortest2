package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.formats.NativeCustomTemplateAd;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.3.0 */
/* loaded from: classes2.dex */
final class zzbog extends zzbnh {
    final /* synthetic */ zzboj zza;

    /* synthetic */ zzbog(zzboj zzbojVar, zzbof zzbofVar) {
        this.zza = zzbojVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbni
    public final void zze(zzbmy zzbmyVar, String str) {
        NativeCustomTemplateAd.OnCustomClickListener onCustomClickListener;
        NativeCustomTemplateAd.OnCustomClickListener onCustomClickListener2;
        NativeCustomTemplateAd zzf;
        zzboj zzbojVar = this.zza;
        onCustomClickListener = zzbojVar.zzb;
        if (onCustomClickListener == null) {
            return;
        }
        onCustomClickListener2 = zzbojVar.zzb;
        zzf = zzbojVar.zzf(zzbmyVar);
        onCustomClickListener2.onCustomClick(zzf, str);
    }
}
