package com.ogury.ad;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import com.ogury.ad.common.OguryMediation;
import com.ogury.ad.internal.OguryListenerAdapter;
import com.ogury.ad.internal.b1;
import com.ogury.ad.internal.c;
import com.ogury.ad.internal.d1;
import com.ogury.ad.internal.f1;
import com.ogury.ad.internal.hh;
import com.ogury.ad.internal.ib;
import com.ogury.ad.internal.o0;
import com.ogury.ad.internal.o1;
import com.ogury.ad.internal.p8;
import com.ogury.ad.internal.t6;
import com.ogury.ad.internal.w;
import com.ogury.ad.internal.x;
import com.ogury.ad.internal.x0;
import com.ogury.ad.internal.y7;
import com.ogury.core.internal.IntegrationLogger;
import com.ogury.core.internal.LogTag;
import com.ogury.core.internal.SourceTag;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003BC\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u0011\u0010\u0017\u001a\u0004\u0018\u00010\u0016H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u001a\u001a\u00020\u0019H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\r\u0010\u001d\u001a\u00020\u001c¢\u0006\u0004\b\u001d\u0010\u001eJ\u0015\u0010 \u001a\u00020\u00132\u0006\u0010\u001f\u001a\u00020\u0006¢\u0006\u0004\b \u0010!J\u0015\u0010#\u001a\u00020\u00132\u0006\u0010\"\u001a\u00020\u0006¢\u0006\u0004\b#\u0010!J\u0015\u0010%\u001a\u00020\u00132\u0006\u0010$\u001a\u00020\u0006¢\u0006\u0004\b%\u0010!J\u0015\u0010'\u001a\u00020\u00132\u0006\u0010&\u001a\u00020\u0006¢\u0006\u0004\b'\u0010!J\u0017\u0010*\u001a\u00020\u00132\b\u0010)\u001a\u0004\u0018\u00010(¢\u0006\u0004\b*\u0010+J\u001b\u0010-\u001a\u00020\u00132\n\b\u0002\u0010,\u001a\u0004\u0018\u00010\u0006H\u0007¢\u0006\u0004\b-\u0010!J\r\u0010.\u001a\u00020\u001c¢\u0006\u0004\b.\u0010\u001eJ\r\u0010/\u001a\u00020\u0013¢\u0006\u0004\b/\u00100J+\u00106\u001a\u00020\u00132\b\u00102\u001a\u0004\u0018\u0001012\u0006\u00103\u001a\u00020\u000e2\b\u00105\u001a\u0004\u0018\u000104H\u0016¢\u0006\u0004\b6\u00107¨\u00068"}, d2 = {"Lcom/ogury/ad/OguryBannerAdView;", "Landroid/widget/FrameLayout;", "Lcom/ogury/ad/internal/o1;", "Lcom/ogury/ad/internal/p8;", "Landroid/content/Context;", "context", "", "adUnitId", "Lcom/ogury/ad/OguryBannerAdSize;", "size", "Lcom/ogury/ad/common/OguryMediation;", "oguryMediation", "Landroid/util/AttributeSet;", "attributes", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Ljava/lang/String;Lcom/ogury/ad/OguryBannerAdSize;Lcom/ogury/ad/common/OguryMediation;Landroid/util/AttributeSet;I)V", "adSize", "", "setAdSizes", "(Lcom/ogury/ad/OguryBannerAdSize;)V", "Landroid/view/ViewGroup;", "getContainer", "()Landroid/view/ViewGroup;", "Lcom/ogury/ad/internal/d1;", "getAdViewer", "()Lcom/ogury/ad/internal/d1;", "", "isLoaded", "()Z", "campaignId", "setCampaignId", "(Ljava/lang/String;)V", "creativeId", "setCreativeId", "dspCreativeId", "setDspCreativeId", "dspAwsRegion", "setDspAwsRegion", "Lcom/ogury/ad/OguryBannerAdViewListener;", "bannerAdListener", "setListener", "(Lcom/ogury/ad/OguryBannerAdViewListener;)V", "adMarkup", "load", "isBannerExpanded", "destroy", "()V", "Landroid/view/View;", "child", "index", "Landroid/view/ViewGroup$LayoutParams;", "params", "addView", "(Landroid/view/View;ILandroid/view/ViewGroup$LayoutParams;)V", "sdk-ads_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SuppressLint({"ViewConstructor"})
/* loaded from: classes8.dex */
public final class OguryBannerAdView extends FrameLayout implements o1, p8 {
    public final d1 a;
    public final c b;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public OguryBannerAdView(@NotNull Context context, @NotNull String adUnitId, @NotNull OguryBannerAdSize size) {
        this(context, adUnitId, size, null, null, 0, 56, null);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(adUnitId, "adUnitId");
        Intrinsics.checkNotNullParameter(size, "size");
    }

