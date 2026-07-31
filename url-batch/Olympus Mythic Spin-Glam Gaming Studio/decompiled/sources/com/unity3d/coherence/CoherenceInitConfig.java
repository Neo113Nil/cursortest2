package com.unity3d.coherence;

import android.content.Context;
import java.util.Objects;

/* loaded from: classes13.dex */
public final class CoherenceInitConfig {
    private final Context context;
    private final int source;

    private CoherenceInitConfig(Context context, int i) {
        this.context = context;
        this.source = i;
    }

    Context getContext() {
        return this.context;
    }

    int getSource() {
        return this.source;
    }

    public static final class Builder {
        private final Context context;
        private int source;

        public Builder(Context context) {
            Objects.requireNonNull(context, "context must not be null");
            Context applicationContext = context.getApplicationContext();
            this.context = applicationContext != null ? applicationContext : context;
        }

        public Builder setSource(int i) {
            this.source = i;
            return this;
        }

        public CoherenceInitConfig build() {
            return new CoherenceInitConfig(this.context, this.source);
        }
    }
}
