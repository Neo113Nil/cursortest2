package com.inmobi.ads.rendering;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.os.SystemClock;
import android.util.SparseArray;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import com.inmobi.ads.R;
import com.inmobi.media.AbstractC3861aa;
import com.inmobi.media.AbstractC3914cb;
import com.inmobi.media.AbstractC4002fj;
import com.inmobi.media.AbstractC4015g4;
import com.inmobi.media.AbstractC4528zi;
import com.inmobi.media.B;
import com.inmobi.media.Bi;
import com.inmobi.media.C;
import com.inmobi.media.C3860a9;
import com.inmobi.media.C3909c6;
import com.inmobi.media.C3935d6;
import com.inmobi.media.C3947di;
import com.inmobi.media.C4152lb;
import com.inmobi.media.C4221o0;
import com.inmobi.media.C4266pj;
import com.inmobi.media.C4277q4;
import com.inmobi.media.C4291qi;
import com.inmobi.media.C4303r5;
import com.inmobi.media.C4493y9;
import com.inmobi.media.C4517z7;
import com.inmobi.media.EnumC4213nj;
import com.inmobi.media.F5;
import com.inmobi.media.GestureDetectorOnGestureListenerC4476xi;
import com.inmobi.media.InterfaceC4466x9;
import com.inmobi.media.Jo;
import com.inmobi.media.N3;
import com.inmobi.media.Oi;
import com.inmobi.media.Q2;
import com.inmobi.media.R5;
import com.inmobi.media.V8;
import com.inmobi.media.Vf;
import com.inmobi.media.Wo;
import com.inmobi.media.X8;
import com.inmobi.media.Xb;
import com.inmobi.media.Y5;
import com.inmobi.media.Y8;
import com.inmobi.media.Yi;
import com.inmobi.media.Z8;
import com.inmobi.media.core.config.models.AdConfig;
import com.inmobi.media.core.config.models.Config;
import com.ironsource.X3;
import com.ironsource.Zf;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import com.safedk.android.utils.h;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.LinkedHashSet;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.SupervisorKt;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0017\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/inmobi/ads/rendering/InMobiAdActivity;", "Landroid/app/Activity;", "<init>", "()V", "com/inmobi/media/Y8", "media_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SuppressLint({"ClickableViewAccessibility"})
/* loaded from: classes13.dex */
public class InMobiAdActivity extends Activity {
    public static final SparseArray t = new SparseArray();
    public static GestureDetectorOnGestureListenerC4476xi u;
    public X8 a;
    public V8 b;
    public GestureDetectorOnGestureListenerC4476xi c;
    public int d;
    public boolean e;
    public boolean f;
    public boolean g;
    public InterfaceC4466x9 h;
    public Wo i;
    public OnBackInvokedCallback j;
    public boolean k;
    public final CoroutineScope l = CoroutineScopeKt.CoroutineScope(SupervisorKt.SupervisorJob$default(null, 1, null).plus(Dispatchers.getMain().getImmediate()));
    public Job m;
    public boolean n;
    public boolean o;
    public RelativeLayout p;
    public FrameLayout q;
    public C4152lb r;
    public long s;

    public static final void a(InMobiAdActivity inMobiAdActivity) {
        inMobiAdActivity.c();
    }

    public static final boolean b(InMobiAdActivity inMobiAdActivity, View view, MotionEvent motionEvent) {
        C3909c6 c3909c6;
        if (motionEvent.getAction() != 1) {
            if (motionEvent.getAction() == 0) {
                view.setBackgroundColor(-16711681);
            }
            return true;
        }
        view.setBackgroundColor(-7829368);
        GestureDetectorOnGestureListenerC4476xi gestureDetectorOnGestureListenerC4476xi = inMobiAdActivity.c;
        if (gestureDetectorOnGestureListenerC4476xi != null && (c3909c6 = gestureDetectorOnGestureListenerC4476xi.E0) != null) {
            C3909c6.a(c3909c6, 6, true, null, 12);
        }
        GestureDetectorOnGestureListenerC4476xi gestureDetectorOnGestureListenerC4476xi2 = inMobiAdActivity.c;
        if (gestureDetectorOnGestureListenerC4476xi2 != null) {
            gestureDetectorOnGestureListenerC4476xi2.reload();
        }
        return true;
    }

    public static final boolean c(InMobiAdActivity inMobiAdActivity, View view, MotionEvent motionEvent) {
        C3909c6 c3909c6;
        if (motionEvent.getAction() != 1) {
            if (motionEvent.getAction() == 0) {
                view.setBackgroundColor(-16711681);
            }
            return true;
        }
        view.setBackgroundColor(-7829368);
        GestureDetectorOnGestureListenerC4476xi gestureDetectorOnGestureListenerC4476xi = inMobiAdActivity.c;
        if (gestureDetectorOnGestureListenerC4476xi == null || !gestureDetectorOnGestureListenerC4476xi.canGoBack()) {
            GestureDetectorOnGestureListenerC4476xi gestureDetectorOnGestureListenerC4476xi2 = inMobiAdActivity.c;
            if (gestureDetectorOnGestureListenerC4476xi2 != null && (c3909c6 = gestureDetectorOnGestureListenerC4476xi2.E0) != null) {
                C3909c6.a(c3909c6, 5, true, null, 12);
            }
            inMobiAdActivity.e = true;
            inMobiAdActivity.b();
        } else {
            GestureDetectorOnGestureListenerC4476xi gestureDetectorOnGestureListenerC4476xi3 = inMobiAdActivity.c;
            if (gestureDetectorOnGestureListenerC4476xi3 != null) {
                gestureDetectorOnGestureListenerC4476xi3.goBack();
            }
        }
        return true;
    }

