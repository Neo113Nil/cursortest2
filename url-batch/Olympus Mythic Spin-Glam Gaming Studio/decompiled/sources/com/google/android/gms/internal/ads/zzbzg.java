package com.google.android.gms.internal.ads;

import androidx.annotation.GuardedBy;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.nativead.NativeCustomFormatAd;

/* compiled from: com.google.android.gms:play-services-ads-api@@25.4.0 */
/* loaded from: classes4.dex */
public final class zzbzg {
    private final NativeCustomFormatAd.OnCustomFormatAdLoadedListener zza;

    @Nullable
    private final NativeCustomFormatAd.OnCustomClickListener zzb;

    @Nullable
    @GuardedBy
    private NativeCustomFormatAd zzc;

    public zzbzg(NativeCustomFormatAd.OnCustomFormatAdLoadedListener onCustomFormatAdLoadedListener, @Nullable NativeCustomFormatAd.OnCustomClickListener onCustomClickListener) {
        this.zza = onCustomFormatAdLoadedListener;
        this.zzb = onCustomClickListener;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: zzf, reason: merged with bridge method [inline-methods] */
    public final synchronized NativeCustomFormatAd zzc(zzbnm zzbnmVar) {
        NativeCustomFormatAd nativeCustomFormatAd = this.zzc;
        if (nativeCustomFormatAd != null) {
            return nativeCustomFormatAd;
        }
        zzbzh zzbzhVar = new zzbzh(zzbnmVar);
        this.zzc = zzbzhVar;
        return zzbzhVar;
    }

    public final zzbnz zza() {
        return new zzbzf(this, null);
    }

    @Nullable
    public final zzbnw zzb() {
        if (this.zzb == null) {
            return null;
        }
        return new zzbze(this, null);
    }

    final /* synthetic */ NativeCustomFormatAd.OnCustomFormatAdLoadedListener zzd() {
        return this.zza;
    }

    final /* synthetic */ NativeCustomFormatAd.OnCustomClickListener zze() {
        return this.zzb;
    }
}
