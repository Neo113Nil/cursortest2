package com.yandex.mobile.ads.banner;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import androidx.annotation.MainThread;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import com.safedk.android.utils.h;
import com.yandex.mobile.ads.common.AdInfo;
import com.yandex.mobile.ads.common.AdRequest;
import com.yandex.mobile.ads.common.AdTheme;
import com.yandex.mobile.ads.common.VideoController;
import java.util.Map;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import yads.ab1;
import yads.bq3;
import yads.d8;
import yads.e00;
import yads.f00;
import yads.hb1;
import yads.i00;
import yads.ip2;
import yads.kp2;
import yads.nt3;
import yads.sq3;
import yads.ua;
import yads.v3;
import yads.vw2;
import yads.yp3;

@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0011\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u001b\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0004\u0010\bB#\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u0004\u0010\u000bJ\u0015\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0013\u001a\u00020\u000e2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\u0013\u0010\u0014J\u0015\u0010\u0017\u001a\u00020\u000e2\u0006\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0019\u0010\u001aR\u0017\u0010 \u001a\u00020\u001b8\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0013\u0010\u0016\u001a\u0004\u0018\u00010\u00158F¢\u0006\u0006\u001a\u0004\b!\u0010\"R\u0011\u0010&\u001a\u00020#8F¢\u0006\u0006\u001a\u0004\b$\u0010%¨\u0006'"}, d2 = {"Lcom/yandex/mobile/ads/banner/BannerAdView;", "Lyads/hb1;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Landroid/util/AttributeSet;", "attrs", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Lcom/yandex/mobile/ads/common/AdRequest;", "adRequest", "", "loadAd", "(Lcom/yandex/mobile/ads/common/AdRequest;)V", "Lcom/yandex/mobile/ads/banner/BannerAdEventListener;", "bannerAdEventListener", "setBannerAdEventListener", "(Lcom/yandex/mobile/ads/banner/BannerAdEventListener;)V", "Lcom/yandex/mobile/ads/banner/BannerAdSize;", "adSize", "setAdSize", "(Lcom/yandex/mobile/ads/banner/BannerAdSize;)V", "destroy", "()V", "Lcom/yandex/mobile/ads/common/VideoController;", "n", "Lcom/yandex/mobile/ads/common/VideoController;", "getVideoController", "()Lcom/yandex/mobile/ads/common/VideoController;", "videoController", "getAdSize", "()Lcom/yandex/mobile/ads/banner/BannerAdSize;", "Lcom/yandex/mobile/ads/common/AdInfo;", "getAdInfo", "()Lcom/yandex/mobile/ads/common/AdInfo;", "adInfo", "mobileads_externalRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
@MainThread
/* loaded from: classes14.dex */
public final class BannerAdView extends hb1 {
    private final bq3 l;
    private final yp3 m;

    /* renamed from: n, reason: from kotlin metadata */
    private final VideoController videoController;

    public BannerAdView(@NotNull Context context) {
        this(context, null);
    }

    @Override // yads.hb1
    public void destroy() {
        super.destroy();
    }

    @Override // yads.hb1, yads.dj2, android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent me) {
        DetectTouchUtils.viewOnTouch(h.y, this, me);
        return super.dispatchTouchEvent(me);
    }

    @NotNull
    public final AdInfo getAdInfo() {
        return this.m.a(c());
    }

    @Nullable
    public final BannerAdSize getAdSize() {
        i00 b = b();
        if (b != null) {
            return new BannerAdSize(b.a);
        }
        return null;
    }

    @NotNull
    public final VideoController getVideoController() {
        return this.videoController;
    }

    public final void loadAd(@NotNull AdRequest adRequest) {
        if (adRequest.getAdUnitId().length() <= 0) {
            ab1.a("Failed to load ad with empty ad unit id", new Object[0]);
            return;
        }
        this.l.getClass();
        AdTheme preferredTheme = adRequest.getPreferredTheme();
        ip2 a = preferredTheme != null ? kp2.a(preferredTheme) : null;
        adRequest.getTargeting();
        String adUnitId = adRequest.getAdUnitId();
        String biddingData = adRequest.getBiddingData();
        Map<String, String> parameters = adRequest.getParameters();
        vw2 vw2Var = vw2.l;
        if (vw2Var == null) {
            synchronized (vw2.k) {
                vw2Var = vw2.l;
                if (vw2Var == null) {
                    vw2Var = new vw2();
                    vw2.l = vw2Var;
                }
            }
        }
        ua a2 = vw2Var.a();
        a(new d8(adUnitId, null, null, null, null, null, parameters, biddingData, a, false, null, a2 != null ? new f00(a2.a, a2.b, a2.c) : null));
    }

    public final void setAdSize(@NotNull BannerAdSize adSize) {
        a(a.a(adSize));
    }

    public final void setBannerAdEventListener(@Nullable BannerAdEventListener bannerAdEventListener) {
        a(bannerAdEventListener != null ? new sq3(bannerAdEventListener) : null);
    }

    public BannerAdView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public BannerAdView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i, new v3(e00.d), new nt3(context));
        this.l = new bq3();
        this.m = new yp3();
        this.videoController = new VideoController(d());
    }
}
