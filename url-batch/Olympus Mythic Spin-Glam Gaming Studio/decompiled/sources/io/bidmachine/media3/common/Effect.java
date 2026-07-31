package io.bidmachine.media3.common;

import io.bidmachine.media3.common.util.UnstableApi;

@UnstableApi
/* loaded from: classes14.dex */
public interface Effect {
    default long getDurationAfterEffectApplied(long j) {
        return j;
    }
}
