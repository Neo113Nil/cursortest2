package com.pubmatic.sdk.nativead;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.MainThread;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.pubmatic.sdk.common.POBAdFormat;
import com.pubmatic.sdk.common.POBCommonConstants;
import com.pubmatic.sdk.common.POBDataType;
import com.pubmatic.sdk.common.POBError;
import com.pubmatic.sdk.common.POBInstanceProvider;
import com.pubmatic.sdk.common.log.POBLog;
import com.pubmatic.sdk.common.log.POBLogConstants;
import com.pubmatic.sdk.common.utility.POBUtils;
import com.pubmatic.sdk.common.viewability.POBNativeMeasurementProvider;
import com.pubmatic.sdk.nativead.datatype.POBNativeTemplateType;
import com.pubmatic.sdk.nativead.renderer.POBNativeAdRenderer;
import com.pubmatic.sdk.nativead.renderer.POBNativeAdRendering;
import com.pubmatic.sdk.nativead.renderer.POBNativeRendererListener;
import com.pubmatic.sdk.nativead.response.POBNativeAdDataResponseAsset;
import com.pubmatic.sdk.nativead.response.POBNativeAdImageResponseAsset;
import com.pubmatic.sdk.nativead.response.POBNativeAdResponse;
import com.pubmatic.sdk.nativead.response.POBNativeAdResponseAsset;
import com.pubmatic.sdk.nativead.response.POBNativeAdTitleResponseAsset;
import com.pubmatic.sdk.nativead.views.POBNativeAdMediumTemplateView;
import com.pubmatic.sdk.nativead.views.POBNativeAdSmallTemplateView;
import com.pubmatic.sdk.nativead.views.POBNativeTemplateView;
import com.pubmatic.sdk.openwrap.core.POBAdsHelper;
import com.pubmatic.sdk.openwrap.core.POBBid;
import com.pubmatic.sdk.webrendering.dsa.POBDsaHtmlContent;
import com.pubmatic.sdk.webrendering.dsa.POBDsaInfoPresenterHelper;
import java.util.List;

/* loaded from: classes14.dex */
public class POBNativeAdProvider implements POBNativeAd, POBNativeRendererListener, POBNativeAdEventListener {
    private final Context a;
    private final POBNativeTemplateType b;
    private final POBNativeAdRendering c;
    private final POBNativeAdEventBridge d;
    private POBNativeAdResponse e;
    private POBNativeAdListener f;
    private POBNativeAdVideoEventListener g;
    private POBBid h;
    private POBNativeAdView i;
    private POBDataType.POBAdState j;
    private boolean k;
    private FrameLayout l;

    class a implements POBDsaHtmlContent.OnContentListener {
        a() {
        }

        @Override // com.pubmatic.sdk.webrendering.dsa.POBDsaHtmlContent.OnContentListener
        public void onPageContentReceived(String str) {
            POBDsaInfoPresenterHelper.show(POBNativeAdProvider.this.a, POBNativeAdProvider.this.h, str);
        }
    }

    class b extends POBNativeAdRenderer {
        b(Context context) {
            super(context);
        }

        @Override // com.pubmatic.sdk.nativead.renderer.POBNativeAdRenderer, com.pubmatic.sdk.nativead.POBNativeAdViewListener
        public void onRecordImpression(View view) {
            POBNativeAdProvider.this.d.trackImpression();
        }
    }

