package com.unity3d.ads.core.domain;

import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.google.protobuf.ByteString;
import com.unity3d.ads.IUnityAdsTokenListener;
import com.unity3d.ads.TokenConfiguration;
import com.unity3d.ads.core.data.model.AdObject;
import com.unity3d.ads.core.data.model.InitializationState;
import com.unity3d.ads.core.data.repository.SessionRepository;
import com.unity3d.ads.core.domain.GetInitializationState;
import com.unity3d.ads.core.domain.SendDiagnosticEvent;
import com.unity3d.ads.core.extensions.TimeExtensionsKt;
import com.unity3d.ads.core.log.Logger;
import gatewayprotocol.v1.DiagnosticEventRequestOuterClass;
import java.util.Map;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.time.TimeSource$Monotonic;
import kotlinx.coroutines.TimeoutKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: CommonInitAwaitingGetHeaderBiddingToken.kt */
@Metadata(d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B?\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f¢\u0006\u0004\b\u0010\u0010\u0011J*\u0010/\u001a\u0002002\u0006\u00101\u001a\u0002022\b\u00103\u001a\u0004\u0018\u0001042\b\u0010%\u001a\u0004\u0018\u00010&H\u0096B¢\u0006\u0002\u00105J \u00106\u001a\u0002002\u0006\u00101\u001a\u0002022\b\u00103\u001a\u0004\u0018\u000104H\u0082@¢\u0006\u0002\u00107J\"\u00108\u001a\u0002002\u0006\u00101\u001a\u0002022\u0006\u00109\u001a\u00020:2\b\u00103\u001a\u0004\u0018\u000104H\u0002J0\u0010;\u001a\u0002002\u0006\u00101\u001a\u0002022\b\u0010<\u001a\u0004\u0018\u00010:2\n\b\u0002\u0010=\u001a\u0004\u0018\u00010:2\b\u00103\u001a\u0004\u0018\u000104H\u0002J\u001a\u0010>\u001a\u0002002\u0006\u00101\u001a\u0002022\b\u00103\u001a\u0004\u0018\u000104H\u0002R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0011\u0010\f\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0011\u0010\u000e\u001a\u00020\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0013\u0010 \u001a\u00020!¢\u0006\n\n\u0002\u0010$\u001a\u0004\b\"\u0010#R\u001c\u0010%\u001a\u0004\u0018\u00010&X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b'\u0010(\"\u0004\b)\u0010*R\u000e\u0010+\u001a\u00020,X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010-\u001a\u0004\u0018\u00010.X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006?"}, d2 = {"Lcom/unity3d/ads/core/domain/CommonInitAwaitingGetHeaderBiddingToken;", "Lcom/unity3d/ads/core/domain/GetAsyncHeaderBiddingToken;", "getHeaderBiddingToken", "Lcom/unity3d/ads/core/domain/GetHeaderBiddingToken;", "sendDiagnosticEvent", "Lcom/unity3d/ads/core/domain/SendDiagnosticEvent;", "getInitializationState", "Lcom/unity3d/ads/core/domain/GetInitializationState;", "awaitInitialization", "Lcom/unity3d/ads/core/domain/AwaitInitialization;", "sessionRepository", "Lcom/unity3d/ads/core/data/repository/SessionRepository;", "safeCallbackInvoke", "Lcom/unity3d/ads/core/domain/SafeCallbackInvoke;", "logger", "Lcom/unity3d/ads/core/log/Logger;", "<init>", "(Lcom/unity3d/ads/core/domain/GetHeaderBiddingToken;Lcom/unity3d/ads/core/domain/SendDiagnosticEvent;Lcom/unity3d/ads/core/domain/GetInitializationState;Lcom/unity3d/ads/core/domain/AwaitInitialization;Lcom/unity3d/ads/core/data/repository/SessionRepository;Lcom/unity3d/ads/core/domain/SafeCallbackInvoke;Lcom/unity3d/ads/core/log/Logger;)V", "getGetHeaderBiddingToken", "()Lcom/unity3d/ads/core/domain/GetHeaderBiddingToken;", "getSendDiagnosticEvent", "()Lcom/unity3d/ads/core/domain/SendDiagnosticEvent;", "getGetInitializationState", "()Lcom/unity3d/ads/core/domain/GetInitializationState;", "getAwaitInitialization", "()Lcom/unity3d/ads/core/domain/AwaitInitialization;", "getSessionRepository", "()Lcom/unity3d/ads/core/data/repository/SessionRepository;", "getSafeCallbackInvoke", "()Lcom/unity3d/ads/core/domain/SafeCallbackInvoke;", "getLogger", "()Lcom/unity3d/ads/core/log/Logger;", "startTime", "Lkotlin/time/TimeSource$Monotonic$ValueTimeMark;", "getStartTime-z9LOYto", "()J", "J", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Lcom/unity3d/ads/IUnityAdsTokenListener;", "getListener", "()Lcom/unity3d/ads/IUnityAdsTokenListener;", "setListener", "(Lcom/unity3d/ads/IUnityAdsTokenListener;)V", "didAwaitInit", "", "startState", "Lcom/unity3d/ads/core/data/model/InitializationState;", "invoke", "", "tokenNumber", "", "tokenConfiguration", "Lcom/unity3d/ads/TokenConfiguration;", "(ILcom/unity3d/ads/TokenConfiguration;Lcom/unity3d/ads/IUnityAdsTokenListener;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "fetchToken", "(ILcom/unity3d/ads/TokenConfiguration;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "tokenSuccess", "token", "", "tokenFailure", "reason", "reasonDebug", "tokenStart", "unity-ads_defaultRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class CommonInitAwaitingGetHeaderBiddingToken implements GetAsyncHeaderBiddingToken {

    @NotNull
    private final AwaitInitialization awaitInitialization;
    private boolean didAwaitInit;

    @NotNull
    private final GetHeaderBiddingToken getHeaderBiddingToken;

    @NotNull
    private final GetInitializationState getInitializationState;

    @Nullable
    private IUnityAdsTokenListener listener;

    @NotNull
    private final Logger logger;

    @NotNull
    private final SafeCallbackInvoke safeCallbackInvoke;

    @NotNull
    private final SendDiagnosticEvent sendDiagnosticEvent;

    @NotNull
    private final SessionRepository sessionRepository;

    @Nullable
    private InitializationState startState;
    private final long startTime;

    public CommonInitAwaitingGetHeaderBiddingToken(@NotNull GetHeaderBiddingToken getHeaderBiddingToken, @NotNull SendDiagnosticEvent sendDiagnosticEvent, @NotNull GetInitializationState getInitializationState, @NotNull AwaitInitialization awaitInitialization, @NotNull SessionRepository sessionRepository, @NotNull SafeCallbackInvoke safeCallbackInvoke, @NotNull Logger logger) {
        Intrinsics.checkNotNullParameter(getHeaderBiddingToken, "getHeaderBiddingToken");
        Intrinsics.checkNotNullParameter(sendDiagnosticEvent, "sendDiagnosticEvent");
        Intrinsics.checkNotNullParameter(getInitializationState, "getInitializationState");
        Intrinsics.checkNotNullParameter(awaitInitialization, "awaitInitialization");
        Intrinsics.checkNotNullParameter(sessionRepository, "sessionRepository");
        Intrinsics.checkNotNullParameter(safeCallbackInvoke, "safeCallbackInvoke");
        Intrinsics.checkNotNullParameter(logger, "logger");
        this.getHeaderBiddingToken = getHeaderBiddingToken;
        this.sendDiagnosticEvent = sendDiagnosticEvent;
        this.getInitializationState = getInitializationState;
        this.awaitInitialization = awaitInitialization;
        this.sessionRepository = sessionRepository;
        this.safeCallbackInvoke = safeCallbackInvoke;
        this.logger = logger;
        this.startTime = TimeSource$Monotonic.INSTANCE.m8186markNowz9LOYto();
    }

    @NotNull
    public final GetHeaderBiddingToken getGetHeaderBiddingToken() {
        return this.getHeaderBiddingToken;
    }

    @NotNull
    public final SendDiagnosticEvent getSendDiagnosticEvent() {
        return this.sendDiagnosticEvent;
    }

    @NotNull
    public final GetInitializationState getGetInitializationState() {
        return this.getInitializationState;
    }

    @NotNull
    public final AwaitInitialization getAwaitInitialization() {
        return this.awaitInitialization;
    }

    @NotNull
    public final SessionRepository getSessionRepository() {
        return this.sessionRepository;
    }

    @NotNull
    public final SafeCallbackInvoke getSafeCallbackInvoke() {
        return this.safeCallbackInvoke;
    }

    @NotNull
    public final Logger getLogger() {
        return this.logger;
    }

    /* renamed from: getStartTime-z9LOYto, reason: not valid java name and from getter */
    public final long getStartTime() {
        return this.startTime;
    }

    @Nullable
    public final IUnityAdsTokenListener getListener() {
        return this.listener;
    }

    public final void setListener(@Nullable IUnityAdsTokenListener iUnityAdsTokenListener) {
        this.listener = iUnityAdsTokenListener;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0029  */
    @Override // com.unity3d.ads.core.domain.GetAsyncHeaderBiddingToken
    @Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object invoke(int i, @Nullable TokenConfiguration tokenConfiguration, @Nullable IUnityAdsTokenListener iUnityAdsTokenListener, @NotNull Continuation continuation) {
        CommonInitAwaitingGetHeaderBiddingToken$invoke$1 commonInitAwaitingGetHeaderBiddingToken$invoke$1;
        int i2;
        if (continuation instanceof CommonInitAwaitingGetHeaderBiddingToken$invoke$1) {
            commonInitAwaitingGetHeaderBiddingToken$invoke$1 = (CommonInitAwaitingGetHeaderBiddingToken$invoke$1) continuation;
            int i3 = commonInitAwaitingGetHeaderBiddingToken$invoke$1.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                commonInitAwaitingGetHeaderBiddingToken$invoke$1.label = i3 - Integer.MIN_VALUE;
                Object obj = commonInitAwaitingGetHeaderBiddingToken$invoke$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i2 = commonInitAwaitingGetHeaderBiddingToken$invoke$1.label;
                if (i2 != 0) {
                    ResultKt.throwOnFailure(obj);
                    this.listener = iUnityAdsTokenListener;
                    tokenStart(i, tokenConfiguration);
                    if (iUnityAdsTokenListener == null) {
                        tokenFailure(i, "listener_null", "IUnityAdsTokenListener is null", tokenConfiguration);
                        return Unit.INSTANCE;
                    }
                    if (!this.sessionRepository.getShouldInitialize()) {
                        tokenFailure(i, "gateway", "!sessionRepository.shouldInitialize", tokenConfiguration);
                        return Unit.INSTANCE;
                    }
                    long getTokenTimeoutMs = this.sessionRepository.getNativeConfiguration().getAdOperations().getGetTokenTimeoutMs();
                    CommonInitAwaitingGetHeaderBiddingToken$invoke$2 commonInitAwaitingGetHeaderBiddingToken$invoke$2 = new CommonInitAwaitingGetHeaderBiddingToken$invoke$2(this, null);
                    commonInitAwaitingGetHeaderBiddingToken$invoke$1.L$0 = tokenConfiguration;
                    commonInitAwaitingGetHeaderBiddingToken$invoke$1.I$0 = i;
                    commonInitAwaitingGetHeaderBiddingToken$invoke$1.label = 1;
                    if (TimeoutKt.withTimeoutOrNull(getTokenTimeoutMs, commonInitAwaitingGetHeaderBiddingToken$invoke$2, commonInitAwaitingGetHeaderBiddingToken$invoke$1) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i2 != 1) {
                        if (i2 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                        return Unit.INSTANCE;
                    }
                    i = commonInitAwaitingGetHeaderBiddingToken$invoke$1.I$0;
                    tokenConfiguration = (TokenConfiguration) commonInitAwaitingGetHeaderBiddingToken$invoke$1.L$0;
                    ResultKt.throwOnFailure(obj);
                }
                if (this.sessionRepository.getShouldInitialize()) {
                    tokenFailure(i, "gateway", "!sessionRepository.shouldInitialize", tokenConfiguration);
                    return Unit.INSTANCE;
                }
                commonInitAwaitingGetHeaderBiddingToken$invoke$1.L$0 = null;
                commonInitAwaitingGetHeaderBiddingToken$invoke$1.label = 2;
                if (fetchToken(i, tokenConfiguration, commonInitAwaitingGetHeaderBiddingToken$invoke$1) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                return Unit.INSTANCE;
            }
        }
        commonInitAwaitingGetHeaderBiddingToken$invoke$1 = new CommonInitAwaitingGetHeaderBiddingToken$invoke$1(this, continuation);
        Object obj2 = commonInitAwaitingGetHeaderBiddingToken$invoke$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i2 = commonInitAwaitingGetHeaderBiddingToken$invoke$1.label;
        if (i2 != 0) {
        }
        if (this.sessionRepository.getShouldInitialize()) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't wrap try/catch for region: R(12:0|1|(2:3|(9:5|6|7|(1:(2:10|11)(2:21|22))(3:23|24|(1:26))|12|13|(1:15)(1:19)|16|17))|29|6|7|(0)(0)|12|13|(0)(0)|16|17) */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0030, code lost:
    
        r8 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0052, code lost:
    
        r8 = com.unity3d.ads.core.extensions.ExceptionExtensionsKt.getShortenedStackTrace$default(r8, 0, 1, null);
        r0 = "uncaught_exception";
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object fetchToken(int i, TokenConfiguration tokenConfiguration, Continuation continuation) {
        CommonInitAwaitingGetHeaderBiddingToken$fetchToken$1 commonInitAwaitingGetHeaderBiddingToken$fetchToken$1;
        int i2;
        String str;
        if (continuation instanceof CommonInitAwaitingGetHeaderBiddingToken$fetchToken$1) {
            commonInitAwaitingGetHeaderBiddingToken$fetchToken$1 = (CommonInitAwaitingGetHeaderBiddingToken$fetchToken$1) continuation;
            int i3 = commonInitAwaitingGetHeaderBiddingToken$fetchToken$1.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                commonInitAwaitingGetHeaderBiddingToken$fetchToken$1.label = i3 - Integer.MIN_VALUE;
                Object obj = commonInitAwaitingGetHeaderBiddingToken$fetchToken$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i2 = commonInitAwaitingGetHeaderBiddingToken$fetchToken$1.label;
                str = null;
                if (i2 != 0) {
                    ResultKt.throwOnFailure(obj);
                    GetHeaderBiddingToken getHeaderBiddingToken = this.getHeaderBiddingToken;
                    commonInitAwaitingGetHeaderBiddingToken$fetchToken$1.L$0 = tokenConfiguration;
                    commonInitAwaitingGetHeaderBiddingToken$fetchToken$1.I$0 = i;
                    commonInitAwaitingGetHeaderBiddingToken$fetchToken$1.label = 1;
                    obj = getHeaderBiddingToken.invoke(i, tokenConfiguration, commonInitAwaitingGetHeaderBiddingToken$fetchToken$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    i = commonInitAwaitingGetHeaderBiddingToken$fetchToken$1.I$0;
                    tokenConfiguration = (TokenConfiguration) commonInitAwaitingGetHeaderBiddingToken$fetchToken$1.L$0;
                    ResultKt.throwOnFailure(obj);
                }
                String str2 = null;
                str = (String) obj;
                String shortenedStackTrace$default = null;
                if (str != null) {
                    tokenFailure(i, str2, shortenedStackTrace$default, tokenConfiguration);
                } else {
                    tokenSuccess(i, str, tokenConfiguration);
                }
                return Unit.INSTANCE;
            }
        }
        commonInitAwaitingGetHeaderBiddingToken$fetchToken$1 = new CommonInitAwaitingGetHeaderBiddingToken$fetchToken$1(this, continuation);
        Object obj2 = commonInitAwaitingGetHeaderBiddingToken$fetchToken$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i2 = commonInitAwaitingGetHeaderBiddingToken$fetchToken$1.label;
        str = null;
        if (i2 != 0) {
        }
        String str22 = null;
        str = (String) obj2;
        String shortenedStackTrace$default2 = null;
        if (str != null) {
        }
        return Unit.INSTANCE;
    }

    private final void tokenSuccess(int tokenNumber, final String token, TokenConfiguration tokenConfiguration) {
        SendDiagnosticEvent.DefaultImpls.invoke$default(this.sendDiagnosticEvent, DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_GATEWAY_TOKEN_SUCCESS_TIME, Double.valueOf(TimeExtensionsKt.elapsedMillis(TimeSource$Monotonic.ValueTimeMark.m8187boximpl(this.startTime))), MapsKt.mapOf(TuplesKt.to("sync", "false"), TuplesKt.to("state", String.valueOf(this.startState)), TuplesKt.to("complete_state", GetInitializationState.DefaultImpls.invoke$default(this.getInitializationState, false, 1, null).toString()), TuplesKt.to("awaited_init", String.valueOf(this.didAwaitInit)), TuplesKt.to("new_api", String.valueOf(tokenConfiguration != null ? tokenConfiguration.get_isNewApi() : false))), (Map) null, (AdObject) null, Integer.valueOf(tokenNumber), (ByteString) null, 88, (Object) null);
        this.logger.info("Generated a valid token.");
        this.safeCallbackInvoke.invoke(new Function0() { // from class: com.unity3d.ads.core.domain.CommonInitAwaitingGetHeaderBiddingToken$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function0
            /* renamed from: invoke */
            public final Object mo4828invoke() {
                Unit unit;
                unit = CommonInitAwaitingGetHeaderBiddingToken.tokenSuccess$lambda$0(CommonInitAwaitingGetHeaderBiddingToken.this, token);
                return unit;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit tokenSuccess$lambda$0(CommonInitAwaitingGetHeaderBiddingToken commonInitAwaitingGetHeaderBiddingToken, String str) {
        IUnityAdsTokenListener iUnityAdsTokenListener = commonInitAwaitingGetHeaderBiddingToken.listener;
        if (iUnityAdsTokenListener != null) {
            iUnityAdsTokenListener.onUnityAdsTokenReady(str);
        }
        return Unit.INSTANCE;
    }

    static /* synthetic */ void tokenFailure$default(CommonInitAwaitingGetHeaderBiddingToken commonInitAwaitingGetHeaderBiddingToken, int i, String str, String str2, TokenConfiguration tokenConfiguration, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            str2 = null;
        }
        commonInitAwaitingGetHeaderBiddingToken.tokenFailure(i, str, str2, tokenConfiguration);
    }

    private final void tokenFailure(int tokenNumber, String reason, String reasonDebug, TokenConfiguration tokenConfiguration) {
        SendDiagnosticEvent sendDiagnosticEvent = this.sendDiagnosticEvent;
        DiagnosticEventRequestOuterClass.DiagnosticEventType diagnosticEventType = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_GATEWAY_TOKEN_FAILURE_TIME;
        Double valueOf = Double.valueOf(TimeExtensionsKt.elapsedMillis(TimeSource$Monotonic.ValueTimeMark.m8187boximpl(this.startTime)));
        Map createMapBuilder = MapsKt.createMapBuilder();
        createMapBuilder.put("sync", "false");
        createMapBuilder.put("state", String.valueOf(this.startState));
        createMapBuilder.put("complete_state", GetInitializationState.DefaultImpls.invoke$default(this.getInitializationState, false, 1, null).toString());
        createMapBuilder.put("awaited_init", String.valueOf(this.didAwaitInit));
        createMapBuilder.put("new_api", String.valueOf(tokenConfiguration != null ? tokenConfiguration.get_isNewApi() : false));
        if (reason != null) {
        }
        if (reasonDebug != null) {
            createMapBuilder.put("reason_debug", reasonDebug);
        }
        Unit unit = Unit.INSTANCE;
        SendDiagnosticEvent.DefaultImpls.invoke$default(sendDiagnosticEvent, diagnosticEventType, valueOf, MapsKt.build(createMapBuilder), (Map) null, (AdObject) null, Integer.valueOf(tokenNumber), (ByteString) null, 88, (Object) null);
        Logger.DefaultImpls.error$default(this.logger, "Returned nil token due to: " + reason, null, 2, null);
        this.safeCallbackInvoke.invoke(new Function0() { // from class: com.unity3d.ads.core.domain.CommonInitAwaitingGetHeaderBiddingToken$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            /* renamed from: invoke */
            public final Object mo4828invoke() {
                Unit unit2;
                unit2 = CommonInitAwaitingGetHeaderBiddingToken.tokenFailure$lambda$4(CommonInitAwaitingGetHeaderBiddingToken.this);
                return unit2;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit tokenFailure$lambda$4(CommonInitAwaitingGetHeaderBiddingToken commonInitAwaitingGetHeaderBiddingToken) {
        IUnityAdsTokenListener iUnityAdsTokenListener = commonInitAwaitingGetHeaderBiddingToken.listener;
        if (iUnityAdsTokenListener != null) {
            iUnityAdsTokenListener.onUnityAdsTokenReady(null);
        }
        return Unit.INSTANCE;
    }

    private final void tokenStart(int tokenNumber, TokenConfiguration tokenConfiguration) {
        this.logger.info("Token generation started");
        this.startState = GetInitializationState.DefaultImpls.invoke$default(this.getInitializationState, false, 1, null);
        SendDiagnosticEvent sendDiagnosticEvent = this.sendDiagnosticEvent;
        DiagnosticEventRequestOuterClass.DiagnosticEventType diagnosticEventType = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_GATEWAY_TOKEN_STARTED;
        Map createMapBuilder = MapsKt.createMapBuilder();
        createMapBuilder.put("sync", "false");
        createMapBuilder.put("state", String.valueOf(this.startState));
        createMapBuilder.put("new_api", String.valueOf(tokenConfiguration != null ? tokenConfiguration.get_isNewApi() : false));
        Unit unit = Unit.INSTANCE;
        SendDiagnosticEvent.DefaultImpls.invoke$default(sendDiagnosticEvent, diagnosticEventType, (Double) null, MapsKt.build(createMapBuilder), (Map) null, (AdObject) null, Integer.valueOf(tokenNumber), (ByteString) null, 90, (Object) null);
    }
}
