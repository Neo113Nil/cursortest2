package com.unity3d.ads.core.data.repository;

import com.google.protobuf.ByteString;
import com.unity3d.ads.core.data.datasource.AndroidUnityInfoDataSource;
import com.unity3d.ads.core.data.datasource.ByteStringDataSource;
import com.unity3d.ads.core.data.model.AdObject;
import com.unity3d.ads.core.data.model.GatewayUrl;
import com.unity3d.ads.core.data.model.InitializationConfigurationInternal;
import com.unity3d.ads.core.data.model.InitializationState;
import com.unity3d.ads.core.data.model.SessionChange;
import com.unity3d.ads.core.data.model.TokenCounters;
import com.unity3d.ads.core.data.model.exception.InitializationException;
import com.unity3d.ads.core.domain.AndroidGetAdPlayerContext;
import com.unity3d.ads.core.domain.SendDiagnosticEvent;
import com.unity3d.ads.core.extensions.ProtobufExtensionsKt;
import com.unity3d.ads.datastore.ByteStringStoreOuterClass;
import com.unity3d.services.UnityAdsConstants;
import com.unity3d.services.core.properties.ClientProperties;
import com.unity3d.services.core.properties.SdkProperties;
import com.unity3d.services.core.properties.SessionIdReader;
import com.vungle.ads.internal.protos.Sdk;
import gatewayprotocol.v1.InitializationResponseOuterClass;
import gatewayprotocol.v1.NativeConfigurationOuterClass;
import gatewayprotocol.v1.SessionCountersKt;
import gatewayprotocol.v1.SessionCountersOuterClass;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__BuildersKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.SharedFlow;
import kotlinx.coroutines.flow.SharedFlowKt;
import kotlinx.coroutines.flow.StateFlowKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: AndroidSessionRepository.kt */
@Metadata(d1 = {"\u0000²\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u001d\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u001c\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001BQ\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0010¢\u0006\u0004\b\u0011\u0010\u0012J\b\u0010E\u001a\u00020FH\u0016J\b\u0010G\u001a\u00020FH\u0016J\b\u0010H\u001a\u00020FH\u0016J\b\u0010I\u001a\u00020FH\u0016J\b\u0010J\u001a\u00020FH\u0016J\b\u0010K\u001a\u00020FH\u0016J\u0010\u0010L\u001a\u00020F2\u0006\u0010M\u001a\u00020NH\u0016J\b\u0010O\u001a\u00020FH\u0016J\u0010\u0010P\u001a\u00020F2\u0006\u0010Q\u001a\u00020NH\u0016J\u0010\u0010R\u001a\u00020F2\u0006\u0010Q\u001a\u00020NH\u0016J\b\u0010S\u001a\u00020FH\u0016J\b\u0010T\u001a\u00020FH\u0016J\b\u0010U\u001a\u00020FH\u0016J\b\u0010V\u001a\u00020FH\u0016J\b\u0010W\u001a\u00020FH\u0016J\b\u0010X\u001a\u00020FH\u0016J\b\u0010Y\u001a\u00020FH\u0016J\u0010\u0010\u0088\u0001\u001a\u00020)H\u0096@¢\u0006\u0003\u0010\u0089\u0001J\u0018\u0010\u008a\u0001\u001a\u00020F2\u0006\u0010\"\u001a\u00020)H\u0096@¢\u0006\u0003\u0010\u008b\u0001J\u0010\u0010\u008c\u0001\u001a\u00020)H\u0096@¢\u0006\u0003\u0010\u0089\u0001J\u0018\u0010\u008d\u0001\u001a\u00020F2\u0006\u0010\"\u001a\u00020)H\u0096@¢\u0006\u0003\u0010\u008b\u0001J\u0010\u0010\u008e\u0001\u001a\u00020)H\u0096@¢\u0006\u0003\u0010\u0089\u0001J\u0018\u0010\u008f\u0001\u001a\u00020F2\u0006\u0010\"\u001a\u00020)H\u0096@¢\u0006\u0003\u0010\u008b\u0001J\u0010\u0010\u0096\u0001\u001a\u00020FH\u0096@¢\u0006\u0003\u0010\u0089\u0001R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\n0\u0014X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00160\u0014X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\n0\u0018X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001aX\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001dX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0016\u0010 \u001a\n\u0012\u0006\u0012\u0004\u0018\u00010!0\u0014X\u0082\u000e¢\u0006\u0002\n\u0000R(\u0010#\u001a\u0004\u0018\u00010!2\b\u0010\"\u001a\u0004\u0018\u00010!8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'R\u0014\u0010(\u001a\b\u0012\u0004\u0012\u00020)0\u0014X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010*\u001a\u00020)8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b+\u0010,R\u0014\u0010-\u001a\b\u0012\u0004\u0012\u00020\u00160\u0014X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010.\u001a\u00020\u00168VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b.\u0010/R\u0014\u00100\u001a\b\u0012\u0004\u0012\u0002010\u0014X\u0082\u0004¢\u0006\u0002\n\u0000R$\u00102\u001a\u0002012\u0006\u0010\"\u001a\u0002018V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b3\u00104\"\u0004\b5\u00106R\u0014\u00107\u001a\b\u0012\u0004\u0012\u0002080\u0014X\u0082\u0004¢\u0006\u0002\n\u0000R$\u00109\u001a\u0002082\u0006\u0010\"\u001a\u0002088V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b:\u0010;\"\u0004\b<\u0010=R\u0016\u0010>\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010?0\u0014X\u0082\u0004¢\u0006\u0002\n\u0000R(\u0010@\u001a\u0004\u0018\u00010?2\b\u0010\"\u001a\u0004\u0018\u00010?8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\bA\u0010B\"\u0004\bC\u0010DR\u0014\u0010Z\u001a\b\u0012\u0004\u0012\u00020)0\u0014X\u0082\u0004¢\u0006\u0002\n\u0000R$\u0010[\u001a\u00020)2\u0006\u0010\"\u001a\u00020)8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b\\\u0010,\"\u0004\b]\u0010^R\u0014\u0010_\u001a\b\u0012\u0004\u0012\u00020)0\u0014X\u0082\u0004¢\u0006\u0002\n\u0000R$\u0010`\u001a\u00020)2\u0006\u0010\"\u001a\u00020)8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\ba\u0010,\"\u0004\bb\u0010^R$\u0010c\u001a\u00020\n2\u0006\u0010\"\u001a\u00020\n8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\bd\u0010e\"\u0004\bf\u0010gR\u0014\u0010h\u001a\b\u0012\u0004\u0012\u00020!0\u0014X\u0082\u0004¢\u0006\u0002\n\u0000R$\u0010\u000f\u001a\u00020!2\u0006\u0010\"\u001a\u00020!8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\bi\u0010%\"\u0004\bj\u0010'R\u0014\u0010k\u001a\b\u0012\u0004\u0012\u00020l0\u0014X\u0082\u0004¢\u0006\u0002\n\u0000R$\u0010m\u001a\u00020l2\u0006\u0010\"\u001a\u00020l8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\bn\u0010o\"\u0004\bp\u0010qR\u001a\u0010r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020t0s0\u0014X\u0082\u0004¢\u0006\u0002\n\u0000R0\u0010u\u001a\b\u0012\u0004\u0012\u00020t0s2\f\u0010\"\u001a\b\u0012\u0004\u0012\u00020t0s8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\bv\u0010w\"\u0004\bx\u0010yR\u001a\u0010z\u001a\b\u0012\u0004\u0012\u00020l0\u00188VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b{\u0010|R\u0014\u0010}\u001a\u00020\u00168VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b}\u0010/R\u0014\u0010~\u001a\u00020\u00168VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b~\u0010/R\u0014\u0010\u007f\u001a\u00020\u00168VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u007f\u0010/R\u0018\u0010\u0080\u0001\u001a\u00030\u0081\u00018VX\u0096\u0004¢\u0006\b\u001a\u0006\b\u0082\u0001\u0010\u0083\u0001R\u0015\u0010\u0084\u0001\u001a\b\u0012\u0004\u0012\u00020N0\u0014X\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\u0085\u0001\u001a\u00020N8VX\u0096\u0004¢\u0006\b\u001a\u0006\b\u0086\u0001\u0010\u0087\u0001R\u0015\u0010\u0090\u0001\u001a\b\u0012\u0004\u0012\u00020\u00160\u0014X\u0082\u0004¢\u0006\u0002\n\u0000R(\u0010\u0091\u0001\u001a\u00020\u00162\u0006\u0010\"\u001a\u00020\u00168V@VX\u0096\u000e¢\u0006\u000f\u001a\u0005\b\u0092\u0001\u0010/\"\u0006\b\u0093\u0001\u0010\u0094\u0001R\u0016\u0010\u0095\u0001\u001a\u00020\u00168VX\u0096\u0004¢\u0006\u0007\u001a\u0005\b\u0095\u0001\u0010/R\u0015\u0010\u0097\u0001\u001a\b\u0012\u0004\u0012\u00020\u00160\u0014X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0098\u0001\u001a\u00020\u00168VX\u0096\u0004¢\u0006\u0007\u001a\u0005\b\u0098\u0001\u0010/R\u0018\u0010\u0099\u0001\u001a\u0004\u0018\u00010!8VX\u0096\u0004¢\u0006\u0007\u001a\u0005\b\u009a\u0001\u0010%R\u0018\u0010\u009b\u0001\u001a\u0004\u0018\u00010!8VX\u0096\u0004¢\u0006\u0007\u001a\u0005\b\u009c\u0001\u0010%R\"\u0010\u009d\u0001\u001a\u0005\u0018\u00010\u009e\u0001X\u0096\u000e¢\u0006\u0012\n\u0000\u001a\u0006\b\u009f\u0001\u0010 \u0001\"\u0006\b¡\u0001\u0010¢\u0001¨\u0006£\u0001"}, d2 = {"Lcom/unity3d/ads/core/data/repository/AndroidSessionRepository;", "Lcom/unity3d/ads/core/data/repository/SessionRepository;", "gatewayCacheDataSource", "Lcom/unity3d/ads/core/data/datasource/ByteStringDataSource;", "privacyDataSource", "fsmDataSource", "nativeConfigDataSource", "unityInfoDataSource", "Lcom/unity3d/ads/core/data/datasource/AndroidUnityInfoDataSource;", "defaultNativeConfiguration", "Lgatewayprotocol/v1/NativeConfigurationOuterClass$NativeConfiguration;", "dispatcher", "Lkotlinx/coroutines/CoroutineDispatcher;", "sendDiagnosticEvent", "Lcom/unity3d/ads/core/domain/SendDiagnosticEvent;", "gatewayUrl", "Lcom/unity3d/ads/core/data/model/GatewayUrl;", "<init>", "(Lcom/unity3d/ads/core/data/datasource/ByteStringDataSource;Lcom/unity3d/ads/core/data/datasource/ByteStringDataSource;Lcom/unity3d/ads/core/data/datasource/ByteStringDataSource;Lcom/unity3d/ads/core/data/datasource/ByteStringDataSource;Lcom/unity3d/ads/core/data/datasource/AndroidUnityInfoDataSource;Lgatewayprotocol/v1/NativeConfigurationOuterClass$NativeConfiguration;Lkotlinx/coroutines/CoroutineDispatcher;Lcom/unity3d/ads/core/domain/SendDiagnosticEvent;Ljava/lang/String;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "_sdkConfiguration", "Lkotlinx/coroutines/flow/MutableStateFlow;", "isInit", "", "persistedNativeConfiguration", "Lkotlinx/coroutines/flow/Flow;", "_onChange", "Lkotlinx/coroutines/flow/MutableSharedFlow;", "Lcom/unity3d/ads/core/data/model/SessionChange;", "onChange", "Lkotlinx/coroutines/flow/SharedFlow;", "getOnChange", "()Lkotlinx/coroutines/flow/SharedFlow;", "_gameId", "", "value", AndroidGetAdPlayerContext.KEY_GAME_ID, "getGameId", "()Ljava/lang/String;", "setGameId", "(Ljava/lang/String;)V", "_sessionId", "Lcom/google/protobuf/ByteString;", "sessionId", "getSessionId", "()Lcom/google/protobuf/ByteString;", "_isTestModeEnabled", "isTestModeEnabled", "()Z", "_sessionCounters", "Lgatewayprotocol/v1/SessionCountersOuterClass$SessionCounters;", "sessionCounters", "getSessionCounters", "()Lgatewayprotocol/v1/SessionCountersOuterClass$SessionCounters;", "setSessionCounters", "(Lgatewayprotocol/v1/SessionCountersOuterClass$SessionCounters;)V", "_tokenCounters", "Lcom/unity3d/ads/core/data/model/TokenCounters;", "tokenCounters", "getTokenCounters", "()Lcom/unity3d/ads/core/data/model/TokenCounters;", "setTokenCounters", "(Lcom/unity3d/ads/core/data/model/TokenCounters;)V", "_initializationError", "Lcom/unity3d/ads/core/data/model/exception/InitializationException;", "initializationError", "getInitializationError", "()Lcom/unity3d/ads/core/data/model/exception/InitializationException;", "setInitializationError", "(Lcom/unity3d/ads/core/data/model/exception/InitializationException;)V", "incrementLoadRequestCount", "", "incrementLoadRequestAdmCount", "incrementBannerLoadRequestCount", "incrementBannerLoadRequestAdmCount", "incrementBannerImpressionCount", "incrementGlobalAdsFocusChangeCount", "addTimeToGlobalAdsFocusTime", "timeMs", "", "incrementFocusChangeCount", "setInitializationLatency", "ms", "setLastLoadLatency", "incrementAllErrorsCount", "incrementCacheTimeoutErrorsCount", "incrementSuccessCount", "incrementTokenSequenceNumber", "incrementTokenWinsCount", "incrementTokenStartsCount", "resetTokenCounters", "_sessionToken", "sessionToken", "getSessionToken", "setSessionToken", "(Lcom/google/protobuf/ByteString;)V", "_currentState", "gatewayState", "getGatewayState", "setGatewayState", "nativeConfiguration", "getNativeConfiguration", "()Lgatewayprotocol/v1/NativeConfigurationOuterClass$NativeConfiguration;", "setNativeConfiguration", "(Lgatewayprotocol/v1/NativeConfigurationOuterClass$NativeConfiguration;)V", "_gatewayUrl", "getGatewayUrl", "setGatewayUrl", "_initializationState", "Lcom/unity3d/ads/core/data/model/InitializationState;", "initializationState", "getInitializationState", "()Lcom/unity3d/ads/core/data/model/InitializationState;", "setInitializationState", "(Lcom/unity3d/ads/core/data/model/InitializationState;)V", "_requestUrlOverride", "", "Lgatewayprotocol/v1/InitializationResponseOuterClass$RequestUrlOverride;", "requestUrlOverrides", "getRequestUrlOverrides", "()Ljava/util/List;", "setRequestUrlOverrides", "(Ljava/util/List;)V", "observeInitializationState", "getObserveInitializationState", "()Lkotlinx/coroutines/flow/Flow;", "isSdkInitialized", "isNativeConfigReady", "isDiagnosticsEnabled", "featureFlags", "Lgatewayprotocol/v1/NativeConfigurationOuterClass$FeatureFlags;", "getFeatureFlags", "()Lgatewayprotocol/v1/NativeConfigurationOuterClass$FeatureFlags;", "_headerBiddingTokenCounter", "headerBiddingTokenCounter", "getHeaderBiddingTokenCounter", "()I", "getGatewayCache", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "setGatewayCache", "(Lcom/google/protobuf/ByteString;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getPrivacy", "setPrivacy", "getPrivacyFsm", "setPrivacyFsm", "_shouldInitialize", "shouldInitialize", "getShouldInitialize", "setShouldInitialize", "(Z)V", "isOmEnabled", "persistNativeConfiguration", "_isFirstInitAttempt", "isFirstInitAttempt", "unityInstallationId", "getUnityInstallationId", "unityMegaSessionId", "getUnityMegaSessionId", "initializationConfiguration", "Lcom/unity3d/ads/core/data/model/InitializationConfigurationInternal;", "getInitializationConfiguration", "()Lcom/unity3d/ads/core/data/model/InitializationConfigurationInternal;", "setInitializationConfiguration", "(Lcom/unity3d/ads/core/data/model/InitializationConfigurationInternal;)V", "unity-ads_defaultRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class AndroidSessionRepository implements SessionRepository {

    @NotNull
    private final MutableStateFlow _currentState;

    @NotNull
    private MutableStateFlow _gameId;

    @NotNull
    private final MutableStateFlow _gatewayUrl;

    @NotNull
    private final MutableStateFlow _headerBiddingTokenCounter;

    @NotNull
    private final MutableStateFlow _initializationError;

    @NotNull
    private final MutableStateFlow _initializationState;

    @NotNull
    private final MutableStateFlow _isFirstInitAttempt;

    @NotNull
    private final MutableStateFlow _isTestModeEnabled;

    @NotNull
    private MutableSharedFlow _onChange;

    @NotNull
    private final MutableStateFlow _requestUrlOverride;

    @NotNull
    private final MutableStateFlow _sdkConfiguration;

    @NotNull
    private final MutableStateFlow _sessionCounters;

    @NotNull
    private final MutableStateFlow _sessionId;

    @NotNull
    private final MutableStateFlow _sessionToken;

    @NotNull
    private final MutableStateFlow _shouldInitialize;

    @NotNull
    private final MutableStateFlow _tokenCounters;

    @NotNull
    private final ByteStringDataSource fsmDataSource;

    @NotNull
    private final ByteStringDataSource gatewayCacheDataSource;

    @Nullable
    private InitializationConfigurationInternal initializationConfiguration;

    @NotNull
    private final MutableStateFlow isInit;

    @NotNull
    private final ByteStringDataSource nativeConfigDataSource;

    @NotNull
    private final SharedFlow onChange;

    @NotNull
    private final Flow persistedNativeConfiguration;

    @NotNull
    private final ByteStringDataSource privacyDataSource;

    @NotNull
    private final AndroidUnityInfoDataSource unityInfoDataSource;

    public /* synthetic */ AndroidSessionRepository(ByteStringDataSource byteStringDataSource, ByteStringDataSource byteStringDataSource2, ByteStringDataSource byteStringDataSource3, ByteStringDataSource byteStringDataSource4, AndroidUnityInfoDataSource androidUnityInfoDataSource, NativeConfigurationOuterClass.NativeConfiguration nativeConfiguration, CoroutineDispatcher coroutineDispatcher, SendDiagnosticEvent sendDiagnosticEvent, String str, DefaultConstructorMarker defaultConstructorMarker) {
        this(byteStringDataSource, byteStringDataSource2, byteStringDataSource3, byteStringDataSource4, androidUnityInfoDataSource, nativeConfiguration, coroutineDispatcher, sendDiagnosticEvent, str);
    }

    private AndroidSessionRepository(ByteStringDataSource gatewayCacheDataSource, ByteStringDataSource privacyDataSource, ByteStringDataSource fsmDataSource, ByteStringDataSource nativeConfigDataSource, AndroidUnityInfoDataSource unityInfoDataSource, NativeConfigurationOuterClass.NativeConfiguration defaultNativeConfiguration, CoroutineDispatcher dispatcher, SendDiagnosticEvent sendDiagnosticEvent, String gatewayUrl) {
        Intrinsics.checkNotNullParameter(gatewayCacheDataSource, "gatewayCacheDataSource");
        Intrinsics.checkNotNullParameter(privacyDataSource, "privacyDataSource");
        Intrinsics.checkNotNullParameter(fsmDataSource, "fsmDataSource");
        Intrinsics.checkNotNullParameter(nativeConfigDataSource, "nativeConfigDataSource");
        Intrinsics.checkNotNullParameter(unityInfoDataSource, "unityInfoDataSource");
        Intrinsics.checkNotNullParameter(defaultNativeConfiguration, "defaultNativeConfiguration");
        Intrinsics.checkNotNullParameter(dispatcher, "dispatcher");
        Intrinsics.checkNotNullParameter(sendDiagnosticEvent, "sendDiagnosticEvent");
        Intrinsics.checkNotNullParameter(gatewayUrl, "gatewayUrl");
        this.gatewayCacheDataSource = gatewayCacheDataSource;
        this.privacyDataSource = privacyDataSource;
        this.fsmDataSource = fsmDataSource;
        this.nativeConfigDataSource = nativeConfigDataSource;
        this.unityInfoDataSource = unityInfoDataSource;
        MutableStateFlow MutableStateFlow = StateFlowKt.MutableStateFlow(defaultNativeConfiguration);
        this._sdkConfiguration = MutableStateFlow;
        MutableStateFlow MutableStateFlow2 = StateFlowKt.MutableStateFlow(Boolean.FALSE);
        this.isInit = MutableStateFlow2;
        BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.CoroutineScope(dispatcher), null, null, new AnonymousClass1(sendDiagnosticEvent, null), 3, null);
        final Flow flowCombine = FlowKt.flowCombine(MutableStateFlow, MutableStateFlow2, new AndroidSessionRepository$persistedNativeConfiguration$1(null));
        final Flow flow = new Flow() { // from class: com.unity3d.ads.core.data.repository.AndroidSessionRepository$special$$inlined$filter$1

            /* compiled from: Emitters.kt */
            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            /* renamed from: com.unity3d.ads.core.data.repository.AndroidSessionRepository$special$$inlined$filter$1$2, reason: invalid class name */
            public static final class AnonymousClass2<T> implements FlowCollector {
                final /* synthetic */ FlowCollector $this_unsafeFlow;

                @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
                @DebugMetadata(c = "com.unity3d.ads.core.data.repository.AndroidSessionRepository$special$$inlined$filter$1$2", f = "AndroidSessionRepository.kt", l = {50}, m = "emit")
                /* renamed from: com.unity3d.ads.core.data.repository.AndroidSessionRepository$special$$inlined$filter$1$2$1, reason: invalid class name */
                public static final class AnonymousClass1 extends ContinuationImpl {
                    Object L$0;
                    Object L$1;
                    int label;
                    /* synthetic */ Object result;

                    public AnonymousClass1(Continuation continuation) {
                        super(continuation);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object invokeSuspend(Object obj) {
                        this.result = obj;
                        this.label |= Integer.MIN_VALUE;
                        return AnonymousClass2.this.emit(null, this);
                    }
                }

                public AnonymousClass2(FlowCollector flowCollector) {
                    this.$this_unsafeFlow = flowCollector;
                }

                /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
                /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
                @Override // kotlinx.coroutines.flow.FlowCollector
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object emit(Object obj, Continuation continuation) {
                    AnonymousClass1 anonymousClass1;
                    int i;
                    if (continuation instanceof AnonymousClass1) {
                        anonymousClass1 = (AnonymousClass1) continuation;
                        int i2 = anonymousClass1.label;
                        if ((i2 & Integer.MIN_VALUE) != 0) {
                            anonymousClass1.label = i2 - Integer.MIN_VALUE;
                            Object obj2 = anonymousClass1.result;
                            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                            i = anonymousClass1.label;
                            if (i != 0) {
                                ResultKt.throwOnFailure(obj2);
                                FlowCollector flowCollector = this.$this_unsafeFlow;
                                if (((Boolean) ((Pair) obj).getSecond()).booleanValue()) {
                                    anonymousClass1.label = 1;
                                    if (flowCollector.emit(obj, anonymousClass1) == coroutine_suspended) {
                                        return coroutine_suspended;
                                    }
                                }
                            } else {
                                if (i != 1) {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                ResultKt.throwOnFailure(obj2);
                            }
                            return Unit.INSTANCE;
                        }
                    }
                    anonymousClass1 = new AnonymousClass1(continuation);
                    Object obj22 = anonymousClass1.result;
                    Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = anonymousClass1.label;
                    if (i != 0) {
                    }
                    return Unit.INSTANCE;
                }
            }

            @Override // kotlinx.coroutines.flow.Flow
            public Object collect(FlowCollector flowCollector, Continuation continuation) {
                Object collect = Flow.this.collect(new AnonymousClass2(flowCollector), continuation);
                return collect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? collect : Unit.INSTANCE;
            }
        };
        this.persistedNativeConfiguration = new Flow() { // from class: com.unity3d.ads.core.data.repository.AndroidSessionRepository$special$$inlined$map$1

            /* compiled from: Emitters.kt */
            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            /* renamed from: com.unity3d.ads.core.data.repository.AndroidSessionRepository$special$$inlined$map$1$2, reason: invalid class name */
            public static final class AnonymousClass2<T> implements FlowCollector {
                final /* synthetic */ FlowCollector $this_unsafeFlow;

                @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
                @DebugMetadata(c = "com.unity3d.ads.core.data.repository.AndroidSessionRepository$special$$inlined$map$1$2", f = "AndroidSessionRepository.kt", l = {50}, m = "emit")
                /* renamed from: com.unity3d.ads.core.data.repository.AndroidSessionRepository$special$$inlined$map$1$2$1, reason: invalid class name */
                public static final class AnonymousClass1 extends ContinuationImpl {
                    Object L$0;
                    int label;
                    /* synthetic */ Object result;

                    public AnonymousClass1(Continuation continuation) {
                        super(continuation);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object invokeSuspend(Object obj) {
                        this.result = obj;
                        this.label |= Integer.MIN_VALUE;
                        return AnonymousClass2.this.emit(null, this);
                    }
                }

                public AnonymousClass2(FlowCollector flowCollector) {
                    this.$this_unsafeFlow = flowCollector;
                }

                /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
                /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
                @Override // kotlinx.coroutines.flow.FlowCollector
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object emit(Object obj, Continuation continuation) {
                    AnonymousClass1 anonymousClass1;
                    int i;
                    if (continuation instanceof AnonymousClass1) {
                        anonymousClass1 = (AnonymousClass1) continuation;
                        int i2 = anonymousClass1.label;
                        if ((i2 & Integer.MIN_VALUE) != 0) {
                            anonymousClass1.label = i2 - Integer.MIN_VALUE;
                            Object obj2 = anonymousClass1.result;
                            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                            i = anonymousClass1.label;
                            if (i != 0) {
                                ResultKt.throwOnFailure(obj2);
                                FlowCollector flowCollector = this.$this_unsafeFlow;
                                Object first = ((Pair) obj).getFirst();
                                anonymousClass1.label = 1;
                                if (flowCollector.emit(first, anonymousClass1) == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                            } else {
                                if (i != 1) {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                ResultKt.throwOnFailure(obj2);
                            }
                            return Unit.INSTANCE;
                        }
                    }
                    anonymousClass1 = new AnonymousClass1(continuation);
                    Object obj22 = anonymousClass1.result;
                    Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = anonymousClass1.label;
                    if (i != 0) {
                    }
                    return Unit.INSTANCE;
                }
            }

            @Override // kotlinx.coroutines.flow.Flow
            public Object collect(FlowCollector flowCollector, Continuation continuation) {
                Object collect = Flow.this.collect(new AnonymousClass2(flowCollector), continuation);
                return collect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? collect : Unit.INSTANCE;
            }
        };
        MutableSharedFlow MutableSharedFlow$default = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
        this._onChange = MutableSharedFlow$default;
        this.onChange = FlowKt.asSharedFlow(MutableSharedFlow$default);
        String gameId = ClientProperties.getGameId();
        this._gameId = StateFlowKt.MutableStateFlow(gameId == null ? null : gameId);
        UUID fromString = UUID.fromString(SessionIdReader.INSTANCE.getSessionId());
        Intrinsics.checkNotNullExpressionValue(fromString, "fromString(...)");
        this._sessionId = StateFlowKt.MutableStateFlow(ProtobufExtensionsKt.toByteString(fromString));
        this._isTestModeEnabled = StateFlowKt.MutableStateFlow(Boolean.valueOf(SdkProperties.isTestMode()));
        this._sessionCounters = StateFlowKt.MutableStateFlow(SessionCountersOuterClass.SessionCounters.newBuilder().build());
        this._tokenCounters = StateFlowKt.MutableStateFlow(new TokenCounters(0, 0, 0));
        this._initializationError = StateFlowKt.MutableStateFlow(null);
        ByteString byteString = ByteString.EMPTY;
        this._sessionToken = StateFlowKt.MutableStateFlow(byteString);
        this._currentState = StateFlowKt.MutableStateFlow(byteString);
        this._gatewayUrl = StateFlowKt.MutableStateFlow(gatewayUrl);
        this._initializationState = StateFlowKt.MutableStateFlow(InitializationState.NOT_INITIALIZED);
        this._requestUrlOverride = StateFlowKt.MutableStateFlow(CollectionsKt.emptyList());
        this._headerBiddingTokenCounter = StateFlowKt.MutableStateFlow(0);
        Boolean bool = Boolean.TRUE;
        this._shouldInitialize = StateFlowKt.MutableStateFlow(bool);
        this._isFirstInitAttempt = StateFlowKt.MutableStateFlow(bool);
    }

    public /* synthetic */ AndroidSessionRepository(ByteStringDataSource byteStringDataSource, ByteStringDataSource byteStringDataSource2, ByteStringDataSource byteStringDataSource3, ByteStringDataSource byteStringDataSource4, AndroidUnityInfoDataSource androidUnityInfoDataSource, NativeConfigurationOuterClass.NativeConfiguration nativeConfiguration, CoroutineDispatcher coroutineDispatcher, SendDiagnosticEvent sendDiagnosticEvent, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(byteStringDataSource, byteStringDataSource2, byteStringDataSource3, byteStringDataSource4, androidUnityInfoDataSource, nativeConfiguration, coroutineDispatcher, sendDiagnosticEvent, (i & 256) != 0 ? GatewayUrl.m6904constructorimpl(UnityAdsConstants.DefaultUrls.GATEWAY_URL) : str, null);
    }

    /* compiled from: AndroidSessionRepository.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.unity3d.ads.core.data.repository.AndroidSessionRepository$1", f = "AndroidSessionRepository.kt", l = {58}, m = "invokeSuspend")
    /* renamed from: com.unity3d.ads.core.data.repository.AndroidSessionRepository$1, reason: invalid class name */
    static final class AnonymousClass1 extends SuspendLambda implements Function2 {
        final /* synthetic */ SendDiagnosticEvent $sendDiagnosticEvent;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(SendDiagnosticEvent sendDiagnosticEvent, Continuation continuation) {
            super(2, continuation);
            this.$sendDiagnosticEvent = sendDiagnosticEvent;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return AndroidSessionRepository.this.new AnonymousClass1(this.$sendDiagnosticEvent, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            try {
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    ByteStringDataSource byteStringDataSource = AndroidSessionRepository.this.nativeConfigDataSource;
                    this.label = 1;
                    obj = byteStringDataSource.get(this);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                ByteString data = ((ByteStringStoreOuterClass.ByteStringStore) obj).getData();
                if (!data.isEmpty()) {
                    MutableStateFlow mutableStateFlow = AndroidSessionRepository.this._sdkConfiguration;
                    NativeConfigurationOuterClass.NativeConfiguration parseFrom = NativeConfigurationOuterClass.NativeConfiguration.parseFrom(data);
                    Intrinsics.checkNotNullExpressionValue(parseFrom, "parseFrom(...)");
                    mutableStateFlow.setValue(parseFrom);
                }
            } catch (Exception e) {
                SendDiagnosticEvent sendDiagnosticEvent = this.$sendDiagnosticEvent;
                String message = e.getMessage();
                if (message == null) {
                    message = "unknown";
                }
                SendDiagnosticEvent.DefaultImpls.invoke$default(sendDiagnosticEvent, "native_initialize_missed_native_parsing", (Double) null, MapsKt.mapOf(TuplesKt.to("debugReason", message)), (Map) null, (AdObject) null, (Integer) null, (ByteString) null, Sdk.SDKError.Reason.INVALID_ADS_ENDPOINT_VALUE, (Object) null);
            }
            AndroidSessionRepository.this.isInit.setValue(Boxing.boxBoolean(true));
            return Unit.INSTANCE;
        }
    }

    @Override // com.unity3d.ads.core.data.repository.SessionRepository
    @NotNull
    public SharedFlow getOnChange() {
        return this.onChange;
    }

    @Override // com.unity3d.ads.core.data.repository.SessionRepository
    @Nullable
    public String getGameId() {
        Object value;
        String gameId;
        MutableStateFlow mutableStateFlow = this._gameId;
        do {
            value = mutableStateFlow.getValue();
            gameId = ClientProperties.getGameId();
            if (gameId == null) {
                gameId = null;
            }
        } while (!mutableStateFlow.compareAndSet(value, gameId));
        return gameId;
    }

    @Override // com.unity3d.ads.core.data.repository.SessionRepository
    public void setGameId(@Nullable String str) {
        Object value;
        MutableStateFlow mutableStateFlow = this._gameId;
        do {
            value = mutableStateFlow.getValue();
            ClientProperties.setGameId(str);
        } while (!mutableStateFlow.compareAndSet(value, str));
    }

    @Override // com.unity3d.ads.core.data.repository.SessionRepository
    @NotNull
    public ByteString getSessionId() {
        return (ByteString) this._sessionId.getValue();
    }

    @Override // com.unity3d.ads.core.data.repository.SessionRepository
    public boolean isTestModeEnabled() {
        Object value;
        boolean isTestMode;
        MutableStateFlow mutableStateFlow = this._isTestModeEnabled;
        do {
            value = mutableStateFlow.getValue();
            ((Boolean) value).booleanValue();
            isTestMode = SdkProperties.isTestMode();
        } while (!mutableStateFlow.compareAndSet(value, Boolean.valueOf(isTestMode)));
        return isTestMode;
    }

    @Override // com.unity3d.ads.core.data.repository.SessionRepository
    @NotNull
    public SessionCountersOuterClass.SessionCounters getSessionCounters() {
        return (SessionCountersOuterClass.SessionCounters) this._sessionCounters.getValue();
    }

    @Override // com.unity3d.ads.core.data.repository.SessionRepository
    public void setSessionCounters(@NotNull SessionCountersOuterClass.SessionCounters value) {
        Object value2;
        Intrinsics.checkNotNullParameter(value, "value");
        MutableStateFlow mutableStateFlow = this._sessionCounters;
        do {
            value2 = mutableStateFlow.getValue();
        } while (!mutableStateFlow.compareAndSet(value2, value));
    }

    @Override // com.unity3d.ads.core.data.repository.SessionRepository
    @NotNull
    public TokenCounters getTokenCounters() {
        return (TokenCounters) this._tokenCounters.getValue();
    }

    @Override // com.unity3d.ads.core.data.repository.SessionRepository
    public void setTokenCounters(@NotNull TokenCounters value) {
        Object value2;
        Intrinsics.checkNotNullParameter(value, "value");
        MutableStateFlow mutableStateFlow = this._tokenCounters;
        do {
            value2 = mutableStateFlow.getValue();
        } while (!mutableStateFlow.compareAndSet(value2, value));
    }

    @Override // com.unity3d.ads.core.data.repository.SessionRepository
    @Nullable
    public InitializationException getInitializationError() {
        return (InitializationException) this._initializationError.getValue();
    }

    @Override // com.unity3d.ads.core.data.repository.SessionRepository
    public void setInitializationError(@Nullable InitializationException initializationException) {
        Object value;
        MutableStateFlow mutableStateFlow = this._initializationError;
        do {
            value = mutableStateFlow.getValue();
        } while (!mutableStateFlow.compareAndSet(value, initializationException));
    }

    @Override // com.unity3d.ads.core.data.repository.SessionRepository
    public void incrementLoadRequestCount() {
        Object value;
        SessionCountersKt.Dsl _create;
        MutableStateFlow mutableStateFlow = this._sessionCounters;
        do {
            value = mutableStateFlow.getValue();
            SessionCountersKt.Dsl.Companion companion = SessionCountersKt.Dsl.INSTANCE;
            SessionCountersOuterClass.SessionCounters.Builder builder = ((SessionCountersOuterClass.SessionCounters) value).toBuilder();
            Intrinsics.checkNotNullExpressionValue(builder, "toBuilder(...)");
            _create = companion._create(builder);
            _create.setLoadRequests(_create.getLoadRequests() + 1);
        } while (!mutableStateFlow.compareAndSet(value, _create._build()));
    }

    @Override // com.unity3d.ads.core.data.repository.SessionRepository
    public void incrementLoadRequestAdmCount() {
        Object value;
        SessionCountersKt.Dsl _create;
        MutableStateFlow mutableStateFlow = this._sessionCounters;
        do {
            value = mutableStateFlow.getValue();
            SessionCountersKt.Dsl.Companion companion = SessionCountersKt.Dsl.INSTANCE;
            SessionCountersOuterClass.SessionCounters.Builder builder = ((SessionCountersOuterClass.SessionCounters) value).toBuilder();
            Intrinsics.checkNotNullExpressionValue(builder, "toBuilder(...)");
            _create = companion._create(builder);
            _create.setLoadRequestsAdm(_create.getLoadRequestsAdm() + 1);
        } while (!mutableStateFlow.compareAndSet(value, _create._build()));
    }

    @Override // com.unity3d.ads.core.data.repository.SessionRepository
    public void incrementBannerLoadRequestCount() {
        Object value;
        SessionCountersKt.Dsl _create;
        MutableStateFlow mutableStateFlow = this._sessionCounters;
        do {
            value = mutableStateFlow.getValue();
            SessionCountersKt.Dsl.Companion companion = SessionCountersKt.Dsl.INSTANCE;
            SessionCountersOuterClass.SessionCounters.Builder builder = ((SessionCountersOuterClass.SessionCounters) value).toBuilder();
            Intrinsics.checkNotNullExpressionValue(builder, "toBuilder(...)");
            _create = companion._create(builder);
            _create.setBannerLoadRequests(_create.getBannerLoadRequests() + 1);
        } while (!mutableStateFlow.compareAndSet(value, _create._build()));
    }

    @Override // com.unity3d.ads.core.data.repository.SessionRepository
    public void incrementBannerLoadRequestAdmCount() {
        Object value;
        SessionCountersKt.Dsl _create;
        MutableStateFlow mutableStateFlow = this._sessionCounters;
        do {
            value = mutableStateFlow.getValue();
            SessionCountersKt.Dsl.Companion companion = SessionCountersKt.Dsl.INSTANCE;
            SessionCountersOuterClass.SessionCounters.Builder builder = ((SessionCountersOuterClass.SessionCounters) value).toBuilder();
            Intrinsics.checkNotNullExpressionValue(builder, "toBuilder(...)");
            _create = companion._create(builder);
            _create.setBannerRequestsAdm(_create.getBannerRequestsAdm() + 1);
        } while (!mutableStateFlow.compareAndSet(value, _create._build()));
    }

    @Override // com.unity3d.ads.core.data.repository.SessionRepository
    public void incrementBannerImpressionCount() {
        Object value;
        SessionCountersKt.Dsl _create;
        MutableStateFlow mutableStateFlow = this._sessionCounters;
        do {
            value = mutableStateFlow.getValue();
            SessionCountersKt.Dsl.Companion companion = SessionCountersKt.Dsl.INSTANCE;
            SessionCountersOuterClass.SessionCounters.Builder builder = ((SessionCountersOuterClass.SessionCounters) value).toBuilder();
            Intrinsics.checkNotNullExpressionValue(builder, "toBuilder(...)");
            _create = companion._create(builder);
            _create.setBannerImpressions(_create.getBannerImpressions() + 1);
        } while (!mutableStateFlow.compareAndSet(value, _create._build()));
    }

    @Override // com.unity3d.ads.core.data.repository.SessionRepository
    public void incrementGlobalAdsFocusChangeCount() {
        Object value;
        SessionCountersKt.Dsl _create;
        MutableStateFlow mutableStateFlow = this._sessionCounters;
        do {
            value = mutableStateFlow.getValue();
            SessionCountersKt.Dsl.Companion companion = SessionCountersKt.Dsl.INSTANCE;
            SessionCountersOuterClass.SessionCounters.Builder builder = ((SessionCountersOuterClass.SessionCounters) value).toBuilder();
            Intrinsics.checkNotNullExpressionValue(builder, "toBuilder(...)");
            _create = companion._create(builder);
            _create.setGlobalAdsFocusChangeCount(_create.getGlobalAdsFocusChangeCount() + 1);
        } while (!mutableStateFlow.compareAndSet(value, _create._build()));
    }

    @Override // com.unity3d.ads.core.data.repository.SessionRepository
    public void addTimeToGlobalAdsFocusTime(int timeMs) {
        Object value;
        SessionCountersKt.Dsl _create;
        MutableStateFlow mutableStateFlow = this._sessionCounters;
        do {
            value = mutableStateFlow.getValue();
            SessionCountersKt.Dsl.Companion companion = SessionCountersKt.Dsl.INSTANCE;
            SessionCountersOuterClass.SessionCounters.Builder builder = ((SessionCountersOuterClass.SessionCounters) value).toBuilder();
            Intrinsics.checkNotNullExpressionValue(builder, "toBuilder(...)");
            _create = companion._create(builder);
            _create.setGlobalAdsFocusTime(_create.getGlobalAdsFocusTime() + timeMs);
        } while (!mutableStateFlow.compareAndSet(value, _create._build()));
    }

    @Override // com.unity3d.ads.core.data.repository.SessionRepository
    public void incrementFocusChangeCount() {
        Object value;
        SessionCountersKt.Dsl _create;
        MutableStateFlow mutableStateFlow = this._sessionCounters;
        do {
            value = mutableStateFlow.getValue();
            SessionCountersKt.Dsl.Companion companion = SessionCountersKt.Dsl.INSTANCE;
            SessionCountersOuterClass.SessionCounters.Builder builder = ((SessionCountersOuterClass.SessionCounters) value).toBuilder();
            Intrinsics.checkNotNullExpressionValue(builder, "toBuilder(...)");
            _create = companion._create(builder);
            _create.setFocusChangeCount(_create.getFocusChangeCount() + 1);
        } while (!mutableStateFlow.compareAndSet(value, _create._build()));
    }

    @Override // com.unity3d.ads.core.data.repository.SessionRepository
    public void setInitializationLatency(int ms) {
        Object value;
        SessionCountersKt.Dsl _create;
        MutableStateFlow mutableStateFlow = this._sessionCounters;
        do {
            value = mutableStateFlow.getValue();
            SessionCountersKt.Dsl.Companion companion = SessionCountersKt.Dsl.INSTANCE;
            SessionCountersOuterClass.SessionCounters.Builder builder = ((SessionCountersOuterClass.SessionCounters) value).toBuilder();
            Intrinsics.checkNotNullExpressionValue(builder, "toBuilder(...)");
            _create = companion._create(builder);
            _create.setInitializationLatency(ms);
        } while (!mutableStateFlow.compareAndSet(value, _create._build()));
    }

    @Override // com.unity3d.ads.core.data.repository.SessionRepository
    public void setLastLoadLatency(int ms) {
        Object value;
        SessionCountersKt.Dsl _create;
        MutableStateFlow mutableStateFlow = this._sessionCounters;
        do {
            value = mutableStateFlow.getValue();
            SessionCountersKt.Dsl.Companion companion = SessionCountersKt.Dsl.INSTANCE;
            SessionCountersOuterClass.SessionCounters.Builder builder = ((SessionCountersOuterClass.SessionCounters) value).toBuilder();
            Intrinsics.checkNotNullExpressionValue(builder, "toBuilder(...)");
            _create = companion._create(builder);
            _create.setLastLoadLatency(ms);
        } while (!mutableStateFlow.compareAndSet(value, _create._build()));
    }

    @Override // com.unity3d.ads.core.data.repository.SessionRepository
    public void incrementAllErrorsCount() {
        Object value;
        SessionCountersKt.Dsl _create;
        MutableStateFlow mutableStateFlow = this._sessionCounters;
        do {
            value = mutableStateFlow.getValue();
            SessionCountersKt.Dsl.Companion companion = SessionCountersKt.Dsl.INSTANCE;
            SessionCountersOuterClass.SessionCounters.Builder builder = ((SessionCountersOuterClass.SessionCounters) value).toBuilder();
            Intrinsics.checkNotNullExpressionValue(builder, "toBuilder(...)");
            _create = companion._create(builder);
            _create.setAllErrorsCount(_create.getAllErrorsCount() + 1);
        } while (!mutableStateFlow.compareAndSet(value, _create._build()));
    }

    @Override // com.unity3d.ads.core.data.repository.SessionRepository
    public void incrementCacheTimeoutErrorsCount() {
        Object value;
        SessionCountersKt.Dsl _create;
        MutableStateFlow mutableStateFlow = this._sessionCounters;
        do {
            value = mutableStateFlow.getValue();
            SessionCountersKt.Dsl.Companion companion = SessionCountersKt.Dsl.INSTANCE;
            SessionCountersOuterClass.SessionCounters.Builder builder = ((SessionCountersOuterClass.SessionCounters) value).toBuilder();
            Intrinsics.checkNotNullExpressionValue(builder, "toBuilder(...)");
            _create = companion._create(builder);
            _create.setCacheTimeoutErrorsCount(_create.getCacheTimeoutErrorsCount() + 1);
        } while (!mutableStateFlow.compareAndSet(value, _create._build()));
    }

    @Override // com.unity3d.ads.core.data.repository.SessionRepository
    public void incrementSuccessCount() {
        Object value;
        SessionCountersKt.Dsl _create;
        MutableStateFlow mutableStateFlow = this._sessionCounters;
        do {
            value = mutableStateFlow.getValue();
            SessionCountersKt.Dsl.Companion companion = SessionCountersKt.Dsl.INSTANCE;
            SessionCountersOuterClass.SessionCounters.Builder builder = ((SessionCountersOuterClass.SessionCounters) value).toBuilder();
            Intrinsics.checkNotNullExpressionValue(builder, "toBuilder(...)");
            _create = companion._create(builder);
            _create.setSuccessCount(_create.getSuccessCount() + 1);
        } while (!mutableStateFlow.compareAndSet(value, _create._build()));
    }

    @Override // com.unity3d.ads.core.data.repository.SessionRepository
    public void incrementTokenSequenceNumber() {
        Object value;
        TokenCounters tokenCounters;
        MutableStateFlow mutableStateFlow = this._tokenCounters;
        do {
            value = mutableStateFlow.getValue();
            tokenCounters = (TokenCounters) value;
        } while (!mutableStateFlow.compareAndSet(value, TokenCounters.copy$default(tokenCounters, tokenCounters.getSeq() + 1, 0, 0, 6, null)));
    }

    @Override // com.unity3d.ads.core.data.repository.SessionRepository
    public void incrementTokenWinsCount() {
        Object value;
        TokenCounters tokenCounters;
        MutableStateFlow mutableStateFlow = this._tokenCounters;
        do {
            value = mutableStateFlow.getValue();
            tokenCounters = (TokenCounters) value;
        } while (!mutableStateFlow.compareAndSet(value, TokenCounters.copy$default(tokenCounters, 0, tokenCounters.getWins() + 1, 0, 5, null)));
    }

    @Override // com.unity3d.ads.core.data.repository.SessionRepository
    public void incrementTokenStartsCount() {
        Object value;
        TokenCounters tokenCounters;
        MutableStateFlow mutableStateFlow = this._tokenCounters;
        do {
            value = mutableStateFlow.getValue();
            tokenCounters = (TokenCounters) value;
        } while (!mutableStateFlow.compareAndSet(value, TokenCounters.copy$default(tokenCounters, 0, 0, tokenCounters.getStarts() + 1, 3, null)));
    }

    @Override // com.unity3d.ads.core.data.repository.SessionRepository
    public void resetTokenCounters() {
        Object value;
        MutableStateFlow mutableStateFlow = this._tokenCounters;
        do {
            value = mutableStateFlow.getValue();
        } while (!mutableStateFlow.compareAndSet(value, new TokenCounters(0, 0, 0)));
    }

    @Override // com.unity3d.ads.core.data.repository.SessionRepository
    @NotNull
    public ByteString getSessionToken() {
        return (ByteString) this._sessionToken.getValue();
    }

    @Override // com.unity3d.ads.core.data.repository.SessionRepository
    public void setSessionToken(@NotNull ByteString value) {
        Object value2;
        Intrinsics.checkNotNullParameter(value, "value");
        MutableStateFlow mutableStateFlow = this._sessionToken;
        do {
            value2 = mutableStateFlow.getValue();
        } while (!mutableStateFlow.compareAndSet(value2, value));
    }

    @Override // com.unity3d.ads.core.data.repository.SessionRepository
    @NotNull
    public ByteString getGatewayState() {
        return (ByteString) this._currentState.getValue();
    }

    @Override // com.unity3d.ads.core.data.repository.SessionRepository
    public void setGatewayState(@NotNull ByteString value) {
        Object value2;
        Intrinsics.checkNotNullParameter(value, "value");
        MutableStateFlow mutableStateFlow = this._currentState;
        do {
            value2 = mutableStateFlow.getValue();
        } while (!mutableStateFlow.compareAndSet(value2, value));
    }

    @Override // com.unity3d.ads.core.data.repository.SessionRepository
    @NotNull
    public NativeConfigurationOuterClass.NativeConfiguration getNativeConfiguration() {
        Object runBlocking$default;
        if (!((Boolean) this.isInit.getValue()).booleanValue()) {
            runBlocking$default = BuildersKt__BuildersKt.runBlocking$default(null, new AndroidSessionRepository$nativeConfiguration$1(this, null), 1, null);
            return (NativeConfigurationOuterClass.NativeConfiguration) runBlocking$default;
        }
        return (NativeConfigurationOuterClass.NativeConfiguration) this._sdkConfiguration.getValue();
    }

    @Override // com.unity3d.ads.core.data.repository.SessionRepository
    public void setNativeConfiguration(@NotNull NativeConfigurationOuterClass.NativeConfiguration value) {
        Object value2;
        Intrinsics.checkNotNullParameter(value, "value");
        MutableStateFlow mutableStateFlow = this._sdkConfiguration;
        do {
            value2 = mutableStateFlow.getValue();
        } while (!mutableStateFlow.compareAndSet(value2, value));
    }

    @Override // com.unity3d.ads.core.data.repository.SessionRepository
    @NotNull
    public String getGatewayUrl() {
        return (String) this._gatewayUrl.getValue();
    }

    @Override // com.unity3d.ads.core.data.repository.SessionRepository
    public void setGatewayUrl(@NotNull String value) {
        Object value2;
        Intrinsics.checkNotNullParameter(value, "value");
        MutableStateFlow mutableStateFlow = this._gatewayUrl;
        do {
            value2 = mutableStateFlow.getValue();
        } while (!mutableStateFlow.compareAndSet(value2, value));
    }

    @Override // com.unity3d.ads.core.data.repository.SessionRepository
    @NotNull
    public InitializationState getInitializationState() {
        return (InitializationState) this._initializationState.getValue();
    }

    @Override // com.unity3d.ads.core.data.repository.SessionRepository
    public void setInitializationState(@NotNull InitializationState value) {
        Object value2;
        Intrinsics.checkNotNullParameter(value, "value");
        MutableStateFlow mutableStateFlow = this._initializationState;
        do {
            value2 = mutableStateFlow.getValue();
        } while (!mutableStateFlow.compareAndSet(value2, value));
    }

    @Override // com.unity3d.ads.core.data.repository.SessionRepository
    @NotNull
    public List<InitializationResponseOuterClass.RequestUrlOverride> getRequestUrlOverrides() {
        return (List) this._requestUrlOverride.getValue();
    }

    @Override // com.unity3d.ads.core.data.repository.SessionRepository
    public void setRequestUrlOverrides(@NotNull List<InitializationResponseOuterClass.RequestUrlOverride> value) {
        Object value2;
        Intrinsics.checkNotNullParameter(value, "value");
        MutableStateFlow mutableStateFlow = this._requestUrlOverride;
        do {
            value2 = mutableStateFlow.getValue();
        } while (!mutableStateFlow.compareAndSet(value2, value));
    }

    @Override // com.unity3d.ads.core.data.repository.SessionRepository
    @NotNull
    public Flow getObserveInitializationState() {
        return this._initializationState;
    }

    @Override // com.unity3d.ads.core.data.repository.SessionRepository
    public boolean isSdkInitialized() {
        return getInitializationState() == InitializationState.INITIALIZED;
    }

    @Override // com.unity3d.ads.core.data.repository.SessionRepository
    public boolean isNativeConfigReady() {
        return ((Boolean) this.isInit.getValue()).booleanValue();
    }

    @Override // com.unity3d.ads.core.data.repository.SessionRepository
    public boolean isDiagnosticsEnabled() {
        return getNativeConfiguration().getDiagnosticEvents().getEnabled();
    }

    @Override // com.unity3d.ads.core.data.repository.SessionRepository
    @NotNull
    public NativeConfigurationOuterClass.FeatureFlags getFeatureFlags() {
        NativeConfigurationOuterClass.FeatureFlags featureFlags = getNativeConfiguration().getFeatureFlags();
        Intrinsics.checkNotNullExpressionValue(featureFlags, "getFeatureFlags(...)");
        return featureFlags;
    }

    @Override // com.unity3d.ads.core.data.repository.SessionRepository
    public int getHeaderBiddingTokenCounter() {
        Object value;
        Number number;
        MutableStateFlow mutableStateFlow = this._headerBiddingTokenCounter;
        do {
            value = mutableStateFlow.getValue();
            number = (Number) value;
        } while (!mutableStateFlow.compareAndSet(value, Integer.valueOf(number.intValue() + 1)));
        return number.intValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // com.unity3d.ads.core.data.repository.SessionRepository
    @Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object getGatewayCache(@NotNull Continuation continuation) {
        AndroidSessionRepository$getGatewayCache$1 androidSessionRepository$getGatewayCache$1;
        int i;
        if (continuation instanceof AndroidSessionRepository$getGatewayCache$1) {
            androidSessionRepository$getGatewayCache$1 = (AndroidSessionRepository$getGatewayCache$1) continuation;
            int i2 = androidSessionRepository$getGatewayCache$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                androidSessionRepository$getGatewayCache$1.label = i2 - Integer.MIN_VALUE;
                Object obj = androidSessionRepository$getGatewayCache$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = androidSessionRepository$getGatewayCache$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    ByteStringDataSource byteStringDataSource = this.gatewayCacheDataSource;
                    androidSessionRepository$getGatewayCache$1.label = 1;
                    obj = byteStringDataSource.get(androidSessionRepository$getGatewayCache$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                ByteString data = ((ByteStringStoreOuterClass.ByteStringStore) obj).getData();
                Intrinsics.checkNotNullExpressionValue(data, "getData(...)");
                return data;
            }
        }
        androidSessionRepository$getGatewayCache$1 = new AndroidSessionRepository$getGatewayCache$1(this, continuation);
        Object obj2 = androidSessionRepository$getGatewayCache$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = androidSessionRepository$getGatewayCache$1.label;
        if (i != 0) {
        }
        ByteString data2 = ((ByteStringStoreOuterClass.ByteStringStore) obj2).getData();
        Intrinsics.checkNotNullExpressionValue(data2, "getData(...)");
        return data2;
    }

    @Override // com.unity3d.ads.core.data.repository.SessionRepository
    @Nullable
    public Object setGatewayCache(@NotNull ByteString byteString, @NotNull Continuation continuation) {
        Object obj = this.gatewayCacheDataSource.set(byteString, continuation);
        return obj == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? obj : Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // com.unity3d.ads.core.data.repository.SessionRepository
    @Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object getPrivacy(@NotNull Continuation continuation) {
        AndroidSessionRepository$getPrivacy$1 androidSessionRepository$getPrivacy$1;
        int i;
        if (continuation instanceof AndroidSessionRepository$getPrivacy$1) {
            androidSessionRepository$getPrivacy$1 = (AndroidSessionRepository$getPrivacy$1) continuation;
            int i2 = androidSessionRepository$getPrivacy$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                androidSessionRepository$getPrivacy$1.label = i2 - Integer.MIN_VALUE;
                Object obj = androidSessionRepository$getPrivacy$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = androidSessionRepository$getPrivacy$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    ByteStringDataSource byteStringDataSource = this.privacyDataSource;
                    androidSessionRepository$getPrivacy$1.label = 1;
                    obj = byteStringDataSource.get(androidSessionRepository$getPrivacy$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                ByteString data = ((ByteStringStoreOuterClass.ByteStringStore) obj).getData();
                Intrinsics.checkNotNullExpressionValue(data, "getData(...)");
                return data;
            }
        }
        androidSessionRepository$getPrivacy$1 = new AndroidSessionRepository$getPrivacy$1(this, continuation);
        Object obj2 = androidSessionRepository$getPrivacy$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = androidSessionRepository$getPrivacy$1.label;
        if (i != 0) {
        }
        ByteString data2 = ((ByteStringStoreOuterClass.ByteStringStore) obj2).getData();
        Intrinsics.checkNotNullExpressionValue(data2, "getData(...)");
        return data2;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x005e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // com.unity3d.ads.core.data.repository.SessionRepository
    @Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object setPrivacy(@NotNull ByteString byteString, @NotNull Continuation continuation) {
        AndroidSessionRepository$setPrivacy$1 androidSessionRepository$setPrivacy$1;
        Object coroutine_suspended;
        int i;
        MutableSharedFlow mutableSharedFlow;
        SessionChange.UserConsentChange userConsentChange;
        if (continuation instanceof AndroidSessionRepository$setPrivacy$1) {
            androidSessionRepository$setPrivacy$1 = (AndroidSessionRepository$setPrivacy$1) continuation;
            int i2 = androidSessionRepository$setPrivacy$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                androidSessionRepository$setPrivacy$1.label = i2 - Integer.MIN_VALUE;
                Object obj = androidSessionRepository$setPrivacy$1.result;
                coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = androidSessionRepository$setPrivacy$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    ByteStringDataSource byteStringDataSource = this.privacyDataSource;
                    androidSessionRepository$setPrivacy$1.L$0 = byteString;
                    androidSessionRepository$setPrivacy$1.label = 1;
                    if (byteStringDataSource.set(byteString, androidSessionRepository$setPrivacy$1) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                        return Unit.INSTANCE;
                    }
                    byteString = (ByteString) androidSessionRepository$setPrivacy$1.L$0;
                    ResultKt.throwOnFailure(obj);
                }
                mutableSharedFlow = this._onChange;
                userConsentChange = new SessionChange.UserConsentChange(byteString);
                androidSessionRepository$setPrivacy$1.L$0 = null;
                androidSessionRepository$setPrivacy$1.label = 2;
                if (mutableSharedFlow.emit(userConsentChange, androidSessionRepository$setPrivacy$1) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                return Unit.INSTANCE;
            }
        }
        androidSessionRepository$setPrivacy$1 = new AndroidSessionRepository$setPrivacy$1(this, continuation);
        Object obj2 = androidSessionRepository$setPrivacy$1.result;
        coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = androidSessionRepository$setPrivacy$1.label;
        if (i != 0) {
        }
        mutableSharedFlow = this._onChange;
        userConsentChange = new SessionChange.UserConsentChange(byteString);
        androidSessionRepository$setPrivacy$1.L$0 = null;
        androidSessionRepository$setPrivacy$1.label = 2;
        if (mutableSharedFlow.emit(userConsentChange, androidSessionRepository$setPrivacy$1) == coroutine_suspended) {
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // com.unity3d.ads.core.data.repository.SessionRepository
    @Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object getPrivacyFsm(@NotNull Continuation continuation) {
        AndroidSessionRepository$getPrivacyFsm$1 androidSessionRepository$getPrivacyFsm$1;
        int i;
        if (continuation instanceof AndroidSessionRepository$getPrivacyFsm$1) {
            androidSessionRepository$getPrivacyFsm$1 = (AndroidSessionRepository$getPrivacyFsm$1) continuation;
            int i2 = androidSessionRepository$getPrivacyFsm$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                androidSessionRepository$getPrivacyFsm$1.label = i2 - Integer.MIN_VALUE;
                Object obj = androidSessionRepository$getPrivacyFsm$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = androidSessionRepository$getPrivacyFsm$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    ByteStringDataSource byteStringDataSource = this.fsmDataSource;
                    androidSessionRepository$getPrivacyFsm$1.label = 1;
                    obj = byteStringDataSource.get(androidSessionRepository$getPrivacyFsm$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                ByteString data = ((ByteStringStoreOuterClass.ByteStringStore) obj).getData();
                Intrinsics.checkNotNullExpressionValue(data, "getData(...)");
                return data;
            }
        }
        androidSessionRepository$getPrivacyFsm$1 = new AndroidSessionRepository$getPrivacyFsm$1(this, continuation);
        Object obj2 = androidSessionRepository$getPrivacyFsm$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = androidSessionRepository$getPrivacyFsm$1.label;
        if (i != 0) {
        }
        ByteString data2 = ((ByteStringStoreOuterClass.ByteStringStore) obj2).getData();
        Intrinsics.checkNotNullExpressionValue(data2, "getData(...)");
        return data2;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x005e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // com.unity3d.ads.core.data.repository.SessionRepository
    @Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object setPrivacyFsm(@NotNull ByteString byteString, @NotNull Continuation continuation) {
        AndroidSessionRepository$setPrivacyFsm$1 androidSessionRepository$setPrivacyFsm$1;
        Object coroutine_suspended;
        int i;
        MutableSharedFlow mutableSharedFlow;
        SessionChange.PrivacyFsmChange privacyFsmChange;
        if (continuation instanceof AndroidSessionRepository$setPrivacyFsm$1) {
            androidSessionRepository$setPrivacyFsm$1 = (AndroidSessionRepository$setPrivacyFsm$1) continuation;
            int i2 = androidSessionRepository$setPrivacyFsm$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                androidSessionRepository$setPrivacyFsm$1.label = i2 - Integer.MIN_VALUE;
                Object obj = androidSessionRepository$setPrivacyFsm$1.result;
                coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = androidSessionRepository$setPrivacyFsm$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    ByteStringDataSource byteStringDataSource = this.fsmDataSource;
                    androidSessionRepository$setPrivacyFsm$1.L$0 = byteString;
                    androidSessionRepository$setPrivacyFsm$1.label = 1;
                    if (byteStringDataSource.set(byteString, androidSessionRepository$setPrivacyFsm$1) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                        return Unit.INSTANCE;
                    }
                    byteString = (ByteString) androidSessionRepository$setPrivacyFsm$1.L$0;
                    ResultKt.throwOnFailure(obj);
                }
                mutableSharedFlow = this._onChange;
                privacyFsmChange = new SessionChange.PrivacyFsmChange(byteString);
                androidSessionRepository$setPrivacyFsm$1.L$0 = null;
                androidSessionRepository$setPrivacyFsm$1.label = 2;
                if (mutableSharedFlow.emit(privacyFsmChange, androidSessionRepository$setPrivacyFsm$1) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                return Unit.INSTANCE;
            }
        }
        androidSessionRepository$setPrivacyFsm$1 = new AndroidSessionRepository$setPrivacyFsm$1(this, continuation);
        Object obj2 = androidSessionRepository$setPrivacyFsm$1.result;
        coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = androidSessionRepository$setPrivacyFsm$1.label;
        if (i != 0) {
        }
        mutableSharedFlow = this._onChange;
        privacyFsmChange = new SessionChange.PrivacyFsmChange(byteString);
        androidSessionRepository$setPrivacyFsm$1.L$0 = null;
        androidSessionRepository$setPrivacyFsm$1.label = 2;
        if (mutableSharedFlow.emit(privacyFsmChange, androidSessionRepository$setPrivacyFsm$1) == coroutine_suspended) {
        }
        return Unit.INSTANCE;
    }

    @Override // com.unity3d.ads.core.data.repository.SessionRepository
    public boolean getShouldInitialize() {
        return ((Boolean) this._shouldInitialize.getValue()).booleanValue();
    }

    @Override // com.unity3d.ads.core.data.repository.SessionRepository
    public void setShouldInitialize(boolean z) {
        Object value;
        MutableStateFlow mutableStateFlow = this._shouldInitialize;
        do {
            value = mutableStateFlow.getValue();
            ((Boolean) value).booleanValue();
        } while (!mutableStateFlow.compareAndSet(value, Boolean.valueOf(z)));
    }

    @Override // com.unity3d.ads.core.data.repository.SessionRepository
    public boolean isOmEnabled() {
        return getNativeConfiguration().getEnableOm();
    }

    @Override // com.unity3d.ads.core.data.repository.SessionRepository
    @Nullable
    public Object persistNativeConfiguration(@NotNull Continuation continuation) {
        ByteStringDataSource byteStringDataSource = this.nativeConfigDataSource;
        ByteString byteString = getNativeConfiguration().toByteString();
        Intrinsics.checkNotNullExpressionValue(byteString, "toByteString(...)");
        Object obj = byteStringDataSource.set(byteString, continuation);
        return obj == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? obj : Unit.INSTANCE;
    }

    @Override // com.unity3d.ads.core.data.repository.SessionRepository
    public boolean isFirstInitAttempt() {
        Object value;
        Boolean bool;
        MutableStateFlow mutableStateFlow = this._isFirstInitAttempt;
        do {
            value = mutableStateFlow.getValue();
            bool = (Boolean) value;
            bool.booleanValue();
        } while (!mutableStateFlow.compareAndSet(value, Boolean.FALSE));
        return bool.booleanValue();
    }

    @Override // com.unity3d.ads.core.data.repository.SessionRepository
    @Nullable
    public String getUnityInstallationId() {
        return this.unityInfoDataSource.getUnityInstallationId();
    }

    @Override // com.unity3d.ads.core.data.repository.SessionRepository
    @Nullable
    public String getUnityMegaSessionId() {
        return this.unityInfoDataSource.getUnityMegaSessionId();
    }

    @Override // com.unity3d.ads.core.data.repository.SessionRepository
    @Nullable
    public InitializationConfigurationInternal getInitializationConfiguration() {
        return this.initializationConfiguration;
    }

    @Override // com.unity3d.ads.core.data.repository.SessionRepository
    public void setInitializationConfiguration(@Nullable InitializationConfigurationInternal initializationConfigurationInternal) {
        this.initializationConfiguration = initializationConfigurationInternal;
    }
}
