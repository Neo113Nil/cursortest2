package com.inmobi.media;

import android.content.Context;
import com.inmobi.media.core.config.models.AdConfig;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes12.dex */
public final class Jo {
    public final InterfaceC4466x9 a;
    public final ConcurrentHashMap b = new ConcurrentHashMap();

    public Jo(InterfaceC4466x9 interfaceC4466x9) {
        this.a = interfaceC4466x9;
    }

    public final void a(GestureDetectorOnGestureListenerC4476xi gestureDetectorOnGestureListenerC4476xi, String str) {
        this.b.put(str, gestureDetectorOnGestureListenerC4476xi);
        InterfaceC4466x9 interfaceC4466x9 = this.a;
        if (interfaceC4466x9 != null) {
            ((C4493y9) interfaceC4466x9).a("SiblingWebViewManager", "Registered bridge for WebView ID: " + str);
        }
    }

    public final void b(Function1 action) {
        Intrinsics.checkNotNullParameter(action, "action");
        ConcurrentHashMap concurrentHashMap = this.b;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : concurrentHashMap.entrySet()) {
            if (((GestureDetectorOnGestureListenerC4476xi) entry.getValue()) instanceof Fi) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        Iterator it = linkedHashMap.entrySet().iterator();
        while (it.hasNext()) {
            GestureDetectorOnGestureListenerC4476xi gestureDetectorOnGestureListenerC4476xi = (GestureDetectorOnGestureListenerC4476xi) ((Map.Entry) it.next()).getValue();
            Intrinsics.checkNotNull(gestureDetectorOnGestureListenerC4476xi, "null cannot be cast to non-null type com.inmobi.ads.containers.companions.RenderViewSibling");
            action.invoke((Fi) gestureDetectorOnGestureListenerC4476xi);
        }
    }

    public final void a(String id) {
        Intrinsics.checkNotNullParameter(id, "id");
        this.b.remove(id);
        InterfaceC4466x9 interfaceC4466x9 = this.a;
        if (interfaceC4466x9 != null) {
            ((C4493y9) interfaceC4466x9).a("SiblingWebViewManager", "Unregistered bridge for WebView ID: " + id);
        }
    }

    public final void a(Function1 action) {
        Intrinsics.checkNotNullParameter(action, "action");
        GestureDetectorOnGestureListenerC4476xi gestureDetectorOnGestureListenerC4476xi = (GestureDetectorOnGestureListenerC4476xi) this.b.get("default");
        if (gestureDetectorOnGestureListenerC4476xi != null) {
            action.invoke(gestureDetectorOnGestureListenerC4476xi);
        }
        ConcurrentHashMap concurrentHashMap = this.b;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : concurrentHashMap.entrySet()) {
            if (!Intrinsics.areEqual(entry.getKey(), "default")) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        Iterator it = linkedHashMap.entrySet().iterator();
        while (it.hasNext()) {
            action.invoke((GestureDetectorOnGestureListenerC4476xi) ((Map.Entry) it.next()).getValue());
        }
    }

    public final GestureDetectorOnGestureListenerC4476xi a(Yi route, Context context, short s, C4221o0 adMetaData, AdConfig adConfig) {
        Yi yi;
        GestureDetectorOnGestureListenerC4476xi fi;
        Intrinsics.checkNotNullParameter(route, "route");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(adMetaData, "adMetaData");
        Intrinsics.checkNotNullParameter(adConfig, "adConfig");
        if (s == 0) {
            InterfaceC4466x9 interfaceC4466x9 = this.a;
            if (interfaceC4466x9 != null) {
                ((C4493y9) interfaceC4466x9).a("SiblingWebViewManager", "Creating standard WebView with ID: " + route.b);
            }
            fi = new GestureDetectorOnGestureListenerC4476xi(context, adMetaData.o, adMetaData.p, adMetaData.q, adMetaData.r, 0L, adMetaData.s, adMetaData.t, route, this, adMetaData, adConfig, 80);
            yi = route;
        } else if (s == 1) {
            InterfaceC4466x9 interfaceC4466x92 = this.a;
            yi = route;
            if (interfaceC4466x92 != null) {
                ((C4493y9) interfaceC4466x92).a("SiblingWebViewManager", "Creating Sibling WebView with ID: " + yi.b);
            }
            fi = new Fi(context, adMetaData.o, adMetaData.t, C4221o0.a(adMetaData, null, 4194047), this, route, adConfig);
        } else {
            InterfaceC4466x9 interfaceC4466x93 = this.a;
            if (interfaceC4466x93 != null) {
                ((C4493y9) interfaceC4466x93).b("SiblingWebViewManager", "Unsupported WebView type: " + ((int) s));
            }
            throw new IllegalArgumentException("Unsupported WebView type: " + ((int) s));
        }
        a(fi, yi.b);
        return fi;
    }
}
