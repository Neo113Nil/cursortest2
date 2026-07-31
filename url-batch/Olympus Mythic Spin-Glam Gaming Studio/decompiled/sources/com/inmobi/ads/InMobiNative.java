package com.inmobi.ads;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.inmobi.ads.exceptions.SdkNotInitializedException;
import com.inmobi.ads.listeners.NativeAdEventListener;
import com.inmobi.ads.listeners.VideoEventListener;
import com.inmobi.media.AbstractC3861aa;
import com.inmobi.media.AbstractC4002fj;
import com.inmobi.media.AbstractC4030gj;
import com.inmobi.media.AbstractC4312rd;
import com.inmobi.media.AbstractC4361t9;
import com.inmobi.media.Bj;
import com.inmobi.media.C3868ah;
import com.inmobi.media.C4080ih;
import com.inmobi.media.C4261pe;
import com.inmobi.media.C4286qd;
import com.inmobi.media.C4493y9;
import com.inmobi.media.Cd;
import com.inmobi.media.Ge;
import com.inmobi.media.InterfaceC4466x9;
import com.inmobi.media.Nc;
import com.inmobi.media.Xb;
import com.inmobi.media.ads.nativeAd.InMobiNativeImage;
import com.inmobi.media.ads.nativeAd.InMobiNativeViewData;
import com.inmobi.media.ads.nativeAd.MediaView;
import java.util.Map;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

