package io.bidmachine.media3.exoplayer.drm;

import android.os.Looper;
import androidx.annotation.Nullable;
import io.bidmachine.media3.common.Format;
import io.bidmachine.media3.common.util.UnstableApi;
import io.bidmachine.media3.exoplayer.analytics.PlayerId;
import io.bidmachine.media3.exoplayer.drm.DrmSession;
import io.bidmachine.media3.exoplayer.drm.DrmSessionEventListener;
import io.bidmachine.media3.exoplayer.drm.DrmSessionManager;

@UnstableApi
/* loaded from: classes8.dex */
public interface DrmSessionManager {
    public static final DrmSessionManager DRM_UNSUPPORTED = new DrmSessionManager() { // from class: io.bidmachine.media3.exoplayer.drm.DrmSessionManager.1
        @Override // io.bidmachine.media3.exoplayer.drm.DrmSessionManager
        public void setPlayer(Looper looper, PlayerId playerId) {
        }

        @Override // io.bidmachine.media3.exoplayer.drm.DrmSessionManager
        @Nullable
        public DrmSession acquireSession(@Nullable DrmSessionEventListener.EventDispatcher eventDispatcher, Format format) {
            if (format.drmInitData == null) {
                return null;
            }
            return new ErrorStateDrmSession(new DrmSession.DrmSessionException(new UnsupportedDrmException(1), 6001));
        }

        @Override // io.bidmachine.media3.exoplayer.drm.DrmSessionManager
        public int getCryptoType(Format format) {
            return format.drmInitData != null ? 1 : 0;
        }
    };

    public interface DrmSessionReference {
        public static final DrmSessionReference EMPTY = new DrmSessionReference() { // from class: io.bidmachine.media3.exoplayer.drm.DrmSessionManager$DrmSessionReference$$ExternalSyntheticLambda0
            @Override // io.bidmachine.media3.exoplayer.drm.DrmSessionManager.DrmSessionReference
            public final void release() {
                DrmSessionManager.DrmSessionReference.lambda$static$0();
            }
        };

        /* JADX INFO: Access modifiers changed from: private */
        static /* synthetic */ void lambda$static$0() {
        }

        void release();
    }

    @Nullable
    DrmSession acquireSession(@Nullable DrmSessionEventListener.EventDispatcher eventDispatcher, Format format);

    int getCryptoType(Format format);

    default void prepare() {
    }

    default void release() {
    }

    void setPlayer(Looper looper, PlayerId playerId);

    default DrmSessionReference preacquireSession(@Nullable DrmSessionEventListener.EventDispatcher eventDispatcher, Format format) {
        return DrmSessionReference.EMPTY;
    }
}
