package com.unity3d.ads.core.domain;

import android.content.Context;
import android.util.Base64;
import com.google.protobuf.ByteString;
import com.unity3d.ads.UnityAdsErrorKt;
import com.unity3d.ads.UnityAdsLoadOptions;
import com.unity3d.ads.adplayer.AdPlayer;
import com.unity3d.ads.adplayer.AdPlayerScope;
import com.unity3d.ads.adplayer.AndroidWebViewContainer;
import com.unity3d.ads.adplayer.WebViewBridge;
import com.unity3d.ads.adplayer.WebViewContainer;
import com.unity3d.ads.adplayer.model.LoadEvent;
import com.unity3d.ads.core.data.model.AdObject;
import com.unity3d.ads.core.data.model.CoroutineOpportunity;
import com.unity3d.ads.core.data.model.LoadResult;
import com.unity3d.ads.core.data.model.WebViewConfiguration;
import com.unity3d.ads.core.data.repository.AdRepository;
import com.unity3d.ads.core.data.repository.CampaignRepository;
import com.unity3d.ads.core.data.repository.DeviceInfoRepository;
import com.unity3d.ads.core.data.repository.SessionRepository;
import com.unity3d.ads.core.domain.CacheWebViewAssets;
import com.unity3d.ads.core.domain.SendDiagnosticEvent;
import com.unity3d.ads.core.domain.adload.WebViewLessLoadStrategy;
import com.unity3d.ads.core.domain.events.GetOperativeEventApi;
import com.unity3d.ads.core.extensions.ErrorExtensionsKt;
import com.unity3d.ads.core.extensions.ProtobufExtensionsKt;
import com.unity3d.ads.core.extensions.TimeExtensionsKt;
import com.unity3d.services.UnityAdsConstants;
import com.unity3d.services.core.properties.SdkProperties;
import gatewayprotocol.v1.AdResponseOuterClass;
import gatewayprotocol.v1.DiagnosticEventRequestOuterClass;
import gatewayprotocol.v1.ErrorOuterClass;
import gatewayprotocol.v1.OperativeEventErrorDataKt;
import gatewayprotocol.v1.OperativeEventRequestOuterClass;
import java.net.URI;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlin.text.StringsKt;
import kotlin.time.Duration;
import kotlin.time.DurationUnit;
import kotlin.time.TimeSource$Monotonic;
import kotlin.time.TimedValue;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.NonCancellable;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* compiled from: AndroidHandleGatewayAdResponse.kt */
@Metadata(d1 = {"\u0000¶\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001Bw\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u0011\u0012\u0006\u0010\u0012\u001a\u00020\u0013\u0012\u0006\u0010\u0014\u001a\u00020\u0015\u0012\u0006\u0010\u0016\u001a\u00020\u0017\u0012\u0006\u0010\u0018\u001a\u00020\u0019\u0012\u0006\u0010\u001a\u001a\u00020\u001b\u0012\u0006\u0010\u001c\u001a\u00020\u001d¢\u0006\u0004\b\u001e\u0010\u001fJN\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020'2\u0006\u0010(\u001a\u00020)2\u0006\u0010*\u001a\u00020+2\u0006\u0010,\u001a\u00020-2\u0006\u0010.\u001a\u00020/2\u0006\u00100\u001a\u00020/H\u0096B¢\u0006\u0002\u00101J&\u00102\u001a\u0002032\u0006\u00104\u001a\u0002052\u0006\u00106\u001a\u00020+2\u0006\u00107\u001a\u000208H\u0082@¢\u0006\u0002\u00109J0\u0010:\u001a\u0002032\u0006\u0010;\u001a\u00020<2\u0006\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020'2\b\u0010=\u001a\u0004\u0018\u00010>H\u0082@¢\u0006\u0002\u0010?R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0017X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0019X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u001bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\u001dX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006@"}, d2 = {"Lcom/unity3d/ads/core/domain/AndroidHandleGatewayAdResponse;", "Lcom/unity3d/ads/core/domain/HandleGatewayAdResponse;", "adRepository", "Lcom/unity3d/ads/core/data/repository/AdRepository;", "getWebViewContainerUseCase", "Lcom/unity3d/ads/core/domain/AndroidGetWebViewContainerUseCase;", "getWebViewBridge", "Lcom/unity3d/ads/core/domain/GetWebViewBridgeUseCase;", "deviceInfoRepository", "Lcom/unity3d/ads/core/data/repository/DeviceInfoRepository;", "getHandleInvocationsFromAdViewer", "Lcom/unity3d/ads/core/domain/HandleInvocationsFromAdViewer;", "campaignRepository", "Lcom/unity3d/ads/core/data/repository/CampaignRepository;", "sendDiagnosticEvent", "Lcom/unity3d/ads/core/domain/SendDiagnosticEvent;", "getOperativeEventApi", "Lcom/unity3d/ads/core/domain/events/GetOperativeEventApi;", "getLatestWebViewConfiguration", "Lcom/unity3d/ads/core/domain/GetLatestWebViewConfiguration;", "adPlayerScope", "Lcom/unity3d/ads/adplayer/AdPlayerScope;", "getAdPlayer", "Lcom/unity3d/ads/core/domain/GetAdPlayer;", "cacheWebViewAssets", "Lcom/unity3d/ads/core/domain/CacheWebViewAssets;", "webViewLessLoadStrategy", "Lcom/unity3d/ads/core/domain/adload/WebViewLessLoadStrategy;", "sessionRepository", "Lcom/unity3d/ads/core/data/repository/SessionRepository;", "<init>", "(Lcom/unity3d/ads/core/data/repository/AdRepository;Lcom/unity3d/ads/core/domain/AndroidGetWebViewContainerUseCase;Lcom/unity3d/ads/core/domain/GetWebViewBridgeUseCase;Lcom/unity3d/ads/core/data/repository/DeviceInfoRepository;Lcom/unity3d/ads/core/domain/HandleInvocationsFromAdViewer;Lcom/unity3d/ads/core/data/repository/CampaignRepository;Lcom/unity3d/ads/core/domain/SendDiagnosticEvent;Lcom/unity3d/ads/core/domain/events/GetOperativeEventApi;Lcom/unity3d/ads/core/domain/GetLatestWebViewConfiguration;Lcom/unity3d/ads/adplayer/AdPlayerScope;Lcom/unity3d/ads/core/domain/GetAdPlayer;Lcom/unity3d/ads/core/domain/CacheWebViewAssets;Lcom/unity3d/ads/core/domain/adload/WebViewLessLoadStrategy;Lcom/unity3d/ads/core/data/repository/SessionRepository;)V", "invoke", "Lcom/unity3d/ads/core/data/model/LoadResult;", HandleInvocationsFromAdViewer.KEY_LOAD_OPTIONS, "Lcom/unity3d/ads/UnityAdsLoadOptions;", "opportunityId", "Lcom/google/protobuf/ByteString;", "response", "Lgatewayprotocol/v1/AdResponseOuterClass$AdResponse;", "context", "Landroid/content/Context;", "placementId", "", "adType", "Lgatewayprotocol/v1/DiagnosticEventRequestOuterClass$DiagnosticAdType;", HandleInvocationsFromAdViewer.KEY_IS_HEADER_BIDDING, "", "forceWebViewLoad", "(Lcom/unity3d/ads/UnityAdsLoadOptions;Lcom/google/protobuf/ByteString;Lgatewayprotocol/v1/AdResponseOuterClass$AdResponse;Landroid/content/Context;Ljava/lang/String;Lgatewayprotocol/v1/DiagnosticEventRequestOuterClass$DiagnosticAdType;ZZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "loadUrl", "", "adObject", "Lcom/unity3d/ads/core/data/model/AdObject;", "webViewUrl", "webviewContainer", "Lcom/unity3d/ads/adplayer/WebViewContainer;", "(Lcom/unity3d/ads/core/data/model/AdObject;Ljava/lang/String;Lcom/unity3d/ads/adplayer/WebViewContainer;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "cleanup", "t", "", "adPlayer", "Lcom/unity3d/ads/adplayer/AdPlayer;", "(Ljava/lang/Throwable;Lcom/google/protobuf/ByteString;Lgatewayprotocol/v1/AdResponseOuterClass$AdResponse;Lcom/unity3d/ads/adplayer/AdPlayer;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "unity-ads_defaultRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class AndroidHandleGatewayAdResponse implements HandleGatewayAdResponse {

    @NotNull
    private final AdPlayerScope adPlayerScope;

    @NotNull
    private final AdRepository adRepository;

    @NotNull
    private final CacheWebViewAssets cacheWebViewAssets;

    @NotNull
    private final CampaignRepository campaignRepository;

    @NotNull
    private final DeviceInfoRepository deviceInfoRepository;

    @NotNull
    private final GetAdPlayer getAdPlayer;

    @NotNull
    private final HandleInvocationsFromAdViewer getHandleInvocationsFromAdViewer;

    @NotNull
    private final GetLatestWebViewConfiguration getLatestWebViewConfiguration;

    @NotNull
    private final GetOperativeEventApi getOperativeEventApi;

    @NotNull
    private final GetWebViewBridgeUseCase getWebViewBridge;

    @NotNull
    private final AndroidGetWebViewContainerUseCase getWebViewContainerUseCase;

    @NotNull
    private final SendDiagnosticEvent sendDiagnosticEvent;

    @NotNull
    private final SessionRepository sessionRepository;

    @NotNull
    private final WebViewLessLoadStrategy webViewLessLoadStrategy;

    public AndroidHandleGatewayAdResponse(@NotNull AdRepository adRepository, @NotNull AndroidGetWebViewContainerUseCase getWebViewContainerUseCase, @NotNull GetWebViewBridgeUseCase getWebViewBridge, @NotNull DeviceInfoRepository deviceInfoRepository, @NotNull HandleInvocationsFromAdViewer getHandleInvocationsFromAdViewer, @NotNull CampaignRepository campaignRepository, @NotNull SendDiagnosticEvent sendDiagnosticEvent, @NotNull GetOperativeEventApi getOperativeEventApi, @NotNull GetLatestWebViewConfiguration getLatestWebViewConfiguration, @NotNull AdPlayerScope adPlayerScope, @NotNull GetAdPlayer getAdPlayer, @NotNull CacheWebViewAssets cacheWebViewAssets, @NotNull WebViewLessLoadStrategy webViewLessLoadStrategy, @NotNull SessionRepository sessionRepository) {
        Intrinsics.checkNotNullParameter(adRepository, "adRepository");
        Intrinsics.checkNotNullParameter(getWebViewContainerUseCase, "getWebViewContainerUseCase");
        Intrinsics.checkNotNullParameter(getWebViewBridge, "getWebViewBridge");
        Intrinsics.checkNotNullParameter(deviceInfoRepository, "deviceInfoRepository");
        Intrinsics.checkNotNullParameter(getHandleInvocationsFromAdViewer, "getHandleInvocationsFromAdViewer");
        Intrinsics.checkNotNullParameter(campaignRepository, "campaignRepository");
        Intrinsics.checkNotNullParameter(sendDiagnosticEvent, "sendDiagnosticEvent");
        Intrinsics.checkNotNullParameter(getOperativeEventApi, "getOperativeEventApi");
        Intrinsics.checkNotNullParameter(getLatestWebViewConfiguration, "getLatestWebViewConfiguration");
        Intrinsics.checkNotNullParameter(adPlayerScope, "adPlayerScope");
        Intrinsics.checkNotNullParameter(getAdPlayer, "getAdPlayer");
        Intrinsics.checkNotNullParameter(cacheWebViewAssets, "cacheWebViewAssets");
        Intrinsics.checkNotNullParameter(webViewLessLoadStrategy, "webViewLessLoadStrategy");
        Intrinsics.checkNotNullParameter(sessionRepository, "sessionRepository");
        this.adRepository = adRepository;
        this.getWebViewContainerUseCase = getWebViewContainerUseCase;
        this.getWebViewBridge = getWebViewBridge;
        this.deviceInfoRepository = deviceInfoRepository;
        this.getHandleInvocationsFromAdViewer = getHandleInvocationsFromAdViewer;
        this.campaignRepository = campaignRepository;
        this.sendDiagnosticEvent = sendDiagnosticEvent;
        this.getOperativeEventApi = getOperativeEventApi;
        this.getLatestWebViewConfiguration = getLatestWebViewConfiguration;
        this.adPlayerScope = adPlayerScope;
        this.getAdPlayer = getAdPlayer;
        this.cacheWebViewAssets = cacheWebViewAssets;
        this.webViewLessLoadStrategy = webViewLessLoadStrategy;
        this.sessionRepository = sessionRepository;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(8:0|1|(2:3|(4:5|6|7|8))|388|6|7|8|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:384:0x016d, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:385:0x016e, code lost:
    
        r7 = r10;
        r4 = r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:386:0x008d, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:387:0x008e, code lost:
    
        r7 = r9;
        r15 = r12;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Not initialized variable reg: 10, insn: 0x016e: MOVE (r7 I:??[OBJECT, ARRAY]) = (r10 I:??[OBJECT, ARRAY]), block:B:385:0x016e */
    /* JADX WARN: Not initialized variable reg: 12, insn: 0x008f: MOVE (r15 I:??[OBJECT, ARRAY]) = (r12 I:??[OBJECT, ARRAY]), block:B:387:0x008e */
    /* JADX WARN: Not initialized variable reg: 9, insn: 0x008e: MOVE (r7 I:??[OBJECT, ARRAY]) = (r9 I:??[OBJECT, ARRAY]), block:B:387:0x008e */
    /* JADX WARN: Removed duplicated region for block: B:107:0x07ff A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0800  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x078f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:129:0x068e A[Catch: CancellationException -> 0x0689, TryCatch #38 {CancellationException -> 0x0689, blocks: (B:88:0x065c, B:90:0x0684, B:92:0x0691, B:129:0x068e), top: B:87:0x065c }] */
    /* JADX WARN: Removed duplicated region for block: B:12:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x04c3 A[Catch: CancellationException -> 0x0981, TRY_ENTER, TRY_LEAVE, TryCatch #14 {CancellationException -> 0x0981, blocks: (B:156:0x049c, B:158:0x04c3), top: B:155:0x049c }] */
    /* JADX WARN: Removed duplicated region for block: B:15:0x09d9  */
    /* JADX WARN: Removed duplicated region for block: B:17:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:256:0x04a6 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:265:0x0173  */
    /* JADX WARN: Removed duplicated region for block: B:271:0x03d9 A[Catch: CancellationException -> 0x03b4, TRY_LEAVE, TryCatch #22 {CancellationException -> 0x03b4, blocks: (B:269:0x0391, B:271:0x03d9), top: B:268:0x0391 }] */
    /* JADX WARN: Removed duplicated region for block: B:273:0x03e7  */
    /* JADX WARN: Removed duplicated region for block: B:281:0x0487  */
    /* JADX WARN: Removed duplicated region for block: B:282:0x042b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:296:0x0423  */
    /* JADX WARN: Removed duplicated region for block: B:298:0x03e4  */
    /* JADX WARN: Removed duplicated region for block: B:300:0x01b0  */
    /* JADX WARN: Removed duplicated region for block: B:307:0x02ca A[Catch: CancellationException -> 0x01d2, TRY_ENTER, TryCatch #31 {CancellationException -> 0x01d2, blocks: (B:302:0x01cc, B:307:0x02ca, B:309:0x02d2), top: B:301:0x01cc }] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x09d0 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:314:0x03c7  */
    /* JADX WARN: Removed duplicated region for block: B:315:0x0332 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x09d1  */
    /* JADX WARN: Removed duplicated region for block: B:338:0x02ea A[Catch: CancellationException -> 0x0986, TRY_ENTER, TryCatch #42 {CancellationException -> 0x0986, blocks: (B:305:0x02bb, B:312:0x0322, B:338:0x02ea), top: B:304:0x02bb }] */
    /* JADX WARN: Removed duplicated region for block: B:343:0x01d8  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x084b A[Catch: CancellationException -> 0x08d4, TRY_LEAVE, TryCatch #6 {CancellationException -> 0x08d4, blocks: (B:44:0x0847, B:46:0x084b, B:50:0x08d8, B:52:0x08fd, B:53:0x0916, B:55:0x0926, B:57:0x093f, B:59:0x092c, B:61:0x0932, B:63:0x093a), top: B:43:0x0847 }] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x08d8 A[Catch: CancellationException -> 0x08d4, TRY_ENTER, TryCatch #6 {CancellationException -> 0x08d4, blocks: (B:44:0x0847, B:46:0x084b, B:50:0x08d8, B:52:0x08fd, B:53:0x0916, B:55:0x0926, B:57:0x093f, B:59:0x092c, B:61:0x0932, B:63:0x093a), top: B:43:0x0847 }] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0830 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0831  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0684 A[Catch: CancellationException -> 0x0689, TryCatch #38 {CancellationException -> 0x0689, blocks: (B:88:0x065c, B:90:0x0684, B:92:0x0691, B:129:0x068e), top: B:87:0x065c }] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0027  */
    /* JADX WARN: Type inference failed for: r6v30, types: [T, com.unity3d.ads.adplayer.AdPlayer] */
    @Override // com.unity3d.ads.core.domain.HandleGatewayAdResponse
    @Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object invoke(@NotNull UnityAdsLoadOptions unityAdsLoadOptions, @NotNull ByteString byteString, @NotNull AdResponseOuterClass.AdResponse adResponse, @NotNull Context context, @NotNull String str, @NotNull DiagnosticEventRequestOuterClass.DiagnosticAdType diagnosticAdType, boolean z, boolean z2, @NotNull Continuation continuation) {
        AndroidHandleGatewayAdResponse$invoke$1 androidHandleGatewayAdResponse$invoke$1;
        Ref$ObjectRef ref$ObjectRef;
        ByteString byteString2;
        Object obj;
        AdResponseOuterClass.AdResponse adResponse2;
        NonCancellable nonCancellable;
        AndroidHandleGatewayAdResponse$invoke$5 androidHandleGatewayAdResponse$invoke$5;
        CancellationException cancellationException;
        Throwable cause;
        ByteString byteString3;
        boolean z3;
        Ref$ObjectRef ref$ObjectRef2;
        ByteString byteString4;
        AdResponseOuterClass.AdResponse adResponse3;
        String str2;
        DiagnosticEventRequestOuterClass.DiagnosticAdType diagnosticAdType2;
        UnityAdsLoadOptions unityAdsLoadOptions2;
        boolean z4;
        String errorText;
        AdObject adObject;
        Object obj2;
        long m8186markNowz9LOYto;
        String str3;
        AdObject adObject2;
        CoroutineScope coroutineScope;
        boolean z5;
        WebViewConfiguration webViewConfiguration;
        Ref$ObjectRef ref$ObjectRef3;
        long j;
        DiagnosticEventRequestOuterClass.DiagnosticAdType diagnosticAdType3;
        boolean z6;
        String str4;
        boolean z7;
        TimedValue timedValue;
        CoroutineScope coroutineScope2;
        boolean z8;
        DiagnosticEventRequestOuterClass.DiagnosticAdType diagnosticAdType4;
        AdObject adObject3;
        int booleanValue;
        boolean z9;
        boolean z10;
        Object obj3;
        int i;
        UnityAdsLoadOptions unityAdsLoadOptions3;
        Ref$ObjectRef ref$ObjectRef4;
        String str5;
        AdResponseOuterClass.AdResponse adResponse4;
        WebViewConfiguration webViewConfiguration2;
        boolean z11;
        boolean z12;
        AdObject adObject4;
        boolean z13;
        int i2;
        DiagnosticEventRequestOuterClass.DiagnosticAdType diagnosticAdType5;
        boolean z14;
        CoroutineScope coroutineScope3;
        WebViewConfiguration webViewConfiguration3;
        AdResponseOuterClass.AdResponse adResponse5;
        Ref$ObjectRef ref$ObjectRef5;
        DiagnosticEventRequestOuterClass.DiagnosticEventType diagnosticEventType;
        Ref$ObjectRef ref$ObjectRef6;
        WebViewConfiguration webViewConfiguration4;
        String sb;
        Object obj4;
        long m8186markNowz9LOYto2;
        WebViewConfiguration webViewConfiguration5;
        CoroutineScope coroutineScope4;
        String str6;
        AdObject adObject5;
        WebViewConfiguration webViewConfiguration6;
        CoroutineScope coroutineScope5;
        boolean z15;
        int i3;
        String str7;
        DiagnosticEventRequestOuterClass.DiagnosticAdType diagnosticAdType6;
        String str8;
        AndroidGetWebViewContainerUseCase androidGetWebViewContainerUseCase;
        AdPlayerScope adPlayerScope;
        AdObject adObject6;
        ByteString byteString5;
        Ref$ObjectRef ref$ObjectRef7;
        String str9;
        boolean z16;
        Ref$ObjectRef ref$ObjectRef8;
        DiagnosticEventRequestOuterClass.DiagnosticAdType diagnosticAdType7;
        WebViewConfiguration webViewConfiguration7;
        AdResponseOuterClass.AdResponse adResponse6;
        String str10;
        UnityAdsLoadOptions unityAdsLoadOptions4;
        String str11;
        int i4;
        CoroutineScope coroutineScope6;
        Object m8023constructorimpl;
        AdObject adObject7;
        CoroutineScope coroutineScope7;
        Ref$ObjectRef ref$ObjectRef9;
        UnityAdsLoadOptions unityAdsLoadOptions5;
        int i5;
        AdObject copy;
        long j2;
        LoadEvent loadEvent;
        ByteString byteString6;
        WebViewConfiguration webViewConfiguration8;
        String str12;
        WebViewConfiguration webViewConfiguration9;
        int i6;
        Object loadUrl;
        AdObject adObject8;
        CoroutineScope coroutineScope8;
        long j3;
        String str13;
        UnityAdsLoadOptions unityAdsLoadOptions6;
        Ref$ObjectRef ref$ObjectRef10;
        Object single;
        WebViewConfiguration webViewConfiguration10;
        AdObject adObject9;
        JSONObject data;
        ByteString byteString7;
        Ref$ObjectRef ref$ObjectRef11;
        if (continuation instanceof AndroidHandleGatewayAdResponse$invoke$1) {
            androidHandleGatewayAdResponse$invoke$1 = (AndroidHandleGatewayAdResponse$invoke$1) continuation;
            int i7 = androidHandleGatewayAdResponse$invoke$1.label;
            if ((i7 & Integer.MIN_VALUE) != 0) {
                androidHandleGatewayAdResponse$invoke$1.label = i7 - Integer.MIN_VALUE;
                Object obj5 = androidHandleGatewayAdResponse$invoke$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                switch (androidHandleGatewayAdResponse$invoke$1.label) {
                    case 0:
                        ResultKt.throwOnFailure(obj5);
                        Ref$ObjectRef ref$ObjectRef12 = new Ref$ObjectRef();
                        try {
                        } catch (CancellationException e) {
                            e = e;
                            byteString3 = byteString;
                        }
                        try {
                            if (adResponse.hasError()) {
                                ErrorOuterClass.PublicErrorCode errorCode = adResponse.getError().getErrorCode();
                                Intrinsics.checkNotNullExpressionValue(errorCode, "getErrorCode(...)");
                                ErrorOuterClass.Error error = adResponse.getError();
                                if (error != null) {
                                    ErrorOuterClass.PublicErrorCode errorCode2 = error.getErrorCode();
                                    if (errorCode2 != null) {
                                        errorText = UnityAdsErrorKt.getLoadErrorMsg(errorCode2);
                                        if (errorText == null) {
                                        }
                                        String str14 = errorText;
                                        String errorText2 = adResponse.getError().getErrorText();
                                        ErrorOuterClass.Error error2 = adResponse.getError();
                                        Intrinsics.checkNotNullExpressionValue(error2, "getError(...)");
                                        return new LoadResult.Failure(errorCode, str14, null, "gateway", errorText2, ErrorExtensionsKt.getErrorTokenOrNull(error2), 4, null);
                                    }
                                }
                                errorText = adResponse.getError().getErrorText();
                                String str142 = errorText;
                                String errorText22 = adResponse.getError().getErrorText();
                                ErrorOuterClass.Error error22 = adResponse.getError();
                                Intrinsics.checkNotNullExpressionValue(error22, "getError(...)");
                                return new LoadResult.Failure(errorCode, str142, null, "gateway", errorText22, ErrorExtensionsKt.getErrorTokenOrNull(error22), 4, null);
                            }
                            if (adResponse.getAdData().isEmpty()) {
                                return new LoadResult.Failure(ErrorOuterClass.PublicErrorCode.PUBLIC_ERROR_CODE_LOAD_NO_FILL, UnityAdsErrorKt.MSG_BOLD_LOAD_FAIL_NO_FILL, null, "no_fill", null, null, 52, null);
                            }
                            GetLatestWebViewConfiguration getLatestWebViewConfiguration = this.getLatestWebViewConfiguration;
                            String entryPoint = adResponse.getWebviewConfiguration().getEntryPoint();
                            Integer boxInt = Boxing.boxInt(adResponse.getWebviewConfiguration().getVersion());
                            List<String> additionalFilesList = adResponse.getWebviewConfiguration().getAdditionalFilesList();
                            String type = adResponse.getWebviewConfiguration().getType();
                            androidHandleGatewayAdResponse$invoke$1.L$0 = unityAdsLoadOptions;
                            byteString3 = byteString;
                            try {
                                androidHandleGatewayAdResponse$invoke$1.L$1 = byteString3;
                                adResponse2 = adResponse;
                            } catch (CancellationException e2) {
                                e = e2;
                                adResponse2 = adResponse;
                                obj = coroutine_suspended;
                                ref$ObjectRef = ref$ObjectRef12;
                                byteString2 = byteString3;
                                nonCancellable = NonCancellable.INSTANCE;
                                androidHandleGatewayAdResponse$invoke$5 = new AndroidHandleGatewayAdResponse$invoke$5(this, e, byteString2, adResponse2, ref$ObjectRef, null);
                                androidHandleGatewayAdResponse$invoke$1.L$0 = e;
                                androidHandleGatewayAdResponse$invoke$1.L$1 = null;
                                androidHandleGatewayAdResponse$invoke$1.L$2 = null;
                                androidHandleGatewayAdResponse$invoke$1.L$3 = null;
                                androidHandleGatewayAdResponse$invoke$1.L$4 = null;
                                androidHandleGatewayAdResponse$invoke$1.L$5 = null;
                                androidHandleGatewayAdResponse$invoke$1.L$6 = null;
                                androidHandleGatewayAdResponse$invoke$1.L$7 = null;
                                androidHandleGatewayAdResponse$invoke$1.L$8 = null;
                                androidHandleGatewayAdResponse$invoke$1.L$9 = null;
                                androidHandleGatewayAdResponse$invoke$1.L$10 = null;
                                androidHandleGatewayAdResponse$invoke$1.label = 9;
                                if (BuildersKt.withContext(nonCancellable, androidHandleGatewayAdResponse$invoke$5, androidHandleGatewayAdResponse$invoke$1) != obj) {
                                }
                            }
                            try {
                                androidHandleGatewayAdResponse$invoke$1.L$2 = adResponse2;
                                androidHandleGatewayAdResponse$invoke$1.L$3 = str;
                                androidHandleGatewayAdResponse$invoke$1.L$4 = diagnosticAdType;
                                androidHandleGatewayAdResponse$invoke$1.L$5 = ref$ObjectRef12;
                                z3 = z;
                                androidHandleGatewayAdResponse$invoke$1.Z$0 = z3;
                                androidHandleGatewayAdResponse$invoke$1.Z$1 = z2;
                                androidHandleGatewayAdResponse$invoke$1.label = 1;
                                Object invoke = getLatestWebViewConfiguration.invoke(entryPoint, boxInt, additionalFilesList, type, androidHandleGatewayAdResponse$invoke$1);
                                if (invoke == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                                ref$ObjectRef2 = ref$ObjectRef12;
                                byteString4 = byteString3;
                                adResponse3 = adResponse2;
                                str2 = str;
                                diagnosticAdType2 = diagnosticAdType;
                                unityAdsLoadOptions2 = unityAdsLoadOptions;
                                obj5 = invoke;
                                z4 = z2;
                                try {
                                    WebViewConfiguration webViewConfiguration11 = (WebViewConfiguration) obj5;
                                    CoroutineScope plus = CoroutineScopeKt.plus(this.adPlayerScope, new CoroutineOpportunity(byteString4));
                                    if (!z4) {
                                        adObject = this.adRepository.getAd(byteString4);
                                        if (adObject == null) {
                                            return new LoadResult.Failure(ErrorOuterClass.PublicErrorCode.PUBLIC_ERROR_CODE_UNSPECIFIED, UnityAdsConstants.Messages.MSG_INTERNAL_ERROR, null, "webviewless_ad_not_found", null, null, 52, null);
                                        }
                                    } else {
                                        ByteString trackingToken = adResponse3.getTrackingToken();
                                        Intrinsics.checkNotNullExpressionValue(trackingToken, "getTrackingToken(...)");
                                        adObject = new AdObject(plus, byteString4, str2, trackingToken, false, null, null, null, unityAdsLoadOptions2, z3, diagnosticAdType2, null, null, null, null, null, null, 129264, null);
                                    }
                                    if (!this.sessionRepository.getNativeConfiguration().getFeatureFlags().getUseOptimisticWebviewCache()) {
                                        try {
                                            SendDiagnosticEvent.DefaultImpls.invoke$default(this.sendDiagnosticEvent, DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_WEBVIEW_CACHE_WARM_STARTED, (Double) null, (Map) null, (Map) null, adObject, (Integer) null, (ByteString) null, 110, (Object) null);
                                            obj2 = coroutine_suspended;
                                            try {
                                                m8186markNowz9LOYto = TimeSource$Monotonic.INSTANCE.m8186markNowz9LOYto();
                                            } catch (CancellationException e3) {
                                                e = e3;
                                            }
                                            try {
                                                CacheWebViewAssets cacheWebViewAssets = this.cacheWebViewAssets;
                                                androidHandleGatewayAdResponse$invoke$1.L$0 = unityAdsLoadOptions2;
                                                androidHandleGatewayAdResponse$invoke$1.L$1 = byteString4;
                                                androidHandleGatewayAdResponse$invoke$1.L$2 = adResponse3;
                                                androidHandleGatewayAdResponse$invoke$1.L$3 = str2;
                                                androidHandleGatewayAdResponse$invoke$1.L$4 = diagnosticAdType2;
                                                androidHandleGatewayAdResponse$invoke$1.L$5 = ref$ObjectRef2;
                                                androidHandleGatewayAdResponse$invoke$1.L$6 = webViewConfiguration11;
                                                androidHandleGatewayAdResponse$invoke$1.L$7 = plus;
                                                androidHandleGatewayAdResponse$invoke$1.L$8 = adObject;
                                                androidHandleGatewayAdResponse$invoke$1.Z$0 = z3;
                                                androidHandleGatewayAdResponse$invoke$1.Z$1 = z4;
                                                androidHandleGatewayAdResponse$invoke$1.J$0 = m8186markNowz9LOYto;
                                                boolean z17 = z4;
                                                androidHandleGatewayAdResponse$invoke$1.label = 2;
                                                Object warmFromDisk = cacheWebViewAssets.warmFromDisk(webViewConfiguration11, androidHandleGatewayAdResponse$invoke$1);
                                                obj2 = obj2;
                                                if (warmFromDisk == obj2) {
                                                    return obj2;
                                                }
                                                str3 = str2;
                                                adObject2 = adObject;
                                                coroutineScope = plus;
                                                Ref$ObjectRef ref$ObjectRef13 = ref$ObjectRef2;
                                                z5 = z17;
                                                webViewConfiguration = webViewConfiguration11;
                                                obj5 = warmFromDisk;
                                                ref$ObjectRef3 = ref$ObjectRef13;
                                                j = m8186markNowz9LOYto;
                                                boolean z18 = z3;
                                                diagnosticAdType3 = diagnosticAdType2;
                                                z6 = z18;
                                                try {
                                                    boolean z19 = z6;
                                                    z8 = z5;
                                                    timedValue = new TimedValue(Boxing.boxBoolean(((Boolean) obj5).booleanValue()), TimeSource$Monotonic.ValueTimeMark.m8189elapsedNowUwyO8pc(j), null);
                                                    adObject3 = adObject2;
                                                    coroutineScope2 = coroutineScope;
                                                    diagnosticAdType4 = diagnosticAdType3;
                                                    str4 = str3;
                                                    z7 = z19;
                                                    booleanValue = timedValue != null ? ((Boolean) timedValue.getValue()).booleanValue() : 0;
                                                    if (timedValue != null) {
                                                        obj3 = obj2;
                                                        try {
                                                            SendDiagnosticEvent sendDiagnosticEvent = this.sendDiagnosticEvent;
                                                            if (booleanValue != 0) {
                                                                diagnosticEventType = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_WEBVIEW_CACHE_WARM_SUCCESS_TIME;
                                                            } else {
                                                                diagnosticEventType = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_WEBVIEW_CACHE_WARM_FAILURE_TIME;
                                                            }
                                                            z9 = z8;
                                                            z10 = z7;
                                                            SendDiagnosticEvent.DefaultImpls.invoke$default(sendDiagnosticEvent, diagnosticEventType, Boxing.boxDouble(Duration.m8166toDoubleimpl(timedValue.m8199getDurationUwyO8pc(), DurationUnit.MILLISECONDS)), (Map) null, (Map) null, adObject3, (Integer) null, (ByteString) null, 108, (Object) null);
                                                        } catch (CancellationException e4) {
                                                            e = e4;
                                                            adResponse2 = adResponse3;
                                                            byteString2 = byteString4;
                                                            ref$ObjectRef = ref$ObjectRef3;
                                                            obj = obj3;
                                                            nonCancellable = NonCancellable.INSTANCE;
                                                            androidHandleGatewayAdResponse$invoke$5 = new AndroidHandleGatewayAdResponse$invoke$5(this, e, byteString2, adResponse2, ref$ObjectRef, null);
                                                            androidHandleGatewayAdResponse$invoke$1.L$0 = e;
                                                            androidHandleGatewayAdResponse$invoke$1.L$1 = null;
                                                            androidHandleGatewayAdResponse$invoke$1.L$2 = null;
                                                            androidHandleGatewayAdResponse$invoke$1.L$3 = null;
                                                            androidHandleGatewayAdResponse$invoke$1.L$4 = null;
                                                            androidHandleGatewayAdResponse$invoke$1.L$5 = null;
                                                            androidHandleGatewayAdResponse$invoke$1.L$6 = null;
                                                            androidHandleGatewayAdResponse$invoke$1.L$7 = null;
                                                            androidHandleGatewayAdResponse$invoke$1.L$8 = null;
                                                            androidHandleGatewayAdResponse$invoke$1.L$9 = null;
                                                            androidHandleGatewayAdResponse$invoke$1.L$10 = null;
                                                            androidHandleGatewayAdResponse$invoke$1.label = 9;
                                                            if (BuildersKt.withContext(nonCancellable, androidHandleGatewayAdResponse$invoke$5, androidHandleGatewayAdResponse$invoke$1) != obj) {
                                                            }
                                                        }
                                                    } else {
                                                        z9 = z8;
                                                        z10 = z7;
                                                        obj3 = obj2;
                                                    }
                                                    if (booleanValue == 0) {
                                                        try {
                                                            CacheWebViewAssets cacheWebViewAssets2 = this.cacheWebViewAssets;
                                                            androidHandleGatewayAdResponse$invoke$1.L$0 = unityAdsLoadOptions2;
                                                            androidHandleGatewayAdResponse$invoke$1.L$1 = byteString4;
                                                            androidHandleGatewayAdResponse$invoke$1.L$2 = adResponse3;
                                                            androidHandleGatewayAdResponse$invoke$1.L$3 = str4;
                                                            androidHandleGatewayAdResponse$invoke$1.L$4 = diagnosticAdType4;
                                                            androidHandleGatewayAdResponse$invoke$1.L$5 = ref$ObjectRef3;
                                                            androidHandleGatewayAdResponse$invoke$1.L$6 = webViewConfiguration;
                                                            androidHandleGatewayAdResponse$invoke$1.L$7 = coroutineScope2;
                                                            androidHandleGatewayAdResponse$invoke$1.L$8 = adObject3;
                                                            boolean z20 = z10;
                                                            androidHandleGatewayAdResponse$invoke$1.Z$0 = z20;
                                                            boolean z21 = z9;
                                                            androidHandleGatewayAdResponse$invoke$1.Z$1 = z21;
                                                            androidHandleGatewayAdResponse$invoke$1.I$0 = booleanValue;
                                                            androidHandleGatewayAdResponse$invoke$1.label = 3;
                                                            obj2 = obj3;
                                                            if (CacheWebViewAssets.DefaultImpls.invoke$default(cacheWebViewAssets2, webViewConfiguration, false, androidHandleGatewayAdResponse$invoke$1, 2, null) == obj2) {
                                                                return obj2;
                                                            }
                                                            i = booleanValue;
                                                            byteString2 = byteString4;
                                                            unityAdsLoadOptions3 = unityAdsLoadOptions2;
                                                            ref$ObjectRef4 = ref$ObjectRef3;
                                                            WebViewConfiguration webViewConfiguration12 = webViewConfiguration;
                                                            str5 = str4;
                                                            adResponse4 = adResponse3;
                                                            webViewConfiguration2 = webViewConfiguration12;
                                                            z11 = z20;
                                                            z12 = z21;
                                                            adResponse5 = adResponse4;
                                                            boolean z22 = z11;
                                                            i2 = i;
                                                            adObject4 = adObject3;
                                                            z13 = z12;
                                                            coroutineScope3 = coroutineScope2;
                                                            webViewConfiguration3 = webViewConfiguration2;
                                                            ref$ObjectRef5 = ref$ObjectRef4;
                                                            diagnosticAdType5 = diagnosticAdType4;
                                                            z14 = z22;
                                                            try {
                                                                if (webViewConfiguration3.getEntryPoint().length() == 0) {
                                                                    try {
                                                                        return new LoadResult.Failure(ErrorOuterClass.PublicErrorCode.PUBLIC_ERROR_CODE_UNSPECIFIED, UnityAdsConstants.Messages.MSG_INTERNAL_ERROR, null, "no_webview_entry_point", null, null, 52, null);
                                                                    } catch (CancellationException e5) {
                                                                        e = e5;
                                                                        ref$ObjectRef = ref$ObjectRef5;
                                                                        adResponse2 = adResponse5;
                                                                        obj = obj2;
                                                                        nonCancellable = NonCancellable.INSTANCE;
                                                                        androidHandleGatewayAdResponse$invoke$5 = new AndroidHandleGatewayAdResponse$invoke$5(this, e, byteString2, adResponse2, ref$ObjectRef, null);
                                                                        androidHandleGatewayAdResponse$invoke$1.L$0 = e;
                                                                        androidHandleGatewayAdResponse$invoke$1.L$1 = null;
                                                                        androidHandleGatewayAdResponse$invoke$1.L$2 = null;
                                                                        androidHandleGatewayAdResponse$invoke$1.L$3 = null;
                                                                        androidHandleGatewayAdResponse$invoke$1.L$4 = null;
                                                                        androidHandleGatewayAdResponse$invoke$1.L$5 = null;
                                                                        androidHandleGatewayAdResponse$invoke$1.L$6 = null;
                                                                        androidHandleGatewayAdResponse$invoke$1.L$7 = null;
                                                                        androidHandleGatewayAdResponse$invoke$1.L$8 = null;
                                                                        androidHandleGatewayAdResponse$invoke$1.L$9 = null;
                                                                        androidHandleGatewayAdResponse$invoke$1.L$10 = null;
                                                                        androidHandleGatewayAdResponse$invoke$1.label = 9;
                                                                        if (BuildersKt.withContext(nonCancellable, androidHandleGatewayAdResponse$invoke$5, androidHandleGatewayAdResponse$invoke$1) != obj) {
                                                                        }
                                                                    }
                                                                } else {
                                                                    String configUrl = SdkProperties.getConfigUrl();
                                                                    Intrinsics.checkNotNull(configUrl);
                                                                    int i8 = i2;
                                                                    AdObject adObject10 = adObject4;
                                                                    boolean z23 = z14;
                                                                    obj3 = obj2;
                                                                    try {
                                                                        if (!StringsKt.endsWith$default(configUrl, ".html", false, 2, (Object) null)) {
                                                                            configUrl = null;
                                                                        }
                                                                        if (configUrl == null) {
                                                                            try {
                                                                                configUrl = webViewConfiguration3.getEntryPoint();
                                                                            } catch (CancellationException e6) {
                                                                                e = e6;
                                                                                ref$ObjectRef = ref$ObjectRef5;
                                                                                adResponse2 = adResponse5;
                                                                                obj = obj3;
                                                                                nonCancellable = NonCancellable.INSTANCE;
                                                                                androidHandleGatewayAdResponse$invoke$5 = new AndroidHandleGatewayAdResponse$invoke$5(this, e, byteString2, adResponse2, ref$ObjectRef, null);
                                                                                androidHandleGatewayAdResponse$invoke$1.L$0 = e;
                                                                                androidHandleGatewayAdResponse$invoke$1.L$1 = null;
                                                                                androidHandleGatewayAdResponse$invoke$1.L$2 = null;
                                                                                androidHandleGatewayAdResponse$invoke$1.L$3 = null;
                                                                                androidHandleGatewayAdResponse$invoke$1.L$4 = null;
                                                                                androidHandleGatewayAdResponse$invoke$1.L$5 = null;
                                                                                androidHandleGatewayAdResponse$invoke$1.L$6 = null;
                                                                                androidHandleGatewayAdResponse$invoke$1.L$7 = null;
                                                                                androidHandleGatewayAdResponse$invoke$1.L$8 = null;
                                                                                androidHandleGatewayAdResponse$invoke$1.L$9 = null;
                                                                                androidHandleGatewayAdResponse$invoke$1.L$10 = null;
                                                                                androidHandleGatewayAdResponse$invoke$1.label = 9;
                                                                                if (BuildersKt.withContext(nonCancellable, androidHandleGatewayAdResponse$invoke$5, androidHandleGatewayAdResponse$invoke$1) != obj) {
                                                                                }
                                                                            }
                                                                        }
                                                                        try {
                                                                            URI uri = new URI(configUrl);
                                                                            StringBuilder sb2 = new StringBuilder();
                                                                            sb2.append("?platform=android&mode=ad-viewer&webviewType=");
                                                                            sb2.append(webViewConfiguration3.getType());
                                                                            sb2.append('&');
                                                                            String query = uri.getQuery();
                                                                            if (query == null) {
                                                                                query = "";
                                                                            }
                                                                            sb2.append(query);
                                                                            String sb3 = sb2.toString();
                                                                            StringBuilder sb4 = new StringBuilder();
                                                                            webViewConfiguration4 = webViewConfiguration3;
                                                                            sb4.append(StringsKt.substringBeforeLast$default(configUrl, "?", (String) null, 2, (Object) null));
                                                                            sb4.append(sb3);
                                                                            sb = sb4.toString();
                                                                            if (!z13) {
                                                                                try {
                                                                                    if (diagnosticAdType5 != DiagnosticEventRequestOuterClass.DiagnosticAdType.DIAGNOSTIC_AD_TYPE_BANNER && adResponse5.hasCampaignMetadata() && adResponse5.getCampaignMetadata().getAssetsToCacheCount() > 0) {
                                                                                        WebViewLessLoadStrategy webViewLessLoadStrategy = this.webViewLessLoadStrategy;
                                                                                        androidHandleGatewayAdResponse$invoke$1.L$0 = byteString2;
                                                                                        androidHandleGatewayAdResponse$invoke$1.L$1 = adResponse5;
                                                                                        androidHandleGatewayAdResponse$invoke$1.L$2 = ref$ObjectRef5;
                                                                                        androidHandleGatewayAdResponse$invoke$1.L$3 = null;
                                                                                        androidHandleGatewayAdResponse$invoke$1.L$4 = null;
                                                                                        androidHandleGatewayAdResponse$invoke$1.L$5 = null;
                                                                                        androidHandleGatewayAdResponse$invoke$1.L$6 = null;
                                                                                        androidHandleGatewayAdResponse$invoke$1.L$7 = null;
                                                                                        androidHandleGatewayAdResponse$invoke$1.L$8 = null;
                                                                                        androidHandleGatewayAdResponse$invoke$1.label = 4;
                                                                                        ref$ObjectRef6 = ref$ObjectRef5;
                                                                                        try {
                                                                                            obj5 = webViewLessLoadStrategy.invoke(coroutineScope3, sb, unityAdsLoadOptions3, byteString2, adResponse5, str5, diagnosticAdType5, z23, androidHandleGatewayAdResponse$invoke$1);
                                                                                            return obj5 == obj3 ? obj3 : obj5;
                                                                                        } catch (CancellationException e7) {
                                                                                            e = e7;
                                                                                            obj4 = obj3;
                                                                                            obj = obj4;
                                                                                            adResponse2 = adResponse5;
                                                                                            ref$ObjectRef = ref$ObjectRef6;
                                                                                            nonCancellable = NonCancellable.INSTANCE;
                                                                                            androidHandleGatewayAdResponse$invoke$5 = new AndroidHandleGatewayAdResponse$invoke$5(this, e, byteString2, adResponse2, ref$ObjectRef, null);
                                                                                            androidHandleGatewayAdResponse$invoke$1.L$0 = e;
                                                                                            androidHandleGatewayAdResponse$invoke$1.L$1 = null;
                                                                                            androidHandleGatewayAdResponse$invoke$1.L$2 = null;
                                                                                            androidHandleGatewayAdResponse$invoke$1.L$3 = null;
                                                                                            androidHandleGatewayAdResponse$invoke$1.L$4 = null;
                                                                                            androidHandleGatewayAdResponse$invoke$1.L$5 = null;
                                                                                            androidHandleGatewayAdResponse$invoke$1.L$6 = null;
                                                                                            androidHandleGatewayAdResponse$invoke$1.L$7 = null;
                                                                                            androidHandleGatewayAdResponse$invoke$1.L$8 = null;
                                                                                            androidHandleGatewayAdResponse$invoke$1.L$9 = null;
                                                                                            androidHandleGatewayAdResponse$invoke$1.L$10 = null;
                                                                                            androidHandleGatewayAdResponse$invoke$1.label = 9;
                                                                                            if (BuildersKt.withContext(nonCancellable, androidHandleGatewayAdResponse$invoke$5, androidHandleGatewayAdResponse$invoke$1) != obj) {
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                } catch (CancellationException e8) {
                                                                                    e = e8;
                                                                                    ref$ObjectRef6 = ref$ObjectRef5;
                                                                                }
                                                                            }
                                                                            ref$ObjectRef6 = ref$ObjectRef5;
                                                                            obj4 = obj3;
                                                                        } catch (Throwable unused) {
                                                                            ref$ObjectRef6 = ref$ObjectRef5;
                                                                            obj = obj3;
                                                                            try {
                                                                                return new LoadResult.Failure(ErrorOuterClass.PublicErrorCode.PUBLIC_ERROR_CODE_UNSPECIFIED, UnityAdsConstants.Messages.MSG_INTERNAL_ERROR, null, "invalid_url", configUrl, null, 36, null);
                                                                            } catch (CancellationException e9) {
                                                                                e = e9;
                                                                                adResponse2 = adResponse5;
                                                                                ref$ObjectRef = ref$ObjectRef6;
                                                                                nonCancellable = NonCancellable.INSTANCE;
                                                                                androidHandleGatewayAdResponse$invoke$5 = new AndroidHandleGatewayAdResponse$invoke$5(this, e, byteString2, adResponse2, ref$ObjectRef, null);
                                                                                androidHandleGatewayAdResponse$invoke$1.L$0 = e;
                                                                                androidHandleGatewayAdResponse$invoke$1.L$1 = null;
                                                                                androidHandleGatewayAdResponse$invoke$1.L$2 = null;
                                                                                androidHandleGatewayAdResponse$invoke$1.L$3 = null;
                                                                                androidHandleGatewayAdResponse$invoke$1.L$4 = null;
                                                                                androidHandleGatewayAdResponse$invoke$1.L$5 = null;
                                                                                androidHandleGatewayAdResponse$invoke$1.L$6 = null;
                                                                                androidHandleGatewayAdResponse$invoke$1.L$7 = null;
                                                                                androidHandleGatewayAdResponse$invoke$1.L$8 = null;
                                                                                androidHandleGatewayAdResponse$invoke$1.L$9 = null;
                                                                                androidHandleGatewayAdResponse$invoke$1.L$10 = null;
                                                                                androidHandleGatewayAdResponse$invoke$1.label = 9;
                                                                                if (BuildersKt.withContext(nonCancellable, androidHandleGatewayAdResponse$invoke$5, androidHandleGatewayAdResponse$invoke$1) != obj) {
                                                                                }
                                                                            }
                                                                        }
                                                                    } catch (CancellationException e10) {
                                                                        e = e10;
                                                                        ref$ObjectRef6 = ref$ObjectRef5;
                                                                        obj = obj3;
                                                                    }
                                                                    try {
                                                                        boolean z24 = z13;
                                                                        String encodeToString = Base64.encodeToString(adResponse5.getImpressionConfiguration().toByteArray(), 2);
                                                                        m8186markNowz9LOYto2 = TimeSource$Monotonic.INSTANCE.m8186markNowz9LOYto();
                                                                        try {
                                                                            Result.Companion companion = Result.INSTANCE;
                                                                            androidGetWebViewContainerUseCase = this.getWebViewContainerUseCase;
                                                                            adPlayerScope = this.adPlayerScope;
                                                                            androidHandleGatewayAdResponse$invoke$1.L$0 = unityAdsLoadOptions3;
                                                                            androidHandleGatewayAdResponse$invoke$1.L$1 = byteString2;
                                                                            androidHandleGatewayAdResponse$invoke$1.L$2 = adResponse5;
                                                                            androidHandleGatewayAdResponse$invoke$1.L$3 = str5;
                                                                            androidHandleGatewayAdResponse$invoke$1.L$4 = diagnosticAdType5;
                                                                            androidHandleGatewayAdResponse$invoke$1.L$5 = ref$ObjectRef6;
                                                                            webViewConfiguration5 = webViewConfiguration4;
                                                                            try {
                                                                                androidHandleGatewayAdResponse$invoke$1.L$6 = webViewConfiguration5;
                                                                                androidHandleGatewayAdResponse$invoke$1.L$7 = coroutineScope3;
                                                                                coroutineScope4 = coroutineScope3;
                                                                                adObject5 = adObject10;
                                                                                try {
                                                                                    androidHandleGatewayAdResponse$invoke$1.L$8 = adObject5;
                                                                                    androidHandleGatewayAdResponse$invoke$1.L$9 = sb;
                                                                                    str6 = sb;
                                                                                    try {
                                                                                        androidHandleGatewayAdResponse$invoke$1.L$10 = encodeToString;
                                                                                        encodeToString = encodeToString;
                                                                                        try {
                                                                                            androidHandleGatewayAdResponse$invoke$1.Z$0 = z24;
                                                                                            z24 = z24;
                                                                                            i3 = i8;
                                                                                        } catch (Throwable th) {
                                                                                            th = th;
                                                                                            z24 = z24;
                                                                                        }
                                                                                    } catch (Throwable th2) {
                                                                                        th = th2;
                                                                                        encodeToString = encodeToString;
                                                                                    }
                                                                                } catch (Throwable th3) {
                                                                                    th = th3;
                                                                                    str6 = sb;
                                                                                }
                                                                            } catch (Throwable th4) {
                                                                                th = th4;
                                                                                coroutineScope4 = coroutineScope3;
                                                                                str6 = sb;
                                                                                adObject5 = adObject10;
                                                                                z15 = z24;
                                                                                coroutineScope5 = coroutineScope4;
                                                                                webViewConfiguration6 = webViewConfiguration5;
                                                                                i3 = i8;
                                                                                str7 = str6;
                                                                                diagnosticAdType6 = diagnosticAdType5;
                                                                                str8 = encodeToString;
                                                                                Result.Companion companion2 = Result.INSTANCE;
                                                                                z16 = z15;
                                                                                ref$ObjectRef8 = ref$ObjectRef6;
                                                                                diagnosticAdType7 = diagnosticAdType6;
                                                                                webViewConfiguration7 = webViewConfiguration6;
                                                                                adResponse6 = adResponse5;
                                                                                str10 = str7;
                                                                                unityAdsLoadOptions4 = unityAdsLoadOptions3;
                                                                                str11 = str5;
                                                                                i4 = i3;
                                                                                coroutineScope6 = coroutineScope5;
                                                                                AdObject adObject11 = adObject5;
                                                                                m8023constructorimpl = Result.m8023constructorimpl(ResultKt.createFailure(th));
                                                                                adObject7 = adObject11;
                                                                                try {
                                                                                    String str15 = str10;
                                                                                    CoroutineScope coroutineScope9 = coroutineScope6;
                                                                                    TimedValue timedValue2 = new TimedValue(Result.m8022boximpl(m8023constructorimpl), TimeSource$Monotonic.ValueTimeMark.m8189elapsedNowUwyO8pc(m8186markNowz9LOYto2), null);
                                                                                    coroutineScope7 = coroutineScope9;
                                                                                    ref$ObjectRef9 = ref$ObjectRef8;
                                                                                    String str16 = str11;
                                                                                    String str17 = str8;
                                                                                    unityAdsLoadOptions5 = unityAdsLoadOptions4;
                                                                                    i5 = i4;
                                                                                    try {
                                                                                        SendDiagnosticEvent.DefaultImpls.invoke$default(this.sendDiagnosticEvent, Result.m8029isSuccessimpl(((Result) timedValue2.component1()).getValue()) ? DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_WEBVIEW_SUCCESS_TIME : DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_WEBVIEW_FAILURE_TIME, Boxing.boxDouble(Duration.m8166toDoubleimpl(timedValue2.m8198component2UwyO8pc(), DurationUnit.MILLISECONDS)), (Map) null, (Map) null, adObject7, (Integer) null, (ByteString) null, 108, (Object) null);
                                                                                        Object value = ((Result) timedValue2.getValue()).getValue();
                                                                                        ResultKt.throwOnFailure(value);
                                                                                        AndroidWebViewContainer androidWebViewContainer = (AndroidWebViewContainer) value;
                                                                                        WebViewBridge invoke2 = this.getWebViewBridge.invoke(androidWebViewContainer, this.adPlayerScope);
                                                                                        ?? invoke3 = this.getAdPlayer.invoke(invoke2, androidWebViewContainer, adObject7, diagnosticAdType7);
                                                                                        ref$ObjectRef = ref$ObjectRef9;
                                                                                        try {
                                                                                            ref$ObjectRef.element = invoke3;
                                                                                            copy = r17.copy((r35 & 1) != 0 ? r17.adScope : adObject7.getAdScope(), (r35 & 2) != 0 ? r17.opportunityId : null, (r35 & 4) != 0 ? r17.placementId : null, (r35 & 8) != 0 ? r17.trackingToken : null, (r35 & 16) != 0 ? r17.isOfferwallAd : false, (r35 & 32) != 0 ? r17.offerwallPlacementName : null, (r35 & 64) != 0 ? r17.adPlayer : (AdPlayer) invoke3, (r35 & 128) != 0 ? r17.playerServerId : null, (r35 & 256) != 0 ? r17.loadOptions : null, (r35 & 512) != 0 ? r17.isHeaderBidding : false, (r35 & 1024) != 0 ? r17.adType : null, (r35 & 2048) != 0 ? r17.ttl : null, (r35 & 4096) != 0 ? r17.state : null, (r35 & 8192) != 0 ? r17.loadConfiguration : null, (r35 & 16384) != 0 ? r17.showConfiguration : null, (r35 & 32768) != 0 ? r17.activity : null, (r35 & 65536) != 0 ? adObject7.webViewLessLoadingRequiredData : adObject7.getWebViewLessLoadingRequiredData());
                                                                                            FlowKt.launchIn(FlowKt.onEach(this.deviceInfoRepository.getAllowedPii(), new AndroidHandleGatewayAdResponse$invoke$2(ref$ObjectRef, null)), ((AdPlayer) ref$ObjectRef.element).getScope());
                                                                                            long m8186markNowz9LOYto3 = TimeSource$Monotonic.INSTANCE.m8186markNowz9LOYto();
                                                                                            SendDiagnosticEvent.DefaultImpls.invoke$default(this.sendDiagnosticEvent, DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_LOAD_STARTED_AD_VIEWER, (Double) null, (Map) null, (Map) null, copy, (Integer) null, (ByteString) null, 110, (Object) null);
                                                                                            HandleInvocationsFromAdViewer handleInvocationsFromAdViewer = this.getHandleInvocationsFromAdViewer;
                                                                                            ByteString adData = adResponse6.getAdData();
                                                                                            Intrinsics.checkNotNullExpressionValue(adData, "getAdData(...)");
                                                                                            obj3 = obj4;
                                                                                        } catch (CancellationException e11) {
                                                                                            e = e11;
                                                                                            obj = obj4;
                                                                                        }
                                                                                    } catch (CancellationException e12) {
                                                                                        e = e12;
                                                                                        obj = obj4;
                                                                                        ref$ObjectRef = ref$ObjectRef9;
                                                                                    }
                                                                                    try {
                                                                                        String base64$default = ProtobufExtensionsKt.toBase64$default(adData, false, 1, null);
                                                                                        Intrinsics.checkNotNull(str17);
                                                                                        ByteString adDataRefreshToken = adResponse6.getAdDataRefreshToken();
                                                                                        Intrinsics.checkNotNullExpressionValue(adDataRefreshToken, "getAdDataRefreshToken(...)");
                                                                                        invoke2.setExposedFunctions(handleInvocationsFromAdViewer.invoke(base64$default, ProtobufExtensionsKt.toBase64$default(adDataRefreshToken, false, 1, null), str17, copy));
                                                                                        if (z16) {
                                                                                        }
                                                                                        androidHandleGatewayAdResponse$invoke$1.L$0 = unityAdsLoadOptions5;
                                                                                        androidHandleGatewayAdResponse$invoke$1.L$1 = byteString2;
                                                                                        androidHandleGatewayAdResponse$invoke$1.L$2 = adResponse6;
                                                                                        androidHandleGatewayAdResponse$invoke$1.L$3 = str16;
                                                                                        androidHandleGatewayAdResponse$invoke$1.L$4 = ref$ObjectRef;
                                                                                        webViewConfiguration9 = webViewConfiguration7;
                                                                                        androidHandleGatewayAdResponse$invoke$1.L$5 = webViewConfiguration9;
                                                                                        androidHandleGatewayAdResponse$invoke$1.L$6 = coroutineScope7;
                                                                                        androidHandleGatewayAdResponse$invoke$1.L$7 = copy;
                                                                                        androidHandleGatewayAdResponse$invoke$1.L$8 = null;
                                                                                        androidHandleGatewayAdResponse$invoke$1.L$9 = null;
                                                                                        androidHandleGatewayAdResponse$invoke$1.L$10 = null;
                                                                                        i6 = i5;
                                                                                        androidHandleGatewayAdResponse$invoke$1.I$0 = i6;
                                                                                        androidHandleGatewayAdResponse$invoke$1.J$0 = m8186markNowz9LOYto3;
                                                                                        androidHandleGatewayAdResponse$invoke$1.label = 6;
                                                                                        loadUrl = loadUrl(adObject7, str15, androidWebViewContainer, androidHandleGatewayAdResponse$invoke$1);
                                                                                        obj = obj3;
                                                                                        if (loadUrl == obj) {
                                                                                        }
                                                                                    } catch (CancellationException e13) {
                                                                                        e = e13;
                                                                                        obj = obj3;
                                                                                        adResponse2 = adResponse6;
                                                                                        nonCancellable = NonCancellable.INSTANCE;
                                                                                        androidHandleGatewayAdResponse$invoke$5 = new AndroidHandleGatewayAdResponse$invoke$5(this, e, byteString2, adResponse2, ref$ObjectRef, null);
                                                                                        androidHandleGatewayAdResponse$invoke$1.L$0 = e;
                                                                                        androidHandleGatewayAdResponse$invoke$1.L$1 = null;
                                                                                        androidHandleGatewayAdResponse$invoke$1.L$2 = null;
                                                                                        androidHandleGatewayAdResponse$invoke$1.L$3 = null;
                                                                                        androidHandleGatewayAdResponse$invoke$1.L$4 = null;
                                                                                        androidHandleGatewayAdResponse$invoke$1.L$5 = null;
                                                                                        androidHandleGatewayAdResponse$invoke$1.L$6 = null;
                                                                                        androidHandleGatewayAdResponse$invoke$1.L$7 = null;
                                                                                        androidHandleGatewayAdResponse$invoke$1.L$8 = null;
                                                                                        androidHandleGatewayAdResponse$invoke$1.L$9 = null;
                                                                                        androidHandleGatewayAdResponse$invoke$1.L$10 = null;
                                                                                        androidHandleGatewayAdResponse$invoke$1.label = 9;
                                                                                        if (BuildersKt.withContext(nonCancellable, androidHandleGatewayAdResponse$invoke$5, androidHandleGatewayAdResponse$invoke$1) != obj) {
                                                                                        }
                                                                                    }
                                                                                } catch (CancellationException e14) {
                                                                                    e = e14;
                                                                                    obj = obj4;
                                                                                    ref$ObjectRef = ref$ObjectRef8;
                                                                                }
                                                                            }
                                                                        } catch (Throwable th5) {
                                                                            th = th5;
                                                                            webViewConfiguration5 = webViewConfiguration4;
                                                                        }
                                                                        try {
                                                                            androidHandleGatewayAdResponse$invoke$1.I$0 = i3;
                                                                            androidHandleGatewayAdResponse$invoke$1.J$0 = m8186markNowz9LOYto2;
                                                                            i8 = i3;
                                                                            try {
                                                                                androidHandleGatewayAdResponse$invoke$1.label = 5;
                                                                                obj5 = androidGetWebViewContainerUseCase.invoke(adPlayerScope, adObject5, androidHandleGatewayAdResponse$invoke$1);
                                                                            } catch (Throwable th6) {
                                                                                th = th6;
                                                                                z15 = z24;
                                                                                coroutineScope5 = coroutineScope4;
                                                                                webViewConfiguration6 = webViewConfiguration5;
                                                                                i3 = i8;
                                                                                str7 = str6;
                                                                                diagnosticAdType6 = diagnosticAdType5;
                                                                                str8 = encodeToString;
                                                                                Result.Companion companion22 = Result.INSTANCE;
                                                                                z16 = z15;
                                                                                ref$ObjectRef8 = ref$ObjectRef6;
                                                                                diagnosticAdType7 = diagnosticAdType6;
                                                                                webViewConfiguration7 = webViewConfiguration6;
                                                                                adResponse6 = adResponse5;
                                                                                str10 = str7;
                                                                                unityAdsLoadOptions4 = unityAdsLoadOptions3;
                                                                                str11 = str5;
                                                                                i4 = i3;
                                                                                coroutineScope6 = coroutineScope5;
                                                                                AdObject adObject112 = adObject5;
                                                                                m8023constructorimpl = Result.m8023constructorimpl(ResultKt.createFailure(th));
                                                                                adObject7 = adObject112;
                                                                                String str152 = str10;
                                                                                CoroutineScope coroutineScope92 = coroutineScope6;
                                                                                TimedValue timedValue22 = new TimedValue(Result.m8022boximpl(m8023constructorimpl), TimeSource$Monotonic.ValueTimeMark.m8189elapsedNowUwyO8pc(m8186markNowz9LOYto2), null);
                                                                                coroutineScope7 = coroutineScope92;
                                                                                ref$ObjectRef9 = ref$ObjectRef8;
                                                                                String str162 = str11;
                                                                                String str172 = str8;
                                                                                unityAdsLoadOptions5 = unityAdsLoadOptions4;
                                                                                i5 = i4;
                                                                                SendDiagnosticEvent.DefaultImpls.invoke$default(this.sendDiagnosticEvent, Result.m8029isSuccessimpl(((Result) timedValue22.component1()).getValue()) ? DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_WEBVIEW_SUCCESS_TIME : DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_WEBVIEW_FAILURE_TIME, Boxing.boxDouble(Duration.m8166toDoubleimpl(timedValue22.m8198component2UwyO8pc(), DurationUnit.MILLISECONDS)), (Map) null, (Map) null, adObject7, (Integer) null, (ByteString) null, 108, (Object) null);
                                                                                Object value2 = ((Result) timedValue22.getValue()).getValue();
                                                                                ResultKt.throwOnFailure(value2);
                                                                                AndroidWebViewContainer androidWebViewContainer2 = (AndroidWebViewContainer) value2;
                                                                                WebViewBridge invoke22 = this.getWebViewBridge.invoke(androidWebViewContainer2, this.adPlayerScope);
                                                                                ?? invoke32 = this.getAdPlayer.invoke(invoke22, androidWebViewContainer2, adObject7, diagnosticAdType7);
                                                                                ref$ObjectRef = ref$ObjectRef9;
                                                                                ref$ObjectRef.element = invoke32;
                                                                                copy = r17.copy((r35 & 1) != 0 ? r17.adScope : adObject7.getAdScope(), (r35 & 2) != 0 ? r17.opportunityId : null, (r35 & 4) != 0 ? r17.placementId : null, (r35 & 8) != 0 ? r17.trackingToken : null, (r35 & 16) != 0 ? r17.isOfferwallAd : false, (r35 & 32) != 0 ? r17.offerwallPlacementName : null, (r35 & 64) != 0 ? r17.adPlayer : (AdPlayer) invoke32, (r35 & 128) != 0 ? r17.playerServerId : null, (r35 & 256) != 0 ? r17.loadOptions : null, (r35 & 512) != 0 ? r17.isHeaderBidding : false, (r35 & 1024) != 0 ? r17.adType : null, (r35 & 2048) != 0 ? r17.ttl : null, (r35 & 4096) != 0 ? r17.state : null, (r35 & 8192) != 0 ? r17.loadConfiguration : null, (r35 & 16384) != 0 ? r17.showConfiguration : null, (r35 & 32768) != 0 ? r17.activity : null, (r35 & 65536) != 0 ? adObject7.webViewLessLoadingRequiredData : adObject7.getWebViewLessLoadingRequiredData());
                                                                                FlowKt.launchIn(FlowKt.onEach(this.deviceInfoRepository.getAllowedPii(), new AndroidHandleGatewayAdResponse$invoke$2(ref$ObjectRef, null)), ((AdPlayer) ref$ObjectRef.element).getScope());
                                                                                long m8186markNowz9LOYto32 = TimeSource$Monotonic.INSTANCE.m8186markNowz9LOYto();
                                                                                SendDiagnosticEvent.DefaultImpls.invoke$default(this.sendDiagnosticEvent, DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_LOAD_STARTED_AD_VIEWER, (Double) null, (Map) null, (Map) null, copy, (Integer) null, (ByteString) null, 110, (Object) null);
                                                                                HandleInvocationsFromAdViewer handleInvocationsFromAdViewer2 = this.getHandleInvocationsFromAdViewer;
                                                                                ByteString adData2 = adResponse6.getAdData();
                                                                                Intrinsics.checkNotNullExpressionValue(adData2, "getAdData(...)");
                                                                                obj3 = obj4;
                                                                                String base64$default2 = ProtobufExtensionsKt.toBase64$default(adData2, false, 1, null);
                                                                                Intrinsics.checkNotNull(str172);
                                                                                ByteString adDataRefreshToken2 = adResponse6.getAdDataRefreshToken();
                                                                                Intrinsics.checkNotNullExpressionValue(adDataRefreshToken2, "getAdDataRefreshToken(...)");
                                                                                invoke22.setExposedFunctions(handleInvocationsFromAdViewer2.invoke(base64$default2, ProtobufExtensionsKt.toBase64$default(adDataRefreshToken2, false, 1, null), str172, copy));
                                                                                if (z16) {
                                                                                }
                                                                                androidHandleGatewayAdResponse$invoke$1.L$0 = unityAdsLoadOptions5;
                                                                                androidHandleGatewayAdResponse$invoke$1.L$1 = byteString2;
                                                                                androidHandleGatewayAdResponse$invoke$1.L$2 = adResponse6;
                                                                                androidHandleGatewayAdResponse$invoke$1.L$3 = str162;
                                                                                androidHandleGatewayAdResponse$invoke$1.L$4 = ref$ObjectRef;
                                                                                webViewConfiguration9 = webViewConfiguration7;
                                                                                androidHandleGatewayAdResponse$invoke$1.L$5 = webViewConfiguration9;
                                                                                androidHandleGatewayAdResponse$invoke$1.L$6 = coroutineScope7;
                                                                                androidHandleGatewayAdResponse$invoke$1.L$7 = copy;
                                                                                androidHandleGatewayAdResponse$invoke$1.L$8 = null;
                                                                                androidHandleGatewayAdResponse$invoke$1.L$9 = null;
                                                                                androidHandleGatewayAdResponse$invoke$1.L$10 = null;
                                                                                i6 = i5;
                                                                                androidHandleGatewayAdResponse$invoke$1.I$0 = i6;
                                                                                androidHandleGatewayAdResponse$invoke$1.J$0 = m8186markNowz9LOYto32;
                                                                                androidHandleGatewayAdResponse$invoke$1.label = 6;
                                                                                loadUrl = loadUrl(adObject7, str152, androidWebViewContainer2, androidHandleGatewayAdResponse$invoke$1);
                                                                                obj = obj3;
                                                                                if (loadUrl == obj) {
                                                                                }
                                                                            }
                                                                        } catch (Throwable th7) {
                                                                            th = th7;
                                                                            z15 = z24;
                                                                            coroutineScope5 = coroutineScope4;
                                                                            webViewConfiguration6 = webViewConfiguration5;
                                                                            str7 = str6;
                                                                            diagnosticAdType6 = diagnosticAdType5;
                                                                            str8 = encodeToString;
                                                                            Result.Companion companion222 = Result.INSTANCE;
                                                                            z16 = z15;
                                                                            ref$ObjectRef8 = ref$ObjectRef6;
                                                                            diagnosticAdType7 = diagnosticAdType6;
                                                                            webViewConfiguration7 = webViewConfiguration6;
                                                                            adResponse6 = adResponse5;
                                                                            str10 = str7;
                                                                            unityAdsLoadOptions4 = unityAdsLoadOptions3;
                                                                            str11 = str5;
                                                                            i4 = i3;
                                                                            coroutineScope6 = coroutineScope5;
                                                                            AdObject adObject1122 = adObject5;
                                                                            m8023constructorimpl = Result.m8023constructorimpl(ResultKt.createFailure(th));
                                                                            adObject7 = adObject1122;
                                                                            String str1522 = str10;
                                                                            CoroutineScope coroutineScope922 = coroutineScope6;
                                                                            TimedValue timedValue222 = new TimedValue(Result.m8022boximpl(m8023constructorimpl), TimeSource$Monotonic.ValueTimeMark.m8189elapsedNowUwyO8pc(m8186markNowz9LOYto2), null);
                                                                            coroutineScope7 = coroutineScope922;
                                                                            ref$ObjectRef9 = ref$ObjectRef8;
                                                                            String str1622 = str11;
                                                                            String str1722 = str8;
                                                                            unityAdsLoadOptions5 = unityAdsLoadOptions4;
                                                                            i5 = i4;
                                                                            SendDiagnosticEvent.DefaultImpls.invoke$default(this.sendDiagnosticEvent, Result.m8029isSuccessimpl(((Result) timedValue222.component1()).getValue()) ? DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_WEBVIEW_SUCCESS_TIME : DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_WEBVIEW_FAILURE_TIME, Boxing.boxDouble(Duration.m8166toDoubleimpl(timedValue222.m8198component2UwyO8pc(), DurationUnit.MILLISECONDS)), (Map) null, (Map) null, adObject7, (Integer) null, (ByteString) null, 108, (Object) null);
                                                                            Object value22 = ((Result) timedValue222.getValue()).getValue();
                                                                            ResultKt.throwOnFailure(value22);
                                                                            AndroidWebViewContainer androidWebViewContainer22 = (AndroidWebViewContainer) value22;
                                                                            WebViewBridge invoke222 = this.getWebViewBridge.invoke(androidWebViewContainer22, this.adPlayerScope);
                                                                            ?? invoke322 = this.getAdPlayer.invoke(invoke222, androidWebViewContainer22, adObject7, diagnosticAdType7);
                                                                            ref$ObjectRef = ref$ObjectRef9;
                                                                            ref$ObjectRef.element = invoke322;
                                                                            copy = r17.copy((r35 & 1) != 0 ? r17.adScope : adObject7.getAdScope(), (r35 & 2) != 0 ? r17.opportunityId : null, (r35 & 4) != 0 ? r17.placementId : null, (r35 & 8) != 0 ? r17.trackingToken : null, (r35 & 16) != 0 ? r17.isOfferwallAd : false, (r35 & 32) != 0 ? r17.offerwallPlacementName : null, (r35 & 64) != 0 ? r17.adPlayer : (AdPlayer) invoke322, (r35 & 128) != 0 ? r17.playerServerId : null, (r35 & 256) != 0 ? r17.loadOptions : null, (r35 & 512) != 0 ? r17.isHeaderBidding : false, (r35 & 1024) != 0 ? r17.adType : null, (r35 & 2048) != 0 ? r17.ttl : null, (r35 & 4096) != 0 ? r17.state : null, (r35 & 8192) != 0 ? r17.loadConfiguration : null, (r35 & 16384) != 0 ? r17.showConfiguration : null, (r35 & 32768) != 0 ? r17.activity : null, (r35 & 65536) != 0 ? adObject7.webViewLessLoadingRequiredData : adObject7.getWebViewLessLoadingRequiredData());
                                                                            FlowKt.launchIn(FlowKt.onEach(this.deviceInfoRepository.getAllowedPii(), new AndroidHandleGatewayAdResponse$invoke$2(ref$ObjectRef, null)), ((AdPlayer) ref$ObjectRef.element).getScope());
                                                                            long m8186markNowz9LOYto322 = TimeSource$Monotonic.INSTANCE.m8186markNowz9LOYto();
                                                                            SendDiagnosticEvent.DefaultImpls.invoke$default(this.sendDiagnosticEvent, DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_LOAD_STARTED_AD_VIEWER, (Double) null, (Map) null, (Map) null, copy, (Integer) null, (ByteString) null, 110, (Object) null);
                                                                            HandleInvocationsFromAdViewer handleInvocationsFromAdViewer22 = this.getHandleInvocationsFromAdViewer;
                                                                            ByteString adData22 = adResponse6.getAdData();
                                                                            Intrinsics.checkNotNullExpressionValue(adData22, "getAdData(...)");
                                                                            obj3 = obj4;
                                                                            String base64$default22 = ProtobufExtensionsKt.toBase64$default(adData22, false, 1, null);
                                                                            Intrinsics.checkNotNull(str1722);
                                                                            ByteString adDataRefreshToken22 = adResponse6.getAdDataRefreshToken();
                                                                            Intrinsics.checkNotNullExpressionValue(adDataRefreshToken22, "getAdDataRefreshToken(...)");
                                                                            invoke222.setExposedFunctions(handleInvocationsFromAdViewer22.invoke(base64$default22, ProtobufExtensionsKt.toBase64$default(adDataRefreshToken22, false, 1, null), str1722, copy));
                                                                            if (z16) {
                                                                            }
                                                                            androidHandleGatewayAdResponse$invoke$1.L$0 = unityAdsLoadOptions5;
                                                                            androidHandleGatewayAdResponse$invoke$1.L$1 = byteString2;
                                                                            androidHandleGatewayAdResponse$invoke$1.L$2 = adResponse6;
                                                                            androidHandleGatewayAdResponse$invoke$1.L$3 = str1622;
                                                                            androidHandleGatewayAdResponse$invoke$1.L$4 = ref$ObjectRef;
                                                                            webViewConfiguration9 = webViewConfiguration7;
                                                                            androidHandleGatewayAdResponse$invoke$1.L$5 = webViewConfiguration9;
                                                                            androidHandleGatewayAdResponse$invoke$1.L$6 = coroutineScope7;
                                                                            androidHandleGatewayAdResponse$invoke$1.L$7 = copy;
                                                                            androidHandleGatewayAdResponse$invoke$1.L$8 = null;
                                                                            androidHandleGatewayAdResponse$invoke$1.L$9 = null;
                                                                            androidHandleGatewayAdResponse$invoke$1.L$10 = null;
                                                                            i6 = i5;
                                                                            androidHandleGatewayAdResponse$invoke$1.I$0 = i6;
                                                                            androidHandleGatewayAdResponse$invoke$1.J$0 = m8186markNowz9LOYto322;
                                                                            androidHandleGatewayAdResponse$invoke$1.label = 6;
                                                                            loadUrl = loadUrl(adObject7, str1522, androidWebViewContainer22, androidHandleGatewayAdResponse$invoke$1);
                                                                            obj = obj3;
                                                                            if (loadUrl == obj) {
                                                                            }
                                                                        }
                                                                        if (obj5 == obj4) {
                                                                            return obj4;
                                                                        }
                                                                        z15 = z24;
                                                                        coroutineScope5 = coroutineScope4;
                                                                        webViewConfiguration6 = webViewConfiguration5;
                                                                        i3 = i8;
                                                                        str7 = str6;
                                                                        diagnosticAdType6 = diagnosticAdType5;
                                                                        str8 = encodeToString;
                                                                        String str18 = str5;
                                                                        adObject6 = adObject5;
                                                                        byteString5 = byteString2;
                                                                        ref$ObjectRef7 = ref$ObjectRef6;
                                                                        str9 = str18;
                                                                        try {
                                                                            z16 = z15;
                                                                            ref$ObjectRef8 = ref$ObjectRef7;
                                                                            diagnosticAdType7 = diagnosticAdType6;
                                                                            webViewConfiguration7 = webViewConfiguration6;
                                                                            byteString2 = byteString5;
                                                                            m8023constructorimpl = Result.m8023constructorimpl((AndroidWebViewContainer) obj5);
                                                                            adObject7 = adObject6;
                                                                            i4 = i3;
                                                                            coroutineScope6 = coroutineScope5;
                                                                            String str19 = str7;
                                                                            unityAdsLoadOptions4 = unityAdsLoadOptions3;
                                                                            str11 = str9;
                                                                            adResponse6 = adResponse5;
                                                                            str10 = str19;
                                                                        } catch (Throwable th8) {
                                                                            th = th8;
                                                                            Ref$ObjectRef ref$ObjectRef14 = ref$ObjectRef7;
                                                                            byteString2 = byteString5;
                                                                            adObject5 = adObject6;
                                                                            str5 = str9;
                                                                            ref$ObjectRef6 = ref$ObjectRef14;
                                                                            Result.Companion companion2222 = Result.INSTANCE;
                                                                            z16 = z15;
                                                                            ref$ObjectRef8 = ref$ObjectRef6;
                                                                            diagnosticAdType7 = diagnosticAdType6;
                                                                            webViewConfiguration7 = webViewConfiguration6;
                                                                            adResponse6 = adResponse5;
                                                                            str10 = str7;
                                                                            unityAdsLoadOptions4 = unityAdsLoadOptions3;
                                                                            str11 = str5;
                                                                            i4 = i3;
                                                                            coroutineScope6 = coroutineScope5;
                                                                            AdObject adObject11222 = adObject5;
                                                                            m8023constructorimpl = Result.m8023constructorimpl(ResultKt.createFailure(th));
                                                                            adObject7 = adObject11222;
                                                                            String str15222 = str10;
                                                                            CoroutineScope coroutineScope9222 = coroutineScope6;
                                                                            TimedValue timedValue2222 = new TimedValue(Result.m8022boximpl(m8023constructorimpl), TimeSource$Monotonic.ValueTimeMark.m8189elapsedNowUwyO8pc(m8186markNowz9LOYto2), null);
                                                                            coroutineScope7 = coroutineScope9222;
                                                                            ref$ObjectRef9 = ref$ObjectRef8;
                                                                            String str16222 = str11;
                                                                            String str17222 = str8;
                                                                            unityAdsLoadOptions5 = unityAdsLoadOptions4;
                                                                            i5 = i4;
                                                                            SendDiagnosticEvent.DefaultImpls.invoke$default(this.sendDiagnosticEvent, Result.m8029isSuccessimpl(((Result) timedValue2222.component1()).getValue()) ? DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_WEBVIEW_SUCCESS_TIME : DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_WEBVIEW_FAILURE_TIME, Boxing.boxDouble(Duration.m8166toDoubleimpl(timedValue2222.m8198component2UwyO8pc(), DurationUnit.MILLISECONDS)), (Map) null, (Map) null, adObject7, (Integer) null, (ByteString) null, 108, (Object) null);
                                                                            Object value222 = ((Result) timedValue2222.getValue()).getValue();
                                                                            ResultKt.throwOnFailure(value222);
                                                                            AndroidWebViewContainer androidWebViewContainer222 = (AndroidWebViewContainer) value222;
                                                                            WebViewBridge invoke2222 = this.getWebViewBridge.invoke(androidWebViewContainer222, this.adPlayerScope);
                                                                            ?? invoke3222 = this.getAdPlayer.invoke(invoke2222, androidWebViewContainer222, adObject7, diagnosticAdType7);
                                                                            ref$ObjectRef = ref$ObjectRef9;
                                                                            ref$ObjectRef.element = invoke3222;
                                                                            copy = r17.copy((r35 & 1) != 0 ? r17.adScope : adObject7.getAdScope(), (r35 & 2) != 0 ? r17.opportunityId : null, (r35 & 4) != 0 ? r17.placementId : null, (r35 & 8) != 0 ? r17.trackingToken : null, (r35 & 16) != 0 ? r17.isOfferwallAd : false, (r35 & 32) != 0 ? r17.offerwallPlacementName : null, (r35 & 64) != 0 ? r17.adPlayer : (AdPlayer) invoke3222, (r35 & 128) != 0 ? r17.playerServerId : null, (r35 & 256) != 0 ? r17.loadOptions : null, (r35 & 512) != 0 ? r17.isHeaderBidding : false, (r35 & 1024) != 0 ? r17.adType : null, (r35 & 2048) != 0 ? r17.ttl : null, (r35 & 4096) != 0 ? r17.state : null, (r35 & 8192) != 0 ? r17.loadConfiguration : null, (r35 & 16384) != 0 ? r17.showConfiguration : null, (r35 & 32768) != 0 ? r17.activity : null, (r35 & 65536) != 0 ? adObject7.webViewLessLoadingRequiredData : adObject7.getWebViewLessLoadingRequiredData());
                                                                            FlowKt.launchIn(FlowKt.onEach(this.deviceInfoRepository.getAllowedPii(), new AndroidHandleGatewayAdResponse$invoke$2(ref$ObjectRef, null)), ((AdPlayer) ref$ObjectRef.element).getScope());
                                                                            long m8186markNowz9LOYto3222 = TimeSource$Monotonic.INSTANCE.m8186markNowz9LOYto();
                                                                            SendDiagnosticEvent.DefaultImpls.invoke$default(this.sendDiagnosticEvent, DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_LOAD_STARTED_AD_VIEWER, (Double) null, (Map) null, (Map) null, copy, (Integer) null, (ByteString) null, 110, (Object) null);
                                                                            HandleInvocationsFromAdViewer handleInvocationsFromAdViewer222 = this.getHandleInvocationsFromAdViewer;
                                                                            ByteString adData222 = adResponse6.getAdData();
                                                                            Intrinsics.checkNotNullExpressionValue(adData222, "getAdData(...)");
                                                                            obj3 = obj4;
                                                                            String base64$default222 = ProtobufExtensionsKt.toBase64$default(adData222, false, 1, null);
                                                                            Intrinsics.checkNotNull(str17222);
                                                                            ByteString adDataRefreshToken222 = adResponse6.getAdDataRefreshToken();
                                                                            Intrinsics.checkNotNullExpressionValue(adDataRefreshToken222, "getAdDataRefreshToken(...)");
                                                                            invoke2222.setExposedFunctions(handleInvocationsFromAdViewer222.invoke(base64$default222, ProtobufExtensionsKt.toBase64$default(adDataRefreshToken222, false, 1, null), str17222, copy));
                                                                            if (z16) {
                                                                            }
                                                                            androidHandleGatewayAdResponse$invoke$1.L$0 = unityAdsLoadOptions5;
                                                                            androidHandleGatewayAdResponse$invoke$1.L$1 = byteString2;
                                                                            androidHandleGatewayAdResponse$invoke$1.L$2 = adResponse6;
                                                                            androidHandleGatewayAdResponse$invoke$1.L$3 = str16222;
                                                                            androidHandleGatewayAdResponse$invoke$1.L$4 = ref$ObjectRef;
                                                                            webViewConfiguration9 = webViewConfiguration7;
                                                                            androidHandleGatewayAdResponse$invoke$1.L$5 = webViewConfiguration9;
                                                                            androidHandleGatewayAdResponse$invoke$1.L$6 = coroutineScope7;
                                                                            androidHandleGatewayAdResponse$invoke$1.L$7 = copy;
                                                                            androidHandleGatewayAdResponse$invoke$1.L$8 = null;
                                                                            androidHandleGatewayAdResponse$invoke$1.L$9 = null;
                                                                            androidHandleGatewayAdResponse$invoke$1.L$10 = null;
                                                                            i6 = i5;
                                                                            androidHandleGatewayAdResponse$invoke$1.I$0 = i6;
                                                                            androidHandleGatewayAdResponse$invoke$1.J$0 = m8186markNowz9LOYto3222;
                                                                            androidHandleGatewayAdResponse$invoke$1.label = 6;
                                                                            loadUrl = loadUrl(adObject7, str15222, androidWebViewContainer222, androidHandleGatewayAdResponse$invoke$1);
                                                                            obj = obj3;
                                                                            if (loadUrl == obj) {
                                                                            }
                                                                        }
                                                                        String str152222 = str10;
                                                                        CoroutineScope coroutineScope92222 = coroutineScope6;
                                                                        TimedValue timedValue22222 = new TimedValue(Result.m8022boximpl(m8023constructorimpl), TimeSource$Monotonic.ValueTimeMark.m8189elapsedNowUwyO8pc(m8186markNowz9LOYto2), null);
                                                                        coroutineScope7 = coroutineScope92222;
                                                                        ref$ObjectRef9 = ref$ObjectRef8;
                                                                        String str162222 = str11;
                                                                        String str172222 = str8;
                                                                        unityAdsLoadOptions5 = unityAdsLoadOptions4;
                                                                        i5 = i4;
                                                                        SendDiagnosticEvent.DefaultImpls.invoke$default(this.sendDiagnosticEvent, Result.m8029isSuccessimpl(((Result) timedValue22222.component1()).getValue()) ? DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_WEBVIEW_SUCCESS_TIME : DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_WEBVIEW_FAILURE_TIME, Boxing.boxDouble(Duration.m8166toDoubleimpl(timedValue22222.m8198component2UwyO8pc(), DurationUnit.MILLISECONDS)), (Map) null, (Map) null, adObject7, (Integer) null, (ByteString) null, 108, (Object) null);
                                                                        Object value2222 = ((Result) timedValue22222.getValue()).getValue();
                                                                        ResultKt.throwOnFailure(value2222);
                                                                        AndroidWebViewContainer androidWebViewContainer2222 = (AndroidWebViewContainer) value2222;
                                                                        WebViewBridge invoke22222 = this.getWebViewBridge.invoke(androidWebViewContainer2222, this.adPlayerScope);
                                                                        ?? invoke32222 = this.getAdPlayer.invoke(invoke22222, androidWebViewContainer2222, adObject7, diagnosticAdType7);
                                                                        ref$ObjectRef = ref$ObjectRef9;
                                                                        ref$ObjectRef.element = invoke32222;
                                                                        copy = r17.copy((r35 & 1) != 0 ? r17.adScope : adObject7.getAdScope(), (r35 & 2) != 0 ? r17.opportunityId : null, (r35 & 4) != 0 ? r17.placementId : null, (r35 & 8) != 0 ? r17.trackingToken : null, (r35 & 16) != 0 ? r17.isOfferwallAd : false, (r35 & 32) != 0 ? r17.offerwallPlacementName : null, (r35 & 64) != 0 ? r17.adPlayer : (AdPlayer) invoke32222, (r35 & 128) != 0 ? r17.playerServerId : null, (r35 & 256) != 0 ? r17.loadOptions : null, (r35 & 512) != 0 ? r17.isHeaderBidding : false, (r35 & 1024) != 0 ? r17.adType : null, (r35 & 2048) != 0 ? r17.ttl : null, (r35 & 4096) != 0 ? r17.state : null, (r35 & 8192) != 0 ? r17.loadConfiguration : null, (r35 & 16384) != 0 ? r17.showConfiguration : null, (r35 & 32768) != 0 ? r17.activity : null, (r35 & 65536) != 0 ? adObject7.webViewLessLoadingRequiredData : adObject7.getWebViewLessLoadingRequiredData());
                                                                        FlowKt.launchIn(FlowKt.onEach(this.deviceInfoRepository.getAllowedPii(), new AndroidHandleGatewayAdResponse$invoke$2(ref$ObjectRef, null)), ((AdPlayer) ref$ObjectRef.element).getScope());
                                                                        long m8186markNowz9LOYto32222 = TimeSource$Monotonic.INSTANCE.m8186markNowz9LOYto();
                                                                        SendDiagnosticEvent.DefaultImpls.invoke$default(this.sendDiagnosticEvent, DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_LOAD_STARTED_AD_VIEWER, (Double) null, (Map) null, (Map) null, copy, (Integer) null, (ByteString) null, 110, (Object) null);
                                                                        HandleInvocationsFromAdViewer handleInvocationsFromAdViewer2222 = this.getHandleInvocationsFromAdViewer;
                                                                        ByteString adData2222 = adResponse6.getAdData();
                                                                        Intrinsics.checkNotNullExpressionValue(adData2222, "getAdData(...)");
                                                                        obj3 = obj4;
                                                                        String base64$default2222 = ProtobufExtensionsKt.toBase64$default(adData2222, false, 1, null);
                                                                        Intrinsics.checkNotNull(str172222);
                                                                        ByteString adDataRefreshToken2222 = adResponse6.getAdDataRefreshToken();
                                                                        Intrinsics.checkNotNullExpressionValue(adDataRefreshToken2222, "getAdDataRefreshToken(...)");
                                                                        invoke22222.setExposedFunctions(handleInvocationsFromAdViewer2222.invoke(base64$default2222, ProtobufExtensionsKt.toBase64$default(adDataRefreshToken2222, false, 1, null), str172222, copy));
                                                                        if (z16) {
                                                                            try {
                                                                                if (this.sessionRepository.getNativeConfiguration().getFeatureFlags().getWebviewLessLoadParallelActivityLaunch()) {
                                                                                    BuildersKt__Builders_commonKt.launch$default(this.adPlayerScope, null, null, new AndroidHandleGatewayAdResponse$invoke$loadEvent$1(this, adObject7, str152222, androidWebViewContainer2222, null), 3, null);
                                                                                    j2 = m8186markNowz9LOYto32222;
                                                                                    loadEvent = LoadEvent.Completed.INSTANCE;
                                                                                    adResponse2 = adResponse6;
                                                                                    byteString6 = byteString2;
                                                                                    obj = obj3;
                                                                                    webViewConfiguration8 = webViewConfiguration7;
                                                                                    str12 = str162222;
                                                                                    try {
                                                                                        if (loadEvent instanceof LoadEvent.Error) {
                                                                                            SendDiagnosticEvent.DefaultImpls.invoke$default(this.sendDiagnosticEvent, DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_CREATE_AD_OBJECT_FAILURE_TIME, Boxing.boxDouble(TimeExtensionsKt.elapsedMillis(TimeSource$Monotonic.ValueTimeMark.m8187boximpl(j2))), (Map) null, (Map) null, copy, (Integer) null, (ByteString) null, 108, (Object) null);
                                                                                            NonCancellable nonCancellable2 = NonCancellable.INSTANCE;
                                                                                            AndroidHandleGatewayAdResponse$invoke$3 androidHandleGatewayAdResponse$invoke$3 = new AndroidHandleGatewayAdResponse$invoke$3(this, loadEvent, byteString6, adResponse2, ref$ObjectRef, null);
                                                                                            androidHandleGatewayAdResponse$invoke$1.L$0 = byteString6;
                                                                                            androidHandleGatewayAdResponse$invoke$1.L$1 = adResponse2;
                                                                                            androidHandleGatewayAdResponse$invoke$1.L$2 = ref$ObjectRef;
                                                                                            androidHandleGatewayAdResponse$invoke$1.L$3 = loadEvent;
                                                                                            androidHandleGatewayAdResponse$invoke$1.L$4 = null;
                                                                                            androidHandleGatewayAdResponse$invoke$1.L$5 = null;
                                                                                            androidHandleGatewayAdResponse$invoke$1.L$6 = null;
                                                                                            androidHandleGatewayAdResponse$invoke$1.L$7 = null;
                                                                                            androidHandleGatewayAdResponse$invoke$1.L$8 = null;
                                                                                            androidHandleGatewayAdResponse$invoke$1.L$9 = null;
                                                                                            androidHandleGatewayAdResponse$invoke$1.L$10 = null;
                                                                                            androidHandleGatewayAdResponse$invoke$1.label = 8;
                                                                                            if (BuildersKt.withContext(nonCancellable2, androidHandleGatewayAdResponse$invoke$3, androidHandleGatewayAdResponse$invoke$1) == obj) {
                                                                                                return obj;
                                                                                            }
                                                                                            byteString7 = byteString6;
                                                                                            try {
                                                                                                return new LoadResult.Failure(ErrorOuterClass.PublicErrorCode.PUBLIC_ERROR_CODE_UNSPECIFIED, UnityAdsConstants.Messages.MSG_INTERNAL_ERROR, null, "adviewer", ((LoadEvent.Error) loadEvent).getMessage(), null, 36, null);
                                                                                            } catch (CancellationException e15) {
                                                                                                e = e15;
                                                                                                byteString2 = byteString7;
                                                                                                nonCancellable = NonCancellable.INSTANCE;
                                                                                                androidHandleGatewayAdResponse$invoke$5 = new AndroidHandleGatewayAdResponse$invoke$5(this, e, byteString2, adResponse2, ref$ObjectRef, null);
                                                                                                androidHandleGatewayAdResponse$invoke$1.L$0 = e;
                                                                                                androidHandleGatewayAdResponse$invoke$1.L$1 = null;
                                                                                                androidHandleGatewayAdResponse$invoke$1.L$2 = null;
                                                                                                androidHandleGatewayAdResponse$invoke$1.L$3 = null;
                                                                                                androidHandleGatewayAdResponse$invoke$1.L$4 = null;
                                                                                                androidHandleGatewayAdResponse$invoke$1.L$5 = null;
                                                                                                androidHandleGatewayAdResponse$invoke$1.L$6 = null;
                                                                                                androidHandleGatewayAdResponse$invoke$1.L$7 = null;
                                                                                                androidHandleGatewayAdResponse$invoke$1.L$8 = null;
                                                                                                androidHandleGatewayAdResponse$invoke$1.L$9 = null;
                                                                                                androidHandleGatewayAdResponse$invoke$1.L$10 = null;
                                                                                                androidHandleGatewayAdResponse$invoke$1.label = 9;
                                                                                                if (BuildersKt.withContext(nonCancellable, androidHandleGatewayAdResponse$invoke$5, androidHandleGatewayAdResponse$invoke$1) != obj) {
                                                                                                }
                                                                                            }
                                                                                        } else {
                                                                                            SendDiagnosticEvent.DefaultImpls.invoke$default(this.sendDiagnosticEvent, DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_CREATE_AD_OBJECT_SUCCESS_TIME, Boxing.boxDouble(TimeExtensionsKt.elapsedMillis(TimeSource$Monotonic.ValueTimeMark.m8187boximpl(j2))), (Map) null, (Map) null, copy, (Integer) null, (ByteString) null, 108, (Object) null);
                                                                                            if (i5 != 0) {
                                                                                                BuildersKt__Builders_commonKt.launch$default(coroutineScope7, null, null, new AndroidHandleGatewayAdResponse$invoke$4(this, webViewConfiguration8, null), 3, null);
                                                                                            }
                                                                                            this.campaignRepository.setLoadTimestamp(byteString6);
                                                                                            this.adRepository.addAd(byteString6, copy);
                                                                                            String objectId = unityAdsLoadOptions5.getObjectId();
                                                                                            if ((objectId == null || StringsKt.isBlank(objectId)) && (data = unityAdsLoadOptions5.getData()) != null && !data.has("adMarkup")) {
                                                                                                this.adRepository.enqueueOpportunityForPlacement(str12, byteString6);
                                                                                            }
                                                                                            return new LoadResult.Success(copy);
                                                                                        }
                                                                                    } catch (CancellationException e16) {
                                                                                        e = e16;
                                                                                        byteString2 = byteString6;
                                                                                        nonCancellable = NonCancellable.INSTANCE;
                                                                                        androidHandleGatewayAdResponse$invoke$5 = new AndroidHandleGatewayAdResponse$invoke$5(this, e, byteString2, adResponse2, ref$ObjectRef, null);
                                                                                        androidHandleGatewayAdResponse$invoke$1.L$0 = e;
                                                                                        androidHandleGatewayAdResponse$invoke$1.L$1 = null;
                                                                                        androidHandleGatewayAdResponse$invoke$1.L$2 = null;
                                                                                        androidHandleGatewayAdResponse$invoke$1.L$3 = null;
                                                                                        androidHandleGatewayAdResponse$invoke$1.L$4 = null;
                                                                                        androidHandleGatewayAdResponse$invoke$1.L$5 = null;
                                                                                        androidHandleGatewayAdResponse$invoke$1.L$6 = null;
                                                                                        androidHandleGatewayAdResponse$invoke$1.L$7 = null;
                                                                                        androidHandleGatewayAdResponse$invoke$1.L$8 = null;
                                                                                        androidHandleGatewayAdResponse$invoke$1.L$9 = null;
                                                                                        androidHandleGatewayAdResponse$invoke$1.L$10 = null;
                                                                                        androidHandleGatewayAdResponse$invoke$1.label = 9;
                                                                                        if (BuildersKt.withContext(nonCancellable, androidHandleGatewayAdResponse$invoke$5, androidHandleGatewayAdResponse$invoke$1) != obj) {
                                                                                        }
                                                                                    }
                                                                                }
                                                                            } catch (CancellationException e17) {
                                                                                e = e17;
                                                                                adResponse2 = adResponse6;
                                                                                obj = obj3;
                                                                                nonCancellable = NonCancellable.INSTANCE;
                                                                                androidHandleGatewayAdResponse$invoke$5 = new AndroidHandleGatewayAdResponse$invoke$5(this, e, byteString2, adResponse2, ref$ObjectRef, null);
                                                                                androidHandleGatewayAdResponse$invoke$1.L$0 = e;
                                                                                androidHandleGatewayAdResponse$invoke$1.L$1 = null;
                                                                                androidHandleGatewayAdResponse$invoke$1.L$2 = null;
                                                                                androidHandleGatewayAdResponse$invoke$1.L$3 = null;
                                                                                androidHandleGatewayAdResponse$invoke$1.L$4 = null;
                                                                                androidHandleGatewayAdResponse$invoke$1.L$5 = null;
                                                                                androidHandleGatewayAdResponse$invoke$1.L$6 = null;
                                                                                androidHandleGatewayAdResponse$invoke$1.L$7 = null;
                                                                                androidHandleGatewayAdResponse$invoke$1.L$8 = null;
                                                                                androidHandleGatewayAdResponse$invoke$1.L$9 = null;
                                                                                androidHandleGatewayAdResponse$invoke$1.L$10 = null;
                                                                                androidHandleGatewayAdResponse$invoke$1.label = 9;
                                                                                if (BuildersKt.withContext(nonCancellable, androidHandleGatewayAdResponse$invoke$5, androidHandleGatewayAdResponse$invoke$1) != obj) {
                                                                                }
                                                                            }
                                                                        }
                                                                        androidHandleGatewayAdResponse$invoke$1.L$0 = unityAdsLoadOptions5;
                                                                        androidHandleGatewayAdResponse$invoke$1.L$1 = byteString2;
                                                                        androidHandleGatewayAdResponse$invoke$1.L$2 = adResponse6;
                                                                        androidHandleGatewayAdResponse$invoke$1.L$3 = str162222;
                                                                        androidHandleGatewayAdResponse$invoke$1.L$4 = ref$ObjectRef;
                                                                        webViewConfiguration9 = webViewConfiguration7;
                                                                        androidHandleGatewayAdResponse$invoke$1.L$5 = webViewConfiguration9;
                                                                        androidHandleGatewayAdResponse$invoke$1.L$6 = coroutineScope7;
                                                                        androidHandleGatewayAdResponse$invoke$1.L$7 = copy;
                                                                        androidHandleGatewayAdResponse$invoke$1.L$8 = null;
                                                                        androidHandleGatewayAdResponse$invoke$1.L$9 = null;
                                                                        androidHandleGatewayAdResponse$invoke$1.L$10 = null;
                                                                        i6 = i5;
                                                                        androidHandleGatewayAdResponse$invoke$1.I$0 = i6;
                                                                        androidHandleGatewayAdResponse$invoke$1.J$0 = m8186markNowz9LOYto32222;
                                                                        androidHandleGatewayAdResponse$invoke$1.label = 6;
                                                                        loadUrl = loadUrl(adObject7, str152222, androidWebViewContainer2222, androidHandleGatewayAdResponse$invoke$1);
                                                                        obj = obj3;
                                                                        if (loadUrl == obj) {
                                                                            return obj;
                                                                        }
                                                                        adObject8 = copy;
                                                                        coroutineScope8 = coroutineScope7;
                                                                        j3 = m8186markNowz9LOYto32222;
                                                                        str13 = str162222;
                                                                        adResponse2 = adResponse6;
                                                                        byteString6 = byteString2;
                                                                        unityAdsLoadOptions6 = unityAdsLoadOptions5;
                                                                        ref$ObjectRef10 = ref$ObjectRef;
                                                                        try {
                                                                            Flow onLoadEvent = ((AdPlayer) ref$ObjectRef10.element).getOnLoadEvent();
                                                                            androidHandleGatewayAdResponse$invoke$1.L$0 = unityAdsLoadOptions6;
                                                                            androidHandleGatewayAdResponse$invoke$1.L$1 = byteString6;
                                                                            androidHandleGatewayAdResponse$invoke$1.L$2 = adResponse2;
                                                                            androidHandleGatewayAdResponse$invoke$1.L$3 = str13;
                                                                            androidHandleGatewayAdResponse$invoke$1.L$4 = ref$ObjectRef10;
                                                                            androidHandleGatewayAdResponse$invoke$1.L$5 = webViewConfiguration9;
                                                                            androidHandleGatewayAdResponse$invoke$1.L$6 = coroutineScope8;
                                                                            androidHandleGatewayAdResponse$invoke$1.L$7 = adObject8;
                                                                            androidHandleGatewayAdResponse$invoke$1.I$0 = i6;
                                                                            androidHandleGatewayAdResponse$invoke$1.J$0 = j3;
                                                                            androidHandleGatewayAdResponse$invoke$1.label = 7;
                                                                            single = FlowKt.single(onLoadEvent, androidHandleGatewayAdResponse$invoke$1);
                                                                            if (single != obj) {
                                                                                return obj;
                                                                            }
                                                                            webViewConfiguration10 = webViewConfiguration9;
                                                                            adObject9 = adObject8;
                                                                            obj5 = single;
                                                                            str12 = str13;
                                                                            ref$ObjectRef11 = ref$ObjectRef10;
                                                                            WebViewConfiguration webViewConfiguration13 = webViewConfiguration10;
                                                                            try {
                                                                                coroutineScope7 = coroutineScope8;
                                                                                i5 = i6;
                                                                                ref$ObjectRef = ref$ObjectRef11;
                                                                                unityAdsLoadOptions5 = unityAdsLoadOptions6;
                                                                                AdObject adObject12 = adObject9;
                                                                                loadEvent = (LoadEvent) obj5;
                                                                                webViewConfiguration8 = webViewConfiguration13;
                                                                                j2 = j3;
                                                                                copy = adObject12;
                                                                                if (loadEvent instanceof LoadEvent.Error) {
                                                                                }
                                                                            } catch (CancellationException e18) {
                                                                                e = e18;
                                                                                ref$ObjectRef = ref$ObjectRef11;
                                                                                byteString2 = byteString6;
                                                                                nonCancellable = NonCancellable.INSTANCE;
                                                                                androidHandleGatewayAdResponse$invoke$5 = new AndroidHandleGatewayAdResponse$invoke$5(this, e, byteString2, adResponse2, ref$ObjectRef, null);
                                                                                androidHandleGatewayAdResponse$invoke$1.L$0 = e;
                                                                                androidHandleGatewayAdResponse$invoke$1.L$1 = null;
                                                                                androidHandleGatewayAdResponse$invoke$1.L$2 = null;
                                                                                androidHandleGatewayAdResponse$invoke$1.L$3 = null;
                                                                                androidHandleGatewayAdResponse$invoke$1.L$4 = null;
                                                                                androidHandleGatewayAdResponse$invoke$1.L$5 = null;
                                                                                androidHandleGatewayAdResponse$invoke$1.L$6 = null;
                                                                                androidHandleGatewayAdResponse$invoke$1.L$7 = null;
                                                                                androidHandleGatewayAdResponse$invoke$1.L$8 = null;
                                                                                androidHandleGatewayAdResponse$invoke$1.L$9 = null;
                                                                                androidHandleGatewayAdResponse$invoke$1.L$10 = null;
                                                                                androidHandleGatewayAdResponse$invoke$1.label = 9;
                                                                                if (BuildersKt.withContext(nonCancellable, androidHandleGatewayAdResponse$invoke$5, androidHandleGatewayAdResponse$invoke$1) != obj) {
                                                                                }
                                                                            }
                                                                        } catch (CancellationException e19) {
                                                                            e = e19;
                                                                            ref$ObjectRef = ref$ObjectRef10;
                                                                            byteString2 = byteString6;
                                                                            nonCancellable = NonCancellable.INSTANCE;
                                                                            androidHandleGatewayAdResponse$invoke$5 = new AndroidHandleGatewayAdResponse$invoke$5(this, e, byteString2, adResponse2, ref$ObjectRef, null);
                                                                            androidHandleGatewayAdResponse$invoke$1.L$0 = e;
                                                                            androidHandleGatewayAdResponse$invoke$1.L$1 = null;
                                                                            androidHandleGatewayAdResponse$invoke$1.L$2 = null;
                                                                            androidHandleGatewayAdResponse$invoke$1.L$3 = null;
                                                                            androidHandleGatewayAdResponse$invoke$1.L$4 = null;
                                                                            androidHandleGatewayAdResponse$invoke$1.L$5 = null;
                                                                            androidHandleGatewayAdResponse$invoke$1.L$6 = null;
                                                                            androidHandleGatewayAdResponse$invoke$1.L$7 = null;
                                                                            androidHandleGatewayAdResponse$invoke$1.L$8 = null;
                                                                            androidHandleGatewayAdResponse$invoke$1.L$9 = null;
                                                                            androidHandleGatewayAdResponse$invoke$1.L$10 = null;
                                                                            androidHandleGatewayAdResponse$invoke$1.label = 9;
                                                                            if (BuildersKt.withContext(nonCancellable, androidHandleGatewayAdResponse$invoke$5, androidHandleGatewayAdResponse$invoke$1) != obj) {
                                                                            }
                                                                        }
                                                                    } catch (CancellationException e20) {
                                                                        e = e20;
                                                                        obj = obj4;
                                                                        adResponse2 = adResponse5;
                                                                        ref$ObjectRef = ref$ObjectRef6;
                                                                        nonCancellable = NonCancellable.INSTANCE;
                                                                        androidHandleGatewayAdResponse$invoke$5 = new AndroidHandleGatewayAdResponse$invoke$5(this, e, byteString2, adResponse2, ref$ObjectRef, null);
                                                                        androidHandleGatewayAdResponse$invoke$1.L$0 = e;
                                                                        androidHandleGatewayAdResponse$invoke$1.L$1 = null;
                                                                        androidHandleGatewayAdResponse$invoke$1.L$2 = null;
                                                                        androidHandleGatewayAdResponse$invoke$1.L$3 = null;
                                                                        androidHandleGatewayAdResponse$invoke$1.L$4 = null;
                                                                        androidHandleGatewayAdResponse$invoke$1.L$5 = null;
                                                                        androidHandleGatewayAdResponse$invoke$1.L$6 = null;
                                                                        androidHandleGatewayAdResponse$invoke$1.L$7 = null;
                                                                        androidHandleGatewayAdResponse$invoke$1.L$8 = null;
                                                                        androidHandleGatewayAdResponse$invoke$1.L$9 = null;
                                                                        androidHandleGatewayAdResponse$invoke$1.L$10 = null;
                                                                        androidHandleGatewayAdResponse$invoke$1.label = 9;
                                                                        if (BuildersKt.withContext(nonCancellable, androidHandleGatewayAdResponse$invoke$5, androidHandleGatewayAdResponse$invoke$1) != obj) {
                                                                            return obj;
                                                                        }
                                                                        cancellationException = e;
                                                                        cause = cancellationException.getCause();
                                                                        if (cause != null) {
                                                                        }
                                                                    }
                                                                }
                                                            } catch (CancellationException e21) {
                                                                e = e21;
                                                                obj = obj2;
                                                                ref$ObjectRef6 = ref$ObjectRef5;
                                                            }
                                                        } catch (CancellationException e22) {
                                                            e = e22;
                                                            obj2 = obj3;
                                                            adResponse2 = adResponse3;
                                                            byteString2 = byteString4;
                                                            ref$ObjectRef = ref$ObjectRef3;
                                                            obj = obj2;
                                                            nonCancellable = NonCancellable.INSTANCE;
                                                            androidHandleGatewayAdResponse$invoke$5 = new AndroidHandleGatewayAdResponse$invoke$5(this, e, byteString2, adResponse2, ref$ObjectRef, null);
                                                            androidHandleGatewayAdResponse$invoke$1.L$0 = e;
                                                            androidHandleGatewayAdResponse$invoke$1.L$1 = null;
                                                            androidHandleGatewayAdResponse$invoke$1.L$2 = null;
                                                            androidHandleGatewayAdResponse$invoke$1.L$3 = null;
                                                            androidHandleGatewayAdResponse$invoke$1.L$4 = null;
                                                            androidHandleGatewayAdResponse$invoke$1.L$5 = null;
                                                            androidHandleGatewayAdResponse$invoke$1.L$6 = null;
                                                            androidHandleGatewayAdResponse$invoke$1.L$7 = null;
                                                            androidHandleGatewayAdResponse$invoke$1.L$8 = null;
                                                            androidHandleGatewayAdResponse$invoke$1.L$9 = null;
                                                            androidHandleGatewayAdResponse$invoke$1.L$10 = null;
                                                            androidHandleGatewayAdResponse$invoke$1.label = 9;
                                                            if (BuildersKt.withContext(nonCancellable, androidHandleGatewayAdResponse$invoke$5, androidHandleGatewayAdResponse$invoke$1) != obj) {
                                                            }
                                                        }
                                                    } else {
                                                        obj2 = obj3;
                                                        adObject4 = adObject3;
                                                        z13 = z9;
                                                        i2 = booleanValue;
                                                        byteString2 = byteString4;
                                                        unityAdsLoadOptions3 = unityAdsLoadOptions2;
                                                        diagnosticAdType5 = diagnosticAdType4;
                                                        z14 = z10;
                                                        coroutineScope3 = coroutineScope2;
                                                        webViewConfiguration3 = webViewConfiguration;
                                                        str5 = str4;
                                                        Ref$ObjectRef ref$ObjectRef15 = ref$ObjectRef3;
                                                        adResponse5 = adResponse3;
                                                        ref$ObjectRef5 = ref$ObjectRef15;
                                                        if (webViewConfiguration3.getEntryPoint().length() == 0) {
                                                        }
                                                    }
                                                } catch (CancellationException e23) {
                                                    e = e23;
                                                    adResponse2 = adResponse3;
                                                    byteString2 = byteString4;
                                                    ref$ObjectRef = ref$ObjectRef3;
                                                    obj = obj2;
                                                    nonCancellable = NonCancellable.INSTANCE;
                                                    androidHandleGatewayAdResponse$invoke$5 = new AndroidHandleGatewayAdResponse$invoke$5(this, e, byteString2, adResponse2, ref$ObjectRef, null);
                                                    androidHandleGatewayAdResponse$invoke$1.L$0 = e;
                                                    androidHandleGatewayAdResponse$invoke$1.L$1 = null;
                                                    androidHandleGatewayAdResponse$invoke$1.L$2 = null;
                                                    androidHandleGatewayAdResponse$invoke$1.L$3 = null;
                                                    androidHandleGatewayAdResponse$invoke$1.L$4 = null;
                                                    androidHandleGatewayAdResponse$invoke$1.L$5 = null;
                                                    androidHandleGatewayAdResponse$invoke$1.L$6 = null;
                                                    androidHandleGatewayAdResponse$invoke$1.L$7 = null;
                                                    androidHandleGatewayAdResponse$invoke$1.L$8 = null;
                                                    androidHandleGatewayAdResponse$invoke$1.L$9 = null;
                                                    androidHandleGatewayAdResponse$invoke$1.L$10 = null;
                                                    androidHandleGatewayAdResponse$invoke$1.label = 9;
                                                    if (BuildersKt.withContext(nonCancellable, androidHandleGatewayAdResponse$invoke$5, androidHandleGatewayAdResponse$invoke$1) != obj) {
                                                    }
                                                }
                                            } catch (CancellationException e24) {
                                                e = e24;
                                                obj2 = obj2;
                                                ref$ObjectRef = ref$ObjectRef2;
                                                adResponse2 = adResponse3;
                                                byteString2 = byteString4;
                                                obj = obj2;
                                                nonCancellable = NonCancellable.INSTANCE;
                                                androidHandleGatewayAdResponse$invoke$5 = new AndroidHandleGatewayAdResponse$invoke$5(this, e, byteString2, adResponse2, ref$ObjectRef, null);
                                                androidHandleGatewayAdResponse$invoke$1.L$0 = e;
                                                androidHandleGatewayAdResponse$invoke$1.L$1 = null;
                                                androidHandleGatewayAdResponse$invoke$1.L$2 = null;
                                                androidHandleGatewayAdResponse$invoke$1.L$3 = null;
                                                androidHandleGatewayAdResponse$invoke$1.L$4 = null;
                                                androidHandleGatewayAdResponse$invoke$1.L$5 = null;
                                                androidHandleGatewayAdResponse$invoke$1.L$6 = null;
                                                androidHandleGatewayAdResponse$invoke$1.L$7 = null;
                                                androidHandleGatewayAdResponse$invoke$1.L$8 = null;
                                                androidHandleGatewayAdResponse$invoke$1.L$9 = null;
                                                androidHandleGatewayAdResponse$invoke$1.L$10 = null;
                                                androidHandleGatewayAdResponse$invoke$1.label = 9;
                                                if (BuildersKt.withContext(nonCancellable, androidHandleGatewayAdResponse$invoke$5, androidHandleGatewayAdResponse$invoke$1) != obj) {
                                                }
                                            }
                                        } catch (CancellationException e25) {
                                            e = e25;
                                            obj2 = coroutine_suspended;
                                        }
                                    } else {
                                        boolean z25 = z4;
                                        obj2 = coroutine_suspended;
                                        webViewConfiguration = webViewConfiguration11;
                                        ref$ObjectRef3 = ref$ObjectRef2;
                                        str4 = str2;
                                        z7 = z3;
                                        timedValue = null;
                                        coroutineScope2 = plus;
                                        z8 = z25;
                                        AdObject adObject13 = adObject;
                                        diagnosticAdType4 = diagnosticAdType2;
                                        adObject3 = adObject13;
                                        if (timedValue != null) {
                                        }
                                        if (timedValue != null) {
                                        }
                                        if (booleanValue == 0) {
                                        }
                                    }
                                } catch (CancellationException e26) {
                                    e = e26;
                                    obj = coroutine_suspended;
                                    ref$ObjectRef = ref$ObjectRef2;
                                    adResponse2 = adResponse3;
                                    byteString2 = byteString4;
                                    nonCancellable = NonCancellable.INSTANCE;
                                    androidHandleGatewayAdResponse$invoke$5 = new AndroidHandleGatewayAdResponse$invoke$5(this, e, byteString2, adResponse2, ref$ObjectRef, null);
                                    androidHandleGatewayAdResponse$invoke$1.L$0 = e;
                                    androidHandleGatewayAdResponse$invoke$1.L$1 = null;
                                    androidHandleGatewayAdResponse$invoke$1.L$2 = null;
                                    androidHandleGatewayAdResponse$invoke$1.L$3 = null;
                                    androidHandleGatewayAdResponse$invoke$1.L$4 = null;
                                    androidHandleGatewayAdResponse$invoke$1.L$5 = null;
                                    androidHandleGatewayAdResponse$invoke$1.L$6 = null;
                                    androidHandleGatewayAdResponse$invoke$1.L$7 = null;
                                    androidHandleGatewayAdResponse$invoke$1.L$8 = null;
                                    androidHandleGatewayAdResponse$invoke$1.L$9 = null;
                                    androidHandleGatewayAdResponse$invoke$1.L$10 = null;
                                    androidHandleGatewayAdResponse$invoke$1.label = 9;
                                    if (BuildersKt.withContext(nonCancellable, androidHandleGatewayAdResponse$invoke$5, androidHandleGatewayAdResponse$invoke$1) != obj) {
                                    }
                                }
                            } catch (CancellationException e27) {
                                e = e27;
                                obj = coroutine_suspended;
                                ref$ObjectRef = ref$ObjectRef12;
                                byteString2 = byteString3;
                                nonCancellable = NonCancellable.INSTANCE;
                                androidHandleGatewayAdResponse$invoke$5 = new AndroidHandleGatewayAdResponse$invoke$5(this, e, byteString2, adResponse2, ref$ObjectRef, null);
                                androidHandleGatewayAdResponse$invoke$1.L$0 = e;
                                androidHandleGatewayAdResponse$invoke$1.L$1 = null;
                                androidHandleGatewayAdResponse$invoke$1.L$2 = null;
                                androidHandleGatewayAdResponse$invoke$1.L$3 = null;
                                androidHandleGatewayAdResponse$invoke$1.L$4 = null;
                                androidHandleGatewayAdResponse$invoke$1.L$5 = null;
                                androidHandleGatewayAdResponse$invoke$1.L$6 = null;
                                androidHandleGatewayAdResponse$invoke$1.L$7 = null;
                                androidHandleGatewayAdResponse$invoke$1.L$8 = null;
                                androidHandleGatewayAdResponse$invoke$1.L$9 = null;
                                androidHandleGatewayAdResponse$invoke$1.L$10 = null;
                                androidHandleGatewayAdResponse$invoke$1.label = 9;
                                if (BuildersKt.withContext(nonCancellable, androidHandleGatewayAdResponse$invoke$5, androidHandleGatewayAdResponse$invoke$1) != obj) {
                                }
                            }
                        } catch (CancellationException e28) {
                            e = e28;
                            byteString2 = byteString;
                            adResponse2 = adResponse;
                            ref$ObjectRef = ref$ObjectRef12;
                            obj = coroutine_suspended;
                            nonCancellable = NonCancellable.INSTANCE;
                            androidHandleGatewayAdResponse$invoke$5 = new AndroidHandleGatewayAdResponse$invoke$5(this, e, byteString2, adResponse2, ref$ObjectRef, null);
                            androidHandleGatewayAdResponse$invoke$1.L$0 = e;
                            androidHandleGatewayAdResponse$invoke$1.L$1 = null;
                            androidHandleGatewayAdResponse$invoke$1.L$2 = null;
                            androidHandleGatewayAdResponse$invoke$1.L$3 = null;
                            androidHandleGatewayAdResponse$invoke$1.L$4 = null;
                            androidHandleGatewayAdResponse$invoke$1.L$5 = null;
                            androidHandleGatewayAdResponse$invoke$1.L$6 = null;
                            androidHandleGatewayAdResponse$invoke$1.L$7 = null;
                            androidHandleGatewayAdResponse$invoke$1.L$8 = null;
                            androidHandleGatewayAdResponse$invoke$1.L$9 = null;
                            androidHandleGatewayAdResponse$invoke$1.L$10 = null;
                            androidHandleGatewayAdResponse$invoke$1.label = 9;
                            if (BuildersKt.withContext(nonCancellable, androidHandleGatewayAdResponse$invoke$5, androidHandleGatewayAdResponse$invoke$1) != obj) {
                            }
                        }
                        break;
                    case 1:
                        z4 = androidHandleGatewayAdResponse$invoke$1.Z$1;
                        boolean z26 = androidHandleGatewayAdResponse$invoke$1.Z$0;
                        ref$ObjectRef2 = (Ref$ObjectRef) androidHandleGatewayAdResponse$invoke$1.L$5;
                        diagnosticAdType2 = (DiagnosticEventRequestOuterClass.DiagnosticAdType) androidHandleGatewayAdResponse$invoke$1.L$4;
                        str2 = (String) androidHandleGatewayAdResponse$invoke$1.L$3;
                        adResponse3 = (AdResponseOuterClass.AdResponse) androidHandleGatewayAdResponse$invoke$1.L$2;
                        byteString4 = (ByteString) androidHandleGatewayAdResponse$invoke$1.L$1;
                        unityAdsLoadOptions2 = (UnityAdsLoadOptions) androidHandleGatewayAdResponse$invoke$1.L$0;
                        try {
                            ResultKt.throwOnFailure(obj5);
                            z3 = z26;
                            WebViewConfiguration webViewConfiguration112 = (WebViewConfiguration) obj5;
                            CoroutineScope plus2 = CoroutineScopeKt.plus(this.adPlayerScope, new CoroutineOpportunity(byteString4));
                            if (!z4) {
                            }
                            if (!this.sessionRepository.getNativeConfiguration().getFeatureFlags().getUseOptimisticWebviewCache()) {
                            }
                        } catch (CancellationException e29) {
                            e = e29;
                            ref$ObjectRef = ref$ObjectRef2;
                            adResponse2 = adResponse3;
                            byteString2 = byteString4;
                            obj = coroutine_suspended;
                            nonCancellable = NonCancellable.INSTANCE;
                            androidHandleGatewayAdResponse$invoke$5 = new AndroidHandleGatewayAdResponse$invoke$5(this, e, byteString2, adResponse2, ref$ObjectRef, null);
                            androidHandleGatewayAdResponse$invoke$1.L$0 = e;
                            androidHandleGatewayAdResponse$invoke$1.L$1 = null;
                            androidHandleGatewayAdResponse$invoke$1.L$2 = null;
                            androidHandleGatewayAdResponse$invoke$1.L$3 = null;
                            androidHandleGatewayAdResponse$invoke$1.L$4 = null;
                            androidHandleGatewayAdResponse$invoke$1.L$5 = null;
                            androidHandleGatewayAdResponse$invoke$1.L$6 = null;
                            androidHandleGatewayAdResponse$invoke$1.L$7 = null;
                            androidHandleGatewayAdResponse$invoke$1.L$8 = null;
                            androidHandleGatewayAdResponse$invoke$1.L$9 = null;
                            androidHandleGatewayAdResponse$invoke$1.L$10 = null;
                            androidHandleGatewayAdResponse$invoke$1.label = 9;
                            if (BuildersKt.withContext(nonCancellable, androidHandleGatewayAdResponse$invoke$5, androidHandleGatewayAdResponse$invoke$1) != obj) {
                            }
                        }
                        break;
                    case 2:
                        long j4 = androidHandleGatewayAdResponse$invoke$1.J$0;
                        z5 = androidHandleGatewayAdResponse$invoke$1.Z$1;
                        z6 = androidHandleGatewayAdResponse$invoke$1.Z$0;
                        adObject2 = (AdObject) androidHandleGatewayAdResponse$invoke$1.L$8;
                        CoroutineScope coroutineScope10 = (CoroutineScope) androidHandleGatewayAdResponse$invoke$1.L$7;
                        WebViewConfiguration webViewConfiguration14 = (WebViewConfiguration) androidHandleGatewayAdResponse$invoke$1.L$6;
                        Ref$ObjectRef ref$ObjectRef16 = (Ref$ObjectRef) androidHandleGatewayAdResponse$invoke$1.L$5;
                        DiagnosticEventRequestOuterClass.DiagnosticAdType diagnosticAdType8 = (DiagnosticEventRequestOuterClass.DiagnosticAdType) androidHandleGatewayAdResponse$invoke$1.L$4;
                        String str20 = (String) androidHandleGatewayAdResponse$invoke$1.L$3;
                        AdResponseOuterClass.AdResponse adResponse7 = (AdResponseOuterClass.AdResponse) androidHandleGatewayAdResponse$invoke$1.L$2;
                        ByteString byteString8 = (ByteString) androidHandleGatewayAdResponse$invoke$1.L$1;
                        UnityAdsLoadOptions unityAdsLoadOptions7 = (UnityAdsLoadOptions) androidHandleGatewayAdResponse$invoke$1.L$0;
                        ResultKt.throwOnFailure(obj5);
                        str3 = str20;
                        webViewConfiguration = webViewConfiguration14;
                        byteString4 = byteString8;
                        diagnosticAdType3 = diagnosticAdType8;
                        coroutineScope = coroutineScope10;
                        adResponse3 = adResponse7;
                        obj2 = coroutine_suspended;
                        ref$ObjectRef3 = ref$ObjectRef16;
                        unityAdsLoadOptions2 = unityAdsLoadOptions7;
                        j = j4;
                        boolean z192 = z6;
                        z8 = z5;
                        timedValue = new TimedValue(Boxing.boxBoolean(((Boolean) obj5).booleanValue()), TimeSource$Monotonic.ValueTimeMark.m8189elapsedNowUwyO8pc(j), null);
                        adObject3 = adObject2;
                        coroutineScope2 = coroutineScope;
                        diagnosticAdType4 = diagnosticAdType3;
                        str4 = str3;
                        z7 = z192;
                        if (timedValue != null) {
                        }
                        if (timedValue != null) {
                        }
                        if (booleanValue == 0) {
                        }
                        break;
                    case 3:
                        i = androidHandleGatewayAdResponse$invoke$1.I$0;
                        z12 = androidHandleGatewayAdResponse$invoke$1.Z$1;
                        z11 = androidHandleGatewayAdResponse$invoke$1.Z$0;
                        adObject3 = (AdObject) androidHandleGatewayAdResponse$invoke$1.L$8;
                        coroutineScope2 = (CoroutineScope) androidHandleGatewayAdResponse$invoke$1.L$7;
                        webViewConfiguration2 = (WebViewConfiguration) androidHandleGatewayAdResponse$invoke$1.L$6;
                        ref$ObjectRef4 = (Ref$ObjectRef) androidHandleGatewayAdResponse$invoke$1.L$5;
                        diagnosticAdType4 = (DiagnosticEventRequestOuterClass.DiagnosticAdType) androidHandleGatewayAdResponse$invoke$1.L$4;
                        str5 = (String) androidHandleGatewayAdResponse$invoke$1.L$3;
                        AdResponseOuterClass.AdResponse adResponse8 = (AdResponseOuterClass.AdResponse) androidHandleGatewayAdResponse$invoke$1.L$2;
                        byteString2 = (ByteString) androidHandleGatewayAdResponse$invoke$1.L$1;
                        unityAdsLoadOptions3 = (UnityAdsLoadOptions) androidHandleGatewayAdResponse$invoke$1.L$0;
                        ResultKt.throwOnFailure(obj5);
                        adResponse4 = adResponse8;
                        obj2 = coroutine_suspended;
                        adResponse5 = adResponse4;
                        boolean z222 = z11;
                        i2 = i;
                        adObject4 = adObject3;
                        z13 = z12;
                        coroutineScope3 = coroutineScope2;
                        webViewConfiguration3 = webViewConfiguration2;
                        ref$ObjectRef5 = ref$ObjectRef4;
                        diagnosticAdType5 = diagnosticAdType4;
                        z14 = z222;
                        if (webViewConfiguration3.getEntryPoint().length() == 0) {
                        }
                        break;
                    case 4:
                        Ref$ObjectRef ref$ObjectRef17 = (Ref$ObjectRef) androidHandleGatewayAdResponse$invoke$1.L$2;
                        AdResponseOuterClass.AdResponse adResponse9 = (AdResponseOuterClass.AdResponse) androidHandleGatewayAdResponse$invoke$1.L$1;
                        ByteString byteString9 = (ByteString) androidHandleGatewayAdResponse$invoke$1.L$0;
                        try {
                            ResultKt.throwOnFailure(obj5);
                        } catch (CancellationException e30) {
                            e = e30;
                            ref$ObjectRef = ref$ObjectRef17;
                            adResponse2 = adResponse9;
                            byteString2 = byteString9;
                            obj = coroutine_suspended;
                            nonCancellable = NonCancellable.INSTANCE;
                            androidHandleGatewayAdResponse$invoke$5 = new AndroidHandleGatewayAdResponse$invoke$5(this, e, byteString2, adResponse2, ref$ObjectRef, null);
                            androidHandleGatewayAdResponse$invoke$1.L$0 = e;
                            androidHandleGatewayAdResponse$invoke$1.L$1 = null;
                            androidHandleGatewayAdResponse$invoke$1.L$2 = null;
                            androidHandleGatewayAdResponse$invoke$1.L$3 = null;
                            androidHandleGatewayAdResponse$invoke$1.L$4 = null;
                            androidHandleGatewayAdResponse$invoke$1.L$5 = null;
                            androidHandleGatewayAdResponse$invoke$1.L$6 = null;
                            androidHandleGatewayAdResponse$invoke$1.L$7 = null;
                            androidHandleGatewayAdResponse$invoke$1.L$8 = null;
                            androidHandleGatewayAdResponse$invoke$1.L$9 = null;
                            androidHandleGatewayAdResponse$invoke$1.L$10 = null;
                            androidHandleGatewayAdResponse$invoke$1.label = 9;
                            if (BuildersKt.withContext(nonCancellable, androidHandleGatewayAdResponse$invoke$5, androidHandleGatewayAdResponse$invoke$1) != obj) {
                            }
                        }
                        break;
                    case 5:
                        long j5 = androidHandleGatewayAdResponse$invoke$1.J$0;
                        i3 = androidHandleGatewayAdResponse$invoke$1.I$0;
                        boolean z27 = androidHandleGatewayAdResponse$invoke$1.Z$0;
                        String str21 = (String) androidHandleGatewayAdResponse$invoke$1.L$10;
                        String str22 = (String) androidHandleGatewayAdResponse$invoke$1.L$9;
                        AdObject adObject14 = (AdObject) androidHandleGatewayAdResponse$invoke$1.L$8;
                        CoroutineScope coroutineScope11 = (CoroutineScope) androidHandleGatewayAdResponse$invoke$1.L$7;
                        WebViewConfiguration webViewConfiguration15 = (WebViewConfiguration) androidHandleGatewayAdResponse$invoke$1.L$6;
                        Ref$ObjectRef ref$ObjectRef18 = (Ref$ObjectRef) androidHandleGatewayAdResponse$invoke$1.L$5;
                        DiagnosticEventRequestOuterClass.DiagnosticAdType diagnosticAdType9 = (DiagnosticEventRequestOuterClass.DiagnosticAdType) androidHandleGatewayAdResponse$invoke$1.L$4;
                        String str23 = (String) androidHandleGatewayAdResponse$invoke$1.L$3;
                        AdResponseOuterClass.AdResponse adResponse10 = (AdResponseOuterClass.AdResponse) androidHandleGatewayAdResponse$invoke$1.L$2;
                        byteString5 = (ByteString) androidHandleGatewayAdResponse$invoke$1.L$1;
                        UnityAdsLoadOptions unityAdsLoadOptions8 = (UnityAdsLoadOptions) androidHandleGatewayAdResponse$invoke$1.L$0;
                        try {
                            ResultKt.throwOnFailure(obj5);
                            coroutineScope5 = coroutineScope11;
                            diagnosticAdType6 = diagnosticAdType9;
                            webViewConfiguration6 = webViewConfiguration15;
                            adObject6 = adObject14;
                            str9 = str23;
                            ref$ObjectRef7 = ref$ObjectRef18;
                            unityAdsLoadOptions3 = unityAdsLoadOptions8;
                            str8 = str21;
                            str7 = str22;
                            obj4 = coroutine_suspended;
                            adResponse5 = adResponse10;
                            z15 = z27;
                            m8186markNowz9LOYto2 = j5;
                            z16 = z15;
                            ref$ObjectRef8 = ref$ObjectRef7;
                            diagnosticAdType7 = diagnosticAdType6;
                            webViewConfiguration7 = webViewConfiguration6;
                            byteString2 = byteString5;
                            m8023constructorimpl = Result.m8023constructorimpl((AndroidWebViewContainer) obj5);
                            adObject7 = adObject6;
                            i4 = i3;
                            coroutineScope6 = coroutineScope5;
                            String str192 = str7;
                            unityAdsLoadOptions4 = unityAdsLoadOptions3;
                            str11 = str9;
                            adResponse6 = adResponse5;
                            str10 = str192;
                        } catch (Throwable th9) {
                            th = th9;
                            coroutineScope5 = coroutineScope11;
                            diagnosticAdType6 = diagnosticAdType9;
                            webViewConfiguration6 = webViewConfiguration15;
                            byteString2 = byteString5;
                            adObject5 = adObject14;
                            str5 = str23;
                            ref$ObjectRef6 = ref$ObjectRef18;
                            unityAdsLoadOptions3 = unityAdsLoadOptions8;
                            str8 = str21;
                            str7 = str22;
                            obj4 = coroutine_suspended;
                            adResponse5 = adResponse10;
                            z15 = z27;
                            m8186markNowz9LOYto2 = j5;
                            Result.Companion companion22222 = Result.INSTANCE;
                            z16 = z15;
                            ref$ObjectRef8 = ref$ObjectRef6;
                            diagnosticAdType7 = diagnosticAdType6;
                            webViewConfiguration7 = webViewConfiguration6;
                            adResponse6 = adResponse5;
                            str10 = str7;
                            unityAdsLoadOptions4 = unityAdsLoadOptions3;
                            str11 = str5;
                            i4 = i3;
                            coroutineScope6 = coroutineScope5;
                            AdObject adObject112222 = adObject5;
                            m8023constructorimpl = Result.m8023constructorimpl(ResultKt.createFailure(th));
                            adObject7 = adObject112222;
                            String str1522222 = str10;
                            CoroutineScope coroutineScope922222 = coroutineScope6;
                            TimedValue timedValue222222 = new TimedValue(Result.m8022boximpl(m8023constructorimpl), TimeSource$Monotonic.ValueTimeMark.m8189elapsedNowUwyO8pc(m8186markNowz9LOYto2), null);
                            coroutineScope7 = coroutineScope922222;
                            ref$ObjectRef9 = ref$ObjectRef8;
                            String str1622222 = str11;
                            String str1722222 = str8;
                            unityAdsLoadOptions5 = unityAdsLoadOptions4;
                            i5 = i4;
                            SendDiagnosticEvent.DefaultImpls.invoke$default(this.sendDiagnosticEvent, Result.m8029isSuccessimpl(((Result) timedValue222222.component1()).getValue()) ? DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_WEBVIEW_SUCCESS_TIME : DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_WEBVIEW_FAILURE_TIME, Boxing.boxDouble(Duration.m8166toDoubleimpl(timedValue222222.m8198component2UwyO8pc(), DurationUnit.MILLISECONDS)), (Map) null, (Map) null, adObject7, (Integer) null, (ByteString) null, 108, (Object) null);
                            Object value22222 = ((Result) timedValue222222.getValue()).getValue();
                            ResultKt.throwOnFailure(value22222);
                            AndroidWebViewContainer androidWebViewContainer22222 = (AndroidWebViewContainer) value22222;
                            WebViewBridge invoke222222 = this.getWebViewBridge.invoke(androidWebViewContainer22222, this.adPlayerScope);
                            ?? invoke322222 = this.getAdPlayer.invoke(invoke222222, androidWebViewContainer22222, adObject7, diagnosticAdType7);
                            ref$ObjectRef = ref$ObjectRef9;
                            ref$ObjectRef.element = invoke322222;
                            copy = r17.copy((r35 & 1) != 0 ? r17.adScope : adObject7.getAdScope(), (r35 & 2) != 0 ? r17.opportunityId : null, (r35 & 4) != 0 ? r17.placementId : null, (r35 & 8) != 0 ? r17.trackingToken : null, (r35 & 16) != 0 ? r17.isOfferwallAd : false, (r35 & 32) != 0 ? r17.offerwallPlacementName : null, (r35 & 64) != 0 ? r17.adPlayer : (AdPlayer) invoke322222, (r35 & 128) != 0 ? r17.playerServerId : null, (r35 & 256) != 0 ? r17.loadOptions : null, (r35 & 512) != 0 ? r17.isHeaderBidding : false, (r35 & 1024) != 0 ? r17.adType : null, (r35 & 2048) != 0 ? r17.ttl : null, (r35 & 4096) != 0 ? r17.state : null, (r35 & 8192) != 0 ? r17.loadConfiguration : null, (r35 & 16384) != 0 ? r17.showConfiguration : null, (r35 & 32768) != 0 ? r17.activity : null, (r35 & 65536) != 0 ? adObject7.webViewLessLoadingRequiredData : adObject7.getWebViewLessLoadingRequiredData());
                            FlowKt.launchIn(FlowKt.onEach(this.deviceInfoRepository.getAllowedPii(), new AndroidHandleGatewayAdResponse$invoke$2(ref$ObjectRef, null)), ((AdPlayer) ref$ObjectRef.element).getScope());
                            long m8186markNowz9LOYto322222 = TimeSource$Monotonic.INSTANCE.m8186markNowz9LOYto();
                            SendDiagnosticEvent.DefaultImpls.invoke$default(this.sendDiagnosticEvent, DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_LOAD_STARTED_AD_VIEWER, (Double) null, (Map) null, (Map) null, copy, (Integer) null, (ByteString) null, 110, (Object) null);
                            HandleInvocationsFromAdViewer handleInvocationsFromAdViewer22222 = this.getHandleInvocationsFromAdViewer;
                            ByteString adData22222 = adResponse6.getAdData();
                            Intrinsics.checkNotNullExpressionValue(adData22222, "getAdData(...)");
                            obj3 = obj4;
                            String base64$default22222 = ProtobufExtensionsKt.toBase64$default(adData22222, false, 1, null);
                            Intrinsics.checkNotNull(str1722222);
                            ByteString adDataRefreshToken22222 = adResponse6.getAdDataRefreshToken();
                            Intrinsics.checkNotNullExpressionValue(adDataRefreshToken22222, "getAdDataRefreshToken(...)");
                            invoke222222.setExposedFunctions(handleInvocationsFromAdViewer22222.invoke(base64$default22222, ProtobufExtensionsKt.toBase64$default(adDataRefreshToken22222, false, 1, null), str1722222, copy));
                            if (z16) {
                            }
                            androidHandleGatewayAdResponse$invoke$1.L$0 = unityAdsLoadOptions5;
                            androidHandleGatewayAdResponse$invoke$1.L$1 = byteString2;
                            androidHandleGatewayAdResponse$invoke$1.L$2 = adResponse6;
                            androidHandleGatewayAdResponse$invoke$1.L$3 = str1622222;
                            androidHandleGatewayAdResponse$invoke$1.L$4 = ref$ObjectRef;
                            webViewConfiguration9 = webViewConfiguration7;
                            androidHandleGatewayAdResponse$invoke$1.L$5 = webViewConfiguration9;
                            androidHandleGatewayAdResponse$invoke$1.L$6 = coroutineScope7;
                            androidHandleGatewayAdResponse$invoke$1.L$7 = copy;
                            androidHandleGatewayAdResponse$invoke$1.L$8 = null;
                            androidHandleGatewayAdResponse$invoke$1.L$9 = null;
                            androidHandleGatewayAdResponse$invoke$1.L$10 = null;
                            i6 = i5;
                            androidHandleGatewayAdResponse$invoke$1.I$0 = i6;
                            androidHandleGatewayAdResponse$invoke$1.J$0 = m8186markNowz9LOYto322222;
                            androidHandleGatewayAdResponse$invoke$1.label = 6;
                            loadUrl = loadUrl(adObject7, str1522222, androidWebViewContainer22222, androidHandleGatewayAdResponse$invoke$1);
                            obj = obj3;
                            if (loadUrl == obj) {
                            }
                        }
                        String str15222222 = str10;
                        CoroutineScope coroutineScope9222222 = coroutineScope6;
                        TimedValue timedValue2222222 = new TimedValue(Result.m8022boximpl(m8023constructorimpl), TimeSource$Monotonic.ValueTimeMark.m8189elapsedNowUwyO8pc(m8186markNowz9LOYto2), null);
                        coroutineScope7 = coroutineScope9222222;
                        ref$ObjectRef9 = ref$ObjectRef8;
                        String str16222222 = str11;
                        String str17222222 = str8;
                        unityAdsLoadOptions5 = unityAdsLoadOptions4;
                        i5 = i4;
                        SendDiagnosticEvent.DefaultImpls.invoke$default(this.sendDiagnosticEvent, Result.m8029isSuccessimpl(((Result) timedValue2222222.component1()).getValue()) ? DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_WEBVIEW_SUCCESS_TIME : DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_WEBVIEW_FAILURE_TIME, Boxing.boxDouble(Duration.m8166toDoubleimpl(timedValue2222222.m8198component2UwyO8pc(), DurationUnit.MILLISECONDS)), (Map) null, (Map) null, adObject7, (Integer) null, (ByteString) null, 108, (Object) null);
                        Object value222222 = ((Result) timedValue2222222.getValue()).getValue();
                        ResultKt.throwOnFailure(value222222);
                        AndroidWebViewContainer androidWebViewContainer222222 = (AndroidWebViewContainer) value222222;
                        WebViewBridge invoke2222222 = this.getWebViewBridge.invoke(androidWebViewContainer222222, this.adPlayerScope);
                        ?? invoke3222222 = this.getAdPlayer.invoke(invoke2222222, androidWebViewContainer222222, adObject7, diagnosticAdType7);
                        ref$ObjectRef = ref$ObjectRef9;
                        ref$ObjectRef.element = invoke3222222;
                        copy = r17.copy((r35 & 1) != 0 ? r17.adScope : adObject7.getAdScope(), (r35 & 2) != 0 ? r17.opportunityId : null, (r35 & 4) != 0 ? r17.placementId : null, (r35 & 8) != 0 ? r17.trackingToken : null, (r35 & 16) != 0 ? r17.isOfferwallAd : false, (r35 & 32) != 0 ? r17.offerwallPlacementName : null, (r35 & 64) != 0 ? r17.adPlayer : (AdPlayer) invoke3222222, (r35 & 128) != 0 ? r17.playerServerId : null, (r35 & 256) != 0 ? r17.loadOptions : null, (r35 & 512) != 0 ? r17.isHeaderBidding : false, (r35 & 1024) != 0 ? r17.adType : null, (r35 & 2048) != 0 ? r17.ttl : null, (r35 & 4096) != 0 ? r17.state : null, (r35 & 8192) != 0 ? r17.loadConfiguration : null, (r35 & 16384) != 0 ? r17.showConfiguration : null, (r35 & 32768) != 0 ? r17.activity : null, (r35 & 65536) != 0 ? adObject7.webViewLessLoadingRequiredData : adObject7.getWebViewLessLoadingRequiredData());
                        FlowKt.launchIn(FlowKt.onEach(this.deviceInfoRepository.getAllowedPii(), new AndroidHandleGatewayAdResponse$invoke$2(ref$ObjectRef, null)), ((AdPlayer) ref$ObjectRef.element).getScope());
                        long m8186markNowz9LOYto3222222 = TimeSource$Monotonic.INSTANCE.m8186markNowz9LOYto();
                        SendDiagnosticEvent.DefaultImpls.invoke$default(this.sendDiagnosticEvent, DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_LOAD_STARTED_AD_VIEWER, (Double) null, (Map) null, (Map) null, copy, (Integer) null, (ByteString) null, 110, (Object) null);
                        HandleInvocationsFromAdViewer handleInvocationsFromAdViewer222222 = this.getHandleInvocationsFromAdViewer;
                        ByteString adData222222 = adResponse6.getAdData();
                        Intrinsics.checkNotNullExpressionValue(adData222222, "getAdData(...)");
                        obj3 = obj4;
                        String base64$default222222 = ProtobufExtensionsKt.toBase64$default(adData222222, false, 1, null);
                        Intrinsics.checkNotNull(str17222222);
                        ByteString adDataRefreshToken222222 = adResponse6.getAdDataRefreshToken();
                        Intrinsics.checkNotNullExpressionValue(adDataRefreshToken222222, "getAdDataRefreshToken(...)");
                        invoke2222222.setExposedFunctions(handleInvocationsFromAdViewer222222.invoke(base64$default222222, ProtobufExtensionsKt.toBase64$default(adDataRefreshToken222222, false, 1, null), str17222222, copy));
                        if (z16) {
                        }
                        androidHandleGatewayAdResponse$invoke$1.L$0 = unityAdsLoadOptions5;
                        androidHandleGatewayAdResponse$invoke$1.L$1 = byteString2;
                        androidHandleGatewayAdResponse$invoke$1.L$2 = adResponse6;
                        androidHandleGatewayAdResponse$invoke$1.L$3 = str16222222;
                        androidHandleGatewayAdResponse$invoke$1.L$4 = ref$ObjectRef;
                        webViewConfiguration9 = webViewConfiguration7;
                        androidHandleGatewayAdResponse$invoke$1.L$5 = webViewConfiguration9;
                        androidHandleGatewayAdResponse$invoke$1.L$6 = coroutineScope7;
                        androidHandleGatewayAdResponse$invoke$1.L$7 = copy;
                        androidHandleGatewayAdResponse$invoke$1.L$8 = null;
                        androidHandleGatewayAdResponse$invoke$1.L$9 = null;
                        androidHandleGatewayAdResponse$invoke$1.L$10 = null;
                        i6 = i5;
                        androidHandleGatewayAdResponse$invoke$1.I$0 = i6;
                        androidHandleGatewayAdResponse$invoke$1.J$0 = m8186markNowz9LOYto3222222;
                        androidHandleGatewayAdResponse$invoke$1.label = 6;
                        loadUrl = loadUrl(adObject7, str15222222, androidWebViewContainer222222, androidHandleGatewayAdResponse$invoke$1);
                        obj = obj3;
                        if (loadUrl == obj) {
                        }
                        break;
                    case 6:
                        long j6 = androidHandleGatewayAdResponse$invoke$1.J$0;
                        int i9 = androidHandleGatewayAdResponse$invoke$1.I$0;
                        AdObject adObject15 = (AdObject) androidHandleGatewayAdResponse$invoke$1.L$7;
                        coroutineScope8 = (CoroutineScope) androidHandleGatewayAdResponse$invoke$1.L$6;
                        WebViewConfiguration webViewConfiguration16 = (WebViewConfiguration) androidHandleGatewayAdResponse$invoke$1.L$5;
                        ref$ObjectRef10 = (Ref$ObjectRef) androidHandleGatewayAdResponse$invoke$1.L$4;
                        str13 = (String) androidHandleGatewayAdResponse$invoke$1.L$3;
                        adResponse2 = (AdResponseOuterClass.AdResponse) androidHandleGatewayAdResponse$invoke$1.L$2;
                        byteString6 = (ByteString) androidHandleGatewayAdResponse$invoke$1.L$1;
                        unityAdsLoadOptions6 = (UnityAdsLoadOptions) androidHandleGatewayAdResponse$invoke$1.L$0;
                        ResultKt.throwOnFailure(obj5);
                        adObject8 = adObject15;
                        i6 = i9;
                        j3 = j6;
                        webViewConfiguration9 = webViewConfiguration16;
                        obj = coroutine_suspended;
                        Flow onLoadEvent2 = ((AdPlayer) ref$ObjectRef10.element).getOnLoadEvent();
                        androidHandleGatewayAdResponse$invoke$1.L$0 = unityAdsLoadOptions6;
                        androidHandleGatewayAdResponse$invoke$1.L$1 = byteString6;
                        androidHandleGatewayAdResponse$invoke$1.L$2 = adResponse2;
                        androidHandleGatewayAdResponse$invoke$1.L$3 = str13;
                        androidHandleGatewayAdResponse$invoke$1.L$4 = ref$ObjectRef10;
                        androidHandleGatewayAdResponse$invoke$1.L$5 = webViewConfiguration9;
                        androidHandleGatewayAdResponse$invoke$1.L$6 = coroutineScope8;
                        androidHandleGatewayAdResponse$invoke$1.L$7 = adObject8;
                        androidHandleGatewayAdResponse$invoke$1.I$0 = i6;
                        androidHandleGatewayAdResponse$invoke$1.J$0 = j3;
                        androidHandleGatewayAdResponse$invoke$1.label = 7;
                        single = FlowKt.single(onLoadEvent2, androidHandleGatewayAdResponse$invoke$1);
                        if (single != obj) {
                        }
                        break;
                    case 7:
                        long j7 = androidHandleGatewayAdResponse$invoke$1.J$0;
                        int i10 = androidHandleGatewayAdResponse$invoke$1.I$0;
                        AdObject adObject16 = (AdObject) androidHandleGatewayAdResponse$invoke$1.L$7;
                        coroutineScope8 = (CoroutineScope) androidHandleGatewayAdResponse$invoke$1.L$6;
                        WebViewConfiguration webViewConfiguration17 = (WebViewConfiguration) androidHandleGatewayAdResponse$invoke$1.L$5;
                        ref$ObjectRef10 = (Ref$ObjectRef) androidHandleGatewayAdResponse$invoke$1.L$4;
                        str13 = (String) androidHandleGatewayAdResponse$invoke$1.L$3;
                        adResponse2 = (AdResponseOuterClass.AdResponse) androidHandleGatewayAdResponse$invoke$1.L$2;
                        byteString6 = (ByteString) androidHandleGatewayAdResponse$invoke$1.L$1;
                        unityAdsLoadOptions6 = (UnityAdsLoadOptions) androidHandleGatewayAdResponse$invoke$1.L$0;
                        ResultKt.throwOnFailure(obj5);
                        webViewConfiguration10 = webViewConfiguration17;
                        i6 = i10;
                        adObject9 = adObject16;
                        j3 = j7;
                        obj = coroutine_suspended;
                        str12 = str13;
                        ref$ObjectRef11 = ref$ObjectRef10;
                        WebViewConfiguration webViewConfiguration132 = webViewConfiguration10;
                        coroutineScope7 = coroutineScope8;
                        i5 = i6;
                        ref$ObjectRef = ref$ObjectRef11;
                        unityAdsLoadOptions5 = unityAdsLoadOptions6;
                        AdObject adObject122 = adObject9;
                        loadEvent = (LoadEvent) obj5;
                        webViewConfiguration8 = webViewConfiguration132;
                        j2 = j3;
                        copy = adObject122;
                        if (loadEvent instanceof LoadEvent.Error) {
                        }
                        break;
                    case 8:
                        loadEvent = (LoadEvent) androidHandleGatewayAdResponse$invoke$1.L$3;
                        Ref$ObjectRef ref$ObjectRef19 = (Ref$ObjectRef) androidHandleGatewayAdResponse$invoke$1.L$2;
                        AdResponseOuterClass.AdResponse adResponse11 = (AdResponseOuterClass.AdResponse) androidHandleGatewayAdResponse$invoke$1.L$1;
                        byteString7 = (ByteString) androidHandleGatewayAdResponse$invoke$1.L$0;
                        try {
                            ResultKt.throwOnFailure(obj5);
                            ref$ObjectRef = ref$ObjectRef19;
                            adResponse2 = adResponse11;
                            obj = coroutine_suspended;
                            return new LoadResult.Failure(ErrorOuterClass.PublicErrorCode.PUBLIC_ERROR_CODE_UNSPECIFIED, UnityAdsConstants.Messages.MSG_INTERNAL_ERROR, null, "adviewer", ((LoadEvent.Error) loadEvent).getMessage(), null, 36, null);
                        } catch (CancellationException e31) {
                            e = e31;
                            ref$ObjectRef = ref$ObjectRef19;
                            adResponse2 = adResponse11;
                            byteString2 = byteString7;
                            obj = coroutine_suspended;
                            nonCancellable = NonCancellable.INSTANCE;
                            androidHandleGatewayAdResponse$invoke$5 = new AndroidHandleGatewayAdResponse$invoke$5(this, e, byteString2, adResponse2, ref$ObjectRef, null);
                            androidHandleGatewayAdResponse$invoke$1.L$0 = e;
                            androidHandleGatewayAdResponse$invoke$1.L$1 = null;
                            androidHandleGatewayAdResponse$invoke$1.L$2 = null;
                            androidHandleGatewayAdResponse$invoke$1.L$3 = null;
                            androidHandleGatewayAdResponse$invoke$1.L$4 = null;
                            androidHandleGatewayAdResponse$invoke$1.L$5 = null;
                            androidHandleGatewayAdResponse$invoke$1.L$6 = null;
                            androidHandleGatewayAdResponse$invoke$1.L$7 = null;
                            androidHandleGatewayAdResponse$invoke$1.L$8 = null;
                            androidHandleGatewayAdResponse$invoke$1.L$9 = null;
                            androidHandleGatewayAdResponse$invoke$1.L$10 = null;
                            androidHandleGatewayAdResponse$invoke$1.label = 9;
                            if (BuildersKt.withContext(nonCancellable, androidHandleGatewayAdResponse$invoke$5, androidHandleGatewayAdResponse$invoke$1) != obj) {
                            }
                        }
                        break;
                    case 9:
                        cancellationException = (CancellationException) androidHandleGatewayAdResponse$invoke$1.L$0;
                        ResultKt.throwOnFailure(obj5);
                        cause = cancellationException.getCause();
                        if (cause != null) {
                            throw cancellationException;
                        }
                        throw cause;
                    default:
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }
        }
        androidHandleGatewayAdResponse$invoke$1 = new AndroidHandleGatewayAdResponse$invoke$1(this, continuation);
        Object obj52 = androidHandleGatewayAdResponse$invoke$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        switch (androidHandleGatewayAdResponse$invoke$1.label) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:16:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object loadUrl(AdObject adObject, String str, WebViewContainer webViewContainer, Continuation continuation) {
        AndroidHandleGatewayAdResponse$loadUrl$1 androidHandleGatewayAdResponse$loadUrl$1;
        int i;
        AdObject adObject2;
        long j;
        Object m8023constructorimpl;
        if (continuation instanceof AndroidHandleGatewayAdResponse$loadUrl$1) {
            androidHandleGatewayAdResponse$loadUrl$1 = (AndroidHandleGatewayAdResponse$loadUrl$1) continuation;
            int i2 = androidHandleGatewayAdResponse$loadUrl$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                androidHandleGatewayAdResponse$loadUrl$1.label = i2 - Integer.MIN_VALUE;
                Object obj = androidHandleGatewayAdResponse$loadUrl$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = androidHandleGatewayAdResponse$loadUrl$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    long m8186markNowz9LOYto = TimeSource$Monotonic.INSTANCE.m8186markNowz9LOYto();
                    try {
                        Result.Companion companion = Result.INSTANCE;
                        androidHandleGatewayAdResponse$loadUrl$1.L$0 = adObject;
                        androidHandleGatewayAdResponse$loadUrl$1.J$0 = m8186markNowz9LOYto;
                        androidHandleGatewayAdResponse$loadUrl$1.label = 1;
                        if (webViewContainer.loadUrl(str, androidHandleGatewayAdResponse$loadUrl$1) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        adObject2 = adObject;
                        j = m8186markNowz9LOYto;
                    } catch (Throwable th) {
                        th = th;
                        adObject2 = adObject;
                        j = m8186markNowz9LOYto;
                        Result.Companion companion2 = Result.INSTANCE;
                        m8023constructorimpl = Result.m8023constructorimpl(ResultKt.createFailure(th));
                        AdObject adObject3 = adObject2;
                        TimedValue timedValue = new TimedValue(Result.m8022boximpl(m8023constructorimpl), TimeSource$Monotonic.ValueTimeMark.m8189elapsedNowUwyO8pc(j), null);
                        Object value = ((Result) timedValue.component1()).getValue();
                        SendDiagnosticEvent.DefaultImpls.invoke$default(this.sendDiagnosticEvent, !Result.m8029isSuccessimpl(value) ? DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_LOAD_FILE_SUCCESS_TIME : DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_LOAD_FILE_FAILURE_TIME, Boxing.boxDouble(Duration.m8166toDoubleimpl(timedValue.m8198component2UwyO8pc(), DurationUnit.MILLISECONDS)), (Map) null, (Map) null, adObject3, (Integer) null, (ByteString) null, 108, (Object) null);
                        ResultKt.throwOnFailure(value);
                        return Unit.INSTANCE;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    j = androidHandleGatewayAdResponse$loadUrl$1.J$0;
                    adObject2 = (AdObject) androidHandleGatewayAdResponse$loadUrl$1.L$0;
                    try {
                        ResultKt.throwOnFailure(obj);
                    } catch (Throwable th2) {
                        th = th2;
                        Result.Companion companion22 = Result.INSTANCE;
                        m8023constructorimpl = Result.m8023constructorimpl(ResultKt.createFailure(th));
                        AdObject adObject32 = adObject2;
                        TimedValue timedValue2 = new TimedValue(Result.m8022boximpl(m8023constructorimpl), TimeSource$Monotonic.ValueTimeMark.m8189elapsedNowUwyO8pc(j), null);
                        Object value2 = ((Result) timedValue2.component1()).getValue();
                        SendDiagnosticEvent.DefaultImpls.invoke$default(this.sendDiagnosticEvent, !Result.m8029isSuccessimpl(value2) ? DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_LOAD_FILE_SUCCESS_TIME : DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_LOAD_FILE_FAILURE_TIME, Boxing.boxDouble(Duration.m8166toDoubleimpl(timedValue2.m8198component2UwyO8pc(), DurationUnit.MILLISECONDS)), (Map) null, (Map) null, adObject32, (Integer) null, (ByteString) null, 108, (Object) null);
                        ResultKt.throwOnFailure(value2);
                        return Unit.INSTANCE;
                    }
                }
                m8023constructorimpl = Result.m8023constructorimpl(Unit.INSTANCE);
                AdObject adObject322 = adObject2;
                TimedValue timedValue22 = new TimedValue(Result.m8022boximpl(m8023constructorimpl), TimeSource$Monotonic.ValueTimeMark.m8189elapsedNowUwyO8pc(j), null);
                Object value22 = ((Result) timedValue22.component1()).getValue();
                SendDiagnosticEvent.DefaultImpls.invoke$default(this.sendDiagnosticEvent, !Result.m8029isSuccessimpl(value22) ? DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_LOAD_FILE_SUCCESS_TIME : DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_LOAD_FILE_FAILURE_TIME, Boxing.boxDouble(Duration.m8166toDoubleimpl(timedValue22.m8198component2UwyO8pc(), DurationUnit.MILLISECONDS)), (Map) null, (Map) null, adObject322, (Integer) null, (ByteString) null, 108, (Object) null);
                ResultKt.throwOnFailure(value22);
                return Unit.INSTANCE;
            }
        }
        androidHandleGatewayAdResponse$loadUrl$1 = new AndroidHandleGatewayAdResponse$loadUrl$1(this, continuation);
        Object obj2 = androidHandleGatewayAdResponse$loadUrl$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = androidHandleGatewayAdResponse$loadUrl$1.label;
        if (i != 0) {
        }
        m8023constructorimpl = Result.m8023constructorimpl(Unit.INSTANCE);
        AdObject adObject3222 = adObject2;
        TimedValue timedValue222 = new TimedValue(Result.m8022boximpl(m8023constructorimpl), TimeSource$Monotonic.ValueTimeMark.m8189elapsedNowUwyO8pc(j), null);
        Object value222 = ((Result) timedValue222.component1()).getValue();
        SendDiagnosticEvent.DefaultImpls.invoke$default(this.sendDiagnosticEvent, !Result.m8029isSuccessimpl(value222) ? DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_LOAD_FILE_SUCCESS_TIME : DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_LOAD_FILE_FAILURE_TIME, Boxing.boxDouble(Duration.m8166toDoubleimpl(timedValue222.m8198component2UwyO8pc(), DurationUnit.MILLISECONDS)), (Map) null, (Map) null, adObject3222, (Integer) null, (ByteString) null, 108, (Object) null);
        ResultKt.throwOnFailure(value222);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object cleanup(Throwable th, ByteString byteString, AdResponseOuterClass.AdResponse adResponse, AdPlayer adPlayer, Continuation continuation) {
        AndroidHandleGatewayAdResponse$cleanup$1 androidHandleGatewayAdResponse$cleanup$1;
        int i;
        String message;
        AdPlayer adPlayer2;
        Object invoke;
        if (continuation instanceof AndroidHandleGatewayAdResponse$cleanup$1) {
            androidHandleGatewayAdResponse$cleanup$1 = (AndroidHandleGatewayAdResponse$cleanup$1) continuation;
            int i2 = androidHandleGatewayAdResponse$cleanup$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                androidHandleGatewayAdResponse$cleanup$1.label = i2 - Integer.MIN_VALUE;
                Object obj = androidHandleGatewayAdResponse$cleanup$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = androidHandleGatewayAdResponse$cleanup$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    OperativeEventErrorDataKt.Dsl.Companion companion = OperativeEventErrorDataKt.Dsl.INSTANCE;
                    OperativeEventRequestOuterClass.OperativeEventErrorData.Builder newBuilder = OperativeEventRequestOuterClass.OperativeEventErrorData.newBuilder();
                    Intrinsics.checkNotNullExpressionValue(newBuilder, "newBuilder(...)");
                    OperativeEventErrorDataKt.Dsl _create = companion._create(newBuilder);
                    _create.setErrorType(OperativeEventRequestOuterClass.OperativeEventErrorType.OPERATIVE_EVENT_ERROR_TYPE_UNSPECIFIED);
                    Throwable cause = th.getCause();
                    if ((cause == null || (message = cause.getMessage()) == null) && (message = th.getMessage()) == null) {
                        message = "";
                    }
                    _create.setMessage(message);
                    OperativeEventRequestOuterClass.OperativeEventErrorData _build = _create._build();
                    GetOperativeEventApi getOperativeEventApi = this.getOperativeEventApi;
                    OperativeEventRequestOuterClass.OperativeEventType operativeEventType = OperativeEventRequestOuterClass.OperativeEventType.OPERATIVE_EVENT_TYPE_LOAD_ERROR;
                    ByteString trackingToken = adResponse.getTrackingToken();
                    Intrinsics.checkNotNullExpressionValue(trackingToken, "getTrackingToken(...)");
                    ByteString byteString2 = _build.toByteString();
                    Intrinsics.checkNotNullExpressionValue(byteString2, "toByteString(...)");
                    adPlayer2 = adPlayer;
                    androidHandleGatewayAdResponse$cleanup$1.L$0 = adPlayer2;
                    androidHandleGatewayAdResponse$cleanup$1.label = 1;
                    invoke = getOperativeEventApi.invoke(operativeEventType, byteString, trackingToken, byteString2, (r18 & 16) != 0 ? null : null, (r18 & 32) != 0 ? null : null, androidHandleGatewayAdResponse$cleanup$1);
                    if (invoke == coroutine_suspended) {
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
                    AdPlayer adPlayer3 = (AdPlayer) androidHandleGatewayAdResponse$cleanup$1.L$0;
                    ResultKt.throwOnFailure(obj);
                    adPlayer2 = adPlayer3;
                }
                if (adPlayer2 != null) {
                    return Unit.INSTANCE;
                }
                androidHandleGatewayAdResponse$cleanup$1.L$0 = null;
                androidHandleGatewayAdResponse$cleanup$1.label = 2;
                if (adPlayer2.destroy(androidHandleGatewayAdResponse$cleanup$1) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                return Unit.INSTANCE;
            }
        }
        androidHandleGatewayAdResponse$cleanup$1 = new AndroidHandleGatewayAdResponse$cleanup$1(this, continuation);
        Object obj2 = androidHandleGatewayAdResponse$cleanup$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = androidHandleGatewayAdResponse$cleanup$1.label;
        if (i != 0) {
        }
        if (adPlayer2 != null) {
        }
    }
}
