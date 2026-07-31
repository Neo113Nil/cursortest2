package com.pubmatic.sdk.nativead.renderer;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.os.Handler;
import android.os.Looper;
import android.os.Trace;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.MainThread;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.pubmatic.sdk.common.POBCommonConstants;
import com.pubmatic.sdk.common.POBDataType;
import com.pubmatic.sdk.common.POBError;
import com.pubmatic.sdk.common.POBInstanceProvider;
import com.pubmatic.sdk.common.log.POBLog;
import com.pubmatic.sdk.common.utility.POBImageDownloadManager;
import com.pubmatic.sdk.common.utility.POBUrlHandler;
import com.pubmatic.sdk.common.utility.POBUtils;
import com.pubmatic.sdk.common.viewability.POBNativeMeasurementProvider;
import com.pubmatic.sdk.nativead.POBNativeAdView;
import com.pubmatic.sdk.nativead.POBNativeAdViewHandler;
import com.pubmatic.sdk.nativead.POBNativeAdViewListener;
import com.pubmatic.sdk.nativead.POBNativeConstants;
import com.pubmatic.sdk.nativead.POBNativeLogConstants;
import com.pubmatic.sdk.nativead.POBNativeTrackerHandler;
import com.pubmatic.sdk.nativead.R;
import com.pubmatic.sdk.nativead.renderer.POBMediaViewRendererHelper;
import com.pubmatic.sdk.nativead.response.POBNativeAdDataResponseAsset;
import com.pubmatic.sdk.nativead.response.POBNativeAdImageResponseAsset;
import com.pubmatic.sdk.nativead.response.POBNativeAdLinkResponse;
import com.pubmatic.sdk.nativead.response.POBNativeAdResponse;
import com.pubmatic.sdk.nativead.response.POBNativeAdResponseAsset;
import com.pubmatic.sdk.nativead.response.POBNativeAdTitleResponseAsset;
import com.pubmatic.sdk.nativead.views.POBNativeAdMediumTemplateView;
import com.pubmatic.sdk.nativead.views.POBNativeTemplateView;
import com.pubmatic.sdk.openwrap.core.POBBid;
import com.pubmatic.sdk.openwrap.core.nativead.POBNativeEventTrackingMethod;
import com.pubmatic.sdk.openwrap.core.nativead.POBNativeEventType;
import com.pubmatic.sdk.webrendering.POBUIUtil;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Map;

/* loaded from: classes12.dex */
public class POBNativeAdRenderer implements POBNativeAdRendering, POBNativeAdViewListener, POBImageDownloadManager.POBImageDownloadListener {
    private final Context a;
    private POBNativeRendererListener b;
    private POBUrlHandler c;
    private POBNativeAdResponse d;
    private POBNativeTemplateView e;
    private POBNativeMeasurementProvider f;
    private POBNativeAdViewHandler g;
    private String h;
    private View i;
    private final POBNativeTrackerHandler k;
    private POBMediaViewRendererHelper l;
    private String m;
    private String p;
    private final View.OnAttachStateChangeListener j = new a();
    private boolean n = false;
    private boolean o = false;

    class a implements View.OnAttachStateChangeListener {
        a() {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
            if (POBNativeAdRenderer.this.g != null) {
                POBNativeAdRenderer.this.g.onAdViewAttachedToWindow();
                view.removeOnAttachStateChangeListener(this);
            }
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
        }
    }

    class b implements POBUrlHandler.UrlHandlerListener {
        b() {
        }

        @Override // com.pubmatic.sdk.common.utility.POBUrlHandler.UrlHandlerListener
        public void onErrorOpenUrl(String str) {
            POBLog.warn("POBNativeAdRenderer", "Unable to open " + str, new Object[0]);
            if (POBNativeAdRenderer.this.p == null || !POBNativeAdRenderer.this.p.equals(str)) {
                return;
            }
            POBNativeAdRenderer.this.e();
        }

        @Override // com.pubmatic.sdk.common.utility.POBUrlHandler.UrlHandlerListener
        public void onHandleTrackers(String str, List list) {
            POBNativeAdRenderer.this.k.executeClickTrackers(list);
        }

