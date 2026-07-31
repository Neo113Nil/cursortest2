package com.inmobi.unification.sdk.model.initialization;

import androidx.annotation.Keep;
import androidx.annotation.VisibleForTesting;
import com.inmobi.media.AbstractC4343si;
import com.inmobi.media.Pk;
import com.inmobi.media.Qk;
import com.ironsource.C4834q2;
import com.safedk.android.analytics.brandsafety.m;
import java.io.Serializable;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* loaded from: classes12.dex */
public final class TimeoutConfigurations implements Serializable {
    private static final int APPLOVIN_AB_DEFAULT_AUDIO_LOAD_TIMEOUT = 9500;
    private static final int APPLOVIN_AB_DEFAULT_AUDIO_MAX_RETRIES = 3;
    private static final int APPLOVIN_AB_DEFAULT_AUDIO_RETRY_INTERVAL = 1000;
    private static final int APPLOVIN_AB_DEFAULT_BANNER_LOAD_TIMEOUT = 9500;
    private static final int APPLOVIN_AB_DEFAULT_BANNER_MAX_RETRIES = 3;
    private static final int APPLOVIN_AB_DEFAULT_BANNER_RETRY_INTERVAL = 1000;
    private static final int APPLOVIN_AB_DEFAULT_INTERSTITIAL_LOAD_TIMEOUT = 29500;
    private static final int APPLOVIN_AB_DEFAULT_INTERSTITIAL_MAX_RETRIES = 3;
    private static final int APPLOVIN_AB_DEFAULT_INTERSTITIAL_RETRY_INTERVAL = 1000;
    private static final int APPLOVIN_AB_DEFAULT_NATIVE_LOAD_TIMEOUT = 14500;
    private static final int APPLOVIN_AB_DEFAULT_NATIVE_MAX_RETRIES = 3;
    private static final int APPLOVIN_AB_DEFAULT_NATIVE_RETRY_INTERVAL = 1000;

    @NotNull
    private static final String APPLOVIN_CUSTOM_KEY = "c_applovincustom";
    private static final int APPLOVIN_NONAB_DEFAULT_AUDIO_LOAD_TIMEOUT = 9500;
    private static final int APPLOVIN_NONAB_DEFAULT_AUDIO_MAX_RETRIES = 3;
    private static final int APPLOVIN_NONAB_DEFAULT_AUDIO_MUTT_TIMEOUT = 9500;
    private static final int APPLOVIN_NONAB_DEFAULT_AUDIO_RETRY_INTERVAL = 1000;
    private static final int APPLOVIN_NONAB_DEFAULT_BANNER_LOAD_TIMEOUT = 9500;
    private static final int APPLOVIN_NONAB_DEFAULT_BANNER_MAX_RETRIES = 3;
    private static final int APPLOVIN_NONAB_DEFAULT_BANNER_MUTT_TIMEOUT = 9500;
    private static final int APPLOVIN_NONAB_DEFAULT_BANNER_RETRY_INTERVAL = 1000;
    private static final int APPLOVIN_NONAB_DEFAULT_INTERSTITIAL_LOAD_TIMEOUT = 14500;
    private static final int APPLOVIN_NONAB_DEFAULT_INTERSTITIAL_MAX_RETRIES = 3;
    private static final int APPLOVIN_NONAB_DEFAULT_INTERSTITIAL_MUTT_TIMEOUT = 14500;
    private static final int APPLOVIN_NONAB_DEFAULT_INTERSTITIAL_RETRY_INTERVAL = 1000;
    private static final int APPLOVIN_NONAB_DEFAULT_NATIVE_LOAD_TIMEOUT = 14500;
    private static final int APPLOVIN_NONAB_DEFAULT_NATIVE_MAX_RETRIES = 3;
    private static final int APPLOVIN_NONAB_DEFAULT_NATIVE_MUTT_TIMEOUT = 14500;
    private static final int APPLOVIN_NONAB_DEFAULT_NATIVE_RETRY_INTERVAL = 1000;
    private static final int DEFAULT_AB_AUDIO_LOAD_TIMEOUT = 14500;
    private static final int DEFAULT_AB_BANNER_LOAD_TIMEOUT = 14500;
    private static final int DEFAULT_AB_INTERSTITIAL_LOAD_TIMEOUT = 29500;
    private static final int DEFAULT_AB_NATIVE_LOAD_TIMEOUT = 14500;

    @NotNull
    private static final String DEFAULT_KEY = "default";
    private static final int DEFAULT_MAX_RETRIES = 3;
    private static final int DEFAULT_NONAB_AUDIO_LOAD_TIMEOUT = 29500;
    private static final int DEFAULT_NONAB_AUDIO_MUTT_TIMEOUT = 29500;
    private static final int DEFAULT_NONAB_BANNER_LOAD_TIMEOUT = 29500;
    private static final int DEFAULT_NONAB_BANNER_MUTT_TIMEOUT = 29500;
    private static final int DEFAULT_NONAB_INTERSTITIAL_LOAD_TIMEOUT = 29500;
    private static final int DEFAULT_NONAB_INTERSTITIAL_MUTT_TIMEOUT = 29500;
    private static final int DEFAULT_NONAB_NATIVE_LOAD_TIMEOUT = 29500;
    private static final int DEFAULT_NONAB_NATIVE_MUTT_TIMEOUT = 29500;
    private static final int DEFAULT_RETRY_INTERVAL = 1000;
    public static final int DEFAULT_TIMEOUT = 15000;

