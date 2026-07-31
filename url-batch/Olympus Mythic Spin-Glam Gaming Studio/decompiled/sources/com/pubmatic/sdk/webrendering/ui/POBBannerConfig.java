package com.pubmatic.sdk.webrendering.ui;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.pubmatic.sdk.common.log.POBLog;
import com.pubmatic.sdk.openwrap.core.POBConstants;
import org.json.JSONObject;

/* loaded from: classes15.dex */
public class POBBannerConfig {
    private final int a;
    private final boolean b;

    public static class ConfigBuilder {
        private boolean a = false;
        private int b = 5;

        @NonNull
        public static POBBannerConfig createBannerConfig(@Nullable JSONObject jSONObject, @NonNull String str) {
            ConfigBuilder configBuilder = new ConfigBuilder();
            if (jSONObject != null) {
                JSONObject optJSONObject = jSONObject.optJSONObject("ext");
                if (optJSONObject == null || optJSONObject.length() <= 0) {
                    POBLog.warn("ConfigBuilder", "Null/empty extension response parameter.", new Object[0]);
                } else {
                    JSONObject optJSONObject2 = optJSONObject.optJSONObject("banner");
                    if (optJSONObject2 == null || optJSONObject2.length() <= 0) {
                        POBLog.warn("ConfigBuilder", "Null/empty banner response parameter.", new Object[0]);
                    } else {
                        POBLog.info("ConfigBuilder", "Banner config: " + optJSONObject2, new Object[0]);
                        JSONObject optJSONObject3 = optJSONObject2.optJSONObject(POBConstants.KEY_CLIENT_CONFIG);
                        if (optJSONObject3 != null) {
                            configBuilder.setSkipAfter(optJSONObject3.optInt("skipafter", 5));
                            if ("interstitial".equals(str)) {
                                configBuilder.setBackButtonEnabled(optJSONObject3.optBoolean("enablehardwarebackbutton", false));
                            }
                        }
                    }
                }
            }
            return configBuilder.build();
        }

        public POBBannerConfig build() {
            return new POBBannerConfig(this);
        }

        public ConfigBuilder setBackButtonEnabled(boolean z) {
            this.a = z;
            return this;
        }

        public ConfigBuilder setSkipAfter(int i) {
            this.b = i;
            return this;
        }
    }

    public int getSkipAfter() {
        return this.a;
    }

    public boolean isBackButtonEnabled() {
        return this.b;
    }

    private POBBannerConfig(ConfigBuilder configBuilder) {
        this.a = configBuilder.b;
        this.b = configBuilder.a;
    }
}
