package com.google.android.gms.internal.ads;

import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import androidx.annotation.Nullable;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes4.dex */
final class zzwg implements zzwe {
    private final int zza;

    @Nullable
    private MediaCodecInfo[] zzb;

    public zzwg(boolean z, boolean z2, boolean z3) {
        int i = 1;
        if (!z && !z2 && !z3) {
            i = 0;
        }
        this.zza = i;
    }

    private final void zzf() {
        if (this.zzb == null) {
            this.zzb = new MediaCodecList(this.zza).getCodecInfos();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzwe
    public final int zza() {
        zzf();
        return this.zzb.length;
    }

    @Override // com.google.android.gms.internal.ads.zzwe
    public final MediaCodecInfo zzb(int i) {
        zzf();
        return this.zzb[i];
    }

    @Override // com.google.android.gms.internal.ads.zzwe
    public final boolean zzc() {
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzwe
    public final boolean zzd(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return codecCapabilities.isFeatureSupported(str);
    }

    @Override // com.google.android.gms.internal.ads.zzwe
    public final boolean zze(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return codecCapabilities.isFeatureRequired(str);
    }
}
