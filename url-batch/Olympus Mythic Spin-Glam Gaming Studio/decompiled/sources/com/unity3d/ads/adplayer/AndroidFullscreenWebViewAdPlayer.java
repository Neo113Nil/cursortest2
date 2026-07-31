package com.unity3d.ads.adplayer;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import com.google.protobuf.ByteString;
import com.google.protobuf.kotlin.ByteStringsKt;
import com.ironsource.C4643f8;
import com.ironsource.X3;
import com.unity3d.ads.adplayer.AdPlayer;
import com.unity3d.ads.adplayer.DisplayMessage;
import com.unity3d.ads.core.data.datasource.VolumeSettingsChange;
import com.unity3d.ads.core.data.manager.OfferwallManager;
import com.unity3d.ads.core.data.model.AdObject;
import com.unity3d.ads.core.data.model.SessionChange;
import com.unity3d.ads.core.data.model.ShowEvent;
import com.unity3d.ads.core.data.repository.AdRepository;
import com.unity3d.ads.core.data.repository.DeviceInfoRepository;
import com.unity3d.ads.core.data.repository.OpenMeasurementRepository;
import com.unity3d.ads.core.data.repository.OrientationRepository;
import com.unity3d.ads.core.data.repository.SessionRepository;
import com.unity3d.ads.core.domain.SendDiagnosticEvent;
import com.unity3d.ads.core.extensions.ProtobufExtensionsKt;
import com.unity3d.services.ads.offerwall.OfferwallEvent;
import com.unity3d.services.core.properties.ClientProperties;
import java.lang.ref.WeakReference;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CompletableDeferred;
import kotlinx.coroutines.CompletableDeferredKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.NonCancellable;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.SharedFlow;
import kotlinx.coroutines.flow.SharedFlowKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* compiled from: AndroidFullscreenWebViewAdPlayer.kt */
@Metadata(d1 = {"\u0000î\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0012\n\u0002\b\u0006\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000 j2\u00020\u00012\u00020\u0002:\u0001jB_\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\u0006\u0010\u000f\u001a\u00020\u0010\u0012\u0006\u0010\u0011\u001a\u00020\u0012\u0012\u0006\u0010\u0013\u001a\u00020\u0014\u0012\u0006\u0010\u0015\u001a\u00020\u0016\u0012\u0006\u0010\u0017\u001a\u00020\u0018¢\u0006\u0004\b\u0019\u0010\u001aJ \u0010%\u001a\u00020&2\u0006\u0010'\u001a\u00020\u00182\u0006\u0010(\u001a\u00020)2\u0006\u0010*\u001a\u00020+H\u0002J\u0010\u0010,\u001a\u00020-2\u0006\u0010(\u001a\u00020.H\u0016J\u0016\u0010/\u001a\u00020-2\u0006\u00100\u001a\u000201H\u0082@¢\u0006\u0002\u00102J\u0016\u00103\u001a\u00020-2\u0006\u00100\u001a\u000204H\u0082@¢\u0006\u0002\u00105J\u000e\u00106\u001a\u00020-H\u0096@¢\u0006\u0002\u00107J\u0010\u00108\u001a\u0002092\u0006\u0010:\u001a\u00020;H\u0002J\t\u0010<\u001a\u00020-H\u0096\u0001J\u0016\u0010=\u001a\u00020-2\u0006\u0010>\u001a\u00020?H\u0096A¢\u0006\u0002\u0010@J\u0016\u0010A\u001a\u00020-2\u0006\u0010B\u001a\u00020\u0006H\u0096A¢\u0006\u0002\u0010CJ&\u0010D\u001a\u00020-2\u0016\u0010E\u001a\u0012\u0012\u0004\u0012\u00020\u0006\u0012\u0006\u0012\u0004\u0018\u00010G\u0018\u00010FH\u0096A¢\u0006\u0002\u0010HJ\u000e\u0010I\u001a\u00020-H\u0096A¢\u0006\u0002\u00107J\u0016\u0010J\u001a\u00020-2\u0006\u0010K\u001a\u00020LH\u0096A¢\u0006\u0002\u0010MJ\u0016\u0010N\u001a\u00020-2\u0006\u0010O\u001a\u00020LH\u0096A¢\u0006\u0002\u0010MJ\u0016\u0010P\u001a\u00020-2\u0006\u0010B\u001a\u00020QH\u0096A¢\u0006\u0002\u0010RJ\u0016\u0010S\u001a\u00020-2\u0006\u0010>\u001a\u00020?H\u0096A¢\u0006\u0002\u0010@J\u0016\u0010T\u001a\u00020-2\u0006\u0010>\u001a\u00020?H\u0096A¢\u0006\u0002\u0010@J\u0016\u0010U\u001a\u00020-2\u0006\u0010V\u001a\u00020LH\u0096A¢\u0006\u0002\u0010MJ\u0016\u0010W\u001a\u00020-2\u0006\u0010X\u001a\u00020YH\u0096A¢\u0006\u0002\u0010ZR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0014X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0016X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0018X\u0082\u0004¢\u0006\u0002\n\u0000R\u001d\u0010\u001d\u001a\u0004\u0018\u00010\u001e8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b\u001f\u0010 R\u000e\u0010#\u001a\u00020$X\u0082\u0004¢\u0006\u0002\n\u0000R\u0018\u0010[\u001a\b\u0012\u0004\u0012\u00020]0\\X\u0096\u0005¢\u0006\u0006\u001a\u0004\b^\u0010_R\u0018\u0010`\u001a\b\u0012\u0004\u0012\u00020a0\\X\u0096\u0005¢\u0006\u0006\u001a\u0004\bb\u0010_R\u0018\u0010c\u001a\b\u0012\u0004\u0012\u00020d0\\X\u0096\u0005¢\u0006\u0006\u001a\u0004\be\u0010_R\u0012\u0010f\u001a\u00020gX\u0096\u0005¢\u0006\u0006\u001a\u0004\bh\u0010i¨\u0006k"}, d2 = {"Lcom/unity3d/ads/adplayer/AndroidFullscreenWebViewAdPlayer;", "Lcom/unity3d/ads/adplayer/AdPlayer;", "Lcom/unity3d/ads/adplayer/FullscreenAdPlayer;", "webViewAdPlayer", "Lcom/unity3d/ads/adplayer/WebViewAdPlayer;", "opportunityId", "", "webViewContainer", "Lcom/unity3d/ads/adplayer/AndroidWebViewContainer;", "deviceInfoRepository", "Lcom/unity3d/ads/core/data/repository/DeviceInfoRepository;", "sessionRepository", "Lcom/unity3d/ads/core/data/repository/SessionRepository;", "openMeasurementRepository", "Lcom/unity3d/ads/core/data/repository/OpenMeasurementRepository;", "offerwallManager", "Lcom/unity3d/ads/core/data/manager/OfferwallManager;", "sendDiagnosticEvent", "Lcom/unity3d/ads/core/domain/SendDiagnosticEvent;", "adRepository", "Lcom/unity3d/ads/core/data/repository/AdRepository;", "orientationRepository", "Lcom/unity3d/ads/core/data/repository/OrientationRepository;", "context", "Landroid/content/Context;", "<init>", "(Lcom/unity3d/ads/adplayer/WebViewAdPlayer;Ljava/lang/String;Lcom/unity3d/ads/adplayer/AndroidWebViewContainer;Lcom/unity3d/ads/core/data/repository/DeviceInfoRepository;Lcom/unity3d/ads/core/data/repository/SessionRepository;Lcom/unity3d/ads/core/data/repository/OpenMeasurementRepository;Lcom/unity3d/ads/core/data/manager/OfferwallManager;Lcom/unity3d/ads/core/domain/SendDiagnosticEvent;Lcom/unity3d/ads/core/data/repository/AdRepository;Lcom/unity3d/ads/core/data/repository/OrientationRepository;Landroid/content/Context;)V", "getWebViewContainer", "()Lcom/unity3d/ads/adplayer/AndroidWebViewContainer;", "adObject", "Lcom/unity3d/ads/core/data/model/AdObject;", "getAdObject", "()Lcom/unity3d/ads/core/data/model/AdObject;", "adObject$delegate", "Lkotlin/Lazy;", "wasDestroyed", "Ljava/util/concurrent/atomic/AtomicBoolean;", "getIntent", "Landroid/content/Intent;", "providedContext", "showOptions", "Lcom/unity3d/ads/adplayer/AndroidShowOptions;", "intentFlags", "", "show", "", "Lcom/unity3d/ads/adplayer/ShowOptions;", "handleVolumeSettingsChange", "change", "Lcom/unity3d/ads/core/data/datasource/VolumeSettingsChange;", "(Lcom/unity3d/ads/core/data/datasource/VolumeSettingsChange;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "handleSessionChange", "Lcom/unity3d/ads/core/data/model/SessionChange;", "(Lcom/unity3d/ads/core/data/model/SessionChange;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "destroy", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "displayEventsRouter", "Lkotlinx/coroutines/Job;", "displayMessage", "Lcom/unity3d/ads/adplayer/DisplayMessage;", "dispatchShowCompleted", "onAllowedPiiChange", "value", "", "([BLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "onBroadcastEvent", "event", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "requestShow", "unityAdsShowOptions", "", "", "(Ljava/util/Map;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "sendActivityDestroyed", "sendFocusChange", "isFocused", "", "(ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "sendMuteChange", "isMuted", "sendOfferwallEvent", "Lcom/unity3d/services/ads/offerwall/OfferwallEvent;", "(Lcom/unity3d/services/ads/offerwall/OfferwallEvent;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "sendPrivacyFsmChange", "sendUserConsentChange", "sendVisibilityChange", C4643f8.k, "sendVolumeChange", "volume", "", "(DLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "onLoadEvent", "Lkotlinx/coroutines/flow/Flow;", "Lcom/unity3d/ads/adplayer/model/LoadEvent;", "getOnLoadEvent", "()Lkotlinx/coroutines/flow/Flow;", "onOfferwallEvent", "Lcom/unity3d/ads/core/data/model/OfferwallShowEvent;", "getOnOfferwallEvent", "onShowEvent", "Lcom/unity3d/ads/core/data/model/ShowEvent;", "getOnShowEvent", "scope", "Lkotlinx/coroutines/CoroutineScope;", "getScope", "()Lkotlinx/coroutines/CoroutineScope;", "Companion", "unity-ads_defaultRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class AndroidFullscreenWebViewAdPlayer implements AdPlayer, FullscreenAdPlayer {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final MutableSharedFlow displayMessages = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);

    /* renamed from: adObject$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy adObject;

    @NotNull
    private final AdRepository adRepository;

    @NotNull
    private final Context context;

    @NotNull
    private final DeviceInfoRepository deviceInfoRepository;

    @NotNull
    private final OfferwallManager offerwallManager;

    @NotNull
    private final OpenMeasurementRepository openMeasurementRepository;

    @NotNull
    private final String opportunityId;

    @NotNull
    private final OrientationRepository orientationRepository;

    @NotNull
    private final SendDiagnosticEvent sendDiagnosticEvent;

    @NotNull
    private final SessionRepository sessionRepository;

    @NotNull
    private final AtomicBoolean wasDestroyed;

    @NotNull
    private final WebViewAdPlayer webViewAdPlayer;

    @NotNull
    private final AndroidWebViewContainer webViewContainer;

    @Override // com.unity3d.ads.adplayer.AdPlayer
    public void dispatchShowCompleted() {
        this.webViewAdPlayer.dispatchShowCompleted();
    }

    @Override // com.unity3d.ads.adplayer.AdPlayer
    @NotNull
    public Flow getOnLoadEvent() {
        return this.webViewAdPlayer.getOnLoadEvent();
    }

    @Override // com.unity3d.ads.adplayer.AdPlayer
    @NotNull
    public Flow getOnOfferwallEvent() {
        return this.webViewAdPlayer.getOnOfferwallEvent();
    }

    @Override // com.unity3d.ads.adplayer.AdPlayer
    @NotNull
    public Flow getOnShowEvent() {
        return this.webViewAdPlayer.getOnShowEvent();
    }

    @Override // com.unity3d.ads.adplayer.AdPlayer
    @NotNull
    public CoroutineScope getScope() {
        return this.webViewAdPlayer.getScope();
    }

    @Override // com.unity3d.ads.adplayer.AdPlayer
    @Nullable
    public Object onAllowedPiiChange(@NotNull byte[] bArr, @NotNull Continuation continuation) {
        return this.webViewAdPlayer.onAllowedPiiChange(bArr, continuation);
    }

    @Override // com.unity3d.ads.adplayer.AdPlayer
    @Nullable
    public Object onBroadcastEvent(@NotNull String str, @NotNull Continuation continuation) {
        return this.webViewAdPlayer.onBroadcastEvent(str, continuation);
    }

    @Override // com.unity3d.ads.adplayer.AdPlayer
    @Nullable
    public Object requestShow(@Nullable Map<String, ? extends Object> map, @NotNull Continuation continuation) {
        return this.webViewAdPlayer.requestShow(map, continuation);
    }

    @Override // com.unity3d.ads.adplayer.AdPlayer
    @Nullable
    public Object sendActivityDestroyed(@NotNull Continuation continuation) {
        return this.webViewAdPlayer.sendActivityDestroyed(continuation);
    }

    @Override // com.unity3d.ads.adplayer.AdPlayer
    @Nullable
    public Object sendFocusChange(boolean z, @NotNull Continuation continuation) {
        return this.webViewAdPlayer.sendFocusChange(z, continuation);
    }

    @Override // com.unity3d.ads.adplayer.AdPlayer
    @Nullable
    public Object sendMuteChange(boolean z, @NotNull Continuation continuation) {
        return this.webViewAdPlayer.sendMuteChange(z, continuation);
    }

    @Override // com.unity3d.ads.adplayer.AdPlayer
    @Nullable
    public Object sendOfferwallEvent(@NotNull OfferwallEvent offerwallEvent, @NotNull Continuation continuation) {
        return this.webViewAdPlayer.sendOfferwallEvent(offerwallEvent, continuation);
    }

    @Override // com.unity3d.ads.adplayer.AdPlayer
    @Nullable
    public Object sendPrivacyFsmChange(@NotNull byte[] bArr, @NotNull Continuation continuation) {
        return this.webViewAdPlayer.sendPrivacyFsmChange(bArr, continuation);
    }

    @Override // com.unity3d.ads.adplayer.AdPlayer
    @Nullable
    public Object sendUserConsentChange(@NotNull byte[] bArr, @NotNull Continuation continuation) {
        return this.webViewAdPlayer.sendUserConsentChange(bArr, continuation);
    }

    @Override // com.unity3d.ads.adplayer.AdPlayer
    @Nullable
    public Object sendVisibilityChange(boolean z, @NotNull Continuation continuation) {
        return this.webViewAdPlayer.sendVisibilityChange(z, continuation);
    }

    @Override // com.unity3d.ads.adplayer.AdPlayer
    @Nullable
    public Object sendVolumeChange(double d, @NotNull Continuation continuation) {
        return this.webViewAdPlayer.sendVolumeChange(d, continuation);
    }

    public AndroidFullscreenWebViewAdPlayer(@NotNull WebViewAdPlayer webViewAdPlayer, @NotNull String opportunityId, @NotNull AndroidWebViewContainer webViewContainer, @NotNull DeviceInfoRepository deviceInfoRepository, @NotNull SessionRepository sessionRepository, @NotNull OpenMeasurementRepository openMeasurementRepository, @NotNull OfferwallManager offerwallManager, @NotNull SendDiagnosticEvent sendDiagnosticEvent, @NotNull AdRepository adRepository, @NotNull OrientationRepository orientationRepository, @NotNull Context context) {
        Intrinsics.checkNotNullParameter(webViewAdPlayer, "webViewAdPlayer");
        Intrinsics.checkNotNullParameter(opportunityId, "opportunityId");
        Intrinsics.checkNotNullParameter(webViewContainer, "webViewContainer");
        Intrinsics.checkNotNullParameter(deviceInfoRepository, "deviceInfoRepository");
        Intrinsics.checkNotNullParameter(sessionRepository, "sessionRepository");
        Intrinsics.checkNotNullParameter(openMeasurementRepository, "openMeasurementRepository");
        Intrinsics.checkNotNullParameter(offerwallManager, "offerwallManager");
        Intrinsics.checkNotNullParameter(sendDiagnosticEvent, "sendDiagnosticEvent");
        Intrinsics.checkNotNullParameter(adRepository, "adRepository");
        Intrinsics.checkNotNullParameter(orientationRepository, "orientationRepository");
        Intrinsics.checkNotNullParameter(context, "context");
        this.webViewAdPlayer = webViewAdPlayer;
        this.opportunityId = opportunityId;
        this.webViewContainer = webViewContainer;
        this.deviceInfoRepository = deviceInfoRepository;
        this.sessionRepository = sessionRepository;
        this.openMeasurementRepository = openMeasurementRepository;
        this.offerwallManager = offerwallManager;
        this.sendDiagnosticEvent = sendDiagnosticEvent;
        this.adRepository = adRepository;
        this.orientationRepository = orientationRepository;
        this.context = context;
        this.adObject = LazyKt.lazy(new Function0() { // from class: com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function0
            /* renamed from: invoke */
            public final Object mo4828invoke() {
                AdObject adObject_delegate$lambda$1;
                adObject_delegate$lambda$1 = AndroidFullscreenWebViewAdPlayer.adObject_delegate$lambda$1(AndroidFullscreenWebViewAdPlayer.this);
                return adObject_delegate$lambda$1;
            }
        });
        this.wasDestroyed = new AtomicBoolean(false);
    }

    @Override // com.unity3d.ads.adplayer.AdPlayer
    @NotNull
    public AndroidWebViewContainer getWebViewContainer() {
        return this.webViewContainer;
    }

    private final AdObject getAdObject() {
        return (AdObject) this.adObject.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AdObject adObject_delegate$lambda$1(AndroidFullscreenWebViewAdPlayer androidFullscreenWebViewAdPlayer) {
        Object m8023constructorimpl;
        try {
            Result.Companion companion = Result.INSTANCE;
            AdRepository adRepository = androidFullscreenWebViewAdPlayer.adRepository;
            UUID fromString = UUID.fromString(androidFullscreenWebViewAdPlayer.opportunityId);
            Intrinsics.checkNotNullExpressionValue(fromString, "fromString(...)");
            m8023constructorimpl = Result.m8023constructorimpl(adRepository.getAd(ProtobufExtensionsKt.toByteString(fromString)));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            m8023constructorimpl = Result.m8023constructorimpl(ResultKt.createFailure(th));
        }
        if (Result.m8028isFailureimpl(m8023constructorimpl)) {
            m8023constructorimpl = null;
        }
        return (AdObject) m8023constructorimpl;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Intent getIntent(Context providedContext, AndroidShowOptions showOptions, int intentFlags) {
        Intent intent = new Intent(providedContext, (Class<?>) FullScreenWebViewDisplay.class);
        intent.putExtra("opportunityId", this.opportunityId);
        Map<String, Object> unityAdsShowOptions = showOptions.getUnityAdsShowOptions();
        if (unityAdsShowOptions != null) {
            intent.putExtra("showOptions", new JSONObject(unityAdsShowOptions).toString());
        }
        intent.addFlags(intentFlags);
        intent.putExtra(X3.i.n, ((Number) this.orientationRepository.getResumedActivityOrientation().getValue()).intValue());
        return intent;
    }

    @Override // com.unity3d.ads.adplayer.AdPlayer
    public void show(@NotNull ShowOptions showOptions) {
        Context context;
        Intrinsics.checkNotNullParameter(showOptions, "showOptions");
        if (!(showOptions instanceof AndroidShowOptions)) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        AndroidShowOptions androidShowOptions = (AndroidShowOptions) showOptions;
        boolean isOfferwallAd = androidShowOptions.isOfferwallAd();
        CompletableDeferred CompletableDeferred$default = CompletableDeferredKt.CompletableDeferred$default(null, 1, null);
        final SharedFlow onSubscription = FlowKt.onSubscription(displayMessages, new AndroidFullscreenWebViewAdPlayer$show$1(CompletableDeferred$default, null));
        FlowKt.launchIn(FlowKt.onEach(new Flow() { // from class: com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer$show$$inlined$filter$1

            /* compiled from: Emitters.kt */
            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            /* renamed from: com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer$show$$inlined$filter$1$2, reason: invalid class name */
            public static final class AnonymousClass2<T> implements FlowCollector {
                final /* synthetic */ FlowCollector $this_unsafeFlow;
                final /* synthetic */ AndroidFullscreenWebViewAdPlayer this$0;

                @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
                @DebugMetadata(c = "com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer$show$$inlined$filter$1$2", f = "AndroidFullscreenWebViewAdPlayer.kt", l = {50}, m = "emit")
                /* renamed from: com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer$show$$inlined$filter$1$2$1, reason: invalid class name */
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

                public AnonymousClass2(FlowCollector flowCollector, AndroidFullscreenWebViewAdPlayer androidFullscreenWebViewAdPlayer) {
                    this.$this_unsafeFlow = flowCollector;
                    this.this$0 = androidFullscreenWebViewAdPlayer;
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
                    String str;
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
                                String opportunityId = ((DisplayMessage) obj).getOpportunityId();
                                str = this.this$0.opportunityId;
                                if (Intrinsics.areEqual(opportunityId, str)) {
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
                Object collect = Flow.this.collect(new AnonymousClass2(flowCollector, this), continuation);
                return collect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? collect : Unit.INSTANCE;
            }
        }, new AndroidFullscreenWebViewAdPlayer$show$3(this)), getScope());
        FlowKt.launchIn(FlowKt.onEach(this.deviceInfoRepository.getVolumeSettingsChange(), new AndroidFullscreenWebViewAdPlayer$show$4(this)), getScope());
        final SharedFlow onShowEvent = this.webViewAdPlayer.getOnShowEvent();
        FlowKt.launchIn(FlowKt.onEach(new Flow() { // from class: com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer$show$$inlined$filter$2

            /* compiled from: Emitters.kt */
            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            /* renamed from: com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer$show$$inlined$filter$2$2, reason: invalid class name */
            public static final class AnonymousClass2<T> implements FlowCollector {
                final /* synthetic */ FlowCollector $this_unsafeFlow;

                @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
                @DebugMetadata(c = "com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer$show$$inlined$filter$2$2", f = "AndroidFullscreenWebViewAdPlayer.kt", l = {50}, m = "emit")
                /* renamed from: com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer$show$$inlined$filter$2$2$1, reason: invalid class name */
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
                                ShowEvent showEvent = (ShowEvent) obj;
                                if ((showEvent instanceof ShowEvent.Completed) || (showEvent instanceof ShowEvent.Error)) {
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
        }, new AndroidFullscreenWebViewAdPlayer$show$6(this, null)), getScope());
        final SharedFlow onShowEvent2 = this.webViewAdPlayer.getOnShowEvent();
        FlowKt.launchIn(FlowKt.onEach(new Flow() { // from class: com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer$show$$inlined$filter$3
            @Override // kotlinx.coroutines.flow.Flow
            public Object collect(FlowCollector flowCollector, Continuation continuation) {
                Object collect = Flow.this.collect(new AnonymousClass2(flowCollector), continuation);
                return collect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? collect : Unit.INSTANCE;
            }

            /* compiled from: Emitters.kt */
            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            /* renamed from: com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer$show$$inlined$filter$3$2, reason: invalid class name */
            public static final class AnonymousClass2<T> implements FlowCollector {
                final /* synthetic */ FlowCollector $this_unsafeFlow;

                @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
                @DebugMetadata(c = "com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer$show$$inlined$filter$3$2", f = "AndroidFullscreenWebViewAdPlayer.kt", l = {50}, m = "emit")
                /* renamed from: com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer$show$$inlined$filter$3$2$1, reason: invalid class name */
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
                                if (((ShowEvent) obj) instanceof ShowEvent.Started) {
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
        }, new AndroidFullscreenWebViewAdPlayer$show$8(this, null)), getScope());
        FlowKt.launchIn(FlowKt.onEach(this.sessionRepository.getOnChange(), new AndroidFullscreenWebViewAdPlayer$show$9(this)), getScope());
        JobKt.getJob(getScope().getCoroutineContext()).invokeOnCompletion(new Function1() { // from class: com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit show$lambda$7;
                show$lambda$7 = AndroidFullscreenWebViewAdPlayer.show$lambda$7(AndroidFullscreenWebViewAdPlayer.this, (Throwable) obj);
                return show$lambda$7;
            }
        });
        AdObject adObject = getAdObject();
        WeakReference<Activity> activity = adObject != null ? adObject.getActivity() : null;
        Activity activity2 = activity != null ? activity.get() : null;
        boolean z = activity2 != null;
        if (z) {
            ClientProperties.setActivity(activity2);
        }
        if (activity != null && !z) {
            SendDiagnosticEvent.DefaultImpls.invoke$default(this.sendDiagnosticEvent, "native_show_activity_not_available", (Double) null, (Map) null, (Map) null, getAdObject(), (Integer) null, (ByteString) null, 110, (Object) null);
        }
        if (isOfferwallAd) {
            BuildersKt__Builders_commonKt.launch$default(getScope(), null, null, new AndroidFullscreenWebViewAdPlayer$show$12(CompletableDeferred$default, this, showOptions, null), 3, null);
            return;
        }
        SendDiagnosticEvent.DefaultImpls.invoke$default(this.sendDiagnosticEvent, "native_show_ad_viewer_fullscreen", (Double) null, (Map) null, (Map) null, getAdObject(), (Integer) null, (ByteString) null, 110, (Object) null);
        Integer valueOf = Integer.valueOf(this.sessionRepository.getNativeConfiguration().getOverwriteIntentFlagActivity());
        Integer num = valueOf.intValue() != 0 ? valueOf : null;
        int intValue = num != null ? num.intValue() : 268500992;
        if (z) {
            Intrinsics.checkNotNull(activity2);
            context = activity2;
        } else {
            context = this.context;
        }
        BuildersKt__Builders_commonKt.launch$default(getScope(), null, null, new AndroidFullscreenWebViewAdPlayer$show$11(CompletableDeferred$default, context, getIntent(context, androidShowOptions, intValue), intValue, 268500992, this, showOptions, null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ Object show$displayEventsRouter(AndroidFullscreenWebViewAdPlayer androidFullscreenWebViewAdPlayer, DisplayMessage displayMessage, Continuation continuation) {
        androidFullscreenWebViewAdPlayer.displayEventsRouter(displayMessage);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit show$lambda$7(AndroidFullscreenWebViewAdPlayer androidFullscreenWebViewAdPlayer, Throwable th) {
        if (th != null) {
            BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.CoroutineScope(androidFullscreenWebViewAdPlayer.getScope().getCoroutineContext().plus(NonCancellable.INSTANCE)), null, null, new AndroidFullscreenWebViewAdPlayer$show$10$1(androidFullscreenWebViewAdPlayer, null), 3, null);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object handleVolumeSettingsChange(VolumeSettingsChange volumeSettingsChange, Continuation continuation) {
        if (volumeSettingsChange instanceof VolumeSettingsChange.MuteChange) {
            Object sendMuteChange = this.webViewAdPlayer.sendMuteChange(((VolumeSettingsChange.MuteChange) volumeSettingsChange).isMuted(), continuation);
            return sendMuteChange == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? sendMuteChange : Unit.INSTANCE;
        }
        if (!(volumeSettingsChange instanceof VolumeSettingsChange.VolumeChange)) {
            throw new NoWhenBranchMatchedException();
        }
        Object sendVolumeChange = this.webViewAdPlayer.sendVolumeChange(((VolumeSettingsChange.VolumeChange) volumeSettingsChange).getVolume(), continuation);
        return sendVolumeChange == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? sendVolumeChange : Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object handleSessionChange(SessionChange sessionChange, Continuation continuation) {
        if (sessionChange instanceof SessionChange.UserConsentChange) {
            WebViewAdPlayer webViewAdPlayer = this.webViewAdPlayer;
            byte[] byteArray = ((SessionChange.UserConsentChange) sessionChange).getValue().toByteArray();
            Intrinsics.checkNotNullExpressionValue(byteArray, "toByteArray(...)");
            Object sendUserConsentChange = webViewAdPlayer.sendUserConsentChange(byteArray, continuation);
            return sendUserConsentChange == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? sendUserConsentChange : Unit.INSTANCE;
        }
        if (!(sessionChange instanceof SessionChange.PrivacyFsmChange)) {
            throw new NoWhenBranchMatchedException();
        }
        WebViewAdPlayer webViewAdPlayer2 = this.webViewAdPlayer;
        byte[] byteArray2 = ((SessionChange.PrivacyFsmChange) sessionChange).getValue().toByteArray();
        Intrinsics.checkNotNullExpressionValue(byteArray2, "toByteArray(...)");
        Object sendPrivacyFsmChange = webViewAdPlayer2.sendPrivacyFsmChange(byteArray2, continuation);
        return sendPrivacyFsmChange == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? sendPrivacyFsmChange : Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0099 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0090 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    @Override // com.unity3d.ads.adplayer.AdPlayer
    @Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object destroy(@NotNull Continuation continuation) {
        AndroidFullscreenWebViewAdPlayer$destroy$1 androidFullscreenWebViewAdPlayer$destroy$1;
        Object coroutine_suspended;
        int i;
        AndroidWebViewContainer webViewContainer;
        if (continuation instanceof AndroidFullscreenWebViewAdPlayer$destroy$1) {
            androidFullscreenWebViewAdPlayer$destroy$1 = (AndroidFullscreenWebViewAdPlayer$destroy$1) continuation;
            int i2 = androidFullscreenWebViewAdPlayer$destroy$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                androidFullscreenWebViewAdPlayer$destroy$1.label = i2 - Integer.MIN_VALUE;
                Object obj = androidFullscreenWebViewAdPlayer$destroy$1.result;
                coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = androidFullscreenWebViewAdPlayer$destroy$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    if (this.wasDestroyed.getAndSet(true)) {
                        return Unit.INSTANCE;
                    }
                    this.webViewAdPlayer.dispatchShowCompleted();
                    MutableSharedFlow mutableSharedFlow = displayMessages;
                    DisplayMessage.DisplayFinishRequest displayFinishRequest = new DisplayMessage.DisplayFinishRequest(this.opportunityId);
                    androidFullscreenWebViewAdPlayer$destroy$1.label = 1;
                    if (mutableSharedFlow.emit(displayFinishRequest, androidFullscreenWebViewAdPlayer$destroy$1) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        if (i == 2) {
                            ResultKt.throwOnFailure(obj);
                            webViewContainer = getWebViewContainer();
                            androidFullscreenWebViewAdPlayer$destroy$1.label = 3;
                            if (webViewContainer.destroy(androidFullscreenWebViewAdPlayer$destroy$1) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            androidFullscreenWebViewAdPlayer$destroy$1.label = 4;
                            if (AdPlayer.DefaultImpls.destroy(this, androidFullscreenWebViewAdPlayer$destroy$1) == coroutine_suspended) {
                            }
                            return Unit.INSTANCE;
                        }
                        if (i != 3) {
                            if (i != 4) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            ResultKt.throwOnFailure(obj);
                            return Unit.INSTANCE;
                        }
                        ResultKt.throwOnFailure(obj);
                        androidFullscreenWebViewAdPlayer$destroy$1.label = 4;
                        if (AdPlayer.DefaultImpls.destroy(this, androidFullscreenWebViewAdPlayer$destroy$1) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        return Unit.INSTANCE;
                    }
                    ResultKt.throwOnFailure(obj);
                }
                if (this.openMeasurementRepository.hasSessionFinished(ByteStringsKt.toByteStringUtf8(this.opportunityId))) {
                    androidFullscreenWebViewAdPlayer$destroy$1.label = 2;
                    if (DelayKt.delay(1000L, androidFullscreenWebViewAdPlayer$destroy$1) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
                webViewContainer = getWebViewContainer();
                androidFullscreenWebViewAdPlayer$destroy$1.label = 3;
                if (webViewContainer.destroy(androidFullscreenWebViewAdPlayer$destroy$1) == coroutine_suspended) {
                }
                androidFullscreenWebViewAdPlayer$destroy$1.label = 4;
                if (AdPlayer.DefaultImpls.destroy(this, androidFullscreenWebViewAdPlayer$destroy$1) == coroutine_suspended) {
                }
                return Unit.INSTANCE;
            }
        }
        androidFullscreenWebViewAdPlayer$destroy$1 = new AndroidFullscreenWebViewAdPlayer$destroy$1(this, continuation);
        Object obj2 = androidFullscreenWebViewAdPlayer$destroy$1.result;
        coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = androidFullscreenWebViewAdPlayer$destroy$1.label;
        if (i != 0) {
        }
        if (this.openMeasurementRepository.hasSessionFinished(ByteStringsKt.toByteStringUtf8(this.opportunityId))) {
        }
        webViewContainer = getWebViewContainer();
        androidFullscreenWebViewAdPlayer$destroy$1.label = 3;
        if (webViewContainer.destroy(androidFullscreenWebViewAdPlayer$destroy$1) == coroutine_suspended) {
        }
        androidFullscreenWebViewAdPlayer$destroy$1.label = 4;
        if (AdPlayer.DefaultImpls.destroy(this, androidFullscreenWebViewAdPlayer$destroy$1) == coroutine_suspended) {
        }
        return Unit.INSTANCE;
    }

    private final Job displayEventsRouter(DisplayMessage displayMessage) {
        Job launch$default;
        launch$default = BuildersKt__Builders_commonKt.launch$default(getScope(), null, null, new AndroidFullscreenWebViewAdPlayer$displayEventsRouter$1(displayMessage, this, null), 3, null);
        return launch$default;
    }

    /* compiled from: AndroidFullscreenWebViewAdPlayer.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/unity3d/ads/adplayer/AndroidFullscreenWebViewAdPlayer$Companion;", "", "<init>", "()V", "displayMessages", "Lkotlinx/coroutines/flow/MutableSharedFlow;", "Lcom/unity3d/ads/adplayer/DisplayMessage;", "getDisplayMessages", "()Lkotlinx/coroutines/flow/MutableSharedFlow;", "unity-ads_defaultRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @NotNull
        public final MutableSharedFlow getDisplayMessages() {
            return AndroidFullscreenWebViewAdPlayer.displayMessages;
        }
    }
}
