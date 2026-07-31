package io.bidmachine.media3.exoplayer.analytics;

import android.media.metrics.LogSessionId;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import io.bidmachine.media3.common.util.Assertions;
import io.bidmachine.media3.common.util.UnstableApi;
import io.bidmachine.media3.common.util.Util;
import java.util.Objects;

@UnstableApi
/* loaded from: classes12.dex */
public final class PlayerId {
    public static final PlayerId UNSET = new PlayerId("");

    @Nullable
    private final Object equalityToken;

    @Nullable
    private final LogSessionIdApi31 logSessionIdApi31;
    public final String name;

    public PlayerId(String str) {
        this.name = str;
        this.logSessionIdApi31 = Util.SDK_INT >= 31 ? new LogSessionIdApi31() : null;
        this.equalityToken = new Object();
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PlayerId)) {
            return false;
        }
        PlayerId playerId = (PlayerId) obj;
        return Objects.equals(this.name, playerId.name) && Objects.equals(this.logSessionIdApi31, playerId.logSessionIdApi31) && Objects.equals(this.equalityToken, playerId.equalityToken);
    }

    public int hashCode() {
        return Objects.hash(this.name, this.logSessionIdApi31, this.equalityToken);
    }

    @RequiresApi
    public synchronized LogSessionId getLogSessionId() {
        return ((LogSessionIdApi31) Assertions.checkNotNull(this.logSessionIdApi31)).logSessionId;
    }

    @RequiresApi
    public synchronized void setLogSessionId(LogSessionId logSessionId) {
        ((LogSessionIdApi31) Assertions.checkNotNull(this.logSessionIdApi31)).setLogSessionId(logSessionId);
    }

    @RequiresApi
    private static final class LogSessionIdApi31 {
        public LogSessionId logSessionId;

        public LogSessionIdApi31() {
            LogSessionId logSessionId;
            logSessionId = LogSessionId.LOG_SESSION_ID_NONE;
            this.logSessionId = logSessionId;
        }

        public void setLogSessionId(LogSessionId logSessionId) {
            LogSessionId logSessionId2;
            boolean equals;
            LogSessionId logSessionId3 = this.logSessionId;
            logSessionId2 = LogSessionId.LOG_SESSION_ID_NONE;
            equals = logSessionId3.equals(logSessionId2);
            Assertions.checkState(equals);
            this.logSessionId = logSessionId;
        }
    }
}