@Metadata(d1 = {"\u0000\u0094\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0012\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\b\f\u0018\u0000 K2\u00020\u0001:\u0002LKB\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u000b\u0010\fJ\u0015\u0010\u000e\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\r¢\u0006\u0004\b\u000e\u0010\u000fJ\u0015\u0010\u0012\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0016\u001a\u00020\n2\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\r\u0010\u0016\u001a\u00020\n¢\u0006\u0004\b\u0016\u0010\u0018J\u0015\u0010\u001b\u001a\u00020\n2\u0006\u0010\u001a\u001a\u00020\u0019¢\u0006\u0004\b\u001b\u0010\u001cJ\r\u0010\u001d\u001a\u00020\n¢\u0006\u0004\b\u001d\u0010\u0018J\r\u0010\u001e\u001a\u00020\n¢\u0006\u0004\b\u001e\u0010\u0018J\u000f\u0010 \u001a\u0004\u0018\u00010\u001f¢\u0006\u0004\b \u0010!J\u000f\u0010\"\u001a\u0004\u0018\u00010\u001f¢\u0006\u0004\b\"\u0010!J\u000f\u0010$\u001a\u0004\u0018\u00010#¢\u0006\u0004\b$\u0010%J\u000f\u0010&\u001a\u0004\u0018\u00010\u001f¢\u0006\u0004\b&\u0010!J\r\u0010(\u001a\u00020'¢\u0006\u0004\b(\u0010)J\u000f\u0010*\u001a\u0004\u0018\u00010\u001f¢\u0006\u0004\b*\u0010!J\u000f\u0010,\u001a\u0004\u0018\u00010+¢\u0006\u0004\b,\u0010-J\u000f\u0010/\u001a\u0004\u0018\u00010.¢\u0006\u0004\b/\u00100J\r\u00102\u001a\u000201¢\u0006\u0004\b2\u00103J\u0015\u00106\u001a\u00020\n2\u0006\u00105\u001a\u000204¢\u0006\u0004\b6\u00107J\u001d\u0010;\u001a\u00020\n2\u0006\u00109\u001a\u0002082\u0006\u0010:\u001a\u000204¢\u0006\u0004\b;\u0010<J\u000f\u0010>\u001a\u0004\u0018\u00010=¢\u0006\u0004\b>\u0010?J\r\u0010@\u001a\u000201¢\u0006\u0004\b@\u00103J#\u0010C\u001a\u00020\n2\u0014\u0010B\u001a\u0010\u0012\u0004\u0012\u00020\u001f\u0012\u0004\u0012\u00020\u001f\u0018\u00010A¢\u0006\u0004\bC\u0010DJ\u0017\u0010F\u001a\u00020\n2\b\u0010E\u001a\u0004\u0018\u00010\u001f¢\u0006\u0004\bF\u0010GJ\u0017\u0010I\u001a\u00020\n2\b\u0010H\u001a\u0004\u0018\u00010\u001f¢\u0006\u0004\bI\u0010GJ\r\u0010J\u001a\u00020\n¢\u0006\u0004\bJ\u0010\u0018¨\u0006M"}, d2 = {"Lcom/inmobi/ads/InMobiNative;", "", "Landroid/content/Context;", "context", "", "placementId", "Lcom/inmobi/ads/listeners/NativeAdEventListener;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "<init>", "(Landroid/content/Context;JLcom/inmobi/ads/listeners/NativeAdEventListener;)V", "", "setListener", "(Lcom/inmobi/ads/listeners/NativeAdEventListener;)V", "Lcom/inmobi/ads/listeners/VideoEventListener;", "setVideoEventListener", "(Lcom/inmobi/ads/listeners/VideoEventListener;)V", "Lcom/inmobi/ads/InMobiNative$LockScreenListener;", "lockScreenListener", "showOnLockScreen", "(Lcom/inmobi/ads/InMobiNative$LockScreenListener;)V", "", "response", "load", "([B)V", "()V", "Lcom/inmobi/media/ads/nativeAd/InMobiNativeViewData;", "inMobiNativeViewData", "registerViewForTracking", "(Lcom/inmobi/media/ads/nativeAd/InMobiNativeViewData;)V", "unTrackViews", "takeAction", "", "getAdTitle", "()Ljava/lang/String;", "getAdDescription", "Lcom/inmobi/media/ads/nativeAd/InMobiNativeImage;", "getAdIcon", "()Lcom/inmobi/media/ads/nativeAd/InMobiNativeImage;", "getCtaText", "", "getAdRating", "()F", "getAdvertiserName", "Lcom/inmobi/media/ads/nativeAd/MediaView;", "getMediaView", "()Lcom/inmobi/media/ads/nativeAd/MediaView;", "Landroid/view/View;", "getAdChoiceIcon", "()Landroid/view/View;", "", "isVideo", "()Z", "", "minBidToWin", "notifyWin", "(D)V", "", "lossReason", "auctionPrice", "notifyLoss", "(ID)V", "Lorg/json/JSONObject;", "getAdContent", "()Lorg/json/JSONObject;", "isReady", "", "extras", "setExtras", "(Ljava/util/Map;)V", "keywords", "setKeywords", "(Ljava/lang/String;)V", "contentUrl", "setContentUrl", "destroy", "Companion", "LockScreenListener", "media_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class InMobiNative {

    @NotNull
    public static final String APP_INSTALLS = "AppInstalls";

    @NotNull
    public static final String LIKES = "Likes";
    public final C4286qd a;
    public static final String b = "InMobiNative";

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006"}, d2 = {"Lcom/inmobi/ads/InMobiNative$LockScreenListener;", "", "onActionRequired", "", "nativeAd", "Lcom/inmobi/ads/InMobiNative;", "media_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public interface LockScreenListener {
        void onActionRequired(@NotNull InMobiNative nativeAd);
    }

    public InMobiNative(@NotNull Context context, long j, @NotNull NativeAdEventListener adEventListener) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(adEventListener, "listener");
        C4286qd c4286qd = new C4286qd(this, context, j);
        this.a = c4286qd;
        if (AbstractC4002fj.d()) {
            Intrinsics.checkNotNullParameter(adEventListener, "adEventListener");
            c4286qd.b.a = adEventListener;
        } else {
            String TAG = b;
            Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            throw new SdkNotInitializedException(TAG);
        }
    }

    public final void destroy() {
        C4286qd c4286qd = this.a;
        c4286qd.getClass();
        try {
            c4286qd.e = null;
            C4080ih c4080ih = c4286qd.b;
            c4080ih.a = null;
            c4080ih.b = null;
            c4080ih.c = null;
            c4286qd.c.c.clear();
            c4286qd.d.b.j();
        } catch (Exception e) {
            String str = AbstractC4312rd.a;
            Intrinsics.checkNotNullExpressionValue(str, "access$getTAG$p(...)");
            Xb.a((byte) 1, str, "Failed to destroy ad; SDK encountered an unexpected error");
            Lazy lazy = AbstractC3861aa.a;
            AbstractC4361t9.a(e);
        }
    }

    @Nullable
    public final View getAdChoiceIcon() {
        C4261pe c4261pe = this.a.e;
        if (c4261pe != null) {
            return c4261pe.j;
        }
        return null;
    }

    @Nullable
    public final JSONObject getAdContent() {
        C4261pe c4261pe = this.a.e;
        if (c4261pe != null) {
            return c4261pe.e;
        }
        return null;
    }

    @Nullable
    public final String getAdDescription() {
        C4261pe c4261pe = this.a.e;
        if (c4261pe != null) {
            return c4261pe.b;
        }
        return null;
    }

    @Nullable
    public final InMobiNativeImage getAdIcon() {
        C4261pe c4261pe = this.a.e;
        if (c4261pe != null) {
            return c4261pe.c;
        }
        return null;
    }

    public final float getAdRating() {
        Float f;
        C4261pe c4261pe = this.a.e;
        if (c4261pe == null || (f = c4261pe.g) == null) {
            return 0.0f;
        }
        return f.floatValue();
    }

    @Nullable
    public final String getAdTitle() {
        C4261pe c4261pe = this.a.e;
        if (c4261pe != null) {
            return c4261pe.a;
        }
        return null;
    }

    @Nullable
    public final String getAdvertiserName() {
        C4261pe c4261pe = this.a.e;
        if (c4261pe != null) {
            return c4261pe.f;
        }
        return null;
    }

    @Nullable
    public final String getCtaText() {
        C4261pe c4261pe = this.a.e;
        if (c4261pe != null) {
            return c4261pe.d;
        }
        return null;
    }

    @Nullable
    public final MediaView getMediaView() {
        C4261pe c4261pe = this.a.e;
        if (c4261pe != null) {
            return c4261pe.i;
        }
        return null;
    }

    public final boolean isReady() {
        return this.a.e != null;
    }

    public final boolean isVideo() {
        C4261pe c4261pe = this.a.e;
        if (c4261pe != null) {
            return c4261pe.h;
        }
        return false;
    }

    public final void load(@Nullable byte[] response) {
        C4286qd c4286qd = this.a;
        C3868ah c3868ah = c4286qd.a;
        Intrinsics.checkNotNullParameter("AB", "<set-?>");
        c3868ah.h = "AB";
        c4286qd.d.b.a(response);
    }

    public final void notifyLoss(int lossReason, double auctionPrice) {
        String a = this.a.d.b.a(lossReason, auctionPrice);
        if (a.length() > 0) {
            Xb.a((byte) 1, "InMobiNative", a);
        }
    }

    public final void notifyWin(double minBidToWin) {
        String a = this.a.d.b.a(minBidToWin);
        if (a.length() > 0) {
            Xb.a((byte) 1, "InMobiNative", a);
        }
    }

    public final void registerViewForTracking(@NotNull InMobiNativeViewData inMobiNativeViewData) {
        Intrinsics.checkNotNullParameter(inMobiNativeViewData, "inMobiNativeViewData");
        C4286qd c4286qd = this.a;
        c4286qd.getClass();
        Intrinsics.checkNotNullParameter(inMobiNativeViewData, "inMobiNativeViewData");
        c4286qd.d.a(inMobiNativeViewData);
    }

    public final void setContentUrl(@Nullable String contentUrl) {
        this.a.a.f = contentUrl;
    }

    public final void setExtras(@Nullable Map<String, String> extras) {
        C4286qd c4286qd = this.a;
        if (extras != null) {
            c4286qd.getClass();
            String str = extras.get("tp");
            if (!TextUtils.isEmpty(str)) {
                AbstractC4030gj.b = str;
            }
            String str2 = extras.get("tp-v");
            if (!TextUtils.isEmpty(str2)) {
                AbstractC4030gj.a = str2;
            }
        }
        c4286qd.a.d = extras;
    }

    public final void setKeywords(@Nullable String keywords) {
        this.a.a.c = keywords;
    }

    public final void setListener(@NotNull NativeAdEventListener listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        C4286qd c4286qd = this.a;
        c4286qd.getClass();
        Intrinsics.checkNotNullParameter(listener, "adEventListener");
        c4286qd.b.a = listener;
    }

    public final void setVideoEventListener(@NotNull VideoEventListener listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        C4286qd c4286qd = this.a;
        c4286qd.getClass();
        Intrinsics.checkNotNullParameter(listener, "videoEventListener");
        c4286qd.b.b = listener;
    }

    public final void showOnLockScreen(@NotNull LockScreenListener lockScreenListener) {
        Intrinsics.checkNotNullParameter(lockScreenListener, "lockScreenListener");
        C4286qd c4286qd = this.a;
        c4286qd.getClass();
        Intrinsics.checkNotNullParameter(lockScreenListener, "lockScreenListener");
        c4286qd.a.g = true;
        c4286qd.b.c = lockScreenListener;
    }

    public final void takeAction() {
        Nc nc = this.a.d.b;
        Bj bj = nc.c;
        Cd cd = bj instanceof Cd ? (Cd) bj : null;
        if (cd != null) {
            InterfaceC4466x9 l = cd.l();
            if (l != null) {
                ((C4493y9) l).a("AUM-NativeLoadedState", "takeAction - delegating to ad unit");
            }
            cd.h.a();
        }
        Bj bj2 = nc.c;
        Ge ge = bj2 instanceof Ge ? (Ge) bj2 : null;
        if (ge != null) {
            InterfaceC4466x9 l2 = ge.l();
            if (l2 != null) {
                ((C4493y9) l2).a("AUM-NativeRenderedState", "takeAction - delegating to ad unit");
            }
            ge.f.a();
        }
    }

    public final void unTrackViews() {
        this.a.d.b.d();
    }

    public final void load() {
        C4286qd c4286qd = this.a;
        C3868ah c3868ah = c4286qd.a;
        Intrinsics.checkNotNullParameter("NonAB", "<set-?>");
        c3868ah.h = "NonAB";
        c4286qd.d.b.c();
    }
}
