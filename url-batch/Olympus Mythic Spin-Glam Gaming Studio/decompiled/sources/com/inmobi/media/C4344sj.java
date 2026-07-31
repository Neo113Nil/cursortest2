package com.inmobi.media;

import android.app.Activity;
import android.content.Context;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.RelativeLayout;
import com.iab.omid.library.inmobi.adsession.FriendlyObstructionPurpose;
import com.inmobi.ads.rendering.InMobiAdActivity;
import com.inmobi.media.ads.network.common.model.InlineParams;
import com.ironsource.C4643f8;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.pubmatic.sdk.video.POBVastError;
import com.vungle.ads.internal.protos.Sdk;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import kotlin.Lazy;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* renamed from: com.inmobi.media.sj, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4344sj {
    public final Jo a;
    public final InterfaceC4466x9 b;

    public C4344sj(Jo wvFactory, InterfaceC4466x9 interfaceC4466x9) {
        Intrinsics.checkNotNullParameter(wvFactory, "wvFactory");
        this.a = wvFactory;
        this.b = interfaceC4466x9;
    }

    public final GestureDetectorOnGestureListenerC4476xi a() {
        GestureDetectorOnGestureListenerC4476xi a = a("default");
        if (a != null) {
            return a;
        }
        InterfaceC4466x9 interfaceC4466x9 = this.b;
        if (interfaceC4466x9 != null) {
            Intrinsics.checkNotNullExpressionValue("sj", "TAG");
            ((C4493y9) interfaceC4466x9).b("sj", "AdRenderView is null, cannot initialize webview.");
        }
        return null;
    }

    public final void b(String sourceId, String targetId) {
        Object obj;
        Integer a;
        Intrinsics.checkNotNullParameter(sourceId, "sourceId");
        Intrinsics.checkNotNullParameter(targetId, "targetId");
        InterfaceC4466x9 interfaceC4466x9 = this.b;
        if (interfaceC4466x9 != null) {
            Intrinsics.checkNotNullExpressionValue("sj", "TAG");
            ((C4493y9) interfaceC4466x9).a("sj", "showWebView " + this);
        }
        GestureDetectorOnGestureListenerC4476xi a2 = a(sourceId);
        if (a2 == null) {
            return;
        }
        GestureDetectorOnGestureListenerC4476xi a3 = a(targetId);
        if (a3 == null) {
            Lazy lazy = Oi.a;
            JSONObject a4 = AbstractC4318rj.a(targetId, "targetViewId", "id", targetId);
            a4.put(IronSourceConstants.EVENTS_ERROR_CODE, 304);
            a2.a("showWebView", a4);
            return;
        }
        if (Intrinsics.areEqual(targetId, "default")) {
            a(a2, targetId, "showWebView");
            return;
        }
        if (!(a3 instanceof Fi)) {
            Lazy lazy2 = Oi.a;
            JSONObject a5 = AbstractC4318rj.a(targetId, "targetViewId", "id", targetId);
            a5.put(IronSourceConstants.EVENTS_ERROR_CODE, Sdk.SDKError.Reason.MRAID_BRIDGE_ERROR_VALUE);
            a2.a("showWebView", a5);
            return;
        }
        GestureDetectorOnGestureListenerC4476xi a6 = a();
        if (a6 != null && !a6.isAttachedToWindow()) {
            Lazy lazy3 = Oi.a;
            JSONObject a7 = AbstractC4318rj.a(targetId, "targetViewId", "id", targetId);
            a7.put(IronSourceConstants.EVENTS_ERROR_CODE, Sdk.SDKError.Reason.MRAID_BRIDGE_ERROR_VALUE);
            a2.a("showWebView", a7);
            return;
        }
        Integer a8 = a3.getWvStateMachine().a(5);
        if (a8 != null) {
            int intValue = a8.intValue();
            Lazy lazy4 = Oi.a;
            JSONObject a9 = AbstractC4318rj.a(targetId, "targetViewId", "id", targetId);
            a9.put(IronSourceConstants.EVENTS_ERROR_CODE, intValue);
            a2.a("showWebView", a9);
            return;
        }
        Iterator it = MapsKt.toMap(this.a.b).values().iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            GestureDetectorOnGestureListenerC4476xi gestureDetectorOnGestureListenerC4476xi = (GestureDetectorOnGestureListenerC4476xi) obj;
            if (gestureDetectorOnGestureListenerC4476xi.getWvStateMachine().b == 105 && !Intrinsics.areEqual(gestureDetectorOnGestureListenerC4476xi, a3) && !Intrinsics.areEqual(gestureDetectorOnGestureListenerC4476xi.getRoute().b, "default")) {
                break;
            }
        }
        GestureDetectorOnGestureListenerC4476xi gestureDetectorOnGestureListenerC4476xi2 = (GestureDetectorOnGestureListenerC4476xi) obj;
        if (gestureDetectorOnGestureListenerC4476xi2 != null && (a = gestureDetectorOnGestureListenerC4476xi2.getWvStateMachine().a(7)) != null) {
            int intValue2 = a.intValue();
            Lazy lazy5 = Oi.a;
            JSONObject a10 = AbstractC4318rj.a(targetId, "targetViewId", "id", targetId);
            a10.put(IronSourceConstants.EVENTS_ERROR_CODE, intValue2);
            a2.a("showWebView", a10);
        }
        Fi fi = (Fi) a3;
        if (fi.isAttachedToWindow()) {
            a(a3, a2, targetId);
            return;
        }
        a(a2, fi);
        a(a3);
        AbstractC4008fo viewableAd = fi.getViewableAd();
        Map<View, FriendlyObstructionPurpose> friendlyViews = a3.getFriendlyViews();
        if (friendlyViews == null) {
            friendlyViews = new HashMap<>();
        }
        viewableAd.a(friendlyViews);
    }

    public final GestureDetectorOnGestureListenerC4476xi a(String id) {
        Jo jo = this.a;
        jo.getClass();
        Intrinsics.checkNotNullParameter(id, "id");
        GestureDetectorOnGestureListenerC4476xi gestureDetectorOnGestureListenerC4476xi = (GestureDetectorOnGestureListenerC4476xi) jo.b.get(id);
        if (gestureDetectorOnGestureListenerC4476xi != null) {
            return gestureDetectorOnGestureListenerC4476xi;
        }
        InterfaceC4466x9 interfaceC4466x9 = this.b;
        if (interfaceC4466x9 == null) {
            return null;
        }
        Intrinsics.checkNotNullExpressionValue("sj", "TAG");
        ((C4493y9) interfaceC4466x9).b("sj", "View with ID: " + id + " not found.");
        return null;
    }

    public final void a(GestureDetectorOnGestureListenerC4476xi gestureDetectorOnGestureListenerC4476xi, Fi fi) {
        InterfaceC4466x9 interfaceC4466x9 = this.b;
        if (interfaceC4466x9 != null) {
            Intrinsics.checkNotNullExpressionValue("sj", "TAG");
            ((C4493y9) interfaceC4466x9).a("sj", "setUpLayoutForAd " + this);
        }
        GestureDetectorOnGestureListenerC4476xi a = a();
        Context containerContext = a != null ? a.getContainerContext() : null;
        if (containerContext == null) {
            InterfaceC4466x9 interfaceC4466x92 = this.b;
            if (interfaceC4466x92 != null) {
                Intrinsics.checkNotNullExpressionValue("sj", "TAG");
                ((C4493y9) interfaceC4466x92).b("sj", "Context is null, cannot initialize webview.");
            }
            containerContext = null;
        }
        if (containerContext == null) {
            return;
        }
        if (!(containerContext instanceof InMobiAdActivity)) {
            InterfaceC4466x9 interfaceC4466x93 = this.b;
            if (interfaceC4466x93 != null) {
                Intrinsics.checkNotNullExpressionValue("sj", "TAG");
                ((C4493y9) interfaceC4466x93).b("sj", "Context is not an instance of InMobiAdActivity.");
            }
            a(gestureDetectorOnGestureListenerC4476xi, fi.getRoute().b, "loadWebView");
            return;
        }
        fi.setFullScreenActivityContext((Activity) containerContext);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
        layoutParams.addRule(10);
        InterfaceC4466x9 interfaceC4466x94 = this.b;
        if (interfaceC4466x94 != null) {
            Intrinsics.checkNotNullExpressionValue("sj", "TAG");
            ((C4493y9) interfaceC4466x94).a("sj", "target View's Viewable ad - " + fi.getViewableAd());
        }
        View c = fi.getViewableAd().c();
        ViewGroup viewGroup = (ViewGroup) ((InMobiAdActivity) containerContext).findViewById(65534);
        Context context = viewGroup.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        RelativeLayout relativeLayout = new RelativeLayout(context);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-1, -1);
        if ((c != null ? c.getParent() : null) != null) {
            ViewParent parent = c.getParent();
            ViewGroup viewGroup2 = parent instanceof ViewGroup ? (ViewGroup) parent : null;
            if (viewGroup2 != null) {
                viewGroup2.removeView(c);
            }
        }
        relativeLayout.addView(c, layoutParams2);
        viewGroup.addView(relativeLayout, layoutParams);
        fi.a(relativeLayout);
        InterfaceC4466x9 interfaceC4466x95 = this.b;
        if (interfaceC4466x95 != null) {
            Intrinsics.checkNotNullExpressionValue("sj", "TAG");
            ((C4493y9) interfaceC4466x95).a("sj", "Target View added - the inflatedView is - " + c);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v6, types: [android.view.ViewGroup] */
    public final void a(GestureDetectorOnGestureListenerC4476xi gestureDetectorOnGestureListenerC4476xi) {
        AbstractC4008fo viewableAd;
        InterfaceC4466x9 interfaceC4466x9 = this.b;
        if (interfaceC4466x9 != null) {
            Intrinsics.checkNotNullExpressionValue("sj", "TAG");
            ((C4493y9) interfaceC4466x9).a("sj", "Add renderViewSibling as friendlyView for omsdkTracking  " + this);
        }
        ViewParent parent = gestureDetectorOnGestureListenerC4476xi.getParent();
        GestureDetectorOnGestureListenerC4476xi gestureDetectorOnGestureListenerC4476xi2 = parent instanceof ViewGroup ? (ViewGroup) parent : null;
        if (gestureDetectorOnGestureListenerC4476xi2 != null) {
            gestureDetectorOnGestureListenerC4476xi = gestureDetectorOnGestureListenerC4476xi2;
        }
        GestureDetectorOnGestureListenerC4476xi a = a();
        if (a == null || (viewableAd = a.getViewableAd()) == null) {
            return;
        }
        viewableAd.a(gestureDetectorOnGestureListenerC4476xi, FriendlyObstructionPurpose.OTHER);
    }

    public final void a(String sourceId, String targetId, String html) {
        Context context;
        GestureDetectorOnGestureListenerC4476xi a;
        Intrinsics.checkNotNullParameter(sourceId, "sourceId");
        Intrinsics.checkNotNullParameter(targetId, "targetId");
        Intrinsics.checkNotNullParameter(html, "html");
        InterfaceC4466x9 interfaceC4466x9 = this.b;
        if (interfaceC4466x9 != null) {
            Intrinsics.checkNotNullExpressionValue("sj", "TAG");
            ((C4493y9) interfaceC4466x9).a("sj", "loadWebView " + this);
        }
        GestureDetectorOnGestureListenerC4476xi a2 = a();
        Context containerContext = a2 != null ? a2.getContainerContext() : null;
        if (containerContext == null) {
            InterfaceC4466x9 interfaceC4466x92 = this.b;
            if (interfaceC4466x92 != null) {
                Intrinsics.checkNotNullExpressionValue("sj", "TAG");
                ((C4493y9) interfaceC4466x92).b("sj", "Context is null, cannot initialize webview.");
            }
            context = null;
        } else {
            context = containerContext;
        }
        if (context == null || (a = a(sourceId)) == null) {
            return;
        }
        if (Intrinsics.areEqual(targetId, "default")) {
            a(a, targetId, "loadWebView");
            return;
        }
        GestureDetectorOnGestureListenerC4476xi a3 = a();
        if (a3 == null) {
            a.a("loadWebView", Oi.a(targetId, 304));
            return;
        }
        GestureDetectorOnGestureListenerC4476xi a4 = a(targetId);
        if (a4 != null) {
            int i = a4.getWvStateMachine().b;
            Lazy lazy = Oi.a;
            JSONObject a5 = AbstractC4318rj.a(targetId, "targetViewId", "id", targetId);
            a5.put(IronSourceConstants.EVENTS_ERROR_CODE, i);
            a.a("loadWebView", a5);
            return;
        }
        Fi a6 = a(a3, targetId, this, a, context, SystemClock.elapsedRealtime());
        if (a6 != null) {
            a6.i(html);
        }
    }

    public static final Fi a(GestureDetectorOnGestureListenerC4476xi gestureDetectorOnGestureListenerC4476xi, String str, C4344sj c4344sj, GestureDetectorOnGestureListenerC4476xi gestureDetectorOnGestureListenerC4476xi2, Context context, long j) {
        C4221o0 c4221o0;
        C4221o0 c4221o02;
        Bi bi;
        C4221o0 adMetaData = gestureDetectorOnGestureListenerC4476xi.getAdMetaData();
        if (adMetaData != null) {
            Bi bi2 = gestureDetectorOnGestureListenerC4476xi.getAdMetaData().s;
            if (bi2 != null) {
                C4431w0 placement = bi2.a;
                String markupType = bi2.b;
                String impressionId = bi2.c;
                String telemetryMetadataBlob = bi2.d;
                int i = bi2.e;
                String creativeType = bi2.f;
                String creativeId = bi2.g;
                boolean z = bi2.h;
                int i2 = bi2.i;
                C4299r1 c4299r1 = bi2.j;
                Gi gi = bi2.k;
                InlineParams inlineParams = bi2.m;
                Intrinsics.checkNotNullParameter(placement, "placement");
                Intrinsics.checkNotNullParameter(markupType, "markupType");
                Intrinsics.checkNotNullParameter(impressionId, "impressionId");
                Intrinsics.checkNotNullParameter(telemetryMetadataBlob, "telemetryMetadataBlob");
                Intrinsics.checkNotNullParameter(creativeType, "creativeType");
                Intrinsics.checkNotNullParameter(creativeId, "creativeId");
                c4221o02 = adMetaData;
                bi = new Bi(placement, markupType, impressionId, telemetryMetadataBlob, i, creativeType, creativeId, z, i2, c4299r1, gi, str, inlineParams);
            } else {
                c4221o02 = adMetaData;
                bi = null;
            }
            c4221o0 = C4221o0.a(c4221o02, bi, 3665663);
        } else {
            c4221o0 = null;
        }
        if (c4221o0 == null) {
            InterfaceC4466x9 interfaceC4466x9 = c4344sj.b;
            if (interfaceC4466x9 != null) {
                Intrinsics.checkNotNullExpressionValue("sj", "TAG");
                ((C4493y9) interfaceC4466x9).b("sj", "AdMetaData is null, cannot initialize webview.");
            }
            return null;
        }
        GestureDetectorOnGestureListenerC4476xi a = c4344sj.a.a(new Yi(gestureDetectorOnGestureListenerC4476xi2.getRoute().b, str), context, (short) 1, c4221o0, gestureDetectorOnGestureListenerC4476xi.getAdConfig());
        Fi fi = a instanceof Fi ? (Fi) a : null;
        if (fi == null) {
            InterfaceC4466x9 interfaceC4466x92 = c4344sj.b;
            if (interfaceC4466x92 != null) {
                Intrinsics.checkNotNullExpressionValue("sj", "TAG");
                ((C4493y9) interfaceC4466x92).b("sj", "Failed to create Sibling WebView with ID: " + str);
            }
            gestureDetectorOnGestureListenerC4476xi2.a("loadWebView", Oi.a(str, Sdk.SDKError.Reason.EVALUATE_JAVASCRIPT_FAILED_VALUE));
            return null;
        }
        Integer a2 = fi.getWvStateMachine().a(1);
        if (a2 != null) {
            gestureDetectorOnGestureListenerC4476xi2.a("loadWebView", Oi.a(str, a2.intValue()));
        }
        fi.Z();
        Hi renderViewTelemetry = fi.getRenderViewTelemetry();
        if (renderViewTelemetry != null) {
            renderViewTelemetry.b = j;
        }
        return fi;
    }

    public final void a(String sourceId, String targetId) {
        Intrinsics.checkNotNullParameter(sourceId, "sourceId");
        Intrinsics.checkNotNullParameter(targetId, "targetId");
        GestureDetectorOnGestureListenerC4476xi a = a(sourceId);
        if (a == null) {
            return;
        }
        GestureDetectorOnGestureListenerC4476xi a2 = a(targetId);
        if (a2 == null) {
            Lazy lazy = Oi.a;
            JSONObject a3 = AbstractC4318rj.a(targetId, "targetViewId", "id", targetId);
            a3.put(IronSourceConstants.EVENTS_ERROR_CODE, 304);
            a.a("destroyWebView", a3);
            return;
        }
        if (Intrinsics.areEqual(targetId, "default")) {
            a(a, targetId, "destroyWebView");
            return;
        }
        Integer a4 = a2.getWvStateMachine().a(8);
        if (a4 != null) {
            int intValue = a4.intValue();
            Lazy lazy2 = Oi.a;
            JSONObject a5 = AbstractC4318rj.a(targetId, "targetViewId", "id", targetId);
            a5.put(IronSourceConstants.EVENTS_ERROR_CODE, intValue);
            a.a("destroyWebView", a5);
            return;
        }
        a2.b();
        a.a(a, targetId);
        InterfaceC4466x9 interfaceC4466x9 = this.b;
        if (interfaceC4466x9 != null) {
            Intrinsics.checkNotNullExpressionValue("sj", "TAG");
            ((C4493y9) interfaceC4466x9).a("sj", "WebView with ID: " + targetId + " removed from parent.");
        }
    }

    public final void a(GestureDetectorOnGestureListenerC4476xi gestureDetectorOnGestureListenerC4476xi, String str, String str2) {
        InterfaceC4466x9 interfaceC4466x9 = this.b;
        if (interfaceC4466x9 != null) {
            Intrinsics.checkNotNullExpressionValue("sj", "TAG");
            ((C4493y9) interfaceC4466x9).b("sj", "Cannot perform operations on default WebView with ID: " + str);
        }
        gestureDetectorOnGestureListenerC4476xi.a(str2, Oi.a(str, POBVastError.NO_VAST_RESPONSE));
    }

    public final void a(GestureDetectorOnGestureListenerC4476xi gestureDetectorOnGestureListenerC4476xi, GestureDetectorOnGestureListenerC4476xi gestureDetectorOnGestureListenerC4476xi2, String str) {
        ViewParent parent = gestureDetectorOnGestureListenerC4476xi.getParent();
        ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
        if (viewGroup == null) {
            viewGroup = gestureDetectorOnGestureListenerC4476xi;
        }
        ViewParent parent2 = viewGroup.getParent();
        ViewGroup viewGroup2 = parent2 instanceof ViewGroup ? (ViewGroup) parent2 : null;
        if (viewGroup2 == null) {
            gestureDetectorOnGestureListenerC4476xi2.a("showWebView", Oi.a(str, 307));
            return;
        }
        if (viewGroup2.indexOfChild(viewGroup) != -1) {
            viewGroup2.bringChildToFront(viewGroup);
            InterfaceC4466x9 interfaceC4466x9 = this.b;
            if (interfaceC4466x9 != null) {
                Intrinsics.checkNotNullExpressionValue("sj", "TAG");
                ((C4493y9) interfaceC4466x9).a("sj", "Sibling view brought to front: " + gestureDetectorOnGestureListenerC4476xi);
            }
        } else {
            InterfaceC4466x9 interfaceC4466x92 = this.b;
            if (interfaceC4466x92 != null) {
                Intrinsics.checkNotNullExpressionValue("sj", "TAG");
                ((C4493y9) interfaceC4466x92).b("sj", "Sibling view not found in parent: " + gestureDetectorOnGestureListenerC4476xi);
            }
        }
        gestureDetectorOnGestureListenerC4476xi2.c(gestureDetectorOnGestureListenerC4476xi2, str);
    }

    public final void b(String sourceId, String targetId, String message) {
        Intrinsics.checkNotNullParameter(sourceId, "sourceId");
        Intrinsics.checkNotNullParameter(targetId, "targetId");
        Intrinsics.checkNotNullParameter(message, "message");
        GestureDetectorOnGestureListenerC4476xi a = a(sourceId);
        if (a == null) {
            return;
        }
        GestureDetectorOnGestureListenerC4476xi a2 = a(targetId);
        if (a2 == null) {
            Lazy lazy = Oi.a;
            JSONObject a3 = AbstractC4318rj.a(targetId, "targetViewId", "id", targetId);
            a3.put(IronSourceConstants.EVENTS_ERROR_CODE, 304);
            a.a(C4643f8.j, a3);
            return;
        }
        int i = a2.getWvStateMachine().b;
        if (!Intrinsics.areEqual(a2.getRoute().b, "default") && CollectionsKt.listOf((Object[]) new Integer[]{101, 104, 107}).contains(Integer.valueOf(i))) {
            InterfaceC4466x9 interfaceC4466x9 = this.b;
            if (interfaceC4466x9 != null) {
                Intrinsics.checkNotNullExpressionValue("sj", "TAG");
                ((C4493y9) interfaceC4466x9).b("sj", "WebView is not in state to receive messages: " + targetId);
            }
            int i2 = a2.getWvStateMachine().b;
            Lazy lazy2 = Oi.a;
            JSONObject a4 = AbstractC4318rj.a(targetId, "targetViewId", "id", targetId);
            a4.put(IronSourceConstants.EVENTS_ERROR_CODE, i2);
            a.a(C4643f8.j, a4);
            return;
        }
        InterfaceC4466x9 interfaceC4466x92 = this.b;
        if (interfaceC4466x92 != null) {
            Intrinsics.checkNotNullExpressionValue("sj", "TAG");
            ((C4493y9) interfaceC4466x92).a("sj", "Sending message to WebView ID: " + targetId);
        }
        a2.h(message);
    }
}
