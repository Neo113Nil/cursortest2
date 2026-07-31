package com.inmobi.media;

import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.inmobi.media.wi, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4449wi extends To {
    public final /* synthetic */ GestureDetectorOnGestureListenerC4476xi a;

    public C4449wi(GestureDetectorOnGestureListenerC4476xi gestureDetectorOnGestureListenerC4476xi) {
        this.a = gestureDetectorOnGestureListenerC4476xi;
    }

    @Override // com.inmobi.media.To
    public final boolean a() {
        return !Intrinsics.areEqual("Hidden", this.a.getViewState());
    }

    @Override // com.inmobi.media.To
    public final void a(Tf orientation, Vo finalInsets) {
        GestureDetectorOnGestureListenerC4476xi renderView;
        Intrinsics.checkNotNullParameter(orientation, "orientation");
        Intrinsics.checkNotNullParameter(finalInsets, "finalInsets");
        this.a.a(orientation, finalInsets);
        GestureDetectorOnGestureListenerC4476xi gestureDetectorOnGestureListenerC4476xi = this.a;
        gestureDetectorOnGestureListenerC4476xi.getClass();
        finalInsets.getClass();
        Intrinsics.checkNotNullParameter(orientation, "orientation");
        Uo uo = (Uo) finalInsets.a.get(orientation);
        if (uo == null) {
            return;
        }
        if (uo.b == 0 && uo.c == 0) {
            return;
        }
        gestureDetectorOnGestureListenerC4476xi.setCloseAssetArea(uo);
        Lazy lazy = Oi.a;
        Intrinsics.checkNotNullParameter(gestureDetectorOnGestureListenerC4476xi, "<this>");
        if (Intrinsics.areEqual(gestureDetectorOnGestureListenerC4476xi.getRoute().b, "default")) {
            renderView = gestureDetectorOnGestureListenerC4476xi;
        } else {
            Jo webViewFactory = gestureDetectorOnGestureListenerC4476xi.getWebViewFactory();
            webViewFactory.getClass();
            Intrinsics.checkNotNullParameter("default", "id");
            renderView = (GestureDetectorOnGestureListenerC4476xi) webViewFactory.b.get("default");
        }
        if (renderView != null) {
            Intrinsics.checkNotNullParameter(renderView, "renderView");
            Uo insets = gestureDetectorOnGestureListenerC4476xi.f1;
            Intrinsics.checkNotNullParameter(insets, "insets");
            View findViewById = renderView.getRootView().findViewById(65532);
            C4303r5 c4303r5 = findViewById instanceof C4303r5 ? (C4303r5) findViewById : null;
            if (c4303r5 == null) {
                return;
            }
            View findViewById2 = renderView.getRootView().findViewById(65531);
            C4303r5 c4303r52 = findViewById2 instanceof C4303r5 ? (C4303r5) findViewById2 : null;
            if (c4303r52 == null) {
                return;
            }
            ViewGroup.LayoutParams layoutParams = c4303r5.getLayoutParams();
            RelativeLayout.LayoutParams layoutParams2 = layoutParams instanceof RelativeLayout.LayoutParams ? (RelativeLayout.LayoutParams) layoutParams : null;
            if (layoutParams2 == null) {
                return;
            }
            ViewGroup.LayoutParams layoutParams3 = c4303r52.getLayoutParams();
            RelativeLayout.LayoutParams layoutParams4 = layoutParams3 instanceof RelativeLayout.LayoutParams ? (RelativeLayout.LayoutParams) layoutParams3 : null;
            if (layoutParams4 == null) {
                return;
            }
            layoutParams2.setMargins(0, insets.b, insets.c, 0);
            layoutParams4.setMargins(0, insets.b, insets.c, 0);
        }
    }
}
