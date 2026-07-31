package com.unity3d.mediation;

import android.content.Context;
import com.ironsource.C4841q9;
import com.ironsource.C4914ub;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.p;
import com.unity3d.mediation.impression.LevelPlayImpressionDataListener;
import com.unity3d.mediation.segment.LevelPlaySegment;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Deprecated;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public final class LevelPlay {

    @NotNull
    public static final LevelPlay INSTANCE = new LevelPlay();

    public enum AdFormat {
        BANNER("banner"),
        INTERSTITIAL("interstitial"),
        REWARDED("rewarded"),
        NATIVE_AD("nativeAd");


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

    private LevelPlay() {
    }

    private final void a(String str) {
        if (StringsKt.equals(str, com.ironsource.mediationsdk.metadata.a.a, true)) {
            a(str, "LevelPlayPrivacySettings.setCCPA()");
            return;
        }
        List<String> META_DATA_COPPA_FLAGS = com.ironsource.mediationsdk.metadata.a.g;
        Intrinsics.checkNotNullExpressionValue(META_DATA_COPPA_FLAGS, "META_DATA_COPPA_FLAGS");
        if ((META_DATA_COPPA_FLAGS instanceof Collection) && META_DATA_COPPA_FLAGS.isEmpty()) {
            return;
        }
        Iterator<T> it = META_DATA_COPPA_FLAGS.iterator();
        while (it.hasNext()) {
            if (StringsKt.equals((String) it.next(), str, true)) {
                a(str, "LevelPlayPrivacySettings.setCOPPA()");
                return;
            }
        }
    }

    public static final void addImpressionDataListener(@NotNull LevelPlayImpressionDataListener listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        IronLog.API.info("adding listener: " + listener.getClass().getSimpleName());
        C4914ub.a.a(listener);
    }

    @NotNull
    public static final String getSdkVersion() {
        IronLog.API.info("");
        return "9.4.4";
    }

    public static final void init(@NotNull Context context, @NotNull LevelPlayInitRequest initRequest, @NotNull LevelPlayInitListener listener) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(initRequest, "initRequest");
        Intrinsics.checkNotNullParameter(listener, "listener");
        C4914ub.a.a(context, initRequest, listener);
    }

    public static final void launchTestSuite(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        IronLog.API.info("");
        p.h().c(context);
    }

    public static final void removeImpressionDataListener(@NotNull LevelPlayImpressionDataListener listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        IronLog.API.info("removing listener: " + listener.getClass().getSimpleName());
        C4914ub.a.b(listener);
    }

    public static final void setAdaptersDebug(boolean z) {
        IronLog.API.info("enabled: " + z);
        p.h().a(z);
    }

    @Deprecated
    public static final void setConsent(boolean z) {
        IronLog.API.info("consent: " + z);
        p.h().b(z);
    }

    public static final boolean setDynamicUserId(@NotNull String dynamicUserId) {
        Intrinsics.checkNotNullParameter(dynamicUserId, "dynamicUserId");
        IronLog.API.info("dynamicUserId: " + dynamicUserId);
        return p.h().b(dynamicUserId);
    }

    public static final void setMetaData(@NotNull String key, @NotNull String value) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(value, "value");
        IronLog.API.info("key = " + key + ", value = " + value);
        INSTANCE.a(key);
        C4914ub.a.a(key, value);
    }

    public static final void setNetworkData(@NotNull String networkKey, @NotNull JSONObject networkData) {
        Intrinsics.checkNotNullParameter(networkKey, "networkKey");
        Intrinsics.checkNotNullParameter(networkData, "networkData");
        IronLog.API.info("networkKey = " + networkKey + ", networkData = " + networkData);
        p.h().b(networkKey, networkData);
    }

    public static final void setSegment(@NotNull LevelPlaySegment segment) {
        Intrinsics.checkNotNullParameter(segment, "segment");
        IronLog.API.info("");
        C4914ub.a.b(segment);
    }

    public static final void validateIntegration(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        IronLog.API.info("");
        C4841q9.a.a(context);
    }

    public static final void setMetaData(@NotNull String key, @NotNull List<String> values) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(values, "values");
        IronLog.API.info("key = " + key + ", values = " + values);
        INSTANCE.a(key);
        C4914ub.a.a(key, values);
    }

    private final void a(String str, String str2) {
        IronLog.API.warning("Setting '" + str + "' via setMetaData is deprecated. Use " + str2 + " instead.");
    }
}
