package com.pubmatic.sdk.video;

import androidx.annotation.LayoutRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.pubmatic.sdk.common.POBAdType;
import com.pubmatic.sdk.common.POBCommonConstants;
import com.pubmatic.sdk.common.log.POBLog;
import com.pubmatic.sdk.openwrap.core.POBConstants;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes9.dex */
public class POBVastPlayerConfig {
    private int a;
    private int b;
    private int c;
    private int d;
    private int e;
    private int f;
    private int g;
    private boolean h;
    private final int i;
    private final boolean j;
    private final boolean k;
    private final boolean l;
    private final boolean m;
    private POBVastPlayerUIConfig n;

    public static class ConfigBuilder {
        public static final int DEFAULT_ENDCARD_SKIP_AFTER = 5;
        public static final int DEFAULT_MEDIA_URI_TIMEOUT = 20000;
        public static final boolean DEFAULT_PLAY_ON_MUTE = true;
        public static final int DEFAULT_SKIP = 1;
        public static final int DEFAULT_VIDEO_SKIP_AFTER = 7;
        public static final int DEFAULT_WRAPPER_URI_TIMEOUT = 5000;
        private int a;
        private int b;
        private int d;
        private boolean h = true;
        private int i = 5;
        private boolean j = false;
        private boolean k = false;
        private boolean l = true;
        private boolean m = true;
        private int c = 1;
        private int e = 7;
        private int f = 5000;
        private int g = 20000;

        public ConfigBuilder(int i, int i2) {
            this.a = i;
            this.b = i2;
        }

        private static int a(boolean z) {
            return z ? 0 : 7;
        }

        @NonNull
        public static POBVastPlayerConfig createVastConfig(@Nullable JSONObject jSONObject, @NonNull POBAdType pOBAdType) {
            ConfigBuilder configBuilder = new ConfigBuilder(0, 0);
            if (jSONObject != null) {
                JSONObject optJSONObject = jSONObject.optJSONObject("ext");
                if (optJSONObject == null || optJSONObject.length() <= 0) {
                    POBLog.warn("ConfigBuilder", "Null/empty extension response parameter.", new Object[0]);
                } else {
                    JSONObject optJSONObject2 = optJSONObject.optJSONObject("video");
                    if (optJSONObject2 == null || optJSONObject2.length() <= 0) {
                        POBLog.warn("ConfigBuilder", "Null/empty video response parameter.", new Object[0]);
                    } else {
                        if (!pOBAdType.isAppOpen()) {
                            POBLog.info("ConfigBuilder", "Video config: " + optJSONObject2, new Object[0]);
                            configBuilder = new ConfigBuilder(optJSONObject2.optInt("minduration"), optJSONObject2.optInt("maxduration"));
                            configBuilder.skip(optJSONObject2.optInt("skip", 1));
                            configBuilder.skipMin(optJSONObject2.optInt("skipmin"));
                            configBuilder.setSkipAfterCompletionEnabled(pOBAdType.isRewarded());
                            if (-9999 != optJSONObject2.optInt("skipafter", POBCommonConstants.DEFAULT_INVALID_SKIP_AFTER_VALUE)) {
                                configBuilder.setSkipAfterCompletionEnabled(false);
                            }
                            configBuilder.skipAfter(optJSONObject2.optInt("skipafter", a(pOBAdType.isRewarded())));
                            JSONObject optJSONObject3 = optJSONObject2.optJSONObject(POBConstants.KEY_CLIENT_CONFIG);
                            if (optJSONObject3 != null && optJSONObject3.length() > 0) {
                                configBuilder.setBackButtonEnabled(optJSONObject3.optBoolean("enablehardwarebackbutton", false));
                                JSONObject optJSONObject4 = optJSONObject3.optJSONObject("timeouts");
                                if (optJSONObject4 != null) {
                                    configBuilder.wrapperUriTimeout(optJSONObject4.optInt("wrapperTagURI"));
                                    configBuilder.mediaUriTimeout(optJSONObject4.optInt("mediaFileURI"));
                                }
                                JSONObject optJSONObject5 = optJSONObject3.optJSONObject("companion");
                                if (optJSONObject5 != null) {
                                    configBuilder.endCardSkipAfter(optJSONObject5.optInt("skipafter", 5));
                                }
                            }
                        }
                        configBuilder.setPlayOnMute(!pOBAdType.isRewarded());
                        JSONArray optJSONArray = optJSONObject2.optJSONArray("playbackmethod");
                        if (optJSONArray != null && optJSONArray.length() > 0) {
                            try {
                                int intValue = ((Integer) optJSONArray.get(0)).intValue();
                                if (pOBAdType.isFullScreen()) {
                                    if (intValue == 1) {
                                        configBuilder.setPlayOnMute(false);
                                    } else if (intValue == 2) {
                                        configBuilder.setPlayOnMute(true);
                                    }
                                } else if (intValue == 5) {
                                    configBuilder.setPlayOnMute(false);
                                } else if (intValue == 6) {
                                    configBuilder.setPlayOnMute(true);
                                }
                            } catch (JSONException e) {
                                POBLog.warn("ConfigBuilder", "Failed to parse playbackmethod, %s", e);
                            }
                        }
                    }
                }
            }
            configBuilder.setCtaOverlayEnabled(!pOBAdType.isNative());
            return pOBAdType.isAppOpen() ? configBuilder.setSkipAfterCompletionEnabled(false).skip(0).skipAfter(0).endCardSkipAfter(0).setBackButtonEnabled(false).showEndCardNavigationControl(false).build(false) : configBuilder.build(pOBAdType.isFullScreen());
        }

