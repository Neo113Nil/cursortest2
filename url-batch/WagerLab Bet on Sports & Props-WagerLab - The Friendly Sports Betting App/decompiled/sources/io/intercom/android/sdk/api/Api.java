package io.intercom.android.sdk.api;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import androidx.core.app.NotificationCompat;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.google.firebase.messaging.Constants;
import com.google.firebase.perf.network.FirebasePerfOkHttpClient;
import com.intercom.twig.Twig;
import io.intercom.android.sdk.AuthToken;
import io.intercom.android.sdk.AuthTokenKt;
import io.intercom.android.sdk.IntercomError;
import io.intercom.android.sdk.IntercomStatusCallback;
import io.intercom.android.sdk.Provider;
import io.intercom.android.sdk.errorreporting.ErrorReport;
import io.intercom.android.sdk.identity.AppConfig;
import io.intercom.android.sdk.identity.AppIdentity;
import io.intercom.android.sdk.identity.UserIdentity;
import io.intercom.android.sdk.logger.LumberMill;
import io.intercom.android.sdk.m5.data.IntercomDataLayer;
import io.intercom.android.sdk.metrics.MetricObject;
import io.intercom.android.sdk.metrics.ops.OpsMetricObject;
import io.intercom.android.sdk.metrics.ops.OpsMetricTracker;
import io.intercom.android.sdk.models.LinkResponse;
import io.intercom.android.sdk.models.Sheet;
import io.intercom.android.sdk.models.UpdateUserResponse;
import io.intercom.android.sdk.models.carousel.Carousel;
import io.intercom.android.sdk.models.carousel.CarouselResponse;
import io.intercom.android.sdk.survey.model.FetchSurveyRequest;
import io.intercom.android.sdk.user.DeviceData;
import io.invertase.firebase.functions.UniversalFirebaseFunctionsModule;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import okhttp3.Dispatcher;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import org.json.JSONObject;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/* loaded from: classes8.dex */
public class Api {
    private static final String AUTH_TOKENS = "auth_tokens";
    private static final String CAROUSEL_AUTOMATIC = "shown_automatically";
    private static final String CAROUSEL_CREATED_VIA = "created_via";
    private static final String CAROUSEL_PROGRAMMATIC = "triggered_from_code";
    private static final String CAROUSEL_VISIBLE = "carousel_visible";
    private static final String DEVICE_DATA = "device_data";
    private static final String DEVICE_IDENTIFIER = "device_identifier";
    private static final String DEVICE_TOKEN = "device_token";
    private static final String HMAC = "hmac";
    private static final String INSTANCE_ID = "instance_id";
    private static final String JWT = "intercom_user_jwt";
    private static final String NEW_SESSION = "new_session";
    private static final String SCREEN_ID = "screen_id";
    private static final String SENT_FROM_BACKGROUND = "sent_from_background";
    private static final Twig TWIG = LumberMill.getLogger();
    private static final String USER = "user";
    private static final String USER_ATTRIBUTES = "user_attributes";
    private final OkHttpClient apiHttpClient;
    private final Provider<AppConfig> appConfigProvider;
    private final AppIdentity appIdentity;
    final CallbackHolder callbacks;
    private final Context context;
    private final IntercomDataLayer dataLayer;
    private final int defaultOkHttpMaxRequests;
    private final MessengerApi messengerApi;
    private OpsMetricTracker opsMetricTracker;
    private final RateLimiter rateLimiter;
    final UserIdentity userIdentity;
    final OkHttpClient httpClient = new OkHttpClient();
    private final Callback<Void> emptyCallback = new Callback<Void>() { // from class: io.intercom.android.sdk.api.Api.6
        @Override // retrofit2.Callback
        public void onFailure(Call<Void> call, Throwable th) {
        }

        @Override // retrofit2.Callback
        public void onResponse(Call<Void> call, Response<Void> response) {
        }
    };

