package com.unity3d.ads.core.domain;

import com.google.protobuf.ByteString;
import com.unity3d.ads.UnityAds;
import com.unity3d.ads.UnityAdsShowOptions;
import com.unity3d.ads.adplayer.AdPlayer;
import com.unity3d.ads.adplayer.EmbeddableAdPlayer;
import com.unity3d.ads.adplayer.model.ShowStatus;
import com.unity3d.ads.core.data.model.AdObject;
import com.unity3d.ads.core.data.model.AdObjectState;
import com.unity3d.ads.core.data.model.InitializationState;
import com.unity3d.ads.core.data.model.Listeners;
import com.unity3d.ads.core.data.model.LoadResult;
import com.unity3d.ads.core.data.model.OperationType;
import com.unity3d.ads.core.data.repository.AdRepository;
import com.unity3d.ads.core.data.repository.SessionRepository;
import com.unity3d.ads.core.domain.GetInitializationState;
import com.unity3d.ads.core.domain.SendDiagnosticEvent;
import com.unity3d.ads.core.domain.events.GetOperativeEventApi;
import com.unity3d.ads.core.extensions.FlowExtensionsKt;
import com.unity3d.ads.core.extensions.ProtobufExtensionsKt;
import com.unity3d.ads.core.extensions.ShowStatusExtensionsKt;
import com.unity3d.ads.core.extensions.TimeExtensionsKt;
import com.unity3d.ads.core.log.Logger;
import gatewayprotocol.v1.DiagnosticEventRequestOuterClass;
import gatewayprotocol.v1.NativeConfigurationOuterClass;
import gatewayprotocol.v1.OperativeEventErrorDataKt;
import gatewayprotocol.v1.OperativeEventRequestOuterClass;
import java.util.Arrays;
import java.util.Map;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function6;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref$BooleanRef;
import kotlin.time.TimeMark;
import kotlin.time.TimeSource$Monotonic;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* compiled from: LegacyShowUseCase.kt */
@Metadata(d1 = {"\u0000\u009c\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\b\b\u0000\u0018\u0000 F2\u00020\u0001:\u0001FBG\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u0011¢\u0006\u0004\b\u0012\u0010\u0013J*\u0010\u001e\u001a\u00020\u001f2\b\u0010\u001a\u001a\u0004\u0018\u00010\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001d2\u0006\u0010 \u001a\u00020!H\u0086B¢\u0006\u0002\u0010\"J\u001e\u0010#\u001a\u00020\u001f2\u0006\u0010$\u001a\u00020%2\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010 \u001a\u00020!J \u0010&\u001a\u00020\u001f2\u0006\u0010$\u001a\u00020%2\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010 \u001a\u00020!H\u0002J&\u0010'\u001a\u00020\u001f2\u0006\u0010(\u001a\u00020)2\u0006\u0010*\u001a\u00020\u001b2\u0006\u0010\u0018\u001a\u00020\u0019H\u0082@¢\u0006\u0002\u0010+J\u0010\u0010,\u001a\u00020\u001f2\u0006\u0010$\u001a\u00020%H\u0002J \u0010-\u001a\u00020\u001f2\u0006\u0010$\u001a\u00020%2\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010 \u001a\u00020!H\u0002J \u0010.\u001a\u00020\u001f2\u0006\u0010$\u001a\u00020%2\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010 \u001a\u00020!H\u0002J\u0012\u0010/\u001a\u0004\u0018\u00010\u001b2\u0006\u0010\u001c\u001a\u00020\u001dH\u0002J\u001a\u00100\u001a\u00020\u001f2\u0006\u00101\u001a\u00020\u001b2\b\u00102\u001a\u0004\u0018\u00010\u001dH\u0002JJ\u00103\u001a\u00020\u001f2\u0006\u0010$\u001a\u00020%2\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u00104\u001a\u0002052\u0006\u0010 \u001a\u00020!2\n\b\u0002\u00106\u001a\u0004\u0018\u00010\u001b2\n\b\u0002\u00107\u001a\u0004\u0018\u00010\u001b2\b\u00102\u001a\u0004\u0018\u00010\u001dH\u0002Jo\u00108\u001a:\b\u0001\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020:\u0012\u0004\u0012\u00020\u001b\u0012\u0006\u0012\u0004\u0018\u00010;\u0012\u0006\u0012\u0004\u0018\u00010\u001b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001f0<\u0012\u0006\u0012\u0004\u0018\u00010\u0001092\u0006\u0010$\u001a\u00020%2\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u00101\u001a\u00020\u001b2\u0006\u0010 \u001a\u00020!2\b\u00102\u001a\u0004\u0018\u00010\u001dH\u0002¢\u0006\u0002\u0010=J?\u0010>\u001a\u000e\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\u001b0?2\u0006\u0010@\u001a\u00020\u001b2\b\u0010A\u001a\u0004\u0018\u00010;2\b\u0010B\u001a\u0004\u0018\u00010\u001b2\b\u00102\u001a\u0004\u0018\u00010\u001dH\u0002¢\u0006\u0002\u0010CJ\u0010\u0010D\u001a\u00020\u00192\u0006\u00101\u001a\u00020\u001bH\u0002J\b\u0010E\u001a\u00020\u001bH\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00160\u0015X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\u0015X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0018\u001a\u0004\u0018\u00010\u0019X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u001a\u001a\u0004\u0018\u00010\u001bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u001c\u001a\u0004\u0018\u00010\u001dX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006G"}, d2 = {"Lcom/unity3d/ads/core/domain/LegacyShowUseCase;", "", "show", "Lcom/unity3d/ads/core/domain/Show;", "adRepository", "Lcom/unity3d/ads/core/data/repository/AdRepository;", "sendDiagnosticEvent", "Lcom/unity3d/ads/core/domain/SendDiagnosticEvent;", "getOperativeEventApi", "Lcom/unity3d/ads/core/domain/events/GetOperativeEventApi;", "getInitializationState", "Lcom/unity3d/ads/core/domain/GetInitializationState;", "sessionRepository", "Lcom/unity3d/ads/core/data/repository/SessionRepository;", "safeCallbackInvoke", "Lcom/unity3d/ads/core/domain/SafeCallbackInvoke;", "logger", "Lcom/unity3d/ads/core/log/Logger;", "<init>", "(Lcom/unity3d/ads/core/domain/Show;Lcom/unity3d/ads/core/data/repository/AdRepository;Lcom/unity3d/ads/core/domain/SendDiagnosticEvent;Lcom/unity3d/ads/core/domain/events/GetOperativeEventApi;Lcom/unity3d/ads/core/domain/GetInitializationState;Lcom/unity3d/ads/core/data/repository/SessionRepository;Lcom/unity3d/ads/core/domain/SafeCallbackInvoke;Lcom/unity3d/ads/core/log/Logger;)V", "hasStarted", "Lkotlinx/coroutines/flow/MutableStateFlow;", "", "timeoutCancellationRequested", "adObject", "Lcom/unity3d/ads/core/data/model/AdObject;", "placement", "", "unityAdsShowOptions", "Lcom/unity3d/ads/UnityAdsShowOptions;", "invoke", "", "listeners", "Lcom/unity3d/ads/core/data/model/Listeners;", "(Ljava/lang/String;Lcom/unity3d/ads/UnityAdsShowOptions;Lcom/unity3d/ads/core/data/model/Listeners;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "showReceivedReward", "startTime", "Lkotlin/time/TimeMark;", "bannerLeftApplication", "sendOperativeError", "operativeEvent", "Lgatewayprotocol/v1/OperativeEventRequestOuterClass$OperativeEventErrorType;", "operativeMessage", "(Lgatewayprotocol/v1/OperativeEventRequestOuterClass$OperativeEventErrorType;Ljava/lang/String;Lcom/unity3d/ads/core/data/model/AdObject;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "cancelTimeout", "showStarted", "showClicked", "getOpportunityId", "showStart", "opportunityId", "showOptions", "showCompleted", "status", "Lcom/unity3d/ads/adplayer/model/ShowStatus;", "reason", "reasonDebug", "showError", "Lkotlin/Function6;", "Lcom/unity3d/ads/UnityAds$UnityAdsShowError;", "", "Lkotlin/coroutines/Continuation;", "(Lkotlin/time/TimeMark;Ljava/lang/String;Ljava/lang/String;Lcom/unity3d/ads/core/data/model/Listeners;Lcom/unity3d/ads/UnityAdsShowOptions;)Lkotlin/jvm/functions/Function6;", "getTags", "", "diagnosticReason", "code", "debugMessage", "(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Lcom/unity3d/ads/UnityAdsShowOptions;)Ljava/util/Map;", "getTmpAdObject", "getAdInfoString", "Companion", "unity-ads_defaultRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class LegacyShowUseCase {

    @NotNull
    public static final String KEY_OBJECT_ID = "objectId";

    @NotNull
    public static final String MESSAGE_AD_OBJECT_EXPIRED = "The ad has expired";

    @NotNull
    public static final String MESSAGE_AD_PLAYER_UNAVAILABLE = "Ad player is unavailable.";

    @NotNull
    public static final String MESSAGE_ALREADY_SHOWING = "Can't show a new ad unit when ad unit is already open";

    @NotNull
    public static final String MESSAGE_NO_AD_OBJECT = "No ad object found for opportunity id: ";

    @NotNull
    public static final String MESSAGE_OPPORTUNITY_ID = "No valid opportunity id provided";

    @NotNull
    public static final String MESSAGE_OPT_TIMEOUT = "timeout";

    @NotNull
    public static final String MESSAGE_PLACEMENT_NOT_LOADED = "Placement %s must be Loaded before calling Show";

    @NotNull
    public static final String MESSAGE_TIMEOUT = "[UnityAds] Timeout while trying to show ";

    @NotNull
    public static final String MSG_OPPORTUNITY_AND_PLACEMENT_NOT_MATCHING = "[UnityAds] Object ID and Placement ID provided does not match previously loaded ad";
    private static volatile boolean isFullscreenAdShowing;

    @Nullable
    private AdObject adObject;

    @NotNull
    private final AdRepository adRepository;

    @NotNull
    private final GetInitializationState getInitializationState;

    @NotNull
    private final GetOperativeEventApi getOperativeEventApi;

    @NotNull
    private final MutableStateFlow hasStarted;

    @NotNull
    private final Logger logger;

    @Nullable
    private String placement;

    @NotNull
    private final SafeCallbackInvoke safeCallbackInvoke;

    @NotNull
    private final SendDiagnosticEvent sendDiagnosticEvent;

    @NotNull
    private final SessionRepository sessionRepository;

    @NotNull
    private final Show show;

    @NotNull
    private final MutableStateFlow timeoutCancellationRequested;

    @Nullable
    private UnityAdsShowOptions unityAdsShowOptions;

    /* JADX INFO: Access modifiers changed from: private */
    public final Object sendOperativeError(OperativeEventRequestOuterClass.OperativeEventErrorType operativeEventErrorType, String str, AdObject adObject, Continuation continuation) {
        OperativeEventErrorDataKt.Dsl.Companion companion = OperativeEventErrorDataKt.Dsl.INSTANCE;
        OperativeEventRequestOuterClass.OperativeEventErrorData.Builder newBuilder = OperativeEventRequestOuterClass.OperativeEventErrorData.newBuilder();
        Intrinsics.checkNotNullExpressionValue(newBuilder, "newBuilder(...)");
        OperativeEventErrorDataKt.Dsl _create = companion._create(newBuilder);
        _create.setErrorType(operativeEventErrorType);
        _create.setMessage(str);
        OperativeEventRequestOuterClass.OperativeEventErrorData _build = _create._build();
        GetOperativeEventApi getOperativeEventApi = this.getOperativeEventApi;
        OperativeEventRequestOuterClass.OperativeEventType operativeEventType = OperativeEventRequestOuterClass.OperativeEventType.OPERATIVE_EVENT_TYPE_SHOW_ERROR;
        ByteString byteString = _build.toByteString();
        Intrinsics.checkNotNullExpressionValue(byteString, "toByteString(...)");
        Object invoke = getOperativeEventApi.invoke(operativeEventType, adObject, byteString, continuation);
        return invoke == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? invoke : Unit.INSTANCE;
    }

    public LegacyShowUseCase(@NotNull Show show, @NotNull AdRepository adRepository, @NotNull SendDiagnosticEvent sendDiagnosticEvent, @NotNull GetOperativeEventApi getOperativeEventApi, @NotNull GetInitializationState getInitializationState, @NotNull SessionRepository sessionRepository, @NotNull SafeCallbackInvoke safeCallbackInvoke, @NotNull Logger logger) {
        Intrinsics.checkNotNullParameter(show, "show");
        Intrinsics.checkNotNullParameter(adRepository, "adRepository");
        Intrinsics.checkNotNullParameter(sendDiagnosticEvent, "sendDiagnosticEvent");
        Intrinsics.checkNotNullParameter(getOperativeEventApi, "getOperativeEventApi");
        Intrinsics.checkNotNullParameter(getInitializationState, "getInitializationState");
        Intrinsics.checkNotNullParameter(sessionRepository, "sessionRepository");
        Intrinsics.checkNotNullParameter(safeCallbackInvoke, "safeCallbackInvoke");
        Intrinsics.checkNotNullParameter(logger, "logger");
        this.show = show;
        this.adRepository = adRepository;
        this.sendDiagnosticEvent = sendDiagnosticEvent;
        this.getOperativeEventApi = getOperativeEventApi;
        this.getInitializationState = getInitializationState;
        this.sessionRepository = sessionRepository;
        this.safeCallbackInvoke = safeCallbackInvoke;
        this.logger = logger;
        Boolean bool = Boolean.FALSE;
        this.hasStarted = StateFlowKt.MutableStateFlow(bool);
        this.timeoutCancellationRequested = StateFlowKt.MutableStateFlow(bool);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0313  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002e  */
    @Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(@Nullable String str, @Nullable UnityAdsShowOptions unityAdsShowOptions, @NotNull Listeners listeners, @NotNull Continuation continuation) {
        LegacyShowUseCase$invoke$1 legacyShowUseCase$invoke$1;
        LegacyShowUseCase$invoke$1 legacyShowUseCase$invoke$12;
        Object m8023constructorimpl;
        ByteString byteString;
        int i;
        CoroutineScope scope;
        JSONObject data;
        Object opt;
        UUID uuid;
        if (continuation instanceof LegacyShowUseCase$invoke$1) {
            legacyShowUseCase$invoke$1 = (LegacyShowUseCase$invoke$1) continuation;
            int i2 = legacyShowUseCase$invoke$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                legacyShowUseCase$invoke$1.label = i2 - Integer.MIN_VALUE;
                legacyShowUseCase$invoke$12 = legacyShowUseCase$invoke$1;
                Object obj = legacyShowUseCase$invoke$12.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                switch (legacyShowUseCase$invoke$12.label) {
                    case 0:
                        ResultKt.throwOnFailure(obj);
                        long m8186markNowz9LOYto = TimeSource$Monotonic.INSTANCE.m8186markNowz9LOYto();
                        this.placement = str;
                        this.unityAdsShowOptions = unityAdsShowOptions;
                        this.logger.debug("Show for placement " + str + " called");
                        Ref$BooleanRef ref$BooleanRef = new Ref$BooleanRef();
                        Ref$BooleanRef ref$BooleanRef2 = new Ref$BooleanRef();
                        try {
                            Result.Companion companion = Result.INSTANCE;
                            m8023constructorimpl = Result.m8023constructorimpl(unityAdsShowOptions != null ? getOpportunityId(unityAdsShowOptions) : null);
                        } catch (Throwable th) {
                            Result.Companion companion2 = Result.INSTANCE;
                            m8023constructorimpl = Result.m8023constructorimpl(ResultKt.createFailure(th));
                        }
                        if (Result.m8026exceptionOrNullimpl(m8023constructorimpl) != null) {
                            ref$BooleanRef.element = true;
                            m8023constructorimpl = UUID.randomUUID().toString();
                        }
                        String str2 = (String) m8023constructorimpl;
                        if (str2 == null) {
                            if (str != null) {
                                ByteString pollOpportunityIdForPlacement = this.adRepository.pollOpportunityIdForPlacement(str);
                                str2 = (pollOpportunityIdForPlacement == null || (uuid = ProtobufExtensionsKt.toUUID(pollOpportunityIdForPlacement)) == null) ? null : uuid.toString();
                                if (str2 == null) {
                                    ref$BooleanRef2.element = true;
                                    str2 = UUID.randomUUID().toString();
                                }
                            } else {
                                str2 = UUID.randomUUID().toString();
                            }
                            Intrinsics.checkNotNull(str2);
                        }
                        showStart(str2, unityAdsShowOptions);
                        Function6 showError = showError(TimeSource$Monotonic.ValueTimeMark.m8187boximpl(m8186markNowz9LOYto), str == null ? "" : str, str2, listeners, unityAdsShowOptions);
                        if (GetInitializationState.DefaultImpls.invoke$default(this.getInitializationState, false, 1, null) != InitializationState.INITIALIZED) {
                            UnityAds.UnityAdsShowError unityAdsShowError = UnityAds.UnityAdsShowError.NOT_INITIALIZED;
                            legacyShowUseCase$invoke$12.label = 1;
                            if (showError.invoke("not_initialized", unityAdsShowError, LoadResult.MSG_NOT_INITIALIZED, null, null, legacyShowUseCase$invoke$12) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            return Unit.INSTANCE;
                        }
                        if (str == null) {
                            UnityAds.UnityAdsShowError unityAdsShowError2 = UnityAds.UnityAdsShowError.INVALID_ARGUMENT;
                            legacyShowUseCase$invoke$12.label = 2;
                            if (showError.invoke("placement_null", unityAdsShowError2, LoadResult.MSG_PLACEMENT_NULL, null, null, legacyShowUseCase$invoke$12) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            return Unit.INSTANCE;
                        }
                        if (ref$BooleanRef.element) {
                            String obj2 = (unityAdsShowOptions == null || (data = unityAdsShowOptions.getData()) == null || (opt = data.opt("objectId")) == null) ? null : opt.toString();
                            UnityAds.UnityAdsShowError unityAdsShowError3 = UnityAds.UnityAdsShowError.INVALID_ARGUMENT;
                            legacyShowUseCase$invoke$12.label = 3;
                            if (showError.invoke("no_opportunity_id", unityAdsShowError3, MESSAGE_OPPORTUNITY_ID, null, obj2, legacyShowUseCase$invoke$12) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            return Unit.INSTANCE;
                        }
                        if (ref$BooleanRef2.element) {
                            UnityAds.UnityAdsShowError unityAdsShowError4 = UnityAds.UnityAdsShowError.INVALID_ARGUMENT;
                            String format = String.format(MESSAGE_PLACEMENT_NOT_LOADED, Arrays.copyOf(new Object[]{str}, 1));
                            Intrinsics.checkNotNullExpressionValue(format, "format(...)");
                            legacyShowUseCase$invoke$12.label = 4;
                            if (showError.invoke("placement_not_loaded", unityAdsShowError4, format, null, null, legacyShowUseCase$invoke$12) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            return Unit.INSTANCE;
                        }
                        UUID fromString = UUID.fromString(str2);
                        Intrinsics.checkNotNullExpressionValue(fromString, "fromString(...)");
                        byteString = ProtobufExtensionsKt.toByteString(fromString);
                        AdObject ad = this.adRepository.getAd(byteString);
                        this.adObject = ad;
                        if (ad == null) {
                            UnityAds.UnityAdsShowError unityAdsShowError5 = UnityAds.UnityAdsShowError.INTERNAL_ERROR;
                            String str3 = MESSAGE_NO_AD_OBJECT + str2;
                            legacyShowUseCase$invoke$12.label = 5;
                            if (showError.invoke("ad_object_not_found", unityAdsShowError5, str3, null, null, legacyShowUseCase$invoke$12) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            return Unit.INSTANCE;
                        }
                        if (ad.getState().getValue() == AdObjectState.EXPIRED) {
                            UnityAds.UnityAdsShowError unityAdsShowError6 = UnityAds.UnityAdsShowError.EXPIRED;
                            legacyShowUseCase$invoke$12.L$0 = byteString;
                            legacyShowUseCase$invoke$12.label = 6;
                            if (showError.invoke("ad_object_expired", unityAdsShowError6, MESSAGE_AD_OBJECT_EXPIRED, null, null, legacyShowUseCase$invoke$12) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            this.adRepository.removeAd(byteString);
                            return Unit.INSTANCE;
                        }
                        AdPlayer adPlayer = ad.getAdPlayer();
                        if (adPlayer != null && (scope = adPlayer.getScope()) != null && !CoroutineScopeKt.isActive(scope)) {
                            UnityAds.UnityAdsShowError unityAdsShowError7 = UnityAds.UnityAdsShowError.INTERNAL_ERROR;
                            legacyShowUseCase$invoke$12.label = 7;
                            if (showError.invoke("ad_player_scope_not_active", unityAdsShowError7, MESSAGE_AD_PLAYER_UNAVAILABLE, null, null, legacyShowUseCase$invoke$12) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            return Unit.INSTANCE;
                        }
                        boolean z = ad.getAdPlayer() instanceof EmbeddableAdPlayer;
                        if (!z && isFullscreenAdShowing) {
                            UnityAds.UnityAdsShowError unityAdsShowError8 = UnityAds.UnityAdsShowError.ALREADY_SHOWING;
                            legacyShowUseCase$invoke$12.label = 8;
                            if (showError.invoke("already_showing", unityAdsShowError8, MESSAGE_ALREADY_SHOWING, null, null, legacyShowUseCase$invoke$12) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            return Unit.INSTANCE;
                        }
                        if (this.sessionRepository.getNativeConfiguration().getFeatureFlags().getOpportunityIdPlacementValidation() && !Intrinsics.areEqual(ad.getPlacementId(), str)) {
                            UnityAds.UnityAdsShowError unityAdsShowError9 = UnityAds.UnityAdsShowError.INVALID_ARGUMENT;
                            legacyShowUseCase$invoke$12.label = 9;
                            if (showError.invoke("placement_validation", unityAdsShowError9, MSG_OPPORTUNITY_AND_PLACEMENT_NOT_MATCHING, null, null, legacyShowUseCase$invoke$12) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            return Unit.INSTANCE;
                        }
                        long showTimeoutMs = this.sessionRepository.getNativeConfiguration().getAdOperations().getShowTimeoutMs();
                        if (!z) {
                            isFullscreenAdShowing = true;
                        }
                        Flow m8234catch = FlowKt.m8234catch(FlowExtensionsKt.timeoutAfter$default(this.show.invoke(ad, unityAdsShowOptions), showTimeoutMs, false, new LegacyShowUseCase$invoke$2(this, ad, true, showError, str, null), 2, null), new LegacyShowUseCase$invoke$3(showError, z, null));
                        LegacyShowUseCase$invoke$4 legacyShowUseCase$invoke$4 = new LegacyShowUseCase$invoke$4(this, m8186markNowz9LOYto, str, listeners, unityAdsShowOptions, ad, showError);
                        legacyShowUseCase$invoke$12.I$0 = z ? 1 : 0;
                        legacyShowUseCase$invoke$12.label = 10;
                        if (m8234catch.collect(legacyShowUseCase$invoke$4, legacyShowUseCase$invoke$12) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        i = z ? 1 : 0;
                        if (i == 0) {
                            isFullscreenAdShowing = false;
                        }
                        return Unit.INSTANCE;
                    case 1:
                        ResultKt.throwOnFailure(obj);
                        return Unit.INSTANCE;
                    case 2:
                        ResultKt.throwOnFailure(obj);
                        return Unit.INSTANCE;
                    case 3:
                        ResultKt.throwOnFailure(obj);
                        return Unit.INSTANCE;
                    case 4:
                        ResultKt.throwOnFailure(obj);
                        return Unit.INSTANCE;
                    case 5:
                        ResultKt.throwOnFailure(obj);
                        return Unit.INSTANCE;
                    case 6:
                        byteString = (ByteString) legacyShowUseCase$invoke$12.L$0;
                        ResultKt.throwOnFailure(obj);
                        this.adRepository.removeAd(byteString);
                        return Unit.INSTANCE;
                    case 7:
                        ResultKt.throwOnFailure(obj);
                        return Unit.INSTANCE;
                    case 8:
                        ResultKt.throwOnFailure(obj);
                        return Unit.INSTANCE;
                    case 9:
                        ResultKt.throwOnFailure(obj);
                        return Unit.INSTANCE;
                    case 10:
                        i = legacyShowUseCase$invoke$12.I$0;
                        ResultKt.throwOnFailure(obj);
                        if (i == 0) {
                        }
                        return Unit.INSTANCE;
                    default:
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }
        }
        legacyShowUseCase$invoke$1 = new LegacyShowUseCase$invoke$1(this, continuation);
        legacyShowUseCase$invoke$12 = legacyShowUseCase$invoke$1;
        Object obj3 = legacyShowUseCase$invoke$12.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        switch (legacyShowUseCase$invoke$12.label) {
        }
    }

    public final void showReceivedReward(@NotNull TimeMark startTime, @NotNull final String placement, @NotNull final Listeners listeners) {
        Intrinsics.checkNotNullParameter(startTime, "startTime");
        Intrinsics.checkNotNullParameter(placement, "placement");
        Intrinsics.checkNotNullParameter(listeners, "listeners");
        this.logger.info("Rewarding ad " + getAdInfoString());
        this.hasStarted.setValue(Boolean.TRUE);
        SendDiagnosticEvent.DefaultImpls.invoke$default(this.sendDiagnosticEvent, DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_SHOW_REWARDED, Double.valueOf(TimeExtensionsKt.elapsedMillis(startTime)), (Map) null, (Map) null, this.adObject, (Integer) null, (ByteString) null, 108, (Object) null);
        this.safeCallbackInvoke.invoke(new Function0() { // from class: com.unity3d.ads.core.domain.LegacyShowUseCase$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function0
            /* renamed from: invoke */
            public final Object mo4828invoke() {
                Unit showReceivedReward$lambda$3;
                showReceivedReward$lambda$3 = LegacyShowUseCase.showReceivedReward$lambda$3(Listeners.this, placement);
                return showReceivedReward$lambda$3;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit showReceivedReward$lambda$3(Listeners listeners, String str) {
        listeners.onRewarded(str);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void bannerLeftApplication(TimeMark startTime, final String placement, final Listeners listeners) {
        this.logger.info("Left app while showing ad " + getAdInfoString());
        SendDiagnosticEvent.DefaultImpls.invoke$default(this.sendDiagnosticEvent, DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_SHOW_LEFT_APP, Double.valueOf(TimeExtensionsKt.elapsedMillis(startTime)), (Map) null, (Map) null, this.adObject, (Integer) null, (ByteString) null, 108, (Object) null);
        this.safeCallbackInvoke.invoke(new Function0() { // from class: com.unity3d.ads.core.domain.LegacyShowUseCase$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function0
            /* renamed from: invoke */
            public final Object mo4828invoke() {
                Unit bannerLeftApplication$lambda$4;
                bannerLeftApplication$lambda$4 = LegacyShowUseCase.bannerLeftApplication$lambda$4(Listeners.this, placement);
                return bannerLeftApplication$lambda$4;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit bannerLeftApplication$lambda$4(Listeners listeners, String str) {
        listeners.onLeftApplication(str);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void cancelTimeout(TimeMark startTime) {
        this.timeoutCancellationRequested.setValue(Boolean.TRUE);
        SendDiagnosticEvent.DefaultImpls.invoke$default(this.sendDiagnosticEvent, "native_show_cancel_timeout", Double.valueOf(TimeExtensionsKt.elapsedMillis(startTime)), (Map) null, (Map) null, this.adObject, (Integer) null, (ByteString) null, 108, (Object) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void showStarted(TimeMark startTime, final String placement, final Listeners listeners) {
        this.logger.info("Started showing ad " + getAdInfoString());
        this.hasStarted.setValue(Boolean.TRUE);
        SendDiagnosticEvent.DefaultImpls.invoke$default(this.sendDiagnosticEvent, DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_SHOW_WV_STARTED, Double.valueOf(TimeExtensionsKt.elapsedMillis(startTime)), (Map) null, (Map) null, this.adObject, (Integer) null, (ByteString) null, 108, (Object) null);
        this.safeCallbackInvoke.invoke(new Function0() { // from class: com.unity3d.ads.core.domain.LegacyShowUseCase$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function0
            /* renamed from: invoke */
            public final Object mo4828invoke() {
                Unit showStarted$lambda$6;
                showStarted$lambda$6 = LegacyShowUseCase.showStarted$lambda$6(Listeners.this, placement);
                return showStarted$lambda$6;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit showStarted$lambda$6(Listeners listeners, String str) {
        listeners.onStart(str);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void showClicked(TimeMark startTime, final String placement, final Listeners listeners) {
        this.logger.info("Clicked on ad " + getAdInfoString());
        SendDiagnosticEvent.DefaultImpls.invoke$default(this.sendDiagnosticEvent, DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_SHOW_CLICKED, Double.valueOf(TimeExtensionsKt.elapsedMillis(startTime)), (Map) null, (Map) null, this.adObject, (Integer) null, (ByteString) null, 108, (Object) null);
        this.safeCallbackInvoke.invoke(new Function0() { // from class: com.unity3d.ads.core.domain.LegacyShowUseCase$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            /* renamed from: invoke */
            public final Object mo4828invoke() {
                Unit showClicked$lambda$7;
                showClicked$lambda$7 = LegacyShowUseCase.showClicked$lambda$7(Listeners.this, placement);
                return showClicked$lambda$7;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit showClicked$lambda$7(Listeners listeners, String str) {
        listeners.onClick(str);
        return Unit.INSTANCE;
    }

    private final String getOpportunityId(UnityAdsShowOptions unityAdsShowOptions) throws IllegalArgumentException {
        Object opt;
        String obj;
        JSONObject data = unityAdsShowOptions.getData();
        if (data == null || (opt = data.opt("objectId")) == null || (obj = opt.toString()) == null) {
            return null;
        }
        return UUID.fromString(obj).toString();
    }

    private final void showStart(String opportunityId, UnityAdsShowOptions showOptions) {
        SendDiagnosticEvent.DefaultImpls.invoke$default(this.sendDiagnosticEvent, DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_SHOW_STARTED, (Double) null, MapsKt.mapOf(TuplesKt.to("new_api", String.valueOf((showOptions != null ? showOptions.showConfiguration : null) != null))), (Map) null, getTmpAdObject(opportunityId), (Integer) null, (ByteString) null, 106, (Object) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void showCompleted(TimeMark startTime, final String placement, final ShowStatus status, final Listeners listeners, String reason, String reasonDebug, UnityAdsShowOptions showOptions) {
        this.logger.info("Finished showing ad " + getAdInfoString());
        Map createMapBuilder = MapsKt.createMapBuilder();
        if (reason != null) {
        }
        if (reasonDebug != null) {
        }
        TuplesKt.to("new_api", String.valueOf((showOptions != null ? showOptions.showConfiguration : null) != null));
        SendDiagnosticEvent.DefaultImpls.invoke$default(this.sendDiagnosticEvent, DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_SHOW_SUCCESS_TIME, Double.valueOf(TimeExtensionsKt.elapsedMillis(startTime)), MapsKt.build(createMapBuilder), (Map) null, this.adObject, (Integer) null, (ByteString) null, 104, (Object) null);
        this.safeCallbackInvoke.invoke(new Function0() { // from class: com.unity3d.ads.core.domain.LegacyShowUseCase$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function0
            /* renamed from: invoke */
            public final Object mo4828invoke() {
                Unit showCompleted$lambda$12;
                showCompleted$lambda$12 = LegacyShowUseCase.showCompleted$lambda$12(Listeners.this, placement, status, this);
                return showCompleted$lambda$12;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit showCompleted$lambda$12(Listeners listeners, String str, ShowStatus showStatus, LegacyShowUseCase legacyShowUseCase) {
        NativeConfigurationOuterClass.ShowCompletionState defaultShowCompletionState = legacyShowUseCase.sessionRepository.getNativeConfiguration().getDefaultShowCompletionState();
        Intrinsics.checkNotNullExpressionValue(defaultShowCompletionState, "getDefaultShowCompletionState(...)");
        listeners.onComplete(str, ShowStatusExtensionsKt.toUnityAdsShowCompletionState(showStatus, defaultShowCompletionState));
        return Unit.INSTANCE;
    }

    private final Function6 showError(TimeMark startTime, String placement, String opportunityId, Listeners listeners, UnityAdsShowOptions showOptions) {
        return new LegacyShowUseCase$showError$1(this, opportunityId, startTime, showOptions, listeners, placement, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Map<String, String> getTags(String diagnosticReason, Integer code, String debugMessage, UnityAdsShowOptions showOptions) {
        Map<String, String> mutableMapOf = MapsKt.mutableMapOf(TuplesKt.to("operation", OperationType.SHOW.toString()), TuplesKt.to("reason", diagnosticReason), TuplesKt.to("new_api", String.valueOf((showOptions != null ? showOptions.showConfiguration : null) != null)));
        if (code != null) {
            mutableMapOf.put("reason_code", String.valueOf(code.intValue()));
        }
        if (debugMessage != null) {
            mutableMapOf.put("reason_debug", debugMessage);
        }
        return mutableMapOf;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final AdObject getTmpAdObject(String opportunityId) {
        UUID fromString = UUID.fromString(opportunityId);
        Intrinsics.checkNotNullExpressionValue(fromString, "fromString(...)");
        AdObject ad = this.adRepository.getAd(ProtobufExtensionsKt.toByteString(fromString));
        if (ad != null) {
            return ad;
        }
        SendDiagnosticEvent.Companion companion = SendDiagnosticEvent.INSTANCE;
        UUID fromString2 = UUID.fromString(opportunityId);
        Intrinsics.checkNotNullExpressionValue(fromString2, "fromString(...)");
        ByteString byteString = ProtobufExtensionsKt.toByteString(fromString2);
        String str = this.placement;
        if (str == null) {
            str = "";
        }
        return SendDiagnosticEvent.Companion.getTmpAdObjectForEventSending$default(companion, byteString, str, false, null, null, 28, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String getAdInfoString() {
        ByteString opportunityId;
        StringBuilder sb = new StringBuilder();
        sb.append("for placement ");
        AdObject adObject = this.adObject;
        UUID uuid = null;
        sb.append(adObject != null ? adObject.getPlacementId() : null);
        sb.append(" with instance id ");
        AdObject adObject2 = this.adObject;
        if (adObject2 != null && (opportunityId = adObject2.getOpportunityId()) != null) {
            uuid = ProtobufExtensionsKt.toUUID(opportunityId);
        }
        sb.append(uuid);
        return sb.toString();
    }
}