    /* renamed from: getAdViewer, reason: from getter */
    private final d1 getA() {
        return this.a;
    }

    private final ViewGroup getContainer() {
        ViewParent parent = getParent();
        if (parent instanceof ViewGroup) {
            return (ViewGroup) parent;
        }
        return null;
    }

    public static /* synthetic */ void load$default(OguryBannerAdView oguryBannerAdView, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = null;
        }
        oguryBannerAdView.load(str);
    }

    private final void setAdSizes(OguryBannerAdSize adSize) {
        IntegrationLogger.d(LogTag.CALLBACKS, SourceTag.ADS, "[Banner] setAdSize() called with adSize: " + adSize.name());
        this.b.g = new hh(ib.a(adSize.getWidth()), ib.a(adSize.getHeight()));
        this.b.f = new hh(adSize.getWidth(), adSize.getHeight());
    }

    @Override // android.view.ViewGroup
    public void addView(@Nullable View child, int index, @Nullable ViewGroup.LayoutParams params) {
        super.addView(child, index, params);
        this.a.a();
    }

    public final void destroy() {
        ViewGroup container = getContainer();
        if (container != null) {
            container.removeView(this);
        }
        removeAllViews();
        d1 d1Var = this.a;
        x0 x0Var = d1Var.g;
        if (x0Var != null) {
            x0Var.b();
        }
        o0 o0Var = d1Var.h;
        if (o0Var != null) {
            o0Var.a();
        }
        d1Var.g = null;
        d1Var.h = null;
        f1 f1Var = d1Var.e;
        f1Var.b = null;
        f1Var.a = null;
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent me) {
        DetectTouchUtils.viewOnTouch("io.presage", this, me);
        return super.dispatchTouchEvent(me);
    }

    public final boolean isBannerExpanded() {
        t6 t6Var;
        y7 y7Var;
        x0 x0Var = this.a.g;
        return (x0Var == null || (t6Var = x0Var.f) == null || (y7Var = t6Var.o) == null || !y7Var.l) ? false : true;
    }

    public final boolean isLoaded() {
        o0 o0Var = this.a.h;
        return o0Var != null && o0Var.o;
    }

    public final void load() {
        load$default(this, null, 1, null);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.a.a();
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        if (getChildCount() > 0) {
            this.a.a();
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        if (1 == 0) {
            setMeasuredDimension(0, 0);
        } else {
            super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        }
    }

    public final void setCampaignId(@NotNull String campaignId) {
        Intrinsics.checkNotNullParameter(campaignId, "campaignId");
        this.b.b = campaignId;
    }

    public final void setCreativeId(@NotNull String creativeId) {
        Intrinsics.checkNotNullParameter(creativeId, "creativeId");
        this.b.c = creativeId;
    }

    public final void setDspAwsRegion(@NotNull String dspAwsRegion) {
        Intrinsics.checkNotNullParameter(dspAwsRegion, "dspAwsRegion");
        this.b.e = dspAwsRegion;
    }

    public final void setDspCreativeId(@NotNull String dspCreativeId) {
        Intrinsics.checkNotNullParameter(dspCreativeId, "dspCreativeId");
        this.b.d = dspCreativeId;
    }

    public final void setListener(@Nullable OguryBannerAdViewListener bannerAdListener) {
        LogTag logTag = LogTag.CALLBACKS;
        SourceTag sourceTag = SourceTag.ADS;
        IntegrationLogger.d(logTag, sourceTag, "[Banner] setListener() called");
        d1 d1Var = this.a;
        OguryListenerAdapter.Companion.getClass();
        Intrinsics.checkNotNullParameter(this, "ad");
        OguryListenerAdapter oguryListenerAdapter = bannerAdListener != null ? new OguryListenerAdapter(this, bannerAdListener) : null;
        d1Var.getClass();
        LogTag logTag2 = LogTag.INTERNAL;
        IntegrationLogger.d(logTag2, sourceTag, "[Banner] Registering to ad listener");
        if (oguryListenerAdapter == null) {
            IntegrationLogger.d(logTag2, sourceTag, "[Banner] Ad listener is null");
        }
        f1 f1Var = d1Var.e;
        f1Var.a = oguryListenerAdapter;
        f1Var.b = new b1(d1Var);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public OguryBannerAdView(@NotNull Context context, @NotNull String adUnitId, @NotNull OguryBannerAdSize size, @Nullable OguryMediation oguryMediation) {
        this(context, adUnitId, size, oguryMediation, null, 0, 48, null);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(adUnitId, "adUnitId");
        Intrinsics.checkNotNullParameter(size, "size");
    }

    public final void load(@Nullable String adMarkup) {
        IntegrationLogger.d(LogTag.CALLBACKS, SourceTag.ADS, "[Banner] load() called");
        w wVar = x.c;
        this.a.a(this.b, adMarkup);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public OguryBannerAdView(@NotNull Context context, @NotNull String adUnitId, @NotNull OguryBannerAdSize size, @Nullable OguryMediation oguryMediation, @Nullable AttributeSet attributeSet) {
        this(context, adUnitId, size, oguryMediation, attributeSet, 0, 32, null);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(adUnitId, "adUnitId");
        Intrinsics.checkNotNullParameter(size, "size");
    }

    public /* synthetic */ OguryBannerAdView(Context context, String str, OguryBannerAdSize oguryBannerAdSize, OguryMediation oguryMediation, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, str, oguryBannerAdSize, (i2 & 8) != 0 ? null : oguryMediation, (i2 & 16) != 0 ? null : attributeSet, (i2 & 32) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OguryBannerAdView(@NotNull Context context, @NotNull String adUnitId, @NotNull OguryBannerAdSize size, @Nullable OguryMediation oguryMediation, @Nullable AttributeSet attributeSet, int i) {
        super(context.getApplicationContext(), attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(adUnitId, "adUnitId");
        Intrinsics.checkNotNullParameter(size, "size");
        Context applicationContext = context.getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(applicationContext, "getApplicationContext(...)");
        this.a = new d1(applicationContext, this, oguryMediation);
        TypedArray obtainStyledAttributes = getContext().getTheme().obtainStyledAttributes(attributeSet, R.styleable.BannerLayout, 0, 0);
        Intrinsics.checkNotNullExpressionValue(obtainStyledAttributes, "obtainStyledAttributes(...)");
        String string = obtainStyledAttributes.getString(R.styleable.BannerLayout_adUnit);
        this.b = new c(string != null ? string : adUnitId);
        int i2 = obtainStyledAttributes.getInt(R.styleable.BannerLayout_bannerAdSize, -1);
        OguryBannerAdSize oguryBannerAdSize = OguryBannerAdSize.SMALL_BANNER_320x50;
        if (i2 == oguryBannerAdSize.getHeight()) {
            setAdSizes(oguryBannerAdSize);
        } else {
            OguryBannerAdSize oguryBannerAdSize2 = OguryBannerAdSize.MREC_300x250;
            if (i2 == oguryBannerAdSize2.getHeight()) {
                setAdSizes(oguryBannerAdSize2);
            } else {
                setAdSizes(size);
            }
        }
        obtainStyledAttributes.recycle();
    }
}
