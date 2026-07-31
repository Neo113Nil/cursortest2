package com.unity3d.ads.adplayer;

import android.content.Context;
import android.view.View;
import android.webkit.WebView;
import androidx.core.view.ViewCompat;
import com.google.protobuf.kotlin.ByteStringsKt;
import com.ironsource.C4643f8;
import com.unity3d.ads.adplayer.AdPlayer;
import com.unity3d.ads.core.data.datasource.LifecycleDataSource;
import com.unity3d.ads.core.data.repository.OpenMeasurementRepository;
import com.unity3d.services.ads.offerwall.OfferwallEvent;
import com.unity3d.services.banners.BannerView;
import com.unity3d.services.banners.BannerViewCache;
import java.util.Map;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.flow.Flow;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: AndroidEmbeddableWebViewAdPlayer.kt */
@Metadata(d1 = {"\u0000\u0092\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0012\n\u0002\b\u0006\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B7\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\u000e¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0016H\u0016J\u000e\u0010\u0017\u001a\u00020\u0014H\u0096@¢\u0006\u0002\u0010\u0018J\t\u0010\u0019\u001a\u00020\u0014H\u0096\u0001J\u0016\u0010\u001a\u001a\u00020\u00142\u0006\u0010\u001b\u001a\u00020\u001cH\u0096A¢\u0006\u0002\u0010\u001dJ\u0016\u0010\u001e\u001a\u00020\u00142\u0006\u0010\u001f\u001a\u00020\u0006H\u0096A¢\u0006\u0002\u0010 J&\u0010!\u001a\u00020\u00142\u0016\u0010\"\u001a\u0012\u0012\u0004\u0012\u00020\u0006\u0012\u0006\u0012\u0004\u0018\u00010$\u0018\u00010#H\u0096A¢\u0006\u0002\u0010%J\u000e\u0010&\u001a\u00020\u0014H\u0096A¢\u0006\u0002\u0010\u0018J\u0016\u0010'\u001a\u00020\u00142\u0006\u0010(\u001a\u00020)H\u0096A¢\u0006\u0002\u0010*J\u0016\u0010+\u001a\u00020\u00142\u0006\u0010,\u001a\u00020)H\u0096A¢\u0006\u0002\u0010*J\u0016\u0010-\u001a\u00020\u00142\u0006\u0010\u001f\u001a\u00020.H\u0096A¢\u0006\u0002\u0010/J\u0016\u00100\u001a\u00020\u00142\u0006\u0010\u001b\u001a\u00020\u001cH\u0096A¢\u0006\u0002\u0010\u001dJ\u0016\u00101\u001a\u00020\u00142\u0006\u0010\u001b\u001a\u00020\u001cH\u0096A¢\u0006\u0002\u0010\u001dJ\u0016\u00102\u001a\u00020\u00142\u0006\u00103\u001a\u00020)H\u0096A¢\u0006\u0002\u0010*J\u0016\u00104\u001a\u00020\u00142\u0006\u00105\u001a\u000206H\u0096A¢\u0006\u0002\u00107R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u0018\u00108\u001a\b\u0012\u0004\u0012\u00020:09X\u0096\u0005¢\u0006\u0006\u001a\u0004\b;\u0010<R\u0018\u0010=\u001a\b\u0012\u0004\u0012\u00020>09X\u0096\u0005¢\u0006\u0006\u001a\u0004\b?\u0010<R\u0018\u0010@\u001a\b\u0012\u0004\u0012\u00020A09X\u0096\u0005¢\u0006\u0006\u001a\u0004\bB\u0010<R\u0012\u0010C\u001a\u00020DX\u0096\u0005¢\u0006\u0006\u001a\u0004\bE\u0010F¨\u0006G"}, d2 = {"Lcom/unity3d/ads/adplayer/AndroidEmbeddableWebViewAdPlayer;", "Lcom/unity3d/ads/adplayer/AdPlayer;", "Lcom/unity3d/ads/adplayer/EmbeddableAdPlayer;", "webViewAdPlayer", "Lcom/unity3d/ads/adplayer/WebViewAdPlayer;", "opportunityId", "", "webViewContainer", "Lcom/unity3d/ads/adplayer/AndroidWebViewContainer;", "openMeasurementRepository", "Lcom/unity3d/ads/core/data/repository/OpenMeasurementRepository;", "lifecycleDataSource", "Lcom/unity3d/ads/core/data/datasource/LifecycleDataSource;", "context", "Landroid/content/Context;", "<init>", "(Lcom/unity3d/ads/adplayer/WebViewAdPlayer;Ljava/lang/String;Lcom/unity3d/ads/adplayer/AndroidWebViewContainer;Lcom/unity3d/ads/core/data/repository/OpenMeasurementRepository;Lcom/unity3d/ads/core/data/datasource/LifecycleDataSource;Landroid/content/Context;)V", "getWebViewContainer", "()Lcom/unity3d/ads/adplayer/AndroidWebViewContainer;", "show", "", "showOptions", "Lcom/unity3d/ads/adplayer/ShowOptions;", "destroy", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "dispatchShowCompleted", "onAllowedPiiChange", "value", "", "([BLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "onBroadcastEvent", "event", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "requestShow", "unityAdsShowOptions", "", "", "(Ljava/util/Map;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "sendActivityDestroyed", "sendFocusChange", "isFocused", "", "(ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "sendMuteChange", "isMuted", "sendOfferwallEvent", "Lcom/unity3d/services/ads/offerwall/OfferwallEvent;", "(Lcom/unity3d/services/ads/offerwall/OfferwallEvent;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "sendPrivacyFsmChange", "sendUserConsentChange", "sendVisibilityChange", C4643f8.k, "sendVolumeChange", "volume", "", "(DLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "onLoadEvent", "Lkotlinx/coroutines/flow/Flow;", "Lcom/unity3d/ads/adplayer/model/LoadEvent;", "getOnLoadEvent", "()Lkotlinx/coroutines/flow/Flow;", "onOfferwallEvent", "Lcom/unity3d/ads/core/data/model/OfferwallShowEvent;", "getOnOfferwallEvent", "onShowEvent", "Lcom/unity3d/ads/core/data/model/ShowEvent;", "getOnShowEvent", "scope", "Lkotlinx/coroutines/CoroutineScope;", "getScope", "()Lkotlinx/coroutines/CoroutineScope;", "unity-ads_defaultRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class AndroidEmbeddableWebViewAdPlayer implements AdPlayer, EmbeddableAdPlayer {

    @NotNull
    private final Context context;

    @NotNull
    private final LifecycleDataSource lifecycleDataSource;

    @NotNull
    private final OpenMeasurementRepository openMeasurementRepository;

    @NotNull
    private final String opportunityId;

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

    public AndroidEmbeddableWebViewAdPlayer(@NotNull WebViewAdPlayer webViewAdPlayer, @NotNull String opportunityId, @NotNull AndroidWebViewContainer webViewContainer, @NotNull OpenMeasurementRepository openMeasurementRepository, @NotNull LifecycleDataSource lifecycleDataSource, @NotNull Context context) {
        Intrinsics.checkNotNullParameter(webViewAdPlayer, "webViewAdPlayer");
        Intrinsics.checkNotNullParameter(opportunityId, "opportunityId");
        Intrinsics.checkNotNullParameter(webViewContainer, "webViewContainer");
        Intrinsics.checkNotNullParameter(openMeasurementRepository, "openMeasurementRepository");
        Intrinsics.checkNotNullParameter(lifecycleDataSource, "lifecycleDataSource");
        Intrinsics.checkNotNullParameter(context, "context");
        this.webViewAdPlayer = webViewAdPlayer;
        this.opportunityId = opportunityId;
        this.webViewContainer = webViewContainer;
        this.openMeasurementRepository = openMeasurementRepository;
        this.lifecycleDataSource = lifecycleDataSource;
        this.context = context;
    }

    @Override // com.unity3d.ads.adplayer.AdPlayer
    @NotNull
    public AndroidWebViewContainer getWebViewContainer() {
        return this.webViewContainer;
    }

    @Override // com.unity3d.ads.adplayer.AdPlayer
    public void show(@NotNull final ShowOptions showOptions) {
        String str;
        Intrinsics.checkNotNullParameter(showOptions, "showOptions");
        if (!(showOptions instanceof AndroidShowOptions)) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        BannerViewCache bannerViewCache = BannerViewCache.getInstance();
        BannerView bannerView = bannerViewCache.getBannerView(this.opportunityId);
        if (bannerView != null) {
            BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.MainScope(), null, null, new AndroidEmbeddableWebViewAdPlayer$show$1(this, bannerView, null), 3, null);
            final WebView webView = getWebViewContainer().getWebView();
            if (ViewCompat.isAttachedToWindow(webView)) {
                BuildersKt__Builders_commonKt.launch$default(this.webViewAdPlayer.getScope(), null, null, new AndroidEmbeddableWebViewAdPlayer$show$2$1(this, showOptions, null), 3, null);
                if (!ViewCompat.isAttachedToWindow(webView)) {
                    BuildersKt__Builders_commonKt.launch$default(this.webViewAdPlayer.getScope(), null, null, new AndroidEmbeddableWebViewAdPlayer$show$2$2$1(this, null), 3, null);
                } else {
                    webView.addOnAttachStateChangeListener(new AndroidEmbeddableWebViewAdPlayer$show$lambda$2$$inlined$doOnDetach$1(webView, this));
                }
            } else {
                webView.addOnAttachStateChangeListener(new View.OnAttachStateChangeListener() { // from class: com.unity3d.ads.adplayer.AndroidEmbeddableWebViewAdPlayer$show$$inlined$doOnAttach$1
                    @Override // android.view.View.OnAttachStateChangeListener
                    public void onViewDetachedFromWindow(@NotNull View view) {
                        Intrinsics.checkNotNullParameter(view, "view");
                    }

                    @Override // android.view.View.OnAttachStateChangeListener
                    public void onViewAttachedToWindow(@NotNull View view) {
                        Intrinsics.checkNotNullParameter(view, "view");
                        webView.removeOnAttachStateChangeListener(this);
                        BuildersKt__Builders_commonKt.launch$default(this.webViewAdPlayer.getScope(), null, null, new AndroidEmbeddableWebViewAdPlayer$show$2$1(this, showOptions, null), 3, null);
                        if (!ViewCompat.isAttachedToWindow(view)) {
                            BuildersKt__Builders_commonKt.launch$default(this.webViewAdPlayer.getScope(), null, null, new AndroidEmbeddableWebViewAdPlayer$show$2$2$1(this, null), 3, null);
                        } else {
                            view.addOnAttachStateChangeListener(new AndroidEmbeddableWebViewAdPlayer$show$lambda$2$$inlined$doOnDetach$1(view, this));
                        }
                    }
                });
            }
            BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.MainScope(), null, null, new AndroidEmbeddableWebViewAdPlayer$show$3(bannerView, this, null), 3, null);
            return;
        }
        if (bannerViewCache.isBannerViewDeleted(this.opportunityId)) {
            str = "BannerView has been deleted";
        } else {
            str = "BannerView not found";
        }
        throw new IllegalStateException(str.toString());
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0075 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x006c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    @Override // com.unity3d.ads.adplayer.AdPlayer
    @Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object destroy(@NotNull Continuation continuation) {
        AndroidEmbeddableWebViewAdPlayer$destroy$1 androidEmbeddableWebViewAdPlayer$destroy$1;
        Object coroutine_suspended;
        int i;
        AndroidWebViewContainer webViewContainer;
        if (continuation instanceof AndroidEmbeddableWebViewAdPlayer$destroy$1) {
            androidEmbeddableWebViewAdPlayer$destroy$1 = (AndroidEmbeddableWebViewAdPlayer$destroy$1) continuation;
            int i2 = androidEmbeddableWebViewAdPlayer$destroy$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                androidEmbeddableWebViewAdPlayer$destroy$1.label = i2 - Integer.MIN_VALUE;
                Object obj = androidEmbeddableWebViewAdPlayer$destroy$1.result;
                coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = androidEmbeddableWebViewAdPlayer$destroy$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    this.webViewAdPlayer.dispatchShowCompleted();
                    if (this.openMeasurementRepository.hasSessionFinished(ByteStringsKt.toByteStringUtf8(this.opportunityId))) {
                        androidEmbeddableWebViewAdPlayer$destroy$1.label = 1;
                        if (DelayKt.delay(1000L, androidEmbeddableWebViewAdPlayer$destroy$1) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    }
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            if (i != 3) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            ResultKt.throwOnFailure(obj);
                            return Unit.INSTANCE;
                        }
                        ResultKt.throwOnFailure(obj);
                        androidEmbeddableWebViewAdPlayer$destroy$1.label = 3;
                        if (AdPlayer.DefaultImpls.destroy(this, androidEmbeddableWebViewAdPlayer$destroy$1) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        return Unit.INSTANCE;
                    }
                    ResultKt.throwOnFailure(obj);
                }
                webViewContainer = getWebViewContainer();
                androidEmbeddableWebViewAdPlayer$destroy$1.label = 2;
                if (webViewContainer.destroy(androidEmbeddableWebViewAdPlayer$destroy$1) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                androidEmbeddableWebViewAdPlayer$destroy$1.label = 3;
                if (AdPlayer.DefaultImpls.destroy(this, androidEmbeddableWebViewAdPlayer$destroy$1) == coroutine_suspended) {
                }
                return Unit.INSTANCE;
            }
        }
        androidEmbeddableWebViewAdPlayer$destroy$1 = new AndroidEmbeddableWebViewAdPlayer$destroy$1(this, continuation);
        Object obj2 = androidEmbeddableWebViewAdPlayer$destroy$1.result;
        coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = androidEmbeddableWebViewAdPlayer$destroy$1.label;
        if (i != 0) {
        }
        webViewContainer = getWebViewContainer();
        androidEmbeddableWebViewAdPlayer$destroy$1.label = 2;
        if (webViewContainer.destroy(androidEmbeddableWebViewAdPlayer$destroy$1) == coroutine_suspended) {
        }
        androidEmbeddableWebViewAdPlayer$destroy$1.label = 3;
        if (AdPlayer.DefaultImpls.destroy(this, androidEmbeddableWebViewAdPlayer$destroy$1) == coroutine_suspended) {
        }
        return Unit.INSTANCE;
    }
}
