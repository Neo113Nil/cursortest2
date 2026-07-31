package com.inmobi.media;

import android.content.Context;
import android.os.Handler;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.RelativeLayout;
import com.iab.omid.library.inmobi.adsession.FriendlyObstructionPurpose;
import com.inmobi.ads.rendering.InMobiAdActivity;
import com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager;
import com.safedk.android.utils.Logger;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes10.dex */
public final class G3 {
    public final GestureDetectorOnGestureListenerC4476xi a;
    public final boolean b;
    public final boolean c;
    public final InterfaceC4466x9 d;

    public G3(GestureDetectorOnGestureListenerC4476xi renderView, boolean z, boolean z2, InterfaceC4466x9 interfaceC4466x9) {
        Intrinsics.checkNotNullParameter(renderView, "renderView");
        this.a = renderView;
        this.b = z;
        this.c = z2;
        this.d = interfaceC4466x9;
    }

    public final void a(final Uo insets) {
        final ViewGroup viewGroup;
        Handler handler;
        Intrinsics.checkNotNullParameter(insets, "insets");
        if (!(this.a.getContainerContext() instanceof InMobiAdActivity) || (viewGroup = (ViewGroup) this.a.getRootView().findViewById(65534)) == null || (handler = viewGroup.getHandler()) == null) {
            return;
        }
        handler.post(new Runnable() { // from class: com.inmobi.media.G3$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                G3.a(G3.this, viewGroup, insets);
            }
        });
    }

    /* JADX WARN: Code restructure failed: missing block: B:69:0x00b2, code lost:
    
        if (r2 == null) goto L34;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void a(G3 g3, ViewGroup viewGroup, Uo uo) {
        Unit unit;
        AbstractC4008fo viewableAd;
        AbstractC4008fo viewableAd2;
        Pair a = g3.a();
        View.OnClickListener onClickListener = (View.OnClickListener) a.component1();
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) a.component2();
        Unit unit2 = null;
        if (g3.b) {
            View findViewById = viewGroup != null ? viewGroup.findViewById(65532) : null;
            if (findViewById != null) {
                InterfaceC4466x9 interfaceC4466x9 = g3.d;
                if (interfaceC4466x9 != null) {
                    ((C4493y9) interfaceC4466x9).c("CloseButtonHandler", "Close button already present, not adding again");
                }
                g3.a(findViewById);
            } else {
                Context context = g3.a.getContext();
                Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                View c4303r5 = new C4303r5(context, (byte) 0, g3.d);
                c4303r5.setId(65532);
                F5.a.getClass();
                if (F5.x()) {
                    c4303r5.setElevation(1.7014117E38f);
                }
                c4303r5.setOnClickListener(onClickListener);
                g3.a(c4303r5);
                if (viewGroup != null) {
                    viewGroup.addView(c4303r5, layoutParams);
                }
                layoutParams.setMargins(0, uo.b, uo.c, 0);
            }
        } else {
            View findViewById2 = g3.a.getRootView().findViewById(65532);
            if (findViewById2 != null) {
                Jo webViewFactory = g3.a.getWebViewFactory();
                webViewFactory.getClass();
                Intrinsics.checkNotNullParameter("default", "id");
                GestureDetectorOnGestureListenerC4476xi gestureDetectorOnGestureListenerC4476xi = (GestureDetectorOnGestureListenerC4476xi) webViewFactory.b.get("default");
                if (gestureDetectorOnGestureListenerC4476xi != null && (viewableAd = gestureDetectorOnGestureListenerC4476xi.getViewableAd()) != null) {
                    viewableAd.a(findViewById2);
                }
                ViewParent parent = findViewById2.getParent();
                ViewGroup viewGroup2 = parent instanceof ViewGroup ? (ViewGroup) parent : null;
                if (viewGroup2 != null) {
                    viewGroup2.removeView(findViewById2);
                    unit = Unit.INSTANCE;
                } else {
                    unit = null;
                }
            }
            InterfaceC4466x9 interfaceC4466x92 = g3.d;
            if (interfaceC4466x92 != null) {
                ((C4493y9) interfaceC4466x92).c("CloseButtonHandler", "Close button not present, not removing");
                Unit unit3 = Unit.INSTANCE;
            }
        }
        if (g3.c) {
            View findViewById3 = viewGroup != null ? viewGroup.findViewById(65531) : null;
            if (findViewById3 != null) {
                InterfaceC4466x9 interfaceC4466x93 = g3.d;
                if (interfaceC4466x93 != null) {
                    ((C4493y9) interfaceC4466x93).c("CloseButtonHandler", "Close region already present, not adding again");
                }
                g3.a(findViewById3);
                return;
            }
            Context context2 = g3.a.getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
            View c4303r52 = new C4303r5(context2, (byte) 1, g3.d);
            c4303r52.setId(65531);
            F5.a.getClass();
            if (F5.x()) {
                c4303r52.setElevation(1.7014117E38f);
            }
            c4303r52.setOnClickListener(onClickListener);
            g3.a(c4303r52);
            if (viewGroup != null) {
                viewGroup.addView(c4303r52, layoutParams);
            }
            layoutParams.setMargins(0, uo.b, uo.c, 0);
            return;
        }
        View findViewById4 = g3.a.getRootView().findViewById(65531);
        if (findViewById4 != null) {
            Jo webViewFactory2 = g3.a.getWebViewFactory();
            webViewFactory2.getClass();
            Intrinsics.checkNotNullParameter("default", "id");
            GestureDetectorOnGestureListenerC4476xi gestureDetectorOnGestureListenerC4476xi2 = (GestureDetectorOnGestureListenerC4476xi) webViewFactory2.b.get("default");
            if (gestureDetectorOnGestureListenerC4476xi2 != null && (viewableAd2 = gestureDetectorOnGestureListenerC4476xi2.getViewableAd()) != null) {
                viewableAd2.a(findViewById4);
            }
            ViewParent parent2 = findViewById4.getParent();
            ViewGroup viewGroup3 = parent2 instanceof ViewGroup ? (ViewGroup) parent2 : null;
            if (viewGroup3 != null) {
                viewGroup3.removeView(findViewById4);
                unit2 = Unit.INSTANCE;
            }
            if (unit2 != null) {
                return;
            }
        }
        InterfaceC4466x9 interfaceC4466x94 = g3.d;
        if (interfaceC4466x94 != null) {
            ((C4493y9) interfaceC4466x94).c("CloseButtonHandler", "Close region not present, not removing");
            Unit unit4 = Unit.INSTANCE;
        }
    }

    public final void a(View view) {
        AbstractC4008fo viewableAd;
        Jo webViewFactory = this.a.getWebViewFactory();
        webViewFactory.getClass();
        Intrinsics.checkNotNullParameter("default", "id");
        GestureDetectorOnGestureListenerC4476xi gestureDetectorOnGestureListenerC4476xi = (GestureDetectorOnGestureListenerC4476xi) webViewFactory.b.get("default");
        if (gestureDetectorOnGestureListenerC4476xi == null || (viewableAd = gestureDetectorOnGestureListenerC4476xi.getViewableAd()) == null) {
            return;
        }
        viewableAd.a(view, FriendlyObstructionPurpose.CLOSE_AD);
    }

    public final Pair a() {
        float f = R5.d().c;
        View.OnClickListener onClickListener = new View.OnClickListener() { // from class: com.inmobi.media.G3$$ExternalSyntheticLambda1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                Logger.d("InMobi|SafeDK: Execution> Lcom/inmobi/media/G3$$ExternalSyntheticLambda1;->onClick(Landroid/view/View;)V");
                CreativeInfoManager.onViewClicked(com.safedk.android.utils.h.i, view);
                safedk_G3$$ExternalSyntheticLambda1_onClick_40d1ec03c002ba9c164b7687e2c80d98(view);
            }

            public void safedk_G3$$ExternalSyntheticLambda1_onClick_40d1ec03c002ba9c164b7687e2c80d98(View p0) {
                G3.a(G3.this, p0);
            }
        };
        int i = (int) (50 * f);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(i, i);
        layoutParams.addRule(11);
        return TuplesKt.to(onClickListener, layoutParams);
    }

    public static final void a(G3 g3, View view) {
        try {
            g3.a.n();
        } catch (Exception e) {
            e.getMessage();
            Xb.a((byte) 2, "InMobi", "SDK encountered unexpected error in processing close request");
        }
    }
}
