package com.inmobi.media;

import android.app.Activity;
import android.content.Context;
import android.util.DisplayMetrics;
import android.util.SparseArray;
import android.view.Display;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.RelativeLayout;
import com.inmobi.ads.rendering.InMobiAdActivity;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Objects;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.math.MathKt;

/* renamed from: com.inmobi.media.z7, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4517z7 {
    public final RelativeLayout a;
    public Tf b;
    public float c;
    public boolean d;
    public final WeakReference e;
    public final GestureDetectorOnGestureListenerC4476xi f;
    public final RelativeLayout g;
    public boolean h;

    public C4517z7(WeakReference activityRef, GestureDetectorOnGestureListenerC4476xi adContainer, RelativeLayout adBackgroundView) {
        Intrinsics.checkNotNullParameter(activityRef, "activityRef");
        Intrinsics.checkNotNullParameter(adContainer, "adContainer");
        Intrinsics.checkNotNullParameter(adBackgroundView, "adBackgroundView");
        Intrinsics.checkNotNullParameter(adBackgroundView, "adBackgroundView");
        this.a = adBackgroundView;
        this.b = Uf.a(R5.g());
        this.c = 1.0f;
        this.e = activityRef;
        this.f = adContainer;
        this.g = adBackgroundView;
    }

    public final void a(final Tf orientation) {
        Intrinsics.checkNotNullParameter(orientation, "orientation");
        Intrinsics.checkNotNullParameter(orientation, "orientation");
        this.b = orientation;
        GestureDetectorOnGestureListenerC4476xi gestureDetectorOnGestureListenerC4476xi = this.f;
        Intrinsics.checkNotNull(gestureDetectorOnGestureListenerC4476xi, "null cannot be cast to non-null type com.inmobi.ads.containers.RenderView");
        gestureDetectorOnGestureListenerC4476xi.getWebViewFactory().a(new Function1() { // from class: com.inmobi.media.z7$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return C4517z7.a(Tf.this, (GestureDetectorOnGestureListenerC4476xi) obj);
            }
        });
    }

    public final void b() {
        Activity activity = (Activity) this.e.get();
        if (!(activity instanceof InMobiAdActivity) ? false : ((InMobiAdActivity) activity).e) {
            try {
                B fullScreenEventsListener = this.f.getFullScreenEventsListener();
                if (fullScreenEventsListener != null) {
                    C4291qi c4291qi = (C4291qi) fullScreenEventsListener;
                    InterfaceC4466x9 interfaceC4466x9 = c4291qi.a.i;
                    if (interfaceC4466x9 != null) {
                        String str = GestureDetectorOnGestureListenerC4476xi.i1;
                        Intrinsics.checkNotNullExpressionValue(str, "access$getTAG$cp(...)");
                        ((C4493y9) interfaceC4466x9).a(str, com.ironsource.Zf.m);
                    }
                    if (Intrinsics.areEqual("Default", c4291qi.a.getViewState())) {
                        c4291qi.a.setAndUpdateViewState("Hidden");
                    }
                    c4291qi.a.W();
                    Unit unit = Unit.INSTANCE;
                }
            } catch (Exception e) {
                e.getMessage();
                Xb.a((byte) 2, "InMobi", "SDK encountered unexpected error while finishing fullscreen view");
                Unit unit2 = Unit.INSTANCE;
            }
        } else {
            GestureDetectorOnGestureListenerC4476xi gestureDetectorOnGestureListenerC4476xi = this.f;
            Intrinsics.checkNotNull(gestureDetectorOnGestureListenerC4476xi, "null cannot be cast to non-null type com.inmobi.ads.containers.RenderView");
            gestureDetectorOnGestureListenerC4476xi.setFullScreenActivityContext(null);
            try {
                gestureDetectorOnGestureListenerC4476xi.n();
            } catch (Exception e2) {
                e2.getMessage();
                Xb.a((byte) 2, "InMobi", "SDK encountered unexpected error in processing close request");
            }
            SparseArray sparseArray = InMobiAdActivity.t;
            GestureDetectorOnGestureListenerC4476xi container = this.f;
            Intrinsics.checkNotNullParameter(container, "container");
            InMobiAdActivity.t.remove(container.hashCode());
        }
        this.f.b();
    }

    public final void c() {
        Q5 q5;
        RelativeLayout.LayoutParams layoutParams;
        if (this.c == 1.0f) {
            RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-1, -1);
            layoutParams2.addRule(10);
            this.a.setLayoutParams(layoutParams2);
            return;
        }
        if (this.d) {
            T5 t5 = R5.a;
            Context context = this.a.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            q5 = R5.b(context);
        } else {
            T5 t52 = R5.a;
            Context context2 = this.a.getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
            Intrinsics.checkNotNullParameter(context2, "context");
            Display a = R5.a(context2);
            if (a == null) {
                q5 = R5.b;
            } else {
                DisplayMetrics displayMetrics = new DisplayMetrics();
                a.getMetrics(displayMetrics);
                q5 = new Q5(displayMetrics.widthPixels, displayMetrics.heightPixels);
            }
        }
        int i = q5.a;
        Objects.toString(this.b);
        if (Uf.b(this.b)) {
            layoutParams = new RelativeLayout.LayoutParams(MathKt.roundToInt(q5.a * this.c), -1);
            layoutParams.addRule(9);
        } else {
            RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(-1, MathKt.roundToInt(q5.b * this.c));
            layoutParams3.addRule(10);
            layoutParams = layoutParams3;
        }
        this.a.setLayoutParams(layoutParams);
    }

    public final void d() {
        this.g.setBackgroundColor(0);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
        layoutParams.addRule(10);
        AbstractC4008fo viewableAd = this.f.getViewableAd();
        View c = viewableAd != null ? viewableAd.c() : null;
        if (c != null) {
            ViewParent parent = c.getParent();
            ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
            if (viewGroup != null) {
                viewGroup.removeView(c);
            }
            RelativeLayout relativeLayout = new RelativeLayout(this.g.getContext());
            relativeLayout.addView(c, new RelativeLayout.LayoutParams(-1, -1));
            this.g.addView(relativeLayout, layoutParams);
            this.f.a(relativeLayout);
        }
    }

    public final void e() {
        if (1 == this.f.getPlacementType()) {
            try {
                HashMap hashMap = new HashMap();
                AbstractC4008fo viewableAd = this.f.getViewableAd();
                if (viewableAd != null) {
                    viewableAd.a(hashMap);
                }
            } catch (Exception e) {
                e.getMessage();
                B fullScreenEventsListener = this.f.getFullScreenEventsListener();
                if (fullScreenEventsListener != null) {
                    ((C4291qi) fullScreenEventsListener).a();
                }
            }
        }
    }

    public final void a() {
        GestureDetectorOnGestureListenerC4476xi gestureDetectorOnGestureListenerC4476xi = this.f;
        if (gestureDetectorOnGestureListenerC4476xi == null) {
            gestureDetectorOnGestureListenerC4476xi = null;
        }
        if (gestureDetectorOnGestureListenerC4476xi == null) {
            return;
        }
        gestureDetectorOnGestureListenerC4476xi.getWebViewFactory().a(new Function1() { // from class: com.inmobi.media.z7$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return C4517z7.a((GestureDetectorOnGestureListenerC4476xi) obj);
            }
        });
        if (gestureDetectorOnGestureListenerC4476xi.L) {
            return;
        }
        try {
            gestureDetectorOnGestureListenerC4476xi.n();
        } catch (Exception e) {
            e.getMessage();
            Xb.a((byte) 2, "InMobi", "SDK encountered unexpected error in processing close request");
        }
    }

    public static final Unit a(GestureDetectorOnGestureListenerC4476xi it) {
        Intrinsics.checkNotNullParameter(it, "it");
        it.r();
        return Unit.INSTANCE;
    }

    public static final Unit a(Tf tf, GestureDetectorOnGestureListenerC4476xi it) {
        Intrinsics.checkNotNullParameter(it, "it");
        it.b(tf);
        return Unit.INSTANCE;
    }
}
