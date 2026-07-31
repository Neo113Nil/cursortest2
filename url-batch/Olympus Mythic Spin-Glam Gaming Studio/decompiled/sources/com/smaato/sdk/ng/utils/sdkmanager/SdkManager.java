package com.smaato.sdk.ng.utils.sdkmanager;

import com.smaato.sdk.ng.viewability.baseom.BaseViewabilityManager;

/* loaded from: classes15.dex */
public class SdkManager {
    private final BaseViewabilityManager a;
    private final DisplayManager b;

    public static class Builder {
        private BaseViewabilityManager a;
        private DisplayManager b;

        public SdkManager build() {
            return new SdkManager(this);
        }

        public Builder displayManager(DisplayManager displayManager) {
            this.b = displayManager;
            return this;
        }

        public Builder visibilityManager(BaseViewabilityManager baseViewabilityManager) {
            this.a = baseViewabilityManager;
            return this;
        }
    }

    private SdkManager(Builder builder) {
        this.a = builder.a;
        this.b = builder.b;
    }

    public static Builder builder() {
        return new Builder();
    }

    public DisplayManager getDisplayManager() {
        return this.b;
    }

    public BaseViewabilityManager getVisibilityManager() {
        return this.a;
    }
}
