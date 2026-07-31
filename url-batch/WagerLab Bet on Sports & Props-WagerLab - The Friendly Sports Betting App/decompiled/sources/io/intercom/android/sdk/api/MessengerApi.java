package io.intercom.android.sdk.api;

import androidx.media3.common.MimeTypes;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.facebook.gamingservices.cloudgaming.internal.SDKConstants;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import io.intercom.android.sdk.helpcenter.utils.networking.NetworkResponse;
import io.intercom.android.sdk.m5.home.data.HomeV2Response;
import io.intercom.android.sdk.models.AblyAuthResponse;
import io.intercom.android.sdk.models.AblyConnectResponse;
import io.intercom.android.sdk.models.Conversation;
import io.intercom.android.sdk.models.ConversationResponse;
import io.intercom.android.sdk.models.ConversationsResponse;
import io.intercom.android.sdk.models.GifResponse;
import io.intercom.android.sdk.models.LinkResponse;
import io.intercom.android.sdk.models.LogEventResponse;
import io.intercom.android.sdk.models.OpenMessengerResponse;
import io.intercom.android.sdk.models.Part;
import io.intercom.android.sdk.models.Sheet;
import io.intercom.android.sdk.models.TranscribedText;
import io.intercom.android.sdk.models.UpdateUserResponse;
import io.intercom.android.sdk.models.Upload;
import io.intercom.android.sdk.models.UsersResponse;
import io.intercom.android.sdk.models.carousel.CarouselResponse;
import io.intercom.android.sdk.survey.model.FetchSurveyRequest;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import okhttp3.MultipartBody;
import okhttp3.RequestBody;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Multipart;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;

