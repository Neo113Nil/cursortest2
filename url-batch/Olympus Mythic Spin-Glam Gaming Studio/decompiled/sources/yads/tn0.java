package yads;

import android.content.Context;
import android.media.metrics.LogSessionId;
import android.media.metrics.MediaMetricsManager;
import android.media.metrics.PlaybackSession;
import androidx.annotation.DoNotInline;
import androidx.media3.exoplayer.analytics.MediaMetricsListener$$ExternalSyntheticApiModelOutline33;

/* loaded from: classes4.dex */
public abstract class tn0 {
    @DoNotInline
    public static ff2 a(Context context, xn0 xn0Var, boolean z) {
        PlaybackSession createPlaybackSession;
        dm1 dm1Var;
        LogSessionId sessionId;
        LogSessionId logSessionId;
        MediaMetricsManager m = MediaMetricsListener$$ExternalSyntheticApiModelOutline33.m(context.getSystemService("media_metrics"));
        if (m == null) {
            dm1Var = null;
        } else {
            createPlaybackSession = m.createPlaybackSession();
            dm1Var = new dm1(context, createPlaybackSession);
        }
        if (dm1Var == null) {
            gh1.d("ExoPlayerImpl", "MediaMetricsService unavailable.");
            logSessionId = LogSessionId.LOG_SESSION_ID_NONE;
            return new ff2(logSessionId);
        }
        if (z) {
            xn0Var.getClass();
            wb0 wb0Var = (wb0) xn0Var.p;
            wb0Var.getClass();
            rf1 rf1Var = wb0Var.f;
            if (!rf1Var.g) {
                rf1Var.d.add(new qf1(dm1Var));
            }
        }
        sessionId = dm1Var.c.getSessionId();
        return new ff2(sessionId);
    }
}
