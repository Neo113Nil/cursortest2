package com.google.android.gms.internal.ads;

import android.media.MediaCodecInfo;
import android.media.MediaCodecList;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes4.dex */
final class zzwf implements zzwe {
    private zzwf() {
        throw null;
    }

    /* synthetic */ zzwf(byte[] bArr) {
    }

    @Override // com.google.android.gms.internal.ads.zzwe
    public final int zza() {
        return MediaCodecList.getCodecCount();
    }

    @Override // com.google.android.gms.internal.ads.zzwe
    public final MediaCodecInfo zzb(int i) {
        return MediaCodecList.getCodecInfoAt(i);
    }

    @Override // com.google.android.gms.internal.ads.zzwe
    public final boolean zzc() {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzwe
    public final boolean zzd(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return "secure-playback".equals(str) && "video/avc".equals(str2);
    }

    @Override // com.google.android.gms.internal.ads.zzwe
    public final boolean zze(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return false;
    }
}
