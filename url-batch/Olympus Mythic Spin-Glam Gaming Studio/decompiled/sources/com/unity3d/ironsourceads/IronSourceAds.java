package com.unity3d.ironsourceads;

import android.content.Context;
import com.ironsource.O9;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.p;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes12.dex */
public final class IronSourceAds {

    @NotNull
    public static final IronSourceAds INSTANCE = new IronSourceAds();

    public enum AdFormat {
        BANNER("Banner"),
        INTERSTITIAL("Interstitial"),
        REWARDED("RewardedVideo");


        @NotNull
        private final String a;

        AdFormat(String str) {
            this.a = str;
        }

        @NotNull
        public final String getValue() {
            return this.a;
        }
    }

    private IronSourceAds() {
    }

    public static final void enableDebugMode(boolean z) {
        IronLog.API.info("enabled: " + z);
        p.h().a(z);
    }

    @NotNull
    public static final String getSdkVersion() {
        IronLog.API.info("");
        return "9.4.4";
    }

    public static final void init(@NotNull Context context, @NotNull InitRequest initRequest, @NotNull InitListener initializationListener) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(initRequest, "initRequest");
        Intrinsics.checkNotNullParameter(initializationListener, "initializationListener");
        O9.a.a(context, initRequest, initializationListener);
    }

    public static final void setConsent(boolean z) {
        IronLog.API.info("consent: " + z);
        O9.a.b(z);
    }

    public static final void setMetaData(@NotNull String key, @NotNull String value) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(value, "value");
        IronLog.API.info("key = " + key + ", value = " + value);
        O9.a.a(key, value);
    }

    public static final void setMetaData(@NotNull String key, @NotNull List<String> values) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(values, "values");
        IronLog.API.info("key = " + key + ", values = " + values);
        p.h().a(key, values);
    }
}