        @Override // com.pubmatic.sdk.common.utility.POBUrlHandler.UrlHandlerListener
        public void onInternalBrowserClose(String str) {
            if (POBNativeAdRenderer.this.b != null) {
                POBNativeAdRenderer.this.b.onAdClosed();
            }
        }

        @Override // com.pubmatic.sdk.common.utility.POBUrlHandler.UrlHandlerListener
        public void onInternalBrowserOpen(String str) {
            if (POBNativeAdRenderer.this.b != null) {
                POBNativeAdRenderer.this.b.onAdOpened();
            }
        }

        @Override // com.pubmatic.sdk.common.utility.POBUrlHandler.UrlHandlerListener
        public void onLeaveApp(String str) {
            if (POBNativeAdRenderer.this.b != null) {
                POBNativeAdRenderer.this.b.onAdLeavingApplication();
            }
        }
    }

    class c implements POBNativeMeasurementProvider.POBOmidSessionListener {
        final /* synthetic */ POBNativeMeasurementProvider a;
        final /* synthetic */ View b;

        c(POBNativeMeasurementProvider pOBNativeMeasurementProvider, View view) {
            this.a = pOBNativeMeasurementProvider;
            this.b = view;
        }

        @Override // com.pubmatic.sdk.common.viewability.POBNativeMeasurementProvider.POBOmidSessionListener
        public void onOmidSessionInitializationFailed() {
            POBLog.debug("POBNativeAdRenderer", POBNativeLogConstants.NATIVE_OM_NOT_INITIALISED, new Object[0]);
            POBNativeAdRenderer.this.a(this.b);
        }

        @Override // com.pubmatic.sdk.common.viewability.POBNativeMeasurementProvider.POBOmidSessionListener
        public void onOmidSessionInitialized() {
            POBLog.debug("POBNativeAdRenderer", POBNativeLogConstants.NATIVE_OM_INITIALISED, new Object[0]);
            POBNativeMeasurementProvider pOBNativeMeasurementProvider = this.a;
            if (pOBNativeMeasurementProvider != null) {
                pOBNativeMeasurementProvider.signalAdEvent(POBNativeMeasurementProvider.POBNativeAdEventType.LOADED);
            }
            POBNativeAdRenderer.this.a(this.b);
        }
    }

    private class d implements POBMediaViewRendererHelper.Listener {
        private d() {
        }

        @Override // com.pubmatic.sdk.nativead.renderer.POBMediaViewRendererHelper.Listener
        public void onImageAssetClick(int i) {
            if (POBNativeAdRenderer.this.d != null) {
                POBNativeAdResponseAsset asset = POBNativeAdRenderer.this.d.getAsset(i);
                POBNativeAdLinkResponse link = asset != null ? asset.getLink() : null;
                POBNativeAdLinkResponse link2 = POBNativeAdRenderer.this.d.getLink();
                POBNativeAdRenderer.this.b(link, link2);
                POBNativeAdRenderer.this.k.executeClickTrackers(POBNativeAdRenderer.this.a(link, link2));
            }
            POBNativeAdRenderer.this.a(i);
        }

        @Override // com.pubmatic.sdk.nativead.renderer.POBMediaViewRendererHelper.Listener
        public void onLeavingApplication() {
            if (POBNativeAdRenderer.this.b != null) {
                POBNativeAdRenderer.this.b.onAdLeavingApplication();
            }
        }

        @Override // com.pubmatic.sdk.nativead.renderer.POBMediaViewRendererHelper.Listener
        public void onMediaViewReady(ViewGroup viewGroup) {
            POBNativeAdRenderer.this.o = true;
            POBNativeAdRenderer.this.c();
        }

        @Override // com.pubmatic.sdk.nativead.renderer.POBMediaViewRendererHelper.Listener
        public void onVideoAssetClick(String str) {
            POBNativeAdRenderer.this.a(str);
        }