    @NotNull
    private static final Function1 adaptiveBannerControlValidator;

    @NotNull
    private static final JSONObject defaultABAudioMaxRetries;

    @NotNull
    private static final JSONObject defaultABAudioRetryInterval;

    @NotNull
    private static final JSONObject defaultABAudioloadTimeout;

    @NotNull
    private static final JSONObject defaultABBannerAdaptiveBannerControl;

    @NotNull
    private static final JSONObject defaultABBannerMaxRetries;

    @NotNull
    private static final JSONObject defaultABBannerRetryInterval;

    @NotNull
    private static final JSONObject defaultABBannerloadTimeout;

    @NotNull
    private static final JSONObject defaultABIntMaxRetries;

    @NotNull
    private static final JSONObject defaultABIntRetryInterval;

    @NotNull
    private static final JSONObject defaultABIntloadTimeout;

    @NotNull
    private static final JSONObject defaultABNativeMaxRetries;

    @NotNull
    private static final JSONObject defaultABNativeRetryInterval;

    @NotNull
    private static final JSONObject defaultABNativeloadTimeout;

    @NotNull
    private static final JSONObject defaultNonABAudioMaxRetries;

    @NotNull
    private static final JSONObject defaultNonABAudioMuttTimeout;

    @NotNull
    private static final JSONObject defaultNonABAudioRetryInterval;

    @NotNull
    private static final JSONObject defaultNonABAudioloadTimeout;

    @NotNull
    private static final JSONObject defaultNonABBannerAdaptiveBannerControl;

    @NotNull
    private static final JSONObject defaultNonABBannerMaxRetries;

    @NotNull
    private static final JSONObject defaultNonABBannerMuttTimeout;

    @NotNull
    private static final JSONObject defaultNonABBannerRetryInterval;

    @NotNull
    private static final JSONObject defaultNonABIntMaxRetries;

    @NotNull
    private static final JSONObject defaultNonABIntMuttTimeout;

    @NotNull
    private static final JSONObject defaultNonABIntRetryInterval;

    @NotNull
    private static final JSONObject defaultNonABIntloadTimeout;

    @NotNull
    private static final JSONObject defaultNonABNativeMaxRetries;

    @NotNull
    private static final JSONObject defaultNonABNativeMuttTimeout;

    @NotNull
    private static final JSONObject defaultNonABNativeRetryInterval;

    @NotNull
    private static final JSONObject defaultNonABNativeloadTimeout;

    @NotNull
    private static final JSONObject defaultPreloadAudioMaxRetries;

    @NotNull
    private static final JSONObject defaultPreloadAudioMuttTimeout;

    @NotNull
    private static final JSONObject defaultPreloadAudioPreloadTimeout;

    @NotNull
    private static final JSONObject defaultPreloadAudioRetryInterval;

    @NotNull
    private static final JSONObject defaultPreloadAudioloadTimeout;

    @NotNull
    private static final JSONObject defaultPreloadBannerLoadTimeout;

    @NotNull
    private static final JSONObject defaultPreloadBannerMaxRetries;

    @NotNull
    private static final JSONObject defaultPreloadBannerMuttTimeout;

    @NotNull
    private static final JSONObject defaultPreloadBannerPreloadTimeout;

    @NotNull
    private static final JSONObject defaultPreloadBannerRetryInterval;

    @NotNull
    private static final JSONObject defaultPreloadIntMaxRetries;

    @NotNull
    private static final JSONObject defaultPreloadIntMuttTimeout;

    @NotNull
    private static final JSONObject defaultPreloadIntPreloadTimeout;

    @NotNull
    private static final JSONObject defaultPreloadIntRetryInterval;

    @NotNull
    private static final JSONObject defaultPreloadIntloadTimeout;

    @NotNull
    private static final JSONObject defaultPreloadNativeMaxRetries;

    @NotNull
    private static final JSONObject defaultPreloadNativeMuttTimeout;

    @NotNull
    private static final JSONObject defaultPreloadNativePreloadTimeout;

    @NotNull
    private static final JSONObject defaultPreloadNativeRetryInterval;

    @NotNull
    private static final JSONObject defaultPreloadNativeloadTimeout;

    @NotNull
    private static final Function2 validator;

    @NotNull
    public static final Qk Companion = new Qk();

    @NotNull
    private static final String APPLOVIN_KEY = "c_applovin";

    @NotNull
    private static final JSONObject defaultNonABBannerloadTimeout = Pk.a(29500, 9500, "default", APPLOVIN_KEY);
    private int step4s = 15000;

    @NotNull
    private MediationConfig mediationConfig = new MediationConfig();

