package com.google.android.gms.internal.ads;

import android.media.MediaCodec;
import androidx.annotation.RequiresApi;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
@RequiresApi
/* loaded from: classes14.dex */
final class zziu {
    private final MediaCodec.CryptoInfo zza;
    private final MediaCodec.CryptoInfo.Pattern zzb = new MediaCodec.CryptoInfo.Pattern(0, 0);

    final /* synthetic */ void zza(int i, int i2) {
        MediaCodec.CryptoInfo.Pattern pattern = this.zzb;
        pattern.set(i, i2);
        this.zza.setPattern(pattern);
    }
}
