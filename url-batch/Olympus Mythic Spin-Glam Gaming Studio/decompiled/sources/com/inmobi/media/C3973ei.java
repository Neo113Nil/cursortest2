package com.inmobi.media;

import android.R;
import android.app.Activity;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.webkit.WebChromeClient;
import android.widget.AbsoluteLayout;
import android.widget.FrameLayout;
import com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager;
import com.safedk.android.utils.Logger;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.inmobi.media.ei, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C3973ei extends C3895bi {
    public final /* synthetic */ GestureDetectorOnGestureListenerC4476xi b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3973ei(GestureDetectorOnGestureListenerC4476xi gestureDetectorOnGestureListenerC4476xi) {
        super(gestureDetectorOnGestureListenerC4476xi);
        this.b = gestureDetectorOnGestureListenerC4476xi;
    }

    public static final boolean a(View view, MotionEvent motionEvent) {
        return true;
    }

    public final void a() {
        GestureDetectorOnGestureListenerC4476xi gestureDetectorOnGestureListenerC4476xi = this.b;
        if (gestureDetectorOnGestureListenerC4476xi.S == null) {
            return;
        }
        WebChromeClient.CustomViewCallback customViewCallback = gestureDetectorOnGestureListenerC4476xi.T;
        if (customViewCallback != null) {
            customViewCallback.onCustomViewHidden();
        }
        GestureDetectorOnGestureListenerC4476xi gestureDetectorOnGestureListenerC4476xi2 = this.b;
        gestureDetectorOnGestureListenerC4476xi2.T = null;
        View view = gestureDetectorOnGestureListenerC4476xi2.S;
        if ((view != null ? view.getParent() : null) != null) {
            View view2 = this.b.S;
            ViewParent parent = view2 != null ? view2.getParent() : null;
            ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
            if (viewGroup != null) {
                viewGroup.removeView(this.b.S);
            }
            this.b.S = null;
        }
    }

    @Override // android.webkit.WebChromeClient
    public final void onHideCustomView() {
        a();
        super.onHideCustomView();
    }

    @Override // android.webkit.WebChromeClient
    public final void onShowCustomView(View view, WebChromeClient.CustomViewCallback callback) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(callback, "callback");
        if (this.b.u.get() != null) {
            GestureDetectorOnGestureListenerC4476xi gestureDetectorOnGestureListenerC4476xi = this.b;
            gestureDetectorOnGestureListenerC4476xi.S = view;
            gestureDetectorOnGestureListenerC4476xi.T = callback;
            if (view != null) {
                view.setOnTouchListener(new View.OnTouchListener() { // from class: com.inmobi.media.ei$$ExternalSyntheticLambda0
                    @Override // android.view.View.OnTouchListener
                    public final boolean onTouch(View view2, MotionEvent motionEvent) {
                        Logger.d("InMobi|SafeDK: Execution> Lcom/inmobi/media/ei$$ExternalSyntheticLambda0;->onTouch(Landroid/view/View;Landroid/view/MotionEvent;)Z");
                        CreativeInfoManager.onViewTouched(com.safedk.android.utils.h.i, view2, motionEvent);
                        return safedk_ei$$ExternalSyntheticLambda0_onTouch_d74c0668f32c754b39713dd4faf9219f(view2, motionEvent);
                    }

                    public boolean safedk_ei$$ExternalSyntheticLambda0_onTouch_d74c0668f32c754b39713dd4faf9219f(View p0, MotionEvent p1) {
                        return C3973ei.a(p0, p1);
                    }
                });
            }
            Activity activity = (Activity) this.b.u.get();
            FrameLayout frameLayout = activity != null ? (FrameLayout) activity.findViewById(R.id.content) : null;
            View view2 = this.b.S;
            if (view2 != null) {
                view2.setBackgroundColor(-16777216);
            }
            if (frameLayout != null) {
                frameLayout.addView(this.b.S, new AbsoluteLayout.LayoutParams(-1, -1, 0, 0));
            }
            View view3 = this.b.S;
            if (view3 != null) {
                view3.requestFocus();
            }
            final GestureDetectorOnGestureListenerC4476xi gestureDetectorOnGestureListenerC4476xi2 = this.b;
            View view4 = gestureDetectorOnGestureListenerC4476xi2.S;
            View.OnKeyListener onKeyListener = new View.OnKeyListener() { // from class: com.inmobi.media.ei$$ExternalSyntheticLambda1
                @Override // android.view.View.OnKeyListener
                public final boolean onKey(View view5, int i, KeyEvent keyEvent) {
                    return C3973ei.a(GestureDetectorOnGestureListenerC4476xi.this, this, view5, i, keyEvent);
                }
            };
            if (view4 != null) {
                view4.setOnKeyListener(onKeyListener);
            }
            if (view4 != null) {
                view4.setFocusable(true);
            }
            if (view4 != null) {
                view4.setFocusableInTouchMode(true);
            }
            if (view4 != null) {
                view4.requestFocus();
            }
        }
    }

    public static final boolean a(GestureDetectorOnGestureListenerC4476xi gestureDetectorOnGestureListenerC4476xi, C3973ei c3973ei, View view, int i, KeyEvent keyEvent) {
        if (4 != keyEvent.getKeyCode() || keyEvent.getAction() != 0) {
            return false;
        }
        InterfaceC4466x9 interfaceC4466x9 = gestureDetectorOnGestureListenerC4476xi.i;
        if (interfaceC4466x9 != null) {
            String str = GestureDetectorOnGestureListenerC4476xi.i1;
            Intrinsics.checkNotNullExpressionValue(str, "access$getTAG$cp(...)");
            ((C4493y9) interfaceC4466x9).a(str, "Back pressed when HTML5 video is playing.");
        }
        c3973ei.a();
        return true;
    }
}
