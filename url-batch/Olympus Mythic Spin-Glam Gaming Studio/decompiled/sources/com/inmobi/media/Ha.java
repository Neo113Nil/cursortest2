package com.inmobi.media;

import android.R;
import android.app.Activity;
import android.content.Context;
import android.media.AudioManager;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.webkit.JavascriptInterface;
import android.webkit.URLUtil;
import android.widget.FrameLayout;
import com.inmobi.media.videoPlayer.model.HtmlVideoPlayerRequest;
import com.inmobi.media.videoPlayer.model.VideoViewPosition;
import com.ironsource.C4538a2;
import com.ironsource.C4643f8;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.pubmatic.sdk.common.POBCommonConstants;
import com.safedk.android.analytics.brandsafety.BrandSafetyUtils;
import com.safedk.android.utils.Logger;
import com.vungle.ads.internal.protos.Sdk;
import io.bidmachine.iab.vast.tags.VastAttributes;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.NoSuchElementException;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import kotlin.Lazy;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref$IntRef;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlin.text.StringsKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.Deferred;
import kotlinx.coroutines.Job;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes12.dex */
public final class Ha {
    public final GestureDetectorOnGestureListenerC4476xi a;
    public final int b;
    public InterfaceC4466x9 c;

    public Ha(int i, GestureDetectorOnGestureListenerC4476xi mRenderView) {
        Intrinsics.checkNotNullParameter(mRenderView, "mRenderView");
        this.a = mRenderView;
        this.b = i;
    }

    public static final void b(Ha ha, String str, String str2) {
        C4048hb.a(ha.a.getLandingPageHandler(), "open", str, str2, (C4152lb) null, 24);
    }

    public static final void c(Ha ha, String str, String str2) {
        C4152lb c4152lb;
        try {
            C4178mb c4178mb = ha.a.getLandingPageHandler().f;
            if (c4178mb != null) {
                String a = AbstractC3914cb.a(str2);
                C4048hb landingPageHandler = ha.a.getLandingPageHandler();
                int i = landingPageHandler.i + 1;
                landingPageHandler.i = i;
                c4152lb = new C4152lb(c4178mb, a, i, SystemClock.elapsedRealtime());
            } else {
                c4152lb = null;
            }
            if (c4152lb != null) {
                c4152lb.f = "IN_NATIVE";
            }
            ha.a.getLandingPageHandler().d("openEmbedded", str, str2, c4152lb);
        } catch (Exception e) {
            ha.a.a(str, "Unexpected error", "openEmbedded");
            Xb.a((byte) 1, "InMobi", "Failed to open URL; SDK encountered unexpected error");
            InterfaceC4466x9 interfaceC4466x9 = ha.c;
            if (interfaceC4466x9 != null) {
                String str3 = Ia.a;
                Intrinsics.checkNotNullExpressionValue(str3, "access$getTAG$p(...)");
                ((C4493y9) interfaceC4466x9).b(str3, "SDK encountered unexpected error in handling openEmbedded() request from creative; " + e.getMessage());
            }
        }
    }

    public static final void d(Ha ha, String str, String str2) {
        C4048hb.a(ha.a.getLandingPageHandler(), "openWithoutTracker", str, str2, (C4152lb) null, 8);
    }

    public static final void e(Ha ha, String str, String str2) {
        try {
            GestureDetectorOnGestureListenerC4476xi gestureDetectorOnGestureListenerC4476xi = ha.a;
            int length = str2.length() - 1;
            int i = 0;
            boolean z = false;
            while (i <= length) {
                boolean z2 = Intrinsics.compare((int) str2.charAt(!z ? i : length), 32) <= 0;
                if (z) {
                    if (!z2) {
                        break;
                    } else {
                        length--;
                    }
                } else if (z2) {
                    i++;
                } else {
                    z = true;
                }
            }
            gestureDetectorOnGestureListenerC4476xi.b(str, str2.subSequence(i, length + 1).toString());
        } catch (Exception e) {
            ha.a.a(str, "Unexpected error", "playVideo");
            Xb.a((byte) 1, "InMobi", "Error playing video; SDK encountered an unexpected error");
            InterfaceC4466x9 interfaceC4466x9 = ha.c;
            if (interfaceC4466x9 != null) {
                String str3 = Ia.a;
                Intrinsics.checkNotNullExpressionValue(str3, "access$getTAG$p(...)");
                ((C4493y9) interfaceC4466x9).b(str3, "SDK encountered unexpected error in handling playVideo() request from creative; " + e.getMessage());
            }
        }
    }

    public static final void f(Ha ha, String str, String str2) {
        try {
            ha.a.getSiblingWebviewManager().b(ha.a.getRoute().b, str, str2);
        } catch (Exception e) {
            ha.a.a(C4643f8.j, Oi.a(str, Sdk.SDKError.Reason.AD_HTML_FAILED_TO_LOAD_VALUE));
            InterfaceC4466x9 interfaceC4466x9 = ha.c;
            if (interfaceC4466x9 != null) {
                String str3 = Ia.a;
                Intrinsics.checkNotNullExpressionValue(str3, "access$getTAG$p(...)");
                ((C4493y9) interfaceC4466x9).b(str3, "SDK encountered unexpected error in handling sendMessage() request from creative; " + e.getMessage());
            }
        }
    }

    public final EnumC4244on a(String str) {
        try {
            for (Object obj : EnumC4244on.c) {
                if (Intrinsics.areEqual(((EnumC4244on) obj).a, str)) {
                    return (EnumC4244on) obj;
                }
            }
            throw new NoSuchElementException("Collection contains no element matching the predicate.");
        } catch (Exception unused) {
            InterfaceC4466x9 interfaceC4466x9 = this.c;
            if (interfaceC4466x9 == null) {
                return null;
            }
            String str2 = Ia.a;
            Intrinsics.checkNotNullExpressionValue(str2, "access$getTAG$p(...)");
            ((C4493y9) interfaceC4466x9).a(str2, "No matching action found for - " + str);
            return null;
        }
    }