        @Override // com.pubmatic.sdk.nativead.renderer.POBMediaViewRendererHelper.Listener
        public void onVideoEventOccur(POBDataType.POBVideoAdEventType pOBVideoAdEventType) {
            if (POBNativeAdRenderer.this.b != null) {
                POBNativeAdRenderer.this.b.onVideoEventOccurred(pOBVideoAdEventType);
            }
        }

        /* synthetic */ d(POBNativeAdRenderer pOBNativeAdRenderer, a aVar) {
            this();
        }
    }

    public POBNativeAdRenderer(@NonNull Context context) {
        this.a = context;
        a(context);
        this.k = new POBNativeTrackerHandler(POBInstanceProvider.getTrackerHandler(POBInstanceProvider.getNetworkHandlerWithMainThreadDelivery()));
    }

    @Override // com.pubmatic.sdk.nativead.renderer.POBNativeAdRendering
    public void destroy() {
        this.b = null;
        this.e = null;
        View view = this.i;
        if (view != null) {
            view.setOnClickListener(null);
            this.i = null;
        }
        POBUrlHandler pOBUrlHandler = this.c;
        if (pOBUrlHandler != null) {
            pOBUrlHandler.destroy();
            this.c = null;
        }
        POBNativeMeasurementProvider pOBNativeMeasurementProvider = this.f;
        if (pOBNativeMeasurementProvider != null) {
            pOBNativeMeasurementProvider.finishAdSession();
        }
        POBMediaViewRendererHelper pOBMediaViewRendererHelper = this.l;
        if (pOBMediaViewRendererHelper != null) {
            pOBMediaViewRendererHelper.destroy();
            this.l = null;
        }
        this.m = null;
        this.p = null;
        this.n = false;
        this.o = false;
    }

    @Override // com.pubmatic.sdk.nativead.renderer.POBNativeAdRendering
    @Nullable
    @MainThread
    public View getAdInfoIcon() {
        View view = this.i;
        if (view != null) {
            return view;
        }
        if (!POBUtils.isMainThread()) {
            POBLog.warn("POBNativeAdRenderer", "getAdInfoIcon API must be called from the Main Thread", new Object[0]);
            return null;
        }
        View a2 = a();
        this.i = a2;
        return a2;
    }

    @NonNull
    public Float getMediaAspectRatio() {
        POBMediaViewRendererHelper pOBMediaViewRendererHelper = this.l;
        return pOBMediaViewRendererHelper != null ? Float.valueOf(pOBMediaViewRendererHelper.getMediaAspectRatio()) : Float.valueOf(0.0f);
    }

    @NonNull
    public FrameLayout getMediaView(@NonNull POBNativeAdResponse pOBNativeAdResponse, @NonNull POBBid pOBBid) {
        this.d = pOBNativeAdResponse;
        return a(pOBNativeAdResponse, pOBBid, 5);
    }

    @Override // com.pubmatic.sdk.nativead.POBNativeAdViewListener
    public void onAssetClicked(@NonNull View view, int i) {
        POBNativeAdResponse pOBNativeAdResponse = this.d;
        if (pOBNativeAdResponse != null) {
            POBNativeAdResponseAsset asset = pOBNativeAdResponse.getAsset(i);
            POBNativeAdLinkResponse link = asset != null ? asset.getLink() : null;
            POBNativeAdLinkResponse link2 = this.d.getLink();
            b(link, link2);
            this.k.executeClickTrackers(a(link, link2));
        }
        a(i);
    }

    @Override // com.pubmatic.sdk.common.utility.POBImageDownloadManager.POBImageDownloadListener
    public void onComplete(@NonNull Map<String, Bitmap> map) {
        String str;
        Bitmap bitmap;
        ImageView iconImage;
        if (this.e == null) {
            if (this.b != null) {
                this.b.onAdRenderingFailed(new POBError(1006, POBNativeLogConstants.TEMPLATE_VIEW_NULL));
                return;
            }
            return;
        }
        if (!map.isEmpty() && (str = this.m) != null && (bitmap = map.get(str)) != null) {
            POBNativeTemplateView pOBNativeTemplateView = this.e;
            if ((pOBNativeTemplateView instanceof POBNativeAdMediumTemplateView) && (iconImage = ((POBNativeAdMediumTemplateView) pOBNativeTemplateView).getIconImage()) != null) {
                iconImage.setImageDrawable(new BitmapDrawable(this.a.getResources(), bitmap));
            }
        }
        this.n = true;
        c();
    }

