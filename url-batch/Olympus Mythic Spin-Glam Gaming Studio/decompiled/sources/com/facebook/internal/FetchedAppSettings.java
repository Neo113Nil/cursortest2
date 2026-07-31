package com.facebook.internal;

import android.net.Uri;
import com.ironsource.X3;
import java.util.EnumSet;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: FetchedAppSettings.kt */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b/\u0018\u0000 D2\u00020\u0001:\u0002DEB\u008b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n\u0012\u001e\u0010\f\u001a\u001a\u0012\u0004\u0012\u00020\u0005\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u000e0\r0\r\u0012\u0006\u0010\u000f\u001a\u00020\u0003\u0012\u0006\u0010\u0010\u001a\u00020\u0011\u0012\u0006\u0010\u0012\u001a\u00020\u0005\u0012\u0006\u0010\u0013\u001a\u00020\u0005\u0012\u0006\u0010\u0014\u001a\u00020\u0003\u0012\u0006\u0010\u0015\u001a\u00020\u0003\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017\u0012\u0006\u0010\u0018\u001a\u00020\u0005\u0012\u0006\u0010\u0019\u001a\u00020\u0003\u0012\u0006\u0010\u001a\u001a\u00020\u0003\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u001c\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u001d\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u001e\u001a\u0004\u0018\u00010\u0017\u0012\b\u0010\u001f\u001a\u0004\u0018\u00010\u0017\u0012\u0014\u0010 \u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0003\u0018\u00010\r\u0012\b\u0010!\u001a\u0004\u0018\u00010\u0017\u0012\b\u0010\"\u001a\u0004\u0018\u00010\u0017\u0012\b\u0010#\u001a\u0004\u0018\u00010\u0017¢\u0006\u0002\u0010$J\u0006\u0010\u0002\u001a\u00020\u0003R\u0013\u0010\u001f\u001a\u0004\u0018\u00010\u0017¢\u0006\b\n\u0000\u001a\u0004\b%\u0010&R\u0011\u0010\u000f\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b'\u0010(R\u0013\u0010!\u001a\u0004\u0018\u00010\u0017¢\u0006\b\n\u0000\u001a\u0004\b)\u0010&R\u0011\u0010\u0015\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b*\u0010(R)\u0010\f\u001a\u001a\u0012\u0004\u0012\u00020\u0005\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u000e0\r0\r¢\u0006\b\n\u0000\u001a\u0004\b+\u0010,R\u0011\u0010\u0010\u001a\u00020\u0011¢\u0006\b\n\u0000\u001a\u0004\b-\u0010.R\u0013\u0010\u0016\u001a\u0004\u0018\u00010\u0017¢\u0006\b\n\u0000\u001a\u0004\b/\u0010&R\u0011\u0010\u0014\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b0\u0010(R\u001f\u0010 \u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0003\u0018\u00010\r¢\u0006\b\n\u0000\u001a\u0004\b1\u0010,R\u0011\u0010\u001a\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b2\u0010(R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b3\u00104R\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b5\u0010(R\u0013\u0010\u001e\u001a\u0004\u0018\u00010\u0017¢\u0006\b\n\u0000\u001a\u0004\b6\u0010&R\u0013\u0010\u001b\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b7\u00104R\u0013\u0010\"\u001a\u0004\u0018\u00010\u0017¢\u0006\b\n\u0000\u001a\u0004\b8\u0010&R\u0013\u0010\u001d\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b9\u00104R\u0011\u0010\u0018\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b:\u00104R\u0013\u0010#\u001a\u0004\u0018\u00010\u0017¢\u0006\b\n\u0000\u001a\u0004\b;\u0010&R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b<\u0010=R\u0011\u0010\u0012\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b>\u00104R\u0011\u0010\u0013\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b?\u00104R\u0017\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\b\n\u0000\u001a\u0004\b@\u0010AR\u0013\u0010\u001c\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\bB\u00104R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0019\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\bC\u0010(¨\u0006F"}, d2 = {"Lcom/facebook/internal/FetchedAppSettings;", "", "supportsImplicitLogging", "", "nuxContent", "", "nuxEnabled", "sessionTimeoutInSeconds", "", "smartLoginOptions", "Ljava/util/EnumSet;", "Lcom/facebook/internal/SmartLoginOption;", "dialogConfigurations", "", "Lcom/facebook/internal/FetchedAppSettings$DialogFeatureConfig;", "automaticLoggingEnabled", "errorClassification", "Lcom/facebook/internal/FacebookRequestErrorClassification;", "smartLoginBookmarkIconURL", "smartLoginMenuIconURL", "iAPAutomaticLoggingEnabled", "codelessEventsEnabled", "eventBindings", "Lorg/json/JSONArray;", "sdkUpdateMessage", "trackUninstallEnabled", "monitorViaDialogEnabled", "rawAamRules", "suggestedEventsSetting", "restrictiveDataSetting", "protectedModeStandardParamsSetting", "MACARuleMatchingSetting", "migratedAutoLogValues", "blocklistEvents", "redactedEvents", "sensitiveParams", "(ZLjava/lang/String;ZILjava/util/EnumSet;Ljava/util/Map;ZLcom/facebook/internal/FacebookRequestErrorClassification;Ljava/lang/String;Ljava/lang/String;ZZLorg/json/JSONArray;Ljava/lang/String;ZZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/json/JSONArray;Lorg/json/JSONArray;Ljava/util/Map;Lorg/json/JSONArray;Lorg/json/JSONArray;Lorg/json/JSONArray;)V", "getMACARuleMatchingSetting", "()Lorg/json/JSONArray;", "getAutomaticLoggingEnabled", "()Z", "getBlocklistEvents", "getCodelessEventsEnabled", "getDialogConfigurations", "()Ljava/util/Map;", "getErrorClassification", "()Lcom/facebook/internal/FacebookRequestErrorClassification;", "getEventBindings", "getIAPAutomaticLoggingEnabled", "getMigratedAutoLogValues", "getMonitorViaDialogEnabled", "getNuxContent", "()Ljava/lang/String;", "getNuxEnabled", "getProtectedModeStandardParamsSetting", "getRawAamRules", "getRedactedEvents", "getRestrictiveDataSetting", "getSdkUpdateMessage", "getSensitiveParams", "getSessionTimeoutInSeconds", "()I", "getSmartLoginBookmarkIconURL", "getSmartLoginMenuIconURL", "getSmartLoginOptions", "()Ljava/util/EnumSet;", "getSuggestedEventsSetting", "getTrackUninstallEnabled", "Companion", "DialogFeatureConfig", "facebook-core_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes15.dex */
public final class FetchedAppSettings {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @Nullable
    private final JSONArray MACARuleMatchingSetting;
    private final boolean automaticLoggingEnabled;

    @Nullable
    private final JSONArray blocklistEvents;
    private final boolean codelessEventsEnabled;

    @NotNull
    private final Map<String, Map<String, DialogFeatureConfig>> dialogConfigurations;

    @NotNull
    private final FacebookRequestErrorClassification errorClassification;

    @Nullable
    private final JSONArray eventBindings;
    private final boolean iAPAutomaticLoggingEnabled;

    @Nullable
    private final Map<String, Boolean> migratedAutoLogValues;
    private final boolean monitorViaDialogEnabled;

    @NotNull
    private final String nuxContent;
    private final boolean nuxEnabled;

    @Nullable
    private final JSONArray protectedModeStandardParamsSetting;

    @Nullable
    private final String rawAamRules;

    @Nullable
    private final JSONArray redactedEvents;

    @Nullable
    private final String restrictiveDataSetting;

    @NotNull
    private final String sdkUpdateMessage;

    @Nullable
    private final JSONArray sensitiveParams;
    private final int sessionTimeoutInSeconds;

    @NotNull
    private final String smartLoginBookmarkIconURL;

    @NotNull
    private final String smartLoginMenuIconURL;

    @NotNull
    private final EnumSet<SmartLoginOption> smartLoginOptions;

    @Nullable
    private final String suggestedEventsSetting;
    private final boolean supportsImplicitLogging;
    private final boolean trackUninstallEnabled;

    @Nullable
    public static final DialogFeatureConfig getDialogFeatureConfig(@NotNull String str, @NotNull String str2, @NotNull String str3) {
        return INSTANCE.getDialogFeatureConfig(str, str2, str3);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public FetchedAppSettings(boolean z, @NotNull String nuxContent, boolean z2, int i, @NotNull EnumSet<SmartLoginOption> smartLoginOptions, @NotNull Map<String, ? extends Map<String, DialogFeatureConfig>> dialogConfigurations, boolean z3, @NotNull FacebookRequestErrorClassification errorClassification, @NotNull String smartLoginBookmarkIconURL, @NotNull String smartLoginMenuIconURL, boolean z4, boolean z5, @Nullable JSONArray jSONArray, @NotNull String sdkUpdateMessage, boolean z6, boolean z7, @Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable JSONArray jSONArray2, @Nullable JSONArray jSONArray3, @Nullable Map<String, Boolean> map, @Nullable JSONArray jSONArray4, @Nullable JSONArray jSONArray5, @Nullable JSONArray jSONArray6) {
        Intrinsics.checkNotNullParameter(nuxContent, "nuxContent");
        Intrinsics.checkNotNullParameter(smartLoginOptions, "smartLoginOptions");
        Intrinsics.checkNotNullParameter(dialogConfigurations, "dialogConfigurations");
        Intrinsics.checkNotNullParameter(errorClassification, "errorClassification");
        Intrinsics.checkNotNullParameter(smartLoginBookmarkIconURL, "smartLoginBookmarkIconURL");
        Intrinsics.checkNotNullParameter(smartLoginMenuIconURL, "smartLoginMenuIconURL");
        Intrinsics.checkNotNullParameter(sdkUpdateMessage, "sdkUpdateMessage");
        this.supportsImplicitLogging = z;
        this.nuxContent = nuxContent;
        this.nuxEnabled = z2;
        this.sessionTimeoutInSeconds = i;
        this.smartLoginOptions = smartLoginOptions;
        this.dialogConfigurations = dialogConfigurations;
        this.automaticLoggingEnabled = z3;
        this.errorClassification = errorClassification;
        this.smartLoginBookmarkIconURL = smartLoginBookmarkIconURL;
        this.smartLoginMenuIconURL = smartLoginMenuIconURL;
        this.iAPAutomaticLoggingEnabled = z4;
        this.codelessEventsEnabled = z5;
        this.eventBindings = jSONArray;
        this.sdkUpdateMessage = sdkUpdateMessage;
        this.trackUninstallEnabled = z6;
        this.monitorViaDialogEnabled = z7;
        this.rawAamRules = str;
        this.suggestedEventsSetting = str2;
        this.restrictiveDataSetting = str3;
        this.protectedModeStandardParamsSetting = jSONArray2;
        this.MACARuleMatchingSetting = jSONArray3;
        this.migratedAutoLogValues = map;
        this.blocklistEvents = jSONArray4;
        this.redactedEvents = jSONArray5;
        this.sensitiveParams = jSONArray6;
    }

    @NotNull
    public final String getNuxContent() {
        return this.nuxContent;
    }

    public final boolean getNuxEnabled() {
        return this.nuxEnabled;
    }

    public final int getSessionTimeoutInSeconds() {
        return this.sessionTimeoutInSeconds;
    }

    @NotNull
    public final EnumSet<SmartLoginOption> getSmartLoginOptions() {
        return this.smartLoginOptions;
    }

    @NotNull
    public final Map<String, Map<String, DialogFeatureConfig>> getDialogConfigurations() {
        return this.dialogConfigurations;
    }

    public final boolean getAutomaticLoggingEnabled() {
        return this.automaticLoggingEnabled;
    }

    @NotNull
    public final FacebookRequestErrorClassification getErrorClassification() {
        return this.errorClassification;
    }

    @NotNull
    public final String getSmartLoginBookmarkIconURL() {
        return this.smartLoginBookmarkIconURL;
    }

    @NotNull
    public final String getSmartLoginMenuIconURL() {
        return this.smartLoginMenuIconURL;
    }

    public final boolean getIAPAutomaticLoggingEnabled() {
        return this.iAPAutomaticLoggingEnabled;
    }

    public final boolean getCodelessEventsEnabled() {
        return this.codelessEventsEnabled;
    }

    @Nullable
    public final JSONArray getEventBindings() {
        return this.eventBindings;
    }

    @NotNull
    public final String getSdkUpdateMessage() {
        return this.sdkUpdateMessage;
    }

    public final boolean getTrackUninstallEnabled() {
        return this.trackUninstallEnabled;
    }

    public final boolean getMonitorViaDialogEnabled() {
        return this.monitorViaDialogEnabled;
    }

    @Nullable
    public final String getRawAamRules() {
        return this.rawAamRules;
    }

    @Nullable
    public final String getSuggestedEventsSetting() {
        return this.suggestedEventsSetting;
    }

    @Nullable
    public final String getRestrictiveDataSetting() {
        return this.restrictiveDataSetting;
    }

    @Nullable
    public final JSONArray getProtectedModeStandardParamsSetting() {
        return this.protectedModeStandardParamsSetting;
    }

    @Nullable
    public final JSONArray getMACARuleMatchingSetting() {
        return this.MACARuleMatchingSetting;
    }

    @Nullable
    public final Map<String, Boolean> getMigratedAutoLogValues() {
        return this.migratedAutoLogValues;
    }

    @Nullable
    public final JSONArray getBlocklistEvents() {
        return this.blocklistEvents;
    }

    @Nullable
    public final JSONArray getRedactedEvents() {
        return this.redactedEvents;
    }

    @Nullable
    public final JSONArray getSensitiveParams() {
        return this.sensitiveParams;
    }

    /* renamed from: supportsImplicitLogging, reason: from getter */
    public final boolean getSupportsImplicitLogging() {
        return this.supportsImplicitLogging;
    }

    /* compiled from: FetchedAppSettings.kt */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0015\n\u0002\b\n\u0018\u0000 \u00112\u00020\u0001:\u0001\u0011B+\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0002\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000bR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0012"}, d2 = {"Lcom/facebook/internal/FetchedAppSettings$DialogFeatureConfig;", "", "dialogName", "", "featureName", "fallbackUrl", "Landroid/net/Uri;", "versionSpec", "", "(Ljava/lang/String;Ljava/lang/String;Landroid/net/Uri;[I)V", "getDialogName", "()Ljava/lang/String;", "getFallbackUrl", "()Landroid/net/Uri;", "getFeatureName", "getVersionSpec", "()[I", "Companion", "facebook-core_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class DialogFeatureConfig {

        /* renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion(null);

        @NotNull
        private static final String DIALOG_CONFIG_DIALOG_NAME_FEATURE_NAME_SEPARATOR = "|";

        @NotNull
        private static final String DIALOG_CONFIG_NAME_KEY = "name";

        @NotNull
        private static final String DIALOG_CONFIG_URL_KEY = "url";

        @NotNull
        private static final String DIALOG_CONFIG_VERSIONS_KEY = "versions";

        @NotNull
        private final String dialogName;

        @Nullable
        private final Uri fallbackUrl;

        @NotNull
        private final String featureName;

        @Nullable
        private final int[] versionSpec;

        public /* synthetic */ DialogFeatureConfig(String str, String str2, Uri uri, int[] iArr, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, str2, uri, iArr);
        }

        private DialogFeatureConfig(String str, String str2, Uri uri, int[] iArr) {
            this.dialogName = str;
            this.featureName = str2;
            this.fallbackUrl = uri;
            this.versionSpec = iArr;
        }

        @NotNull
        public final String getDialogName() {
            return this.dialogName;
        }

        @NotNull
        public final String getFeatureName() {
            return this.featureName;
        }

        @Nullable
        public final Uri getFallbackUrl() {
            return this.fallbackUrl;
        }

        @Nullable
        public final int[] getVersionSpec() {
            return this.versionSpec;
        }

        /* compiled from: FetchedAppSettings.kt */
        @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0015\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\b\u001a\u0004\u0018\u00010\t2\u0006\u0010\n\u001a\u00020\u000bJ\u0014\u0010\f\u001a\u0004\u0018\u00010\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lcom/facebook/internal/FetchedAppSettings$DialogFeatureConfig$Companion;", "", "()V", "DIALOG_CONFIG_DIALOG_NAME_FEATURE_NAME_SEPARATOR", "", "DIALOG_CONFIG_NAME_KEY", "DIALOG_CONFIG_URL_KEY", "DIALOG_CONFIG_VERSIONS_KEY", "parseDialogConfig", "Lcom/facebook/internal/FetchedAppSettings$DialogFeatureConfig;", "dialogConfigJSON", "Lorg/json/JSONObject;", "parseVersionSpec", "", "versionsJSON", "Lorg/json/JSONArray;", "facebook-core_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            @Nullable
            public final DialogFeatureConfig parseDialogConfig(@NotNull JSONObject dialogConfigJSON) {
                Intrinsics.checkNotNullParameter(dialogConfigJSON, "dialogConfigJSON");
                String dialogNameWithFeature = dialogConfigJSON.optString("name");
                if (Utility.isNullOrEmpty(dialogNameWithFeature)) {
                    return null;
                }
                Intrinsics.checkNotNullExpressionValue(dialogNameWithFeature, "dialogNameWithFeature");
                List split$default = StringsKt.split$default((CharSequence) dialogNameWithFeature, new String[]{"|"}, false, 0, 6, (Object) null);
                if (split$default.size() != 2) {
                    return null;
                }
                String str = (String) CollectionsKt.first(split$default);
                String str2 = (String) CollectionsKt.last(split$default);
                if (Utility.isNullOrEmpty(str) || Utility.isNullOrEmpty(str2)) {
                    return null;
                }
                String optString = dialogConfigJSON.optString("url");
                return new DialogFeatureConfig(str, str2, Utility.isNullOrEmpty(optString) ? null : Uri.parse(optString), parseVersionSpec(dialogConfigJSON.optJSONArray(DialogFeatureConfig.DIALOG_CONFIG_VERSIONS_KEY)), null);
            }

            private final int[] parseVersionSpec(JSONArray versionsJSON) {
                if (versionsJSON == null) {
                    return null;
                }
                int length = versionsJSON.length();
                int[] iArr = new int[length];
                if (length <= 0) {
                    return iArr;
                }
                int i = 0;
                while (true) {
                    int i2 = i + 1;
                    int i3 = -1;
                    int optInt = versionsJSON.optInt(i, -1);
                    if (optInt == -1) {
                        String versionString = versionsJSON.optString(i);
                        if (!Utility.isNullOrEmpty(versionString)) {
                            try {
                                Intrinsics.checkNotNullExpressionValue(versionString, "versionString");
                                i3 = Integer.parseInt(versionString);
                            } catch (NumberFormatException e) {
                                Utility.logd(Utility.LOG_TAG, e);
                            }
                            optInt = i3;
                        }
                    }
                    iArr[i] = optInt;
                    if (i2 >= length) {
                        return iArr;
                    }
                    i = i2;
                }
            }
        }
    }

    /* compiled from: FetchedAppSettings.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\"\u0010\u0003\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006H\u0007¨\u0006\t"}, d2 = {"Lcom/facebook/internal/FetchedAppSettings$Companion;", "", "()V", "getDialogFeatureConfig", "Lcom/facebook/internal/FetchedAppSettings$DialogFeatureConfig;", "applicationId", "", X3.i.v0, "featureName", "facebook-core_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Nullable
        public final DialogFeatureConfig getDialogFeatureConfig(@NotNull String applicationId, @NotNull String actionName, @NotNull String featureName) {
            Intrinsics.checkNotNullParameter(applicationId, "applicationId");
            Intrinsics.checkNotNullParameter(actionName, "actionName");
            Intrinsics.checkNotNullParameter(featureName, "featureName");
            if (actionName.length() == 0 || featureName.length() == 0) {
                return null;
            }
            FetchedAppSettings appSettingsWithoutQuery = FetchedAppSettingsManager.getAppSettingsWithoutQuery(applicationId);
            Map<String, DialogFeatureConfig> map = appSettingsWithoutQuery == null ? null : appSettingsWithoutQuery.getDialogConfigurations().get(actionName);
            if (map != null) {
                return map.get(featureName);
            }
            return null;
        }
    }
}
