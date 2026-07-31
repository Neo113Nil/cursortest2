package com.google.android.gms.internal.ads;

import android.media.LoudnessCodecController$OnLoudnessCodecUpdateListener;
import android.media.MediaCodec;
import android.os.Bundle;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes4.dex */
final class zzvi implements LoudnessCodecController$OnLoudnessCodecUpdateListener {
    zzvi(zzvl zzvlVar) {
        Objects.requireNonNull(zzvlVar);
    }

    public final Bundle onLoudnessCodecUpdate(MediaCodec mediaCodec, Bundle bundle) {
        return bundle;
    }
}