    @Override // com.pubmatic.sdk.nativead.POBNativeAdViewListener
    public void onNonAssetClicked(@NonNull View view, @NonNull String str) {
        POBNativeRendererListener pOBNativeRendererListener;
        if (str.equals("privacy_icon")) {
            d();
        } else {
            if (!str.equals(POBNativeConstants.POB_NATIVE_ID_AD_INFO) || (pOBNativeRendererListener = this.b) == null) {
                return;
            }
            pOBNativeRendererListener.onAdInfoIconClicked();
        }
    }

    @Override // com.pubmatic.sdk.nativead.POBNativeAdViewListener
    public void onRecordClick(@NonNull View view) {
        POBNativeAdResponse pOBNativeAdResponse = this.d;
        if (pOBNativeAdResponse != null && pOBNativeAdResponse.getLink() != null) {
            a(this.d.getLink().getUrl(), this.d.getLink().getFallbackURL(), this.d.getLink().getClickTrackers());
        }
        POBNativeRendererListener pOBNativeRendererListener = this.b;
        if (pOBNativeRendererListener != null) {
            pOBNativeRendererListener.onAdClicked();
        }
    }

    public void onRecordImpression(@NonNull View view) {
        g();
        POBNativeAdResponse pOBNativeAdResponse = this.d;
        if (pOBNativeAdResponse != null) {
            POBNativeTrackerHandler pOBNativeTrackerHandler = this.k;
            Context context = this.a;
            POBNativeEventType pOBNativeEventType = POBNativeEventType.IMPRESSION;
            pOBNativeTrackerHandler.executeImpressionTracker(context, pOBNativeAdResponse.getEventTrackers(pOBNativeEventType, POBNativeEventTrackingMethod.JAVASCRIPT), this.d.getEventTrackers(pOBNativeEventType, POBNativeEventTrackingMethod.IMAGE), this.d.getImpressionTrackers(), this.d.getJsTracker());
        }
        POBNativeRendererListener pOBNativeRendererListener = this.b;
        if (pOBNativeRendererListener != null) {
            pOBNativeRendererListener.onAdImpression();
        }
    }

    @Override // com.pubmatic.sdk.nativead.renderer.POBNativeAdRendering
    public void registerView(@NonNull POBNativeAdResponse pOBNativeAdResponse, @NonNull View view, @NonNull List<View> list) {
        this.d = pOBNativeAdResponse;
        if (this.g == null) {
            this.g = new POBNativeAdViewHandler();
            b(view);
        }
        this.g.setAdView(view);
        this.g.setListener(this);
        String str = this.h;
        if (str != null) {
            a(view, str);
        }
        for (View view2 : list) {
            if (view2 != null) {
                view2.setOnClickListener(this.g);
            }
        }
        View view3 = this.i;
        if (view3 != null) {
            view3.setOnClickListener(null);
            this.i.setOnClickListener(this.g);
        }
        view.setOnClickListener(this.g);
        view.addOnAttachStateChangeListener(this.j);
    }

    @Override // com.pubmatic.sdk.nativead.renderer.POBNativeAdRendering
    public void renderAd(@NonNull POBNativeAdResponse pOBNativeAdResponse, @NonNull POBNativeTemplateView pOBNativeTemplateView, @NonNull POBBid pOBBid) {
        Trace.beginSection("POB Render");
        this.d = pOBNativeAdResponse;
        this.e = pOBNativeTemplateView;
        a(pOBNativeTemplateView);
        e(pOBNativeAdResponse, pOBNativeTemplateView);
        c(pOBNativeAdResponse, pOBNativeTemplateView);
        boolean z = pOBNativeTemplateView instanceof POBNativeAdMediumTemplateView;
        int i = z ? 5 : 2;
        if (z) {
            a(pOBNativeAdResponse);
        } else {
            this.n = true;
        }
        FrameLayout mediaView = pOBNativeTemplateView.getMediaView();
        if (mediaView != null) {
            mediaView.addView(a(pOBNativeAdResponse, pOBBid, i));
        } else {
            this.o = true;
            c();
        }
    }