    public static final boolean d(InMobiAdActivity inMobiAdActivity, View view, MotionEvent motionEvent) {
        GestureDetectorOnGestureListenerC4476xi gestureDetectorOnGestureListenerC4476xi;
        if (motionEvent.getAction() != 1) {
            if (motionEvent.getAction() == 0) {
                view.setBackgroundColor(-16711681);
            }
            return true;
        }
        view.setBackgroundColor(-7829368);
        GestureDetectorOnGestureListenerC4476xi gestureDetectorOnGestureListenerC4476xi2 = inMobiAdActivity.c;
        if (gestureDetectorOnGestureListenerC4476xi2 != null && gestureDetectorOnGestureListenerC4476xi2.canGoForward() && (gestureDetectorOnGestureListenerC4476xi = inMobiAdActivity.c) != null) {
            gestureDetectorOnGestureListenerC4476xi.goForward();
        }
        return true;
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean dispatchTouchEvent(MotionEvent me) {
        DetectTouchUtils.activityOnTouch(this, h.i, me);
        return super.dispatchTouchEvent(me);
    }

    @Override // android.app.Activity
    public final void onBackPressed() {
        c();
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration newConfig) {
        Intrinsics.checkNotNullParameter(newConfig, "newConfig");
        InterfaceC4466x9 interfaceC4466x9 = this.h;
        if (interfaceC4466x9 != null) {
            Intrinsics.checkNotNullExpressionValue("InMobiAdActivity", "TAG");
            ((C4493y9) interfaceC4466x9).c("InMobiAdActivity", "onConfigChanged");
        }
        super.onConfigurationChanged(newConfig);
        X8 x8 = this.a;
        if (x8 != null) {
            x8.b();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:116:0x0155, code lost:
    
        r0 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x007e, code lost:
    
        if (r1 == null) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x028d  */
    @Override // android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onCreate(Bundle bundle) {
        int i;
        C4152lb c4152lb;
        Config a;
        AbstractC4528zi abstractC4528zi;
        String str;
        String str2;
        InMobiAdActivity inMobiAdActivity;
        InterfaceC4466x9 interfaceC4466x9;
        AdConfig adConfig;
        GestureDetectorOnGestureListenerC4476xi gestureDetectorOnGestureListenerC4476xi;
        Object parcelableExtra;
        Object obj;
        super.onCreate(bundle);
        InterfaceC4466x9 interfaceC4466x92 = this.h;
        if (interfaceC4466x92 != null) {
            Intrinsics.checkNotNullExpressionValue("InMobiAdActivity", "TAG");
            ((C4493y9) interfaceC4466x92).a("InMobiAdActivity", "onCreate called");
        }
        if (!AbstractC4002fj.d()) {
            b();
            InterfaceC4466x9 interfaceC4466x93 = this.h;
            if (interfaceC4466x93 != null) {
                Intrinsics.checkNotNullExpressionValue("InMobiAdActivity", "TAG");
                ((C4493y9) interfaceC4466x93).b("InMobiAdActivity", "session not found. close");
            }
            Xb.a((byte) 2, "InMobi", "Session not found, AdActivity will be closed");
            return;
        }
        this.f = false;
        if (Build.VERSION.SDK_INT >= 29) {
            R5.c(this);
        }
        this.d = getIntent().getIntExtra("com.inmobi.ads.rendering.InMobiAdActivity.EXTRA_AD_ACTIVITY_TYPE", 102);
        this.a = new X8(this);
        String key = getIntent().getStringExtra("loggerCacheKey");
        if (key != null) {
            HashMap hashMap = Y8.a;
            Intrinsics.checkNotNullParameter(key, "key");
            try {
                WeakReference weakReference = (WeakReference) Y8.a.get(key);
                obj = weakReference != null ? weakReference.get() : null;
            } catch (ClassCastException unused) {
            }
        }
        i = this.d;
        if (i == 100) {
            if (i == 102) {
                V8 orientationListener = new V8(this);
                InterfaceC4466x9 logger = this.h;
                if (logger != null) {
                    Intrinsics.checkNotNullParameter(logger, "logger");
                    orientationListener.h = logger;
                }
                X8 x8 = this.a;
                if (x8 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("orientationHandler");
                    x8 = null;
                }
                x8.getClass();
                Intrinsics.checkNotNullParameter(orientationListener, "orientationListener");
                x8.b.add(orientationListener);
                x8.a();
                this.b = orientationListener;
                Intent intent = getIntent();
                Intrinsics.checkNotNullExpressionValue(intent, "getIntent(...)");
                orientationListener.a(intent, t);
            }
            return;
        }
        String stringExtra = getIntent().getStringExtra("com.inmobi.ads.rendering.InMobiAdActivity.IN_APP_BROWSER_URL");
        long longExtra = getIntent().getLongExtra("placementId", Long.MIN_VALUE);
        long longExtra2 = getIntent().getLongExtra("viewTouchTimestamp", -1L);
        boolean booleanExtra = getIntent().getBooleanExtra("allowAutoRedirection", false);
        String stringExtra2 = getIntent().getStringExtra("impressionId");
        String stringExtra3 = getIntent().getStringExtra("creativeId");
        boolean booleanExtra2 = getIntent().getBooleanExtra("supportLockScreen", false);
        this.n = getIntent().getBooleanExtra("isImmersive", false);
        this.o = getIntent().getBooleanExtra("supportBrowserLoader", false);
        try {
        } catch (Exception unused2) {
            c4152lb = null;
        }
        if (Build.VERSION.SDK_INT >= 33) {
            parcelableExtra = getIntent().getParcelableExtra("lpTelemetryControlInfo", C4152lb.class);
            c4152lb = (C4152lb) parcelableExtra;
        } else {
            Parcelable parcelableExtra2 = getIntent().getParcelableExtra("lpTelemetryControlInfo");
            if (parcelableExtra2 instanceof C4152lb) {
                c4152lb = (C4152lb) parcelableExtra2;
            }
            c4152lb = null;
        }
        this.r = c4152lb;
        if (booleanExtra2) {
            Intrinsics.checkNotNullExpressionValue("InMobiAdActivity", "TAG");
            getWindow().requestFeature(1);
            F5.a.getClass();
            if (Build.VERSION.SDK_INT >= 27) {
                setShowWhenLocked(true);
            } else {
                getWindow().addFlags(524288);
            }
        }
        AbstractC4528zi abstractC4528zi2 = GestureDetectorOnGestureListenerC4476xi.h1;
        GestureDetectorOnGestureListenerC4476xi gestureDetectorOnGestureListenerC4476xi2 = u;
        if (gestureDetectorOnGestureListenerC4476xi2 != null) {
            abstractC4528zi2 = gestureDetectorOnGestureListenerC4476xi2.getListener();
            a = gestureDetectorOnGestureListenerC4476xi2.getAdConfig();
        } else {
            C4277q4 c4277q4 = AbstractC4015g4.a;
            Intrinsics.checkNotNullParameter(AdConfig.class, "clazz");
            a = AbstractC4015g4.a.a(AdConfig.class);
        }
        AbstractC4528zi abstractC4528zi3 = abstractC4528zi2;
        Config config = a;
        long j = longExtra2 + 4;
        try {
            InterfaceC4466x9 interfaceC4466x94 = this.h;
            Jo jo = new Jo(interfaceC4466x94);
            Yi yi = new Yi("default", "browser");
            if (config == null) {
                Intrinsics.throwUninitializedPropertyAccessException("adConfig");
                adConfig = null;
            } else {
                adConfig = (AdConfig) config;
            }
            str = "InMobiAdActivity";
            str2 = "TAG";
            try {
                gestureDetectorOnGestureListenerC4476xi = new GestureDetectorOnGestureListenerC4476xi((Context) this, (byte) 1, (LinkedHashSet) null, stringExtra2, (String) null, j, (Bi) null, interfaceC4466x94, yi, jo, (C4221o0) null, adConfig, 164);
                inMobiAdActivity = this;
            } catch (Exception e) {
                e = e;
                inMobiAdActivity = this;
            }
        } catch (Exception e2) {
            e = e2;
            abstractC4528zi = abstractC4528zi3;
            str = "InMobiAdActivity";
            str2 = "TAG";
            inMobiAdActivity = this;
        }
        try {
            inMobiAdActivity.c = gestureDetectorOnGestureListenerC4476xi;
            gestureDetectorOnGestureListenerC4476xi.setPlacementId(longExtra);
            GestureDetectorOnGestureListenerC4476xi gestureDetectorOnGestureListenerC4476xi3 = inMobiAdActivity.c;
            if (gestureDetectorOnGestureListenerC4476xi3 != null) {
                gestureDetectorOnGestureListenerC4476xi3.setCreativeId(stringExtra3);
            }
            GestureDetectorOnGestureListenerC4476xi gestureDetectorOnGestureListenerC4476xi4 = inMobiAdActivity.c;
            if (gestureDetectorOnGestureListenerC4476xi4 != null) {
                gestureDetectorOnGestureListenerC4476xi4.setAllowAutoRedirection(booleanExtra);
            }
            GestureDetectorOnGestureListenerC4476xi gestureDetectorOnGestureListenerC4476xi5 = inMobiAdActivity.c;
            if (gestureDetectorOnGestureListenerC4476xi5 != null) {
                abstractC4528zi = abstractC4528zi3;
                try {
                    gestureDetectorOnGestureListenerC4476xi5.a(abstractC4528zi);
                } catch (Exception e3) {
                    e = e3;
                    interfaceC4466x9 = inMobiAdActivity.h;
                    if (interfaceC4466x9 != null) {
                        String str3 = str;
                        Intrinsics.checkNotNullExpressionValue(str3, str2);
                        ((C4493y9) interfaceC4466x9).a(str3, "Exception while initializing In-App browser", e);
                    }
                    Lazy lazy = AbstractC3861aa.a;
                    AbstractC3861aa.a(new Q2(e));
                    abstractC4528zi.c();
                    b();
                    return;
                }
            } else {
                abstractC4528zi = abstractC4528zi3;
            }
            GestureDetectorOnGestureListenerC4476xi gestureDetectorOnGestureListenerC4476xi6 = inMobiAdActivity.c;
            if (gestureDetectorOnGestureListenerC4476xi6 != null) {
                gestureDetectorOnGestureListenerC4476xi6.setLandingPageTelemetryControlInfoOnWebViewClient(inMobiAdActivity.r);
            }
            inMobiAdActivity.a(((AdConfig) config).getCustomBrowser().getInt());
            GestureDetectorOnGestureListenerC4476xi gestureDetectorOnGestureListenerC4476xi7 = inMobiAdActivity.c;
            if (gestureDetectorOnGestureListenerC4476xi7 != null) {
                gestureDetectorOnGestureListenerC4476xi7.setFullScreenActivityContext(inMobiAdActivity);
            }
            GestureDetectorOnGestureListenerC4476xi gestureDetectorOnGestureListenerC4476xi8 = inMobiAdActivity.c;
            if (gestureDetectorOnGestureListenerC4476xi8 != null) {
                Intrinsics.checkNotNull(stringExtra);
                gestureDetectorOnGestureListenerC4476xi8.loadUrl(stringExtra);
            }
            X8 x82 = inMobiAdActivity.a;
            if (x82 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("orientationHandler");
                x82 = null;
            }
            GestureDetectorOnGestureListenerC4476xi orientationListener2 = inMobiAdActivity.c;
            Intrinsics.checkNotNull(orientationListener2);
            x82.getClass();
            Intrinsics.checkNotNullParameter(orientationListener2, "orientationListener");
            x82.b.add(orientationListener2);
            x82.a();
            return;
        } catch (Exception e4) {
            e = e4;
            abstractC4528zi = abstractC4528zi3;
            interfaceC4466x9 = inMobiAdActivity.h;
            if (interfaceC4466x9 != null) {
            }
            Lazy lazy2 = AbstractC3861aa.a;
            AbstractC3861aa.a(new Q2(e));
            abstractC4528zi.c();
            b();
            return;
        }
        obj = null;
        this.h = (InterfaceC4466x9) obj;
        i = this.d;
        if (i == 100) {
        }
    }

    @Override // android.app.Activity
    public final void onDestroy() {
        V8 v8;
        GestureDetectorOnGestureListenerC4476xi gestureDetectorOnGestureListenerC4476xi;
        C3909c6 c3909c6;
        B fullScreenEventsListener;
        InterfaceC4466x9 interfaceC4466x9 = this.h;
        if (interfaceC4466x9 != null) {
            Intrinsics.checkNotNullExpressionValue("InMobiAdActivity", "TAG");
            ((C4493y9) interfaceC4466x9).c("InMobiAdActivity", "onDestroy");
        }
        int i = this.d;
        if (100 == i) {
            a();
            GestureDetectorOnGestureListenerC4476xi gestureDetectorOnGestureListenerC4476xi2 = u;
            if (gestureDetectorOnGestureListenerC4476xi2 != null) {
                GestureDetectorOnGestureListenerC4476xi.g1.getClass();
                gestureDetectorOnGestureListenerC4476xi2.c(C3947di.a("IN_CUSTOM_BROWSER", "onClose"));
            }
            u = null;
        } else if (102 == i && (v8 = this.b) != null && v8.e != null) {
            GestureDetectorOnGestureListenerC4476xi.g1.getClass();
            v8.a(C3947di.a("IN_CUSTOM_EXPAND", "onClose"));
        }
        if (this.e) {
            int i2 = this.d;
            if (100 == i2) {
                GestureDetectorOnGestureListenerC4476xi gestureDetectorOnGestureListenerC4476xi3 = this.c;
                if (gestureDetectorOnGestureListenerC4476xi3 != null && (fullScreenEventsListener = gestureDetectorOnGestureListenerC4476xi3.getFullScreenEventsListener()) != null) {
                    try {
                        C4291qi c4291qi = (C4291qi) fullScreenEventsListener;
                        InterfaceC4466x9 interfaceC4466x92 = c4291qi.a.i;
                        if (interfaceC4466x92 != null) {
                            String str = GestureDetectorOnGestureListenerC4476xi.i1;
                            Intrinsics.checkNotNullExpressionValue(str, "access$getTAG$cp(...)");
                            ((C4493y9) interfaceC4466x92).a(str, Zf.m);
                        }
                        if (Intrinsics.areEqual("Default", c4291qi.a.getViewState())) {
                            c4291qi.a.setAndUpdateViewState("Hidden");
                        }
                        c4291qi.a.W();
                        GestureDetectorOnGestureListenerC4476xi gestureDetectorOnGestureListenerC4476xi4 = this.c;
                        Intrinsics.checkNotNull(gestureDetectorOnGestureListenerC4476xi4);
                        gestureDetectorOnGestureListenerC4476xi4.b();
                        X8 x8 = this.a;
                        if (x8 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("orientationHandler");
                            x8 = null;
                        }
                        GestureDetectorOnGestureListenerC4476xi orientationListener = this.c;
                        Intrinsics.checkNotNull(orientationListener);
                        x8.getClass();
                        Intrinsics.checkNotNullParameter(orientationListener, "orientationListener");
                        x8.b.remove(orientationListener);
                        x8.a();
                        this.c = null;
                    } catch (Exception unused) {
                    }
                }
            } else if (102 == i2) {
                V8 orientationListener2 = this.b;
                if (orientationListener2 != null) {
                    X8 x82 = this.a;
                    if (x82 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("orientationHandler");
                        x82 = null;
                    }
                    x82.getClass();
                    Intrinsics.checkNotNullParameter(orientationListener2, "orientationListener");
                    x82.b.remove(orientationListener2);
                    x82.a();
                    C4517z7 c4517z7 = orientationListener2.c;
                    if (c4517z7 != null) {
                        c4517z7.b();
                    }
                    RelativeLayout relativeLayout = orientationListener2.d;
                    if (relativeLayout != null) {
                        relativeLayout.removeAllViews();
                    }
                    Y5 y5 = orientationListener2.e;
                    if (y5 != null) {
                        C3935d6 c3935d6 = y5.c;
                        if (c3935d6 != null) {
                            c3935d6.destroy();
                        }
                        y5.c = null;
                        y5.d = null;
                        y5.e = null;
                        Wo wo = y5.g;
                        if (wo != null) {
                            wo.a();
                        }
                        y5.removeAllViews();
                    }
                    orientationListener2.a.clear();
                    orientationListener2.b = null;
                    orientationListener2.c = null;
                    orientationListener2.d = null;
                    orientationListener2.e = null;
                }
                this.b = null;
            }
        } else {
            int i3 = this.d;
            if (100 != i3 && 102 == i3) {
                V8 orientationListener3 = this.b;
                if (orientationListener3 != null) {
                    X8 x83 = this.a;
                    if (x83 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("orientationHandler");
                        x83 = null;
                    }
                    x83.getClass();
                    Intrinsics.checkNotNullParameter(orientationListener3, "orientationListener");
                    x83.b.remove(orientationListener3);
                    x83.a();
                    C4517z7 c4517z72 = orientationListener3.c;
                    if (c4517z72 != null) {
                        c4517z72.b();
                    }
                    RelativeLayout relativeLayout2 = orientationListener3.d;
                    if (relativeLayout2 != null) {
                        relativeLayout2.removeAllViews();
                    }
                    Y5 y52 = orientationListener3.e;
                    if (y52 != null) {
                        C3935d6 c3935d62 = y52.c;
                        if (c3935d62 != null) {
                            c3935d62.destroy();
                        }
                        y52.c = null;
                        y52.d = null;
                        y52.e = null;
                        Wo wo2 = y52.g;
                        if (wo2 != null) {
                            wo2.a();
                        }
                        y52.removeAllViews();
                    }
                    orientationListener3.a.clear();
                    orientationListener3.b = null;
                    orientationListener3.c = null;
                    orientationListener3.d = null;
                    orientationListener3.e = null;
                }
                this.b = null;
            }
            if (100 == this.d && (gestureDetectorOnGestureListenerC4476xi = this.c) != null && (c3909c6 = gestureDetectorOnGestureListenerC4476xi.E0) != null) {
                C3909c6.a(c3909c6, 9, true, null, 12);
                C4266pj c4266pj = c3909c6.m;
                if (!c4266pj.f && c4266pj.a > 0) {
                    c4266pj.f = true;
                    c4266pj.g = EnumC4213nj.f;
                    c4266pj.a();
                }
                CoroutineScopeKt.cancel$default(c4266pj.d, null, 1, null);
            }
        }
        Wo wo3 = this.i;
        if (wo3 != null) {
            wo3.a();
        }
        this.i = null;
        CoroutineScopeKt.cancel$default(this.l, null, 1, null);
        super.onDestroy();
    }

    @Override // android.app.Activity
    public final void onMultiWindowModeChanged(boolean z) {
        V8 v8;
        X8 x8;
        InterfaceC4466x9 interfaceC4466x9 = this.h;
        if (interfaceC4466x9 != null) {
            Intrinsics.checkNotNullExpressionValue("InMobiAdActivity", "TAG");
            ((C4493y9) interfaceC4466x9).c("InMobiAdActivity", "multiWindow mode - " + z);
        }
        super.onMultiWindowModeChanged(z);
        if (z || (v8 = this.b) == null) {
            return;
        }
        C c = v8.b;
        Vf orientationProperties = (c == null || !(c instanceof GestureDetectorOnGestureListenerC4476xi)) ? null : ((GestureDetectorOnGestureListenerC4476xi) c).getOrientationProperties();
        if (orientationProperties == null || (x8 = this.a) == null) {
            return;
        }
        x8.a(orientationProperties);
    }

    @Override // android.app.Activity
    public final void onNewIntent(Intent intent) {
        Intrinsics.checkNotNullParameter(intent, "intent");
        InterfaceC4466x9 interfaceC4466x9 = this.h;
        if (interfaceC4466x9 != null) {
            Intrinsics.checkNotNullExpressionValue("InMobiAdActivity", "TAG");
            ((C4493y9) interfaceC4466x9).c("InMobiAdActivity", "onNewIntent");
        }
        super.onNewIntent(intent);
        this.f = false;
        this.c = null;
        setIntent(intent);
        V8 v8 = this.b;
        if (v8 != null) {
            SparseArray adContainers = t;
            Intrinsics.checkNotNullParameter(intent, "intent");
            Intrinsics.checkNotNullParameter(adContainers, "adContainers");
            v8.a(intent, adContainers);
            C4517z7 c4517z7 = v8.c;
            if (c4517z7 != null) {
                c4517z7.e();
            }
        }
    }

    @Override // android.app.Activity
    public final void onPause() {
        V8 v8;
        super.onPause();
        int i = this.d;
        if (100 == i) {
            GestureDetectorOnGestureListenerC4476xi gestureDetectorOnGestureListenerC4476xi = u;
            if (gestureDetectorOnGestureListenerC4476xi != null) {
                GestureDetectorOnGestureListenerC4476xi.g1.getClass();
                gestureDetectorOnGestureListenerC4476xi.c(C3947di.a("IN_CUSTOM_BROWSER", "onHidden"));
                return;
            }
            return;
        }
        if (102 != i || (v8 = this.b) == null || v8.e == null) {
            return;
        }
        GestureDetectorOnGestureListenerC4476xi.g1.getClass();
        v8.a(C3947di.a("IN_CUSTOM_EXPAND", "onHidden"));
    }

    @Override // android.app.Activity
    public final void onResume() {
        C4517z7 c4517z7;
        B fullScreenEventsListener;
        InterfaceC4466x9 interfaceC4466x9 = this.h;
        if (interfaceC4466x9 != null) {
            Intrinsics.checkNotNullExpressionValue("InMobiAdActivity", "TAG");
            ((C4493y9) interfaceC4466x9).c("InMobiAdActivity", X3.i.u0);
        }
        super.onResume();
        if (this.e) {
            return;
        }
        int i = this.d;
        if (100 == i) {
            GestureDetectorOnGestureListenerC4476xi gestureDetectorOnGestureListenerC4476xi = this.c;
            if (gestureDetectorOnGestureListenerC4476xi != null && (fullScreenEventsListener = gestureDetectorOnGestureListenerC4476xi.getFullScreenEventsListener()) != null) {
                try {
                    if (!this.f) {
                        this.f = true;
                        ((C4291qi) fullScreenEventsListener).b();
                    }
                } catch (Exception unused) {
                }
            }
            GestureDetectorOnGestureListenerC4476xi gestureDetectorOnGestureListenerC4476xi2 = u;
            if (gestureDetectorOnGestureListenerC4476xi2 != null) {
                GestureDetectorOnGestureListenerC4476xi.g1.getClass();
                gestureDetectorOnGestureListenerC4476xi2.c(C3947di.a("IN_CUSTOM_BROWSER", "onVisible"));
                return;
            }
            return;
        }
        if (102 == i) {
            V8 v8 = this.b;
            if (v8 != null && (c4517z7 = v8.c) != null && !c4517z7.h) {
                try {
                    c4517z7.h = true;
                    B fullScreenEventsListener2 = c4517z7.f.getFullScreenEventsListener();
                    if (fullScreenEventsListener2 != null) {
                        ((C4291qi) fullScreenEventsListener2).b();
                    }
                } catch (Exception unused2) {
                }
            }
            V8 v82 = this.b;
            if (v82 == null || v82.e == null) {
                return;
            }
            GestureDetectorOnGestureListenerC4476xi.g1.getClass();
            v82.a(C3947di.a("IN_CUSTOM_EXPAND", "onVisible"));
        }
    }

    @Override // android.app.Activity
    public final void onStart() {
        V8 v8;
        Window window;
        OnBackInvokedDispatcher onBackInvokedDispatcher;
        InterfaceC4466x9 interfaceC4466x9 = this.h;
        if (interfaceC4466x9 != null) {
            Intrinsics.checkNotNullExpressionValue("InMobiAdActivity", "TAG");
            ((C4493y9) interfaceC4466x9).c("InMobiAdActivity", "onStart");
        }
        super.onStart();
        F5.a.getClass();
        if (Build.VERSION.SDK_INT >= 33) {
            if (this.j == null) {
                this.j = new OnBackInvokedCallback() { // from class: com.inmobi.ads.rendering.InMobiAdActivity$$ExternalSyntheticLambda5
                    public final void onBackInvoked() {
                        InMobiAdActivity.a(InMobiAdActivity.this);
                    }
                };
            }
            onBackInvokedDispatcher = getOnBackInvokedDispatcher();
            OnBackInvokedCallback onBackInvokedCallback = this.j;
            if (onBackInvokedCallback == null) {
                Intrinsics.throwUninitializedPropertyAccessException("backInvokedCallback");
                onBackInvokedCallback = null;
            }
            onBackInvokedDispatcher.registerOnBackInvokedCallback(0, onBackInvokedCallback);
        }
        if (this.e || 102 != this.d || (v8 = this.b) == null) {
            return;
        }
        C4517z7 c4517z7 = v8.c;
        if (c4517z7 != null) {
            c4517z7.e();
        }
        C c = v8.b;
        if (c != null) {
            if ((c instanceof GestureDetectorOnGestureListenerC4476xi ? ((GestureDetectorOnGestureListenerC4476xi) c).X0 : false) && !F5.t() && F5.w()) {
                Object obj = v8.a.get();
                InMobiAdActivity inMobiAdActivity = obj instanceof InMobiAdActivity ? (InMobiAdActivity) obj : null;
                if (inMobiAdActivity == null || (window = inMobiAdActivity.getWindow()) == null) {
                    return;
                }
                window.getDecorView().setSystemUiVisibility(5638);
            }
        }
    }

    @Override // android.app.Activity
    public final void onStop() {
        OnBackInvokedDispatcher onBackInvokedDispatcher;
        InterfaceC4466x9 interfaceC4466x9 = this.h;
        if (interfaceC4466x9 != null) {
            Intrinsics.checkNotNullExpressionValue("InMobiAdActivity", "TAG");
            ((C4493y9) interfaceC4466x9).c("InMobiAdActivity", "onStop");
        }
        super.onStop();
        F5.a.getClass();
        if (Build.VERSION.SDK_INT >= 33 && this.j != null) {
            onBackInvokedDispatcher = getOnBackInvokedDispatcher();
            OnBackInvokedCallback onBackInvokedCallback = this.j;
            if (onBackInvokedCallback == null) {
                Intrinsics.throwUninitializedPropertyAccessException("backInvokedCallback");
                onBackInvokedCallback = null;
            }
            onBackInvokedDispatcher.unregisterOnBackInvokedCallback(onBackInvokedCallback);
        }
        if (this.d == 100) {
            a("ACTIVITY_STOP");
        }
    }

    public final void a(AdConfig.FormatCustomBrowserConfig formatCustomBrowserConfig) {
        Job launch$default;
        View inflate = getLayoutInflater().inflate(R.layout.inmobi_in_app_browser_activity, (ViewGroup) null);
        if (inflate == null) {
            return;
        }
        this.p = (RelativeLayout) inflate.findViewById(R.id.inmobi_in_app_browser_webview_container);
        this.q = (FrameLayout) inflate.findViewById(R.id.inmobi_in_app_browser_loader_overlay);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
        layoutParams.addRule(10);
        layoutParams.addRule(2, R.id.inmobi_in_app_browser_bottom_bar);
        ViewGroup viewGroup = this.p;
        if (viewGroup != null) {
            viewGroup.addView(this.c, layoutParams);
            a(viewGroup);
            long loaderTimeout = formatCustomBrowserConfig.getLoaderTimeout();
            if (!this.o || loaderTimeout <= 0) {
                FrameLayout frameLayout = this.q;
                if (frameLayout != null) {
                    frameLayout.setVisibility(8);
                }
            } else {
                viewGroup.setVisibility(8);
                FrameLayout frameLayout2 = this.q;
                if (frameLayout2 != null) {
                    frameLayout2.setVisibility(0);
                }
                this.k = true;
                if (this.n) {
                    Window window = getWindow();
                    Intrinsics.checkNotNullExpressionValue(window, "getWindow(...)");
                    Lazy lazy = Oi.a;
                    Intrinsics.checkNotNullParameter(window, "<this>");
                    F5.a.getClass();
                    if (F5.t()) {
                        Oi.a(window, 3);
                    } else if (F5.r()) {
                        Oi.a(window, 1);
                    }
                    Window window2 = getWindow();
                    Intrinsics.checkNotNullExpressionValue(window2, "getWindow(...)");
                    Oi.a(window2);
                }
                this.s = SystemClock.elapsedRealtime();
                AbstractC3914cb.a("InAppBrowserLoaderShown", this.r, (String) null, (Long) null);
                long loaderTimeout2 = formatCustomBrowserConfig.getLoaderTimeout();
                if (this.k) {
                    a();
                    launch$default = BuildersKt__Builders_commonKt.launch$default(this.l, null, null, new C3860a9(loaderTimeout2, this, null), 3, null);
                    this.m = launch$default;
                }
            }
        }
        setContentView(inflate);
    }

    public final void b() {
        if (isTaskRoot()) {
            F5.a.getClass();
            if (F5.x()) {
                finishAndRemoveTask();
                return;
            }
        }
        finish();
    }

    @Override // android.app.Activity
    public final void onMultiWindowModeChanged(boolean z, Configuration newConfig) {
        Intrinsics.checkNotNullParameter(newConfig, "newConfig");
        super.onMultiWindowModeChanged(z, newConfig);
        onMultiWindowModeChanged(z);
    }

    public final void c() {
        C3909c6 c3909c6;
        C4517z7 c4517z7;
        InterfaceC4466x9 interfaceC4466x9 = this.h;
        if (interfaceC4466x9 != null) {
            Intrinsics.checkNotNullExpressionValue("InMobiAdActivity", "TAG");
            ((C4493y9) interfaceC4466x9).c("InMobiAdActivity", "onBackPressed");
        }
        int i = this.d;
        if (i == 102) {
            InterfaceC4466x9 interfaceC4466x92 = this.h;
            if (interfaceC4466x92 != null) {
                Intrinsics.checkNotNullExpressionValue("InMobiAdActivity", "TAG");
                ((C4493y9) interfaceC4466x92).c("InMobiAdActivity", "back pressed on ad");
            }
            V8 v8 = this.b;
            if (v8 == null || (c4517z7 = v8.c) == null) {
                return;
            }
            c4517z7.a();
            return;
        }
        if (i != 100 || this.k) {
            return;
        }
        InterfaceC4466x9 interfaceC4466x93 = this.h;
        if (interfaceC4466x93 != null) {
            Intrinsics.checkNotNullExpressionValue("InMobiAdActivity", "TAG");
            ((C4493y9) interfaceC4466x93).c("InMobiAdActivity", "back pressed in browser");
        }
        GestureDetectorOnGestureListenerC4476xi gestureDetectorOnGestureListenerC4476xi = this.c;
        if (gestureDetectorOnGestureListenerC4476xi != null && (c3909c6 = gestureDetectorOnGestureListenerC4476xi.E0) != null) {
            C3909c6.a(c3909c6, 7, true, null, 12);
        }
        this.e = true;
        b();
    }

    public final void a(String reason) {
        C3909c6 c3909c6;
        C4266pj c4266pj;
        boolean z;
        Intrinsics.checkNotNullParameter(reason, "reason");
        if (this.k) {
            InterfaceC4466x9 interfaceC4466x9 = this.h;
            if (interfaceC4466x9 != null) {
                Intrinsics.checkNotNullExpressionValue("InMobiAdActivity", "TAG");
                ((C4493y9) interfaceC4466x9).a("InMobiAdActivity", "hideLoaderAndShowWebView reason=" + reason);
            }
            FrameLayout frameLayout = this.q;
            if (frameLayout != null) {
                frameLayout.setVisibility(8);
            }
            RelativeLayout relativeLayout = this.p;
            if (relativeLayout != null) {
                relativeLayout.setVisibility(0);
            }
            if (this.n) {
                Window window = getWindow();
                Intrinsics.checkNotNullExpressionValue(window, "getWindow(...)");
                Oi.b(window);
                Window window2 = getWindow();
                Intrinsics.checkNotNullExpressionValue(window2, "getWindow(...)");
                Oi.c(window2);
            }
            this.k = false;
            a();
            GestureDetectorOnGestureListenerC4476xi gestureDetectorOnGestureListenerC4476xi = this.c;
            if (gestureDetectorOnGestureListenerC4476xi != null && (c3909c6 = gestureDetectorOnGestureListenerC4476xi.E0) != null && !(z = (c4266pj = c3909c6.m).f) && !z && c4266pj.a > 0) {
                c4266pj.f = true;
                c4266pj.g = EnumC4213nj.f;
                c4266pj.a();
            }
            AbstractC3914cb.a("InAppBrowserLoaderHidden", this.r, reason, Long.valueOf(SystemClock.elapsedRealtime() - this.s));
        }
    }

    public final void a() {
        try {
            Job job = this.m;
            if (job != null) {
                JobKt.ensureActive(job);
            }
            Job job2 = this.m;
            if (job2 != null) {
                Job.DefaultImpls.cancel$default(job2, null, 1, null);
            }
        } catch (Exception unused) {
        }
        this.m = null;
    }

    public final void a(ViewGroup viewGroup) {
        ViewGroup.LayoutParams layoutParams = ((LinearLayout) viewGroup.findViewById(R.id.inmobi_in_app_browser_bottom_bar)).getLayoutParams();
        Intrinsics.checkNotNull(layoutParams, "null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
        RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) layoutParams;
        if (N3.a(this)) {
            Wo wo = this.i;
            if (wo != null) {
                wo.a();
            }
            this.i = new Wo(this, new Z8(layoutParams2), this.h);
        }
        C4303r5 c4303r5 = new C4303r5(this, (byte) 2, this.h);
        c4303r5.setOnTouchListener(new View.OnTouchListener() { // from class: com.inmobi.ads.rendering.InMobiAdActivity$$ExternalSyntheticLambda1
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                return InMobiAdActivity.a(InMobiAdActivity.this, view, motionEvent);
            }
        });
        C4303r5 c4303r52 = new C4303r5(this, (byte) 3, this.h);
        c4303r52.setOnTouchListener(new View.OnTouchListener() { // from class: com.inmobi.ads.rendering.InMobiAdActivity$$ExternalSyntheticLambda2
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                return InMobiAdActivity.b(InMobiAdActivity.this, view, motionEvent);
            }
        });
        C4303r5 c4303r53 = new C4303r5(this, (byte) 4, this.h);
        c4303r53.setOnTouchListener(new View.OnTouchListener() { // from class: com.inmobi.ads.rendering.InMobiAdActivity$$ExternalSyntheticLambda3
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                return InMobiAdActivity.c(InMobiAdActivity.this, view, motionEvent);
            }
        });
        C4303r5 c4303r54 = new C4303r5(this, (byte) 6, this.h);
        c4303r54.setOnTouchListener(new View.OnTouchListener() { // from class: com.inmobi.ads.rendering.InMobiAdActivity$$ExternalSyntheticLambda4
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                return InMobiAdActivity.d(InMobiAdActivity.this, view, motionEvent);
            }
        });
        try {
            ((FrameLayout) viewGroup.findViewById(R.id.inmobi_in_app_browser_close_slot)).addView(c4303r5);
            ((FrameLayout) viewGroup.findViewById(R.id.inmobi_in_app_browser_refresh_slot)).addView(c4303r52);
            ((FrameLayout) viewGroup.findViewById(R.id.inmobi_in_app_browser_back_slot)).addView(c4303r53);
            ((FrameLayout) viewGroup.findViewById(R.id.inmobi_in_app_browser_forward_slot)).addView(c4303r54);
        } catch (Exception e) {
            InterfaceC4466x9 interfaceC4466x9 = this.h;
            if (interfaceC4466x9 != null) {
                Intrinsics.checkNotNullExpressionValue("InMobiAdActivity", "TAG");
                ((C4493y9) interfaceC4466x9).a("InMobiAdActivity", "Error setting up bottom bar buttons", e);
            }
        }
    }

    public static final boolean a(InMobiAdActivity inMobiAdActivity, View view, MotionEvent motionEvent) {
        C3909c6 c3909c6;
        if (motionEvent.getAction() == 1) {
            view.setBackgroundColor(-7829368);
            GestureDetectorOnGestureListenerC4476xi gestureDetectorOnGestureListenerC4476xi = inMobiAdActivity.c;
            if (gestureDetectorOnGestureListenerC4476xi != null && (c3909c6 = gestureDetectorOnGestureListenerC4476xi.E0) != null) {
                C3909c6.a(c3909c6, 5, true, null, 12);
            }
            inMobiAdActivity.e = true;
            inMobiAdActivity.b();
            return true;
        }
        if (motionEvent.getAction() == 0) {
            view.setBackgroundColor(-16711681);
        }
        return true;
    }
}
