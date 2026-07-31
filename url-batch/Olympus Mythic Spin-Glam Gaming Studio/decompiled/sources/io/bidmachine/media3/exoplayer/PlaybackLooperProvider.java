package io.bidmachine.media3.exoplayer;

import android.os.HandlerThread;
import android.os.Looper;
import androidx.annotation.GuardedBy;
import androidx.annotation.RestrictTo;
import io.bidmachine.media3.common.util.Assertions;
import io.bidmachine.media3.common.util.UnstableApi;

@RestrictTo
@UnstableApi
/* loaded from: classes14.dex */
public final class PlaybackLooperProvider {

    @GuardedBy
    private HandlerThread internalPlaybackThread;
    private final Object lock;

    @GuardedBy
    private Looper playbackLooper;

    @GuardedBy
    private int referenceCount;

    public PlaybackLooperProvider() {
        this(null);
    }

    public PlaybackLooperProvider(Looper looper) {
        this.lock = new Object();
        this.playbackLooper = looper;
        this.internalPlaybackThread = null;
        this.referenceCount = 0;
    }

    public Looper obtainLooper() {
        Looper looper;
        synchronized (this.lock) {
            try {
                if (this.playbackLooper == null) {
                    Assertions.checkState(this.referenceCount == 0 && this.internalPlaybackThread == null);
                    HandlerThread handlerThread = new HandlerThread("ExoPlayer:Playback", -16);
                    this.internalPlaybackThread = handlerThread;
                    handlerThread.start();
                    this.playbackLooper = this.internalPlaybackThread.getLooper();
                }
                this.referenceCount++;
                looper = this.playbackLooper;
            } catch (Throwable th) {
                throw th;
            }
        }
        return looper;
    }

    public void releaseLooper() {
        HandlerThread handlerThread;
        synchronized (this.lock) {
            try {
                Assertions.checkState(this.referenceCount > 0);
                int i = this.referenceCount - 1;
                this.referenceCount = i;
                if (i == 0 && (handlerThread = this.internalPlaybackThread) != null) {
                    handlerThread.quit();
                    this.internalPlaybackThread = null;
                    this.playbackLooper = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