    @Override // com.pubmatic.sdk.nativead.renderer.POBNativeAdRendering
    public void setAdRendererListener(@Nullable POBNativeRendererListener pOBNativeRendererListener) {
        this.b = pOBNativeRendererListener;
    }

    @Override // com.pubmatic.sdk.nativead.renderer.POBNativeAdRendering
    public void setNativeMeasurementProvider(@Nullable POBNativeMeasurementProvider pOBNativeMeasurementProvider) {
        this.f = pOBNativeMeasurementProvider;
    }

    @Override // com.pubmatic.sdk.nativead.renderer.POBNativeAdRendering
    public void setWatermark(@Nullable String str) {
        this.h = str;
    }

    private void c(POBNativeAdResponse pOBNativeAdResponse, POBNativeTemplateView pOBNativeTemplateView) {
        d(pOBNativeAdResponse, pOBNativeTemplateView);
        b(pOBNativeAdResponse, pOBNativeTemplateView);
        a(pOBNativeAdResponse, pOBNativeTemplateView);
    }

    private void d(POBNativeAdResponse pOBNativeAdResponse, POBNativeTemplateView pOBNativeTemplateView) {
        TextView title;
        POBNativeAdResponseAsset asset = pOBNativeAdResponse.getAsset(1);
        if (!(asset instanceof POBNativeAdTitleResponseAsset) || (title = pOBNativeTemplateView.getTitle()) == null) {
            return;
        }
        title.setText(((POBNativeAdTitleResponseAsset) asset).getTitle());
    }