/* compiled from: MessengerApi.kt */
@Metadata(d1 = {"\u0000¶\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b`\u0018\u00002\u00020\u0001J\u001e\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u0006H§@¢\u0006\u0002\u0010\u0007J\"\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\b\b\u0001\u0010\u000b\u001a\u00020\f2\b\b\u0001\u0010\u0005\u001a\u00020\u0006H'J(\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00032\b\b\u0001\u0010\u000b\u001a\u00020\f2\b\b\u0001\u0010\u0005\u001a\u00020\u0006H§@¢\u0006\u0002\u0010\u000fJ(\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\u00032\b\b\u0001\u0010\u000b\u001a\u00020\f2\b\b\u0001\u0010\u0005\u001a\u00020\u0006H§@¢\u0006\u0002\u0010\u000fJ\"\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\n0\t2\b\b\u0001\u0010\u000b\u001a\u00020\f2\b\b\u0001\u0010\u0005\u001a\u00020\u0006H'J(\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\n0\u00032\b\b\u0001\u0010\u000b\u001a\u00020\f2\b\b\u0001\u0010\u0005\u001a\u00020\u0006H§@¢\u0006\u0002\u0010\u000fJ\u0018\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\n0\t2\b\b\u0001\u0010\u0005\u001a\u00020\u0006H'J\"\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\n0\t2\b\b\u0001\u0010\u000b\u001a\u00020\f2\b\b\u0001\u0010\u0005\u001a\u00020\u0006H'J\u001e\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00170\u00032\b\b\u0003\u0010\u0005\u001a\u00020\u0006H§@¢\u0006\u0002\u0010\u0007J\u0018\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00190\t2\b\b\u0001\u0010\u0005\u001a\u00020\u0006H'J\u001e\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00190\u00032\b\b\u0003\u0010\u0005\u001a\u00020\u0006H§@¢\u0006\u0002\u0010\u0007J(\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00032\b\b\u0001\u0010\u000b\u001a\u00020\f2\b\b\u0003\u0010\u0005\u001a\u00020\u0006H§@¢\u0006\u0002\u0010\u000fJB\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001d0\u00032\b\b\u0001\u0010\u001e\u001a\u00020\u001f2\b\b\u0001\u0010 \u001a\u00020\u001f2\b\b\u0001\u0010!\u001a\u00020\u001f2\u000e\b\u0001\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u001f0#H§@¢\u0006\u0002\u0010$J\u0018\u0010%\u001a\b\u0012\u0004\u0012\u00020&0\t2\b\b\u0001\u0010\u0005\u001a\u00020\u0006H'J\u001e\u0010'\u001a\b\u0012\u0004\u0012\u00020&0\u00032\b\b\u0003\u0010\u0005\u001a\u00020\u0006H§@¢\u0006\u0002\u0010\u0007J\"\u0010(\u001a\b\u0012\u0004\u0012\u00020\n0\t2\b\b\u0001\u0010\u000b\u001a\u00020\f2\b\b\u0001\u0010\u0005\u001a\u00020\u0006H'J\"\u0010)\u001a\b\u0012\u0004\u0012\u00020\n0\t2\b\b\u0001\u0010\u000b\u001a\u00020\f2\b\b\u0001\u0010\u0005\u001a\u00020\u0006H'J(\u0010*\u001a\b\u0012\u0004\u0012\u00020\u00110\u00032\b\b\u0001\u0010\u000b\u001a\u00020\f2\b\b\u0001\u0010\u0005\u001a\u00020\u0006H§@¢\u0006\u0002\u0010\u000fJ\u0018\u0010+\u001a\b\u0012\u0004\u0012\u00020,0\t2\b\b\u0001\u0010\u0005\u001a\u00020\u0006H'J\u0018\u0010-\u001a\b\u0012\u0004\u0012\u00020.0\t2\b\b\u0001\u0010\u0005\u001a\u00020\u0006H'J\u001e\u0010/\u001a\b\u0012\u0004\u0012\u0002000\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u0006H§@¢\u0006\u0002\u0010\u0007J\u0018\u00101\u001a\b\u0012\u0004\u0012\u00020\n0\t2\b\b\u0001\u0010\u0005\u001a\u00020\u0006H'J\u0018\u00102\u001a\b\u0012\u0004\u0012\u00020\n0\t2\b\b\u0001\u0010\u0005\u001a\u00020\u0006H'J\u0018\u00103\u001a\b\u0012\u0004\u0012\u00020\n0\t2\b\b\u0001\u0010\u0005\u001a\u00020\u0006H'J\u0018\u00104\u001a\b\u0012\u0004\u0012\u00020\n0\t2\b\b\u0001\u0010\u0005\u001a\u00020\u0006H'J\"\u00105\u001a\b\u0012\u0004\u0012\u0002060\t2\b\b\u0001\u00107\u001a\u00020\f2\b\b\u0001\u0010\u0005\u001a\u00020\u0006H'J\"\u00108\u001a\b\u0012\u0004\u0012\u00020\n0\t2\b\b\u0001\u00107\u001a\u00020\f2\b\b\u0001\u0010\u0005\u001a\u00020\u0006H'J\u001e\u00109\u001a\b\u0012\u0004\u0012\u00020:0\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u0006H§@¢\u0006\u0002\u0010\u0007J\u0018\u0010;\u001a\b\u0012\u0004\u0012\u00020\n0\t2\b\b\u0001\u0010\u0005\u001a\u00020\u0006H'J\u0018\u0010<\u001a\b\u0012\u0004\u0012\u00020=0\t2\b\b\u0001\u0010\u0005\u001a\u00020\u0006H'J\u0018\u0010>\u001a\b\u0012\u0004\u0012\u00020\n0\t2\b\b\u0001\u0010\u0005\u001a\u00020\u0006H'J\u001e\u0010?\u001a\b\u0012\u0004\u0012\u00020@0\u00032\b\b\u0003\u0010\u0005\u001a\u00020\u0006H§@¢\u0006\u0002\u0010\u0007J\u001e\u0010A\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u0006H§@¢\u0006\u0002\u0010\u0007J\u0018\u0010B\u001a\b\u0012\u0004\u0012\u00020\n0\t2\b\b\u0001\u0010\u0005\u001a\u00020\u0006H'J\u0018\u0010C\u001a\b\u0012\u0004\u0012\u00020\n0\t2\b\b\u0001\u0010\u0005\u001a\u00020\u0006H'J\u0018\u0010D\u001a\b\u0012\u0004\u0012\u00020\n0\t2\b\b\u0001\u0010\u0005\u001a\u00020\u0006H'J\u0018\u0010E\u001a\b\u0012\u0004\u0012\u00020\n0\t2\b\b\u0001\u0010\u0005\u001a\u00020\u0006H'J\u0018\u0010F\u001a\b\u0012\u0004\u0012\u00020\n0\t2\b\b\u0001\u0010\u0005\u001a\u00020\u0006H'J\u0018\u0010G\u001a\b\u0012\u0004\u0012\u00020\n0\t2\b\b\u0001\u0010\u0005\u001a\u00020\u0006H'J\"\u0010H\u001a\b\u0012\u0004\u0012\u00020I0\t2\b\b\u0001\u0010J\u001a\u00020\f2\b\b\u0001\u0010\u0005\u001a\u00020\u0006H'J\u0018\u0010K\u001a\b\u0012\u0004\u0012\u00020I0\t2\b\b\u0001\u0010\u0005\u001a\u00020\u0006H'J\u0018\u0010L\u001a\b\u0012\u0004\u0012\u00020M0\t2\b\b\u0001\u0010\u0005\u001a\u00020\u0006H'J\u001e\u0010N\u001a\b\u0012\u0004\u0012\u00020O0\u00032\b\b\u0003\u0010\u0005\u001a\u00020\u0006H§@¢\u0006\u0002\u0010\u0007J\u001e\u0010P\u001a\b\u0012\u0004\u0012\u00020Q0\u00032\b\b\u0003\u0010\u0005\u001a\u00020\u0006H§@¢\u0006\u0002\u0010\u0007¨\u0006R"}, d2 = {"Lio/intercom/android/sdk/api/MessengerApi;", "", "startNewConversationSuspend", "Lio/intercom/android/sdk/helpcenter/utils/networking/NetworkResponse;", "Lio/intercom/android/sdk/models/ConversationResponse$Builder;", SDKConstants.PARAM_GAME_REQUESTS_OPTIONS, "Lokhttp3/RequestBody;", "(Lokhttp3/RequestBody;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "reactToConversation", "Lretrofit2/Call;", "Ljava/lang/Void;", "conversationId", "", "submitFormSuspend", "Lio/intercom/android/sdk/models/Conversation;", "(Ljava/lang/String;Lokhttp3/RequestBody;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "replyToConversationSuspend", "Lio/intercom/android/sdk/models/Part$Builder;", "markAsRead", "markAsReadSuspend", "markAsDismissed", "recordInteractions", "getConversationsSuspend", "Lio/intercom/android/sdk/models/ConversationsResponse$Builder;", "getUnreadConversations", "Lio/intercom/android/sdk/models/UsersResponse$Builder;", "getUnreadConversationsSuspended", "getConversationSuspend", "transcribeSuspend", "Lio/intercom/android/sdk/models/TranscribedText;", MimeTypes.BASE_TYPE_AUDIO, "Lokhttp3/MultipartBody$Part;", "userData", RemoteConfigConstants.RequestFieldKey.APP_ID, "defaultFields", "", "(Lokhttp3/MultipartBody$Part;Lokhttp3/MultipartBody$Part;Lokhttp3/MultipartBody$Part;Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "openMessenger", "Lio/intercom/android/sdk/models/OpenMessengerResponse;", "openMessengerSuspended", "rateConversation", "addConversationRatingRemark", "addConversationQuickReplySuspend", "updateUser", "Lio/intercom/android/sdk/models/UpdateUserResponse$Builder;", "logEvent", "Lio/intercom/android/sdk/models/LogEventResponse$Builder;", "getUploadFileUrlSuspended", "Lio/intercom/android/sdk/models/Upload$Builder;", "setDeviceToken", "deleteDeviceToken", "setAuthToken", "sendMetrics", "getLink", "Lio/intercom/android/sdk/models/LinkResponse$Builder;", "articleId", "reactToLink", "getGifsSuspended", "Lio/intercom/android/sdk/models/GifResponse;", "reportError", "getSheet", "Lio/intercom/android/sdk/models/Sheet$Builder;", "submitSheet", "getHomeCardsV2Suspend", "Lio/intercom/android/sdk/m5/home/data/HomeV2Response;", "triggerInboundConversationSuspend", "markPushAsOpened", "markCarouselAsDismissed", "markCarouselAsCompleted", "markCarouselScreenViewed", "markPermissionGranted", "markCarouselActionButtonTapped", "getProgrammaticCarousel", "Lio/intercom/android/sdk/models/carousel/CarouselResponse$Builder;", "carouselId", "getCarousel", "getSurvey", "Lio/intercom/android/sdk/survey/model/FetchSurveyRequest;", "getAblyConnectConfigSuspend", "Lio/intercom/android/sdk/models/AblyConnectResponse;", "getAblyAuthTokenSuspend", "Lio/intercom/android/sdk/models/AblyAuthResponse;", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes8.dex */
public interface MessengerApi {
    @POST("conversations/{conversationId}/quick_reply")
    Object addConversationQuickReplySuspend(@Path("conversationId") String str, @Body RequestBody requestBody, Continuation<? super NetworkResponse<Part.Builder>> continuation);

    @POST("conversations/{conversationId}/remark")
    Call<Void> addConversationRatingRemark(@Path("conversationId") String conversationId, @Body RequestBody options);

    @PUT("device_tokens")
    Call<Void> deleteDeviceToken(@Body RequestBody options);

    @POST("realtime/authorize")
    Object getAblyAuthTokenSuspend(@Body RequestBody requestBody, Continuation<? super NetworkResponse<AblyAuthResponse>> continuation);

    @POST("realtime/connect")
    Object getAblyConnectConfigSuspend(@Body RequestBody requestBody, Continuation<? super NetworkResponse<AblyConnectResponse>> continuation);

    @POST("content/fetch_carousel")
    Call<CarouselResponse.Builder> getCarousel(@Body RequestBody options);

    @POST("conversations/{conversationId}")
    Object getConversationSuspend(@Path("conversationId") String str, @Body RequestBody requestBody, Continuation<? super NetworkResponse<Conversation>> continuation);

    @POST("conversations/inbox")
    Object getConversationsSuspend(@Body RequestBody requestBody, Continuation<? super NetworkResponse<ConversationsResponse.Builder>> continuation);

    @POST("gifs")
    Object getGifsSuspended(@Body RequestBody requestBody, Continuation<? super NetworkResponse<? extends GifResponse>> continuation);

    @POST("home")
    Object getHomeCardsV2Suspend(@Body RequestBody requestBody, Continuation<? super NetworkResponse<HomeV2Response>> continuation);

    @POST("articles/{articleId}")
    Call<LinkResponse.Builder> getLink(@Path("articleId") String articleId, @Body RequestBody options);

    @POST("carousels/{carouselId}/fetch")
    Call<CarouselResponse.Builder> getProgrammaticCarousel(@Path("carouselId") String carouselId, @Body RequestBody options);

    @POST("sheets/open")
    Call<Sheet.Builder> getSheet(@Body RequestBody options);

    @POST("content/fetch_survey")
    Call<FetchSurveyRequest> getSurvey(@Body RequestBody options);

    @POST("conversations/unread")
    Call<UsersResponse.Builder> getUnreadConversations(@Body RequestBody options);

    @POST("conversations/unread")
    Object getUnreadConversationsSuspended(@Body RequestBody requestBody, Continuation<? super NetworkResponse<? extends UsersResponse.Builder>> continuation);

    @POST("uploads")
    Object getUploadFileUrlSuspended(@Body RequestBody requestBody, Continuation<? super NetworkResponse<Upload.Builder>> continuation);

    @POST("events")
    Call<LogEventResponse.Builder> logEvent(@Body RequestBody options);

    @POST("conversations/dismiss")
    Call<Void> markAsDismissed(@Body RequestBody options);

    @POST("conversations/{conversationId}/read")
    Call<Void> markAsRead(@Path("conversationId") String conversationId, @Body RequestBody options);

    @POST("conversations/{conversationId}/read")
    Object markAsReadSuspend(@Path("conversationId") String str, @Body RequestBody requestBody, Continuation<? super NetworkResponse<Void>> continuation);

    @POST("stats_system/carousel_button_action_tapped")
    Call<Void> markCarouselActionButtonTapped(@Body RequestBody options);

    @POST("stats_system/carousel_completed")
    Call<Void> markCarouselAsCompleted(@Body RequestBody options);

    @POST("stats_system/carousel_dismissed")
    Call<Void> markCarouselAsDismissed(@Body RequestBody options);

    @POST("stats_system/carousel_screen_viewed")
    Call<Void> markCarouselScreenViewed(@Body RequestBody options);

    @POST("stats_system/carousel_permission_granted")
    Call<Void> markPermissionGranted(@Body RequestBody options);

    @POST("stats_system/push_opened")
    Call<Void> markPushAsOpened(@Body RequestBody options);

    @POST(TtmlNode.TEXT_EMPHASIS_MARK_OPEN)
    Call<OpenMessengerResponse> openMessenger(@Body RequestBody options);

    @POST(TtmlNode.TEXT_EMPHASIS_MARK_OPEN)
    Object openMessengerSuspended(@Body RequestBody requestBody, Continuation<? super NetworkResponse<OpenMessengerResponse>> continuation);

    @POST("conversations/{conversationId}/rate")
    Call<Void> rateConversation(@Path("conversationId") String conversationId, @Body RequestBody options);

    @POST("conversations/{conversationId}/react")
    Call<Void> reactToConversation(@Path("conversationId") String conversationId, @Body RequestBody options);

    @POST("articles/{articleId}/react")
    Call<Void> reactToLink(@Path("articleId") String articleId, @Body RequestBody options);

    @POST("conversations/{conversationId}/record_interactions")
    Call<Void> recordInteractions(@Path("conversationId") String conversationId, @Body RequestBody options);

    @POST("conversations/{conversationId}/reply")
    Object replyToConversationSuspend(@Path("conversationId") String str, @Body RequestBody requestBody, Continuation<? super NetworkResponse<Part.Builder>> continuation);

    @POST("error_reports")
    Call<Void> reportError(@Body RequestBody options);

    @POST("metrics")
    Call<Void> sendMetrics(@Body RequestBody options);

    @POST("user_auth_tokens")
    Call<Void> setAuthToken(@Body RequestBody options);

    @POST("device_tokens")
    Call<Void> setDeviceToken(@Body RequestBody options);

    @POST("conversations")
    Object startNewConversationSuspend(@Body RequestBody requestBody, Continuation<? super NetworkResponse<ConversationResponse.Builder>> continuation);

    @POST("conversations/{conversationId}/form")
    Object submitFormSuspend(@Path("conversationId") String str, @Body RequestBody requestBody, Continuation<? super NetworkResponse<Conversation>> continuation);

    @POST("sheets/submit")
    Call<Void> submitSheet(@Body RequestBody options);

    @POST("conversations/transcribe")
    @Multipart
    Object transcribeSuspend(@retrofit2.http.Part MultipartBody.Part part, @retrofit2.http.Part MultipartBody.Part part2, @retrofit2.http.Part MultipartBody.Part part3, @retrofit2.http.Part List<MultipartBody.Part> list, Continuation<? super NetworkResponse<TranscribedText>> continuation);

    @POST("custom_bots/trigger_inbound_conversation")
    Object triggerInboundConversationSuspend(@Body RequestBody requestBody, Continuation<? super NetworkResponse<Conversation>> continuation);

    @POST("users")
    Call<UpdateUserResponse.Builder> updateUser(@Body RequestBody options);

    /* compiled from: MessengerApi.kt */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class DefaultImpls {
        public static /* synthetic */ Object getConversationsSuspend$default(MessengerApi messengerApi, RequestBody requestBody, Continuation continuation, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getConversationsSuspend");
            }
            if ((i & 1) != 0) {
                requestBody = MessengerApiHelper.getDefaultRequestBody$intercom_sdk_base_release$default(MessengerApiHelper.INSTANCE, null, 1, null);
            }
            return messengerApi.getConversationsSuspend(requestBody, continuation);
        }

        public static /* synthetic */ Object getUnreadConversationsSuspended$default(MessengerApi messengerApi, RequestBody requestBody, Continuation continuation, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getUnreadConversationsSuspended");
            }
            if ((i & 1) != 0) {
                requestBody = MessengerApiHelper.getDefaultRequestBody$intercom_sdk_base_release$default(MessengerApiHelper.INSTANCE, null, 1, null);
            }
            return messengerApi.getUnreadConversationsSuspended(requestBody, continuation);
        }

        public static /* synthetic */ Object getConversationSuspend$default(MessengerApi messengerApi, String str, RequestBody requestBody, Continuation continuation, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getConversationSuspend");
            }
            if ((i & 2) != 0) {
                requestBody = MessengerApiHelper.getDefaultRequestBody$intercom_sdk_base_release$default(MessengerApiHelper.INSTANCE, null, 1, null);
            }
            return messengerApi.getConversationSuspend(str, requestBody, continuation);
        }

        public static /* synthetic */ Object openMessengerSuspended$default(MessengerApi messengerApi, RequestBody requestBody, Continuation continuation, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: openMessengerSuspended");
            }
            if ((i & 1) != 0) {
                requestBody = MessengerApiHelper.getDefaultRequestBody$intercom_sdk_base_release$default(MessengerApiHelper.INSTANCE, null, 1, null);
            }
            return messengerApi.openMessengerSuspended(requestBody, continuation);
        }

        public static /* synthetic */ Object getHomeCardsV2Suspend$default(MessengerApi messengerApi, RequestBody requestBody, Continuation continuation, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getHomeCardsV2Suspend");
            }
            if ((i & 1) != 0) {
                requestBody = MessengerApiHelper.getDefaultRequestBody$intercom_sdk_base_release$default(MessengerApiHelper.INSTANCE, null, 1, null);
            }
            return messengerApi.getHomeCardsV2Suspend(requestBody, continuation);
        }

        public static /* synthetic */ Object getAblyConnectConfigSuspend$default(MessengerApi messengerApi, RequestBody requestBody, Continuation continuation, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getAblyConnectConfigSuspend");
            }
            if ((i & 1) != 0) {
                requestBody = MessengerApiHelper.getDefaultRequestBody$intercom_sdk_base_release$default(MessengerApiHelper.INSTANCE, null, 1, null);
            }
            return messengerApi.getAblyConnectConfigSuspend(requestBody, continuation);
        }

        public static /* synthetic */ Object getAblyAuthTokenSuspend$default(MessengerApi messengerApi, RequestBody requestBody, Continuation continuation, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getAblyAuthTokenSuspend");
            }
            if ((i & 1) != 0) {
                requestBody = MessengerApiHelper.getDefaultRequestBody$intercom_sdk_base_release$default(MessengerApiHelper.INSTANCE, null, 1, null);
            }
            return messengerApi.getAblyAuthTokenSuspend(requestBody, continuation);
        }
    }
}
