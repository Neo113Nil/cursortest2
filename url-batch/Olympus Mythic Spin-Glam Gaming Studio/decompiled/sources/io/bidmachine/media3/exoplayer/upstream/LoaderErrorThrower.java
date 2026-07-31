package io.bidmachine.media3.exoplayer.upstream;

import io.bidmachine.media3.common.util.UnstableApi;
import java.io.IOException;

@UnstableApi
/* loaded from: classes15.dex */
public interface LoaderErrorThrower {

    public static final class Placeholder implements LoaderErrorThrower {
        @Override // io.bidmachine.media3.exoplayer.upstream.LoaderErrorThrower
        public void maybeThrowError() {
        }

        @Override // io.bidmachine.media3.exoplayer.upstream.LoaderErrorThrower
        public void maybeThrowError(int i) {
        }
    }

    void maybeThrowError() throws IOException;

    void maybeThrowError(int i) throws IOException;
}
