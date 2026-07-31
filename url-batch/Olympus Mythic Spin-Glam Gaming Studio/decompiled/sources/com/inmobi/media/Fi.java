package com.inmobi.media;

import android.content.Context;
import android.view.View;
import com.iab.omid.library.inmobi.adsession.FriendlyObstructionPurpose;
import com.inmobi.media.core.config.models.AdConfig;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes10.dex */
public final class Fi extends GestureDetectorOnGestureListenerC4476xi {
    public final byte k1;
    public final C4493y9 l1;
    public final String m1;
    public final GestureDetectorOnGestureListenerC4476xi n1;
    public final Ei o1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Fi(Context context, byte b, C4493y9 c4493y9, C4221o0 adMetaData, Jo webViewFactory, Yi route, AdConfig adConfig) {
        super(context, b, null, null, adMetaData.r, 0L, adMetaData.s, c4493y9, route, webViewFactory, adMetaData, adConfig, 92);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(adMetaData, "adMetaData");
        Intrinsics.checkNotNullParameter(webViewFactory, "webViewFactory");
        Intrinsics.checkNotNullParameter(route, "route");
        Intrinsics.checkNotNullParameter(adConfig, "adConfig");
        this.k1 = b;
        this.l1 = c4493y9;
        this.m1 = "RenderViewSibling - " + route.b;
        webViewFactory.getClass();
        Intrinsics.checkNotNullParameter("default", "id");
        this.n1 = (GestureDetectorOnGestureListenerC4476xi) webViewFactory.b.get("default");
        this.o1 = new Ei(this, webViewFactory, route);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final GestureDetectorOnGestureListenerC4476xi getAdRenderView() {
        C4493y9 c4493y9;
        if (this.n1 == null && (c4493y9 = this.l1) != null) {
            c4493y9.b(this.m1, "Ad RenderView not found for id: " + getRoute().b);
        }
        return this.n1;
    }

    private static /* synthetic */ void getOverrideListener$annotations() {
    }

    @Override // com.inmobi.media.GestureDetectorOnGestureListenerC4476xi
    public final void C() {
    }

    public final void Z() {
        Map<View, FriendlyObstructionPurpose> friendlyViews;
        C4493y9 c4493y9 = this.l1;
        if (c4493y9 != null) {
            c4493y9.a(this.m1, "initialize RenderViewSibling");
        }
        a(this.o1);
        GestureDetectorOnGestureListenerC4476xi adRenderView = getAdRenderView();
        setContextualDataHandler(adRenderView != null ? adRenderView.getContextualDataHandler() : null);
        GestureDetectorOnGestureListenerC4476xi adRenderView2 = getAdRenderView();
        setEmbeddedBrowserJsCallbacks(adRenderView2 != null ? adRenderView2.getEmbeddedBrowserJsCallbacks() : null);
        GestureDetectorOnGestureListenerC4476xi adRenderView3 = getAdRenderView();
        if (adRenderView3 == null || (friendlyViews = adRenderView3.getFriendlyViews()) == null) {
            return;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<View, FriendlyObstructionPurpose> entry : friendlyViews.entrySet()) {
            if (!(entry.getKey() instanceof Fi)) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        C4493y9 c4493y92 = this.l1;
        if (c4493y92 != null) {
            c4493y92.a(this.m1, "Setting friendly views from adRenderView: " + linkedHashMap);
        }
        setFriendlyViews(MapsKt.toMutableMap(linkedHashMap));
    }

    @Override // com.inmobi.media.GestureDetectorOnGestureListenerC4476xi
    public final void a(Vf orientationProperties) {
        Intrinsics.checkNotNullParameter(orientationProperties, "orientationProperties");
        C4493y9 c4493y9 = this.l1;
        if (c4493y9 != null) {
            c4493y9.a(this.m1, "setOrientationProperties " + this);
        }
        setOrientationProperties(orientationProperties);
    }

    @Override // com.inmobi.media.GestureDetectorOnGestureListenerC4476xi, com.inmobi.media.C
    public final void b() {
        k();
        removeAllViews();
        Intrinsics.checkNotNull(this, "null cannot be cast to non-null type android.webkit.WebView");
        destroy();
    }

    @Nullable
    public final InterfaceC4466x9 getLogger() {
        return this.l1;
    }

    public final byte getMPlacementType() {
        return this.k1;
    }

    @Override // com.inmobi.media.GestureDetectorOnGestureListenerC4476xi, com.inmobi.media.C
    @NotNull
    public AbstractC4008fo getViewableAd() {
        if (getMViewableAd() == null) {
            setMViewableAd(new O9(this, this, new C4491y7(getImpressionType(), getMCreativeType(), getMImpressionMinTimeViewed(), getMImpressionMinPercentageViewed(), getAdConfig().getViewability().getCompanionVisibilityMinPercentageViewed(), this.l1), this.l1));
        }
        AbstractC4008fo mViewableAd = getMViewableAd();
        Intrinsics.checkNotNull(mViewableAd);
        return mViewableAd;
    }

    @Override // com.inmobi.media.GestureDetectorOnGestureListenerC4476xi
    public final void n() {
        C4493y9 c4493y9 = this.l1;
        if (c4493y9 != null) {
            c4493y9.a(this.m1, "dismissCurrentViewContainer " + this);
        }
        Jc mediaProcessor = getMediaProcessor();
        if (mediaProcessor != null) {
            C4390uc c4390uc = mediaProcessor.c;
            if (c4390uc != null) {
                c4390uc.b();
            }
            mediaProcessor.c = null;
        }
        if (Intrinsics.areEqual("Default", getViewState())) {
            setAndUpdateViewState("Hidden");
        }
    }

    @Override // com.inmobi.media.GestureDetectorOnGestureListenerC4476xi, android.webkit.WebView, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        Jo webViewFactory = getWebViewFactory();
        String id = getRoute().a;
        webViewFactory.getClass();
        Intrinsics.checkNotNullParameter(id, "id");
        GestureDetectorOnGestureListenerC4476xi gestureDetectorOnGestureListenerC4476xi = (GestureDetectorOnGestureListenerC4476xi) webViewFactory.b.get(id);
        if (gestureDetectorOnGestureListenerC4476xi != null) {
            c(gestureDetectorOnGestureListenerC4476xi, getRoute().b);
            return;
        }
        C4493y9 c4493y9 = this.l1;
        if (c4493y9 != null) {
            c4493y9.b(this.m1, "Not able to give show success as the source view is not present");
        }
    }

    @Override // com.inmobi.media.GestureDetectorOnGestureListenerC4476xi, com.inmobi.media.D2, android.webkit.WebView, android.widget.AbsoluteLayout, android.view.View
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        if (1 == 0) {
            setMeasuredDimension(0, 0);
        } else {
            super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        }
    }

    @Override // com.inmobi.media.GestureDetectorOnGestureListenerC4476xi
    public final void u() {
    }
}
