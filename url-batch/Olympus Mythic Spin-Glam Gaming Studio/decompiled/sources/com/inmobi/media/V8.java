package com.inmobi.media;

import android.R;
import android.app.Activity;
import android.content.Intent;
import android.util.SparseArray;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import androidx.core.view.WindowCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.core.view.WindowInsetsControllerCompat;
import com.inmobi.ads.rendering.InMobiAdActivity;
import java.lang.ref.WeakReference;
import java.util.Objects;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import kotlin.math.MathKt;
import org.json.JSONObject;

/* loaded from: classes12.dex */
public final class V8 implements Wf {
    public final WeakReference a;
    public C b;
    public C4517z7 c;
    public RelativeLayout d;
    public Y5 e;
    public Tf f;
    public float g;
    public InterfaceC4466x9 h;
    public final U8 i;
    public final T8 j;

    public V8(InMobiAdActivity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        this.a = new WeakReference(activity);
        this.f = Uf.a(R5.g());
        this.g = 1.0f;
        this.i = new U8(this);
        this.j = new T8(this);
    }

    public final void a(Intent intent, SparseArray adContainers) {
        Y5 y5;
        Window window;
        Intrinsics.checkNotNullParameter(intent, "intent");
        Intrinsics.checkNotNullParameter(adContainers, "adContainers");
        if (!intent.hasExtra("com.inmobi.ads.rendering.InMobiAdActivity.EXTRA_AD_CONTAINER_INDEX")) {
            Activity activity = (Activity) this.a.get();
            if (activity instanceof InMobiAdActivity) {
                ((InMobiAdActivity) activity).b();
                return;
            }
            return;
        }
        C c = (C) adContainers.get(intent.getIntExtra("com.inmobi.ads.rendering.InMobiAdActivity.EXTRA_AD_CONTAINER_INDEX", -1));
        if (c == null) {
            Activity activity2 = (Activity) this.a.get();
            if (activity2 instanceof InMobiAdActivity) {
                ((InMobiAdActivity) activity2).b();
                return;
            }
            return;
        }
        int intExtra = intent.getIntExtra("com.inmobi.ads.rendering.InMobiAdActivity.EXTRA_AD_CONTAINER_TYPE", 0);
        if (intExtra == 0) {
            B fullScreenEventsListener = ((GestureDetectorOnGestureListenerC4476xi) c).getFullScreenEventsListener();
            if (fullScreenEventsListener != null) {
                ((C4291qi) fullScreenEventsListener).a();
            }
            Activity activity3 = (Activity) this.a.get();
            if (activity3 instanceof InMobiAdActivity) {
                ((InMobiAdActivity) activity3).b();
                return;
            }
            return;
        }
        if (intent.getBooleanExtra("com.inmobi.ads.rendering.InMobiAdActivity.EXTRA_AD_ACTIVITY_IS_FULL_SCREEN", false) && (this.a.get() instanceof InMobiAdActivity)) {
            Object obj = this.a.get();
            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type com.inmobi.ads.rendering.InMobiAdActivity");
            if (!((InMobiAdActivity) obj).g) {
                Object obj2 = this.a.get();
                Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type com.inmobi.ads.rendering.InMobiAdActivity");
                ((InMobiAdActivity) obj2).g = true;
                if (!(c instanceof GestureDetectorOnGestureListenerC4476xi) ? false : ((GestureDetectorOnGestureListenerC4476xi) c).X0) {
                    InterfaceC4466x9 interfaceC4466x9 = this.h;
                    if (interfaceC4466x9 != null) {
                        ((C4493y9) interfaceC4466x9).a("InMobiActivityViewHandler", "showInImmersiveMode");
                    }
                    Object obj3 = this.a.get();
                    InMobiAdActivity inMobiAdActivity = obj3 instanceof InMobiAdActivity ? (InMobiAdActivity) obj3 : null;
                    if (inMobiAdActivity != null && (window = inMobiAdActivity.getWindow()) != null) {
                        F5.a.getClass();
                        if (F5.t()) {
                            WindowManager.LayoutParams attributes = window.getAttributes();
                            attributes.layoutInDisplayCutoutMode = 3;
                            window.setAttributes(attributes);
                            WindowCompat.setDecorFitsSystemWindows(window, false);
                        } else if (F5.r()) {
                            WindowManager.LayoutParams attributes2 = window.getAttributes();
                            attributes2.layoutInDisplayCutoutMode = 1;
                            window.setAttributes(attributes2);
                            WindowCompat.setDecorFitsSystemWindows(window, false);
                        }
                        if (F5.t()) {
                            WindowInsetsControllerCompat insetsController = WindowCompat.getInsetsController(window, window.getDecorView());
                            Intrinsics.checkNotNullExpressionValue(insetsController, "getInsetsController(...)");
                            insetsController.setSystemBarsBehavior(2);
                            insetsController.hide(WindowInsetsCompat.Type.systemBars());
                            insetsController.hide(WindowInsetsCompat.Type.displayCutout());
                        } else if (F5.w()) {
                            window.getDecorView().setSystemUiVisibility(5638);
                        }
                    }
                } else {
                    Activity activity4 = (Activity) this.a.get();
                    if (activity4 != null) {
                        Intrinsics.checkNotNullParameter(activity4, "<this>");
                        try {
                            activity4.requestWindowFeature(1);
                            activity4.getWindow().setFlags(1024, 1024);
                        } catch (Exception unused) {
                        }
                    }
                }
            }
        }
        if ((200 == intExtra && !Intrinsics.areEqual("html", ((GestureDetectorOnGestureListenerC4476xi) c).getMarkupType())) || ((202 == intExtra && !Intrinsics.areEqual("htmlUrl", ((GestureDetectorOnGestureListenerC4476xi) c).getMarkupType())) || (201 == intExtra && !Intrinsics.areEqual("inmobiJson", ((GestureDetectorOnGestureListenerC4476xi) c).getMarkupType())))) {
            B fullScreenEventsListener2 = ((GestureDetectorOnGestureListenerC4476xi) c).getFullScreenEventsListener();
            if (fullScreenEventsListener2 != null) {
                ((C4291qi) fullScreenEventsListener2).a();
            }
            Activity activity5 = (Activity) this.a.get();
            if (activity5 instanceof InMobiAdActivity) {
                ((InMobiAdActivity) activity5).b();
                return;
            }
            return;
        }
        try {
            this.b = c;
            ((GestureDetectorOnGestureListenerC4476xi) c).setFullScreenActivityContext((Activity) this.a.get());
            a();
            Activity activity6 = (Activity) this.a.get();
            if (activity6 != null) {
                RelativeLayout relativeLayout = new RelativeLayout(activity6);
                relativeLayout.setId(65534);
                this.d = relativeLayout;
            }
            a(c);
            C4517z7 c4517z7 = this.c;
            if (c4517z7 != null) {
                c4517z7.d();
            }
            Activity activity7 = (Activity) this.a.get();
            if (activity7 != null) {
                FrameLayout frameLayout = (FrameLayout) activity7.findViewById(R.id.content);
                RelativeLayout relativeLayout2 = frameLayout != null ? (RelativeLayout) frameLayout.findViewById(65519) : null;
                RelativeLayout relativeLayout3 = this.d;
                if (relativeLayout3 != null && relativeLayout2 != null) {
                    RelativeLayout relativeLayout4 = (RelativeLayout) relativeLayout2.findViewById(65534);
                    if (relativeLayout4 != null) {
                        relativeLayout2.removeView(relativeLayout4);
                    }
                    relativeLayout2.addView(relativeLayout3);
                    C4517z7 c4517z72 = this.c;
                    if (c4517z72 != null) {
                        c4517z72.c();
                    }
                }
            }
            if (c instanceof GestureDetectorOnGestureListenerC4476xi) {
                ((GestureDetectorOnGestureListenerC4476xi) c).setEmbeddedBrowserJsCallbacks(this.j);
            }
            if (!(c instanceof GestureDetectorOnGestureListenerC4476xi) || (y5 = this.e) == null) {
                return;
            }
            y5.setUserLeftApplicationListener(((GestureDetectorOnGestureListenerC4476xi) c).getListener());
        } catch (Exception e) {
            GestureDetectorOnGestureListenerC4476xi gestureDetectorOnGestureListenerC4476xi = (GestureDetectorOnGestureListenerC4476xi) c;
            gestureDetectorOnGestureListenerC4476xi.setFullScreenActivityContext(null);
            B fullScreenEventsListener3 = gestureDetectorOnGestureListenerC4476xi.getFullScreenEventsListener();
            if (fullScreenEventsListener3 != null) {
                ((C4291qi) fullScreenEventsListener3).a();
            }
            Activity activity8 = (Activity) this.a.get();
            if (activity8 instanceof InMobiAdActivity) {
                ((InMobiAdActivity) activity8).b();
            }
            Lazy lazy = AbstractC3861aa.a;
            AbstractC4361t9.a(e);
        }
    }

