package yads;

import android.media.metrics.LogSessionId;

/* loaded from: classes15.dex */
public final class ff2 {
    public final ef2 a;

    static {
        if (sb3.a < 31) {
            new ff2();
        } else {
            int i = ef2.$r8$clinit;
        }
    }

    public ff2(LogSessionId logSessionId) {
        this.a = new ef2(logSessionId);
    }

    public ff2() {
        this.a = null;
        if (sb3.a >= 31) {
            throw new IllegalStateException();
        }
    }
}
