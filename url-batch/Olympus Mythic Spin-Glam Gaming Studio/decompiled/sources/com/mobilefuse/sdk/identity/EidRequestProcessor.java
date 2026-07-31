package com.mobilefuse.sdk.identity;

import androidx.annotation.VisibleForTesting;
import com.mobilefuse.sdk.MobileFuse;
import com.mobilefuse.sdk.MobileFuseTargetingData;
import com.mobilefuse.sdk.StabilityHelper;
import com.mobilefuse.sdk.encoding.Base64Kt;
import com.mobilefuse.sdk.exception.BaseError;
import com.mobilefuse.sdk.exception.Either;
import com.mobilefuse.sdk.exception.ErrorResult;
import com.mobilefuse.sdk.exception.ExceptionHandlingStrategy;
import com.mobilefuse.sdk.exception.ProcessingError;
import com.mobilefuse.sdk.exception.SuccessResult;
import com.mobilefuse.sdk.identity.EidService;
import com.mobilefuse.sdk.network.client.HttpBinaryPostBody;
import com.mobilefuse.sdk.network.client.HttpClient;
import com.mobilefuse.sdk.network.client.HttpClientKt;
import com.mobilefuse.sdk.network.client.HttpError;
import com.mobilefuse.sdk.network.client.HttpFlowKt;
import com.mobilefuse.sdk.network.client.HttpJsonPostBody;
import com.mobilefuse.sdk.network.client.HttpPostBody;
import com.mobilefuse.sdk.network.client.HttpResponse;
import com.mobilefuse.sdk.rx.Flow;
import com.mobilefuse.sdk.rx.FlowCollector;
import com.mobilefuse.sdk.rx.FlowKt;
import com.mobilefuse.sdk.telemetry.TelemetryActionParam;
import com.mobilefuse.sdk.telemetry.TelemetryBaseParamType;
import com.mobilefuse.sdk.telemetry.TelemetrySdkActionType;
import java.util.Set;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.collections.SetsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* compiled from: EidRequestProcessor.kt */
@Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\t\n\u0002\b\u000b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0017\u001a\u00020\u00122\u0006\u0010\u0016\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J+\u0010\u001c\u001a\u00020\u00122\u0006\u0010\f\u001a\u00020\u000b2\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00190\u00062\u0006\u0010\u001b\u001a\u00020\r¢\u0006\u0004\b\u001c\u0010\u001dJ\r\u0010\u001e\u001a\u00020\r¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010!\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u0010H\u0001¢\u0006\u0004\b \u0010\u0014J\u001f\u0010&\u001a\u00020\r2\u0006\u0010\"\u001a\u00020\u000b2\u0006\u0010#\u001a\u00020\u0007H\u0001¢\u0006\u0004\b$\u0010%J\r\u0010'\u001a\u00020\r¢\u0006\u0004\b'\u0010\u001fR<\u0010)\u001a\u001c\u0012\u0004\u0012\u00020\u000b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0004\u0012\u00020\u0012\u0018\u00010(8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.R0\u00101\u001a\u0010\u0012\u0004\u0012\u000200\u0012\u0004\u0012\u00020\u0012\u0018\u00010/8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b1\u00102\u001a\u0004\b3\u00104\"\u0004\b5\u00106R.\u00108\u001a\u0004\u0018\u00010\u00102\b\u00107\u001a\u0004\u0018\u00010\u00108\u0006@BX\u0087\u000e¢\u0006\u0012\n\u0004\b8\u00109\u0012\u0004\b<\u0010=\u001a\u0004\b:\u0010;R*\u0010?\u001a\u0004\u0018\u00010>8\u0000@\u0000X\u0081\u000e¢\u0006\u0018\n\u0004\b?\u0010@\u0012\u0004\bE\u0010=\u001a\u0004\bA\u0010B\"\u0004\bC\u0010DR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010FR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010GR\u001a\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010H¨\u0006I"}, d2 = {"Lcom/mobilefuse/sdk/identity/EidRequestProcessor;", "", "Lcom/mobilefuse/sdk/identity/EidRequestBuilder;", "requestBuilder", "Lcom/mobilefuse/sdk/network/client/HttpClient;", "httpClient", "", "", "userDataRefreshTrigger", "<init>", "(Lcom/mobilefuse/sdk/identity/EidRequestBuilder;Lcom/mobilefuse/sdk/network/client/HttpClient;Ljava/util/Set;)V", "Lcom/mobilefuse/sdk/identity/EidSdkData;", "eidData", "", "isAllowedToRefresh", "(Lcom/mobilefuse/sdk/identity/EidSdkData;)Z", "Lcom/mobilefuse/sdk/identity/EidUpdateRequest;", "eidRequest", "", "addRequestTelemetryAction", "(Lcom/mobilefuse/sdk/identity/EidUpdateRequest;)V", "Lcom/mobilefuse/sdk/network/client/HttpResponse;", "eidResponse", "addResponseTelemetryAction", "(Lcom/mobilefuse/sdk/network/client/HttpResponse;)V", "Lcom/mobilefuse/sdk/identity/IdentifierUpdateSignal;", "updateSignals", "postpone", "processRequest", "(Lcom/mobilefuse/sdk/identity/EidSdkData;Ljava/util/Set;Z)V", "processPostponedRequest", "()Z", "sendRequest$mobilefuse_sdk_core_release", "sendRequest", "currentEidData", "requestUserPayload", "hasUserDataChanged$mobilefuse_sdk_core_release", "(Lcom/mobilefuse/sdk/identity/EidSdkData;Ljava/lang/String;)Z", "hasUserDataChanged", "shouldApplyCoppaRestrictions", "Lkotlin/Function2;", "onNewEidDataReceived", "Lkotlin/jvm/functions/Function2;", "getOnNewEidDataReceived", "()Lkotlin/jvm/functions/Function2;", "setOnNewEidDataReceived", "(Lkotlin/jvm/functions/Function2;)V", "Lkotlin/Function1;", "Lcom/mobilefuse/sdk/exception/BaseError;", "onNewEidDataError", "Lkotlin/jvm/functions/Function1;", "getOnNewEidDataError", "()Lkotlin/jvm/functions/Function1;", "setOnNewEidDataError", "(Lkotlin/jvm/functions/Function1;)V", "<set-?>", "postponedEidRequest", "Lcom/mobilefuse/sdk/identity/EidUpdateRequest;", "getPostponedEidRequest", "()Lcom/mobilefuse/sdk/identity/EidUpdateRequest;", "getPostponedEidRequest$annotations", "()V", "", "activeRequestTimestamp", "Ljava/lang/Long;", "getActiveRequestTimestamp$mobilefuse_sdk_core_release", "()Ljava/lang/Long;", "setActiveRequestTimestamp$mobilefuse_sdk_core_release", "(Ljava/lang/Long;)V", "getActiveRequestTimestamp$mobilefuse_sdk_core_release$annotations", "Lcom/mobilefuse/sdk/identity/EidRequestBuilder;", "Lcom/mobilefuse/sdk/network/client/HttpClient;", "Ljava/util/Set;", "mobilefuse-sdk-core_release"}, k = 1, mv = {1, 4, 3})
/* loaded from: classes11.dex */
public final class EidRequestProcessor {

