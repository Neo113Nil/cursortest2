package io.bidmachine.media3.exoplayer.source;

import io.bidmachine.media3.common.util.UnstableApi;
import io.bidmachine.media3.exoplayer.LoadingInfo;

@UnstableApi
/* loaded from: classes13.dex */
public interface SequenceableLoader {

    public interface Callback<T extends SequenceableLoader> {
        void onContinueLoadingRequested(T t);
    }

    boolean continueLoading(LoadingInfo loadingInfo);

    long getBufferedPositionUs();

    long getNextLoadPositionUs();

    boolean isLoading();

    void reevaluateBuffer(long j);
}