    @Keep
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\t\u001a\u00020\u0005J\u0006\u0010\n\u001a\u00020\u0005J\u0006\u0010\u000b\u001a\u00020\u0005J\u0006\u0010\f\u001a\u00020\u0005J\u0006\u0010\r\u001a\u00020\u000eR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lcom/inmobi/unification/sdk/model/initialization/TimeoutConfigurations$ABConfig;", "", "<init>", "()V", "banner", "Lcom/inmobi/unification/sdk/model/initialization/TimeoutConfigurations$AdABConfig;", m.w, "native", "audio", "getBanner", "getInterstitial", "getNative", "getAudio", "isValid", "", "media_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class ABConfig {

        @NotNull
        private AdABConfig audio;

        @NotNull
        private AdABConfig banner;

        @NotNull
        private AdABConfig int;

        @NotNull
        private AdABConfig native;

        public ABConfig() {
            TimeoutConfigurations.Companion.getClass();
            this.banner = new AdABConfig(TimeoutConfigurations.defaultABBannerloadTimeout, TimeoutConfigurations.defaultABBannerRetryInterval, TimeoutConfigurations.defaultABBannerMaxRetries, TimeoutConfigurations.defaultABBannerAdaptiveBannerControl);
            this.int = new AdABConfig(TimeoutConfigurations.defaultABIntloadTimeout, TimeoutConfigurations.defaultABIntRetryInterval, TimeoutConfigurations.defaultABIntMaxRetries, null, 8, null);
            this.native = new AdABConfig(TimeoutConfigurations.defaultABNativeloadTimeout, TimeoutConfigurations.defaultABNativeRetryInterval, TimeoutConfigurations.defaultABNativeMaxRetries, null, 8, null);
            this.audio = new AdABConfig(TimeoutConfigurations.defaultABAudioloadTimeout, TimeoutConfigurations.defaultABAudioRetryInterval, TimeoutConfigurations.defaultABAudioMaxRetries, null, 8, null);
        }

        @NotNull
        public final AdABConfig getAudio() {
            return this.audio;
        }

        @NotNull
        public final AdABConfig getBanner() {
            return this.banner;
        }

        @NotNull
        /* renamed from: getInterstitial, reason: from getter */
        public final AdABConfig getInt() {
            return this.int;
        }

        @NotNull
        public final AdABConfig getNative() {
            return this.native;
        }

        public final boolean isValid() {
            return this.banner.isValid() && this.int.isValid() && this.native.isValid() && this.audio.isValid();
        }
    }

    @Keep
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\n\u001a\u00020\u0005J\u0006\u0010\u000b\u001a\u00020\u0007J\u0006\u0010\f\u001a\u00020\tJ\u0006\u0010\r\u001a\u00020\u000eR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lcom/inmobi/unification/sdk/model/initialization/TimeoutConfigurations$MediationConfig;", "", "<init>", "()V", "ab", "Lcom/inmobi/unification/sdk/model/initialization/TimeoutConfigurations$ABConfig;", "nonAb", "Lcom/inmobi/unification/sdk/model/initialization/TimeoutConfigurations$NonABConfig;", "preload", "Lcom/inmobi/unification/sdk/model/initialization/TimeoutConfigurations$PreloadConfig;", "getABConfig", "getNonABConfig", "getPreloadConfig", "isValid", "", "media_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class MediationConfig {

        @NotNull
        private ABConfig ab = new ABConfig();

        @NotNull
        private NonABConfig nonAb = new NonABConfig();

        @NotNull
        private PreloadConfig preload = new PreloadConfig();

        @NotNull
        /* renamed from: getABConfig, reason: from getter */
        public final ABConfig getAb() {
            return this.ab;
        }

        @NotNull
        /* renamed from: getNonABConfig, reason: from getter */
        public final NonABConfig getNonAb() {
            return this.nonAb;
        }

        @NotNull
        /* renamed from: getPreloadConfig, reason: from getter */
        public final PreloadConfig getPreload() {
            return this.preload;
        }

        public final boolean isValid() {
            return this.ab.isValid() && this.nonAb.isValid() && this.preload.isValid();
        }
    }

    @Keep
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\t\u001a\u00020\u0005J\u0006\u0010\n\u001a\u00020\u0005J\u0006\u0010\u000b\u001a\u00020\u0005J\u0006\u0010\f\u001a\u00020\u0005J\u0006\u0010\r\u001a\u00020\u000eR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lcom/inmobi/unification/sdk/model/initialization/TimeoutConfigurations$NonABConfig;", "", "<init>", "()V", "banner", "Lcom/inmobi/unification/sdk/model/initialization/TimeoutConfigurations$AdNonABConfig;", m.w, "native", "audio", "getBanner", "getInterstitial", "getNative", "getAudio", "isValid", "", "media_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class NonABConfig {

        @NotNull
        private AdNonABConfig audio;

        @NotNull
        private AdNonABConfig banner;

        @NotNull
        private AdNonABConfig int;

        @NotNull
        private AdNonABConfig native;

        public NonABConfig() {
            TimeoutConfigurations.Companion.getClass();
            this.banner = new AdNonABConfig(TimeoutConfigurations.defaultNonABBannerloadTimeout, TimeoutConfigurations.defaultNonABBannerMuttTimeout, TimeoutConfigurations.defaultNonABBannerRetryInterval, TimeoutConfigurations.defaultNonABBannerMaxRetries, TimeoutConfigurations.defaultNonABBannerAdaptiveBannerControl);
            this.int = new AdNonABConfig(TimeoutConfigurations.defaultNonABIntloadTimeout, TimeoutConfigurations.defaultNonABIntMuttTimeout, TimeoutConfigurations.defaultNonABIntRetryInterval, TimeoutConfigurations.defaultNonABIntMaxRetries, null, 16, null);
            this.native = new AdNonABConfig(TimeoutConfigurations.defaultNonABNativeloadTimeout, TimeoutConfigurations.defaultNonABNativeMuttTimeout, TimeoutConfigurations.defaultNonABNativeRetryInterval, TimeoutConfigurations.defaultNonABNativeMaxRetries, null, 16, null);
            this.audio = new AdNonABConfig(TimeoutConfigurations.defaultNonABAudioloadTimeout, TimeoutConfigurations.defaultNonABAudioMuttTimeout, TimeoutConfigurations.defaultNonABAudioRetryInterval, TimeoutConfigurations.defaultNonABAudioMaxRetries, null, 16, null);
        }

        @NotNull
        public final AdNonABConfig getAudio() {
            return this.audio;
        }

        @NotNull
        public final AdNonABConfig getBanner() {
            return this.banner;
        }

        @NotNull
        /* renamed from: getInterstitial, reason: from getter */
        public final AdNonABConfig getInt() {
            return this.int;
        }

        @NotNull
        public final AdNonABConfig getNative() {
            return this.native;
        }

        public final boolean isValid() {
            return this.banner.isValid() && this.int.isValid() && this.native.isValid() && this.audio.isValid();
        }
    }