    @Nullable
    private Long activeRequestTimestamp;
    private final HttpClient httpClient;

    @Nullable
    private Function1 onNewEidDataError;

    @Nullable
    private Function2 onNewEidDataReceived;

    @Nullable
    private EidUpdateRequest postponedEidRequest;
    private final EidRequestBuilder requestBuilder;
    private final Set<String> userDataRefreshTrigger;

    @VisibleForTesting
    public static /* synthetic */ void getActiveRequestTimestamp$mobilefuse_sdk_core_release$annotations() {
    }

    @VisibleForTesting
    public static /* synthetic */ void getPostponedEidRequest$annotations() {
    }

    private final void addRequestTelemetryAction(EidUpdateRequest eidRequest) {
        String str;
        ExceptionHandlingStrategy exceptionHandlingStrategy = ExceptionHandlingStrategy.LogAndIgnore;
        try {
            EidService.Companion companion = EidService.INSTANCE;
            if (companion.getTelemetryActionsEnabled$mobilefuse_sdk_core_release()) {
                TelemetrySdkActionType telemetrySdkActionType = TelemetrySdkActionType.EID_REQUEST_SENT;
                TelemetryBaseParamType telemetryBaseParamType = TelemetryBaseParamType.BODY;
                HttpPostBody requestBody = eidRequest.getRequestBody();
                if (requestBody instanceof HttpBinaryPostBody) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("data:application/octet-stream;base64,");
                    String base64Encode = Base64Kt.base64Encode(((HttpBinaryPostBody) requestBody).getContent());
                    if (base64Encode == null) {
                        base64Encode = "";
                    }
                    sb.append(base64Encode);
                    str = sb.toString();
                } else if (requestBody instanceof HttpJsonPostBody) {
                    str = "data:application/json," + ((HttpJsonPostBody) requestBody).getJson();
                } else {
                    str = "data:text/plain,unknown";
                }
                companion.addTelemetryAction$mobilefuse_sdk_core_release(telemetrySdkActionType, CollectionsKt.listOf((Object[]) new TelemetryActionParam[]{new TelemetryActionParam(telemetryBaseParamType, str, false), new TelemetryActionParam(TelemetryBaseParamType.HEADERS, MapsKt.toList(eidRequest.getRequestBody().getHeaders()), false)}));
            }
        } catch (Throwable th) {
            int i = EidRequestProcessor$addRequestTelemetryAction$$inlined$handleExceptions$1$wm$TryKt$WhenMappings.$EnumSwitchMapping$0[exceptionHandlingStrategy.ordinal()];
            if (i == 1) {
                StabilityHelper.logException("[Automatically caught]", th);
            } else if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void addResponseTelemetryAction(HttpResponse eidResponse) {
        ExceptionHandlingStrategy exceptionHandlingStrategy = ExceptionHandlingStrategy.LogAndIgnore;
        try {
            EidService.Companion companion = EidService.INSTANCE;
            if (companion.getTelemetryActionsEnabled$mobilefuse_sdk_core_release()) {
                companion.addTelemetryAction$mobilefuse_sdk_core_release(TelemetrySdkActionType.EID_RESPONSE_RECEIVED, CollectionsKt.listOf((Object[]) new TelemetryActionParam[]{new TelemetryActionParam(TelemetryBaseParamType.BODY, eidResponse.getBody(), false), new TelemetryActionParam(TelemetryBaseParamType.STATUS_CODE, Integer.valueOf(eidResponse.getStatusCode()), false)}));
            }
        } catch (Throwable th) {
            int i = EidRequestProcessor$addResponseTelemetryAction$$inlined$handleExceptions$1$wm$TryKt$WhenMappings.$EnumSwitchMapping$0[exceptionHandlingStrategy.ordinal()];
            if (i == 1) {
                StabilityHelper.logException("[Automatically caught]", th);
            } else if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
        }
    }

    public EidRequestProcessor(@NotNull EidRequestBuilder requestBuilder, @NotNull HttpClient httpClient, @NotNull Set<String> userDataRefreshTrigger) {
        Intrinsics.checkNotNullParameter(requestBuilder, "requestBuilder");
        Intrinsics.checkNotNullParameter(httpClient, "httpClient");
        Intrinsics.checkNotNullParameter(userDataRefreshTrigger, "userDataRefreshTrigger");
        this.requestBuilder = requestBuilder;
        this.httpClient = httpClient;
        this.userDataRefreshTrigger = userDataRefreshTrigger;
    }

    public /* synthetic */ EidRequestProcessor(EidRequestBuilder eidRequestBuilder, HttpClient httpClient, Set set, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(eidRequestBuilder, (i & 2) != 0 ? HttpClientKt.getDefaultHttpClient() : httpClient, (i & 4) != 0 ? SetsKt.setOf((Object[]) new String[]{EidRequestBuilder.REQUEST_FIELD_EMAIL, "p", "ifa", "gpp", EidRequestBuilder.REQUEST_FIELD_US_PRIVACY, "lmt"}) : set);
    }

    @Nullable
    public final Function2 getOnNewEidDataReceived() {
        return this.onNewEidDataReceived;
    }

    public final void setOnNewEidDataReceived(@Nullable Function2 function2) {
        this.onNewEidDataReceived = function2;
    }

    @Nullable
    public final Function1 getOnNewEidDataError() {
        return this.onNewEidDataError;
    }

    public final void setOnNewEidDataError(@Nullable Function1 function1) {
        this.onNewEidDataError = function1;
    }

    @Nullable
    public final EidUpdateRequest getPostponedEidRequest() {
        return this.postponedEidRequest;
    }

    @Nullable
    /* renamed from: getActiveRequestTimestamp$mobilefuse_sdk_core_release, reason: from getter */
    public final Long getActiveRequestTimestamp() {
        return this.activeRequestTimestamp;
    }

    public final void setActiveRequestTimestamp$mobilefuse_sdk_core_release(@Nullable Long l) {
        this.activeRequestTimestamp = l;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x007b  */
    @VisibleForTesting
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean hasUserDataChanged$mobilefuse_sdk_core_release(@NotNull EidSdkData currentEidData, @NotNull String requestUserPayload) {
        Either errorResult;
        Object value;
        boolean z;
        Intrinsics.checkNotNullParameter(currentEidData, "currentEidData");
        Intrinsics.checkNotNullParameter(requestUserPayload, "requestUserPayload");
        ExceptionHandlingStrategy exceptionHandlingStrategy = ExceptionHandlingStrategy.LogAndIgnore;
        try {
        } catch (Throwable th) {
            if (EidRequestProcessor$hasUserDataChanged$$inlined$gracefullyHandleException$1$wm$TryKt$WhenMappings.$EnumSwitchMapping$2[exceptionHandlingStrategy.ordinal()] == 1) {
                StabilityHelper.logException("[Automatically caught]", th);
            }
            errorResult = new ErrorResult(th);
        }
        if (currentEidData.getUserPayload() != null) {
            JSONObject jSONObject = new JSONObject(currentEidData.getUserPayload());
            JSONObject jSONObject2 = new JSONObject(requestUserPayload);
            for (String str : this.userDataRefreshTrigger) {
                if (!Intrinsics.areEqual(jSONObject.has(str) ? jSONObject.get(str) : null, jSONObject2.has(str) ? jSONObject2.get(str) : null)) {
                }
            }
            z = false;
            errorResult = new SuccessResult(Boolean.valueOf(z));
            if (errorResult instanceof ErrorResult) {
                if (!(errorResult instanceof SuccessResult)) {
                    throw new NoWhenBranchMatchedException();
                }
                value = ((SuccessResult) errorResult).getValue();
            } else {
                value = Boolean.FALSE;
            }
            return ((Boolean) value).booleanValue();
        }
        z = true;
        errorResult = new SuccessResult(Boolean.valueOf(z));
        if (errorResult instanceof ErrorResult) {
        }
        return ((Boolean) value).booleanValue();
    }

    public final void processRequest(@NotNull EidSdkData eidData, @NotNull Set<? extends IdentifierUpdateSignal> updateSignals, boolean postpone) {
        Intrinsics.checkNotNullParameter(eidData, "eidData");
        Intrinsics.checkNotNullParameter(updateSignals, "updateSignals");
        this.postponedEidRequest = null;
        Either<BaseError, EidUpdateRequest> buildRequest = this.requestBuilder.buildRequest(eidData);
        if (!(buildRequest instanceof SuccessResult)) {
            if (!(buildRequest instanceof ErrorResult)) {
                throw new NoWhenBranchMatchedException();
            }
            return;
        }
        EidUpdateRequest eidUpdateRequest = (EidUpdateRequest) ((SuccessResult) buildRequest).getValue();
        boolean hasUserDataChanged$mobilefuse_sdk_core_release = hasUserDataChanged$mobilefuse_sdk_core_release(eidData, eidUpdateRequest.getRequestUserPayload());
        EidService.Companion companion = EidService.INSTANCE;
        companion.log$mobilefuse_sdk_core_release("(+) User data has changed: " + hasUserDataChanged$mobilefuse_sdk_core_release);
        if (!updateSignals.contains(IdentifierUpdateSignal.EID_REFRESH_TIMEOUT) && !hasUserDataChanged$mobilefuse_sdk_core_release && !isAllowedToRefresh(eidData)) {
            companion.log$mobilefuse_sdk_core_release("(-) Current EID request is not allowed to be sent due to timestamp or not changed user data. Reject request.");
        } else if (postpone) {
            companion.log$mobilefuse_sdk_core_release("(+) Postpone EID refresh request");
            this.postponedEidRequest = eidUpdateRequest;
        } else {
            sendRequest$mobilefuse_sdk_core_release(eidUpdateRequest);
        }
    }

    public final boolean processPostponedRequest() {
        EidUpdateRequest eidUpdateRequest = this.postponedEidRequest;
        if (eidUpdateRequest == null) {
            return false;
        }
        this.postponedEidRequest = null;
        EidService.INSTANCE.log$mobilefuse_sdk_core_release("(+) Process postponed EID refresh request");
        sendRequest$mobilefuse_sdk_core_release(eidUpdateRequest);
        return true;
    }

    @VisibleForTesting
    public final void sendRequest$mobilefuse_sdk_core_release(@NotNull final EidUpdateRequest eidRequest) {
        Intrinsics.checkNotNullParameter(eidRequest, "eidRequest");
        EidService.INSTANCE.log$mobilefuse_sdk_core_release("(+) Send EID refresh request");
        final long currentTimeMillis = System.currentTimeMillis();
        this.activeRequestTimestamp = Long.valueOf(currentTimeMillis);
        addRequestTelemetryAction(eidRequest);
        if (shouldApplyCoppaRestrictions()) {
            Function1 function1 = this.onNewEidDataError;
            if (function1 != null) {
                return;
            }
            return;
        }
        final Flow<Either<HttpError, HttpResponse>> requestHttpPost = HttpFlowKt.requestHttpPost(FlowKt.flowSingle(eidRequest.getRequestBody()), EidService.MFX_EID_ENDPOINT, 10000L, MapsKt.emptyMap(), false, this.httpClient);
        final Flow flow = FlowKt.flow(new Function1() { // from class: com.mobilefuse.sdk.identity.EidRequestProcessor$sendRequest$$inlined$map$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((FlowCollector<? super Either<? extends BaseError, ? extends HttpResponse>>) obj);
                return Unit.INSTANCE;
            }

            public final void invoke(@NotNull final FlowCollector<? super Either<? extends BaseError, ? extends HttpResponse>> flow2) {
                Intrinsics.checkNotNullParameter(flow2, "$this$flow");
                Flow.this.collect(new FlowCollector() { // from class: com.mobilefuse.sdk.identity.EidRequestProcessor$sendRequest$$inlined$map$1.1
                    @Override // com.mobilefuse.sdk.rx.FlowCollector
                    public void emitError(@NotNull Throwable error) {
                        Intrinsics.checkNotNullParameter(error, "error");
                        FlowCollector.DefaultImpls.emitError(this, error);
                    }

                    @Override // com.mobilefuse.sdk.rx.FlowCollector
                    public void emitSuccess(T t) {
                        FlowCollector.DefaultImpls.emitSuccess(this, t);
                    }

                    @Override // com.mobilefuse.sdk.rx.FlowCollector
                    public final void emit(@NotNull Either<? extends Throwable, ? extends T> value) {
                        Intrinsics.checkNotNullParameter(value, "value");
                        if (!(value instanceof SuccessResult)) {
                            if (value instanceof ErrorResult) {
                                flow2.emit(value);
                                return;
                            }
                            return;
                        }
                        FlowCollector flowCollector = flow2;
                        try {
                            Object obj = (Either) ((SuccessResult) value).getValue();
                            EidRequestProcessor$sendRequest$$inlined$map$1 eidRequestProcessor$sendRequest$$inlined$map$1 = EidRequestProcessor$sendRequest$$inlined$map$1.this;
                            long j = currentTimeMillis;
                            Long activeRequestTimestamp = this.getActiveRequestTimestamp();
                            if (activeRequestTimestamp != null && j == activeRequestTimestamp.longValue()) {
                                this.setActiveRequestTimestamp$mobilefuse_sdk_core_release(null);
                                flowCollector.emit(new SuccessResult(obj));
                            }
                            obj = new ErrorResult(new ProcessingError("Received response for outdated request (response timestamp did not match active request timestamp)"));
                            flowCollector.emit(new SuccessResult(obj));
                        } catch (Throwable th) {
                            flowCollector.emit(new ErrorResult(th));
                        }
                    }
                });
            }
        });
        FlowKt.flow(new Function1() { // from class: com.mobilefuse.sdk.identity.EidRequestProcessor$sendRequest$$inlined$mapEitherSuccessResult$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((FlowCollector<? super Either<? extends BaseError, ? extends Pair<? extends EidSdkData, ? extends Set<? extends String>>>>) obj);
                return Unit.INSTANCE;
            }

            public final void invoke(@NotNull final FlowCollector<? super Either<? extends BaseError, ? extends Pair<? extends EidSdkData, ? extends Set<? extends String>>>> flow2) {
                Intrinsics.checkNotNullParameter(flow2, "$this$flow");
                Flow.this.collect(new FlowCollector() { // from class: com.mobilefuse.sdk.identity.EidRequestProcessor$sendRequest$$inlined$mapEitherSuccessResult$1.1
                    @Override // com.mobilefuse.sdk.rx.FlowCollector
                    public void emitError(@NotNull Throwable error) {
                        Intrinsics.checkNotNullParameter(error, "error");
                        FlowCollector.DefaultImpls.emitError(this, error);
                    }

                    @Override // com.mobilefuse.sdk.rx.FlowCollector
                    public void emitSuccess(T t) {
                        FlowCollector.DefaultImpls.emitSuccess(this, t);
                    }

                    @Override // com.mobilefuse.sdk.rx.FlowCollector
                    public final void emit(@NotNull Either<? extends Throwable, ? extends T> value) {
                        Intrinsics.checkNotNullParameter(value, "value");
                        if (!(value instanceof SuccessResult)) {
                            if (value instanceof ErrorResult) {
                                flow2.emit(value);
                                return;
                            }
                            return;
                        }
                        FlowCollector flowCollector = flow2;
                        Either either = (Either) ((SuccessResult) value).getValue();
                        try {
                            if (either instanceof ErrorResult) {
                                flowCollector.emit(new SuccessResult(either));
                            } else if (either instanceof SuccessResult) {
                                HttpResponse httpResponse = (HttpResponse) ((SuccessResult) either).getValue();
                                this.addResponseTelemetryAction(httpResponse);
                                flowCollector.emit(new SuccessResult(ParseEidResponseKt.applyEidResponseToCurrentEidData(eidRequest.getEidData(), eidRequest.getRequestUserPayload(), httpResponse.getBody())));
                            }
                        } catch (Throwable th) {
                            flowCollector.emit(new ErrorResult(th));
                        }
                    }
                });
            }
        }).collect(new FlowCollector() { // from class: com.mobilefuse.sdk.identity.EidRequestProcessor$sendRequest$$inlined$collectResult$1
            @Override // com.mobilefuse.sdk.rx.FlowCollector
            public void emitError(@NotNull Throwable error) {
                Intrinsics.checkNotNullParameter(error, "error");
                FlowCollector.DefaultImpls.emitError(this, error);
            }

            @Override // com.mobilefuse.sdk.rx.FlowCollector
            public void emitSuccess(T t) {
                FlowCollector.DefaultImpls.emitSuccess(this, t);
            }

            @Override // com.mobilefuse.sdk.rx.FlowCollector
            public final void emit(@NotNull Either<? extends Throwable, ? extends T> result) {
                Function1 onNewEidDataError;
                Intrinsics.checkNotNullParameter(result, "result");
                if (result instanceof SuccessResult) {
                    Either either = (Either) ((SuccessResult) result).getValue();
                    if (!(either instanceof SuccessResult)) {
                        if (!(either instanceof ErrorResult) || (onNewEidDataError = EidRequestProcessor.this.getOnNewEidDataError()) == null) {
                            return;
                        }
                        return;
                    }
                    Function2 onNewEidDataReceived = EidRequestProcessor.this.getOnNewEidDataReceived();
                    if (onNewEidDataReceived != null) {
                        SuccessResult successResult = (SuccessResult) either;
                    }
                }
            }
        });
    }

    private final boolean isAllowedToRefresh(EidSdkData eidData) {
        return eidData.getMfxRefreshTimestamp() <= System.currentTimeMillis();
    }

    public final boolean shouldApplyCoppaRestrictions() {
        if (MobileFuse.INSTANCE.getPrivacyPreferences().isSubjectToCoppa()) {
            return true;
        }
        int age = MobileFuseTargetingData.INSTANCE.getAge();
        return 1 <= age && 12 >= age;
    }
}