    public Api(Context context, AppIdentity appIdentity, UserIdentity userIdentity, OkHttpClient okHttpClient, MessengerApi messengerApi, CallbackHolder callbackHolder, RateLimiter rateLimiter, Provider<AppConfig> provider, OpsMetricTracker opsMetricTracker, IntercomDataLayer intercomDataLayer) {
        this.context = context;
        this.appIdentity = appIdentity;
        this.userIdentity = userIdentity;
        this.messengerApi = messengerApi;
        this.callbacks = callbackHolder;
        this.rateLimiter = rateLimiter;
        this.appConfigProvider = provider;
        this.opsMetricTracker = opsMetricTracker;
        this.dataLayer = intercomDataLayer;
        this.apiHttpClient = okHttpClient;
        this.defaultOkHttpMaxRequests = okHttpClient.dispatcher().getMaxRequests();
        updateMaxRequests();
    }

    public void updateMaxRequests() {
        int i = this.userIdentity.hasIntercomId() ? this.defaultOkHttpMaxRequests : 1;
        Dispatcher dispatcher = this.apiHttpClient.dispatcher();
        if (dispatcher.getMaxRequests() != i) {
            dispatcher.setMaxRequests(i);
        }
    }

    public void setDeviceToken(String str) {
        Map<String, Object> generateDeviceData = DeviceData.generateDeviceData(this.context);
        generateDeviceData.put(DEVICE_TOKEN, str);
        Map<String, Object> hashMap = new HashMap<>();
        hashMap.put("user", this.userIdentity.toMap());
        hashMap.put(DEVICE_DATA, generateDeviceData);
        addSecureHash(hashMap);
        this.messengerApi.setDeviceToken(MessengerApiHelper.INSTANCE.optionsMapToRequestBody(hashMap)).enqueue(this.emptyCallback);
    }

    public void removeDeviceToken(String str, UserIdentity userIdentity) {
        HashMap hashMap = new HashMap();
        if (userIdentity.isSoftReset()) {
            hashMap.put("user", userIdentity.softUserIdentityToMap());
        } else {
            hashMap.put("user", userIdentity.toMap());
        }
        hashMap.put(DEVICE_TOKEN, str);
        addSecureHash(hashMap);
        this.messengerApi.deleteDeviceToken(MessengerApiHelper.INSTANCE.optionsMapToRequestBody(hashMap)).enqueue(this.emptyCallback);
    }

    public void updateUser(UserUpdateRequest userUpdateRequest, IntercomStatusCallback intercomStatusCallback) {
        if (!userUpdateRequest.isInternalUpdate()) {
            if (this.rateLimiter.isLimited()) {
                this.rateLimiter.logError();
                intercomStatusCallback.onFailure(new IntercomError(1005, "rate limit reached"));
                return;
            } else {
                if (shouldStopBackgroundRequest(userUpdateRequest.isSentFromBackground())) {
                    logBackgroundDisabledError();
                    intercomStatusCallback.onFailure(new IntercomError(1006, "Background requests are disabled"));
                    return;
                }
                this.rateLimiter.recordRequest();
            }
        }
        retriableUpdateUser(generateUpdateUserParams(userUpdateRequest), intercomStatusCallback);
    }

    void retriableUpdateUser(Map<String, Object> map, IntercomStatusCallback intercomStatusCallback) {
        retriableUpdateUser(map, this.userIdentity.getFingerprint(), intercomStatusCallback);
    }

    /* renamed from: io.intercom.android.sdk.api.Api$1, reason: invalid class name */
    class AnonymousClass1 extends BaseCallback<UpdateUserResponse.Builder> {
        final /* synthetic */ String val$fingerprint;
        final /* synthetic */ IntercomStatusCallback val$intercomStatusCallback;
        final /* synthetic */ Map val$params;

        AnonymousClass1(IntercomStatusCallback intercomStatusCallback, String str, Map map) {
            this.val$intercomStatusCallback = intercomStatusCallback;
            this.val$fingerprint = str;
            this.val$params = map;
        }