    public final void b(Tf tf) {
        Objects.toString(tf);
        this.f = tf;
    }

    public final void c() {
        try {
            final Y5 y5 = this.e;
            if (y5 != null) {
                ViewParent parent = y5.getParent();
                ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
                if (viewGroup != null) {
                    viewGroup.removeView(y5);
                }
                ViewParent parent2 = y5.getParent();
                ViewGroup viewGroup2 = parent2 instanceof ViewGroup ? (ViewGroup) parent2 : null;
                if (viewGroup2 != null) {
                    viewGroup2.post(new Runnable() { // from class: com.inmobi.media.V8$$ExternalSyntheticLambda0
                        @Override // java.lang.Runnable
                        public final void run() {
                            V8.a(Y5.this);
                        }
                    });
                }
            }
            Y5 y52 = this.e;
            if (y52 != null) {
                C3935d6 c3935d6 = y52.c;
                if (c3935d6 != null) {
                    c3935d6.destroy();
                }
                y52.c = null;
                y52.d = null;
                y52.e = null;
                Wo wo = y52.g;
                if (wo != null) {
                    wo.a();
                }
                y52.removeAllViews();
            }
            this.e = null;
            GestureDetectorOnGestureListenerC4476xi.g1.getClass();
            a(C3947di.a("IN_CUSTOM_EXPAND", "onClose"));
        } catch (Exception unused) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x004f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b() {
        T5 d;
        Activity activity;
        if (this.e == null) {
            return;
        }
        C c = this.b;
        if (c != null) {
            if ((!(c instanceof GestureDetectorOnGestureListenerC4476xi) ? false : ((GestureDetectorOnGestureListenerC4476xi) c).X0) || ((activity = (Activity) this.a.get()) != null && N3.a(activity))) {
                d = R5.h();
                float f = d.a;
                float f2 = d.c;
                float f3 = f * f2;
                float f4 = d.b * f2;
                if (!Uf.b(this.f)) {
                    a(MathKt.roundToInt((1 - this.g) * f3), -1);
                    return;
                } else {
                    a(-1, MathKt.roundToInt((1 - this.g) * f4));
                    return;
                }
            }
        }
        d = R5.d();
        float f5 = d.a;
        float f22 = d.c;
        float f32 = f5 * f22;
        float f42 = d.b * f22;
        if (!Uf.b(this.f)) {
        }
    }

    public final void a() {
        Activity activity = (Activity) this.a.get();
        if (activity == null) {
            return;
        }
        FrameLayout frameLayout = (FrameLayout) activity.findViewById(R.id.content);
        if ((frameLayout != null ? (RelativeLayout) frameLayout.findViewById(65519) : null) != null) {
            return;
        }
        RelativeLayout relativeLayout = new RelativeLayout(activity);
        relativeLayout.setId(65519);
        relativeLayout.setBackgroundColor(0);
        frameLayout.removeAllViews();
        frameLayout.addView(relativeLayout, new RelativeLayout.LayoutParams(-1, -1));
    }

    public final void a(C c) {
        RelativeLayout relativeLayout;
        if (((Activity) this.a.get()) == null || (relativeLayout = this.d) == null) {
            return;
        }
        GestureDetectorOnGestureListenerC4476xi gestureDetectorOnGestureListenerC4476xi = (GestureDetectorOnGestureListenerC4476xi) c;
        String markupType = gestureDetectorOnGestureListenerC4476xi.getMarkupType();
        if (!Intrinsics.areEqual(markupType, "html") && !Intrinsics.areEqual(markupType, "htmlUrl")) {
            throw new IllegalArgumentException("InMobiActivityViewHandler: Unknown Markup type");
        }
        C4517z7 c4517z7 = new C4517z7(this.a, gestureDetectorOnGestureListenerC4476xi, relativeLayout);
        this.c = c4517z7;
        c4517z7.a(this.f);
        c4517z7.c = this.g;
        c4517z7.d = gestureDetectorOnGestureListenerC4476xi.X0;
    }

    public final void a(JSONObject jsonObject) {
        Intrinsics.checkNotNullParameter(jsonObject, "jsonObject");
        C c = this.b;
        GestureDetectorOnGestureListenerC4476xi gestureDetectorOnGestureListenerC4476xi = c instanceof GestureDetectorOnGestureListenerC4476xi ? (GestureDetectorOnGestureListenerC4476xi) c : null;
        if (gestureDetectorOnGestureListenerC4476xi != null) {
            gestureDetectorOnGestureListenerC4476xi.c(jsonObject);
        }
    }

    @Override // com.inmobi.media.Wf
    public final void a(Tf orientation) {
        Intrinsics.checkNotNullParameter(orientation, "orientation");
        if (((Activity) this.a.get()) == null) {
            return;
        }
        C4517z7 c4517z7 = this.c;
        if (c4517z7 != null) {
            c4517z7.a(orientation);
        }
        Tf tf = this.f;
        if (tf != orientation && Uf.b(tf) != Uf.b(orientation)) {
            b(orientation);
            C4517z7 c4517z72 = this.c;
            if (c4517z72 != null) {
                c4517z72.c();
            }
            b();
            return;
        }
        b(orientation);
    }

    public static final void a(V8 v8) {
        v8.g = 1.0f;
        C4517z7 c4517z7 = v8.c;
        if (c4517z7 != null) {
            c4517z7.c = 1.0f;
            c4517z7.c();
        }
        Y5 y5 = v8.e;
        if (y5 != null) {
            y5.setLayoutParams(new RelativeLayout.LayoutParams(0, 0));
        }
        v8.c();
    }

    public static final void a(Y5 y5) {
        y5.getParent().requestLayout();
    }

    public final void a(int i, int i2) {
        RelativeLayout.LayoutParams layoutParams;
        Activity activity = (Activity) this.a.get();
        if (activity == null) {
            return;
        }
        Uf.b(this.f);
        if (Uf.b(this.f)) {
            layoutParams = new RelativeLayout.LayoutParams(i, i2);
            layoutParams.addRule(11);
        } else {
            layoutParams = new RelativeLayout.LayoutParams(i, i2);
            layoutParams.addRule(12);
        }
        RelativeLayout relativeLayout = (RelativeLayout) ((FrameLayout) activity.findViewById(R.id.content)).findViewById(65519);
        Intrinsics.checkNotNull(relativeLayout);
        if (((RelativeLayout) relativeLayout.findViewById(65518)) != null) {
            Y5 y5 = this.e;
            if (y5 != null) {
                y5.setLayoutParams(layoutParams);
                return;
            }
            return;
        }
        Y5 y52 = this.e;
        if (y52 != null) {
            relativeLayout.addView(y52, layoutParams);
        }
    }
}
