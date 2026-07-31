package io.bidmachine.media3.common.audio;

import io.bidmachine.media3.common.util.UnstableApi;

@UnstableApi
/* loaded from: classes3.dex */
public interface SpeedProvider {
    long getNextSpeedChangeTimeUs(long j);

    float getSpeed(long j);
}