        @Override // io.intercom.android.sdk.api.BaseCallback
        public void onSuccess(UpdateUserResponse.Builder builder) {
            Handler handler = new Handler(Looper.getMainLooper());
            IntercomStatusCallback intercomStatusCallback = this.val$intercomStatusCallback;
            Objects.requireNonNull(intercomStatusCallback);
            handler.post(new Api$1$$ExternalSyntheticLambda0(intercomStatusCallback));
            if (this.val$fingerprint.equals(Api.this.userIdentity.getFingerprint())) {
                Api.TWIG.i("Successfully registered or updated user", new Object[0]);
                Api.this.callbacks.unreadCallback().onSuccess(builder);
                UpdateUserResponse build = builder.build();
                Api.this.dataLayer.updateTeamPresence(build.getTeamPresence());
                Api.this.dataLayer.updateCarousel(build.getCarousel());
                Api.this.dataLayer.updateBotIntro(build.getBotIntro());
                Api.this.dataLayer.updateSurveyData(build.getSurveyData());
                Api.this.dataLayer.updateBotBehaviourId(build.getBotBehaviourId());
                Api.this.opsMetricTracker.trackEvent(OpsMetricTracker.FINISH, OpsMetricTracker.TIME_TO_COMPLETE_PING);
            }
        }

        @Override // io.intercom.android.sdk.api.BaseCallback
        public void onError(final ErrorObject errorObject) {
            Map map = (Map) this.val$params.get("user");
            if (Api.isUserNotFound(errorObject, map)) {
                map.remove(UserIdentity.INTERCOM_ID);
                this.val$params.put("user", map);
                Api.this.retriableUpdateUser(this.val$params, this.val$fingerprint, this.val$intercomStatusCallback);
            } else {
                final String extractErrorString = ErrorStringExtractorKt.extractErrorString(errorObject);
                Handler handler = new Handler(Looper.getMainLooper());
                final IntercomStatusCallback intercomStatusCallback = this.val$intercomStatusCallback;
                handler.post(new Runnable() { // from class: io.intercom.android.sdk.api.Api$1$$ExternalSyntheticLambda1
                    @Override // java.lang.Runnable
                    public final void run() {
                        IntercomStatusCallback.this.onFailure(new IntercomError(1001, "ERROR - [HTTP " + errorObject.getStatusCode() + "] - " + extractErrorString));
                    }
                });
            }
        }

        @Override // io.intercom.android.sdk.api.BaseCallback
        void logFailure(String str, ErrorObject errorObject) {
            super.logFailure("Failed to register or update user", errorObject);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void retriableUpdateUser(Map<String, Object> map, String str, IntercomStatusCallback intercomStatusCallback) {
        this.messengerApi.updateUser(MessengerApiHelper.INSTANCE.optionsMapToRequestBody(map)).enqueue(new AnonymousClass1(intercomStatusCallback, str, map));
    }

    public void setAuthTokens(List<AuthToken> list, IntercomStatusCallback intercomStatusCallback) {
        HashMap hashMap = new HashMap();
        hashMap.put("user", this.userIdentity.toMap());
        addSecureHash(hashMap);
        if (!list.isEmpty()) {
            hashMap.put("auth_tokens", AuthTokenKt.toMap(list));
        }
        this.messengerApi.setAuthToken(MessengerApiHelper.INSTANCE.optionsMapToRequestBody(hashMap)).enqueue(new AnonymousClass2(intercomStatusCallback));
    }

    /* renamed from: io.intercom.android.sdk.api.Api$2, reason: invalid class name */
    class AnonymousClass2 implements Callback<Void> {
        final /* synthetic */ IntercomStatusCallback val$intercomStatusCallback;

        AnonymousClass2(IntercomStatusCallback intercomStatusCallback) {
            this.val$intercomStatusCallback = intercomStatusCallback;
        }

        @Override // retrofit2.Callback
        public void onResponse(Call<Void> call, Response<Void> response) {
            if (response.isSuccessful()) {
                Handler handler = new Handler(Looper.getMainLooper());
                IntercomStatusCallback intercomStatusCallback = this.val$intercomStatusCallback;
                Objects.requireNonNull(intercomStatusCallback);
                handler.post(new Api$1$$ExternalSyntheticLambda0(intercomStatusCallback));
                return;
            }
            final ErrorObject errorObject = new ErrorObject(null, response);
            Handler handler2 = new Handler(Looper.getMainLooper());
            final IntercomStatusCallback intercomStatusCallback2 = this.val$intercomStatusCallback;
            handler2.post(new Runnable() { // from class: io.intercom.android.sdk.api.Api$2$$ExternalSyntheticLambda1
                @Override // java.lang.Runnable
                public final void run() {
                    IntercomStatusCallback.this.onFailure(new IntercomError(1001, "ERROR - [HTTP " + r1.getStatusCode() + "] - " + ErrorStringExtractorKt.extractErrorString(errorObject)));
                }
            });
        }

        @Override // retrofit2.Callback
        public void onFailure(Call<Void> call, Throwable th) {
            Handler handler = new Handler(Looper.getMainLooper());
            final IntercomStatusCallback intercomStatusCallback = this.val$intercomStatusCallback;
            handler.post(new Runnable() { // from class: io.intercom.android.sdk.api.Api$2$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    IntercomStatusCallback.this.onFailure(new IntercomError(1001, "ERROR"));
                }
            });
        }
    }