    @Keep
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\t\u001a\u00020\u0005J\u0006\u0010\n\u001a\u00020\u0005J\u0006\u0010\u000b\u001a\u00020\u0005J\u0006\u0010\f\u001a\u00020\u0005J\u0006\u0010\r\u001a\u00020\u000eR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lcom/inmobi/unification/sdk/model/initialization/TimeoutConfigurations$PreloadConfig;", "", "<init>", "()V", "banner", "Lcom/inmobi/unification/sdk/model/initialization/TimeoutConfigurations$AdPreloadConfig;", m.w, "native", "audio", "getBanner", "getInterstitial", "getNative", "getAudio", "isValid", "", "media_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class PreloadConfig {

        @NotNull
        private AdPreloadConfig audio;

        @NotNull
        private AdPreloadConfig banner;

        @NotNull
        private AdPreloadConfig int;

        @NotNull
        private AdPreloadConfig native;

        public PreloadConfig() {
            TimeoutConfigurations.Companion.getClass();
            this.banner = new AdPreloadConfig(TimeoutConfigurations.defaultPreloadBannerPreloadTimeout, TimeoutConfigurations.defaultPreloadBannerMuttTimeout, TimeoutConfigurations.defaultPreloadBannerLoadTimeout, TimeoutConfigurations.defaultPreloadBannerRetryInterval, TimeoutConfigurations.defaultPreloadBannerMaxRetries);
            this.int = new AdPreloadConfig(TimeoutConfigurations.defaultPreloadIntPreloadTimeout, TimeoutConfigurations.defaultPreloadIntMuttTimeout, TimeoutConfigurations.defaultPreloadIntloadTimeout, TimeoutConfigurations.defaultPreloadIntRetryInterval, TimeoutConfigurations.defaultPreloadIntMaxRetries);
            this.native = new AdPreloadConfig(TimeoutConfigurations.defaultPreloadNativePreloadTimeout, TimeoutConfigurations.defaultPreloadNativeMuttTimeout, TimeoutConfigurations.defaultPreloadNativeloadTimeout, TimeoutConfigurations.defaultPreloadNativeRetryInterval, TimeoutConfigurations.defaultPreloadNativeMaxRetries);
            this.audio = new AdPreloadConfig(TimeoutConfigurations.defaultPreloadAudioPreloadTimeout, TimeoutConfigurations.defaultPreloadAudioMuttTimeout, TimeoutConfigurations.defaultPreloadAudioloadTimeout, TimeoutConfigurations.defaultPreloadAudioRetryInterval, TimeoutConfigurations.defaultPreloadAudioMaxRetries);
        }

        @NotNull
        public final AdPreloadConfig getAudio() {
            return this.audio;
        }

        @NotNull
        public final AdPreloadConfig getBanner() {
            return this.banner;
        }

        @NotNull
        /* renamed from: getInterstitial, reason: from getter */
        public final AdPreloadConfig getInt() {
            return this.int;
        }

        @NotNull
        public final AdPreloadConfig getNative() {
            return this.native;
        }

        public final boolean isValid() {
            return this.banner.isValid() && this.int.isValid() && this.native.isValid() && this.audio.isValid();
        }
    }

