package com.facebook.internal;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Log;
import androidx.compose.animation.core.MutatorMutex$$ExternalSyntheticBackportWithForwarding0;
import com.facebook.FacebookSdk;
import com.facebook.GraphRequest;
import com.facebook.appevents.codeless.internal.UnityReflection;
import com.facebook.appevents.internal.AutomaticAnalyticsLogger;
import com.facebook.appevents.internal.Constants;
import com.facebook.internal.FacebookRequestErrorClassification;
import com.facebook.internal.FetchedAppSettings;
import com.facebook.internal.FetchedAppSettingsManager;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: FetchedAppSettingsManager.kt */
@Metadata(d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010 \n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0013\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\r\bÆ\u0002\u0018\u00002\u00020\u0001:\u0002OPB\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u00106\u001a\u0002072\u0006\u00108\u001a\u00020-H\u0007J\u0010\u00109\u001a\u00020:2\u0006\u0010;\u001a\u00020\u0004H\u0002J\u0014\u0010<\u001a\u0004\u0018\u00010*2\b\u0010;\u001a\u0004\u0018\u00010\u0004H\u0007J\u0016\u0010=\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020/\u0018\u00010>H\u0007J\b\u0010?\u001a\u000207H\u0007J\u001d\u0010@\u001a\u00020*2\u0006\u0010;\u001a\u00020\u00042\u0006\u0010A\u001a\u00020:H\u0000¢\u0006\u0002\bBJ*\u0010C\u001a\u001a\u0012\u0004\u0012\u00020\u0004\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020D0)0>2\b\u0010E\u001a\u0004\u0018\u00010:H\u0002J \u0010F\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020/\u0018\u00010>2\b\u0010A\u001a\u0004\u0018\u00010:H\u0002J\u001c\u0010G\u001a\u0004\u0018\u0001052\b\u0010H\u001a\u0004\u0018\u00010:2\u0006\u0010I\u001a\u00020\u0004H\u0002J\b\u0010J\u001a\u000207H\u0002J\u001a\u0010K\u001a\u0004\u0018\u00010*2\u0006\u0010;\u001a\u00020\u00042\u0006\u0010L\u001a\u00020/H\u0007J\u0010\u0010M\u001a\u0002072\u0006\u0010N\u001a\u00020/H\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u0014\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00040\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0004X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0004X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u0015X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u0015X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\u0015X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u001e\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u001f\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010 \u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010!\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\"\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010#\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010$\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u0016\u0010%\u001a\n &*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010'\u001a\u00020\u0015X\u0082T¢\u0006\u0002\n\u0000R\u001a\u0010(\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020*0)X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010+\u001a\b\u0012\u0004\u0012\u00020-0,X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010.\u001a\u00020/X\u0082\u000e¢\u0006\u0002\n\u0000R\u001c\u00100\u001a\u0010\u0012\f\u0012\n &*\u0004\u0018\u0001020201X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u00103\u001a\u00020/X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u00104\u001a\u0004\u0018\u000105X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006Q"}, d2 = {"Lcom/facebook/internal/FetchedAppSettingsManager;", "", "()V", "APPLICATION_FIELDS", "", "APP_SETTINGS_PREFS_KEY_FORMAT", "APP_SETTINGS_PREFS_STORE", "APP_SETTING_ANDROID_SDK_ERROR_CATEGORIES", "APP_SETTING_APP_EVENTS_AAM_RULE", "APP_SETTING_APP_EVENTS_EVENT_BINDINGS", "APP_SETTING_APP_EVENTS_FEATURE_BITMASK", "APP_SETTING_APP_EVENTS_SESSION_TIMEOUT", "APP_SETTING_DIALOG_CONFIGS", "APP_SETTING_FIELDS", "", "APP_SETTING_NUX_CONTENT", "APP_SETTING_NUX_ENABLED", "APP_SETTING_RESTRICTIVE_EVENT_FILTER_FIELD", "APP_SETTING_SMART_LOGIN_OPTIONS", "APP_SETTING_SUPPORTS_IMPLICIT_SDK_LOGGING", "AUTOMATIC_LOGGING_ENABLED_BITMASK_FIELD", "", "AUTO_LOG_APP_EVENTS_DEFAULT_FIELD", "AUTO_LOG_APP_EVENT_ENABLED_FIELD", "BLOCKLIST_EVENTS_KEY", "CODELESS_EVENTS_ENABLED_BITMASK_FIELD", "IAP_AUTOMATIC_LOGGING_ENABLED_BITMASK_FIELD", "MACA_RULES_KEY", "MONITOR_ENABLED_BITMASK_FIELD", "PROTECTED_MODE_RULES", "REDACTED_EVENTS_KEY", "SDK_UPDATE_MESSAGE", "SENSITIVE_PARAMS_KEY", "SMART_LOGIN_BOOKMARK_ICON_URL", "SMART_LOGIN_MENU_ICON_URL", "STANDARD_PARAMS_KEY", "SUGGESTED_EVENTS_SETTING", "TAG", "kotlin.jvm.PlatformType", "TRACK_UNINSTALL_ENABLED_BITMASK_FIELD", "fetchedAppSettings", "", "Lcom/facebook/internal/FetchedAppSettings;", "fetchedAppSettingsCallbacks", "Ljava/util/concurrent/ConcurrentLinkedQueue;", "Lcom/facebook/internal/FetchedAppSettingsManager$FetchedAppSettingsCallback;", "isUnityInit", "", "loadingState", "Ljava/util/concurrent/atomic/AtomicReference;", "Lcom/facebook/internal/FetchedAppSettingsManager$FetchAppSettingState;", "printedSDKUpdatedMessage", "unityEventBindings", "Lorg/json/JSONArray;", "getAppSettingsAsync", "", "callback", "getAppSettingsQueryResponse", "Lorg/json/JSONObject;", "applicationId", "getAppSettingsWithoutQuery", "getCachedMigratedAutoLogValuesInAppSettings", "", "loadAppSettingsAsync", "parseAppSettingsFromJSON", "settingsJSON", "parseAppSettingsFromJSON$facebook_core_release", "parseDialogConfigurations", "Lcom/facebook/internal/FetchedAppSettings$DialogFeatureConfig;", "dialogConfigResponse", "parseMigratedAutoLogValues", "parseProtectedModeRules", "protectedModeSettings", "ruleType", "pollCallbacks", "queryAppSettings", "forceRequery", "setIsUnityInit", "flag", "FetchAppSettingState", "FetchedAppSettingsCallback", "facebook-core_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes9.dex */
public final class FetchedAppSettingsManager {

    @NotNull
    private static final String APPLICATION_FIELDS = "fields";

    @NotNull
    private static final String APP_SETTINGS_PREFS_KEY_FORMAT = "com.facebook.internal.APP_SETTINGS.%s";

    @NotNull
    private static final String APP_SETTINGS_PREFS_STORE = "com.facebook.internal.preferences.APP_SETTINGS";
    private static final int AUTOMATIC_LOGGING_ENABLED_BITMASK_FIELD = 8;

    @NotNull
    private static final String BLOCKLIST_EVENTS_KEY = "blocklist_events";
    private static final int CODELESS_EVENTS_ENABLED_BITMASK_FIELD = 32;
    private static final int IAP_AUTOMATIC_LOGGING_ENABLED_BITMASK_FIELD = 16;

    @NotNull
    private static final String MACA_RULES_KEY = "maca_rules";
    private static final int MONITOR_ENABLED_BITMASK_FIELD = 16384;

    @NotNull
    private static final String REDACTED_EVENTS_KEY = "redacted_events";

    @NotNull
    private static final String SDK_UPDATE_MESSAGE = "sdk_update_message";

    @NotNull
    private static final String SENSITIVE_PARAMS_KEY = "sensitive_params";

    @NotNull
    private static final String STANDARD_PARAMS_KEY = "standard_params";
    private static final int TRACK_UNINSTALL_ENABLED_BITMASK_FIELD = 256;
    private static boolean isUnityInit;
    private static boolean printedSDKUpdatedMessage;

    @Nullable
    private static JSONArray unityEventBindings;

    @NotNull
    public static final FetchedAppSettingsManager INSTANCE = new FetchedAppSettingsManager();
    private static final String TAG = FetchedAppSettingsManager.class.getSimpleName();

    @NotNull
    private static final String APP_SETTING_SUPPORTS_IMPLICIT_SDK_LOGGING = "supports_implicit_sdk_logging";

    @NotNull
    private static final String APP_SETTING_NUX_CONTENT = "gdpv4_nux_content";

    @NotNull
    private static final String APP_SETTING_NUX_ENABLED = "gdpv4_nux_enabled";

    @NotNull
    private static final String APP_SETTING_DIALOG_CONFIGS = "android_dialog_configs";

    @NotNull
    private static final String APP_SETTING_ANDROID_SDK_ERROR_CATEGORIES = "android_sdk_error_categories";

    @NotNull
    private static final String APP_SETTING_APP_EVENTS_SESSION_TIMEOUT = "app_events_session_timeout";

    @NotNull
    private static final String APP_SETTING_APP_EVENTS_FEATURE_BITMASK = "app_events_feature_bitmask";

    @NotNull
    private static final String APP_SETTING_APP_EVENTS_EVENT_BINDINGS = "auto_event_mapping_android";

    @NotNull
    private static final String APP_SETTING_SMART_LOGIN_OPTIONS = "seamless_login";

    @NotNull
    private static final String SMART_LOGIN_BOOKMARK_ICON_URL = "smart_login_bookmark_icon_url";

    @NotNull
    private static final String SMART_LOGIN_MENU_ICON_URL = "smart_login_menu_icon_url";

    @NotNull
    private static final String APP_SETTING_RESTRICTIVE_EVENT_FILTER_FIELD = "restrictive_data_filter_params";

    @NotNull
    private static final String APP_SETTING_APP_EVENTS_AAM_RULE = "aam_rules";

    @NotNull
    private static final String SUGGESTED_EVENTS_SETTING = "suggested_events_setting";

    @NotNull
    private static final String PROTECTED_MODE_RULES = "protected_mode_rules";

    @NotNull
    public static final String AUTO_LOG_APP_EVENTS_DEFAULT_FIELD = "auto_log_app_events_default";

    @NotNull
    public static final String AUTO_LOG_APP_EVENT_ENABLED_FIELD = "auto_log_app_events_enabled";

    @NotNull
    private static final List<String> APP_SETTING_FIELDS = CollectionsKt.listOf((Object[]) new String[]{APP_SETTING_SUPPORTS_IMPLICIT_SDK_LOGGING, APP_SETTING_NUX_CONTENT, APP_SETTING_NUX_ENABLED, APP_SETTING_DIALOG_CONFIGS, APP_SETTING_ANDROID_SDK_ERROR_CATEGORIES, APP_SETTING_APP_EVENTS_SESSION_TIMEOUT, APP_SETTING_APP_EVENTS_FEATURE_BITMASK, APP_SETTING_APP_EVENTS_EVENT_BINDINGS, APP_SETTING_SMART_LOGIN_OPTIONS, SMART_LOGIN_BOOKMARK_ICON_URL, SMART_LOGIN_MENU_ICON_URL, APP_SETTING_RESTRICTIVE_EVENT_FILTER_FIELD, APP_SETTING_APP_EVENTS_AAM_RULE, SUGGESTED_EVENTS_SETTING, PROTECTED_MODE_RULES, AUTO_LOG_APP_EVENTS_DEFAULT_FIELD, AUTO_LOG_APP_EVENT_ENABLED_FIELD});

    @NotNull
    private static final Map<String, FetchedAppSettings> fetchedAppSettings = new ConcurrentHashMap();

    @NotNull
    private static final AtomicReference<FetchAppSettingState> loadingState = new AtomicReference<>(FetchAppSettingState.NOT_LOADED);

    @NotNull
    private static final ConcurrentLinkedQueue<FetchedAppSettingsCallback> fetchedAppSettingsCallbacks = new ConcurrentLinkedQueue<>();

    /* compiled from: FetchedAppSettingsManager.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\u0012\u0010\u0004\u001a\u00020\u00032\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H&¨\u0006\u0007"}, d2 = {"Lcom/facebook/internal/FetchedAppSettingsManager$FetchedAppSettingsCallback;", "", "onError", "", "onSuccess", "fetchedAppSettings", "Lcom/facebook/internal/FetchedAppSettings;", "facebook-core_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public interface FetchedAppSettingsCallback {
        void onError();

        void onSuccess(@Nullable FetchedAppSettings fetchedAppSettings);
    }

    private FetchedAppSettingsManager() {
    }

    public static final void loadAppSettingsAsync() {
        final Context applicationContext = FacebookSdk.getApplicationContext();
        final String applicationId = FacebookSdk.getApplicationId();
        if (Utility.isNullOrEmpty(applicationId)) {
            loadingState.set(FetchAppSettingState.ERROR);
            INSTANCE.pollCallbacks();
            return;
        }
        if (fetchedAppSettings.containsKey(applicationId)) {
            loadingState.set(FetchAppSettingState.SUCCESS);
            INSTANCE.pollCallbacks();
            return;
        }
        AtomicReference<FetchAppSettingState> atomicReference = loadingState;
        FetchAppSettingState fetchAppSettingState = FetchAppSettingState.NOT_LOADED;
        FetchAppSettingState fetchAppSettingState2 = FetchAppSettingState.LOADING;
        if (!MutatorMutex$$ExternalSyntheticBackportWithForwarding0.m(atomicReference, fetchAppSettingState, fetchAppSettingState2) && !MutatorMutex$$ExternalSyntheticBackportWithForwarding0.m(atomicReference, FetchAppSettingState.ERROR, fetchAppSettingState2)) {
            INSTANCE.pollCallbacks();
            return;
        }
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        final String format = String.format(APP_SETTINGS_PREFS_KEY_FORMAT, Arrays.copyOf(new Object[]{applicationId}, 1));
        Intrinsics.checkNotNullExpressionValue(format, "java.lang.String.format(format, *args)");
        FacebookSdk.getExecutor().execute(new Runnable() { // from class: com.facebook.internal.FetchedAppSettingsManager$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                FetchedAppSettingsManager.m3427loadAppSettingsAsync$lambda0(applicationContext, format, applicationId);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: loadAppSettingsAsync$lambda-0, reason: not valid java name */
    public static final void m3427loadAppSettingsAsync$lambda0(Context context, String settingsKey, String applicationId) {
        JSONObject jSONObject;
        Intrinsics.checkNotNullParameter(context, "$context");
        Intrinsics.checkNotNullParameter(settingsKey, "$settingsKey");
        Intrinsics.checkNotNullParameter(applicationId, "$applicationId");
        SharedPreferences sharedPreferences = context.getSharedPreferences(APP_SETTINGS_PREFS_STORE, 0);
        FetchedAppSettings fetchedAppSettings2 = null;
        String string = sharedPreferences.getString(settingsKey, null);
        if (!Utility.isNullOrEmpty(string)) {
            if (string == null) {
                throw new IllegalStateException("Required value was null.");
            }
            try {
                jSONObject = new JSONObject(string);
            } catch (JSONException e) {
                Utility.logd(Utility.LOG_TAG, e);
                jSONObject = null;
            }
            if (jSONObject != null) {
                fetchedAppSettings2 = INSTANCE.parseAppSettingsFromJSON$facebook_core_release(applicationId, jSONObject);
            }
        }
        FetchedAppSettingsManager fetchedAppSettingsManager = INSTANCE;
        JSONObject appSettingsQueryResponse = fetchedAppSettingsManager.getAppSettingsQueryResponse(applicationId);
        if (appSettingsQueryResponse != null) {
            fetchedAppSettingsManager.parseAppSettingsFromJSON$facebook_core_release(applicationId, appSettingsQueryResponse);
            sharedPreferences.edit().putString(settingsKey, appSettingsQueryResponse.toString()).apply();
        }
        if (fetchedAppSettings2 != null) {
            String sdkUpdateMessage = fetchedAppSettings2.getSdkUpdateMessage();
            if (!printedSDKUpdatedMessage && sdkUpdateMessage != null && sdkUpdateMessage.length() > 0) {
                printedSDKUpdatedMessage = true;
                Log.w(TAG, sdkUpdateMessage);
            }
        }
        FetchedAppGateKeepersManager.queryAppGateKeepers(applicationId, true);
        AutomaticAnalyticsLogger.logActivateAppEvent();
        loadingState.set(fetchedAppSettings.containsKey(applicationId) ? FetchAppSettingState.SUCCESS : FetchAppSettingState.ERROR);
        fetchedAppSettingsManager.pollCallbacks();
    }

    @Nullable
    public static final FetchedAppSettings getAppSettingsWithoutQuery(@Nullable String applicationId) {
        if (applicationId != null) {
            return fetchedAppSettings.get(applicationId);
        }
        return null;
    }

    public static final void getAppSettingsAsync(@NotNull FetchedAppSettingsCallback callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        fetchedAppSettingsCallbacks.add(callback);
        loadAppSettingsAsync();
    }

    private final synchronized void pollCallbacks() {
        FetchAppSettingState fetchAppSettingState = loadingState.get();
        if (FetchAppSettingState.NOT_LOADED != fetchAppSettingState && FetchAppSettingState.LOADING != fetchAppSettingState) {
            final FetchedAppSettings fetchedAppSettings2 = fetchedAppSettings.get(FacebookSdk.getApplicationId());
            Handler handler = new Handler(Looper.getMainLooper());
            if (FetchAppSettingState.ERROR == fetchAppSettingState) {
                while (true) {
                    ConcurrentLinkedQueue<FetchedAppSettingsCallback> concurrentLinkedQueue = fetchedAppSettingsCallbacks;
                    if (concurrentLinkedQueue.isEmpty()) {
                        return;
                    }
                    final FetchedAppSettingsCallback poll = concurrentLinkedQueue.poll();
                    handler.post(new Runnable() { // from class: com.facebook.internal.FetchedAppSettingsManager$$ExternalSyntheticLambda1
                        @Override // java.lang.Runnable
                        public final void run() {
                            FetchedAppSettingsManager.FetchedAppSettingsCallback.this.onError();
                        }
                    });
                }
            } else {
                while (true) {
                    ConcurrentLinkedQueue<FetchedAppSettingsCallback> concurrentLinkedQueue2 = fetchedAppSettingsCallbacks;
                    if (concurrentLinkedQueue2.isEmpty()) {
                        return;
                    }
                    final FetchedAppSettingsCallback poll2 = concurrentLinkedQueue2.poll();
                    handler.post(new Runnable() { // from class: com.facebook.internal.FetchedAppSettingsManager$$ExternalSyntheticLambda2
                        @Override // java.lang.Runnable
                        public final void run() {
                            FetchedAppSettingsManager.FetchedAppSettingsCallback.this.onSuccess(fetchedAppSettings2);
                        }
                    });
                }
            }
        }
    }

    @Nullable
    public static final Map<String, Boolean> getCachedMigratedAutoLogValuesInAppSettings() {
        JSONObject jSONObject;
        Context applicationContext = FacebookSdk.getApplicationContext();
        String applicationId = FacebookSdk.getApplicationId();
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        String format = String.format(APP_SETTINGS_PREFS_KEY_FORMAT, Arrays.copyOf(new Object[]{applicationId}, 1));
        Intrinsics.checkNotNullExpressionValue(format, "java.lang.String.format(format, *args)");
        String string = applicationContext.getSharedPreferences(APP_SETTINGS_PREFS_STORE, 0).getString(format, null);
        if (!Utility.isNullOrEmpty(string)) {
            if (string == null) {
                throw new IllegalStateException("Required value was null.");
            }
            try {
                jSONObject = new JSONObject(string);
            } catch (JSONException e) {
                Utility.logd(Utility.LOG_TAG, e);
                jSONObject = null;
            }
            if (jSONObject != null) {
                return INSTANCE.parseMigratedAutoLogValues(jSONObject);
            }
        }
        return null;
    }

    @Nullable
    public static final FetchedAppSettings queryAppSettings(@NotNull String applicationId, boolean forceRequery) {
        Intrinsics.checkNotNullParameter(applicationId, "applicationId");
        if (!forceRequery) {
            Map<String, FetchedAppSettings> map = fetchedAppSettings;
            if (map.containsKey(applicationId)) {
                return map.get(applicationId);
            }
        }
        FetchedAppSettingsManager fetchedAppSettingsManager = INSTANCE;
        JSONObject appSettingsQueryResponse = fetchedAppSettingsManager.getAppSettingsQueryResponse(applicationId);
        if (appSettingsQueryResponse == null) {
            return null;
        }
        FetchedAppSettings parseAppSettingsFromJSON$facebook_core_release = fetchedAppSettingsManager.parseAppSettingsFromJSON$facebook_core_release(applicationId, appSettingsQueryResponse);
        if (Intrinsics.areEqual(applicationId, FacebookSdk.getApplicationId())) {
            loadingState.set(FetchAppSettingState.SUCCESS);
            fetchedAppSettingsManager.pollCallbacks();
        }
        return parseAppSettingsFromJSON$facebook_core_release;
    }

    @NotNull
    public final FetchedAppSettings parseAppSettingsFromJSON$facebook_core_release(@NotNull String applicationId, @NotNull JSONObject settingsJSON) {
        Intrinsics.checkNotNullParameter(applicationId, "applicationId");
        Intrinsics.checkNotNullParameter(settingsJSON, "settingsJSON");
        JSONArray optJSONArray = settingsJSON.optJSONArray(APP_SETTING_ANDROID_SDK_ERROR_CATEGORIES);
        FacebookRequestErrorClassification.Companion companion = FacebookRequestErrorClassification.INSTANCE;
        FacebookRequestErrorClassification createFromJSON = companion.createFromJSON(optJSONArray);
        if (createFromJSON == null) {
            createFromJSON = companion.getDefaultErrorClassification();
        }
        FacebookRequestErrorClassification facebookRequestErrorClassification = createFromJSON;
        int optInt = settingsJSON.optInt(APP_SETTING_APP_EVENTS_FEATURE_BITMASK, 0);
        boolean z = (optInt & 8) != 0;
        boolean z2 = (optInt & 16) != 0;
        boolean z3 = (optInt & 32) != 0;
        boolean z4 = (optInt & 256) != 0;
        boolean z5 = (optInt & 16384) != 0;
        JSONArray optJSONArray2 = settingsJSON.optJSONArray(APP_SETTING_APP_EVENTS_EVENT_BINDINGS);
        unityEventBindings = optJSONArray2;
        if (optJSONArray2 != null && InternalSettings.isUnityApp()) {
            UnityReflection unityReflection = UnityReflection.INSTANCE;
            UnityReflection.sendEventMapping(optJSONArray2 == null ? null : optJSONArray2.toString());
        }
        boolean optBoolean = settingsJSON.optBoolean(APP_SETTING_SUPPORTS_IMPLICIT_SDK_LOGGING, false);
        String optString = settingsJSON.optString(APP_SETTING_NUX_CONTENT, "");
        Intrinsics.checkNotNullExpressionValue(optString, "settingsJSON.optString(APP_SETTING_NUX_CONTENT, \"\")");
        boolean optBoolean2 = settingsJSON.optBoolean(APP_SETTING_NUX_ENABLED, false);
        int optInt2 = settingsJSON.optInt(APP_SETTING_APP_EVENTS_SESSION_TIMEOUT, Constants.getDefaultAppEventsSessionTimeoutInSeconds());
        EnumSet<SmartLoginOption> parseOptions = SmartLoginOption.INSTANCE.parseOptions(settingsJSON.optLong(APP_SETTING_SMART_LOGIN_OPTIONS));
        Map<String, Map<String, FetchedAppSettings.DialogFeatureConfig>> parseDialogConfigurations = parseDialogConfigurations(settingsJSON.optJSONObject(APP_SETTING_DIALOG_CONFIGS));
        String optString2 = settingsJSON.optString(SMART_LOGIN_BOOKMARK_ICON_URL);
        Intrinsics.checkNotNullExpressionValue(optString2, "settingsJSON.optString(SMART_LOGIN_BOOKMARK_ICON_URL)");
        String optString3 = settingsJSON.optString(SMART_LOGIN_MENU_ICON_URL);
        Intrinsics.checkNotNullExpressionValue(optString3, "settingsJSON.optString(SMART_LOGIN_MENU_ICON_URL)");
        String optString4 = settingsJSON.optString(SDK_UPDATE_MESSAGE);
        Intrinsics.checkNotNullExpressionValue(optString4, "settingsJSON.optString(SDK_UPDATE_MESSAGE)");
        FetchedAppSettings fetchedAppSettings2 = new FetchedAppSettings(optBoolean, optString, optBoolean2, optInt2, parseOptions, parseDialogConfigurations, z, facebookRequestErrorClassification, optString2, optString3, z2, z3, optJSONArray2, optString4, z4, z5, settingsJSON.optString(APP_SETTING_APP_EVENTS_AAM_RULE), settingsJSON.optString(SUGGESTED_EVENTS_SETTING), settingsJSON.optString(APP_SETTING_RESTRICTIVE_EVENT_FILTER_FIELD), parseProtectedModeRules(settingsJSON.optJSONObject(PROTECTED_MODE_RULES), STANDARD_PARAMS_KEY), parseProtectedModeRules(settingsJSON.optJSONObject(PROTECTED_MODE_RULES), MACA_RULES_KEY), parseMigratedAutoLogValues(settingsJSON), parseProtectedModeRules(settingsJSON.optJSONObject(PROTECTED_MODE_RULES), BLOCKLIST_EVENTS_KEY), parseProtectedModeRules(settingsJSON.optJSONObject(PROTECTED_MODE_RULES), REDACTED_EVENTS_KEY), parseProtectedModeRules(settingsJSON.optJSONObject(PROTECTED_MODE_RULES), SENSITIVE_PARAMS_KEY));
        fetchedAppSettings.put(applicationId, fetchedAppSettings2);
        return fetchedAppSettings2;
    }

    public static final void setIsUnityInit(boolean flag) {
        isUnityInit = flag;
        if (unityEventBindings == null || !flag) {
            return;
        }
        UnityReflection unityReflection = UnityReflection.INSTANCE;
        UnityReflection.sendEventMapping(String.valueOf(unityEventBindings));
    }

    private final JSONObject getAppSettingsQueryResponse(String applicationId) {
        Bundle bundle = new Bundle();
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(APP_SETTING_FIELDS);
        bundle.putString("fields", TextUtils.join(StringUtils.COMMA, arrayList));
        GraphRequest newGraphPathRequest = GraphRequest.INSTANCE.newGraphPathRequest(null, "app", null);
        newGraphPathRequest.setForceApplicationRequest(true);
        newGraphPathRequest.setParameters(bundle);
        JSONObject jsonObject = newGraphPathRequest.executeAndWait().getJsonObject();
        return jsonObject == null ? new JSONObject() : jsonObject;
    }

    private final Map<String, Map<String, FetchedAppSettings.DialogFeatureConfig>> parseDialogConfigurations(JSONObject dialogConfigResponse) {
        JSONArray optJSONArray;
        int length;
        HashMap hashMap = new HashMap();
        if (dialogConfigResponse != null && (optJSONArray = dialogConfigResponse.optJSONArray("data")) != null && (length = optJSONArray.length()) > 0) {
            int i = 0;
            while (true) {
                int i2 = i + 1;
                FetchedAppSettings.DialogFeatureConfig.Companion companion = FetchedAppSettings.DialogFeatureConfig.INSTANCE;
                JSONObject optJSONObject = optJSONArray.optJSONObject(i);
                Intrinsics.checkNotNullExpressionValue(optJSONObject, "dialogConfigData.optJSONObject(i)");
                FetchedAppSettings.DialogFeatureConfig parseDialogConfig = companion.parseDialogConfig(optJSONObject);
                if (parseDialogConfig != null) {
                    String dialogName = parseDialogConfig.getDialogName();
                    Map map = (Map) hashMap.get(dialogName);
                    if (map == null) {
                        map = new HashMap();
                        hashMap.put(dialogName, map);
                    }
                    map.put(parseDialogConfig.getFeatureName(), parseDialogConfig);
                }
                if (i2 >= length) {
                    break;
                }
                i = i2;
            }
        }
        return hashMap;
    }

    private final JSONArray parseProtectedModeRules(JSONObject protectedModeSettings, String ruleType) {
        if (protectedModeSettings != null) {
            return protectedModeSettings.optJSONArray(ruleType);
        }
        return null;
    }

    private final Map<String, Boolean> parseMigratedAutoLogValues(JSONObject settingsJSON) {
        if (settingsJSON == null) {
            return null;
        }
        HashMap hashMap = new HashMap();
        if (!settingsJSON.isNull(AUTO_LOG_APP_EVENTS_DEFAULT_FIELD)) {
            try {
                hashMap.put(AUTO_LOG_APP_EVENTS_DEFAULT_FIELD, Boolean.valueOf(settingsJSON.getBoolean(AUTO_LOG_APP_EVENTS_DEFAULT_FIELD)));
            } catch (JSONException e) {
                Utility.logd(Utility.LOG_TAG, e);
            }
        }
        if (!settingsJSON.isNull(AUTO_LOG_APP_EVENT_ENABLED_FIELD)) {
            try {
                hashMap.put(AUTO_LOG_APP_EVENT_ENABLED_FIELD, Boolean.valueOf(settingsJSON.getBoolean(AUTO_LOG_APP_EVENT_ENABLED_FIELD)));
            } catch (JSONException e2) {
                Utility.logd(Utility.LOG_TAG, e2);
            }
        }
        if (hashMap.isEmpty()) {
            return null;
        }
        return hashMap;
    }

    /* compiled from: FetchedAppSettingsManager.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0080\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/facebook/internal/FetchedAppSettingsManager$FetchAppSettingState;", "", "(Ljava/lang/String;I)V", "NOT_LOADED", "LOADING", "SUCCESS", "ERROR", "facebook-core_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public enum FetchAppSettingState {
        NOT_LOADED,
        LOADING,
        SUCCESS,
        ERROR;

        /* renamed from: values, reason: to resolve conflict with enum method */
        public static FetchAppSettingState[] valuesCustom() {
            FetchAppSettingState[] valuesCustom = values();
            return (FetchAppSettingState[]) Arrays.copyOf(valuesCustom, valuesCustom.length);
        }
    }
}
