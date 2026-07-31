package yads;

import android.media.AudioTrack;
import android.media.metrics.LogSessionId;
import androidx.annotation.DoNotInline;

/* loaded from: classes12.dex */
public abstract class ec0 {
    @DoNotInline
    public static void a(AudioTrack audioTrack, ff2 ff2Var) {
        LogSessionId logSessionId;
        boolean equals;
        ef2 ef2Var = ff2Var.a;
        ef2Var.getClass();
        LogSessionId logSessionId2 = ef2Var.a;
        logSessionId = LogSessionId.LOG_SESSION_ID_NONE;
        equals = logSessionId2.equals(logSessionId);
        if (equals) {
            return;
        }
        audioTrack.setLogSessionId(logSessionId2);
    }
}