    @Keep
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0014\b\u0007\u0018\u0000 \u001e2\u00020\u0001:\u0001\u001fB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\n\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0000¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\r\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\r\u0010\u000eR\"\u0010\u000f\u001a\u00020\u00068\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\"\u0010\u0015\u001a\u00020\u00068\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010\u0010\u001a\u0004\b\u0016\u0010\u0012\"\u0004\b\u0017\u0010\u0014R\"\u0010\u0018\u001a\u00020\u00068\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010\u0010\u001a\u0004\b\u0019\u0010\u0012\"\u0004\b\u001a\u0010\u0014R\"\u0010\u001b\u001a\u00020\u00068\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u001b\u0010\u0010\u001a\u0004\b\u001c\u0010\u0012\"\u0004\b\u001d\u0010\u0014¨\u0006 "}, d2 = {"Lcom/inmobi/unification/sdk/model/initialization/TimeoutConfigurations$RenderTimeoutByType;", "", "<init>", "()V", "", "adType", "", "defValue", "getTimeoutByType$media_release", "(Ljava/lang/String;I)I", "getTimeoutByType", "timeout", "", "setTimeoutByType", "(Ljava/lang/String;I)V", "banner", "I", "getBanner$media_release", "()I", "setBanner$media_release", "(I)V", "audio", "getAudio$media_release", "setAudio$media_release", m.w, "getInt$media_release", "setInt$media_release", "native", "getNative$media_release", "setNative$media_release", "Companion", "com/inmobi/unification/sdk/model/initialization/a", "media_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class RenderTimeoutByType {

        @NotNull
        public static final a Companion = new a();
        private int audio;
        private int banner;
        private int int;
        private int native;

        public /* synthetic */ RenderTimeoutByType(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: getAudio$media_release, reason: from getter */
        public final int getAudio() {
            return this.audio;
        }

        /* renamed from: getBanner$media_release, reason: from getter */
        public final int getBanner() {
            return this.banner;
        }

        /* renamed from: getInt$media_release, reason: from getter */
        public final int getInt() {
            return this.int;
        }

        /* renamed from: getNative$media_release, reason: from getter */
        public final int getNative() {
            return this.native;
        }

        public final int getTimeoutByType$media_release(@NotNull String adType, int defValue) {
            int i;
            int i2;
            int i3;
            int i4;
            Intrinsics.checkNotNullParameter(adType, "adType");
            int hashCode = adType.hashCode();
            if (hashCode != -1396342996) {
                if (hashCode != -1052618729) {
                    if (hashCode != 104431) {
                        if (hashCode == 93166550 && adType.equals("audio") && (i4 = this.audio) > 0) {
                            return i4;
                        }
                    } else if (adType.equals(m.w) && (i3 = this.int) > 0) {
                        return i3;
                    }
                } else if (adType.equals("native") && (i2 = this.native) > 0) {
                    return i2;
                }
            } else if (adType.equals("banner") && (i = this.banner) > 0) {
                return i;
            }
            return defValue;
        }

        public final void setAudio$media_release(int i) {
            this.audio = i;
        }

        public final void setBanner$media_release(int i) {
            this.banner = i;
        }

        public final void setInt$media_release(int i) {
            this.int = i;
        }

        public final void setNative$media_release(int i) {
            this.native = i;
        }

        @VisibleForTesting
        public final void setTimeoutByType(@NotNull String adType, int timeout) {
            Intrinsics.checkNotNullParameter(adType, "adType");
            int hashCode = adType.hashCode();
            if (hashCode == -1396342996) {
                if (adType.equals("banner")) {
                    this.banner = timeout;
                }
            } else if (hashCode == -1052618729) {
                if (adType.equals("native")) {
                    this.native = timeout;
                }
            } else if (hashCode == 104431) {
                if (adType.equals(m.w)) {
                    this.int = timeout;
                }
            } else if (hashCode == 93166550 && adType.equals("audio")) {
                this.audio = timeout;
            }
        }

        private RenderTimeoutByType() {
        }
    }

    static {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("default", true);
        jSONObject.put(APPLOVIN_KEY, true);
        jSONObject.put(APPLOVIN_CUSTOM_KEY, true);
        defaultNonABBannerAdaptiveBannerControl = jSONObject;
        defaultNonABBannerMuttTimeout = Pk.a(29500, 9500, "default", APPLOVIN_KEY);
        defaultNonABBannerMaxRetries = Pk.a(3, 3, "default", APPLOVIN_KEY);
        defaultNonABBannerRetryInterval = Pk.a(1000, 1000, "default", APPLOVIN_KEY);
        defaultNonABIntloadTimeout = Pk.a(29500, 14500, "default", APPLOVIN_KEY);
        defaultNonABIntMuttTimeout = Pk.a(29500, 14500, "default", APPLOVIN_KEY);
        defaultNonABIntMaxRetries = Pk.a(3, 3, "default", APPLOVIN_KEY);
        defaultNonABIntRetryInterval = Pk.a(1000, 1000, "default", APPLOVIN_KEY);
        defaultNonABNativeloadTimeout = Pk.a(29500, 14500, "default", APPLOVIN_KEY);
        defaultNonABNativeMuttTimeout = Pk.a(29500, 14500, "default", APPLOVIN_KEY);
        defaultNonABNativeMaxRetries = Pk.a(3, 3, "default", APPLOVIN_KEY);
        defaultNonABNativeRetryInterval = Pk.a(1000, 1000, "default", APPLOVIN_KEY);
        defaultNonABAudioloadTimeout = Pk.a(29500, 9500, "default", APPLOVIN_KEY);
        defaultNonABAudioMuttTimeout = Pk.a(29500, 9500, "default", APPLOVIN_KEY);
        defaultNonABAudioMaxRetries = Pk.a(3, 3, "default", APPLOVIN_KEY);
        defaultNonABAudioRetryInterval = Pk.a(1000, 1000, "default", APPLOVIN_KEY);
        defaultABBannerloadTimeout = Pk.a(14500, 9500, "default", APPLOVIN_KEY);
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("default", true);
        jSONObject2.put(APPLOVIN_KEY, true);
        jSONObject2.put(APPLOVIN_CUSTOM_KEY, true);
        defaultABBannerAdaptiveBannerControl = jSONObject2;
        defaultABBannerMaxRetries = Pk.a(3, 3, "default", APPLOVIN_KEY);
        defaultABBannerRetryInterval = Pk.a(1000, 1000, "default", APPLOVIN_KEY);
        defaultABIntloadTimeout = Pk.a(29500, 29500, "default", APPLOVIN_KEY);
        defaultABIntMaxRetries = Pk.a(3, 3, "default", APPLOVIN_KEY);
        defaultABIntRetryInterval = Pk.a(1000, 1000, "default", APPLOVIN_KEY);
        defaultABNativeloadTimeout = Pk.a(14500, 14500, "default", APPLOVIN_KEY);
        defaultABNativeMaxRetries = Pk.a(3, 3, "default", APPLOVIN_KEY);
        defaultABNativeRetryInterval = Pk.a(1000, 1000, "default", APPLOVIN_KEY);
        defaultABAudioloadTimeout = Pk.a(14500, 9500, "default", APPLOVIN_KEY);
        defaultABAudioMaxRetries = Pk.a(3, 3, "default", APPLOVIN_KEY);
        defaultABAudioRetryInterval = Pk.a(1000, 1000, "default", APPLOVIN_KEY);
        defaultPreloadBannerPreloadTimeout = AbstractC4343si.a("default", 29500);
        defaultPreloadBannerMuttTimeout = AbstractC4343si.a("default", 29500);
        defaultPreloadBannerLoadTimeout = AbstractC4343si.a("default", 14500);
        defaultPreloadBannerMaxRetries = AbstractC4343si.a("default", 3);
        defaultPreloadBannerRetryInterval = AbstractC4343si.a("default", 1000);
        defaultPreloadIntPreloadTimeout = AbstractC4343si.a("default", 29500);
        defaultPreloadIntMuttTimeout = AbstractC4343si.a("default", 29500);
        defaultPreloadIntloadTimeout = AbstractC4343si.a("default", 29500);
        defaultPreloadIntMaxRetries = AbstractC4343si.a("default", 3);
        defaultPreloadIntRetryInterval = AbstractC4343si.a("default", 1000);
        defaultPreloadNativePreloadTimeout = AbstractC4343si.a("default", 29500);
        defaultPreloadNativeMuttTimeout = AbstractC4343si.a("default", 29500);
        defaultPreloadNativeloadTimeout = AbstractC4343si.a("default", 14500);
        defaultPreloadNativeMaxRetries = AbstractC4343si.a("default", 3);
        defaultPreloadNativeRetryInterval = AbstractC4343si.a("default", 1000);
        defaultPreloadAudioPreloadTimeout = AbstractC4343si.a("default", 29500);
        defaultPreloadAudioMuttTimeout = AbstractC4343si.a("default", 29500);
        defaultPreloadAudioloadTimeout = AbstractC4343si.a("default", 14500);
        defaultPreloadAudioMaxRetries = AbstractC4343si.a("default", 3);
        defaultPreloadAudioRetryInterval = AbstractC4343si.a("default", 1000);
        validator = new Function2() { // from class: com.inmobi.unification.sdk.model.initialization.TimeoutConfigurations$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return Boolean.valueOf(TimeoutConfigurations.a((JSONObject) obj, ((Integer) obj2).intValue()));
            }
        };
        adaptiveBannerControlValidator = new Function1() { // from class: com.inmobi.unification.sdk.model.initialization.TimeoutConfigurations$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Boolean.valueOf(TimeoutConfigurations.a((JSONObject) obj));
            }
        };
    }

    public final MediationConfig a0() {
        return this.mediationConfig;
    }

    public final int b0() {
        return this.step4s;
    }

    public final boolean c0() {
        return this.step4s >= 0 && this.mediationConfig.isValid();
    }

    public final void d0() {
        int i = this.step4s;
        if (i <= 0) {
            i = 15000;
        }
        this.step4s = i;
    }

    public static final boolean a(JSONObject param, int i) {
        Intrinsics.checkNotNullParameter(param, "param");
        Iterator<String> keys = param.keys();
        Intrinsics.checkNotNullExpressionValue(keys, "keys(...)");
        boolean z = true;
        while (keys.hasNext()) {
            if (param.getInt(keys.next()) < i) {
                z = false;
            }
        }
        return z;
    }

    @Keep
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0016¢\u0006\u0004\b\u0002\u0010\u0003B+\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0005¢\u0006\u0004\b\u0002\u0010\tJ\u0006\u0010\f\u001a\u00020\u0005J\u0006\u0010\r\u001a\u00020\u0005J\u0006\u0010\u000e\u001a\u00020\u0005J\u0006\u0010\u000f\u001a\u00020\u0005J\u0010\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013J\u0006\u0010\u0014\u001a\u00020\u0011R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0015"}, d2 = {"Lcom/inmobi/unification/sdk/model/initialization/TimeoutConfigurations$AdABConfig;", "", "<init>", "()V", C4834q2.t, "Lorg/json/JSONObject;", "retryInterval", "maxRetries", "adaptiveBannerControl", "(Lorg/json/JSONObject;Lorg/json/JSONObject;Lorg/json/JSONObject;Lorg/json/JSONObject;)V", "loadRetryInterval", "maxLoadRetries", "getLoadTimeout", "getRetryInterval", "getMaxRetries", "getAdaptiveBannerControl", "isAdaptiveBannerEnabled", "", "tp", "", "isValid", "media_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class AdABConfig {

        @NotNull
        private JSONObject adaptiveBannerControl;

        @NotNull
        private JSONObject loadRetryInterval;

        @NotNull
        private JSONObject loadTimeout;

        @NotNull
        private JSONObject maxLoadRetries;

        public AdABConfig() {
            this.loadTimeout = new JSONObject();
            this.loadRetryInterval = new JSONObject();
            this.maxLoadRetries = new JSONObject();
            this.adaptiveBannerControl = new JSONObject();
        }

        @NotNull
        public final JSONObject getAdaptiveBannerControl() {
            return this.adaptiveBannerControl;
        }

        @NotNull
        public final JSONObject getLoadTimeout() {
            return this.loadTimeout;
        }

        @NotNull
        /* renamed from: getMaxRetries, reason: from getter */
        public final JSONObject getMaxLoadRetries() {
            return this.maxLoadRetries;
        }

        @NotNull
        /* renamed from: getRetryInterval, reason: from getter */
        public final JSONObject getLoadRetryInterval() {
            return this.loadRetryInterval;
        }

        public final boolean isAdaptiveBannerEnabled(@Nullable String tp) {
            JSONObject jSONObject = this.adaptiveBannerControl;
            return jSONObject.optBoolean(tp, jSONObject.optBoolean("default", true));
        }

        public final boolean isValid() {
            TimeoutConfigurations.Companion.getClass();
            return ((Boolean) TimeoutConfigurations.validator.invoke(this.loadTimeout, 0)).booleanValue() && ((Boolean) TimeoutConfigurations.validator.invoke(this.loadRetryInterval, 1)).booleanValue() && ((Boolean) TimeoutConfigurations.validator.invoke(this.maxLoadRetries, 1)).booleanValue() && (this.adaptiveBannerControl.length() == 0 || ((Boolean) TimeoutConfigurations.adaptiveBannerControlValidator.invoke(this.adaptiveBannerControl)).booleanValue());
        }

        public /* synthetic */ AdABConfig(JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3, JSONObject jSONObject4, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(jSONObject, jSONObject2, jSONObject3, (i & 8) != 0 ? new JSONObject() : jSONObject4);
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public AdABConfig(@NotNull JSONObject loadTimeout, @NotNull JSONObject retryInterval, @NotNull JSONObject maxRetries, @NotNull JSONObject adaptiveBannerControl) {
            this();
            Intrinsics.checkNotNullParameter(loadTimeout, "loadTimeout");
            Intrinsics.checkNotNullParameter(retryInterval, "retryInterval");
            Intrinsics.checkNotNullParameter(maxRetries, "maxRetries");
            Intrinsics.checkNotNullParameter(adaptiveBannerControl, "adaptiveBannerControl");
            this.loadTimeout = loadTimeout;
            this.loadRetryInterval = retryInterval;
            this.maxLoadRetries = maxRetries;
            this.adaptiveBannerControl = adaptiveBannerControl;
        }
    }

    @Keep
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0016¢\u0006\u0004\b\u0002\u0010\u0003B3\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0005\u0012\b\b\u0002\u0010\t\u001a\u00020\u0005¢\u0006\u0004\b\u0002\u0010\nJ\u0006\u0010\r\u001a\u00020\u0005J\u0006\u0010\u000e\u001a\u00020\u0005J\u0006\u0010\u000f\u001a\u00020\u0005J\u0006\u0010\u0010\u001a\u00020\u0005J\u0006\u0010\u0011\u001a\u00020\u0005J\u0010\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015J\u0006\u0010\u0016\u001a\u00020\u0013R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0017"}, d2 = {"Lcom/inmobi/unification/sdk/model/initialization/TimeoutConfigurations$AdNonABConfig;", "", "<init>", "()V", C4834q2.t, "Lorg/json/JSONObject;", "muttTimeout", "retryInterval", "maxRetries", "adaptiveBannerControl", "(Lorg/json/JSONObject;Lorg/json/JSONObject;Lorg/json/JSONObject;Lorg/json/JSONObject;Lorg/json/JSONObject;)V", "loadRetryInterval", "maxLoadRetries", "getLoadTimeout", "getMuttTimeout", "getRetryInterval", "getMaxRetries", "getAdaptiveBannerControl", "isAdaptiveBannerEnabled", "", "tp", "", "isValid", "media_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class AdNonABConfig {

        @NotNull
        private JSONObject adaptiveBannerControl;

        @NotNull
        private JSONObject loadRetryInterval;

        @NotNull
        private JSONObject loadTimeout;

        @NotNull
        private JSONObject maxLoadRetries;

        @NotNull
        private JSONObject muttTimeout;

        public AdNonABConfig() {
            this.loadTimeout = new JSONObject();
            this.muttTimeout = new JSONObject();
            this.loadRetryInterval = new JSONObject();
            this.maxLoadRetries = new JSONObject();
            this.adaptiveBannerControl = new JSONObject();
        }

        @NotNull
        public final JSONObject getAdaptiveBannerControl() {
            return this.adaptiveBannerControl;
        }

        @NotNull
        public final JSONObject getLoadTimeout() {
            return this.loadTimeout;
        }

        @NotNull
        /* renamed from: getMaxRetries, reason: from getter */
        public final JSONObject getMaxLoadRetries() {
            return this.maxLoadRetries;
        }

        @NotNull
        public final JSONObject getMuttTimeout() {
            return this.muttTimeout;
        }

        @NotNull
        /* renamed from: getRetryInterval, reason: from getter */
        public final JSONObject getLoadRetryInterval() {
            return this.loadRetryInterval;
        }

        public final boolean isAdaptiveBannerEnabled(@Nullable String tp) {
            JSONObject jSONObject = this.adaptiveBannerControl;
            return jSONObject.optBoolean(tp, jSONObject.optBoolean("default", true));
        }

        public final boolean isValid() {
            TimeoutConfigurations.Companion.getClass();
            return ((Boolean) TimeoutConfigurations.validator.invoke(this.muttTimeout, 0)).booleanValue() && ((Boolean) TimeoutConfigurations.validator.invoke(this.loadTimeout, 0)).booleanValue() && ((Boolean) TimeoutConfigurations.validator.invoke(this.loadRetryInterval, 1)).booleanValue() && ((Boolean) TimeoutConfigurations.validator.invoke(this.maxLoadRetries, 1)).booleanValue() && (this.adaptiveBannerControl.length() == 0 || ((Boolean) TimeoutConfigurations.adaptiveBannerControlValidator.invoke(this.adaptiveBannerControl)).booleanValue());
        }

        public /* synthetic */ AdNonABConfig(JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3, JSONObject jSONObject4, JSONObject jSONObject5, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(jSONObject, jSONObject2, jSONObject3, jSONObject4, (i & 16) != 0 ? new JSONObject() : jSONObject5);
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public AdNonABConfig(@NotNull JSONObject loadTimeout, @NotNull JSONObject muttTimeout, @NotNull JSONObject retryInterval, @NotNull JSONObject maxRetries, @NotNull JSONObject adaptiveBannerControl) {
            this();
            Intrinsics.checkNotNullParameter(loadTimeout, "loadTimeout");
            Intrinsics.checkNotNullParameter(muttTimeout, "muttTimeout");
            Intrinsics.checkNotNullParameter(retryInterval, "retryInterval");
            Intrinsics.checkNotNullParameter(maxRetries, "maxRetries");
            Intrinsics.checkNotNullParameter(adaptiveBannerControl, "adaptiveBannerControl");
            this.loadTimeout = loadTimeout;
            this.muttTimeout = muttTimeout;
            this.loadRetryInterval = retryInterval;
            this.maxLoadRetries = maxRetries;
            this.adaptiveBannerControl = adaptiveBannerControl;
        }
    }

    @Keep
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0016¢\u0006\u0004\b\u0002\u0010\u0003B1\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0005\u0012\u0006\u0010\t\u001a\u00020\u0005¢\u0006\u0004\b\u0002\u0010\nJ\u0006\u0010\r\u001a\u00020\u0005J\u0006\u0010\u000e\u001a\u00020\u0005J\u0006\u0010\u000f\u001a\u00020\u0005J\u0006\u0010\u0010\u001a\u00020\u0005J\u0006\u0010\u0011\u001a\u00020\u0005J\u0006\u0010\u0012\u001a\u00020\u0013R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0014"}, d2 = {"Lcom/inmobi/unification/sdk/model/initialization/TimeoutConfigurations$AdPreloadConfig;", "", "<init>", "()V", "preloadTimeout", "Lorg/json/JSONObject;", "muttTimeout", C4834q2.t, "retryInterval", "maxRetries", "(Lorg/json/JSONObject;Lorg/json/JSONObject;Lorg/json/JSONObject;Lorg/json/JSONObject;Lorg/json/JSONObject;)V", "loadRetryInterval", "maxLoadRetries", "getPreloadTimeout", "getMuttTimeout", "getLoadTimeout", "getRetryInterval", "getMaxRetries", "isValid", "", "media_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class AdPreloadConfig {

        @NotNull
        private JSONObject loadRetryInterval;

        @NotNull
        private JSONObject loadTimeout;

        @NotNull
        private JSONObject maxLoadRetries;

        @NotNull
        private JSONObject muttTimeout;

        @NotNull
        private JSONObject preloadTimeout;

        public AdPreloadConfig() {
            this.preloadTimeout = new JSONObject();
            this.muttTimeout = new JSONObject();
            this.loadTimeout = new JSONObject();
            this.loadRetryInterval = new JSONObject();
            this.maxLoadRetries = new JSONObject();
        }

        @NotNull
        public final JSONObject getLoadTimeout() {
            return this.loadTimeout;
        }

        @NotNull
        /* renamed from: getMaxRetries, reason: from getter */
        public final JSONObject getMaxLoadRetries() {
            return this.maxLoadRetries;
        }

        @NotNull
        public final JSONObject getMuttTimeout() {
            return this.muttTimeout;
        }

        @NotNull
        public final JSONObject getPreloadTimeout() {
            return this.preloadTimeout;
        }

        @NotNull
        /* renamed from: getRetryInterval, reason: from getter */
        public final JSONObject getLoadRetryInterval() {
            return this.loadRetryInterval;
        }

        public final boolean isValid() {
            TimeoutConfigurations.Companion.getClass();
            return ((Boolean) TimeoutConfigurations.validator.invoke(this.loadTimeout, 0)).booleanValue() && ((Boolean) TimeoutConfigurations.validator.invoke(this.loadRetryInterval, 1)).booleanValue() && ((Boolean) TimeoutConfigurations.validator.invoke(this.maxLoadRetries, 1)).booleanValue();
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public AdPreloadConfig(@NotNull JSONObject preloadTimeout, @NotNull JSONObject muttTimeout, @NotNull JSONObject loadTimeout, @NotNull JSONObject retryInterval, @NotNull JSONObject maxRetries) {
            this();
            Intrinsics.checkNotNullParameter(preloadTimeout, "preloadTimeout");
            Intrinsics.checkNotNullParameter(muttTimeout, "muttTimeout");
            Intrinsics.checkNotNullParameter(loadTimeout, "loadTimeout");
            Intrinsics.checkNotNullParameter(retryInterval, "retryInterval");
            Intrinsics.checkNotNullParameter(maxRetries, "maxRetries");
            this.preloadTimeout = preloadTimeout;
            this.muttTimeout = muttTimeout;
            this.loadTimeout = loadTimeout;
            this.loadRetryInterval = retryInterval;
            this.maxLoadRetries = maxRetries;
        }
    }

    public static final boolean a(JSONObject param) {
        Intrinsics.checkNotNullParameter(param, "param");
        Iterator<String> keys = param.keys();
        Intrinsics.checkNotNullExpressionValue(keys, "keys(...)");
        boolean z = true;
        while (keys.hasNext()) {
            if (!(param.opt(keys.next()) instanceof Boolean)) {
                z = false;
            }
        }
        return z;
    }
}