    public void logEvent(String str, Map<String, ?> map) {
        if (this.rateLimiter.isLimited()) {
            this.rateLimiter.logError();
            return;
        }
        boolean isBackgrounded = this.dataLayer.getHostAppState().getValue().isBackgrounded();
        if (shouldStopBackgroundRequest(isBackgrounded)) {
            logBackgroundDisabledError();
            return;
        }
        this.rateLimiter.recordRequest();
        HashMap hashMap = new HashMap();
        hashMap.put("event_name", str);
        if (!map.isEmpty()) {
            hashMap.put(TtmlNode.TAG_METADATA, map);
        }
        Map<String, Object> hashMap2 = new HashMap<>();
        hashMap2.put(NotificationCompat.CATEGORY_EVENT, hashMap);
        hashMap2.put(SENT_FROM_BACKGROUND, Boolean.valueOf(isBackgrounded));
        hashMap2.put("user", this.userIdentity.toMap());
        hashMap2.put(CAROUSEL_VISIBLE, Boolean.valueOf(isCarouselVisible()));
        addSecureHash(hashMap2);
        this.messengerApi.logEvent(MessengerApiHelper.INSTANCE.optionsMapToRequestBody(hashMap2)).enqueue(this.callbacks.logEventCallback());
    }

    public void markConversationAsRead(String str) {
        HashMap hashMap = new HashMap();
        hashMap.put("app_id", this.appIdentity.appId());
        hashMap.put("user", this.userIdentity.toMap());
        addSecureHash(hashMap);
        this.messengerApi.markAsRead(str, MessengerApiHelper.INSTANCE.optionsMapToRequestBody(hashMap)).enqueue(this.emptyCallback);
    }

    public void markConversationAsDismissed(String str) {
        Map<String, Object> hashMap = new HashMap<>();
        hashMap.put("user", this.userIdentity.toMap());
        hashMap.put("conversation_ids", new String[]{str});
        addSecureHash(hashMap);
        this.messengerApi.markAsDismissed(MessengerApiHelper.INSTANCE.optionsMapToRequestBody(hashMap)).enqueue(this.emptyCallback);
    }

    public void recordInteractions(String str, String[] strArr) {
        HashMap hashMap = new HashMap();
        hashMap.put("user", this.userIdentity.toMap());
        hashMap.put("interactions", strArr);
        addSecureHash(hashMap);
        this.messengerApi.recordInteractions(str, MessengerApiHelper.INSTANCE.optionsMapToRequestBody(hashMap)).enqueue(this.emptyCallback);
    }

    public void getUnreadConversations() {
        Map<String, ? extends Object> map = this.userIdentity.toMap();
        map.put("per_page", "20");
        addSecureHash(map);
        this.messengerApi.getUnreadConversations(MessengerApiHelper.INSTANCE.optionsMapToRequestBody(map)).enqueue(this.callbacks.unreadCallback());
    }

    public void rateConversation(String str, int i) {
        HashMap hashMap = new HashMap();
        hashMap.put("user", this.userIdentity.toMap());
        hashMap.put("rating_index", Integer.valueOf(i));
        addSecureHash(hashMap);
        this.messengerApi.rateConversation(str, MessengerApiHelper.INSTANCE.optionsMapToRequestBody(hashMap)).enqueue(this.callbacks.loggingCallback("conversation rating"));
    }