    private void e(POBNativeAdResponse pOBNativeAdResponse, POBNativeTemplateView pOBNativeTemplateView) {
        if (pOBNativeAdResponse.getPrivacyUrl() != null || pOBNativeTemplateView.getPrivacyIcon() == null) {
            return;
        }
        pOBNativeTemplateView.getPrivacyIcon().setVisibility(8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void f() {
        POBNativeMeasurementProvider pOBNativeMeasurementProvider = this.f;
        if (pOBNativeMeasurementProvider != null) {
            pOBNativeMeasurementProvider.signalAdEvent(POBNativeMeasurementProvider.POBNativeAdEventType.IMPRESSION);
        }
    }

    private void g() {
        new Handler(Looper.getMainLooper()).postDelayed(new Runnable() { // from class: com.pubmatic.sdk.nativead.renderer.POBNativeAdRenderer$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                POBNativeAdRenderer.this.f();
            }
        }, 1000L);
    }

    private void b(POBNativeAdResponse pOBNativeAdResponse, POBNativeTemplateView pOBNativeTemplateView) {
        TextView description;
        POBNativeAdResponseAsset asset = pOBNativeAdResponse.getAsset(3);
        if (!(asset instanceof POBNativeAdDataResponseAsset) || (description = pOBNativeTemplateView.getDescription()) == null) {
            return;
        }
        description.setText(((POBNativeAdDataResponseAsset) asset).getValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c() {
        if (this.n && this.o) {
            b(b());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e() {
        POBNativeAdResponse pOBNativeAdResponse = this.d;
        if (pOBNativeAdResponse != null) {
            POBNativeAdResponseAsset asset = pOBNativeAdResponse.getAsset(9);
            b(asset != null ? asset.getLink() : null, this.d.getLink());
        }
    }

    private FrameLayout a(POBNativeAdResponse pOBNativeAdResponse, POBBid pOBBid, int i) {
        if (this.l == null) {
            this.l = new POBMediaViewRendererHelper(this.a);
        }
        this.l.setListener(new d(this, null));
        this.l.loadMedia(pOBNativeAdResponse, pOBBid, i);
        return this.l.getMediaView();
    }

    private void d() {
        POBNativeAdResponse pOBNativeAdResponse = this.d;
        if (pOBNativeAdResponse != null) {
            POBNativeAdLinkResponse link = pOBNativeAdResponse.getLink();
            a(this.d.getPrivacyUrl(), (String) null, link != null ? link.getClickTrackers() : null);
            POBNativeRendererListener pOBNativeRendererListener = this.b;
            if (pOBNativeRendererListener != null) {
                pOBNativeRendererListener.onAdClicked();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(POBNativeAdLinkResponse pOBNativeAdLinkResponse, POBNativeAdLinkResponse pOBNativeAdLinkResponse2) {
        POBUrlHandler pOBUrlHandler = this.c;
        if (pOBUrlHandler == null) {
            return;
        }
        if (pOBNativeAdLinkResponse != null) {
            pOBUrlHandler.open(pOBNativeAdLinkResponse.getUrl(), pOBNativeAdLinkResponse.getFallbackURL());
        } else if (pOBNativeAdLinkResponse2 != null) {
            pOBUrlHandler.open(pOBNativeAdLinkResponse2.getUrl(), pOBNativeAdLinkResponse2.getFallbackURL());
        }
    }

    private View a() {
        ImageView imageView = new ImageView(this.a);
        imageView.setId(R.id.pob_ad_info_icon_btn);
        imageView.setImageResource(com.pubmatic.sdk.common.R.drawable.pob_ad_info_icon_native);
        imageView.setLayoutParams(new ViewGroup.LayoutParams(this.a.getResources().getDimensionPixelOffset(R.dimen.pob_dimen_16dp), this.a.getResources().getDimensionPixelOffset(R.dimen.pob_dimen_15dp)));
        imageView.setTag(POBNativeConstants.POB_NATIVE_ID_AD_INFO);
        return imageView;
    }

    private POBNativeAdView b() {
        POBNativeTemplateView pOBNativeTemplateView = this.e;
        if (pOBNativeTemplateView == null) {
            return null;
        }
        POBError b2 = b(pOBNativeTemplateView);
        if (b2 != null) {
            POBNativeRendererListener pOBNativeRendererListener = this.b;
            if (pOBNativeRendererListener != null) {
                pOBNativeRendererListener.onAdRenderingFailed(b2);
            }
            return null;
        }
        POBNativeAdView pOBNativeAdView = new POBNativeAdView(this.a);
        pOBNativeAdView.setListener(this);
        this.e.setOnClickListener(pOBNativeAdView);
        pOBNativeAdView.addView(this.e);
        return pOBNativeAdView;
    }

    private void a(POBNativeTemplateView pOBNativeTemplateView) {
        ImageView adInfoIcon = pOBNativeTemplateView.getAdInfoIcon();
        if (adInfoIcon != null) {
            adInfoIcon.setImageResource(com.pubmatic.sdk.common.R.drawable.pob_ad_info_icon_native);
        }
        this.i = adInfoIcon;
    }

    private void a(POBNativeAdResponse pOBNativeAdResponse, POBNativeTemplateView pOBNativeTemplateView) {
        Button cta;
        POBNativeAdResponseAsset asset = pOBNativeAdResponse.getAsset(4);
        if (!(asset instanceof POBNativeAdDataResponseAsset) || (cta = pOBNativeTemplateView.getCta()) == null) {
            return;
        }
        cta.setText(((POBNativeAdDataResponseAsset) asset).getValue());
    }

    private void b(View view) {
        if (view != null) {
            POBNativeMeasurementProvider pOBNativeMeasurementProvider = this.f;
            if (pOBNativeMeasurementProvider != null) {
                a(view, pOBNativeMeasurementProvider);
            } else {
                POBLog.debug("POBNativeAdRenderer", POBNativeLogConstants.NATIVE_OM_NOT_INITIALISED, new Object[0]);
                a(view);
            }
        }
    }

    private void a(POBNativeAdResponse pOBNativeAdResponse) {
        String a2 = a(pOBNativeAdResponse, 2);
        this.m = a2;
        if (a2 == null) {
            this.n = true;
            c();
            return;
        }
        HashSet hashSet = new HashSet();
        hashSet.add(this.m);
        POBImageDownloadManager pOBImageDownloadManager = new POBImageDownloadManager(hashSet);
        pOBImageDownloadManager.setListener(this);
        pOBImageDownloadManager.start();
    }

    private POBError b(POBNativeTemplateView pOBNativeTemplateView) {
        if (pOBNativeTemplateView.getParent() == null) {
            return null;
        }
        POBError pOBError = new POBError(1009, POBCommonConstants.NATIVE_TEMPLATE_VIEW_PARENT_ERROR_MSG);
        POBLog.error("POBNativeAdRenderer", POBCommonConstants.NATIVE_TEMPLATE_VIEW_PARENT_ERROR_MSG, new Object[0]);
        return pOBError;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public List a(POBNativeAdLinkResponse pOBNativeAdLinkResponse, POBNativeAdLinkResponse pOBNativeAdLinkResponse2) {
        ArrayList arrayList = new ArrayList();
        if (pOBNativeAdLinkResponse != null && !POBUtils.isListNullOrEmpty(pOBNativeAdLinkResponse.getClickTrackers())) {
            arrayList.addAll(pOBNativeAdLinkResponse.getClickTrackers());
        }
        if (pOBNativeAdLinkResponse2 != null && !POBUtils.isListNullOrEmpty(pOBNativeAdLinkResponse2.getClickTrackers())) {
            arrayList.addAll(pOBNativeAdLinkResponse2.getClickTrackers());
        }
        return arrayList;
    }

    private void a(String str, String str2, List list) {
        POBUrlHandler pOBUrlHandler = this.c;
        if (pOBUrlHandler != null) {
            pOBUrlHandler.open(str, str2);
        }
        this.k.executeClickTrackers(list);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(int i) {
        POBNativeRendererListener pOBNativeRendererListener = this.b;
        if (pOBNativeRendererListener != null) {
            pOBNativeRendererListener.onAdClicked(i);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(String str) {
        if (POBUtils.isStringValueNullOrEmpty(str)) {
            e();
        } else {
            POBUrlHandler pOBUrlHandler = this.c;
            if (pOBUrlHandler != null) {
                this.p = str;
                pOBUrlHandler.open(str);
            }
        }
        POBNativeAdResponse pOBNativeAdResponse = this.d;
        if (pOBNativeAdResponse != null) {
            POBNativeAdResponseAsset asset = pOBNativeAdResponse.getAsset(9);
            this.k.executeClickTrackers(a(asset != null ? asset.getLink() : null, this.d.getLink()));
        }
        a(9);
    }

    private void a(Context context) {
        this.c = new POBUrlHandler(context, new b());
    }

    private String a(POBNativeAdResponse pOBNativeAdResponse, int i) {
        POBNativeAdResponseAsset asset = pOBNativeAdResponse.getAsset(i);
        if (asset instanceof POBNativeAdImageResponseAsset) {
            return ((POBNativeAdImageResponseAsset) asset).getImageURL();
        }
        return null;
    }

    private void a(View view, String str) {
        ImageView createWatermarkView = POBUIUtil.createWatermarkView(this.a, str);
        if (createWatermarkView == null || !(view instanceof ViewGroup)) {
            return;
        }
        ((ViewGroup) view).addView(createWatermarkView, -1, -1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(View view) {
        Trace.endSection();
        POBNativeRendererListener pOBNativeRendererListener = this.b;
        if (pOBNativeRendererListener != null) {
            pOBNativeRendererListener.onAdRendered(view);
        }
    }

    private void a(View view, POBNativeMeasurementProvider pOBNativeMeasurementProvider) {
        POBNativeAdResponse pOBNativeAdResponse = this.d;
        if (pOBNativeAdResponse != null) {
            pOBNativeMeasurementProvider.startAdSession(view, pOBNativeAdResponse.getEventTrackers(POBNativeEventType.OMID, POBNativeEventTrackingMethod.JAVASCRIPT), new c(pOBNativeMeasurementProvider, view));
        } else {
            POBLog.debug("POBNativeAdRenderer", POBNativeLogConstants.NATIVE_OM_NOT_INITIALISED, new Object[0]);
            a(view);
        }
    }
}
