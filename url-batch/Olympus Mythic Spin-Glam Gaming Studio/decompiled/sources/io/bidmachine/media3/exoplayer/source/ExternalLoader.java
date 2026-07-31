package io.bidmachine.media3.exoplayer.source;

import android.net.Uri;
import com.google.common.util.concurrent.ListenableFuture;
import io.bidmachine.media3.common.util.UnstableApi;

@UnstableApi
/* loaded from: classes15.dex */
public interface ExternalLoader {
    ListenableFuture load(LoadRequest loadRequest);

    public static final class LoadRequest {
        public final Uri uri;

        public LoadRequest(Uri uri) {
            this.uri = uri;
        }
    }
}