    public void addConversationRatingRemark(String str, String str2) {
        HashMap hashMap = new HashMap();
        hashMap.put("user", this.userIdentity.toMap());
        hashMap.put("remark", str2);
        addSecureHash(hashMap);
        this.messengerApi.addConversationRatingRemark(str, MessengerApiHelper.INSTANCE.optionsMapToRequestBody(hashMap)).enqueue(this.callbacks.loggingCallback("adding remark to conversation"));
    }

    public Map<String, Object> createBaseReplyParams() {
        HashMap hashMap = new HashMap();
        hashMap.put("app_id", this.appIdentity.appId());
        hashMap.put("type", "user");
        hashMap.put(Constants.MessagePayloadKeys.MESSAGE_TYPE, "comment");
        hashMap.put("user", this.userIdentity.toMap());
        addSecureHash(hashMap);
        return hashMap;
    }

    public void reactToConversation(String str, int i) {
        HashMap hashMap = new HashMap();
        hashMap.put("user", this.userIdentity.toMap());
        hashMap.put("reaction_index", Integer.valueOf(i));
        addSecureHash(hashMap);
        this.messengerApi.reactToConversation(str, MessengerApiHelper.INSTANCE.optionsMapToRequestBody(hashMap)).enqueue(this.callbacks.loggingCallback("add reaction to conversation"));
    }

    public Map<String, Object> baseNewConversationParams() {
        HashMap hashMap = new HashMap();
        hashMap.put("app_id", this.appIdentity.appId());
        hashMap.put("user", this.userIdentity.toMap());
        addSecureHash(hashMap);
        return hashMap;
    }

    public void getLink(String str, Callback<LinkResponse.Builder> callback) {
        Map<String, ? extends Object> map = this.userIdentity.toMap();
        addSecureHash(map);
        this.messengerApi.getLink(str, MessengerApiHelper.INSTANCE.optionsMapToRequestBody(map)).enqueue(callback);
    }

    public void reactToLink(String str, String str2, int i, boolean z) {
        HashMap hashMap = new HashMap();
        hashMap.put("user", this.userIdentity.toMap());
        hashMap.put("article_content_id", str2);
        hashMap.put("reaction_index", Integer.valueOf(i));
        hashMap.put("allow_auto_responses", Boolean.valueOf(z));
        addSecureHash(hashMap);
        this.messengerApi.reactToLink(str, MessengerApiHelper.INSTANCE.optionsMapToRequestBody(hashMap)).enqueue(this.callbacks.loggingCallback("add reaction to link"));
    }

    public void sendMetrics(List<MetricObject> list, List<OpsMetricObject> list2, Callback<Void> callback) {
        HashMap hashMap = new HashMap();
        hashMap.put("metrics", list);
        hashMap.put("op_metrics", list2);
        this.messengerApi.sendMetrics(MessengerApiHelper.INSTANCE.optionsMapToRequestBody(hashMap)).enqueue(callback);
    }

    public void sendErrorReport(ErrorReport errorReport) {
        HashMap hashMap = new HashMap();
        hashMap.put("user", this.userIdentity.toMap());
        hashMap.put("error_report", errorReport);
        addSecureHash(hashMap);
        this.messengerApi.reportError(MessengerApiHelper.INSTANCE.optionsMapToRequestBody(hashMap)).enqueue(this.callbacks.loggingCallback("report error"));
    }

    public void getVideo(String str, okhttp3.Callback callback) {
        FirebasePerfOkHttpClient.enqueue(this.httpClient.newCall(new Request.Builder().url(str).build()), callback);
    }

    public void hitTrackingUrl(String str) {
        FirebasePerfOkHttpClient.enqueue(this.httpClient.newCall(new Request.Builder().url(str).build()), new okhttp3.Callback() { // from class: io.intercom.android.sdk.api.Api.3
            @Override // okhttp3.Callback
            public void onFailure(okhttp3.Call call, IOException iOException) {
                Api.TWIG.internal("Tracking Url", "Failed tracking url request");
            }

            @Override // okhttp3.Callback
            public void onResponse(okhttp3.Call call, okhttp3.Response response) {
                Api.TWIG.internal("Tracking Url", "success");
                response.body().close();
            }
        });
    }

