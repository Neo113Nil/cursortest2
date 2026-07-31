package com.unity3d.ads.adplayer;

import androidx.annotation.CallSuper;
import com.ironsource.C4643f8;
import com.unity3d.services.ads.offerwall.OfferwallEvent;
import java.util.Map;
import kotlin.Metadata;
import kotlin.NotImplementedError;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.SharedFlowKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: AdPlayer.kt */
@Metadata(d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0010\u0012\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u0000 :2\u00020\u0001:\u0001:J&\u0010\u0015\u001a\u00020\u00162\u0016\u0010\u0017\u001a\u0012\u0012\u0004\u0012\u00020\u0019\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\u0018H¦@¢\u0006\u0002\u0010\u001aJ\b\u0010\u001b\u001a\u00020\u0016H&J\u0010\u0010\u001c\u001a\u00020\u00162\u0006\u0010\u001d\u001a\u00020\u001eH\u0016J\u000e\u0010\u001f\u001a\u00020\u0016H\u0097@¢\u0006\u0002\u0010 J\u0016\u0010!\u001a\u00020\u00162\u0006\u0010\"\u001a\u00020#H¦@¢\u0006\u0002\u0010$J\u0016\u0010%\u001a\u00020\u00162\u0006\u0010&\u001a\u00020#H¦@¢\u0006\u0002\u0010$J\u0016\u0010'\u001a\u00020\u00162\u0006\u0010(\u001a\u00020#H¦@¢\u0006\u0002\u0010$J\u000e\u0010)\u001a\u00020\u0016H¦@¢\u0006\u0002\u0010 J\u0016\u0010*\u001a\u00020\u00162\u0006\u0010+\u001a\u00020,H¦@¢\u0006\u0002\u0010-J\u0016\u0010.\u001a\u00020\u00162\u0006\u0010/\u001a\u000200H¦@¢\u0006\u0002\u00101J\u0016\u00102\u001a\u00020\u00162\u0006\u0010/\u001a\u000200H¦@¢\u0006\u0002\u00101J\u0016\u00103\u001a\u00020\u00162\u0006\u0010/\u001a\u000200H¦@¢\u0006\u0002\u00101J\u0016\u00104\u001a\u00020\u00162\u0006\u00105\u001a\u00020\u0019H¦@¢\u0006\u0002\u00106J\u0016\u00107\u001a\u00020\u00162\u0006\u00105\u001a\u000208H¦@¢\u0006\u0002\u00109R\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0012\u0010\u0006\u001a\u00020\u0007X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0018\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000bX¦\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000eR\u0018\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\u000bX¦\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u000eR\u0018\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\u000bX¦\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u000e¨\u0006;"}, d2 = {"Lcom/unity3d/ads/adplayer/AdPlayer;", "", "scope", "Lkotlinx/coroutines/CoroutineScope;", "getScope", "()Lkotlinx/coroutines/CoroutineScope;", "webViewContainer", "Lcom/unity3d/ads/adplayer/WebViewContainer;", "getWebViewContainer", "()Lcom/unity3d/ads/adplayer/WebViewContainer;", "onShowEvent", "Lkotlinx/coroutines/flow/Flow;", "Lcom/unity3d/ads/core/data/model/ShowEvent;", "getOnShowEvent", "()Lkotlinx/coroutines/flow/Flow;", "onOfferwallEvent", "Lcom/unity3d/ads/core/data/model/OfferwallShowEvent;", "getOnOfferwallEvent", "onLoadEvent", "Lcom/unity3d/ads/adplayer/model/LoadEvent;", "getOnLoadEvent", "requestShow", "", "unityAdsShowOptions", "", "", "(Ljava/util/Map;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "dispatchShowCompleted", "show", "showOptions", "Lcom/unity3d/ads/adplayer/ShowOptions;", "destroy", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "sendMuteChange", "isMuted", "", "(ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "sendVisibilityChange", C4643f8.k, "sendFocusChange", "isFocused", "sendActivityDestroyed", "sendVolumeChange", "volume", "", "(DLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "sendUserConsentChange", "value", "", "([BLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "sendPrivacyFsmChange", "onAllowedPiiChange", "onBroadcastEvent", "event", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "sendOfferwallEvent", "Lcom/unity3d/services/ads/offerwall/OfferwallEvent;", "(Lcom/unity3d/services/ads/offerwall/OfferwallEvent;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Companion", "unity-ads_defaultRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public interface AdPlayer {

    @NotNull
    public static final String AD_REFRESH_EVENT = "AD_REFRESH";

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.$$INSTANCE;
    public static final int OFFERWALL_EVENT_QUEUE_SIZE = 5;

    @CallSuper
    @Nullable
    Object destroy(@NotNull Continuation continuation);

    void dispatchShowCompleted();

    @NotNull
    Flow getOnLoadEvent();

    @NotNull
    Flow getOnOfferwallEvent();

    @NotNull
    Flow getOnShowEvent();

    @NotNull
    CoroutineScope getScope();

    @NotNull
    WebViewContainer getWebViewContainer();

    @Nullable
    Object onAllowedPiiChange(@NotNull byte[] bArr, @NotNull Continuation continuation);

    @Nullable
    Object onBroadcastEvent(@NotNull String str, @NotNull Continuation continuation);

    @Nullable
    Object requestShow(@Nullable Map<String, ? extends Object> map, @NotNull Continuation continuation);

    @Nullable
    Object sendActivityDestroyed(@NotNull Continuation continuation);

    @Nullable
    Object sendFocusChange(boolean z, @NotNull Continuation continuation);

    @Nullable
    Object sendMuteChange(boolean z, @NotNull Continuation continuation);

    @Nullable
    Object sendOfferwallEvent(@NotNull OfferwallEvent offerwallEvent, @NotNull Continuation continuation);

    @Nullable
    Object sendPrivacyFsmChange(@NotNull byte[] bArr, @NotNull Continuation continuation);

    @Nullable
    Object sendUserConsentChange(@NotNull byte[] bArr, @NotNull Continuation continuation);

    @Nullable
    Object sendVisibilityChange(boolean z, @NotNull Continuation continuation);

    @Nullable
    Object sendVolumeChange(double d, @NotNull Continuation continuation);

    void show(@NotNull ShowOptions showOptions);

    /* compiled from: AdPlayer.kt */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class DefaultImpls {
        public static void show(@NotNull AdPlayer adPlayer, @NotNull ShowOptions showOptions) {
            Intrinsics.checkNotNullParameter(showOptions, "showOptions");
            throw new NotImplementedError(null, 1, null);
        }

        @CallSuper
        @Nullable
        public static Object destroy(@NotNull AdPlayer adPlayer, @NotNull Continuation continuation) {
            CoroutineScopeKt.cancel$default(adPlayer.getScope(), null, 1, null);
            return Unit.INSTANCE;
        }
    }

    /* compiled from: AdPlayer.kt */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u000e\u0010\t\u001a\u00020\nX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0006X\u0086T¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lcom/unity3d/ads/adplayer/AdPlayer$Companion;", "", "<init>", "()V", "broadcastEventChannel", "Lkotlinx/coroutines/flow/MutableSharedFlow;", "", "getBroadcastEventChannel", "()Lkotlinx/coroutines/flow/MutableSharedFlow;", "OFFERWALL_EVENT_QUEUE_SIZE", "", "AD_REFRESH_EVENT", "unity-ads_defaultRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {

        @NotNull
        public static final String AD_REFRESH_EVENT = "AD_REFRESH";
        public static final int OFFERWALL_EVENT_QUEUE_SIZE = 5;
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        @NotNull
        private static final MutableSharedFlow broadcastEventChannel = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);

        private Companion() {
        }

        @NotNull
        public final MutableSharedFlow getBroadcastEventChannel() {
            return broadcastEventChannel;
        }
    }
}
