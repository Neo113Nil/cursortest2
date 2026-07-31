package com.unity3d.services;

import com.unity3d.ads.core.domain.AndroidInitializeBoldSDK;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: UnityAdsConstants.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u000f\bÆ\u0002\u0018\u00002\u00020\u0001:\f\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000fB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0010"}, d2 = {"Lcom/unity3d/services/UnityAdsConstants;", "", "<init>", "()V", "Messages", AndroidInitializeBoldSDK.MSG_TIMEOUT, "RequestPolicy", "SharedFlow", "DefaultUrls", "ClientInfo", "OpenMeasurement", "Cache", "AdOperations", "Preferences", "ErrorHandler", "SafeGuards", "unity-ads_defaultRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class UnityAdsConstants {

    @NotNull
    public static final UnityAdsConstants INSTANCE = new UnityAdsConstants();

    private UnityAdsConstants() {
    }

    /* compiled from: UnityAdsConstants.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lcom/unity3d/services/UnityAdsConstants$Messages;", "", "<init>", "()V", "MSG_UNITY_BASE", "", "MSG_INTERNAL_ERROR", "unity-ads_defaultRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Messages {

        @NotNull
        public static final Messages INSTANCE = new Messages();

        @NotNull
        public static final String MSG_INTERNAL_ERROR = "Internal error";

        @NotNull
        public static final String MSG_UNITY_BASE = "[Unity Ads] ";

        private Messages() {
        }
    }

    /* compiled from: UnityAdsConstants.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lcom/unity3d/services/UnityAdsConstants$Timeout;", "", "<init>", "()V", "INIT_TIMEOUT_MS", "", "unity-ads_defaultRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Timeout {
        public static final long INIT_TIMEOUT_MS = 120000;

        @NotNull
        public static final Timeout INSTANCE = new Timeout();

        private Timeout() {
        }
    }

    /* compiled from: UnityAdsConstants.kt */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\bX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"Lcom/unity3d/services/UnityAdsConstants$RequestPolicy;", "", "<init>", "()V", "RETRY_MAX_DURATION", "", "RETRY_MAX_INTERVAL", "RETRY_SCALING_FACTOR", "", "RETRY_WAIT_BASE", "RETRY_JITTER_PCT", "CONNECT_TIMEOUT_MS", "OVERALL_TIMEOUT_MS", "READ_TIMEOUT_MS", "WRITE_TIMEOUT_MS", "SHOULD_STORE_LOCALLY", "", "unity-ads_defaultRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class RequestPolicy {
        public static final int CONNECT_TIMEOUT_MS = 30000;

        @NotNull
        public static final RequestPolicy INSTANCE = new RequestPolicy();
        public static final int OVERALL_TIMEOUT_MS = 30000;
        public static final int READ_TIMEOUT_MS = 30000;
        public static final float RETRY_JITTER_PCT = 0.1f;
        public static final int RETRY_MAX_DURATION = 120000;
        public static final int RETRY_MAX_INTERVAL = 2500;
        public static final float RETRY_SCALING_FACTOR = 2.0f;
        public static final int RETRY_WAIT_BASE = 500;
        public static final boolean SHOULD_STORE_LOCALLY = false;
        public static final int WRITE_TIMEOUT_MS = 30000;

        private RequestPolicy() {
        }
    }

    /* compiled from: UnityAdsConstants.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lcom/unity3d/services/UnityAdsConstants$SharedFlow;", "", "<init>", "()V", "REPLAY", "", "EXTRA_CAPACITY", "unity-ads_defaultRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class SharedFlow {
        public static final int EXTRA_CAPACITY = 10;

        @NotNull
        public static final SharedFlow INSTANCE = new SharedFlow();
        public static final int REPLAY = 10;

        private SharedFlow() {
        }
    }

    /* compiled from: UnityAdsConstants.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u000b\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lcom/unity3d/services/UnityAdsConstants$DefaultUrls;", "", "<init>", "()V", "GATEWAY_URL", "", "WEBVIEW_DOMAIN", "WEBVIEW_ASSET_PATH", "WEBVIEW_ASSET_PATH_LOCAL", "AD_CACHE_DOMAIN", "AD_ASSET_DOMAIN", "AD_PLAYER_QUERY_PARAMS", "CACHE_DIR_NAME", "CACHE_WEBVIEW_DIR_NAME", "HTTP_CACHE_DIR_NAME", "HTTP_CACHE_OK_HTTP_DIR_NAME", "unity-ads_defaultRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class DefaultUrls {

        @NotNull
        public static final String AD_ASSET_DOMAIN = "unity.ads.asset";

        @NotNull
        public static final String AD_CACHE_DOMAIN = "unity.ads.cache";

        @NotNull
        public static final String AD_PLAYER_QUERY_PARAMS = "?platform=android&mode=ad-viewer&";

        @NotNull
        public static final String CACHE_DIR_NAME = "UnityAdsCache";

        @NotNull
        public static final String CACHE_WEBVIEW_DIR_NAME = "webview_cache";

        @NotNull
        public static final String GATEWAY_URL = "https://gateway.unityads.unity3d.com/v1";

        @NotNull
        public static final String HTTP_CACHE_DIR_NAME = "UnityAdsHttpCache";

        @NotNull
        public static final String HTTP_CACHE_OK_HTTP_DIR_NAME = "UnityAdsOkHttpCache";

        @NotNull
        public static final DefaultUrls INSTANCE = new DefaultUrls();

        @NotNull
        public static final String WEBVIEW_ASSET_PATH = "/unity-ads-sdk-webview/";

        @NotNull
        public static final String WEBVIEW_ASSET_PATH_LOCAL = "ad-viewer/";

        @NotNull
        public static final String WEBVIEW_DOMAIN = "webview.unityads.unity3d.com";

        private DefaultUrls() {
        }
    }

    /* compiled from: UnityAdsConstants.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lcom/unity3d/services/UnityAdsConstants$ClientInfo;", "", "<init>", "()V", "SDK_VERSION", "", "SDK_VERSION_NAME", "", "unity-ads_defaultRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class ClientInfo {

        @NotNull
        public static final ClientInfo INSTANCE = new ClientInfo();
        public static final int SDK_VERSION = 41900;

        @NotNull
        public static final String SDK_VERSION_NAME = "4.19.0";

        private ClientInfo() {
        }
    }

    /* compiled from: UnityAdsConstants.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\t\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0086T¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lcom/unity3d/services/UnityAdsConstants$OpenMeasurement;", "", "<init>", "()V", "OM_PARTNER_NAME", "", "OM_PARTNER_VERSION", "OM_JS_SESSION_FILENAME", "OM_JS_SERVICE_FILENAME", "OM_JS_URL_SESSION", "OM_JS_URL_SERVICE", "OM_SESSION_FINISH_DELAY_MS", "", "unity-ads_defaultRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class OpenMeasurement {

        @NotNull
        public static final OpenMeasurement INSTANCE = new OpenMeasurement();

        @NotNull
        public static final String OM_JS_SERVICE_FILENAME = "ad-viewer/omsdk-v1.js";

        @NotNull
        public static final String OM_JS_SESSION_FILENAME = "ad-viewer/omid-session-client-v1.js";

        @NotNull
        public static final String OM_JS_URL_SERVICE = "unity-ads-cache://unity.ads.asset/ad-viewer/omsdk-v1.js";

        @NotNull
        public static final String OM_JS_URL_SESSION = "unity-ads-cache://unity.ads.asset/ad-viewer/omid-session-client-v1.js";

        @NotNull
        public static final String OM_PARTNER_NAME = "Unity3d";

        @NotNull
        public static final String OM_PARTNER_VERSION = "1";
        public static final long OM_SESSION_FINISH_DELAY_MS = 1000;

        private OpenMeasurement() {
        }
    }

    /* compiled from: UnityAdsConstants.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lcom/unity3d/services/UnityAdsConstants$Cache;", "", "<init>", "()V", "CACHE_SCHEME", "", "DATASTORE_PATH", "unity-ads_defaultRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Cache {

        @NotNull
        public static final String CACHE_SCHEME = "unity-ads-cache";

        @NotNull
        public static final String DATASTORE_PATH = "unityAdsDatastore/";

        @NotNull
        public static final Cache INSTANCE = new Cache();

        private Cache() {
        }
    }

    /* compiled from: UnityAdsConstants.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lcom/unity3d/services/UnityAdsConstants$AdOperations;", "", "<init>", "()V", "LOAD_TIMEOUT_MS", "", "SHOW_TIMEOUT_MS", "GET_TOKEN_TIMEOUT_MS", "unity-ads_defaultRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class AdOperations {
        public static final int GET_TOKEN_TIMEOUT_MS = 750;

        @NotNull
        public static final AdOperations INSTANCE = new AdOperations();
        public static final int LOAD_TIMEOUT_MS = 30000;
        public static final int SHOW_TIMEOUT_MS = 10000;

        private AdOperations() {
        }
    }

    /* compiled from: UnityAdsConstants.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0007\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lcom/unity3d/services/UnityAdsConstants$Preferences;", "", "<init>", "()V", "UNITY_PLAYER_PREF_PREFIX", "", "PREF_NAME_IDFI", "PREF_NAME_AUID", "PREF_KEY_IDFI", "PREF_KEY_AUID", "PREF_KEY_UNITY_INSTALLATION_ID", "PREF_KEY_UNITY_MEGA_SESSION_ID", "unity-ads_defaultRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Preferences {

        @NotNull
        public static final Preferences INSTANCE = new Preferences();

        @NotNull
        public static final String PREF_KEY_AUID = "auid";

        @NotNull
        public static final String PREF_KEY_IDFI = "unityads-idfi";

        @NotNull
        public static final String PREF_KEY_UNITY_INSTALLATION_ID = "unity_connect.installation_id";

        @NotNull
        public static final String PREF_KEY_UNITY_MEGA_SESSION_ID = "unity_connect.mega_session_id";

        @NotNull
        public static final String PREF_NAME_AUID = "supersonic_shared_preferen";

        @NotNull
        public static final String PREF_NAME_IDFI = "unityads-installinfo";

        @NotNull
        private static final String UNITY_PLAYER_PREF_PREFIX = "unity_connect";

        private Preferences() {
        }
    }

    /* compiled from: UnityAdsConstants.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lcom/unity3d/services/UnityAdsConstants$ErrorHandler;", "", "<init>", "()V", "ERROR_HANDLER_STACK_TRACE_LINES_MAX", "", "unity-ads_defaultRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class ErrorHandler {
        public static final int ERROR_HANDLER_STACK_TRACE_LINES_MAX = 15;

        @NotNull
        public static final ErrorHandler INSTANCE = new ErrorHandler();

        private ErrorHandler() {
        }
    }

    /* compiled from: UnityAdsConstants.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006"}, d2 = {"Lcom/unity3d/services/UnityAdsConstants$SafeGuards;", "", "<init>", "()V", "InitRequestRetryPolicy", "InitRequestTimeoutPolicy", "unity-ads_defaultRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class SafeGuards {

        @NotNull
        public static final SafeGuards INSTANCE = new SafeGuards();

        /* compiled from: UnityAdsConstants.kt */
        @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\tX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\tX\u0086T¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lcom/unity3d/services/UnityAdsConstants$SafeGuards$InitRequestRetryPolicy;", "", "<init>", "()V", "MIN_DURATION", "", "MIN_WAIT_BASE", "MIN_MAX_INTERVAL", "MIN_SCALING_FACTOR", "", "MIN_JITTER_PCT", "MAX_JITTER_PCT", "unity-ads_defaultRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class InitRequestRetryPolicy {

            @NotNull
            public static final InitRequestRetryPolicy INSTANCE = new InitRequestRetryPolicy();
            public static final float MAX_JITTER_PCT = 100.0f;
            public static final int MIN_DURATION = 5000;
            public static final float MIN_JITTER_PCT = 0.0f;
            public static final int MIN_MAX_INTERVAL = 0;
            public static final float MIN_SCALING_FACTOR = 0.1f;
            public static final int MIN_WAIT_BASE = 0;

            private InitRequestRetryPolicy() {
            }
        }

        private SafeGuards() {
        }

        /* compiled from: UnityAdsConstants.kt */
        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lcom/unity3d/services/UnityAdsConstants$SafeGuards$InitRequestTimeoutPolicy;", "", "<init>", "()V", "MIN_TIMEOUT", "", "unity-ads_defaultRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class InitRequestTimeoutPolicy {

            @NotNull
            public static final InitRequestTimeoutPolicy INSTANCE = new InitRequestTimeoutPolicy();
            public static final int MIN_TIMEOUT = 1000;

            private InitRequestTimeoutPolicy() {
            }
        }
    }
}