    public void fetchSheet(HashMap<String, Object> hashMap, Callback<Sheet.Builder> callback) {
        HashMap hashMap2 = new HashMap();
        hashMap2.put("user", this.userIdentity.toMap());
        addSecureHash(hashMap2);
        hashMap2.putAll(hashMap);
        this.messengerApi.getSheet(MessengerApiHelper.INSTANCE.optionsMapToRequestBody(hashMap2)).enqueue(callback);
    }

    public void submitSheet(String str, Map<String, Object> map, Callback<Void> callback) {
        HashMap hashMap = new HashMap();
        hashMap.put("user", this.userIdentity.toMap());
        addSecureHash(hashMap);
        hashMap.put("uri", str);
        hashMap.put("sheet_values", map);
        this.messengerApi.submitSheet(MessengerApiHelper.INSTANCE.optionsMapToRequestBody(hashMap)).enqueue(callback);
    }

    public void markPushAsOpened(String str) {
        this.messengerApi.markPushAsOpened(MessengerApiHelper.INSTANCE.optionsMapToRequestBody(statsSystemParams(str))).enqueue(this.emptyCallback);
    }

    public void markCarouselAsDismissed(String str, boolean z) {
        Map<String, ? extends Object> statsSystemParams = statsSystemParams(str);
        addCarouselCreatedViaParam(statsSystemParams, z);
        this.messengerApi.markCarouselAsDismissed(MessengerApiHelper.INSTANCE.optionsMapToRequestBody(statsSystemParams)).enqueue(this.emptyCallback);
    }

    public void markCarouselAsCompleted(String str, boolean z) {
        Map<String, ? extends Object> statsSystemParams = statsSystemParams(str);
        addCarouselCreatedViaParam(statsSystemParams, z);
        this.messengerApi.markCarouselAsCompleted(MessengerApiHelper.INSTANCE.optionsMapToRequestBody(statsSystemParams)).enqueue(this.emptyCallback);
    }

    public void markCarouselScreenViewed(String str, String str2, boolean z) {
        Map<String, ? extends Object> statsSystemParams = statsSystemParams(str, str2);
        addCarouselCreatedViaParam(statsSystemParams, z);
        this.messengerApi.markCarouselScreenViewed(MessengerApiHelper.INSTANCE.optionsMapToRequestBody(statsSystemParams)).enqueue(this.emptyCallback);
    }

    public void markPermissionGranted(String str, String str2, boolean z) {
        Map<String, ? extends Object> statsSystemParams = statsSystemParams(str, str2);
        addCarouselCreatedViaParam(statsSystemParams, z);
        this.messengerApi.markPermissionGranted(MessengerApiHelper.INSTANCE.optionsMapToRequestBody(statsSystemParams)).enqueue(this.emptyCallback);
    }

    public void markCarouselActionButtonTapped(String str, String str2, boolean z) {
        Map<String, ? extends Object> statsSystemParams = statsSystemParams(str, str2);
        addCarouselCreatedViaParam(statsSystemParams, z);
        this.messengerApi.markCarouselActionButtonTapped(MessengerApiHelper.INSTANCE.optionsMapToRequestBody(statsSystemParams)).enqueue(this.emptyCallback);
    }

    public void fetchProgrammaticCarousel(String str, Callback<CarouselResponse.Builder> callback) {
        Map<String, ? extends Object> map = this.userIdentity.toMap();
        addSecureHash(map);
        this.messengerApi.getProgrammaticCarousel(str, MessengerApiHelper.INSTANCE.optionsMapToRequestBody(map)).enqueue(callback);
    }

    public void fetchCarouselByEntityId(String str) {
        Map<String, ? extends Object> map = this.userIdentity.toMap();
        map.put("entity_id", str);
        map.put("entity_type", 44);
        addSecureHash(map);
        this.messengerApi.getCarousel(MessengerApiHelper.INSTANCE.optionsMapToRequestBody(map)).enqueue(new BaseCallback<CarouselResponse.Builder>() { // from class: io.intercom.android.sdk.api.Api.4
            /* JADX INFO: Access modifiers changed from: protected */
            @Override // io.intercom.android.sdk.api.BaseCallback
            public void onSuccess(CarouselResponse.Builder builder) {
                Api.this.dataLayer.updateCarousel(builder.build().carousel().build());
            }
        });
    }