        public POBVastPlayerConfig build(boolean z) {
            return new POBVastPlayerConfig(this, z);
        }

        public ConfigBuilder endCardSkipAfter(int i) {
            this.i = i;
            return this;
        }

        public ConfigBuilder mediaUriTimeout(int i) {
            if (i > this.g) {
                this.g = i;
            }
            return this;
        }

        public ConfigBuilder setBackButtonEnabled(boolean z) {
            this.j = z;
            return this;
        }

        public ConfigBuilder setCtaOverlayEnabled(boolean z) {
            this.m = z;
            return this;
        }

        public ConfigBuilder setPlayOnMute(boolean z) {
            this.h = z;
            return this;
        }

        public ConfigBuilder setSkipAfterCompletionEnabled(boolean z) {
            this.k = z;
            return this;
        }

        public ConfigBuilder showEndCardNavigationControl(boolean z) {
            this.l = z;
            return this;
        }

        public ConfigBuilder skip(int i) {
            this.c = i;
            return this;
        }

        public ConfigBuilder skipAfter(int i) {
            this.e = i;
            return this;
        }

        public ConfigBuilder skipMin(int i) {
            this.d = i;
            return this;
        }

        public ConfigBuilder wrapperUriTimeout(int i) {
            if (i > this.f) {
                this.f = i;
            }
            return this;
        }
    }

    public static class POBVastPlayerUIConfig {
        private final boolean a;
        private final boolean b;
        private final boolean c;
        private final boolean d;
        private final int e;

        public static class Builder {
            private boolean a = true;
            private boolean b = true;
            private boolean c = true;
            private boolean d = true;
            private int e = R.layout.pob_video_mute_button_default;

            @NonNull
            public POBVastPlayerUIConfig build() {
                return new POBVastPlayerUIConfig(this);
            }

            @NonNull
            public Builder setMuteButtonLayout(@LayoutRes int i) {
                this.e = i;
                return this;
            }

            @NonNull
            public Builder showAdInfoButton(boolean z) {
                this.c = z;
                return this;
            }

            @NonNull
            public Builder showIndustryIcon(boolean z) {
                this.d = z;
                return this;
            }

            @NonNull
            public Builder showMuteButton(boolean z) {
                this.b = z;
                return this;
            }

            @NonNull
            public Builder showProgressBar(boolean z) {
                this.a = z;
                return this;
            }
        }

        public static boolean canLoadAdInfoIcon(@Nullable POBVastPlayerUIConfig pOBVastPlayerUIConfig) {
            return pOBVastPlayerUIConfig == null || pOBVastPlayerUIConfig.isAdInfoButtonVisible();
        }

        public static boolean canLoadIndustryIcon(@Nullable POBVastPlayerUIConfig pOBVastPlayerUIConfig) {
            return pOBVastPlayerUIConfig == null || pOBVastPlayerUIConfig.isIndustryIconVisible();
        }

        @LayoutRes
        public int getMuteButtonLayoutResId() {
            return this.e;
        }

        public boolean isAdInfoButtonVisible() {
            return this.c;
        }

        public boolean isIndustryIconVisible() {
            return this.d;
        }

        public boolean isMuteButtonVisible() {
            return this.b;
        }

        public boolean isProgressBarVisible() {
            return this.a;
        }

        private POBVastPlayerUIConfig(Builder builder) {
            this.a = builder.a;
            this.b = builder.b;
            this.c = builder.c;
            this.d = builder.d;
            this.e = builder.e;
        }
    }

    public int getEndCardSkipAfter() {
        return this.i;
    }

    public int getMaxDuration() {
        return this.b;
    }

    public int getMediaUriTimeout() {
        return this.g;
    }

    public int getMinDuration() {
        return this.a;
    }

    public int getSkip() {
        return this.c;
    }

    public int getSkipAfter() {
        return this.e;
    }

    public int getSkipMin() {
        return this.d;
    }

    @Nullable
    public POBVastPlayerUIConfig getVastPlayerUIConfig() {
        return this.n;
    }

    public int getWrapperUriTimeout() {
        return this.f;
    }

    public boolean isBackButtonEnabled() {
        return this.j;
    }

    public boolean isCtaOverlayEnabled() {
        return this.m;
    }

    public boolean isPlayOnMute() {
        return this.h;
    }

    public boolean isSkipAfterCompletionEnabled() {
        return this.k;
    }

    public void setVastPlayerUIConfig(@Nullable POBVastPlayerUIConfig pOBVastPlayerUIConfig) {
        this.n = pOBVastPlayerUIConfig;
    }

    public boolean shouldShowEndCardNavigationControl() {
        return this.l;
    }

    private POBVastPlayerConfig(ConfigBuilder configBuilder, boolean z) {
        this.a = configBuilder.a;
        this.b = configBuilder.b;
        if (z) {
            this.c = configBuilder.c;
        }
        this.d = configBuilder.d;
        this.e = configBuilder.e;
        this.f = configBuilder.f;
        this.g = configBuilder.g;
        this.h = configBuilder.h;
        this.i = configBuilder.i;
        this.j = configBuilder.j;
        this.k = configBuilder.k;
        this.l = configBuilder.l;
        this.m = configBuilder.m;
    }
}