    static /* synthetic */ class c {
        static final /* synthetic */ int[] a;
        static final /* synthetic */ int[] b;

        static {
            int[] iArr = new int[POBDataType.POBVideoAdEventType.values().length];
            b = iArr;
            try {
                iArr[POBDataType.POBVideoAdEventType.START.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                b[POBDataType.POBVideoAdEventType.COMPLETE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                b[POBDataType.POBVideoAdEventType.PAUSE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                b[POBDataType.POBVideoAdEventType.RESUME.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                b[POBDataType.POBVideoAdEventType.MUTE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                b[POBDataType.POBVideoAdEventType.UNMUTE.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            int[] iArr2 = new int[POBDataType.POBAdState.values().length];
            a = iArr2;
            try {
                iArr2[POBDataType.POBAdState.DESTROYED.ordinal()] = 1;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                a[POBDataType.POBAdState.SHOWN.ordinal()] = 2;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                a[POBDataType.POBAdState.RENDERING.ordinal()] = 3;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                a[POBDataType.POBAdState.FAILED.ordinal()] = 4;
            } catch (NoSuchFieldError unused10) {
            }
        }
    }

    public POBNativeAdProvider(@NonNull Context context, @NonNull POBNativeTemplateType pOBNativeTemplateType, @NonNull POBNativeAdEventBridge pOBNativeAdEventBridge) {
        this.a = context;
        this.b = pOBNativeTemplateType;
        this.d = pOBNativeAdEventBridge;
        pOBNativeAdEventBridge.setNativeAdEventListener(this);
        this.j = POBDataType.POBAdState.DEFAULT;
        this.c = a();
    }

    @Override // com.pubmatic.sdk.nativead.POBNativeAd
    public void destroy() {
        this.j = POBDataType.POBAdState.DESTROYED;
        this.i = null;
        this.l = null;
        this.c.destroy();
        this.f = null;
        this.g = null;
        this.d.destroy();
    }

    @Override // com.pubmatic.sdk.nativead.POBNativeAd
    @MainThread
    public View getAdInfoIcon() {
        return this.c.getAdInfoIcon();
    }

    @Override // com.pubmatic.sdk.nativead.POBNativeAd
    @Nullable
    public POBNativeAdView getAdView() {
        return this.i;
    }

    @Override // com.pubmatic.sdk.nativead.POBNativeAd
    @Nullable
    public POBNativeAdDataResponseAsset getAdvertiser() {
        return getDataAssetForId(8);
    }

    @Override // com.pubmatic.sdk.nativead.POBNativeAd
    @Nullable
    public POBNativeAdDataResponseAsset getCallToAction() {
        return getDataAssetForId(4);
    }

    @Override // com.pubmatic.sdk.nativead.POBNativeAd
    @Nullable
    public POBNativeAdDataResponseAsset getDataAssetForId(int i) {
        POBNativeAdResponse pOBNativeAdResponse = this.e;
        if (pOBNativeAdResponse == null) {
            POBLog.debug("POBNativeAdProvider", "NativeAdResponse is null.", new Object[0]);
            return null;
        }
        POBNativeAdResponseAsset asset = pOBNativeAdResponse.getAsset(i);
        if (asset instanceof POBNativeAdDataResponseAsset) {
            return (POBNativeAdDataResponseAsset) asset;
        }
        POBLog.warn("POBNativeAdProvider", POBNativeLogConstants.NATIVE_INVALID_ASSET_ID, Integer.valueOf(i), POBNativeAdDataResponseAsset.class.getName());
        return null;
    }

    @Override // com.pubmatic.sdk.nativead.POBNativeAd
    @Nullable
    public POBNativeAdDataResponseAsset getDescription() {
        return getDataAssetForId(3);
    }

    @Override // com.pubmatic.sdk.nativead.POBNativeAd
    @Nullable
    public POBNativeAdImageResponseAsset getIcon() {
        return getImageAssetForId(2);
    }

    @Override // com.pubmatic.sdk.nativead.POBNativeAd
    @Nullable
    public POBNativeAdImageResponseAsset getImageAssetForId(int i) {
        POBNativeAdResponse pOBNativeAdResponse = this.e;
        if (pOBNativeAdResponse == null) {
            POBLog.debug("POBNativeAdProvider", "NativeAdResponse is null.", new Object[0]);
            return null;
        }
        POBNativeAdResponseAsset asset = pOBNativeAdResponse.getAsset(i);
        if (asset instanceof POBNativeAdImageResponseAsset) {
            return (POBNativeAdImageResponseAsset) asset;
        }
        POBLog.warn("POBNativeAdProvider", POBNativeLogConstants.NATIVE_INVALID_ASSET_ID, Integer.valueOf(i), POBNativeAdImageResponseAsset.class.getName());
        return null;
    }

    @Override // com.pubmatic.sdk.nativead.POBNativeAd
    @Nullable
    public POBNativeAdImageResponseAsset getMainImage() {
        return getImageAssetForId(5);
    }

    @Override // com.pubmatic.sdk.nativead.POBNativeAd
    @NonNull
    public Float getMediaAspectRatio() {
        POBNativeAdRendering pOBNativeAdRendering = this.c;
        return pOBNativeAdRendering instanceof POBNativeAdRenderer ? ((POBNativeAdRenderer) pOBNativeAdRendering).getMediaAspectRatio() : Float.valueOf(0.0f);
    }

    @Override // com.pubmatic.sdk.nativead.POBNativeAd
    @Nullable
    @MainThread
    public FrameLayout getMediaView() {
        POBBid pOBBid;
        FrameLayout frameLayout = this.l;
        if (frameLayout != null) {
            return frameLayout;
        }
        if (!POBUtils.isMainThread()) {
            POBLog.warn("POBNativeAdProvider", POBNativeLogConstants.MSG_MEDIA_VIEW_API_ON_BACKGROUND_THREAD, new Object[0]);
            return null;
        }
        POBNativeAdResponse pOBNativeAdResponse = this.e;
        if (pOBNativeAdResponse != null && (pOBBid = this.h) != null) {
            POBNativeAdRendering pOBNativeAdRendering = this.c;
            if (pOBNativeAdRendering instanceof POBNativeAdRenderer) {
                this.l = ((POBNativeAdRenderer) pOBNativeAdRendering).getMediaView(pOBNativeAdResponse, pOBBid);
            }
        }
        return this.l;
    }

    @Override // com.pubmatic.sdk.nativead.POBNativeAd
    @Nullable
    public POBNativeAdDataResponseAsset getPrice() {
        return getDataAssetForId(7);
    }

    @Override // com.pubmatic.sdk.nativead.POBNativeAd
    @Nullable
    public POBNativeAdDataResponseAsset getRating() {
        return getDataAssetForId(6);
    }

    @Override // com.pubmatic.sdk.nativead.POBNativeAd
    @Nullable
    public POBNativeAdTitleResponseAsset getTitle() {
        return getTitleAssetForId(1);
    }

    @Override // com.pubmatic.sdk.nativead.POBNativeAd
    @Nullable
    public POBNativeAdTitleResponseAsset getTitleAssetForId(int i) {
        POBNativeAdResponse pOBNativeAdResponse = this.e;
        if (pOBNativeAdResponse == null) {
            POBLog.debug("POBNativeAdProvider", "NativeAdResponse is null.", new Object[0]);
            return null;
        }
        POBNativeAdResponseAsset asset = pOBNativeAdResponse.getAsset(i);
        if (asset instanceof POBNativeAdTitleResponseAsset) {
            return (POBNativeAdTitleResponseAsset) asset;
        }
        POBLog.warn("POBNativeAdProvider", POBNativeLogConstants.NATIVE_INVALID_ASSET_ID, Integer.valueOf(i), POBNativeAdTitleResponseAsset.class.getName());
        return null;
    }

    @Override // com.pubmatic.sdk.nativead.renderer.POBNativeRendererListener
    public void onAdClicked() {
        this.d.trackClick();
        POBNativeAdListener pOBNativeAdListener = this.f;
        if (pOBNativeAdListener != null) {
            pOBNativeAdListener.onNativeAdClicked(this);
        }
    }

    @Override // com.pubmatic.sdk.nativead.renderer.POBNativeRendererListener
    public void onAdClosed() {
        POBNativeAdListener pOBNativeAdListener = this.f;
        if (pOBNativeAdListener != null) {
            pOBNativeAdListener.onNativeAdClosed(this);
        }
    }

    @Override // com.pubmatic.sdk.nativead.renderer.POBNativeRendererListener
    public void onAdImpression() {
        this.j = POBDataType.POBAdState.SHOWN;
        this.d.trackImpression();
        POBAdsHelper.recordImpressionDepth(this.a, POBAdFormat.NATIVE);
        POBNativeAdListener pOBNativeAdListener = this.f;
        if (pOBNativeAdListener != null) {
            pOBNativeAdListener.onNativeAdImpression(this);
        }
    }

    @Override // com.pubmatic.sdk.nativead.renderer.POBNativeRendererListener
    public void onAdInfoIconClicked() {
        POBDsaHtmlContent.getHtmlContent(this.a, new a());
    }

    @Override // com.pubmatic.sdk.nativead.renderer.POBNativeRendererListener
    public void onAdLeavingApplication() {
        POBNativeAdListener pOBNativeAdListener = this.f;
        if (pOBNativeAdListener != null) {
            pOBNativeAdListener.onNativeAdLeavingApplication(this);
        }
    }

    @Override // com.pubmatic.sdk.nativead.renderer.POBNativeRendererListener
    public void onAdOpened() {
        POBNativeAdListener pOBNativeAdListener = this.f;
        if (pOBNativeAdListener != null) {
            pOBNativeAdListener.onNativeAdOpened(this);
        }
    }

    @Override // com.pubmatic.sdk.nativead.renderer.POBNativeRendererListener
    public void onAdRendered(@NonNull View view) {
        this.j = POBDataType.POBAdState.READY;
        if (this.b != POBNativeTemplateType.CUSTOM) {
            this.i = (POBNativeAdView) view;
            POBNativeAdListener pOBNativeAdListener = this.f;
            if (pOBNativeAdListener != null) {
                pOBNativeAdListener.onNativeAdRendered(this);
            }
        }
    }

    @Override // com.pubmatic.sdk.nativead.renderer.POBNativeRendererListener
    public void onAdRenderingFailed(@NonNull POBError pOBError) {
        if (this.f == null || this.b == POBNativeTemplateType.CUSTOM) {
            return;
        }
        a(pOBError);
    }

    @Override // com.pubmatic.sdk.nativead.POBNativeAdEventListener
    public void onNativeAdClicked() {
        POBNativeAdListener pOBNativeAdListener = this.f;
        if (pOBNativeAdListener == null || this.k) {
            return;
        }
        pOBNativeAdListener.onNativeAdClicked(this);
    }

    @Override // com.pubmatic.sdk.nativead.POBNativeAdEventListener
    public void onNativeAdClosed() {
        POBNativeAdListener pOBNativeAdListener = this.f;
        if (pOBNativeAdListener != null) {
            pOBNativeAdListener.onNativeAdClosed(this);
        }
    }

    @Override // com.pubmatic.sdk.nativead.POBNativeAdEventListener
    public void onNativeAdImpression() {
        POBNativeAdListener pOBNativeAdListener = this.f;
        if (pOBNativeAdListener == null || this.k) {
            return;
        }
        this.j = POBDataType.POBAdState.SHOWN;
        pOBNativeAdListener.onNativeAdImpression(this);
    }

    @Override // com.pubmatic.sdk.nativead.POBNativeAdEventListener
    public void onNativeAdOpened() {
        POBNativeAdListener pOBNativeAdListener = this.f;
        if (pOBNativeAdListener != null) {
            pOBNativeAdListener.onNativeAdOpened(this);
        }
    }

    @Override // com.pubmatic.sdk.nativead.renderer.POBNativeRendererListener
    public void onVideoEventOccurred(@NonNull POBDataType.POBVideoAdEventType pOBVideoAdEventType) {
        if (this.g != null) {
            switch (c.b[pOBVideoAdEventType.ordinal()]) {
                case 1:
                    this.g.onVideoStarted(this);
                    break;
                case 2:
                    this.g.onVideoCompleted(this);
                    break;
                case 3:
                    this.g.onVideoPaused(this);
                    break;
                case 4:
                    this.g.onVideoResumed(this);
                    break;
                case 5:
                    this.g.onAudioStateChanged(this, true);
                    break;
                case 6:
                    this.g.onAudioStateChanged(this, false);
                    break;
            }
        }
    }

    @Override // com.pubmatic.sdk.nativead.POBNativeAd
    public void registerViewForInteraction(@NonNull View view, @NonNull List<View> list, @NonNull POBNativeAdListener pOBNativeAdListener) {
        this.f = pOBNativeAdListener;
        POBNativeAdResponse pOBNativeAdResponse = this.e;
        if (pOBNativeAdResponse != null) {
            this.c.registerView(pOBNativeAdResponse, view, list);
        } else {
            POBLog.debug("POBNativeAdProvider", "NativeAdResponse is null.", new Object[0]);
        }
    }

    @Override // com.pubmatic.sdk.nativead.POBNativeAd
    @MainThread
    public void renderAd(@NonNull POBNativeAdListener pOBNativeAdListener) {
        renderAd(b(), pOBNativeAdListener);
    }

    public void setBid(@Nullable POBBid pOBBid) {
        this.h = pOBBid;
    }

    public void setNativeAdResponse(@Nullable POBNativeAdResponse pOBNativeAdResponse) {
        this.e = pOBNativeAdResponse;
    }

    @Override // com.pubmatic.sdk.nativead.POBNativeAd
    public void setVideoEventListener(@NonNull POBNativeAdVideoEventListener pOBNativeAdVideoEventListener) {
        this.g = pOBNativeAdVideoEventListener;
    }

    private POBNativeTemplateView b() {
        return this.b.equals(POBNativeTemplateType.SMALL) ? new POBNativeAdSmallTemplateView(this.a) : new POBNativeAdMediumTemplateView(this.a);
    }

    private void c() {
        View adServerView = this.d.getAdServerView();
        if (adServerView == null) {
            onAdRenderingFailed(new POBError(1009, POBNativeLogConstants.AD_SERVER_VIEW_MISSING_ERROR));
            return;
        }
        POBNativeAdView pOBNativeAdView = new POBNativeAdView(this.a);
        pOBNativeAdView.setListener(new b(this.a));
        pOBNativeAdView.addView(adServerView);
        onAdRendered(pOBNativeAdView);
    }

    void a(String str) {
        this.c.setWatermark(str);
    }

    private void a(POBError pOBError) {
        this.j = POBDataType.POBAdState.FAILED;
        POBLog.error("POBNativeAdProvider", pOBError.getErrorMessage(), new Object[0]);
        POBNativeAdListener pOBNativeAdListener = this.f;
        if (pOBNativeAdListener != null) {
            pOBNativeAdListener.onNativeAdRenderingFailed(this, pOBError);
        }
    }

    @Override // com.pubmatic.sdk.nativead.POBNativeAd
    @MainThread
    public void renderAd(@NonNull POBNativeTemplateView pOBNativeTemplateView, @NonNull POBNativeAdListener pOBNativeAdListener) {
        this.f = pOBNativeAdListener;
        POBBid pOBBid = this.h;
        if (pOBBid != null) {
            this.k = pOBBid.hasWon();
        }
        int i = c.a[this.j.ordinal()];
        if (i == 1) {
            POBLog.error("POBNativeAdProvider", POBNativeLogConstants.NATIVE_AD_DESTROYED_ERROR, new Object[0]);
            return;
        }
        if (i == 2) {
            a(new POBError(2001, POBLogConstants.MSG_AD_ALREADY_SHOWN_ERROR));
            return;
        }
        if (i == 3) {
            POBLog.info("POBNativeAdProvider", POBNativeLogConstants.NATIVE_AD_RENDERING_IN_PROGRESS, new Object[0]);
            return;
        }
        if (i != 4) {
            POBBid pOBBid2 = this.h;
            if (pOBBid2 != null && pOBBid2.hasWon()) {
                if (!this.h.isExpired()) {
                    if (POBDataType.POBAdState.READY.equals(this.j)) {
                        this.f.onNativeAdRendered(this);
                        return;
                    }
                    if ((POBNativeTemplateType.SMALL.equals(this.b) && (pOBNativeTemplateView instanceof POBNativeAdSmallTemplateView)) || (POBNativeTemplateType.MEDIUM.equals(this.b) && (pOBNativeTemplateView instanceof POBNativeAdMediumTemplateView))) {
                        this.j = POBDataType.POBAdState.RENDERING;
                        a(pOBNativeTemplateView, this.h);
                        return;
                    } else {
                        a(new POBError(1009, POBNativeLogConstants.NATIVE_TEMPLATE_MISMATCHING));
                        return;
                    }
                }
                a(new POBError(1011, POBLogConstants.MSG_AD_EXPIRED_ERROR));
                return;
            }
            if (POBDataType.POBAdState.READY.equals(this.j)) {
                this.f.onNativeAdRendered(this);
                return;
            } else {
                this.j = POBDataType.POBAdState.RENDERING;
                c();
                return;
            }
        }
        a(new POBError(1009, POBNativeLogConstants.NATIVE_AD_FAILED));
    }

    @Override // com.pubmatic.sdk.nativead.renderer.POBNativeRendererListener
    public void onAdClicked(int i) {
        this.d.trackClick();
        POBNativeAdListener pOBNativeAdListener = this.f;
        if (pOBNativeAdListener != null) {
            pOBNativeAdListener.onNativeAdClicked(this, String.valueOf(i));
        }
    }

    private void a(POBNativeTemplateView pOBNativeTemplateView, POBBid pOBBid) {
        if (pOBBid.getRawBid() != null) {
            POBInstanceProvider.getCacheManager(this.a).saveRenderedBid(pOBBid.getRawBid());
        }
        POBNativeAdResponse pOBNativeAdResponse = this.e;
        if (pOBNativeAdResponse != null) {
            this.c.renderAd(pOBNativeAdResponse, pOBNativeTemplateView, pOBBid);
        } else {
            POBLog.debug("POBNativeAdProvider", "NativeAdResponse is null.", new Object[0]);
            a(new POBError(1009, POBNativeLogConstants.MSG_INTERNAL_NATIVE_RENDER_ERROR));
        }
    }

    private POBNativeAdRenderer a() {
        POBNativeAdRenderer pOBNativeAdRenderer = new POBNativeAdRenderer(this.a);
        pOBNativeAdRenderer.setNativeMeasurementProvider((POBNativeMeasurementProvider) POBInstanceProvider.getSdkConfig().getMeasurementProvider(POBCommonConstants.NATIVE_MEASUREMENT_PROVIDER_CLASS));
        pOBNativeAdRenderer.setAdRendererListener(this);
        return pOBNativeAdRenderer;
    }
}