    public void fetchSurveyByEntityId(String str) {
        Map<String, ? extends Object> map = this.userIdentity.toMap();
        map.put("entity_id", str);
        map.put("entity_type", 85);
        addSecureHash(map);
        this.messengerApi.getSurvey(MessengerApiHelper.INSTANCE.optionsMapToRequestBody(map)).enqueue(new BaseCallback<FetchSurveyRequest>() { // from class: io.intercom.android.sdk.api.Api.5
            /* JADX INFO: Access modifiers changed from: protected */
            @Override // io.intercom.android.sdk.api.BaseCallback
            public void onSuccess(FetchSurveyRequest fetchSurveyRequest) {
                Api.this.dataLayer.updateSurveyData(fetchSurveyRequest.getSurvey());
            }
        });
    }

    protected static boolean isUserNotFound(ErrorObject errorObject, Map map) {
        if (errorObject.hasErrorBody() && errorObject.getStatusCode() == 404 && map != null && map.get(UserIdentity.INTERCOM_ID) != null && map.size() > 1) {
            try {
                if (new JSONObject(errorObject.getErrorBody()).getJSONArray("errors").getJSONObject(0).getString(UniversalFirebaseFunctionsModule.CODE_KEY).equals("not_found")) {
                    return true;
                }
            } catch (Exception unused) {
                TWIG.internal("Could not parse error response");
            }
        }
        return false;
    }

    public void addSecureHash(Map<String, Object> map) {
        map.put(DEVICE_IDENTIFIER, DeviceIdentifierHolderKt.getDeviceIdentifier(this.context));
        String jwt = this.userIdentity.getJwt();
        if (!TextUtils.isEmpty(jwt)) {
            map.put(JWT, jwt);
            return;
        }
        String hmac = this.userIdentity.getHmac();
        if (TextUtils.isEmpty(hmac)) {
            return;
        }
        map.put(HMAC, hmac);
    }

    private Map<String, Object> generateUpdateUserParams(UserUpdateRequest userUpdateRequest) {
        HashMap hashMap = new HashMap();
        hashMap.put("user", this.userIdentity.toMap());
        hashMap.put(DEVICE_DATA, DeviceData.generateDeviceData(this.context));
        hashMap.put(NEW_SESSION, Boolean.valueOf(userUpdateRequest.isNewSession()));
        hashMap.put(SENT_FROM_BACKGROUND, Boolean.valueOf(userUpdateRequest.isSentFromBackground()));
        hashMap.put(USER_ATTRIBUTES, userUpdateRequest.getAttributes());
        hashMap.put(CAROUSEL_VISIBLE, Boolean.valueOf(isCarouselVisible()));
        addSecureHash(hashMap);
        return hashMap;
    }

    private void addCarouselCreatedViaParam(Map<String, Object> map, boolean z) {
        map.put(CAROUSEL_CREATED_VIA, z ? CAROUSEL_PROGRAMMATIC : CAROUSEL_AUTOMATIC);
    }

    private boolean isCarouselVisible() {
        return !Carousel.NULL.equals(this.dataLayer.getOverlayState().getValue().getCarousel());
    }

    private Map<String, Object> statsSystemParams(String str, String str2) {
        Map<String, Object> statsSystemParams = statsSystemParams(str);
        statsSystemParams.put(SCREEN_ID, str2);
        return statsSystemParams;
    }

    private Map<String, Object> statsSystemParams(String str) {
        HashMap hashMap = new HashMap();
        hashMap.put(INSTANCE_ID, str);
        hashMap.put("user", this.userIdentity.toMap());
        addSecureHash(hashMap);
        return hashMap;
    }

    private boolean shouldStopBackgroundRequest(boolean z) {
        return z && this.appConfigProvider.get().isBackgroundRequestsDisabled();
    }

    private void logBackgroundDisabledError() {
        TWIG.e("Your request was not sent because the app is in the background. Please contact Intercom to enable background requests.", new Object[0]);
    }

    boolean isSynchronous() {
        return this.apiHttpClient.dispatcher().getMaxRequests() == 1;
    }

    public void setIdleCallback(Runnable runnable) {
        this.apiHttpClient.dispatcher().setIdleCallback(runnable);
    }

    public boolean isIdle() {
        return this.apiHttpClient.dispatcher().runningCallsCount() == 0;
    }
}