    @JavascriptInterface
    public final void asyncPing(@Nullable String str, @NotNull String url) {
        Intrinsics.checkNotNullParameter(url, "url");
        InterfaceC4466x9 interfaceC4466x9 = this.c;
        if (interfaceC4466x9 != null) {
            String str2 = Ia.a;
            Intrinsics.checkNotNullExpressionValue(str2, "access$getTAG$p(...)");
            ((C4493y9) interfaceC4466x9).a(str2, "asyncPing called: " + url);
        }
        if (!URLUtil.isValidUrl(url)) {
            this.a.a(str, "Invalid url", "asyncPing");
            return;
        }
        try {
            Deferred a = ((F9) Ve.c.getValue()).a(new Xe(url, null, null, null, null, false, 62));
            Function1 onCompleted = new Function1() { // from class: com.inmobi.media.Ha$$ExternalSyntheticLambda7
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return Ha.a(Ha.this, (InterfaceC3892bf) obj);
                }
            };
            Intrinsics.checkNotNullParameter(a, "<this>");
            Intrinsics.checkNotNullParameter(onCompleted, "onCompleted");
            BuildersKt__Builders_commonKt.launch$default(L9.c, null, null, new I3(a, onCompleted, null), 3, null);
        } catch (Exception e) {
            this.a.a(str, "Unexpected error", "asyncPing");
            InterfaceC4466x9 interfaceC4466x92 = this.c;
            if (interfaceC4466x92 != null) {
                String str3 = Ia.a;
                Intrinsics.checkNotNullExpressionValue(str3, "access$getTAG$p(...)");
                ((C4493y9) interfaceC4466x92).b(str3, "SDK encountered internal error in handling asyncPing() request from creative; " + e.getMessage());
            }
        }
    }

    @JavascriptInterface
    public final void cancelSaveContent(@Nullable String str, @NotNull String mediaId) {
        Intrinsics.checkNotNullParameter(mediaId, "mediaId");
        InterfaceC4466x9 interfaceC4466x9 = this.c;
        if (interfaceC4466x9 != null) {
            String str2 = Ia.a;
            Intrinsics.checkNotNullExpressionValue(str2, "access$getTAG$p(...)");
            ((C4493y9) interfaceC4466x9).a(str2, "cancelSaveContent called. mediaId:" + mediaId);
        }
    }

    @JavascriptInterface
    public final void close(@Nullable final String str) {
        InterfaceC4466x9 interfaceC4466x9 = this.c;
        if (interfaceC4466x9 != null) {
            String str2 = Ia.a;
            Intrinsics.checkNotNullExpressionValue(str2, "access$getTAG$p(...)");
            ((C4493y9) interfaceC4466x9).a(str2, "close called");
        }
        final GestureDetectorOnGestureListenerC4476xi a = a();
        if (a == null) {
            InterfaceC4466x9 interfaceC4466x92 = this.c;
            if (interfaceC4466x92 != null) {
                String str3 = Ia.a;
                Intrinsics.checkNotNullExpressionValue(str3, "access$getTAG$p(...)");
                ((C4493y9) interfaceC4466x92).a(str3, "webview not present cannot be closed");
                return;
            }
            return;
        }
        if (!a.P0) {
            ExecutorC4101jc executorC4101jc = (ExecutorC4101jc) AbstractC4437w6.e.getValue();
            Runnable runnable = new Runnable() { // from class: com.inmobi.media.Ha$$ExternalSyntheticLambda11
                @Override // java.lang.Runnable
                public final void run() {
                    Ha.a(GestureDetectorOnGestureListenerC4476xi.this, this, str);
                }
            };
            executorC4101jc.getClass();
            Intrinsics.checkNotNullParameter(runnable, "runnable");
            executorC4101jc.a.post(runnable);
            return;
        }
        InterfaceC4466x9 interfaceC4466x93 = this.c;
        if (interfaceC4466x93 != null) {
            String str4 = Ia.a;
            Intrinsics.checkNotNullExpressionValue(str4, "access$getTAG$p(...)");
            ((C4493y9) interfaceC4466x93).b(str4, "close called on unloaded ad");
        }
    }

    @JavascriptInterface
    public final void closeAll(@Nullable String str) {
        InterfaceC4466x9 interfaceC4466x9 = this.c;
        if (interfaceC4466x9 != null) {
            String str2 = Ia.a;
            Intrinsics.checkNotNullExpressionValue(str2, "access$getTAG$p(...)");
            ((C4493y9) interfaceC4466x9).a(str2, "closeAll is called");
        }
        GestureDetectorOnGestureListenerC4476xi a = a();
        if (a != null) {
            a.h();
            return;
        }
        InterfaceC4466x9 interfaceC4466x92 = this.c;
        if (interfaceC4466x92 != null) {
            String str3 = Ia.a;
            Intrinsics.checkNotNullExpressionValue(str3, "access$getTAG$p(...)");
            ((C4493y9) interfaceC4466x92).b(str3, "Found a null instance of ad render view!");
        }
    }

    @JavascriptInterface
    public final void closeCustomExpand(@Nullable String str) {
        InterfaceC4466x9 interfaceC4466x9 = this.c;
        if (interfaceC4466x9 != null) {
            String str2 = Ia.a;
            Intrinsics.checkNotNullExpressionValue(str2, "access$getTAG$p(...)");
            ((C4493y9) interfaceC4466x9).a(str2, "closeCustomExpand called.");
        }
        if (this.b == 1) {
            if (this.a != null) {
                new Handler(this.a.getContainerContext().getMainLooper()).post(new Runnable() { // from class: com.inmobi.media.Ha$$ExternalSyntheticLambda19
                    @Override // java.lang.Runnable
                    public final void run() {
                        Ha.a(Ha.this);
                    }
                });
                return;
            }
            InterfaceC4466x9 interfaceC4466x92 = this.c;
            if (interfaceC4466x92 != null) {
                String str3 = Ia.a;
                Intrinsics.checkNotNullExpressionValue(str3, "access$getTAG$p(...)");
                ((C4493y9) interfaceC4466x92).b(str3, "Found a null instance of render view!");
                return;
            }
            return;
        }
        InterfaceC4466x9 interfaceC4466x93 = this.c;
        if (interfaceC4466x93 != null) {
            String str4 = Ia.a;
            Intrinsics.checkNotNullExpressionValue(str4, "access$getTAG$p(...)");
            ((C4493y9) interfaceC4466x93).b(str4, "closeCustomExpand called in incorrect Ad type: " + this.b);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x005d, code lost:
    
        r11 = kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(com.inmobi.media.L9.f, null, null, new com.inmobi.media.Ba(r9, r11, null), 3, null);
     */
    /* JADX WARN: Removed duplicated region for block: B:15:? A[RETURN, SYNTHETIC] */
    @JavascriptInterface
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void createVideoPlayer(@Nullable String str, @Nullable String str2) {
        HtmlVideoPlayerRequest htmlVideoPlayerRequest;
        Object launch$default;
        InterfaceC4466x9 interfaceC4466x9 = this.c;
        if (interfaceC4466x9 != null) {
            String str3 = Ia.a;
            Intrinsics.checkNotNullExpressionValue(str3, "access$getTAG$p(...)");
            ((C4493y9) interfaceC4466x9).a(str3, "createVideoPlayer is called with config - " + str2);
        }
        EnumC4071i8[] enumC4071i8Arr = EnumC4071i8.a;
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("errorMessage", "Invalid config");
        jSONObject.put("jsCommand", "createVideoPlayer");
        jSONObject.put("params", POBCommonConstants.NULL_VALUE);
        if (str2 != null) {
            Object obj = null;
            try {
                JSONObject jsonObject = new JSONObject(str2);
                Intrinsics.checkNotNullParameter(jsonObject, "jsonObject");
                Intrinsics.checkNotNullParameter(HtmlVideoPlayerRequest.class, "type");
                htmlVideoPlayerRequest = (HtmlVideoPlayerRequest) HtmlVideoPlayerRequest.class.cast(AbstractC4494ya.a(jsonObject, HtmlVideoPlayerRequest.class, null, null));
            } catch (JSONException e) {
                EnumC4465x8 enumC4465x8 = EnumC4465x8.b;
                a(str, jSONObject);
                InterfaceC4466x9 interfaceC4466x92 = this.c;
                if (interfaceC4466x92 != null) {
                    String str4 = Ia.a;
                    Intrinsics.checkNotNullExpressionValue(str4, "access$getTAG$p(...)");
                    ((C4493y9) interfaceC4466x92).a(str4, "Error while creating config Json.", e);
                    obj = Unit.INSTANCE;
                }
            }
            if (htmlVideoPlayerRequest != null && launch$default != null) {
                obj = launch$default;
                if (obj != null) {
                    return;
                }
            }
            EnumC4465x8 enumC4465x82 = EnumC4465x8.b;
            a(str, jSONObject);
            obj = Unit.INSTANCE;
            if (obj != null) {
            }
        }
        EnumC4465x8 enumC4465x83 = EnumC4465x8.b;
        a(str, jSONObject);
        Unit unit = Unit.INSTANCE;
    }

    @JavascriptInterface
    public final void customExpand(@Nullable String str, @Nullable String str2, int i, float f, boolean z, boolean z2) {
        Logger.d("InMobi|SafeDK: Execution> Lcom/inmobi/media/Ha;->customExpand(Ljava/lang/String;Ljava/lang/String;IFZZ)V");
        safedk_Ha_customExpand_c7f7e4129a751671d8e2a9959898704b(str, str2, i, f, z, z2);
        BrandSafetyUtils.onMraidExpand(com.safedk.android.utils.h.i, str, str2, this.a, "imraid.customExpand");
    }

    @JavascriptInterface
    public final void customExpandInNative(@Nullable final String str, @NotNull final String url, final float f, final boolean z) {
        Intrinsics.checkNotNullParameter(url, "url");
        InterfaceC4466x9 interfaceC4466x9 = this.c;
        if (interfaceC4466x9 != null) {
            String str2 = Ia.a;
            Intrinsics.checkNotNullExpressionValue(str2, "access$getTAG$p(...)");
            ((C4493y9) interfaceC4466x9).a(str2, "customExpandInNative called");
        }
        GestureDetectorOnGestureListenerC4476xi gestureDetectorOnGestureListenerC4476xi = this.a;
        if (gestureDetectorOnGestureListenerC4476xi.P0) {
            InterfaceC4466x9 interfaceC4466x92 = this.c;
            if (interfaceC4466x92 != null) {
                String str3 = Ia.a;
                Intrinsics.checkNotNullExpressionValue(str3, "access$getTAG$p(...)");
                ((C4493y9) interfaceC4466x92).b(str3, "customExpandInNative called on unloaded ad");
                return;
            }
            return;
        }
        if (this.b == 1) {
            if (f < 0.0f || f > 1.0f) {
                gestureDetectorOnGestureListenerC4476xi.a(str, "Invalid screenPercentage", "customExpandInNative");
                return;
            } else {
                AbstractC4214nk.a(new Runnable() { // from class: com.inmobi.media.Ha$$ExternalSyntheticLambda3
                    @Override // java.lang.Runnable
                    public final void run() {
                        Ha.a(Ha.this, str, url, f, z);
                    }
                });
                return;
            }
        }
        InterfaceC4466x9 interfaceC4466x93 = this.c;
        if (interfaceC4466x93 != null) {
            String str4 = Ia.a;
            Intrinsics.checkNotNullExpressionValue(str4, "access$getTAG$p(...)");
            ((C4493y9) interfaceC4466x93).b(str4, "customExpandInNative called in incorrect Ad type: " + this.b);
        }
    }

    @JavascriptInterface
    public final void destroyVideoPlayer(@Nullable String str) {
        BuildersKt__Builders_commonKt.launch$default(L9.f, null, null, new Ca(this, null), 3, null);
    }

    @JavascriptInterface
    public final void destroyWebView(@Nullable String str, @Nullable final String str2) {
        InterfaceC4466x9 interfaceC4466x9 = this.c;
        if (interfaceC4466x9 != null) {
            String str3 = Ia.a;
            Intrinsics.checkNotNullExpressionValue(str3, "access$getTAG$p(...)");
            ((C4493y9) interfaceC4466x9).a(str3, "destroyWebView called");
        }
        GestureDetectorOnGestureListenerC4476xi a = a();
        if (a != null && a.P0) {
            InterfaceC4466x9 interfaceC4466x92 = this.c;
            if (interfaceC4466x92 != null) {
                String str4 = Ia.a;
                Intrinsics.checkNotNullExpressionValue(str4, "access$getTAG$p(...)");
                ((C4493y9) interfaceC4466x92).b(str4, "destroyWebView called on unloaded ad");
            }
            GestureDetectorOnGestureListenerC4476xi gestureDetectorOnGestureListenerC4476xi = this.a;
            if (str2 == null) {
                str2 = "";
            }
            Lazy lazy = Oi.a;
            JSONObject a2 = AbstractC4318rj.a(str2, "targetViewId", "id", str2);
            a2.put(IronSourceConstants.EVENTS_ERROR_CODE, 108);
            gestureDetectorOnGestureListenerC4476xi.a("destroyWebView", a2);
            return;
        }
        if (str2 != null && str2.length() != 0) {
            ExecutorC4101jc executorC4101jc = (ExecutorC4101jc) AbstractC4437w6.e.getValue();
            Runnable runnable = new Runnable() { // from class: com.inmobi.media.Ha$$ExternalSyntheticLambda5
                @Override // java.lang.Runnable
                public final void run() {
                    Ha.a(Ha.this, str2);
                }
            };
            executorC4101jc.getClass();
            Intrinsics.checkNotNullParameter(runnable, "runnable");
            executorC4101jc.a.post(runnable);
            return;
        }
        GestureDetectorOnGestureListenerC4476xi gestureDetectorOnGestureListenerC4476xi2 = this.a;
        if (str2 == null) {
            str2 = "";
        }
        Lazy lazy2 = Oi.a;
        JSONObject a3 = AbstractC4318rj.a(str2, "targetViewId", "id", str2);
        a3.put(IronSourceConstants.EVENTS_ERROR_CODE, 302);
        gestureDetectorOnGestureListenerC4476xi2.a("destroyWebView", a3);
    }

    @JavascriptInterface
    public final void disableBackButton(@Nullable String str, final boolean z) {
        InterfaceC4466x9 interfaceC4466x9 = this.c;
        if (interfaceC4466x9 != null) {
            String str2 = Ia.a;
            Intrinsics.checkNotNullExpressionValue(str2, "access$getTAG$p(...)");
            ((C4493y9) interfaceC4466x9).a(str2, "disableBackButton called");
        }
        this.a.getWebViewFactory().a(new Function1() { // from class: com.inmobi.media.Ha$$ExternalSyntheticLambda15
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Ha.a(z, (GestureDetectorOnGestureListenerC4476xi) obj);
            }
        });
    }

    @JavascriptInterface
    public final void disableCloseRegion(@Nullable final String str, final boolean z) {
        InterfaceC4466x9 interfaceC4466x9 = this.c;
        if (interfaceC4466x9 != null) {
            String str2 = Ia.a;
            Intrinsics.checkNotNullExpressionValue(str2, "access$getTAG$p(...)");
            ((C4493y9) interfaceC4466x9).a(str2, "disableCloseRegion called");
        }
        ExecutorC4101jc executorC4101jc = (ExecutorC4101jc) AbstractC4437w6.e.getValue();
        Runnable runnable = new Runnable() { // from class: com.inmobi.media.Ha$$ExternalSyntheticLambda17
            @Override // java.lang.Runnable
            public final void run() {
                Ha.a(Ha.this, z, str);
            }
        };
        executorC4101jc.getClass();
        Intrinsics.checkNotNullParameter(runnable, "runnable");
        executorC4101jc.a.post(runnable);
    }

    @JavascriptInterface
    public final void enableNativeGestures(@Nullable String str, boolean z) {
        InterfaceC4466x9 interfaceC4466x9 = this.c;
        if (interfaceC4466x9 != null) {
            String str2 = Ia.a;
            Intrinsics.checkNotNullExpressionValue(str2, "access$getTAG$p(...)");
            ((C4493y9) interfaceC4466x9).a(str2, "enableNativeGestures called with enabled: " + z);
        }
        this.a.setEnableNativeGestures(z);
    }

    @JavascriptInterface
    public final void enableTouchBeginCallback(@Nullable String str, boolean z) {
        InterfaceC4466x9 interfaceC4466x9 = this.c;
        if (interfaceC4466x9 != null) {
            String str2 = Ia.a;
            Intrinsics.checkNotNullExpressionValue(str2, "access$getTAG$p(...)");
            ((C4493y9) interfaceC4466x9).a(str2, "enableTouchBeginCallback called with enabled: " + z);
        }
        this.a.setEnableTouchBeginCallback(z);
    }

    @JavascriptInterface
    public final void enableTouchEndCallback(@Nullable String str, boolean z) {
        InterfaceC4466x9 interfaceC4466x9 = this.c;
        if (interfaceC4466x9 != null) {
            String str2 = Ia.a;
            Intrinsics.checkNotNullExpressionValue(str2, "access$getTAG$p(...)");
            ((C4493y9) interfaceC4466x9).a(str2, "enableTouchEndCallback called with enabled: " + z);
        }
        this.a.setEnableTouchEndCallback(z);
    }

    @JavascriptInterface
    public final void executeVideoPlayerActions(@Nullable String str, @NotNull String action, @Nullable String str2) {
        Job launch$default;
        Intrinsics.checkNotNullParameter(action, "action");
        InterfaceC4466x9 interfaceC4466x9 = this.c;
        if (interfaceC4466x9 != null) {
            String str3 = Ia.a;
            Intrinsics.checkNotNullExpressionValue(str3, "access$getTAG$p(...)");
            ((C4493y9) interfaceC4466x9).a(str3, "executeVideoPlayerActions is called with action - " + action + ", " + str2);
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("videoCommand", action);
        jSONObject.put("config", str2);
        EnumC4071i8[] enumC4071i8Arr = EnumC4071i8.a;
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("errorMessage", "Invalid action");
        jSONObject2.put("jsCommand", "executeVideoPlayerActions");
        jSONObject2.put("params", String.valueOf(jSONObject));
        try {
            EnumC4244on a = a(action);
            if (a != null) {
                launch$default = BuildersKt__Builders_commonKt.launch$default(L9.f, null, null, new Da(this, a, jSONObject, null), 3, null);
                if (launch$default != null) {
                    return;
                }
            }
            EnumC4465x8 enumC4465x8 = EnumC4465x8.b;
            a(str, jSONObject2);
            Unit unit = Unit.INSTANCE;
        } catch (JSONException e) {
            EnumC4465x8 enumC4465x82 = EnumC4465x8.b;
            a(str, jSONObject2);
            InterfaceC4466x9 interfaceC4466x92 = this.c;
            if (interfaceC4466x92 != null) {
                String str4 = Ia.a;
                Intrinsics.checkNotNullExpressionValue(str4, "access$getTAG$p(...)");
                ((C4493y9) interfaceC4466x92).a(str4, "Error while creating action Json.", e);
            }
        }
    }

    @JavascriptInterface
    public final void fireAdFailed(@Nullable String str) {
        fireAdFailed(str, "");
    }

    @JavascriptInterface
    public final void fireAdReady(@Nullable String str) {
        try {
            InterfaceC4466x9 interfaceC4466x9 = this.c;
            if (interfaceC4466x9 != null) {
                String str2 = Ia.a;
                Intrinsics.checkNotNullExpressionValue(str2, "access$getTAG$p(...)");
                ((C4493y9) interfaceC4466x9).a(str2, "fireAdReady called.");
            }
            this.a.q();
        } catch (Exception e) {
            this.a.a(str, "Unexpected error", "fireAdReady");
            InterfaceC4466x9 interfaceC4466x92 = this.c;
            if (interfaceC4466x92 != null) {
                String str3 = Ia.a;
                Intrinsics.checkNotNullExpressionValue(str3, "access$getTAG$p(...)");
                ((C4493y9) interfaceC4466x92).b(str3, "SDK encountered unexpected error in handling fireAdReady() signal from creative; " + e.getMessage());
            }
        }
    }

    @JavascriptInterface
    public final void fireComplete(@Nullable String str) {
        InterfaceC4466x9 interfaceC4466x9 = this.c;
        if (interfaceC4466x9 != null) {
            String str2 = Ia.a;
            Intrinsics.checkNotNullExpressionValue(str2, "access$getTAG$p(...)");
            ((C4493y9) interfaceC4466x9).a(str2, "fireComplete is called");
        }
        GestureDetectorOnGestureListenerC4476xi gestureDetectorOnGestureListenerC4476xi = this.a;
        if (gestureDetectorOnGestureListenerC4476xi != null) {
            gestureDetectorOnGestureListenerC4476xi.i();
            return;
        }
        InterfaceC4466x9 interfaceC4466x92 = this.c;
        if (interfaceC4466x92 != null) {
            String str3 = Ia.a;
            Intrinsics.checkNotNullExpressionValue(str3, "access$getTAG$p(...)");
            ((C4493y9) interfaceC4466x92).b(str3, "Found a null instance of render view!");
        }
    }

    @JavascriptInterface
    public final void fireSkip(@Nullable String str) {
        InterfaceC4466x9 interfaceC4466x9;
        InterfaceC4466x9 interfaceC4466x92 = this.c;
        if (interfaceC4466x92 != null) {
            String str2 = Ia.a;
            Intrinsics.checkNotNullExpressionValue(str2, "access$getTAG$p(...)");
            ((C4493y9) interfaceC4466x92).a(str2, "fireSkip is called");
        }
        if (this.a == null && (interfaceC4466x9 = this.c) != null) {
            String str3 = Ia.a;
            Intrinsics.checkNotNullExpressionValue(str3, "access$getTAG$p(...)");
            ((C4493y9) interfaceC4466x9).b(str3, "Found a null instance of render view!");
        }
        this.a.P();
    }

    @JavascriptInterface
    @Nullable
    public final String getAdContext(@Nullable String str) {
        InterfaceC4466x9 interfaceC4466x9 = this.c;
        if (interfaceC4466x9 != null) {
            String str2 = Ia.a;
            Intrinsics.checkNotNullExpressionValue(str2, "access$getTAG$p(...)");
            ((C4493y9) interfaceC4466x9).a(str2, "getAdContext is called");
        }
        GestureDetectorOnGestureListenerC4476xi a = a();
        if (a != null) {
            InterfaceC4457x0 adPodHandler = a.getAdPodHandler();
            if (adPodHandler != null) {
                return ((AbstractC4168m1) adPodHandler).v();
            }
            return null;
        }
        InterfaceC4466x9 interfaceC4466x92 = this.c;
        if (interfaceC4466x92 != null) {
            String str3 = Ia.a;
            Intrinsics.checkNotNullExpressionValue(str3, "access$getTAG$p(...)");
            ((C4493y9) interfaceC4466x92).b(str3, "Found a null instance of ad render view!");
        }
        return null;
    }

    @JavascriptInterface
    public final void getBlob(@Nullable String str, @Nullable String str2) {
        J2 j2;
        InterfaceC4466x9 interfaceC4466x9 = this.c;
        if (interfaceC4466x9 != null) {
            String str3 = Ia.a;
            Intrinsics.checkNotNullExpressionValue(str3, "access$getTAG$p(...)");
            ((C4493y9) interfaceC4466x9).a(str3, "getBlob is called");
        }
        GestureDetectorOnGestureListenerC4476xi gestureDetectorOnGestureListenerC4476xi = this.a;
        if (gestureDetectorOnGestureListenerC4476xi == null) {
            InterfaceC4466x9 interfaceC4466x92 = this.c;
            if (interfaceC4466x92 != null) {
                String str4 = Ia.a;
                Intrinsics.checkNotNullExpressionValue(str4, "access$getTAG$p(...)");
                ((C4493y9) interfaceC4466x92).b(str4, "Found a null instance of render view!");
                return;
            }
            return;
        }
        InterfaceC4466x9 interfaceC4466x93 = gestureDetectorOnGestureListenerC4476xi.i;
        if (interfaceC4466x93 != null) {
            String TAG = GestureDetectorOnGestureListenerC4476xi.i1;
            Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            ((C4493y9) interfaceC4466x93).a(TAG, "getBlob");
        }
        if (str == null || str2 == null || (j2 = gestureDetectorOnGestureListenerC4476xi.k0) == null) {
            return;
        }
        ((AbstractC4168m1) j2).a(str, str2, gestureDetectorOnGestureListenerC4476xi, gestureDetectorOnGestureListenerC4476xi.getImpressionId());
    }

    @JavascriptInterface
    @NotNull
    public final String getCurrentPosition(@Nullable String str) {
        GestureDetectorOnGestureListenerC4476xi gestureDetectorOnGestureListenerC4476xi;
        InterfaceC4466x9 interfaceC4466x9 = this.c;
        if (interfaceC4466x9 != null) {
            String str2 = Ia.a;
            Intrinsics.checkNotNullExpressionValue(str2, "access$getTAG$p(...)");
            ((C4493y9) interfaceC4466x9).a(str2, "getCurrentPosition called");
        }
        GestureDetectorOnGestureListenerC4476xi gestureDetectorOnGestureListenerC4476xi2 = this.a;
        if (gestureDetectorOnGestureListenerC4476xi2 == null) {
            InterfaceC4466x9 interfaceC4466x92 = this.c;
            if (interfaceC4466x92 == null) {
                return "";
            }
            String str3 = Ia.a;
            Intrinsics.checkNotNullExpressionValue(str3, "access$getTAG$p(...)");
            ((C4493y9) interfaceC4466x92).b(str3, "Found a null instance of render view!");
            return "";
        }
        synchronized (gestureDetectorOnGestureListenerC4476xi2.getCurrentPositionMonitor()) {
            this.a.G = true;
            new Handler(this.a.getContainerContext().getMainLooper()).post(new Runnable() { // from class: com.inmobi.media.Ha$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    Ha.b(Ha.this);
                }
            });
            while (true) {
                gestureDetectorOnGestureListenerC4476xi = this.a;
                if (gestureDetectorOnGestureListenerC4476xi.G) {
                    try {
                        gestureDetectorOnGestureListenerC4476xi.getCurrentPositionMonitor().wait();
                    } catch (InterruptedException unused) {
                    }
                } else {
                    Unit unit = Unit.INSTANCE;
                }
            }
        }
        return gestureDetectorOnGestureListenerC4476xi.getCurrentPosition();
    }

    @JavascriptInterface
    public final int getCurrentRenderingIndex(@Nullable String str) {
        InterfaceC4466x9 interfaceC4466x9 = this.c;
        if (interfaceC4466x9 != null) {
            String str2 = Ia.a;
            Intrinsics.checkNotNullExpressionValue(str2, "access$getTAG$p(...)");
            ((C4493y9) interfaceC4466x9).a(str2, "getCurrentRenderingIndex is called");
        }
        GestureDetectorOnGestureListenerC4476xi a = a();
        if (a != null) {
            return a.getCurrentRenderingPodAdIndex();
        }
        InterfaceC4466x9 interfaceC4466x92 = this.c;
        if (interfaceC4466x92 == null) {
            return 0;
        }
        String str3 = Ia.a;
        Intrinsics.checkNotNullExpressionValue(str3, "access$getTAG$p(...)");
        ((C4493y9) interfaceC4466x92).b(str3, "Found a null instance of ad render view!");
        return 0;
    }

    @JavascriptInterface
    @NotNull
    public final String getDefaultPosition(@Nullable String str) {
        GestureDetectorOnGestureListenerC4476xi gestureDetectorOnGestureListenerC4476xi;
        InterfaceC4466x9 interfaceC4466x9 = this.c;
        if (interfaceC4466x9 != null) {
            String str2 = Ia.a;
            Intrinsics.checkNotNullExpressionValue(str2, "access$getTAG$p(...)");
            ((C4493y9) interfaceC4466x9).a(str2, "getDefaultPosition called");
        }
        synchronized (this.a.getDefaultPositionMonitor()) {
            this.a.F = true;
            new Handler(this.a.getContainerContext().getMainLooper()).post(new Runnable() { // from class: com.inmobi.media.Ha$$ExternalSyntheticLambda14
                @Override // java.lang.Runnable
                public final void run() {
                    Ha.c(Ha.this);
                }
            });
            while (true) {
                gestureDetectorOnGestureListenerC4476xi = this.a;
                if (gestureDetectorOnGestureListenerC4476xi.F) {
                    try {
                        gestureDetectorOnGestureListenerC4476xi.getDefaultPositionMonitor().wait();
                    } catch (InterruptedException unused) {
                    }
                } else {
                    Unit unit = Unit.INSTANCE;
                }
            }
        }
        return gestureDetectorOnGestureListenerC4476xi.getDefaultPosition();
    }

    @JavascriptInterface
    public final int getDeviceVolume(@Nullable String str) {
        InterfaceC4466x9 interfaceC4466x9 = this.c;
        if (interfaceC4466x9 != null) {
            String str2 = Ia.a;
            Intrinsics.checkNotNullExpressionValue(str2, "access$getTAG$p(...)");
            ((C4493y9) interfaceC4466x9).a(str2, "getDeviceVolume called");
        }
        GestureDetectorOnGestureListenerC4476xi gestureDetectorOnGestureListenerC4476xi = this.a;
        if (gestureDetectorOnGestureListenerC4476xi == null) {
            InterfaceC4466x9 interfaceC4466x92 = this.c;
            if (interfaceC4466x92 != null) {
                String str3 = Ia.a;
                Intrinsics.checkNotNullExpressionValue(str3, "access$getTAG$p(...)");
                ((C4493y9) interfaceC4466x92).b(str3, "Found a null instance of render view!");
            }
            return -1;
        }
        try {
            Jc mediaProcessor = gestureDetectorOnGestureListenerC4476xi.getMediaProcessor();
            if (mediaProcessor != null) {
                return mediaProcessor.a();
            }
        } catch (Exception e) {
            this.a.a(str, "Unexpected error", "getDeviceVolume");
            InterfaceC4466x9 interfaceC4466x93 = this.c;
            if (interfaceC4466x93 != null) {
                String str4 = Ia.a;
                Intrinsics.checkNotNullExpressionValue(str4, "access$getTAG$p(...)");
                ((C4493y9) interfaceC4466x93).b(str4, "SDK encountered unexpected error in handling getDeviceVolume() request from creative; " + e.getMessage());
            }
        }
        return -1;
    }

    @JavascriptInterface
    public final int getMaxDeviceVolume(@Nullable String str) {
        InterfaceC4466x9 interfaceC4466x9 = this.c;
        if (interfaceC4466x9 != null) {
            String str2 = Ia.a;
            Intrinsics.checkNotNullExpressionValue(str2, "access$getTAG$p(...)");
            ((C4493y9) interfaceC4466x9).a(str2, "getMaxDeviceVolume called");
        }
        try {
            F5 f5 = F5.a;
            f5.getClass();
            return ((Number) F5.f.getValue(f5, F5.b[0])).intValue();
        } catch (Exception e) {
            this.a.a(str, "Unexpected error", "getMaxDeviceVolume");
            InterfaceC4466x9 interfaceC4466x92 = this.c;
            if (interfaceC4466x92 != null) {
                String str3 = Ia.a;
                Intrinsics.checkNotNullExpressionValue(str3, "access$getTAG$p(...)");
                ((C4493y9) interfaceC4466x92).b(str3, "SDK encountered unexpected error in handling getMaxDeviceVolume() request from creative; " + e.getMessage());
            }
            return 0;
        }
    }

    @JavascriptInterface
    @NotNull
    public final String getMaxSize(@Nullable String str) {
        InterfaceC4466x9 interfaceC4466x9 = this.c;
        if (interfaceC4466x9 != null) {
            String str2 = Ia.a;
            Intrinsics.checkNotNullExpressionValue(str2, "access$getTAG$p(...)");
            ((C4493y9) interfaceC4466x9).a(str2, "getMaxSize called");
        }
        JSONObject jSONObject = new JSONObject();
        try {
            Activity fullScreenActivity = this.a.getFullScreenActivity();
            if (fullScreenActivity == null) {
                Context containerContext = this.a.getContainerContext();
                if ((containerContext instanceof Activity ? (Activity) containerContext : null) == null) {
                    return getScreenSize(str);
                }
                Context containerContext2 = this.a.getContainerContext();
                Intrinsics.checkNotNull(containerContext2, "null cannot be cast to non-null type android.app.Activity");
                fullScreenActivity = (Activity) containerContext2;
            }
            FrameLayout frameLayout = (FrameLayout) fullScreenActivity.findViewById(R.id.content);
            Ref$IntRef ref$IntRef = new Ref$IntRef();
            ref$IntRef.element = N3.b(frameLayout.getWidth() / R5.b());
            Ref$IntRef ref$IntRef2 = new Ref$IntRef();
            ref$IntRef2.element = N3.b(frameLayout.getHeight() / R5.b());
            if (this.a.getFullScreenActivity() != null && (ref$IntRef.element == 0 || ref$IntRef2.element == 0)) {
                Intrinsics.checkNotNull(frameLayout);
                Aa aa = new Aa(frameLayout, this.c);
                frameLayout.getViewTreeObserver().addOnGlobalLayoutListener(aa);
                BuildersKt__Builders_commonKt.launch$default(L9.c, null, null, new Ea(aa, ref$IntRef, ref$IntRef2, null), 3, null);
            }
            try {
                jSONObject.put("width", ref$IntRef.element);
                jSONObject.put("height", ref$IntRef2.element);
            } catch (JSONException e) {
                InterfaceC4466x9 interfaceC4466x92 = this.c;
                if (interfaceC4466x92 != null) {
                    String str3 = Ia.a;
                    Intrinsics.checkNotNullExpressionValue(str3, "access$getTAG$p(...)");
                    ((C4493y9) interfaceC4466x92).a(str3, "Error while creating max size Json.", e);
                }
            }
            InterfaceC4466x9 interfaceC4466x93 = this.c;
            if (interfaceC4466x93 != null) {
                String str4 = Ia.a;
                Intrinsics.checkNotNullExpressionValue(str4, "access$getTAG$p(...)");
                ((C4493y9) interfaceC4466x93).a(str4, "getMaxSize called:" + jSONObject);
            }
        } catch (Exception e2) {
            this.a.a(str, "Unexpected error", "getMaxSize");
            InterfaceC4466x9 interfaceC4466x94 = this.c;
            if (interfaceC4466x94 != null) {
                String str5 = Ia.a;
                Intrinsics.checkNotNullExpressionValue(str5, "access$getTAG$p(...)");
                ((C4493y9) interfaceC4466x94).b(str5, "SDK encountered unexpected error in handling getMaxSize() request from creative; " + e2.getMessage());
            }
        }
        String jSONObject2 = jSONObject.toString();
        Intrinsics.checkNotNullExpressionValue(jSONObject2, "toString(...)");
        return jSONObject2;
    }

    @JavascriptInterface
    @NotNull
    public final String getOrientation(@Nullable String str) {
        InterfaceC4466x9 interfaceC4466x9 = this.c;
        if (interfaceC4466x9 != null) {
            String str2 = Ia.a;
            Intrinsics.checkNotNullExpressionValue(str2, "access$getTAG$p(...)");
            ((C4493y9) interfaceC4466x9).a(str2, "getOrientation called");
        }
        byte g = R5.g();
        return g == 1 ? "0" : g == 3 ? "90" : g == 2 ? "180" : g == 4 ? "270" : C4538a2.f;
    }

    @JavascriptInterface
    @NotNull
    public final String getOrientationProperties(@Nullable String str) {
        GestureDetectorOnGestureListenerC4476xi a = a();
        if (a == null) {
            a = this.a;
        }
        String str2 = a.getOrientationProperties().d;
        InterfaceC4466x9 interfaceC4466x9 = this.c;
        if (interfaceC4466x9 != null) {
            String str3 = Ia.a;
            Intrinsics.checkNotNullExpressionValue(str3, "access$getTAG$p(...)");
            ((C4493y9) interfaceC4466x9).a(str3, "getOrientationProperties called: " + str2);
        }
        Intrinsics.checkNotNull(str2);
        return str2;
    }

    @JavascriptInterface
    @NotNull
    public final String getPlacementType(@Nullable String str) {
        InterfaceC4466x9 interfaceC4466x9 = this.c;
        if (interfaceC4466x9 != null) {
            String str2 = Ia.a;
            Intrinsics.checkNotNullExpressionValue(str2, "access$getTAG$p(...)");
            ((C4493y9) interfaceC4466x9).a(str2, "getPlacementType called");
        }
        return 1 == this.b ? "interstitial" : POBCommonConstants.BANNER_PLACEMENT_TYPE;
    }

    @JavascriptInterface
    @NotNull
    public final String getPlatform(@Nullable String str) {
        InterfaceC4466x9 interfaceC4466x9 = this.c;
        if (interfaceC4466x9 == null) {
            return "android";
        }
        String str2 = Ia.a;
        Intrinsics.checkNotNullExpressionValue(str2, "access$getTAG$p(...)");
        ((C4493y9) interfaceC4466x9).a(str2, "getPlatform. Platform:android");
        return "android";
    }

    @JavascriptInterface
    @NotNull
    public final String getPlatformVersion(@Nullable String str) {
        String valueOf = String.valueOf(Build.VERSION.SDK_INT);
        InterfaceC4466x9 interfaceC4466x9 = this.c;
        if (interfaceC4466x9 != null) {
            String str2 = Ia.a;
            Intrinsics.checkNotNullExpressionValue(str2, "access$getTAG$p(...)");
            ((C4493y9) interfaceC4466x9).a(str2, "getPlatformVersion. Version:" + valueOf);
        }
        return valueOf;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @JavascriptInterface
    @Nullable
    public final String getPlaybackState(@Nullable String str) {
        InterfaceC4466x9 interfaceC4466x9;
        CountDownLatch countDownLatch = new CountDownLatch(1);
        Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        BuildersKt__Builders_commonKt.launch$default(L9.f, null, null, new Fa(this, ref$ObjectRef, countDownLatch, null), 3, null);
        if (!countDownLatch.await(1L, TimeUnit.SECONDS) && (interfaceC4466x9 = this.c) != null) {
            String str2 = Ia.a;
            Intrinsics.checkNotNullExpressionValue(str2, "access$getTAG$p(...)");
            ((C4493y9) interfaceC4466x9).b(str2, "getPlaybackState timed out waiting on main thread");
        }
        JSONObject jSONObject = (JSONObject) ref$ObjectRef.element;
        if (jSONObject != null) {
            return jSONObject.toString();
        }
        return null;
    }

    @JavascriptInterface
    @NotNull
    public final String getRenderableAdIndexes(@Nullable String str) {
        InterfaceC4466x9 interfaceC4466x9 = this.c;
        if (interfaceC4466x9 != null) {
            String str2 = Ia.a;
            Intrinsics.checkNotNullExpressionValue(str2, "access$getTAG$p(...)");
            ((C4493y9) interfaceC4466x9).a(str2, "getRenderableAdIndexes is called");
        }
        GestureDetectorOnGestureListenerC4476xi a = a();
        if (a == null) {
            InterfaceC4466x9 interfaceC4466x92 = this.c;
            if (interfaceC4466x92 != null) {
                String str3 = Ia.a;
                Intrinsics.checkNotNullExpressionValue(str3, "access$getTAG$p(...)");
                ((C4493y9) interfaceC4466x92).b(str3, "Found a null instance of ad render view!");
            }
            String jSONArray = new JSONArray().toString();
            Intrinsics.checkNotNullExpressionValue(jSONArray, "toString(...)");
            return jSONArray;
        }
        JSONArray renderableAdIndexes = a.getRenderableAdIndexes();
        InterfaceC4466x9 interfaceC4466x93 = this.c;
        if (interfaceC4466x93 != null) {
            String str4 = Ia.a;
            Intrinsics.checkNotNullExpressionValue(str4, "access$getTAG$p(...)");
            ((C4493y9) interfaceC4466x93).a(str4, "renderableAdIndexes called:" + renderableAdIndexes);
        }
        String jSONArray2 = renderableAdIndexes.toString();
        Intrinsics.checkNotNullExpressionValue(jSONArray2, "toString(...)");
        return jSONArray2;
    }

    @JavascriptInterface
    @Nullable
    public final String getSafeArea(@Nullable String str) {
        JSONObject safeArea = this.a.getSafeArea();
        InterfaceC4466x9 interfaceC4466x9 = this.c;
        if (interfaceC4466x9 != null) {
            String str2 = Ia.a;
            Intrinsics.checkNotNullExpressionValue(str2, "access$getTAG$p(...)");
            ((C4493y9) interfaceC4466x9).a(str2, "getSafeArea called:" + safeArea);
        }
        if (safeArea != null) {
            return safeArea.toString();
        }
        return null;
    }

    @JavascriptInterface
    @NotNull
    public final String getScreenSize(@Nullable String str) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("width", R5.h().a);
            jSONObject.put("height", R5.h().b);
            InterfaceC4466x9 interfaceC4466x9 = this.c;
            if (interfaceC4466x9 != null) {
                String str2 = Ia.a;
                Intrinsics.checkNotNullExpressionValue(str2, "access$getTAG$p(...)");
                ((C4493y9) interfaceC4466x9).c(str2, "Message:Width x Height : " + R5.h().a + VastAttributes.HORIZONTAL_POSITION + R5.h().b);
            }
        } catch (JSONException unused) {
        } catch (Exception e) {
            this.a.a(str, "Unexpected error", "getScreenSize");
            InterfaceC4466x9 interfaceC4466x92 = this.c;
            if (interfaceC4466x92 != null) {
                String str3 = Ia.a;
                Intrinsics.checkNotNullExpressionValue(str3, "access$getTAG$p(...)");
                ((C4493y9) interfaceC4466x92).b(str3, "SDK encountered unexpected error while getting screen dimensions; " + e.getMessage());
            }
        }
        String jSONObject2 = jSONObject.toString();
        Intrinsics.checkNotNullExpressionValue(jSONObject2, "toString(...)");
        InterfaceC4466x9 interfaceC4466x93 = this.c;
        if (interfaceC4466x93 != null) {
            String str4 = Ia.a;
            Intrinsics.checkNotNullExpressionValue(str4, "access$getTAG$p(...)");
            ((C4493y9) interfaceC4466x93).a(str4, "getScreenSize called:" + jSONObject2);
        }
        return jSONObject2;
    }

    @JavascriptInterface
    @NotNull
    public final String getSdkVersion(@Nullable String str) {
        InterfaceC4466x9 interfaceC4466x9 = this.c;
        if (interfaceC4466x9 == null) {
            return "11.3.0";
        }
        String str2 = Ia.a;
        Intrinsics.checkNotNullExpressionValue(str2, "access$getTAG$p(...)");
        ((C4493y9) interfaceC4466x9).a(str2, "getSdkVersion called. Version:11.3.0");
        return "11.3.0";
    }

    @JavascriptInterface
    public final long getShowTimeStamp(@Nullable String str) {
        InterfaceC4466x9 interfaceC4466x9 = this.c;
        if (interfaceC4466x9 != null) {
            String str2 = Ia.a;
            Intrinsics.checkNotNullExpressionValue(str2, "access$getTAG$p(...)");
            ((C4493y9) interfaceC4466x9).a(str2, "getShowTimeStamp is called");
        }
        GestureDetectorOnGestureListenerC4476xi a = a();
        if (a == null) {
            InterfaceC4466x9 interfaceC4466x92 = this.c;
            if (interfaceC4466x92 == null) {
                return 0L;
            }
            String str3 = Ia.a;
            Intrinsics.checkNotNullExpressionValue(str3, "access$getTAG$p(...)");
            ((C4493y9) interfaceC4466x92).b(str3, "Found a null instance of ad render view!");
            return 0L;
        }
        long showTimeStamp = a.getShowTimeStamp();
        InterfaceC4466x9 interfaceC4466x93 = this.c;
        if (interfaceC4466x93 != null) {
            String str4 = Ia.a;
            Intrinsics.checkNotNullExpressionValue(str4, "access$getTAG$p(...)");
            ((C4493y9) interfaceC4466x93).a(str4, "getShowTimeStamp is " + showTimeStamp);
        }
        return showTimeStamp;
    }

    @JavascriptInterface
    @NotNull
    public final String getState(@Nullable String str) {
        String viewState = this.a.getViewState();
        Locale ENGLISH = Locale.ENGLISH;
        Intrinsics.checkNotNullExpressionValue(ENGLISH, "ENGLISH");
        String lowerCase = viewState.toLowerCase(ENGLISH);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
        InterfaceC4466x9 interfaceC4466x9 = this.c;
        if (interfaceC4466x9 != null) {
            String str2 = Ia.a;
            Intrinsics.checkNotNullExpressionValue(str2, "access$getTAG$p(...)");
            ((C4493y9) interfaceC4466x9).c(str2, "getState called:" + lowerCase);
        }
        return lowerCase;
    }

    @JavascriptInterface
    @NotNull
    public final String getVersion(@Nullable String str) {
        InterfaceC4466x9 interfaceC4466x9 = this.c;
        if (interfaceC4466x9 == null) {
            return "2.0";
        }
        String str2 = Ia.a;
        Intrinsics.checkNotNullExpressionValue(str2, "access$getTAG$p(...)");
        ((C4493y9) interfaceC4466x9).a(str2, "getVersion called. Version:2.0");
        return "2.0";
    }

    @JavascriptInterface
    public final void impressionFired(@Nullable String str) {
        InterfaceC4466x9 interfaceC4466x9 = this.c;
        if (interfaceC4466x9 != null) {
            String str2 = Ia.a;
            Intrinsics.checkNotNullExpressionValue(str2, "access$getTAG$p(...)");
            ((C4493y9) interfaceC4466x9).a(str2, "impressionFired is called");
        }
        this.a.C();
    }

    @JavascriptInterface
    public final void incentCompleted(@Nullable String str, @Nullable String str2) {
        InterfaceC4466x9 interfaceC4466x9 = this.c;
        if (interfaceC4466x9 != null) {
            String str3 = Ia.a;
            Intrinsics.checkNotNullExpressionValue(str3, "access$getTAG$p(...)");
            ((C4493y9) interfaceC4466x9).a(str3, "incentCompleted called. IncentData:" + str2);
        }
        if (str2 == null) {
            try {
                this.a.getListener().b(new HashMap());
                return;
            } catch (Exception e) {
                this.a.a(str, "Unexpected error", "incentCompleted");
                InterfaceC4466x9 interfaceC4466x92 = this.c;
                if (interfaceC4466x92 != null) {
                    String str4 = Ia.a;
                    Intrinsics.checkNotNullExpressionValue(str4, "access$getTAG$p(...)");
                    ((C4493y9) interfaceC4466x92).b(str4, "SDK encountered unexpected error in handling onUserInteraction() signal from creative; " + e.getMessage());
                    return;
                }
                return;
            }
        }
        try {
            try {
                JSONObject jSONObject = new JSONObject(str2);
                HashMap hashMap = new HashMap();
                Iterator<String> keys = jSONObject.keys();
                Intrinsics.checkNotNullExpressionValue(keys, "keys(...)");
                while (keys.hasNext()) {
                    String next = keys.next();
                    Intrinsics.checkNotNull(next, "null cannot be cast to non-null type kotlin.String");
                    String str5 = next;
                    hashMap.put(str5, jSONObject.get(str5));
                }
                try {
                    this.a.getListener().b(hashMap);
                    Unit unit = Unit.INSTANCE;
                } catch (Exception e2) {
                    this.a.a(str, "Unexpected error", "incentCompleted");
                    InterfaceC4466x9 interfaceC4466x93 = this.c;
                    if (interfaceC4466x93 != null) {
                        String str6 = Ia.a;
                        Intrinsics.checkNotNullExpressionValue(str6, "access$getTAG$p(...)");
                        ((C4493y9) interfaceC4466x93).b(str6, "SDK encountered unexpected error in handling onUserInteraction() signal from creative; " + e2.getMessage());
                        Unit unit2 = Unit.INSTANCE;
                    }
                }
            } catch (JSONException unused) {
                this.a.getListener().b(new HashMap());
                Unit unit3 = Unit.INSTANCE;
            }
        } catch (Exception e3) {
            this.a.a(str, "Unexpected error", "incentCompleted");
            InterfaceC4466x9 interfaceC4466x94 = this.c;
            if (interfaceC4466x94 != null) {
                String str7 = Ia.a;
                Intrinsics.checkNotNullExpressionValue(str7, "access$getTAG$p(...)");
                ((C4493y9) interfaceC4466x94).b(str7, "SDK encountered unexpected error in handling onUserInteraction() signal from creative; " + e3.getMessage());
                Unit unit4 = Unit.INSTANCE;
            }
        }
    }

    @JavascriptInterface
    public final boolean isBackButtonDisabled(@Nullable String str) {
        InterfaceC4466x9 interfaceC4466x9 = this.c;
        if (interfaceC4466x9 != null) {
            String str2 = Ia.a;
            Intrinsics.checkNotNullExpressionValue(str2, "access$getTAG$p(...)");
            ((C4493y9) interfaceC4466x9).a(str2, "isBackButtonDisabled called");
        }
        GestureDetectorOnGestureListenerC4476xi a = a();
        if (a == null) {
            a = this.a;
        }
        return a.L;
    }

    @JavascriptInterface
    @NotNull
    public final String isDeviceMuted(@Nullable String str) {
        InterfaceC4466x9 interfaceC4466x9 = this.c;
        if (interfaceC4466x9 != null) {
            String str2 = Ia.a;
            Intrinsics.checkNotNullExpressionValue(str2, "access$getTAG$p(...)");
            ((C4493y9) interfaceC4466x9).a(str2, "isDeviceMuted called");
        }
        if (this.a == null) {
            InterfaceC4466x9 interfaceC4466x92 = this.c;
            if (interfaceC4466x92 == null) {
                return "false";
            }
            String str3 = Ia.a;
            Intrinsics.checkNotNullExpressionValue(str3, "access$getTAG$p(...)");
            ((C4493y9) interfaceC4466x92).b(str3, "Found a null instance of render view!");
            return "false";
        }
        InterfaceC4466x9 interfaceC4466x93 = this.c;
        if (interfaceC4466x93 != null) {
            String str4 = Ia.a;
            Intrinsics.checkNotNullExpressionValue(str4, "access$getTAG$p(...)");
            ((C4493y9) interfaceC4466x93).a(str4, "JavaScript called: isDeviceMuted()");
        }
        boolean z = false;
        try {
            Jc mediaProcessor = this.a.getMediaProcessor();
            Intrinsics.checkNotNull(mediaProcessor);
            InterfaceC4466x9 interfaceC4466x94 = mediaProcessor.b;
            if (interfaceC4466x94 != null) {
                ((C4493y9) interfaceC4466x94).c("MraidMediaProcessor", "isVolumeMuted");
            }
            Context context = AbstractC4002fj.a;
            if (context != null) {
                AudioManager audioManager = null;
                try {
                    Object systemService = context.getSystemService("audio");
                    if (!(systemService instanceof AudioManager)) {
                        systemService = null;
                    }
                    audioManager = (AudioManager) systemService;
                } catch (Throwable unused) {
                }
                if (audioManager != null) {
                    if (2 != audioManager.getRingerMode()) {
                        z = true;
                    }
                }
            }
        } catch (Exception e) {
            InterfaceC4466x9 interfaceC4466x95 = this.c;
            if (interfaceC4466x95 != null) {
                String str5 = Ia.a;
                Intrinsics.checkNotNullExpressionValue(str5, "access$getTAG$p(...)");
                ((C4493y9) interfaceC4466x95).b(str5, "SDK encountered unexpected error in checking if device is muted; " + e.getMessage());
            }
        }
        return String.valueOf(z);
    }

    @JavascriptInterface
    @NotNull
    public final String isHeadphonePlugged(@Nullable String str) {
        boolean z;
        InterfaceC4466x9 interfaceC4466x9 = this.c;
        if (interfaceC4466x9 != null) {
            String str2 = Ia.a;
            Intrinsics.checkNotNullExpressionValue(str2, "access$getTAG$p(...)");
            ((C4493y9) interfaceC4466x9).a(str2, "isHeadphonePlugged called");
        }
        if (this.a == null) {
            InterfaceC4466x9 interfaceC4466x92 = this.c;
            if (interfaceC4466x92 == null) {
                return "false";
            }
            String str3 = Ia.a;
            Intrinsics.checkNotNullExpressionValue(str3, "access$getTAG$p(...)");
            ((C4493y9) interfaceC4466x92).b(str3, "Found a null instance of render view!");
            return "false";
        }
        InterfaceC4466x9 interfaceC4466x93 = this.c;
        if (interfaceC4466x93 != null) {
            String str4 = Ia.a;
            Intrinsics.checkNotNullExpressionValue(str4, "access$getTAG$p(...)");
            ((C4493y9) interfaceC4466x93).a(str4, "JavaScript called: isHeadphonePlugged()");
        }
        try {
            Jc mediaProcessor = this.a.getMediaProcessor();
            Intrinsics.checkNotNull(mediaProcessor);
            mediaProcessor.getClass();
            z = Jc.b();
        } catch (Exception e) {
            InterfaceC4466x9 interfaceC4466x94 = this.c;
            if (interfaceC4466x94 != null) {
                String str5 = Ia.a;
                Intrinsics.checkNotNullExpressionValue(str5, "access$getTAG$p(...)");
                ((C4493y9) interfaceC4466x94).b(str5, "SDK encountered unexpected error in checking if headphones are plugged-in; " + e.getMessage());
            }
            z = false;
        }
        return String.valueOf(z);
    }

    @JavascriptInterface
    public final boolean isViewable(@Nullable String str) {
        GestureDetectorOnGestureListenerC4476xi gestureDetectorOnGestureListenerC4476xi = this.a;
        if (gestureDetectorOnGestureListenerC4476xi != null) {
            return gestureDetectorOnGestureListenerC4476xi.J == EnumC4061ho.c;
        }
        InterfaceC4466x9 interfaceC4466x9 = this.c;
        if (interfaceC4466x9 != null) {
            String str2 = Ia.a;
            Intrinsics.checkNotNullExpressionValue(str2, "access$getTAG$p(...)");
            ((C4493y9) interfaceC4466x9).b(str2, "Found a null instance of render view!");
        }
        return false;
    }

    @JavascriptInterface
    public final void loadAd(@Nullable String str, int i) {
        InterfaceC4466x9 interfaceC4466x9 = this.c;
        if (interfaceC4466x9 != null) {
            String str2 = Ia.a;
            Intrinsics.checkNotNullExpressionValue(str2, "access$getTAG$p(...)");
            ((C4493y9) interfaceC4466x9).a(str2, "loadAd is called with index - " + i);
        }
        GestureDetectorOnGestureListenerC4476xi a = a();
        if (a != null) {
            a.b(i);
            return;
        }
        InterfaceC4466x9 interfaceC4466x92 = this.c;
        if (interfaceC4466x92 != null) {
            String str3 = Ia.a;
            Intrinsics.checkNotNullExpressionValue(str3, "access$getTAG$p(...)");
            ((C4493y9) interfaceC4466x92).b(str3, "Found a null instance of ad render view!");
        }
    }

    @JavascriptInterface
    public final void loadWebView(@Nullable String str, @Nullable final String str2, @Nullable final String str3) {
        InterfaceC4466x9 interfaceC4466x9 = this.c;
        if (interfaceC4466x9 != null) {
            String str4 = Ia.a;
            Intrinsics.checkNotNullExpressionValue(str4, "access$getTAG$p(...)");
            ((C4493y9) interfaceC4466x9).a(str4, "loadWebView called with html: " + str3);
        }
        GestureDetectorOnGestureListenerC4476xi a = a();
        if (a != null && a.P0) {
            InterfaceC4466x9 interfaceC4466x92 = this.c;
            if (interfaceC4466x92 != null) {
                String str5 = Ia.a;
                Intrinsics.checkNotNullExpressionValue(str5, "access$getTAG$p(...)");
                ((C4493y9) interfaceC4466x92).b(str5, "loadWebView called on unloaded ad");
            }
            GestureDetectorOnGestureListenerC4476xi gestureDetectorOnGestureListenerC4476xi = this.a;
            if (str2 == null) {
                str2 = "";
            }
            Lazy lazy = Oi.a;
            JSONObject a2 = AbstractC4318rj.a(str2, "targetViewId", "id", str2);
            a2.put(IronSourceConstants.EVENTS_ERROR_CODE, 108);
            gestureDetectorOnGestureListenerC4476xi.a("loadWebView", a2);
            return;
        }
        GestureDetectorOnGestureListenerC4476xi a3 = a();
        if (a3 == null || a3.getPlacementType() != 1) {
            InterfaceC4466x9 interfaceC4466x93 = this.c;
            if (interfaceC4466x93 != null) {
                String str6 = Ia.a;
                Intrinsics.checkNotNullExpressionValue(str6, "access$getTAG$p(...)");
                ((C4493y9) interfaceC4466x93).b(str6, "sibling creation not allowed for inline placement type");
            }
            GestureDetectorOnGestureListenerC4476xi gestureDetectorOnGestureListenerC4476xi2 = this.a;
            if (str2 == null) {
                str2 = "";
            }
            Lazy lazy2 = Oi.a;
            JSONObject a4 = AbstractC4318rj.a(str2, "targetViewId", "id", str2);
            a4.put(IronSourceConstants.EVENTS_ERROR_CODE, Sdk.SDKError.Reason.DEEPLINK_OPEN_FAILED_VALUE);
            gestureDetectorOnGestureListenerC4476xi2.a("loadWebView", a4);
            return;
        }
        if (str2 == null || StringsKt.isBlank(str2)) {
            GestureDetectorOnGestureListenerC4476xi gestureDetectorOnGestureListenerC4476xi3 = this.a;
            Lazy lazy3 = Oi.a;
            JSONObject a5 = AbstractC4318rj.a("", "targetViewId", "id", "");
            a5.put(IronSourceConstants.EVENTS_ERROR_CODE, 302);
            gestureDetectorOnGestureListenerC4476xi3.a("loadWebView", a5);
            return;
        }
        if (str3 == null || str3.length() == 0) {
            this.a.a("loadWebView", Oi.a(str2, 301));
            return;
        }
        ExecutorC4101jc executorC4101jc = (ExecutorC4101jc) AbstractC4437w6.e.getValue();
        Runnable runnable = new Runnable() { // from class: com.inmobi.media.Ha$$ExternalSyntheticLambda12
            @Override // java.lang.Runnable
            public final void run() {
                Ha.a(Ha.this, str2, str3);
            }
        };
        executorC4101jc.getClass();
        Intrinsics.checkNotNullParameter(runnable, "runnable");
        executorC4101jc.a.post(runnable);
    }

    @JavascriptInterface
    public final void log(@Nullable String str, @NotNull String message) {
        Intrinsics.checkNotNullParameter(message, "message");
        InterfaceC4466x9 interfaceC4466x9 = this.c;
        if (interfaceC4466x9 != null) {
            String str2 = Ia.a;
            Intrinsics.checkNotNullExpressionValue(str2, "access$getTAG$p(...)");
            ((C4493y9) interfaceC4466x9).c(str2, "Log called. Message:" + message);
        }
        GestureDetectorOnGestureListenerC4476xi gestureDetectorOnGestureListenerC4476xi = this.a;
        gestureDetectorOnGestureListenerC4476xi.getClass();
        C3947di c3947di = GestureDetectorOnGestureListenerC4476xi.g1;
        c3947di.getClass();
        if (!((Boolean) GestureDetectorOnGestureListenerC4476xi.j1.getValue(c3947di, C3947di.a[0])).booleanValue() || message == null) {
            return;
        }
        gestureDetectorOnGestureListenerC4476xi.getListener().a(message);
    }

    @JavascriptInterface
    public final void logTelemetryEvent(@Nullable String str, @Nullable String eventType, @Nullable String str2) {
        if (eventType == null) {
            InterfaceC4466x9 interfaceC4466x9 = this.c;
            if (interfaceC4466x9 != null) {
                String str3 = Ia.a;
                Intrinsics.checkNotNullExpressionValue(str3, "access$getTAG$p(...)");
                ((C4493y9) interfaceC4466x9).b(str3, "eventType is null");
                return;
            }
            return;
        }
        InterfaceC4466x9 interfaceC4466x92 = this.c;
        if (interfaceC4466x92 != null) {
            String str4 = Ia.a;
            Intrinsics.checkNotNullExpressionValue(str4, "access$getTAG$p(...)");
            ((C4493y9) interfaceC4466x92).a(str4, "logTelemetryEvent is called: " + eventType);
        }
        GestureDetectorOnGestureListenerC4476xi gestureDetectorOnGestureListenerC4476xi = this.a;
        gestureDetectorOnGestureListenerC4476xi.getClass();
        Intrinsics.checkNotNullParameter(eventType, "eventType");
        Hi hi = gestureDetectorOnGestureListenerC4476xi.e0;
        if (hi != null) {
            hi.a(eventType, str2);
        }
    }

    @JavascriptInterface
    public final void onAudioStateChanged(@Nullable String str, int i) {
        InterfaceC4466x9 interfaceC4466x9 = this.c;
        if (interfaceC4466x9 != null) {
            String str2 = Ia.a;
            Intrinsics.checkNotNullExpressionValue(str2, "access$getTAG$p(...)");
            ((C4493y9) interfaceC4466x9).a(str2, "onAudioStateChanged is called: " + i);
        }
        Z1.b.getClass();
        Z1 z1 = (Z1) Z1.c.get(i);
        if (z1 == null) {
            z1 = Z1.d;
        }
        if (z1 != Z1.d) {
            this.a.getListener().a(z1);
        }
    }

    @JavascriptInterface
    public final void onOrientationChange(@Nullable String str) {
        InterfaceC4466x9 interfaceC4466x9 = this.c;
        if (interfaceC4466x9 != null) {
            String str2 = Ia.a;
            Intrinsics.checkNotNullExpressionValue(str2, "access$getTAG$p(...)");
            ((C4493y9) interfaceC4466x9).a(str2, ">>> onOrientationChange() >>> This API is deprecated!");
        }
    }

    @JavascriptInterface
    public final void onUserAudioMuteInteraction(@Nullable String str, boolean z) {
        InterfaceC4466x9 interfaceC4466x9 = this.c;
        if (interfaceC4466x9 != null) {
            String str2 = Ia.a;
            Intrinsics.checkNotNullExpressionValue(str2, "access$getTAG$p(...)");
            ((C4493y9) interfaceC4466x9).a(str2, "onAudioMuteInteraction is called: " + z);
        }
        this.a.getListener().a(z);
    }

    @JavascriptInterface
    public final void onUserInteraction(@Nullable String str, @Nullable String str2) {
        InterfaceC4466x9 interfaceC4466x9 = this.c;
        if (interfaceC4466x9 != null) {
            String str3 = Ia.a;
            Intrinsics.checkNotNullExpressionValue(str3, "access$getTAG$p(...)");
            ((C4493y9) interfaceC4466x9).a(str3, "onUserInteraction called");
        }
        GestureDetectorOnGestureListenerC4476xi gestureDetectorOnGestureListenerC4476xi = this.a;
        if (gestureDetectorOnGestureListenerC4476xi != null && !gestureDetectorOnGestureListenerC4476xi.a()) {
            this.a.a("onUserInteraction");
            return;
        }
        InterfaceC4466x9 interfaceC4466x92 = this.c;
        if (interfaceC4466x92 != null) {
            String str4 = Ia.a;
            Intrinsics.checkNotNullExpressionValue(str4, "access$getTAG$p(...)");
            ((C4493y9) interfaceC4466x92).a(str4, "onUserInteraction called. Params:" + str2);
        }
        if (str2 == null) {
            try {
                this.a.a(new HashMap());
                return;
            } catch (Exception e) {
                this.a.a(str, "Unexpected error", "onUserInteraction");
                InterfaceC4466x9 interfaceC4466x93 = this.c;
                if (interfaceC4466x93 != null) {
                    String str5 = Ia.a;
                    Intrinsics.checkNotNullExpressionValue(str5, "access$getTAG$p(...)");
                    ((C4493y9) interfaceC4466x93).b(str5, "SDK encountered unexpected error in handling onUserInteraction() signal from creative; " + e.getMessage());
                    return;
                }
                return;
            }
        }
        try {
            try {
                JSONObject jSONObject = new JSONObject(str2);
                HashMap hashMap = new HashMap();
                Iterator<String> keys = jSONObject.keys();
                Intrinsics.checkNotNullExpressionValue(keys, "keys(...)");
                while (keys.hasNext()) {
                    String next = keys.next();
                    Intrinsics.checkNotNull(next, "null cannot be cast to non-null type kotlin.String");
                    String str6 = next;
                    hashMap.put(str6, jSONObject.get(str6));
                }
                try {
                    this.a.a(hashMap);
                    Unit unit = Unit.INSTANCE;
                } catch (Exception e2) {
                    this.a.a(str, "Unexpected error", "onUserInteraction");
                    InterfaceC4466x9 interfaceC4466x94 = this.c;
                    if (interfaceC4466x94 != null) {
                        String str7 = Ia.a;
                        Intrinsics.checkNotNullExpressionValue(str7, "access$getTAG$p(...)");
                        ((C4493y9) interfaceC4466x94).b(str7, "SDK encountered unexpected error in handling onUserInteraction() signal from creative; " + e2.getMessage());
                        Unit unit2 = Unit.INSTANCE;
                    }
                }
            } catch (Exception e3) {
                this.a.a(str, "Unexpected error", "onUserInteraction");
                InterfaceC4466x9 interfaceC4466x95 = this.c;
                if (interfaceC4466x95 != null) {
                    String str8 = Ia.a;
                    Intrinsics.checkNotNullExpressionValue(str8, "access$getTAG$p(...)");
                    ((C4493y9) interfaceC4466x95).b(str8, "SDK encountered unexpected error in handling onUserInteraction() signal from creative; " + e3.getMessage());
                    Unit unit3 = Unit.INSTANCE;
                }
            }
        } catch (JSONException unused) {
            this.a.a(new HashMap());
            Unit unit4 = Unit.INSTANCE;
        }
    }

    @JavascriptInterface
    public final void open(@Nullable String str, @Nullable String str2) {
        Logger.d("InMobi|SafeDK: Execution> Lcom/inmobi/media/Ha;->open(Ljava/lang/String;Ljava/lang/String;)V");
        safedk_Ha_open_0d805c457e2291acf87a273e9d651fcb(str, str2);
        BrandSafetyUtils.onMraidOpen(com.safedk.android.utils.h.i, str, str2, this.a, "mraid.open");
    }

    @JavascriptInterface
    public final void openEmbedded(@Nullable String str, @Nullable String str2) {
        Logger.d("InMobi|SafeDK: Execution> Lcom/inmobi/media/Ha;->openEmbedded(Ljava/lang/String;Ljava/lang/String;)V");
        safedk_Ha_openEmbedded_4eb8a8d347414c21f2370d06855fadd2(str, str2);
        BrandSafetyUtils.onMraidOpen(com.safedk.android.utils.h.i, str, str2, this.a, "imraid.openEmbedded");
    }

    @JavascriptInterface
    public final void openExternal(@Nullable String str, @NotNull String str2, @Nullable String str3) {
        Logger.d("InMobi|SafeDK: Execution> Lcom/inmobi/media/Ha;->openExternal(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V");
        safedk_Ha_openExternal_584d7118a6e2e667d2a89b2ffd884a8e(str, str2, str3);
        BrandSafetyUtils.onMraidOpen(com.safedk.android.utils.h.i, str, str2, this.a, "imraid.openExternal");
    }

    @JavascriptInterface
    public final void openInlineInstaller(@Nullable final String str, @Nullable final String str2, boolean z, @Nullable final String str3) {
        InterfaceC4466x9 interfaceC4466x9 = this.c;
        if (interfaceC4466x9 != null) {
            String str4 = Ia.a;
            Intrinsics.checkNotNullExpressionValue(str4, "access$getTAG$p(...)");
            ((C4493y9) interfaceC4466x9).a(str4, "openInlineInstaller called");
        }
        GestureDetectorOnGestureListenerC4476xi gestureDetectorOnGestureListenerC4476xi = this.a;
        if (gestureDetectorOnGestureListenerC4476xi.P0) {
            InterfaceC4466x9 interfaceC4466x92 = this.c;
            if (interfaceC4466x92 != null) {
                String str5 = Ia.a;
                Intrinsics.checkNotNullExpressionValue(str5, "access$getTAG$p(...)");
                ((C4493y9) interfaceC4466x92).b(str5, "openInlineInstaller called on unloaded ad");
                return;
            }
            return;
        }
        if (!z && !gestureDetectorOnGestureListenerC4476xi.a()) {
            this.a.a("openInlineInstaller");
        } else {
            this.a.s();
            AbstractC4214nk.a(new Runnable() { // from class: com.inmobi.media.Ha$$ExternalSyntheticLambda8
                @Override // java.lang.Runnable
                public final void run() {
                    Ha.a(Ha.this, str, str3, str2);
                }
            });
        }
    }

    @JavascriptInterface
    public final void openWithoutTracker(@Nullable String str, @Nullable String str2) {
        Logger.d("InMobi|SafeDK: Execution> Lcom/inmobi/media/Ha;->openWithoutTracker(Ljava/lang/String;Ljava/lang/String;)V");
        safedk_Ha_openWithoutTracker_3c12582a34f81e588e0e7c5a8c71b5b2(str, str2);
        BrandSafetyUtils.onMraidOpen(com.safedk.android.utils.h.i, str, str2, this.a, "imraid.openWithoutTracker");
    }

    @JavascriptInterface
    public final void ping(@Nullable String str, @Nullable String url, boolean z) {
        InterfaceC4466x9 interfaceC4466x9 = this.c;
        if (interfaceC4466x9 != null) {
            String str2 = Ia.a;
            Intrinsics.checkNotNullExpressionValue(str2, "access$getTAG$p(...)");
            ((C4493y9) interfaceC4466x9).a(str2, "ping called");
        }
        if (this.a == null) {
            InterfaceC4466x9 interfaceC4466x92 = this.c;
            if (interfaceC4466x92 != null) {
                String str3 = Ia.a;
                Intrinsics.checkNotNullExpressionValue(str3, "access$getTAG$p(...)");
                ((C4493y9) interfaceC4466x92).b(str3, "Found a null instance of render view!");
                return;
            }
            return;
        }
        if (url != null) {
            int length = url.length() - 1;
            int i = 0;
            boolean z2 = false;
            while (i <= length) {
                boolean z3 = Intrinsics.compare((int) url.charAt(!z2 ? i : length), 32) <= 0;
                if (z2) {
                    if (!z3) {
                        break;
                    } else {
                        length--;
                    }
                } else if (z3) {
                    i++;
                } else {
                    z2 = true;
                }
            }
            if (url.subSequence(i, length + 1).toString().length() != 0 && URLUtil.isValidUrl(url)) {
                InterfaceC4466x9 interfaceC4466x93 = this.c;
                if (interfaceC4466x93 != null) {
                    String str4 = Ia.a;
                    Intrinsics.checkNotNullExpressionValue(str4, "access$getTAG$p(...)");
                    ((C4493y9) interfaceC4466x93).a(str4, "JavaScript called ping() URL: >>> " + url + " <<<");
                }
                try {
                    E3 e3 = E3.a;
                    InterfaceC4466x9 interfaceC4466x94 = this.c;
                    Intrinsics.checkNotNullParameter(url, "url");
                    E3.a(url, z, interfaceC4466x94);
                    return;
                } catch (Exception e) {
                    this.a.a(str, "Unexpected error", "ping");
                    Xb.a((byte) 1, "InMobi", "Failed to fire ping; SDK encountered unexpected error");
                    InterfaceC4466x9 interfaceC4466x95 = this.c;
                    if (interfaceC4466x95 != null) {
                        String str5 = Ia.a;
                        Intrinsics.checkNotNullExpressionValue(str5, "access$getTAG$p(...)");
                        ((C4493y9) interfaceC4466x95).b(str5, "SDK encountered unexpected error in handling ping() request from creative; " + e.getMessage());
                        return;
                    }
                    return;
                }
            }
        }
        this.a.a(str, "Invalid URL:" + url, "ping");
    }

    @JavascriptInterface
    public final void pingInWebView(@Nullable String str, @Nullable String url, boolean z) {
        InterfaceC4466x9 interfaceC4466x9 = this.c;
        if (interfaceC4466x9 != null) {
            String str2 = Ia.a;
            Intrinsics.checkNotNullExpressionValue(str2, "access$getTAG$p(...)");
            ((C4493y9) interfaceC4466x9).a(str2, "openInWebView called");
        }
        if (url != null) {
            int length = url.length() - 1;
            int i = 0;
            boolean z2 = false;
            while (i <= length) {
                boolean z3 = Intrinsics.compare((int) url.charAt(!z2 ? i : length), 32) <= 0;
                if (z2) {
                    if (!z3) {
                        break;
                    } else {
                        length--;
                    }
                } else if (z3) {
                    i++;
                } else {
                    z2 = true;
                }
            }
            if (url.subSequence(i, length + 1).toString().length() != 0 && URLUtil.isValidUrl(url)) {
                InterfaceC4466x9 interfaceC4466x92 = this.c;
                if (interfaceC4466x92 != null) {
                    String str3 = Ia.a;
                    Intrinsics.checkNotNullExpressionValue(str3, "access$getTAG$p(...)");
                    ((C4493y9) interfaceC4466x92).a(str3, "JavaScript called pingInWebView() URL: >>> " + url + " <<<");
                }
                try {
                    E3 e3 = E3.a;
                    InterfaceC4466x9 interfaceC4466x93 = this.c;
                    Intrinsics.checkNotNullParameter(url, "url");
                    Ug.a(Rg.b, new C4460x3(url, z, interfaceC4466x93, null));
                    return;
                } catch (Exception e) {
                    this.a.a(str, "Unexpected error", "pingInWebView");
                    Xb.a((byte) 1, "InMobi", "Failed to fire ping; SDK encountered unexpected error");
                    InterfaceC4466x9 interfaceC4466x94 = this.c;
                    if (interfaceC4466x94 != null) {
                        String str4 = Ia.a;
                        Intrinsics.checkNotNullExpressionValue(str4, "access$getTAG$p(...)");
                        ((C4493y9) interfaceC4466x94).b(str4, "SDK encountered unexpected error in handling pingInWebView() request from creative; " + e.getMessage());
                        return;
                    }
                    return;
                }
            }
        }
        this.a.a(str, "Invalid URL:" + url, "pingInWebView");
    }

    @JavascriptInterface
    public final void pingV2(@Nullable String str, @NotNull String pingJson) {
        Intrinsics.checkNotNullParameter(pingJson, "pingJson");
        InterfaceC4466x9 interfaceC4466x9 = this.c;
        if (interfaceC4466x9 != null) {
            String str2 = Ia.a;
            Intrinsics.checkNotNullExpressionValue(str2, "access$getTAG$p(...)");
            ((C4493y9) interfaceC4466x9).a(str2, "pingV2 called with JSON: >>> " + pingJson + " <<<");
        }
        try {
            this.a.g(pingJson);
        } catch (Exception e) {
            this.a.a(str, "Unexpected error", "ping");
            this.a.a(e);
            Xb.a((byte) 1, "InMobi", "Failed to fire ping; SDK encountered unexpected error");
            InterfaceC4466x9 interfaceC4466x92 = this.c;
            if (interfaceC4466x92 != null) {
                String str3 = Ia.a;
                Intrinsics.checkNotNullExpressionValue(str3, "access$getTAG$p(...)");
                ((C4493y9) interfaceC4466x92).b(str3, "SDK encountered unexpected error in handling ping() request from creative; " + e.getMessage());
            }
        }
    }

    @JavascriptInterface
    public final void playVideo(@Nullable final String str, @Nullable final String str2) {
        if (this.a == null) {
            InterfaceC4466x9 interfaceC4466x9 = this.c;
            if (interfaceC4466x9 != null) {
                String str3 = Ia.a;
                Intrinsics.checkNotNullExpressionValue(str3, "access$getTAG$p(...)");
                ((C4493y9) interfaceC4466x9).b(str3, "Found a null instance of render view!");
                return;
            }
            return;
        }
        if (str2 != null) {
            int length = str2.length() - 1;
            int i = 0;
            boolean z = false;
            while (i <= length) {
                boolean z2 = Intrinsics.compare((int) str2.charAt(!z ? i : length), 32) <= 0;
                if (z) {
                    if (!z2) {
                        break;
                    } else {
                        length--;
                    }
                } else if (z2) {
                    i++;
                } else {
                    z = true;
                }
            }
            if (str2.subSequence(i, length + 1).toString().length() != 0 && StringsKt.startsWith$default(str2, "http", false, 2, (Object) null) && (StringsKt.endsWith$default(str2, com.safedk.android.utils.n.d, false, 2, (Object) null) || StringsKt.endsWith$default(str2, "avi", false, 2, (Object) null) || StringsKt.endsWith$default(str2, "m4v", false, 2, (Object) null))) {
                InterfaceC4466x9 interfaceC4466x92 = this.c;
                if (interfaceC4466x92 != null) {
                    String str4 = Ia.a;
                    Intrinsics.checkNotNullExpressionValue(str4, "access$getTAG$p(...)");
                    ((C4493y9) interfaceC4466x92).a(str4, "JavaScript called: playVideo (" + str2 + ")");
                }
                new Handler(this.a.getContainerContext().getMainLooper()).post(new Runnable() { // from class: com.inmobi.media.Ha$$ExternalSyntheticLambda16
                    @Override // java.lang.Runnable
                    public final void run() {
                        Ha.e(Ha.this, str, str2);
                    }
                });
                return;
            }
        }
        this.a.a(str, "Null or empty or invalid media playback URL supplied", "playVideo");
    }

    @JavascriptInterface
    public final void registerBackButtonPressedEventListener(@Nullable String str) {
        InterfaceC4466x9 interfaceC4466x9 = this.c;
        if (interfaceC4466x9 != null) {
            String str2 = Ia.a;
            Intrinsics.checkNotNullExpressionValue(str2, "access$getTAG$p(...)");
            ((C4493y9) interfaceC4466x9).a(str2, "registerBackButtonPressedEventListener called");
        }
        GestureDetectorOnGestureListenerC4476xi gestureDetectorOnGestureListenerC4476xi = this.a;
        if (gestureDetectorOnGestureListenerC4476xi == null) {
            InterfaceC4466x9 interfaceC4466x92 = this.c;
            if (interfaceC4466x92 != null) {
                String str3 = Ia.a;
                Intrinsics.checkNotNullExpressionValue(str3, "access$getTAG$p(...)");
                ((C4493y9) interfaceC4466x92).b(str3, "Found a null instance of render view!");
                return;
            }
            return;
        }
        try {
            gestureDetectorOnGestureListenerC4476xi.l(str);
        } catch (Exception e) {
            this.a.a(str, "Unexpected error", "registerBackButtonPressedEventListener");
            InterfaceC4466x9 interfaceC4466x93 = this.c;
            if (interfaceC4466x93 != null) {
                String str4 = Ia.a;
                Intrinsics.checkNotNullExpressionValue(str4, "access$getTAG$p(...)");
                ((C4493y9) interfaceC4466x93).b(str4, "SDK encountered unexpected error in handling registerBackButtonPressedEventListener() request from creative; " + e.getMessage());
            }
        }
    }

    @JavascriptInterface
    public final void registerDeviceMuteEventListener(@Nullable String jsCallbackNamespace) {
        InterfaceC4466x9 interfaceC4466x9 = this.c;
        if (interfaceC4466x9 != null) {
            String str = Ia.a;
            Intrinsics.checkNotNullExpressionValue(str, "access$getTAG$p(...)");
            ((C4493y9) interfaceC4466x9).a(str, "registerDeviceMuteEventListener called");
        }
        GestureDetectorOnGestureListenerC4476xi gestureDetectorOnGestureListenerC4476xi = this.a;
        if (gestureDetectorOnGestureListenerC4476xi == null) {
            InterfaceC4466x9 interfaceC4466x92 = this.c;
            if (interfaceC4466x92 != null) {
                String str2 = Ia.a;
                Intrinsics.checkNotNullExpressionValue(str2, "access$getTAG$p(...)");
                ((C4493y9) interfaceC4466x92).b(str2, "Found a null instance of render view!");
                return;
            }
            return;
        }
        if (jsCallbackNamespace != null) {
            try {
                Jc mediaProcessor = gestureDetectorOnGestureListenerC4476xi.getMediaProcessor();
                if (mediaProcessor != null) {
                    Intrinsics.checkNotNullParameter(jsCallbackNamespace, "jsCallbackNamespace");
                    if (mediaProcessor.d == null) {
                        C4206nc c4206nc = new C4206nc(new Fc(mediaProcessor, jsCallbackNamespace));
                        mediaProcessor.d = c4206nc;
                        c4206nc.b();
                    }
                }
            } catch (Exception e) {
                this.a.a(jsCallbackNamespace, "Unexpected error", "registerDeviceMuteEventListener");
                InterfaceC4466x9 interfaceC4466x93 = this.c;
                if (interfaceC4466x93 != null) {
                    String str3 = Ia.a;
                    Intrinsics.checkNotNullExpressionValue(str3, "access$getTAG$p(...)");
                    ((C4493y9) interfaceC4466x93).b(str3, "SDK encountered unexpected error in handling registerDeviceMuteEventListener() request from creative; " + e.getMessage());
                }
            }
        }
    }

    @JavascriptInterface
    public final void registerDeviceVolumeChangeEventListener(@Nullable String jsCallbackNamespace) {
        InterfaceC4466x9 interfaceC4466x9 = this.c;
        if (interfaceC4466x9 != null) {
            String str = Ia.a;
            Intrinsics.checkNotNullExpressionValue(str, "access$getTAG$p(...)");
            ((C4493y9) interfaceC4466x9).a(str, "registerDeviceVolumeChangeEventListener called");
        }
        GestureDetectorOnGestureListenerC4476xi gestureDetectorOnGestureListenerC4476xi = this.a;
        if (gestureDetectorOnGestureListenerC4476xi == null) {
            InterfaceC4466x9 interfaceC4466x92 = this.c;
            if (interfaceC4466x92 != null) {
                String str2 = Ia.a;
                Intrinsics.checkNotNullExpressionValue(str2, "access$getTAG$p(...)");
                ((C4493y9) interfaceC4466x92).b(str2, "Found a null instance of render view!");
                return;
            }
            return;
        }
        if (jsCallbackNamespace != null) {
            try {
                Jc mediaProcessor = gestureDetectorOnGestureListenerC4476xi.getMediaProcessor();
                if (mediaProcessor != null) {
                    Intrinsics.checkNotNullParameter(jsCallbackNamespace, "jsCallbackNamespace");
                    Context context = AbstractC4002fj.a;
                    if (context != null && mediaProcessor.e == null) {
                        C4206nc c4206nc = new C4206nc(new Hc(mediaProcessor, jsCallbackNamespace, context, new Handler(Looper.getMainLooper())));
                        mediaProcessor.e = c4206nc;
                        c4206nc.b();
                    }
                }
            } catch (Exception e) {
                this.a.a(jsCallbackNamespace, "Unexpected error", "registerDeviceVolumeChangeEventListener");
                InterfaceC4466x9 interfaceC4466x93 = this.c;
                if (interfaceC4466x93 != null) {
                    String str3 = Ia.a;
                    Intrinsics.checkNotNullExpressionValue(str3, "access$getTAG$p(...)");
                    ((C4493y9) interfaceC4466x93).b(str3, "SDK encountered unexpected error in handling registerDeviceVolumeChangeEventListener() request from creative; " + e.getMessage());
                }
            }
        }
    }

    @JavascriptInterface
    public final void registerHeadphonePluggedEventListener(@Nullable String jsCallbackNamespace) {
        InterfaceC4466x9 interfaceC4466x9 = this.c;
        if (interfaceC4466x9 != null) {
            String str = Ia.a;
            Intrinsics.checkNotNullExpressionValue(str, "access$getTAG$p(...)");
            ((C4493y9) interfaceC4466x9).a(str, "registerHeadphonePluggedEventListener called");
        }
        GestureDetectorOnGestureListenerC4476xi gestureDetectorOnGestureListenerC4476xi = this.a;
        if (gestureDetectorOnGestureListenerC4476xi == null) {
            InterfaceC4466x9 interfaceC4466x92 = this.c;
            if (interfaceC4466x92 != null) {
                String str2 = Ia.a;
                Intrinsics.checkNotNullExpressionValue(str2, "access$getTAG$p(...)");
                ((C4493y9) interfaceC4466x92).b(str2, "Found a null instance of render view!");
                return;
            }
            return;
        }
        if (jsCallbackNamespace != null) {
            try {
                Jc mediaProcessor = gestureDetectorOnGestureListenerC4476xi.getMediaProcessor();
                if (mediaProcessor != null) {
                    Intrinsics.checkNotNullParameter(jsCallbackNamespace, "jsCallbackNamespace");
                    if (mediaProcessor.f == null) {
                        C4206nc c4206nc = new C4206nc(new Ec(mediaProcessor, jsCallbackNamespace));
                        mediaProcessor.f = c4206nc;
                        c4206nc.b();
                    }
                }
            } catch (Exception e) {
                this.a.a(jsCallbackNamespace, "Unexpected error", "registerHeadphonePluggedEventListener");
                InterfaceC4466x9 interfaceC4466x93 = this.c;
                if (interfaceC4466x93 != null) {
                    String str3 = Ia.a;
                    Intrinsics.checkNotNullExpressionValue(str3, "access$getTAG$p(...)");
                    ((C4493y9) interfaceC4466x93).b(str3, "SDK encountered unexpected error in handling registerHeadphonePluggedEventListener() request from creative; " + e.getMessage());
                }
            }
        }
    }

    @JavascriptInterface
    public void safedk_Ha_customExpand_c7f7e4129a751671d8e2a9959898704b(String p0, String p1, int p2, float p3, boolean p4, boolean p5) {
        C4152lb c4152lb;
        InterfaceC4466x9 interfaceC4466x9 = this.c;
        if (interfaceC4466x9 != null) {
            String str = Ia.a;
            Intrinsics.checkNotNullExpressionValue(str, "access$getTAG$p(...)");
            ((C4493y9) interfaceC4466x9).a(str, "customExpand called");
        }
        boolean p42 = this.a.P0;
        if (p42) {
            InterfaceC4466x9 interfaceC4466x92 = this.c;
            if (interfaceC4466x92 != null) {
                String p12 = Ia.a;
                Intrinsics.checkNotNullExpressionValue(p12, "access$getTAG$p(...)");
                ((C4493y9) interfaceC4466x92).b(p12, "customExpand called on unloaded ad");
                return;
            }
            return;
        }
        if (this.b != 1) {
            InterfaceC4466x9 interfaceC4466x93 = this.c;
            if (interfaceC4466x93 != null) {
                String p13 = Ia.a;
                Intrinsics.checkNotNullExpressionValue(p13, "access$getTAG$p(...)");
                ((C4493y9) interfaceC4466x93).b(p13, "customExpand called in incorrect Ad type: " + this.b);
                return;
            }
            return;
        }
        if (p1 != null) {
            int length = p1.length() - 1;
            int i = 0;
            boolean z = false;
            while (i <= length) {
                boolean z2 = Intrinsics.compare((int) p1.charAt(!z ? i : length), 32) <= 0;
                if (z) {
                    if (!z2) {
                        break;
                    } else {
                        length--;
                    }
                } else if (z2) {
                    i++;
                } else {
                    z = true;
                }
            }
            if (p1.subSequence(i, length + 1).toString().length() != 0) {
                if (p2 < 0 || p2 >= Z5.values().length) {
                    this.a.a(p0, "Invalid inputType", "customExpand");
                    return;
                }
                if (p3 < 0.0f || p3 > 1.0f) {
                    this.a.a(p0, "Invalid screenPercentage", "customExpand");
                    return;
                }
                C4178mb c4178mb = this.a.getLandingPageHandler().f;
                if (c4178mb != null) {
                    String a = AbstractC3914cb.a(p1);
                    C4048hb landingPageHandler = this.a.getLandingPageHandler();
                    int i2 = landingPageHandler.i + 1;
                    landingPageHandler.i = i2;
                    c4152lb = new C4152lb(c4178mb, a, i2, SystemClock.elapsedRealtime());
                } else {
                    c4152lb = null;
                }
                C4152lb c4152lb2 = c4152lb;
                if (c4152lb2 != null) {
                    c4152lb2.f = "IN_CUSTOM";
                }
                this.a.getLandingPageHandler().a(Za.d, c4152lb2, (Integer) 8008);
                a(p0, p1, p2, p3, p5, c4152lb2);
                return;
            }
        }
        this.a.a(p0, "Invalid " + p2, "customExpand");
    }

    @JavascriptInterface
    public void safedk_Ha_openEmbedded_4eb8a8d347414c21f2370d06855fadd2(final String p0, final String p1) {
        InterfaceC4466x9 interfaceC4466x9 = this.c;
        if (interfaceC4466x9 != null) {
            String str = Ia.a;
            Intrinsics.checkNotNullExpressionValue(str, "access$getTAG$p(...)");
            ((C4493y9) interfaceC4466x9).a(str, "openEmbedded called");
        }
        if (!this.a.a()) {
            this.a.a("openEmbedded");
            return;
        }
        GestureDetectorOnGestureListenerC4476xi gestureDetectorOnGestureListenerC4476xi = this.a;
        if (!gestureDetectorOnGestureListenerC4476xi.P0) {
            gestureDetectorOnGestureListenerC4476xi.s();
            AbstractC4214nk.a(new Runnable() { // from class: com.inmobi.media.Ha$$ExternalSyntheticLambda6
                @Override // java.lang.Runnable
                public final void run() {
                    Ha.c(Ha.this, p0, p1);
                }
            });
            return;
        }
        InterfaceC4466x9 interfaceC4466x92 = this.c;
        if (interfaceC4466x92 != null) {
            String p12 = Ia.a;
            Intrinsics.checkNotNullExpressionValue(p12, "access$getTAG$p(...)");
            ((C4493y9) interfaceC4466x92).b(p12, "openEmbedded called on unloaded ad");
        }
    }

    @JavascriptInterface
    public void safedk_Ha_openExternal_584d7118a6e2e667d2a89b2ffd884a8e(String p0, String url, String p2) {
        C4152lb c4152lb;
        Intrinsics.checkNotNullParameter(url, "url");
        InterfaceC4466x9 interfaceC4466x9 = this.c;
        if (interfaceC4466x9 != null) {
            String str = Ia.a;
            Intrinsics.checkNotNullExpressionValue(str, "access$getTAG$p(...)");
            ((C4493y9) interfaceC4466x9).a(str, "open External");
        }
        GestureDetectorOnGestureListenerC4476xi gestureDetectorOnGestureListenerC4476xi = this.a;
        if (gestureDetectorOnGestureListenerC4476xi == null) {
            InterfaceC4466x9 interfaceC4466x92 = this.c;
            if (interfaceC4466x92 != null) {
                String p1 = Ia.a;
                Intrinsics.checkNotNullExpressionValue(p1, "access$getTAG$p(...)");
                ((C4493y9) interfaceC4466x92).b(p1, "Found a null instance of render view!");
                return;
            }
            return;
        }
        if (gestureDetectorOnGestureListenerC4476xi.P0) {
            InterfaceC4466x9 interfaceC4466x93 = this.c;
            if (interfaceC4466x93 != null) {
                String p12 = Ia.a;
                Intrinsics.checkNotNullExpressionValue(p12, "access$getTAG$p(...)");
                ((C4493y9) interfaceC4466x93).b(p12, "open called on unloaded ad");
                return;
            }
            return;
        }
        if (!gestureDetectorOnGestureListenerC4476xi.a()) {
            this.a.a("openExternal");
            return;
        }
        this.a.s();
        InterfaceC4466x9 interfaceC4466x94 = this.c;
        if (interfaceC4466x94 != null) {
            String str2 = Ia.a;
            Intrinsics.checkNotNullExpressionValue(str2, "access$getTAG$p(...)");
            ((C4493y9) interfaceC4466x94).a(str2, "openExternal called with url: " + url + " , schema: " + AbstractC3914cb.a(url) + ", fallback - " + p2);
        }
        C4178mb c4178mb = this.a.getLandingPageHandler().f;
        if (c4178mb != null) {
            String a = AbstractC3914cb.a(url);
            C4048hb landingPageHandler = this.a.getLandingPageHandler();
            int i = landingPageHandler.i + 1;
            landingPageHandler.i = i;
            c4152lb = new C4152lb(c4178mb, a, i, SystemClock.elapsedRealtime());
        } else {
            c4152lb = null;
        }
        if (c4152lb != null) {
            c4152lb.f = "EX_NATIVE";
        }
        this.a.getLandingPageHandler().a(Za.d, c4152lb, (Integer) null);
        C4048hb landingPageHandler2 = this.a.getLandingPageHandler();
        landingPageHandler2.getClass();
        Intrinsics.checkNotNullParameter("openExternal", "api");
        if (url != null) {
            landingPageHandler2.f(p0, url, p2, c4152lb);
            return;
        }
        if (p2 != null) {
            landingPageHandler2.f(p0, p2, null, c4152lb);
            return;
        }
        landingPageHandler2.a(Za.e, c4152lb, (Integer) 2);
        Ya ya = landingPageHandler2.d;
        if (ya != null) {
            ya.a(p0, "Empty url and fallback url", "openExternal");
        }
        InterfaceC4466x9 interfaceC4466x95 = landingPageHandler2.g;
        if (interfaceC4466x95 != null) {
            Intrinsics.checkNotNullExpressionValue(CampaignEx.JSON_KEY_HB, "TAG");
            ((C4493y9) interfaceC4466x95).b(CampaignEx.JSON_KEY_HB, "Empty deeplink and fallback urls");
        }
    }

    @JavascriptInterface
    public void safedk_Ha_openWithoutTracker_3c12582a34f81e588e0e7c5a8c71b5b2(final String p0, final String p1) {
        InterfaceC4466x9 interfaceC4466x9 = this.c;
        if (interfaceC4466x9 != null) {
            String str = Ia.a;
            Intrinsics.checkNotNullExpressionValue(str, "access$getTAG$p(...)");
            ((C4493y9) interfaceC4466x9).a(str, "openWithoutTracker called");
        }
        if (!this.a.a()) {
            this.a.a("openWithoutTracker");
            return;
        }
        if (!this.a.P0) {
            AbstractC4214nk.a(new Runnable() { // from class: com.inmobi.media.Ha$$ExternalSyntheticLambda21
                @Override // java.lang.Runnable
                public final void run() {
                    Ha.d(Ha.this, p0, p1);
                }
            });
            return;
        }
        InterfaceC4466x9 interfaceC4466x92 = this.c;
        if (interfaceC4466x92 != null) {
            String p12 = Ia.a;
            Intrinsics.checkNotNullExpressionValue(p12, "access$getTAG$p(...)");
            ((C4493y9) interfaceC4466x92).b(p12, "openWithoutTracker called on unloaded ad");
        }
    }

    @JavascriptInterface
    public void safedk_Ha_open_0d805c457e2291acf87a273e9d651fcb(final String p0, final String p1) {
        InterfaceC4466x9 interfaceC4466x9 = this.c;
        if (interfaceC4466x9 != null) {
            String str = Ia.a;
            Intrinsics.checkNotNullExpressionValue(str, "access$getTAG$p(...)");
            ((C4493y9) interfaceC4466x9).a(str, "open called");
        }
        if (!this.a.a()) {
            this.a.a("open");
            return;
        }
        GestureDetectorOnGestureListenerC4476xi gestureDetectorOnGestureListenerC4476xi = this.a;
        if (!gestureDetectorOnGestureListenerC4476xi.P0) {
            gestureDetectorOnGestureListenerC4476xi.s();
            AbstractC4214nk.a(new Runnable() { // from class: com.inmobi.media.Ha$$ExternalSyntheticLambda1
                @Override // java.lang.Runnable
                public final void run() {
                    Ha.b(Ha.this, p0, p1);
                }
            });
            return;
        }
        InterfaceC4466x9 interfaceC4466x92 = this.c;
        if (interfaceC4466x92 != null) {
            String p12 = Ia.a;
            Intrinsics.checkNotNullExpressionValue(p12, "access$getTAG$p(...)");
            ((C4493y9) interfaceC4466x92).b(p12, "open called on unloaded ad");
        }
    }

    @JavascriptInterface
    public final void saveBlob(@Nullable String str, @Nullable String str2) {
        J2 j2;
        InterfaceC4466x9 interfaceC4466x9 = this.c;
        if (interfaceC4466x9 != null) {
            String str3 = Ia.a;
            Intrinsics.checkNotNullExpressionValue(str3, "access$getTAG$p(...)");
            ((C4493y9) interfaceC4466x9).a(str3, "saveBlob is called");
        }
        GestureDetectorOnGestureListenerC4476xi gestureDetectorOnGestureListenerC4476xi = this.a;
        if (gestureDetectorOnGestureListenerC4476xi == null) {
            InterfaceC4466x9 interfaceC4466x92 = this.c;
            if (interfaceC4466x92 != null) {
                String str4 = Ia.a;
                Intrinsics.checkNotNullExpressionValue(str4, "access$getTAG$p(...)");
                ((C4493y9) interfaceC4466x92).b(str4, "Found a null instance of render view!");
                return;
            }
            return;
        }
        InterfaceC4466x9 interfaceC4466x93 = gestureDetectorOnGestureListenerC4476xi.i;
        if (interfaceC4466x93 != null) {
            String TAG = GestureDetectorOnGestureListenerC4476xi.i1;
            Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            ((C4493y9) interfaceC4466x93).a(TAG, "saveBlob");
        }
        if (str2 == null || (j2 = gestureDetectorOnGestureListenerC4476xi.k0) == null) {
            return;
        }
        ((AbstractC4168m1) j2).a(str2, gestureDetectorOnGestureListenerC4476xi.getImpressionId());
    }

    @JavascriptInterface
    public final void sendMessage(@Nullable String str, @Nullable final String str2, @Nullable final String str3) {
        InterfaceC4466x9 interfaceC4466x9 = this.c;
        if (interfaceC4466x9 != null) {
            String str4 = Ia.a;
            Intrinsics.checkNotNullExpressionValue(str4, "access$getTAG$p(...)");
            ((C4493y9) interfaceC4466x9).a(str4, "sendMessage called with message: " + str3);
        }
        GestureDetectorOnGestureListenerC4476xi a = a();
        if (a != null && a.P0) {
            InterfaceC4466x9 interfaceC4466x92 = this.c;
            if (interfaceC4466x92 != null) {
                String str5 = Ia.a;
                Intrinsics.checkNotNullExpressionValue(str5, "access$getTAG$p(...)");
                ((C4493y9) interfaceC4466x92).b(str5, "sendMessage called on unloaded ad");
            }
            GestureDetectorOnGestureListenerC4476xi gestureDetectorOnGestureListenerC4476xi = this.a;
            if (str2 == null) {
                str2 = "";
            }
            Lazy lazy = Oi.a;
            JSONObject a2 = AbstractC4318rj.a(str2, "targetViewId", "id", str2);
            a2.put(IronSourceConstants.EVENTS_ERROR_CODE, 108);
            gestureDetectorOnGestureListenerC4476xi.a(C4643f8.j, a2);
            return;
        }
        if (str2 == null || StringsKt.isBlank(str2)) {
            GestureDetectorOnGestureListenerC4476xi gestureDetectorOnGestureListenerC4476xi2 = this.a;
            if (str2 == null) {
                str2 = "";
            }
            Lazy lazy2 = Oi.a;
            JSONObject a3 = AbstractC4318rj.a(str2, "targetViewId", "id", str2);
            a3.put(IronSourceConstants.EVENTS_ERROR_CODE, 302);
            gestureDetectorOnGestureListenerC4476xi2.a(C4643f8.j, a3);
            return;
        }
        if (str3 == null || StringsKt.isBlank(str3)) {
            this.a.a(C4643f8.j, Oi.a(str2, 301));
            return;
        }
        ExecutorC4101jc executorC4101jc = (ExecutorC4101jc) AbstractC4437w6.e.getValue();
        Runnable runnable = new Runnable() { // from class: com.inmobi.media.Ha$$ExternalSyntheticLambda4
            @Override // java.lang.Runnable
            public final void run() {
                Ha.f(Ha.this, str2, str3);
            }
        };
        executorC4101jc.getClass();
        Intrinsics.checkNotNullParameter(runnable, "runnable");
        executorC4101jc.a.post(runnable);
    }

    @JavascriptInterface
    public final void setAdContext(@Nullable String str, @NotNull String podAdContext) {
        Intrinsics.checkNotNullParameter(podAdContext, "podAdContext");
        InterfaceC4466x9 interfaceC4466x9 = this.c;
        if (interfaceC4466x9 != null) {
            String str2 = Ia.a;
            Intrinsics.checkNotNullExpressionValue(str2, "access$getTAG$p(...)");
            ((C4493y9) interfaceC4466x9).a(str2, "setAdContext is called " + podAdContext);
        }
        GestureDetectorOnGestureListenerC4476xi a = a();
        if (a != null) {
            InterfaceC4457x0 adPodHandler = a.getAdPodHandler();
            if (adPodHandler != null) {
                ((AbstractC4168m1) adPodHandler).c(podAdContext);
                return;
            }
            return;
        }
        InterfaceC4466x9 interfaceC4466x92 = this.c;
        if (interfaceC4466x92 != null) {
            String str3 = Ia.a;
            Intrinsics.checkNotNullExpressionValue(str3, "access$getTAG$p(...)");
            ((C4493y9) interfaceC4466x92).b(str3, "Found a null instance of ad render view!");
        }
    }

    @JavascriptInterface
    public final void setOrientationProperties(@Nullable String str, @NotNull final String orientationPropertiesString) {
        Intrinsics.checkNotNullParameter(orientationPropertiesString, "orientationPropertiesString");
        InterfaceC4466x9 interfaceC4466x9 = this.c;
        if (interfaceC4466x9 != null) {
            String str2 = Ia.a;
            Intrinsics.checkNotNullExpressionValue(str2, "access$getTAG$p(...)");
            ((C4493y9) interfaceC4466x9).a(str2, "setOrientationProperties called: " + orientationPropertiesString);
        }
        ExecutorC4101jc executorC4101jc = (ExecutorC4101jc) AbstractC4437w6.e.getValue();
        Runnable runnable = new Runnable() { // from class: com.inmobi.media.Ha$$ExternalSyntheticLambda2
            @Override // java.lang.Runnable
            public final void run() {
                Ha.b(Ha.this, orientationPropertiesString);
            }
        };
        executorC4101jc.getClass();
        Intrinsics.checkNotNullParameter(runnable, "runnable");
        executorC4101jc.a.post(runnable);
    }

    @JavascriptInterface
    public final void showAd(@Nullable String str, int i) {
        InterfaceC4466x9 interfaceC4466x9 = this.c;
        if (interfaceC4466x9 != null) {
            String str2 = Ia.a;
            Intrinsics.checkNotNullExpressionValue(str2, "access$getTAG$p(...)");
            ((C4493y9) interfaceC4466x9).a(str2, "showAd is called with index " + i);
        }
        GestureDetectorOnGestureListenerC4476xi a = a();
        if (a != null) {
            a.c(i);
            return;
        }
        InterfaceC4466x9 interfaceC4466x92 = this.c;
        if (interfaceC4466x92 != null) {
            String str3 = Ia.a;
            Intrinsics.checkNotNullExpressionValue(str3, "access$getTAG$p(...)");
            ((C4493y9) interfaceC4466x92).b(str3, "Found a null instance of ad render view!");
        }
    }

    @JavascriptInterface
    public final void showAlert(@Nullable String str, @NotNull String alert) {
        Intrinsics.checkNotNullParameter(alert, "alert");
        InterfaceC4466x9 interfaceC4466x9 = this.c;
        if (interfaceC4466x9 != null) {
            String str2 = Ia.a;
            Intrinsics.checkNotNullExpressionValue(str2, "access$getTAG$p(...)");
            ((C4493y9) interfaceC4466x9).a(str2, "showAlert: " + alert);
        }
    }

    @JavascriptInterface
    public final void showWebView(@Nullable String str, @Nullable final String str2) {
        InterfaceC4466x9 interfaceC4466x9 = this.c;
        if (interfaceC4466x9 != null) {
            String str3 = Ia.a;
            Intrinsics.checkNotNullExpressionValue(str3, "access$getTAG$p(...)");
            ((C4493y9) interfaceC4466x9).a(str3, "showEndCard called");
        }
        GestureDetectorOnGestureListenerC4476xi a = a();
        if (a != null && a.P0) {
            InterfaceC4466x9 interfaceC4466x92 = this.c;
            if (interfaceC4466x92 != null) {
                String str4 = Ia.a;
                Intrinsics.checkNotNullExpressionValue(str4, "access$getTAG$p(...)");
                ((C4493y9) interfaceC4466x92).b(str4, "showWebView called on unloaded ad");
            }
            GestureDetectorOnGestureListenerC4476xi gestureDetectorOnGestureListenerC4476xi = this.a;
            if (str2 == null) {
                str2 = "";
            }
            Lazy lazy = Oi.a;
            JSONObject a2 = AbstractC4318rj.a(str2, "targetViewId", "id", str2);
            a2.put(IronSourceConstants.EVENTS_ERROR_CODE, 108);
            gestureDetectorOnGestureListenerC4476xi.a("showWebView", a2);
            return;
        }
        if (str2 != null && str2.length() != 0) {
            ExecutorC4101jc executorC4101jc = (ExecutorC4101jc) AbstractC4437w6.e.getValue();
            Runnable runnable = new Runnable() { // from class: com.inmobi.media.Ha$$ExternalSyntheticLambda10
                @Override // java.lang.Runnable
                public final void run() {
                    Ha.c(Ha.this, str2);
                }
            };
            executorC4101jc.getClass();
            Intrinsics.checkNotNullParameter(runnable, "runnable");
            executorC4101jc.a.post(runnable);
            return;
        }
        GestureDetectorOnGestureListenerC4476xi gestureDetectorOnGestureListenerC4476xi2 = this.a;
        if (str2 == null) {
            str2 = "";
        }
        Lazy lazy2 = Oi.a;
        JSONObject a3 = AbstractC4318rj.a(str2, "targetViewId", "id", str2);
        a3.put(IronSourceConstants.EVENTS_ERROR_CODE, 302);
        gestureDetectorOnGestureListenerC4476xi2.a("showWebView", a3);
    }

    @JavascriptInterface
    public final void storePicture(@Nullable String str, @Nullable String str2) {
        InterfaceC4466x9 interfaceC4466x9 = this.c;
        if (interfaceC4466x9 != null) {
            String str3 = Ia.a;
            Intrinsics.checkNotNullExpressionValue(str3, "access$getTAG$p(...)");
            ((C4493y9) interfaceC4466x9).a(str3, "storePicture is deprecated and no-op. ");
        }
    }

    @JavascriptInterface
    public final void submitAdReport(@Nullable String str, @NotNull String adQualityUrl, @NotNull String enableUserAdReportScreenshot, @NotNull String templateInfo) {
        Intrinsics.checkNotNullParameter(adQualityUrl, "adQualityUrl");
        Intrinsics.checkNotNullParameter(enableUserAdReportScreenshot, "enableUserAdReportScreenshot");
        Intrinsics.checkNotNullParameter(templateInfo, "templateInfo");
        InterfaceC4466x9 interfaceC4466x9 = this.c;
        if (interfaceC4466x9 != null) {
            String str2 = Ia.a;
            Intrinsics.checkNotNullExpressionValue(str2, "access$getTAG$p(...)");
            ((C4493y9) interfaceC4466x9).a(str2, "submitAdReport called");
        }
        this.a.a(adQualityUrl, templateInfo, Intrinsics.areEqual(enableUserAdReportScreenshot, "1"));
    }

    @JavascriptInterface
    @NotNull
    public final String supports(@Nullable String str, @NotNull String feature) {
        Intrinsics.checkNotNullParameter(feature, "feature");
        InterfaceC4466x9 interfaceC4466x9 = this.c;
        if (interfaceC4466x9 != null) {
            String str2 = Ia.a;
            Intrinsics.checkNotNullExpressionValue(str2, "access$getTAG$p(...)");
            ((C4493y9) interfaceC4466x9).a(str2, "Checking support for: " + feature);
        }
        String valueOf = String.valueOf(this.a.n(feature));
        InterfaceC4466x9 interfaceC4466x92 = this.c;
        if (interfaceC4466x92 != null) {
            String str3 = Ia.a;
            Intrinsics.checkNotNullExpressionValue(str3, "access$getTAG$p(...)");
            ((C4493y9) interfaceC4466x92).c(str3, "Message:" + feature + " support: " + valueOf);
        }
        return valueOf;
    }

    @JavascriptInterface
    public final long timeSinceShow(@Nullable String str) {
        InterfaceC4466x9 interfaceC4466x9 = this.c;
        if (interfaceC4466x9 != null) {
            String str2 = Ia.a;
            Intrinsics.checkNotNullExpressionValue(str2, "access$getTAG$p(...)");
            ((C4493y9) interfaceC4466x9).a(str2, "timeSinceShow is called");
        }
        GestureDetectorOnGestureListenerC4476xi a = a();
        if (a != null) {
            return a.V();
        }
        InterfaceC4466x9 interfaceC4466x92 = this.c;
        if (interfaceC4466x92 == null) {
            return 0L;
        }
        String str3 = Ia.a;
        Intrinsics.checkNotNullExpressionValue(str3, "access$getTAG$p(...)");
        ((C4493y9) interfaceC4466x92).b(str3, "Found a null instance of ad render view!");
        return 0L;
    }

    @JavascriptInterface
    public final void unload(@Nullable String str) {
        InterfaceC4466x9 interfaceC4466x9 = this.c;
        if (interfaceC4466x9 != null) {
            String str2 = Ia.a;
            Intrinsics.checkNotNullExpressionValue(str2, "access$getTAG$p(...)");
            ((C4493y9) interfaceC4466x9).a(str2, "unload called");
        }
        GestureDetectorOnGestureListenerC4476xi a = a();
        if (a == null) {
            a = this.a;
        }
        try {
            a.E();
        } catch (Exception e) {
            a.a(str, "Unexpected error", "unload");
            Xb.a((byte) 1, "InMobi", "Failed to unload ad; SDK encountered an unexpected error");
            InterfaceC4466x9 interfaceC4466x92 = this.c;
            if (interfaceC4466x92 != null) {
                String str3 = Ia.a;
                Intrinsics.checkNotNullExpressionValue(str3, "access$getTAG$p(...)");
                ((C4493y9) interfaceC4466x92).b(str3, "SDK encountered an expected error in handling the unload() request from creative; " + e.getMessage());
            }
        }
    }

    @JavascriptInterface
    public final void unregisterBackButtonPressedEventListener(@Nullable String str) {
        InterfaceC4466x9 interfaceC4466x9 = this.c;
        if (interfaceC4466x9 != null) {
            String str2 = Ia.a;
            Intrinsics.checkNotNullExpressionValue(str2, "access$getTAG$p(...)");
            ((C4493y9) interfaceC4466x9).a(str2, "unregisterBackButtonPressedEventListener called");
        }
        GestureDetectorOnGestureListenerC4476xi gestureDetectorOnGestureListenerC4476xi = this.a;
        if (gestureDetectorOnGestureListenerC4476xi == null) {
            InterfaceC4466x9 interfaceC4466x92 = this.c;
            if (interfaceC4466x92 != null) {
                String str3 = Ia.a;
                Intrinsics.checkNotNullExpressionValue(str3, "access$getTAG$p(...)");
                ((C4493y9) interfaceC4466x92).b(str3, "Found a null instance of render view!");
                return;
            }
            return;
        }
        try {
            gestureDetectorOnGestureListenerC4476xi.X();
        } catch (Exception e) {
            this.a.a(str, "Unexpected error", "unregisterBackButtonPressedEventListener");
            InterfaceC4466x9 interfaceC4466x93 = this.c;
            if (interfaceC4466x93 != null) {
                String str4 = Ia.a;
                Intrinsics.checkNotNullExpressionValue(str4, "access$getTAG$p(...)");
                ((C4493y9) interfaceC4466x93).b(str4, "SDK encountered unexpected error in handling unregisterBackButtonPressedEventListener() request from creative; " + e.getMessage());
            }
        }
    }

    @JavascriptInterface
    public final void unregisterDeviceMuteEventListener(@Nullable String str) {
        InterfaceC4466x9 interfaceC4466x9 = this.c;
        if (interfaceC4466x9 != null) {
            String str2 = Ia.a;
            Intrinsics.checkNotNullExpressionValue(str2, "access$getTAG$p(...)");
            ((C4493y9) interfaceC4466x9).a(str2, "unregisterDeviceMuteEventListener called");
        }
        if (this.a == null) {
            InterfaceC4466x9 interfaceC4466x92 = this.c;
            if (interfaceC4466x92 != null) {
                String str3 = Ia.a;
                Intrinsics.checkNotNullExpressionValue(str3, "access$getTAG$p(...)");
                ((C4493y9) interfaceC4466x92).b(str3, "Found a null instance of render view!");
                return;
            }
            return;
        }
        InterfaceC4466x9 interfaceC4466x93 = this.c;
        if (interfaceC4466x93 != null) {
            String str4 = Ia.a;
            Intrinsics.checkNotNullExpressionValue(str4, "access$getTAG$p(...)");
            ((C4493y9) interfaceC4466x93).a(str4, "Unregister device mute event listener ...");
        }
        try {
            Jc mediaProcessor = this.a.getMediaProcessor();
            if (mediaProcessor != null) {
                C4206nc c4206nc = mediaProcessor.d;
                if (c4206nc != null) {
                    c4206nc.a();
                }
                mediaProcessor.d = null;
            }
        } catch (Exception e) {
            this.a.a(str, "Unexpected error", "unRegisterDeviceMuteEventListener");
            InterfaceC4466x9 interfaceC4466x94 = this.c;
            if (interfaceC4466x94 != null) {
                String str5 = Ia.a;
                Intrinsics.checkNotNullExpressionValue(str5, "access$getTAG$p(...)");
                ((C4493y9) interfaceC4466x94).b(str5, "SDK encountered unexpected error in handling unregisterDeviceMuteEventListener() request from creative; " + e.getMessage());
            }
        }
    }

    @JavascriptInterface
    public final void unregisterDeviceVolumeChangeEventListener(@Nullable String str) {
        InterfaceC4466x9 interfaceC4466x9 = this.c;
        if (interfaceC4466x9 != null) {
            String str2 = Ia.a;
            Intrinsics.checkNotNullExpressionValue(str2, "access$getTAG$p(...)");
            ((C4493y9) interfaceC4466x9).a(str2, "unregisterDeviceVolumeChangeEventListener called");
        }
        if (this.a == null) {
            InterfaceC4466x9 interfaceC4466x92 = this.c;
            if (interfaceC4466x92 != null) {
                String str3 = Ia.a;
                Intrinsics.checkNotNullExpressionValue(str3, "access$getTAG$p(...)");
                ((C4493y9) interfaceC4466x92).b(str3, "Found a null instance of render view!");
                return;
            }
            return;
        }
        InterfaceC4466x9 interfaceC4466x93 = this.c;
        if (interfaceC4466x93 != null) {
            String str4 = Ia.a;
            Intrinsics.checkNotNullExpressionValue(str4, "access$getTAG$p(...)");
            ((C4493y9) interfaceC4466x93).a(str4, "Unregister device volume change listener ...");
        }
        try {
            Jc mediaProcessor = this.a.getMediaProcessor();
            if (mediaProcessor != null) {
                C4206nc c4206nc = mediaProcessor.e;
                if (c4206nc != null) {
                    c4206nc.a();
                }
                mediaProcessor.e = null;
            }
        } catch (Exception e) {
            this.a.a(str, "Unexpected error", "unregisterDeviceVolumeChangeEventListener");
            InterfaceC4466x9 interfaceC4466x94 = this.c;
            if (interfaceC4466x94 != null) {
                String str5 = Ia.a;
                Intrinsics.checkNotNullExpressionValue(str5, "access$getTAG$p(...)");
                ((C4493y9) interfaceC4466x94).b(str5, "SDK encountered unexpected error in handling unregisterDeviceVolumeChangeEventListener() request from creative; " + e.getMessage());
            }
        }
    }

    @JavascriptInterface
    public final void unregisterHeadphonePluggedEventListener(@Nullable String str) {
        InterfaceC4466x9 interfaceC4466x9 = this.c;
        if (interfaceC4466x9 != null) {
            String str2 = Ia.a;
            Intrinsics.checkNotNullExpressionValue(str2, "access$getTAG$p(...)");
            ((C4493y9) interfaceC4466x9).a(str2, "unregisterHeadphonePluggedEventListener called");
        }
        if (this.a == null) {
            InterfaceC4466x9 interfaceC4466x92 = this.c;
            if (interfaceC4466x92 != null) {
                String str3 = Ia.a;
                Intrinsics.checkNotNullExpressionValue(str3, "access$getTAG$p(...)");
                ((C4493y9) interfaceC4466x92).b(str3, "Found a null instance of render view!");
                return;
            }
            return;
        }
        InterfaceC4466x9 interfaceC4466x93 = this.c;
        if (interfaceC4466x93 != null) {
            String str4 = Ia.a;
            Intrinsics.checkNotNullExpressionValue(str4, "access$getTAG$p(...)");
            ((C4493y9) interfaceC4466x93).a(str4, "Unregister headphone plugged event listener ...");
        }
        try {
            Jc mediaProcessor = this.a.getMediaProcessor();
            if (mediaProcessor != null) {
                C4206nc c4206nc = mediaProcessor.f;
                if (c4206nc != null) {
                    c4206nc.a();
                }
                mediaProcessor.f = null;
            }
        } catch (Exception e) {
            this.a.a(str, "Unexpected error", "unregisterHeadphonePluggedEventListener");
            InterfaceC4466x9 interfaceC4466x94 = this.c;
            if (interfaceC4466x94 != null) {
                String str5 = Ia.a;
                Intrinsics.checkNotNullExpressionValue(str5, "access$getTAG$p(...)");
                ((C4493y9) interfaceC4466x94).b(str5, "SDK encountered unexpected error in handling unregisterHeadphonePluggedEventListener() request from creative; " + e.getMessage());
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x005d, code lost:
    
        r12 = kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(com.inmobi.media.L9.f, null, null, new com.inmobi.media.Ga(r10, r3, r12, null), 3, null);
     */
    /* JADX WARN: Removed duplicated region for block: B:15:? A[RETURN, SYNTHETIC] */
    @JavascriptInterface
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void updateVideoPosition(@Nullable String str, @Nullable String str2) {
        VideoViewPosition videoViewPosition;
        Object launch$default;
        InterfaceC4466x9 interfaceC4466x9 = this.c;
        if (interfaceC4466x9 != null) {
            String str3 = Ia.a;
            Intrinsics.checkNotNullExpressionValue(str3, "access$getTAG$p(...)");
            ((C4493y9) interfaceC4466x9).a(str3, "updateVideoPosition is called with position - " + str2);
        }
        EnumC4071i8[] enumC4071i8Arr = EnumC4071i8.a;
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("errorMessage", "Invalid position");
        jSONObject.put("jsCommand", "updateVideoPlayerPosition");
        jSONObject.put("params", POBCommonConstants.NULL_VALUE);
        if (str2 != null) {
            Object obj = null;
            try {
                JSONObject jsonObject = new JSONObject(str2);
                Intrinsics.checkNotNullParameter(jsonObject, "jsonObject");
                Intrinsics.checkNotNullParameter(VideoViewPosition.class, "type");
                videoViewPosition = (VideoViewPosition) VideoViewPosition.class.cast(AbstractC4494ya.a(jsonObject, VideoViewPosition.class, null, null));
            } catch (JSONException e) {
                EnumC4465x8 enumC4465x8 = EnumC4465x8.b;
                a(str, jSONObject);
                InterfaceC4466x9 interfaceC4466x92 = this.c;
                if (interfaceC4466x92 != null) {
                    String str4 = Ia.a;
                    Intrinsics.checkNotNullExpressionValue(str4, "access$getTAG$p(...)");
                    ((C4493y9) interfaceC4466x92).a(str4, "Error while creating position Json.", e);
                    obj = Unit.INSTANCE;
                }
            }
            if (videoViewPosition != null && launch$default != null) {
                obj = launch$default;
                if (obj != null) {
                    return;
                }
            }
            EnumC4465x8 enumC4465x82 = EnumC4465x8.b;
            a(str, jSONObject);
            obj = Unit.INSTANCE;
            if (obj != null) {
            }
        }
        EnumC4465x8 enumC4465x83 = EnumC4465x8.b;
        a(str, jSONObject);
        Unit unit = Unit.INSTANCE;
    }

    @JavascriptInterface
    public final void useCustomClose(@Nullable final String str, final boolean z) {
        InterfaceC4466x9 interfaceC4466x9 = this.c;
        if (interfaceC4466x9 != null) {
            String str2 = Ia.a;
            Intrinsics.checkNotNullExpressionValue(str2, "access$getTAG$p(...)");
            ((C4493y9) interfaceC4466x9).a(str2, "useCustomClose called:" + z);
        }
        new Handler(this.a.getContainerContext().getMainLooper()).post(new Runnable() { // from class: com.inmobi.media.Ha$$ExternalSyntheticLambda20
            @Override // java.lang.Runnable
            public final void run() {
                Ha.b(Ha.this, z, str);
            }
        });
    }

    @JavascriptInterface
    public final void zoom(@NotNull String jsCallbackNamespace, final int i) {
        Intrinsics.checkNotNullParameter(jsCallbackNamespace, "jsCallbackNamespace");
        InterfaceC4466x9 interfaceC4466x9 = this.c;
        if (interfaceC4466x9 != null) {
            String str = Ia.a;
            Intrinsics.checkNotNullExpressionValue(str, "access$getTAG$p(...)");
            ((C4493y9) interfaceC4466x9).a(str, "zoom is called " + jsCallbackNamespace + " " + i);
        }
        AbstractC4214nk.a(new Runnable() { // from class: com.inmobi.media.Ha$$ExternalSyntheticLambda18
            @Override // java.lang.Runnable
            public final void run() {
                Ha.a(Ha.this, i);
            }
        });
    }

    public static String b(String str) {
        return "TEMPLATE_" + str;
    }

    @JavascriptInterface
    public final void fireAdFailed(@Nullable String str, @NotNull String errorCode) {
        Intrinsics.checkNotNullParameter(errorCode, "errorCode");
        try {
            InterfaceC4466x9 interfaceC4466x9 = this.c;
            if (interfaceC4466x9 != null) {
                String str2 = Ia.a;
                Intrinsics.checkNotNullExpressionValue(str2, "access$getTAG$p(...)");
                ((C4493y9) interfaceC4466x9).a(str2, "fireAdFailed called with ec " + errorCode + ".");
            }
            if (StringsKt.isBlank(errorCode)) {
                errorCode = "3100";
            }
            this.a.d(b(errorCode));
        } catch (Exception e) {
            this.a.a(str, "Unexpected error", "fireAdFailed");
            InterfaceC4466x9 interfaceC4466x92 = this.c;
            if (interfaceC4466x92 != null) {
                String str3 = Ia.a;
                Intrinsics.checkNotNullExpressionValue(str3, "access$getTAG$p(...)");
                ((C4493y9) interfaceC4466x92).b(str3, "SDK encountered unexpected error in handling fireAdFailed() signal from creative; " + e.getMessage());
            }
        }
    }

    public static final void b(Ha ha) {
        try {
            ha.a.H();
        } catch (Exception e) {
            InterfaceC4466x9 interfaceC4466x9 = ha.c;
            if (interfaceC4466x9 != null) {
                String str = Ia.a;
                Intrinsics.checkNotNullExpressionValue(str, "access$getTAG$p(...)");
                ((C4493y9) interfaceC4466x9).b(str, "SDK encountered unexpected error in getting/setting current position; " + e.getMessage());
            }
        }
    }

    public static final void b(final Ha ha, String json) {
        Vf op = ha.a.getOrientationProperties();
        Intrinsics.checkNotNullParameter(json, "json");
        Intrinsics.checkNotNullParameter(op, "op");
        final Vf vf = new Vf();
        vf.d = json;
        try {
            JSONObject jSONObject = new JSONObject(json);
            String optString = jSONObject.optString("forceOrientation", op.b);
            Intrinsics.checkNotNullExpressionValue(optString, "optString(...)");
            Intrinsics.checkNotNullParameter(optString, "<set-?>");
            vf.b = optString;
            vf.a = jSONObject.optBoolean("allowOrientationChange", op.a);
            String optString2 = jSONObject.optString("direction", op.c);
            Intrinsics.checkNotNullExpressionValue(optString2, "optString(...)");
            Intrinsics.checkNotNullParameter(optString2, "<set-?>");
            vf.c = optString2;
            if (!Intrinsics.areEqual(vf.b, "portrait") && !Intrinsics.areEqual(vf.b, "landscape")) {
                Intrinsics.checkNotNullParameter("none", "<set-?>");
                vf.b = "none";
            }
            if (!Intrinsics.areEqual(vf.c, "left") && !Intrinsics.areEqual(vf.c, "right")) {
                Intrinsics.checkNotNullParameter("right", "<set-?>");
                vf.c = "right";
            }
        } catch (JSONException unused) {
            vf = null;
        }
        if (vf != null) {
            ha.a.getWebViewFactory().a(new Function1() { // from class: com.inmobi.media.Ha$$ExternalSyntheticLambda13
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return Ha.a(Ha.this, vf, (GestureDetectorOnGestureListenerC4476xi) obj);
                }
            });
        }
    }

    public static final void c(Ha ha) {
        try {
            ha.a.I();
        } catch (Exception e) {
            InterfaceC4466x9 interfaceC4466x9 = ha.c;
            if (interfaceC4466x9 != null) {
                String str = Ia.a;
                Intrinsics.checkNotNullExpressionValue(str, "access$getTAG$p(...)");
                ((C4493y9) interfaceC4466x9).b(str, "SDK encountered unexpected error in getting/setting default position; " + e.getMessage());
            }
        }
    }

    public static final void c(Ha ha, String str) {
        try {
            ha.a.getSiblingWebviewManager().b(ha.a.getRoute().b, str);
        } catch (Exception e) {
            ha.a.a("showWebView", Oi.a(str, Sdk.SDKError.Reason.ASSET_FAILED_TO_DELETE_VALUE));
            InterfaceC4466x9 interfaceC4466x9 = ha.c;
            if (interfaceC4466x9 != null) {
                String str2 = Ia.a;
                Intrinsics.checkNotNullExpressionValue(str2, "access$getTAG$p(...)");
                ((C4493y9) interfaceC4466x9).b(str2, "SDK encountered unexpected error in handling showEndCard() request from creative; " + e.getMessage());
            }
        }
    }

    public final GestureDetectorOnGestureListenerC4476xi a() {
        if (!Intrinsics.areEqual(this.a.getRoute().b, "default")) {
            Jo webViewFactory = this.a.getWebViewFactory();
            webViewFactory.getClass();
            Intrinsics.checkNotNullParameter("default", "id");
            return (GestureDetectorOnGestureListenerC4476xi) webViewFactory.b.get("default");
        }
        return this.a;
    }

    public static final void b(Ha ha, boolean z, String str) {
        try {
            ha.a.f(z);
        } catch (Exception e) {
            ha.a.a(str, "Unexpected error", "useCustomClose");
            InterfaceC4466x9 interfaceC4466x9 = ha.c;
            if (interfaceC4466x9 != null) {
                String str2 = Ia.a;
                Intrinsics.checkNotNullExpressionValue(str2, "access$getTAG$p(...)");
                ((C4493y9) interfaceC4466x9).b(str2, "SDK encountered internal error in handling useCustomClose() request from creative; " + e.getMessage());
            }
        }
    }

    public static final void a(Ha ha, String str, String str2, String str3) {
        C4152lb c4152lb;
        C4178mb c4178mb = ha.a.getLandingPageHandler().f;
        if (c4178mb != null) {
            String a = AbstractC3914cb.a(str2);
            C4048hb landingPageHandler = ha.a.getLandingPageHandler();
            int i = landingPageHandler.i + 1;
            landingPageHandler.i = i;
            c4152lb = new C4152lb(c4178mb, a, i, SystemClock.elapsedRealtime());
        } else {
            c4152lb = null;
        }
        ha.a.getLandingPageHandler().a(Za.d, c4152lb, (Integer) null);
        ha.a.getLandingPageHandler().a("openInlineInstaller", str, str2, str3, c4152lb);
    }

    public static final void a(Ha ha, String str, String str2, float f, boolean z) {
        C4152lb c4152lb;
        C4178mb c4178mb = ha.a.getLandingPageHandler().f;
        if (c4178mb != null) {
            String a = AbstractC3914cb.a(str2);
            C4048hb landingPageHandler = ha.a.getLandingPageHandler();
            int i = landingPageHandler.i + 1;
            landingPageHandler.i = i;
            c4152lb = new C4152lb(c4178mb, a, i, SystemClock.elapsedRealtime());
        } else {
            c4152lb = null;
        }
        C4152lb c4152lb2 = c4152lb;
        if (c4152lb2 != null) {
            c4152lb2.f = "IN_NATIVE";
        }
        ha.a.getLandingPageHandler().a(Za.d, c4152lb2, (Integer) 8010);
        int a2 = ha.a.getLandingPageHandler().a("customExpandInNative", str, str2, c4152lb2, new U2(f, z));
        InterfaceC4466x9 interfaceC4466x9 = ha.c;
        if (interfaceC4466x9 != null) {
            String str3 = Ia.a;
            Intrinsics.checkNotNullExpressionValue(str3, "access$getTAG$p(...)");
            ((C4493y9) interfaceC4466x9).a(str3, "customExpandInNativeRequest: " + a2);
        }
        if (a2 == 3) {
            Z5 z5 = Z5.a;
            ha.a(str, str2, 0, f, !z, c4152lb2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void a(final String str, String str2, final int i, final float f, final boolean z, final C4152lb c4152lb) {
        final Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        ref$ObjectRef.element = str2;
        if (c4152lb != null) {
            c4152lb.f = "IN_CUSTOM";
        }
        new Handler(this.a.getContainerContext().getMainLooper()).post(new Runnable() { // from class: com.inmobi.media.Ha$$ExternalSyntheticLambda9
            @Override // java.lang.Runnable
            public final void run() {
                Ha.a(Ha.this, c4152lb, ref$ObjectRef, i, str, f, z);
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(Ha ha, C4152lb c4152lb, Ref$ObjectRef ref$ObjectRef, int i, String str, float f, boolean z) {
        try {
            if (ha.a.getEmbeddedBrowserJsCallbacks() == null) {
                InterfaceC4466x9 interfaceC4466x9 = ha.c;
                if (interfaceC4466x9 != null) {
                    String str2 = Ia.a;
                    Intrinsics.checkNotNullExpressionValue(str2, "access$getTAG$p(...)");
                    ((C4493y9) interfaceC4466x9).b(str2, "Found a null instance of EmbeddedBrowserJSCallback instance to customExpand");
                }
                ha.a.getLandingPageHandler().a(Za.e, c4152lb, (Integer) 8002);
                return;
            }
            InterfaceC4466x9 interfaceC4466x92 = ha.c;
            if (interfaceC4466x92 != null) {
                String str3 = Ia.a;
                Intrinsics.checkNotNullExpressionValue(str3, "access$getTAG$p(...)");
                ((C4493y9) interfaceC4466x92).a(str3, "Custom expand called. Url: " + ref$ObjectRef.element);
            }
            Z5 z5 = Z5.values()[i];
            if (z5 == Z5.a) {
                int a = ha.a.getLandingPageHandler().a("customExpand", str, (String) ref$ObjectRef.element, c4152lb, (U2) null);
                InterfaceC4466x9 interfaceC4466x93 = ha.c;
                if (interfaceC4466x93 != null) {
                    String str4 = Ia.a;
                    Intrinsics.checkNotNullExpressionValue(str4, "access$getTAG$p(...)");
                    ((C4493y9) interfaceC4466x93).a(str4, "processCustomExpandRequest: " + a);
                }
                if (a == 3) {
                    InterfaceC3857a6 embeddedBrowserJsCallbacks = ha.a.getEmbeddedBrowserJsCallbacks();
                    if (embeddedBrowserJsCallbacks != null) {
                        ((T8) embeddedBrowserJsCallbacks).a((String) ref$ObjectRef.element, z5, f, z, ha.a.getViewTouchTimestamp(), c4152lb);
                    }
                    ha.a.getLandingPageHandler().a(Za.f, c4152lb, (Integer) null);
                    Ya ya = ha.a.getLandingPageHandler().d;
                    if (ya != null) {
                        ya.b("customExpand", str, (String) ref$ObjectRef.element);
                        return;
                    }
                    return;
                }
                InterfaceC3857a6 embeddedBrowserJsCallbacks2 = ha.a.getEmbeddedBrowserJsCallbacks();
                if (embeddedBrowserJsCallbacks2 != null) {
                    V8.a(((T8) embeddedBrowserJsCallbacks2).a);
                    return;
                }
                return;
            }
            InterfaceC3857a6 embeddedBrowserJsCallbacks3 = ha.a.getEmbeddedBrowserJsCallbacks();
            if (embeddedBrowserJsCallbacks3 != null) {
                ((T8) embeddedBrowserJsCallbacks3).a((String) ref$ObjectRef.element, z5, f, z, ha.a.getViewTouchTimestamp(), c4152lb);
            }
            ha.a.getLandingPageHandler().a(Za.f, c4152lb, (Integer) null);
            Ya ya2 = ha.a.getLandingPageHandler().d;
            if (ya2 != null) {
                ya2.b("customExpand", str, (String) ref$ObjectRef.element);
            }
        } catch (Exception e) {
            ha.a.a(str, "Unexpected error", "customExpand");
            ha.a.getLandingPageHandler().a(Za.e, c4152lb, (Integer) 9);
            Xb.a((byte) 1, "InMobi", "Failed to custom expand ad; SDK encountered an unexpected error");
            InterfaceC4466x9 interfaceC4466x94 = ha.c;
            if (interfaceC4466x94 != null) {
                String str5 = Ia.a;
                Intrinsics.checkNotNullExpressionValue(str5, "access$getTAG$p(...)");
                ((C4493y9) interfaceC4466x94).b(str5, "SDK encountered unexpected error in handling customExpand() request; " + e.getMessage());
            }
        }
    }

    public static final void a(Ha ha) {
        if (ha.a.getEmbeddedBrowserJsCallbacks() == null) {
            InterfaceC4466x9 interfaceC4466x9 = ha.c;
            if (interfaceC4466x9 != null) {
                String str = Ia.a;
                Intrinsics.checkNotNullExpressionValue(str, "access$getTAG$p(...)");
                ((C4493y9) interfaceC4466x9).b(str, "Found a null instance of EmbeddedBrowserJSCallback instance to closeCustomExpand");
                return;
            }
            return;
        }
        InterfaceC3857a6 embeddedBrowserJsCallbacks = ha.a.getEmbeddedBrowserJsCallbacks();
        if (embeddedBrowserJsCallbacks != null) {
            V8.a(((T8) embeddedBrowserJsCallbacks).a);
        }
    }

    public static final Unit a(Ha ha, Vf vf, GestureDetectorOnGestureListenerC4476xi it) {
        Intrinsics.checkNotNullParameter(it, "it");
        if (it.P0) {
            InterfaceC4466x9 interfaceC4466x9 = ha.c;
            if (interfaceC4466x9 != null) {
                String str = Ia.a;
                Intrinsics.checkNotNullExpressionValue(str, "access$getTAG$p(...)");
                ((C4493y9) interfaceC4466x9).b(str, "setOrientationProperties called on unloaded ad");
            }
            return Unit.INSTANCE;
        }
        it.a(vf);
        return Unit.INSTANCE;
    }

    public static final void a(GestureDetectorOnGestureListenerC4476xi gestureDetectorOnGestureListenerC4476xi, Ha ha, String str) {
        try {
            gestureDetectorOnGestureListenerC4476xi.n();
        } catch (Exception e) {
            ha.a.a(str, "Unexpected error", "close");
            Xb.a((byte) 1, "InMobi", "Failed to close ad; SDK encountered an unexpected error");
            InterfaceC4466x9 interfaceC4466x9 = ha.c;
            if (interfaceC4466x9 != null) {
                String str2 = Ia.a;
                Intrinsics.checkNotNullExpressionValue(str2, "access$getTAG$p(...)");
                ((C4493y9) interfaceC4466x9).b(str2, "SDK encountered an expected error in handling the close() request from creative; " + e.getMessage());
            }
        }
    }

    public static final Unit a(Ha ha, InterfaceC3892bf response) {
        Intrinsics.checkNotNullParameter(response, "response");
        if (Fl.a(response)) {
            InterfaceC4466x9 interfaceC4466x9 = ha.c;
            if (interfaceC4466x9 != null) {
                String str = Ia.a;
                Intrinsics.checkNotNullExpressionValue(str, "access$getTAG$p(...)");
                ((C4493y9) interfaceC4466x9).a(str, "asyncPing Successful");
            }
        } else {
            InterfaceC4466x9 interfaceC4466x92 = ha.c;
            if (interfaceC4466x92 != null) {
                String str2 = Ia.a;
                Intrinsics.checkNotNullExpressionValue(str2, "access$getTAG$p(...)");
                ((C4493y9) interfaceC4466x92).b(str2, "asyncPing Failed");
            }
        }
        return Unit.INSTANCE;
    }

    public static final void a(Ha ha, boolean z, String str) {
        try {
            ha.a.e(z);
        } catch (Exception e) {
            ha.a.a(str, "Unexpected error", "disableCloseRegion");
            InterfaceC4466x9 interfaceC4466x9 = ha.c;
            if (interfaceC4466x9 != null) {
                String str2 = Ia.a;
                Intrinsics.checkNotNullExpressionValue(str2, "access$getTAG$p(...)");
                ((C4493y9) interfaceC4466x9).b(str2, "SDK encountered unexpected error in handling disableCloseRegion() request from creative; " + e.getMessage());
            }
        }
    }

    public static final Unit a(boolean z, GestureDetectorOnGestureListenerC4476xi it) {
        Intrinsics.checkNotNullParameter(it, "it");
        it.setDisableBackButton(z);
        return Unit.INSTANCE;
    }

    public static final void a(Ha ha, int i) {
        ha.a.setInitialScale(i);
    }

    public static final void a(Ha ha, String str, String str2) {
        try {
            ha.a.getSiblingWebviewManager().a(ha.a.getRoute().b, str, str2);
        } catch (Exception e) {
            ha.a.a("loadWebView", Oi.a(str, 308));
            InterfaceC4466x9 interfaceC4466x9 = ha.c;
            if (interfaceC4466x9 != null) {
                String str3 = Ia.a;
                Intrinsics.checkNotNullExpressionValue(str3, "access$getTAG$p(...)");
                ((C4493y9) interfaceC4466x9).b(str3, "SDK encountered unexpected error in handling loadWebView() request from creative; " + e.getMessage());
            }
        }
    }

    public static final void a(Ha ha, String str) {
        try {
            ha.a.getSiblingWebviewManager().a(ha.a.getRoute().b, str);
        } catch (Exception e) {
            ha.a.a("destroyWebView", Oi.a(str, Sdk.SDKError.Reason.MRAID_JS_CALL_EMPTY_VALUE));
            InterfaceC4466x9 interfaceC4466x9 = ha.c;
            if (interfaceC4466x9 != null) {
                String str2 = Ia.a;
                Intrinsics.checkNotNullExpressionValue(str2, "access$getTAG$p(...)");
                ((C4493y9) interfaceC4466x9).b(str2, "SDK encountered unexpected error in handling destroyWebView() request from creative; " + e.getMessage());
            }
        }
    }

    public final void a(String str, JSONObject jSONObject) {
        InterfaceC4466x9 interfaceC4466x9 = this.c;
        if (interfaceC4466x9 != null) {
            String str2 = Ia.a;
            Intrinsics.checkNotNullExpressionValue(str2, "access$getTAG$p(...)");
            ((C4493y9) interfaceC4466x9).a(str2, "fireVideoError " + this + " - " + jSONObject);
        }
        if (str != null) {
            this.a.a(str, "broadcastEvent('VideoCommandError'," + jSONObject + ")");
        }
    }
}
