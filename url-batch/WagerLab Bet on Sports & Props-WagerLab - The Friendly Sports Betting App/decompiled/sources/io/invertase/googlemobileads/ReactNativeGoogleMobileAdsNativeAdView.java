package io.invertase.googlemobileads;

import android.view.View;
import android.widget.FrameLayout;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.UIManager;
import com.facebook.react.uimanager.UIManagerHelper;
import com.facebook.react.views.view.ReactViewGroup;
import com.google.android.gms.ads.nativead.MediaView;
import com.google.android.gms.ads.nativead.NativeAd;
import com.google.android.gms.ads.nativead.NativeAdView;
import com.revenuecat.purchases.common.responses.ProductResponseJsonKeys;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;

/* compiled from: ReactNativeGoogleMobileAdsNativeAdView.kt */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013J\u0016\u0010\u0014\u001a\u00020\u00112\u0006\u0010\u0015\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0017J\b\u0010\u0018\u001a\u00020\u0011H\u0002J\b\u0010\u0019\u001a\u00020\u0011H\u0016J\u0006\u0010\u001a\u001a\u00020\u0011R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\f\u001a\u0004\u0018\u00010\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u001cX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001d"}, d2 = {"Lio/invertase/googlemobileads/ReactNativeGoogleMobileAdsNativeAdView;", "Landroid/widget/FrameLayout;", "context", "Lcom/facebook/react/bridge/ReactContext;", "<init>", "(Lcom/facebook/react/bridge/ReactContext;)V", "viewGroup", "Lcom/facebook/react/views/view/ReactViewGroup;", "getViewGroup", "()Lcom/facebook/react/views/view/ReactViewGroup;", "nativeAdView", "Lcom/google/android/gms/ads/nativead/NativeAdView;", "nativeAd", "Lcom/google/android/gms/ads/nativead/NativeAd;", "reloadJob", "Lkotlinx/coroutines/Job;", "setResponseId", "", "responseId", "", "registerAsset", "assetType", "reactTag", "", "reloadAd", "requestLayout", "destroy", "measureAndLayout", "Ljava/lang/Runnable;", "react-native-google-mobile-ads_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class ReactNativeGoogleMobileAdsNativeAdView extends FrameLayout {
    private final ReactContext context;
    private final Runnable measureAndLayout;
    private NativeAd nativeAd;
    private final NativeAdView nativeAdView;
    private Job reloadJob;
    private final ReactViewGroup viewGroup;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReactNativeGoogleMobileAdsNativeAdView(ReactContext context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        this.context = context;
        ReactViewGroup reactViewGroup = new ReactViewGroup(context);
        this.viewGroup = reactViewGroup;
        NativeAdView nativeAdView = new NativeAdView(context);
        this.nativeAdView = nativeAdView;
        nativeAdView.addView(reactViewGroup);
        addView(nativeAdView);
        this.measureAndLayout = new Runnable() { // from class: io.invertase.googlemobileads.ReactNativeGoogleMobileAdsNativeAdView$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                ReactNativeGoogleMobileAdsNativeAdView.measureAndLayout$lambda$1(ReactNativeGoogleMobileAdsNativeAdView.this);
            }
        };
    }

    public final ReactViewGroup getViewGroup() {
        return this.viewGroup;
    }

    public final void setResponseId(String responseId) {
        ReactNativeGoogleMobileAdsNativeModule reactNativeGoogleMobileAdsNativeModule = (ReactNativeGoogleMobileAdsNativeModule) this.context.getNativeModule(ReactNativeGoogleMobileAdsNativeModule.class);
        if (reactNativeGoogleMobileAdsNativeModule != null) {
            if (responseId == null) {
                responseId = "";
            }
            NativeAd nativeAd = reactNativeGoogleMobileAdsNativeModule.getNativeAd(responseId);
            if (nativeAd == null || Intrinsics.areEqual(this.nativeAd, nativeAd)) {
                return;
            }
            this.nativeAd = nativeAd;
            reloadAd();
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
     */
    public final void registerAsset(String assetType, int reactTag) {
        View resolveView;
        Intrinsics.checkNotNullParameter(assetType, "assetType");
        UIManager uIManagerForReactTag = UIManagerHelper.getUIManagerForReactTag(this.context, reactTag);
        if (uIManagerForReactTag == null || (resolveView = uIManagerForReactTag.resolveView(reactTag)) == null) {
            return;
        }
        switch (assetType.hashCode()) {
            case -1115058732:
                if (assetType.equals("headline")) {
                    this.nativeAdView.setHeadlineView(resolveView);
                    break;
                }
                break;
            case 3029410:
                if (assetType.equals("body")) {
                    this.nativeAdView.setBodyView(resolveView);
                    break;
                }
                break;
            case 3226745:
                if (assetType.equals("icon")) {
                    this.nativeAdView.setIconView(resolveView);
                    break;
                }
                break;
            case 72080683:
                if (assetType.equals("advertiser")) {
                    this.nativeAdView.setAdvertiserView(resolveView);
                    break;
                }
                break;
            case 100313435:
                if (assetType.equals("image")) {
                    this.nativeAdView.setImageView(resolveView);
                    break;
                }
                break;
            case 103772132:
                if (assetType.equals("media")) {
                    this.nativeAdView.setMediaView((MediaView) resolveView);
                    break;
                }
                break;
            case 106934601:
                if (assetType.equals("price")) {
                    this.nativeAdView.setPriceView(resolveView);
                    break;
                }
                break;
            case 109770977:
                if (assetType.equals(ProductResponseJsonKeys.STORE)) {
                    this.nativeAdView.setStoreView(resolveView);
                    break;
                }
                break;
            case 1750277775:
                if (assetType.equals("starRating")) {
                    this.nativeAdView.setStarRatingView(resolveView);
                    break;
                }
                break;
            case 2055213327:
                if (assetType.equals("callToAction")) {
                    this.nativeAdView.setCallToActionView(resolveView);
                    break;
                }
                break;
        }
        reloadAd();
    }

    private final void reloadAd() {
        Job launch$default;
        Job job = this.reloadJob;
        if (job != null) {
            Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
        }
        launch$default = BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.CoroutineScope(Dispatchers.getMain()), null, null, new ReactNativeGoogleMobileAdsNativeAdView$reloadAd$1(this, null), 3, null);
        this.reloadJob = launch$default;
    }

    @Override // android.view.View, android.view.ViewParent
    public void requestLayout() {
        super.requestLayout();
        post(this.measureAndLayout);
    }

    public final void destroy() {
        Job job = this.reloadJob;
        if (job != null) {
            Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
        }
        this.reloadJob = null;
        this.nativeAdView.removeView(this.viewGroup);
        this.nativeAdView.destroy();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void measureAndLayout$lambda$1(ReactNativeGoogleMobileAdsNativeAdView reactNativeGoogleMobileAdsNativeAdView) {
        reactNativeGoogleMobileAdsNativeAdView.measure(View.MeasureSpec.makeMeasureSpec(reactNativeGoogleMobileAdsNativeAdView.getWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(reactNativeGoogleMobileAdsNativeAdView.getHeight(), 1073741824));
        reactNativeGoogleMobileAdsNativeAdView.layout(reactNativeGoogleMobileAdsNativeAdView.getLeft(), reactNativeGoogleMobileAdsNativeAdView.getTop(), reactNativeGoogleMobileAdsNativeAdView.getRight(), reactNativeGoogleMobileAdsNativeAdView.getBottom());
    }
}
