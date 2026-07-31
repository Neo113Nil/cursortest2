package com.inmobi.media;

import android.R;
import android.app.Activity;
import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.pubmatic.sdk.common.POBCommonConstants;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager;
import com.safedk.android.utils.Logger;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* loaded from: classes13.dex */
public final class Y5 extends RelativeLayout {
    public final Activity a;
    public int b;
    public C3935d6 c;
    public InterfaceC3883b6 d;
    public InterfaceC4531zl e;
    public InterfaceC4466x9 f;
    public Wo g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Y5(Activity activity) {
        super(activity);
        Intrinsics.checkNotNullParameter(activity, "activity");
        this.a = activity;
        this.b = -1;
    }

    public final void b(LinearLayout linearLayout, LinearLayout.LayoutParams layoutParams) {
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        C4303r5 c4303r5 = new C4303r5(context, (byte) 2, this.f);
        c4303r5.setId(65516);
        c4303r5.setOnTouchListener(new View.OnTouchListener() { // from class: com.inmobi.media.Y5$$ExternalSyntheticLambda1
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                Logger.d("InMobi|SafeDK: Execution> Lcom/inmobi/media/Y5$$ExternalSyntheticLambda1;->onTouch(Landroid/view/View;Landroid/view/MotionEvent;)Z");
                CreativeInfoManager.onViewTouched(com.safedk.android.utils.h.i, view, motionEvent);
                return safedk_Y5$$ExternalSyntheticLambda1_onTouch_f23bb907e90445e8114fdcf3f72f4fe1(view, motionEvent);
            }

            public boolean safedk_Y5$$ExternalSyntheticLambda1_onTouch_f23bb907e90445e8114fdcf3f72f4fe1(View p0, MotionEvent p1) {
                return Y5.b(Y5.this, p0, p1);
            }
        });
        linearLayout.addView(c4303r5, layoutParams);
    }

    public final void c(LinearLayout linearLayout, LinearLayout.LayoutParams layoutParams) {
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        C4303r5 c4303r5 = new C4303r5(context, (byte) 6, this.f);
        c4303r5.setId(1048283);
        c4303r5.setOnTouchListener(new View.OnTouchListener() { // from class: com.inmobi.media.Y5$$ExternalSyntheticLambda4
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                Logger.d("InMobi|SafeDK: Execution> Lcom/inmobi/media/Y5$$ExternalSyntheticLambda4;->onTouch(Landroid/view/View;Landroid/view/MotionEvent;)Z");
                CreativeInfoManager.onViewTouched(com.safedk.android.utils.h.i, view, motionEvent);
                return safedk_Y5$$ExternalSyntheticLambda4_onTouch_e8417c95674b3e52cf9099fde226812a(view, motionEvent);
            }

            public boolean safedk_Y5$$ExternalSyntheticLambda4_onTouch_e8417c95674b3e52cf9099fde226812a(View p0, MotionEvent p1) {
                return Y5.c(Y5.this, p0, p1);
            }
        });
        linearLayout.addView(c4303r5, layoutParams);
    }

    public final void d(LinearLayout linearLayout, LinearLayout.LayoutParams layoutParams) {
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        C4303r5 c4303r5 = new C4303r5(context, (byte) 3, this.f);
        c4303r5.setId(65502);
        c4303r5.setOnTouchListener(new View.OnTouchListener() { // from class: com.inmobi.media.Y5$$ExternalSyntheticLambda0
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                Logger.d("InMobi|SafeDK: Execution> Lcom/inmobi/media/Y5$$ExternalSyntheticLambda0;->onTouch(Landroid/view/View;Landroid/view/MotionEvent;)Z");
                CreativeInfoManager.onViewTouched(com.safedk.android.utils.h.i, view, motionEvent);
                return safedk_Y5$$ExternalSyntheticLambda0_onTouch_e3c38a075942075f1894e0d7e9966448(view, motionEvent);
            }

            public boolean safedk_Y5$$ExternalSyntheticLambda0_onTouch_e3c38a075942075f1894e0d7e9966448(View p0, MotionEvent p1) {
                return Y5.d(Y5.this, p0, p1);
            }
        });
        linearLayout.addView(c4303r5, layoutParams);
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent me) {
        DetectTouchUtils.viewOnTouch(com.safedk.android.utils.h.i, this, me);
        return super.dispatchTouchEvent(me);
    }

    @Nullable
    public final InterfaceC4531zl getUserLeftApplicationListener() {
        return this.e;
    }

    @Override // android.widget.RelativeLayout, android.view.View
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        if (1 == 0) {
            setMeasuredDimension(0, 0);
        } else {
            super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        }
    }

    public final void setEmbeddedBrowserUpdateListener(@NotNull InterfaceC3883b6 browserUpdateListener) {
        Intrinsics.checkNotNullParameter(browserUpdateListener, "browserUpdateListener");
        this.d = browserUpdateListener;
    }

    public final void setLogger(@NotNull InterfaceC4466x9 logger) {
        Intrinsics.checkNotNullParameter(logger, "logger");
        this.f = logger;
    }

    public final void setUserLeftApplicationListener(@Nullable InterfaceC4531zl interfaceC4531zl) {
        this.e = interfaceC4531zl;
    }

    public final void a(String expandInput, Z5 inputType, boolean z, long j, String placementType, String impressionId, String creativeId, C4152lb c4152lb) {
        Intrinsics.checkNotNullParameter(expandInput, "expandInput");
        Intrinsics.checkNotNullParameter(inputType, "inputType");
        Intrinsics.checkNotNullParameter(placementType, "placementType");
        Intrinsics.checkNotNullParameter(impressionId, "impressionId");
        Intrinsics.checkNotNullParameter(creativeId, "creativeId");
        if (this.c == null) {
            Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            C3935d6 c3935d6 = new C3935d6(context, j, placementType, impressionId, creativeId, new Function1() { // from class: com.inmobi.media.Y5$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return Y5.a(Y5.this, (JSONObject) obj);
                }
            }, this.f);
            this.c = c3935d6;
            c3935d6.setId(65517);
        }
        C3935d6 c3935d62 = this.c;
        if (c3935d62 != null) {
            c3935d62.setLandingPageTelemetryControlInfo(c4152lb);
        }
        if (this.b != expandInput.hashCode()) {
            if (inputType == Z5.a) {
                C3935d6 c3935d63 = this.c;
                if (c3935d63 != null) {
                    c3935d63.loadUrl(expandInput);
                }
            } else {
                C3935d6 c3935d64 = this.c;
                if (c3935d64 != null) {
                    c3935d64.loadData(expandInput, POBCommonConstants.CONTENT_TYPE_HTML, "UTF-8");
                }
            }
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
            layoutParams.addRule(10);
            layoutParams.addRule(2, 65533);
            C3935d6 c3935d65 = this.c;
            if (c3935d65 != null) {
                c3935d65.setLayoutParams(layoutParams);
            }
            if (findViewById(65517) == null) {
                addView(this.c, layoutParams);
            }
        }
        this.b = expandInput.hashCode();
        if (z) {
            if (findViewById(65533) != null) {
                return;
            }
            float f = R5.d().c;
            LinearLayout linearLayout = new LinearLayout(getContext());
            linearLayout.setOrientation(0);
            linearLayout.setId(65533);
            linearLayout.setWeightSum(100.0f);
            linearLayout.setBackgroundResource(R.drawable.bottom_bar);
            linearLayout.setBackgroundColor(-7829368);
            setBackgroundColor(-7829368);
            RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-1, (int) (48 * f));
            layoutParams2.addRule(12);
            addView(linearLayout, layoutParams2);
            if (N3.a(this.a)) {
                Wo wo = this.g;
                if (wo != null) {
                    wo.a();
                }
                this.g = new Wo(this.a, new X5(layoutParams2), this.f);
            }
            LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-1, -1);
            layoutParams3.weight = 25.0f;
            b(linearLayout, layoutParams3);
            d(linearLayout, layoutParams3);
            a(linearLayout, layoutParams3);
            c(linearLayout, layoutParams3);
            return;
        }
        View findViewById = findViewById(65533);
        if (findViewById != null) {
            removeView(findViewById);
        }
    }

    public static final boolean b(Y5 y5, View view, MotionEvent motionEvent) {
        C3909c6 c3909c6;
        if (motionEvent.getAction() == 1) {
            view.setBackgroundColor(-7829368);
            C3935d6 c3935d6 = y5.c;
            if (c3935d6 != null && (c3909c6 = c3935d6.h) != null) {
                C3909c6.a(c3909c6, 5, true, null, 12);
            }
            InterfaceC3883b6 interfaceC3883b6 = y5.d;
            if (interfaceC3883b6 != null) {
                V8.a(((U8) interfaceC3883b6).a);
            }
            return true;
        }
        if (motionEvent.getAction() == 0) {
            view.setBackgroundColor(-16711681);
        }
        return true;
    }

    public static final boolean d(Y5 y5, View view, MotionEvent motionEvent) {
        C3909c6 c3909c6;
        C3909c6 c3909c62;
        if (motionEvent.getAction() == 1) {
            view.setBackgroundColor(-7829368);
            C3935d6 c3935d6 = y5.c;
            if (c3935d6 != null && (c3909c62 = c3935d6.h) != null) {
                C3909c6.a(c3909c62, 6, true, null, 12);
            }
            C3935d6 c3935d62 = y5.c;
            if (c3935d62 != null && (c3909c6 = c3935d62.h) != null) {
                C3909c6.a(c3909c6, 6, true, null, 12);
            }
            C3935d6 c3935d63 = y5.c;
            if (c3935d63 != null) {
                c3935d63.reload();
            }
            return true;
        }
        if (motionEvent.getAction() == 0) {
            view.setBackgroundColor(-16711681);
        }
        return true;
    }

    public static final boolean c(Y5 y5, View view, MotionEvent motionEvent) {
        C3935d6 c3935d6 = y5.c;
        if (c3935d6 == null) {
            return true;
        }
        if (motionEvent.getAction() == 1) {
            view.setBackgroundColor(-7829368);
            if (c3935d6.canGoForward()) {
                c3935d6.goForward();
            }
            return true;
        }
        if (motionEvent.getAction() == 0) {
            view.setBackgroundColor(-16711681);
        }
        return true;
    }

    public static final Unit a(Y5 y5, JSONObject jsonObject) {
        Intrinsics.checkNotNullParameter(jsonObject, "jsonObject");
        InterfaceC3883b6 interfaceC3883b6 = y5.d;
        if (interfaceC3883b6 != null) {
            Intrinsics.checkNotNullParameter(jsonObject, "jsonObject");
            C c = ((U8) interfaceC3883b6).a.b;
            GestureDetectorOnGestureListenerC4476xi gestureDetectorOnGestureListenerC4476xi = c instanceof GestureDetectorOnGestureListenerC4476xi ? (GestureDetectorOnGestureListenerC4476xi) c : null;
            if (gestureDetectorOnGestureListenerC4476xi != null) {
                gestureDetectorOnGestureListenerC4476xi.c(jsonObject);
            }
        }
        return Unit.INSTANCE;
    }

    public final void a(LinearLayout linearLayout, LinearLayout.LayoutParams layoutParams) {
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        C4303r5 c4303r5 = new C4303r5(context, (byte) 4, this.f);
        c4303r5.setId(65503);
        c4303r5.setOnTouchListener(new View.OnTouchListener() { // from class: com.inmobi.media.Y5$$ExternalSyntheticLambda3
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                Logger.d("InMobi|SafeDK: Execution> Lcom/inmobi/media/Y5$$ExternalSyntheticLambda3;->onTouch(Landroid/view/View;Landroid/view/MotionEvent;)Z");
                CreativeInfoManager.onViewTouched(com.safedk.android.utils.h.i, view, motionEvent);
                return safedk_Y5$$ExternalSyntheticLambda3_onTouch_5d75d6fe1906e63e3905f2d2089bbd4f(view, motionEvent);
            }

            public boolean safedk_Y5$$ExternalSyntheticLambda3_onTouch_5d75d6fe1906e63e3905f2d2089bbd4f(View p0, MotionEvent p1) {
                return Y5.a(Y5.this, p0, p1);
            }
        });
        linearLayout.addView(c4303r5, layoutParams);
    }

    public static final boolean a(Y5 y5, View view, MotionEvent motionEvent) {
        C3935d6 c3935d6 = y5.c;
        if (c3935d6 == null) {
            InterfaceC3883b6 interfaceC3883b6 = y5.d;
            if (interfaceC3883b6 != null) {
                V8.a(((U8) interfaceC3883b6).a);
            }
            return true;
        }
        if (motionEvent.getAction() == 1) {
            view.setBackgroundColor(-7829368);
            if (c3935d6.canGoBack()) {
                c3935d6.goBack();
            } else {
                InterfaceC3883b6 interfaceC3883b62 = y5.d;
                if (interfaceC3883b62 != null) {
                    V8.a(((U8) interfaceC3883b62).a);
                }
            }
            return true;
        }
        if (motionEvent.getAction() == 0) {
            view.setBackgroundColor(-16711681);
        }
        return true;
    }
}
