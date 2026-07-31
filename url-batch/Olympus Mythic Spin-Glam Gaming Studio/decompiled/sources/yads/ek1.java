package yads;

import android.media.MediaFormat;
import android.media.metrics.LogSessionId;
import androidx.annotation.DoNotInline;

/* loaded from: classes10.dex */
public abstract class ek1 {
    @DoNotInline
    public static void a(uj1 uj1Var, ff2 ff2Var) {
        LogSessionId logSessionId;
        boolean equals;
        String stringId;
        ef2 ef2Var = ff2Var.a;
        ef2Var.getClass();
        LogSessionId logSessionId2 = ef2Var.a;
        logSessionId = LogSessionId.LOG_SESSION_ID_NONE;
        equals = logSessionId2.equals(logSessionId);
        if (equals) {
            return;
        }
        MediaFormat mediaFormat = uj1Var.b;
        stringId = logSessionId2.getStringId();
        mediaFormat.setString("log-session-id", stringId);
    }
}
