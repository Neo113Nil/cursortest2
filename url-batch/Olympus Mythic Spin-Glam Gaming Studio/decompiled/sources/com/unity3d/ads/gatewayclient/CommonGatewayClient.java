package com.unity3d.ads.gatewayclient;

import com.google.protobuf.ByteString;
import com.google.protobuf.InvalidProtocolBufferException;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.mobilefuse.sdk.identity.EidRequestBuilder;
import com.unity3d.ads.core.data.model.AdObject;
import com.unity3d.ads.core.data.model.OperationType;
import com.unity3d.ads.core.data.model.exception.NetworkTimeoutException;
import com.unity3d.ads.core.data.model.exception.UnityAdsNetworkException;
import com.unity3d.ads.core.data.repository.SessionRepository;
import com.unity3d.ads.core.domain.HandleGatewayUniversalResponse;
import com.unity3d.ads.core.domain.HttpClientProvider;
import com.unity3d.ads.core.domain.SendDiagnosticEvent;
import com.unity3d.ads.core.extensions.TimeExtensionsKt;
import com.unity3d.ads.core.log.Logger;
import com.unity3d.services.UnityAdsConstants;
import com.unity3d.services.core.network.core.HttpClient;
import com.unity3d.services.core.network.model.HttpRequest;
import com.unity3d.services.core.network.model.HttpResponse;
import com.unity3d.services.core.network.model.HttpResponseKt;
import com.unity3d.services.core.network.model.RequestType;
import com.vungle.ads.internal.protos.Sdk;
import gatewayprotocol.v1.DiagnosticEventRequestOuterClass;
import gatewayprotocol.v1.ErrorKt;
import gatewayprotocol.v1.ErrorOuterClass;
import gatewayprotocol.v1.UniversalRequestOuterClass;
import gatewayprotocol.v1.UniversalResponseKt;
import gatewayprotocol.v1.UniversalResponseOuterClass;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.jvm.internal.Intrinsics;
import kotlin.random.Random;
import kotlin.text.Charsets;
import kotlin.text.StringsKt;
import kotlin.time.Duration;
import kotlin.time.DurationKt;
import kotlin.time.DurationUnit;
import kotlin.time.TimeMark;
import kotlin.time.TimeSource$Monotonic;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.TimeoutCancellationException;
import kotlinx.coroutines.TimeoutKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: CommonGatewayClient.kt */
@Metadata(d1 = {"\u0000\u0098\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010$\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0000\u0018\u0000 @2\u00020\u0001:\u0001@B7\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r¢\u0006\u0004\b\u000e\u0010\u000fJ.\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0010\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0018H\u0096@¢\u0006\u0002\u0010\u0019J.\u0010\u001a\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0010\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0018H\u0082@¢\u0006\u0002\u0010\u0019J&\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010\u0017\u001a\u00020\u0018H\u0082@¢\u0006\u0002\u0010!J:\u0010\"\u001a\u00020\u001e2\u0006\u0010#\u001a\u00020\u00132\u0018\u0010$\u001a\u0014\u0012\u0004\u0012\u00020\u0013\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130&0%2\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0010\u001a\u00020\u0014H\u0002J\"\u0010'\u001a\u0014\u0012\u0004\u0012\u00020\u0013\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130&0%2\u0006\u0010\u001f\u001a\u00020 H\u0002J\u0010\u0010(\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u0013H\u0002J(\u0010)\u001a\u00020*2\u0006\u0010+\u001a\u00020,2\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010-\u001a\u00020.H\u0002J(\u0010/\u001a\u00020*2\u0006\u00100\u001a\u00020\u001c2\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010-\u001a\u00020.H\u0002J\u0018\u00101\u001a\u00020\u00112\u0006\u00102\u001a\u00020\u001c2\u0006\u0010\u0017\u001a\u00020\u0018H\u0002J \u00103\u001a\u0002042\u0006\u00105\u001a\u0002042\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u001f\u001a\u00020 H\u0002J \u00106\u001a\u0002042\u0006\u00105\u001a\u0002042\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u001f\u001a\u00020 H\u0002J\u0018\u00107\u001a\u0002042\u0006\u00108\u001a\u00020 2\u0006\u00109\u001a\u00020:H\u0002J \u0010;\u001a\u00020<2\u0006\u0010=\u001a\u00020 2\u0006\u0010>\u001a\u0002042\u0006\u0010?\u001a\u00020 H\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006A"}, d2 = {"Lcom/unity3d/ads/gatewayclient/CommonGatewayClient;", "Lcom/unity3d/ads/gatewayclient/GatewayClient;", "httpClientProvider", "Lcom/unity3d/ads/core/domain/HttpClientProvider;", "handleGatewayUniversalResponse", "Lcom/unity3d/ads/core/domain/HandleGatewayUniversalResponse;", "sendDiagnosticEvent", "Lcom/unity3d/ads/core/domain/SendDiagnosticEvent;", "sessionRepository", "Lcom/unity3d/ads/core/data/repository/SessionRepository;", "requestUrlFactory", "Lcom/unity3d/ads/gatewayclient/RequestUrlFactory;", "logger", "Lcom/unity3d/ads/core/log/Logger;", "<init>", "(Lcom/unity3d/ads/core/domain/HttpClientProvider;Lcom/unity3d/ads/core/domain/HandleGatewayUniversalResponse;Lcom/unity3d/ads/core/domain/SendDiagnosticEvent;Lcom/unity3d/ads/core/data/repository/SessionRepository;Lcom/unity3d/ads/gatewayclient/RequestUrlFactory;Lcom/unity3d/ads/core/log/Logger;)V", "request", "Lgatewayprotocol/v1/UniversalResponseOuterClass$UniversalResponse;", "url", "", "Lgatewayprotocol/v1/UniversalRequestOuterClass$UniversalRequest;", "requestPolicy", "Lcom/unity3d/ads/gatewayclient/RequestPolicy;", "operationType", "Lcom/unity3d/ads/core/data/model/OperationType;", "(Ljava/lang/String;Lgatewayprotocol/v1/UniversalRequestOuterClass$UniversalRequest;Lcom/unity3d/ads/gatewayclient/RequestPolicy;Lcom/unity3d/ads/core/data/model/OperationType;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "executeWithRetry", "executeRequest", "Lcom/unity3d/services/core/network/model/HttpResponse;", "httpRequest", "Lcom/unity3d/services/core/network/model/HttpRequest;", "retryCount", "", "(Lcom/unity3d/services/core/network/model/HttpRequest;ILcom/unity3d/ads/core/data/model/OperationType;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "buildHttpRequest", "gatewayUrl", "headers", "", "", "getHeaders", "getGatewayUrl", "sendNetworkErrorDiagnosticEvent", "", EidRequestBuilder.REQUEST_FIELD_EMAIL, "Lcom/unity3d/ads/core/data/model/exception/UnityAdsNetworkException;", "startTime", "Lkotlin/time/TimeMark;", "sendNetworkSuccessDiagnosticEvent", "httpResponse", "getUniversalResponse", "response", "calculateDelayTime", "", "currentDelay", "calculateExponentialBackoff", "calculateJitter", "retryWaitBase", "retryJitterPct", "", "shouldRetry", "", "responseCode", IronSourceConstants.EVENTS_DURATION, "maxDuration", "Companion", "unity-ads_defaultRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public final class CommonGatewayClient implements GatewayClient {
    public static final int CODE_400 = 400;
    public static final int CODE_599 = 599;
    public static final int CODE_TOO_MANY_REQUESTS = 429;

    @NotNull
    public static final String HEADER_CONTENT_TYPE = "Content-Type";

    @NotNull
    public static final String HEADER_PROTOBUF = "application/x-protobuf";

    @NotNull
    public static final String HEADER_RETRY_AFTER = "Retry-After";

    @NotNull
    public static final String HEADER_RETRY_ATTEMPT = "X-RETRY-ATTEMPT";

    @NotNull
    private final HandleGatewayUniversalResponse handleGatewayUniversalResponse;

    @NotNull
    private final HttpClientProvider httpClientProvider;

    @NotNull
    private final Logger logger;

    @NotNull
    private final RequestUrlFactory requestUrlFactory;

    @NotNull
    private final SendDiagnosticEvent sendDiagnosticEvent;

    @NotNull
    private final SessionRepository sessionRepository;

    /* compiled from: CommonGatewayClient.kt */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[OperationType.values().length];
            try {
                iArr[OperationType.INITIALIZATION.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[OperationType.LOAD.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[OperationType.LOAD_HEADER_BIDDING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    private final boolean shouldRetry(int responseCode, long duration, int maxDuration) {
        return 400 <= responseCode && responseCode < 600 && duration < ((long) maxDuration);
    }

    public CommonGatewayClient(@NotNull HttpClientProvider httpClientProvider, @NotNull HandleGatewayUniversalResponse handleGatewayUniversalResponse, @NotNull SendDiagnosticEvent sendDiagnosticEvent, @NotNull SessionRepository sessionRepository, @NotNull RequestUrlFactory requestUrlFactory, @NotNull Logger logger) {
        Intrinsics.checkNotNullParameter(httpClientProvider, "httpClientProvider");
        Intrinsics.checkNotNullParameter(handleGatewayUniversalResponse, "handleGatewayUniversalResponse");
        Intrinsics.checkNotNullParameter(sendDiagnosticEvent, "sendDiagnosticEvent");
        Intrinsics.checkNotNullParameter(sessionRepository, "sessionRepository");
        Intrinsics.checkNotNullParameter(requestUrlFactory, "requestUrlFactory");
        Intrinsics.checkNotNullParameter(logger, "logger");
        this.httpClientProvider = httpClientProvider;
        this.handleGatewayUniversalResponse = handleGatewayUniversalResponse;
        this.sendDiagnosticEvent = sendDiagnosticEvent;
        this.sessionRepository = sessionRepository;
        this.requestUrlFactory = requestUrlFactory;
        this.logger = logger;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x006d A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0029  */
    @Override // com.unity3d.ads.gatewayclient.GatewayClient
    @Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object request(@NotNull String str, @NotNull UniversalRequestOuterClass.UniversalRequest universalRequest, @NotNull RequestPolicy requestPolicy, @NotNull OperationType operationType, @NotNull Continuation continuation) {
        CommonGatewayClient$request$1 commonGatewayClient$request$1;
        int i;
        RequestPolicy requestPolicy2;
        UniversalResponseOuterClass.UniversalResponse universalResponse;
        if (continuation instanceof CommonGatewayClient$request$1) {
            commonGatewayClient$request$1 = (CommonGatewayClient$request$1) continuation;
            int i2 = commonGatewayClient$request$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                commonGatewayClient$request$1.label = i2 - Integer.MIN_VALUE;
                Object obj = commonGatewayClient$request$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = commonGatewayClient$request$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    Duration.Companion companion = Duration.Companion;
                    long duration = DurationKt.toDuration(requestPolicy.getMaxDuration(), DurationUnit.MILLISECONDS);
                    CommonGatewayClient$request$2 commonGatewayClient$request$2 = new CommonGatewayClient$request$2(this, operationType, str, universalRequest, requestPolicy, null);
                    commonGatewayClient$request$1.L$0 = requestPolicy;
                    commonGatewayClient$request$1.label = 1;
                    obj = TimeoutKt.m8206withTimeoutOrNullKLykuaI(duration, commonGatewayClient$request$2, commonGatewayClient$request$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    requestPolicy2 = requestPolicy;
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    requestPolicy2 = (RequestPolicy) commonGatewayClient$request$1.L$0;
                    ResultKt.throwOnFailure(obj);
                }
                universalResponse = (UniversalResponseOuterClass.UniversalResponse) obj;
                if (universalResponse == null) {
                    return universalResponse;
                }
                throw new NetworkTimeoutException("Gateway request timed out after " + requestPolicy2.getMaxDuration() + "ms", null, null, null, null, null, null, 126, null);
            }
        }
        commonGatewayClient$request$1 = new CommonGatewayClient$request$1(this, continuation);
        Object obj2 = commonGatewayClient$request$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = commonGatewayClient$request$1.label;
        if (i != 0) {
        }
        universalResponse = (UniversalResponseOuterClass.UniversalResponse) obj2;
        if (universalResponse == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00b7 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0029  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:43:0x0167 -> B:12:0x004b). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object executeWithRetry(String str, UniversalRequestOuterClass.UniversalRequest universalRequest, RequestPolicy requestPolicy, OperationType operationType, Continuation continuation) {
        CommonGatewayClient$executeWithRetry$1 commonGatewayClient$executeWithRetry$1;
        int i;
        long retryWaitBase;
        int i2;
        long j;
        OperationType operationType2;
        String str2;
        CommonGatewayClient$executeWithRetry$1 commonGatewayClient$executeWithRetry$12;
        UniversalRequestOuterClass.UniversalRequest universalRequest2;
        RequestPolicy requestPolicy2;
        UniversalRequestOuterClass.UniversalRequest universalRequest3;
        RequestPolicy requestPolicy3;
        OperationType operationType3;
        String str3;
        long j2;
        long j3;
        int i3;
        HttpResponse httpResponse;
        String str4;
        OperationType operationType4;
        Long l;
        List<String> list;
        String str5;
        Long longOrNull;
        Object executeRequest;
        if (continuation instanceof CommonGatewayClient$executeWithRetry$1) {
            commonGatewayClient$executeWithRetry$1 = (CommonGatewayClient$executeWithRetry$1) continuation;
            int i4 = commonGatewayClient$executeWithRetry$1.label;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                commonGatewayClient$executeWithRetry$1.label = i4 - Integer.MIN_VALUE;
                Object obj = commonGatewayClient$executeWithRetry$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = commonGatewayClient$executeWithRetry$1.label;
                int i5 = 2;
                int i6 = 1;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    String gatewayUrl = getGatewayUrl(str);
                    long m8186markNowz9LOYto = TimeSource$Monotonic.INSTANCE.m8186markNowz9LOYto();
                    retryWaitBase = requestPolicy.getRetryWaitBase();
                    i2 = 0;
                    j = m8186markNowz9LOYto;
                    operationType2 = operationType;
                    str2 = gatewayUrl;
                    commonGatewayClient$executeWithRetry$12 = commonGatewayClient$executeWithRetry$1;
                    universalRequest2 = universalRequest;
                    requestPolicy2 = requestPolicy;
                    HttpRequest buildHttpRequest = buildHttpRequest(str2, getHeaders(i2), requestPolicy2, universalRequest2);
                    commonGatewayClient$executeWithRetry$12.L$0 = universalRequest2;
                    commonGatewayClient$executeWithRetry$12.L$1 = requestPolicy2;
                    commonGatewayClient$executeWithRetry$12.L$2 = operationType2;
                    commonGatewayClient$executeWithRetry$12.L$3 = str2;
                    commonGatewayClient$executeWithRetry$12.I$0 = i2;
                    commonGatewayClient$executeWithRetry$12.J$0 = j;
                    commonGatewayClient$executeWithRetry$12.J$1 = retryWaitBase;
                    commonGatewayClient$executeWithRetry$12.label = i6;
                    executeRequest = executeRequest(buildHttpRequest, i2, operationType2, commonGatewayClient$executeWithRetry$12);
                    if (executeRequest == coroutine_suspended) {
                    }
                } else if (i == 1) {
                    j3 = commonGatewayClient$executeWithRetry$1.J$1;
                    j2 = commonGatewayClient$executeWithRetry$1.J$0;
                    i3 = commonGatewayClient$executeWithRetry$1.I$0;
                    str3 = (String) commonGatewayClient$executeWithRetry$1.L$3;
                    operationType3 = (OperationType) commonGatewayClient$executeWithRetry$1.L$2;
                    requestPolicy3 = (RequestPolicy) commonGatewayClient$executeWithRetry$1.L$1;
                    universalRequest3 = (UniversalRequestOuterClass.UniversalRequest) commonGatewayClient$executeWithRetry$1.L$0;
                    ResultKt.throwOnFailure(obj);
                    httpResponse = (HttpResponse) obj;
                    if (HttpResponseKt.isSuccessful(httpResponse)) {
                    }
                } else {
                    if (i == 2) {
                        UniversalResponseOuterClass.UniversalResponse universalResponse = (UniversalResponseOuterClass.UniversalResponse) commonGatewayClient$executeWithRetry$1.L$0;
                        ResultKt.throwOnFailure(obj);
                        return universalResponse;
                    }
                    if (i != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    long j4 = commonGatewayClient$executeWithRetry$1.J$1;
                    j2 = commonGatewayClient$executeWithRetry$1.J$0;
                    i3 = commonGatewayClient$executeWithRetry$1.I$0;
                    String str6 = (String) commonGatewayClient$executeWithRetry$1.L$3;
                    OperationType operationType5 = (OperationType) commonGatewayClient$executeWithRetry$1.L$2;
                    requestPolicy3 = (RequestPolicy) commonGatewayClient$executeWithRetry$1.L$1;
                    universalRequest3 = (UniversalRequestOuterClass.UniversalRequest) commonGatewayClient$executeWithRetry$1.L$0;
                    ResultKt.throwOnFailure(obj);
                    char c = 3;
                    long j5 = j4;
                    str2 = str6;
                    commonGatewayClient$executeWithRetry$12 = commonGatewayClient$executeWithRetry$1;
                    j = j2;
                    requestPolicy2 = requestPolicy3;
                    i2 = i3 + 1;
                    operationType2 = operationType5;
                    retryWaitBase = j5;
                    i5 = 2;
                    universalRequest2 = universalRequest3;
                    HttpRequest buildHttpRequest2 = buildHttpRequest(str2, getHeaders(i2), requestPolicy2, universalRequest2);
                    commonGatewayClient$executeWithRetry$12.L$0 = universalRequest2;
                    commonGatewayClient$executeWithRetry$12.L$1 = requestPolicy2;
                    commonGatewayClient$executeWithRetry$12.L$2 = operationType2;
                    commonGatewayClient$executeWithRetry$12.L$3 = str2;
                    commonGatewayClient$executeWithRetry$12.I$0 = i2;
                    commonGatewayClient$executeWithRetry$12.J$0 = j;
                    commonGatewayClient$executeWithRetry$12.J$1 = retryWaitBase;
                    commonGatewayClient$executeWithRetry$12.label = i6;
                    executeRequest = executeRequest(buildHttpRequest2, i2, operationType2, commonGatewayClient$executeWithRetry$12);
                    if (executeRequest == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    universalRequest3 = universalRequest2;
                    obj = executeRequest;
                    long j6 = retryWaitBase;
                    requestPolicy3 = requestPolicy2;
                    operationType3 = operationType2;
                    commonGatewayClient$executeWithRetry$1 = commonGatewayClient$executeWithRetry$12;
                    i3 = i2;
                    j2 = j;
                    str3 = str2;
                    j3 = j6;
                    httpResponse = (HttpResponse) obj;
                    if (HttpResponseKt.isSuccessful(httpResponse)) {
                        UniversalResponseOuterClass.UniversalResponse universalResponse2 = getUniversalResponse(httpResponse, operationType3);
                        HandleGatewayUniversalResponse handleGatewayUniversalResponse = this.handleGatewayUniversalResponse;
                        commonGatewayClient$executeWithRetry$1.L$0 = universalResponse2;
                        commonGatewayClient$executeWithRetry$1.L$1 = null;
                        commonGatewayClient$executeWithRetry$1.L$2 = null;
                        commonGatewayClient$executeWithRetry$1.L$3 = null;
                        commonGatewayClient$executeWithRetry$1.label = i5;
                        return handleGatewayUniversalResponse.invoke(universalResponse2, commonGatewayClient$executeWithRetry$1) == coroutine_suspended ? coroutine_suspended : universalResponse2;
                    }
                    if (httpResponse.getStatusCode() != 429 || (list = httpResponse.getHeaders().get(HEADER_RETRY_AFTER)) == null || (str5 = (String) CollectionsKt.firstOrNull((List) list)) == null || (longOrNull = StringsKt.toLongOrNull(str5)) == null) {
                        str4 = str3;
                        operationType4 = operationType3;
                        l = null;
                    } else {
                        str4 = str3;
                        operationType4 = operationType3;
                        l = Boxing.boxLong(longOrNull.longValue() * 1000);
                    }
                    long longValue = l != null ? l.longValue() : calculateDelayTime(j3, requestPolicy3, i3);
                    long elapsedMillis = (long) TimeExtensionsKt.elapsedMillis(TimeSource$Monotonic.ValueTimeMark.m8187boximpl(j2));
                    if (!shouldRetry(httpResponse.getStatusCode(), elapsedMillis + longValue, requestPolicy3.getMaxDuration())) {
                        throw new NetworkTimeoutException("Gateway request failed after " + i3 + " retries  currentDuration: " + elapsedMillis + "ms maxDuration: " + requestPolicy3.getMaxDuration() + "ms", null, null, null, null, null, null, 126, null);
                    }
                    commonGatewayClient$executeWithRetry$1.L$0 = universalRequest3;
                    commonGatewayClient$executeWithRetry$1.L$1 = requestPolicy3;
                    operationType5 = operationType4;
                    commonGatewayClient$executeWithRetry$1.L$2 = operationType5;
                    String str7 = str4;
                    commonGatewayClient$executeWithRetry$1.L$3 = str7;
                    commonGatewayClient$executeWithRetry$1.I$0 = i3;
                    commonGatewayClient$executeWithRetry$1.J$0 = j2;
                    commonGatewayClient$executeWithRetry$1.J$1 = longValue;
                    c = 3;
                    commonGatewayClient$executeWithRetry$1.label = 3;
                    if (DelayKt.delay(longValue, commonGatewayClient$executeWithRetry$1) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    j5 = longValue;
                    str2 = str7;
                    i6 = 1;
                    commonGatewayClient$executeWithRetry$12 = commonGatewayClient$executeWithRetry$1;
                    j = j2;
                    requestPolicy2 = requestPolicy3;
                    i2 = i3 + 1;
                    operationType2 = operationType5;
                    retryWaitBase = j5;
                    i5 = 2;
                    universalRequest2 = universalRequest3;
                    HttpRequest buildHttpRequest22 = buildHttpRequest(str2, getHeaders(i2), requestPolicy2, universalRequest2);
                    commonGatewayClient$executeWithRetry$12.L$0 = universalRequest2;
                    commonGatewayClient$executeWithRetry$12.L$1 = requestPolicy2;
                    commonGatewayClient$executeWithRetry$12.L$2 = operationType2;
                    commonGatewayClient$executeWithRetry$12.L$3 = str2;
                    commonGatewayClient$executeWithRetry$12.I$0 = i2;
                    commonGatewayClient$executeWithRetry$12.J$0 = j;
                    commonGatewayClient$executeWithRetry$12.J$1 = retryWaitBase;
                    commonGatewayClient$executeWithRetry$12.label = i6;
                    executeRequest = executeRequest(buildHttpRequest22, i2, operationType2, commonGatewayClient$executeWithRetry$12);
                    if (executeRequest == coroutine_suspended) {
                    }
                }
            }
        }
        commonGatewayClient$executeWithRetry$1 = new CommonGatewayClient$executeWithRetry$1(this, continuation);
        Object obj2 = commonGatewayClient$executeWithRetry$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = commonGatewayClient$executeWithRetry$1.label;
        int i52 = 2;
        int i62 = 1;
        if (i != 0) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00ad A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object executeRequest(HttpRequest httpRequest, int i, OperationType operationType, Continuation continuation) {
        CommonGatewayClient$executeRequest$1 commonGatewayClient$executeRequest$1;
        Object obj;
        Object coroutine_suspended;
        int i2;
        long m8186markNowz9LOYto;
        int i3;
        OperationType operationType2;
        HttpRequest httpRequest2;
        long j;
        long j2;
        OperationType operationType3;
        int i4;
        try {
            if (continuation instanceof CommonGatewayClient$executeRequest$1) {
                commonGatewayClient$executeRequest$1 = (CommonGatewayClient$executeRequest$1) continuation;
                int i5 = commonGatewayClient$executeRequest$1.label;
                if ((i5 & Integer.MIN_VALUE) != 0) {
                    commonGatewayClient$executeRequest$1.label = i5 - Integer.MIN_VALUE;
                    CommonGatewayClient$executeRequest$1 commonGatewayClient$executeRequest$12 = commonGatewayClient$executeRequest$1;
                    obj = commonGatewayClient$executeRequest$12.result;
                    coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i2 = commonGatewayClient$executeRequest$12.label;
                    if (i2 != 0) {
                        ResultKt.throwOnFailure(obj);
                        m8186markNowz9LOYto = TimeSource$Monotonic.INSTANCE.m8186markNowz9LOYto();
                        try {
                            HttpClientProvider httpClientProvider = this.httpClientProvider;
                            commonGatewayClient$executeRequest$12.L$0 = httpRequest;
                            operationType2 = operationType;
                            try {
                                commonGatewayClient$executeRequest$12.L$1 = operationType2;
                                i3 = i;
                                try {
                                    commonGatewayClient$executeRequest$12.I$0 = i3;
                                    commonGatewayClient$executeRequest$12.J$0 = m8186markNowz9LOYto;
                                    commonGatewayClient$executeRequest$12.label = 1;
                                    obj = httpClientProvider.invoke(commonGatewayClient$executeRequest$12);
                                    if (obj == coroutine_suspended) {
                                        return coroutine_suspended;
                                    }
                                    httpRequest2 = httpRequest;
                                    j = m8186markNowz9LOYto;
                                } catch (UnityAdsNetworkException e) {
                                    e = e;
                                    j2 = m8186markNowz9LOYto;
                                    sendNetworkErrorDiagnosticEvent(e, i3, operationType2, TimeSource$Monotonic.ValueTimeMark.m8187boximpl(j2));
                                    return HttpResponseKt.toHttpResponse(e);
                                } catch (TimeoutCancellationException e2) {
                                    e = e2;
                                    j2 = m8186markNowz9LOYto;
                                    sendNetworkErrorDiagnosticEvent(new NetworkTimeoutException("Gateway request was canceled due to exceeding timeout for operation", null, null, null, null, null, null, 126, null), i3, operationType2, TimeSource$Monotonic.ValueTimeMark.m8187boximpl(j2));
                                    throw e;
                                }
                            } catch (UnityAdsNetworkException e3) {
                                e = e3;
                                i3 = i;
                            } catch (TimeoutCancellationException e4) {
                                e = e4;
                                i3 = i;
                            }
                        } catch (UnityAdsNetworkException e5) {
                            e = e5;
                            i3 = i;
                            operationType2 = operationType;
                        } catch (TimeoutCancellationException e6) {
                            e = e6;
                            i3 = i;
                            operationType2 = operationType;
                        }
                    } else {
                        if (i2 != 1) {
                            if (i2 != 2) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            j2 = commonGatewayClient$executeRequest$12.J$0;
                            i4 = commonGatewayClient$executeRequest$12.I$0;
                            operationType3 = (OperationType) commonGatewayClient$executeRequest$12.L$0;
                            try {
                                ResultKt.throwOnFailure(obj);
                                HttpResponse httpResponse = (HttpResponse) obj;
                                sendNetworkSuccessDiagnosticEvent(httpResponse, i4, operationType3, TimeSource$Monotonic.ValueTimeMark.m8187boximpl(j2));
                                return httpResponse;
                            } catch (UnityAdsNetworkException e7) {
                                e = e7;
                                i3 = i4;
                                operationType2 = operationType3;
                                sendNetworkErrorDiagnosticEvent(e, i3, operationType2, TimeSource$Monotonic.ValueTimeMark.m8187boximpl(j2));
                                return HttpResponseKt.toHttpResponse(e);
                            } catch (TimeoutCancellationException e8) {
                                e = e8;
                                i3 = i4;
                                operationType2 = operationType3;
                                sendNetworkErrorDiagnosticEvent(new NetworkTimeoutException("Gateway request was canceled due to exceeding timeout for operation", null, null, null, null, null, null, 126, null), i3, operationType2, TimeSource$Monotonic.ValueTimeMark.m8187boximpl(j2));
                                throw e;
                            }
                        }
                        m8186markNowz9LOYto = commonGatewayClient$executeRequest$12.J$0;
                        int i6 = commonGatewayClient$executeRequest$12.I$0;
                        OperationType operationType4 = (OperationType) commonGatewayClient$executeRequest$12.L$1;
                        HttpRequest httpRequest3 = (HttpRequest) commonGatewayClient$executeRequest$12.L$0;
                        try {
                            ResultKt.throwOnFailure(obj);
                            i3 = i6;
                            j = m8186markNowz9LOYto;
                            operationType2 = operationType4;
                            httpRequest2 = httpRequest3;
                        } catch (UnityAdsNetworkException e9) {
                            e = e9;
                            i3 = i6;
                            operationType2 = operationType4;
                            j2 = m8186markNowz9LOYto;
                            sendNetworkErrorDiagnosticEvent(e, i3, operationType2, TimeSource$Monotonic.ValueTimeMark.m8187boximpl(j2));
                            return HttpResponseKt.toHttpResponse(e);
                        } catch (TimeoutCancellationException e10) {
                            e = e10;
                            i3 = i6;
                            operationType2 = operationType4;
                            j2 = m8186markNowz9LOYto;
                            sendNetworkErrorDiagnosticEvent(new NetworkTimeoutException("Gateway request was canceled due to exceeding timeout for operation", null, null, null, null, null, null, 126, null), i3, operationType2, TimeSource$Monotonic.ValueTimeMark.m8187boximpl(j2));
                            throw e;
                        }
                    }
                    commonGatewayClient$executeRequest$12.L$0 = operationType2;
                    commonGatewayClient$executeRequest$12.L$1 = null;
                    commonGatewayClient$executeRequest$12.I$0 = i3;
                    commonGatewayClient$executeRequest$12.J$0 = j;
                    commonGatewayClient$executeRequest$12.label = 2;
                    obj = HttpClient.DefaultImpls.execute$default((HttpClient) obj, httpRequest2, false, commonGatewayClient$executeRequest$12, 2, null);
                    if (obj != coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    operationType3 = operationType2;
                    i4 = i3;
                    j2 = j;
                    HttpResponse httpResponse2 = (HttpResponse) obj;
                    sendNetworkSuccessDiagnosticEvent(httpResponse2, i4, operationType3, TimeSource$Monotonic.ValueTimeMark.m8187boximpl(j2));
                    return httpResponse2;
                }
            }
            commonGatewayClient$executeRequest$12.L$0 = operationType2;
            commonGatewayClient$executeRequest$12.L$1 = null;
            commonGatewayClient$executeRequest$12.I$0 = i3;
            commonGatewayClient$executeRequest$12.J$0 = j;
            commonGatewayClient$executeRequest$12.label = 2;
            obj = HttpClient.DefaultImpls.execute$default((HttpClient) obj, httpRequest2, false, commonGatewayClient$executeRequest$12, 2, null);
            if (obj != coroutine_suspended) {
            }
        } catch (UnityAdsNetworkException e11) {
            e = e11;
            j2 = j;
            sendNetworkErrorDiagnosticEvent(e, i3, operationType2, TimeSource$Monotonic.ValueTimeMark.m8187boximpl(j2));
            return HttpResponseKt.toHttpResponse(e);
        } catch (TimeoutCancellationException e12) {
            e = e12;
            j2 = j;
            sendNetworkErrorDiagnosticEvent(new NetworkTimeoutException("Gateway request was canceled due to exceeding timeout for operation", null, null, null, null, null, null, 126, null), i3, operationType2, TimeSource$Monotonic.ValueTimeMark.m8187boximpl(j2));
            throw e;
        }
        commonGatewayClient$executeRequest$1 = new CommonGatewayClient$executeRequest$1(this, continuation);
        CommonGatewayClient$executeRequest$1 commonGatewayClient$executeRequest$122 = commonGatewayClient$executeRequest$1;
        obj = commonGatewayClient$executeRequest$122.result;
        coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i2 = commonGatewayClient$executeRequest$122.label;
        if (i2 != 0) {
        }
    }

    private final HttpRequest buildHttpRequest(String gatewayUrl, Map<String, ? extends List<String>> headers, RequestPolicy requestPolicy, UniversalRequestOuterClass.UniversalRequest request) {
        return new HttpRequest(gatewayUrl, null, RequestType.POST, request.toByteArray(), headers, null, null, null, null, requestPolicy.getConnectTimeout(), requestPolicy.getReadTimeout(), requestPolicy.getWriteTimeout(), requestPolicy.getOverallTimeout(), true, null, null, 0, 115170, null);
    }

    private final Map<String, List<String>> getHeaders(int retryCount) {
        Map createMapBuilder = MapsKt.createMapBuilder();
        createMapBuilder.put("Content-Type", CollectionsKt.listOf(HEADER_PROTOBUF));
        if (retryCount > 0) {
            createMapBuilder.put(HEADER_RETRY_ATTEMPT, CollectionsKt.listOf(String.valueOf(retryCount)));
        }
        return MapsKt.build(createMapBuilder);
    }

    private final String getGatewayUrl(String url) {
        return !Intrinsics.areEqual(url, UnityAdsConstants.DefaultUrls.GATEWAY_URL) ? url : this.sessionRepository.getGatewayUrl();
    }

    private final void sendNetworkErrorDiagnosticEvent(UnityAdsNetworkException e, int retryCount, OperationType operationType, TimeMark startTime) {
        if (operationType == OperationType.DIAGNOSTIC_EVENT) {
            return;
        }
        Map mutableMapOf = MapsKt.mutableMapOf(TuplesKt.to("operation", operationType.toString()), TuplesKt.to("retries", String.valueOf(retryCount)), TuplesKt.to("protocol", String.valueOf(e.getProtocol())), TuplesKt.to("network_client", String.valueOf(e.getClient())), TuplesKt.to("reason_code", String.valueOf(e.getCode())), TuplesKt.to("reason_debug", e.getMessage()));
        int i = WhenMappings.$EnumSwitchMapping$0[operationType.ordinal()];
        if (i == 1) {
            SendDiagnosticEvent.DefaultImpls.invoke$default(this.sendDiagnosticEvent, DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_INIT_REQUEST_FAILURE_TIME, Double.valueOf(TimeExtensionsKt.elapsedMillis(startTime)), mutableMapOf, (Map) null, (AdObject) null, (Integer) null, (ByteString) null, 120, (Object) null);
        } else if (i == 2 || i == 3) {
            SendDiagnosticEvent.DefaultImpls.invoke$default(this.sendDiagnosticEvent, DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_LOAD_REQUEST_FAILURE_TIME, Double.valueOf(TimeExtensionsKt.elapsedMillis(startTime)), mutableMapOf, (Map) null, (AdObject) null, (Integer) null, (ByteString) null, 120, (Object) null);
        } else {
            SendDiagnosticEvent.DefaultImpls.invoke$default(this.sendDiagnosticEvent, "native_network_failure_time", Double.valueOf(TimeExtensionsKt.elapsedMillis(startTime)), mutableMapOf, (Map) null, (AdObject) null, (Integer) null, (ByteString) null, 120, (Object) null);
        }
    }

    private final void sendNetworkSuccessDiagnosticEvent(HttpResponse httpResponse, int retryCount, OperationType operationType, TimeMark startTime) {
        if (operationType == OperationType.DIAGNOSTIC_EVENT) {
            return;
        }
        Map mutableMapOf = MapsKt.mutableMapOf(TuplesKt.to("operation", operationType.toString()), TuplesKt.to("retries", String.valueOf(retryCount)), TuplesKt.to("protocol", httpResponse.getProtocol()), TuplesKt.to("network_client", httpResponse.getClient()), TuplesKt.to("reason_code", String.valueOf(httpResponse.getStatusCode())));
        int i = WhenMappings.$EnumSwitchMapping$0[operationType.ordinal()];
        if (i == 1) {
            SendDiagnosticEvent.DefaultImpls.invoke$default(this.sendDiagnosticEvent, DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_INIT_REQUEST_SUCCESS_TIME, Double.valueOf(TimeExtensionsKt.elapsedMillis(startTime)), mutableMapOf, (Map) null, (AdObject) null, (Integer) null, (ByteString) null, 120, (Object) null);
        } else if (i == 2 || i == 3) {
            SendDiagnosticEvent.DefaultImpls.invoke$default(this.sendDiagnosticEvent, DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_LOAD_REQUEST_SUCCESS_TIME, Double.valueOf(TimeExtensionsKt.elapsedMillis(startTime)), mutableMapOf, (Map) null, (AdObject) null, (Integer) null, (ByteString) null, 120, (Object) null);
        } else {
            SendDiagnosticEvent.DefaultImpls.invoke$default(this.sendDiagnosticEvent, DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_NETWORK, Double.valueOf(TimeExtensionsKt.elapsedMillis(startTime)), mutableMapOf, (Map) null, (AdObject) null, (Integer) null, (ByteString) null, 120, (Object) null);
        }
    }

    private final UniversalResponseOuterClass.UniversalResponse getUniversalResponse(HttpResponse response, OperationType operationType) {
        try {
            Object body = response.getBody();
            if (body instanceof byte[]) {
                UniversalResponseOuterClass.UniversalResponse parseFrom = UniversalResponseOuterClass.UniversalResponse.parseFrom((byte[]) body);
                Intrinsics.checkNotNullExpressionValue(parseFrom, "parseFrom(...)");
                return parseFrom;
            }
            if (!(body instanceof String)) {
                throw new InvalidProtocolBufferException("Could not parse response from gateway service");
            }
            byte[] bytes = ((String) body).getBytes(Charsets.UTF_8);
            Intrinsics.checkNotNullExpressionValue(bytes, "getBytes(...)");
            UniversalResponseOuterClass.UniversalResponse parseFrom2 = UniversalResponseOuterClass.UniversalResponse.parseFrom(bytes);
            Intrinsics.checkNotNullExpressionValue(parseFrom2, "parseFrom(...)");
            return parseFrom2;
        } catch (InvalidProtocolBufferException e) {
            this.logger.debug("Failed to parse response from gateway service with exception: " + e.getLocalizedMessage());
            SendDiagnosticEvent.DefaultImpls.invoke$default(this.sendDiagnosticEvent, "native_network_parse_failure", (Double) null, MapsKt.mapOf(TuplesKt.to("operation", operationType.toString()), TuplesKt.to("reason", "protobuf_parsing"), TuplesKt.to("reason_debug", response.getBody().toString())), (Map) null, (AdObject) null, (Integer) null, (ByteString) null, Sdk.SDKError.Reason.INVALID_ADS_ENDPOINT_VALUE, (Object) null);
            UniversalResponseKt.Dsl.Companion companion = UniversalResponseKt.Dsl.INSTANCE;
            UniversalResponseOuterClass.UniversalResponse.Builder newBuilder = UniversalResponseOuterClass.UniversalResponse.newBuilder();
            Intrinsics.checkNotNullExpressionValue(newBuilder, "newBuilder(...)");
            UniversalResponseKt.Dsl _create = companion._create(newBuilder);
            ErrorKt.Dsl.Companion companion2 = ErrorKt.Dsl.INSTANCE;
            ErrorOuterClass.Error.Builder newBuilder2 = ErrorOuterClass.Error.newBuilder();
            Intrinsics.checkNotNullExpressionValue(newBuilder2, "newBuilder(...)");
            ErrorKt.Dsl _create2 = companion2._create(newBuilder2);
            _create2.setErrorText("ERROR: Could not parse response from gateway service");
            _create.setError(_create2._build());
            return _create._build();
        }
    }

    private final long calculateDelayTime(long currentDelay, RequestPolicy requestPolicy, int retryCount) {
        return Math.min(calculateExponentialBackoff(currentDelay, requestPolicy, retryCount) + calculateJitter(requestPolicy.getRetryWaitBase(), requestPolicy.getRetryJitterPct()), requestPolicy.getRetryMaxInterval());
    }

    private final long calculateExponentialBackoff(long currentDelay, RequestPolicy requestPolicy, int retryCount) {
        return retryCount == 0 ? currentDelay : (long) (currentDelay * requestPolicy.getRetryScalingFactor());
    }

    private final long calculateJitter(int retryWaitBase, float retryJitterPct) {
        if (retryJitterPct == 0.0f) {
            return 0L;
        }
        long j = (long) (retryWaitBase * retryJitterPct);
        return Random.Default.nextLong(-j, j);
    }
}
