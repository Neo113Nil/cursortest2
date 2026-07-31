package com.vungle.ads.internal.ui;

import android.R;
import android.app.Activity;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.view.Window;
import android.widget.FrameLayout;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import androidx.appcompat.app.AppCompatDelegateImpl$Api33Impl$$ExternalSyntheticApiModelOutline0;
import androidx.core.graphics.Insets;
import androidx.core.view.OnApplyWindowInsetsListener;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.core.view.WindowInsetsControllerCompat;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import com.vungle.ads.AdCantPlayWithoutWebView;
import com.vungle.ads.AdConfig;
import com.vungle.ads.AdNotLoadedCantPlay;
import com.vungle.ads.ConcurrentPlaybackUnsupported;
import com.vungle.ads.VungleError;
import com.vungle.ads.internal.AnalyticsClient;
import com.vungle.ads.internal.m2;
import com.vungle.ads.internal.model.h0;
import com.vungle.ads.internal.model.i3;
import com.vungle.ads.internal.model.r3;
import com.vungle.ads.internal.presenter.e0;
import com.vungle.ads.internal.protos.Sdk;
import com.vungle.ads.internal.y0;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Pair;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes15.dex */
public abstract class l extends Activity {
    public static volatile y0 h;
    public static volatile com.vungle.ads.internal.presenter.a i;
    public com.vungle.ads.internal.presenter.r a;
    public r3 b;
    public Object c;
    public com.vungle.ads.internal.util.s e;
    public final com.vungle.ads.internal.util.w d = new com.vungle.ads.internal.util.w();
    public final b f = new b(this);
    public final AtomicBoolean g = new AtomicBoolean(false);

    static {
        new a();
    }

    public static final void b(l this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        com.vungle.ads.internal.presenter.r rVar = this$0.a;
        if (rVar != null) {
            rVar.d();
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean dispatchTouchEvent(MotionEvent me) {
        DetectTouchUtils.activityOnTouch(this, com.safedk.android.utils.h.d, me);
        return super.dispatchTouchEvent(me);
    }

    @Override // android.app.Activity
    public final void onActivityResult(int i2, int i3, Intent intent) {
        super.onActivityResult(i2, i3, intent);
        boolean z = com.vungle.ads.internal.util.u.a;
        com.vungle.ads.internal.util.t.a("AdActivity", new c(i2, i3, intent));
        if (i2 == 10001) {
            this.g.set(false);
            com.vungle.ads.internal.presenter.r rVar = this.a;
            if (rVar != null) {
                m2 m2Var = new m2(Sdk.SDKMetric.SDKMetricType.INLINE_INSTALL_STATUS);
                m2Var.c = 1L;
                AnalyticsClient.INSTANCE.a(m2Var, rVar.b(), "onActivityResultCode=" + i3);
            }
        }
    }

    @Override // android.app.Activity
    public final void onBackPressed() {
        com.vungle.ads.internal.presenter.r rVar = this.a;
        if (rVar != null) {
            rVar.d();
        }
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration newConfig) {
        Intrinsics.checkNotNullParameter(newConfig, "newConfig");
        try {
            super.onConfigurationChanged(newConfig);
            int i2 = newConfig.orientation;
            if (i2 == 2) {
                boolean z = com.vungle.ads.internal.util.u.a;
                com.vungle.ads.internal.util.t.a("AdActivity", "landscape");
            } else if (i2 == 1) {
                boolean z2 = com.vungle.ads.internal.util.u.a;
                com.vungle.ads.internal.util.t.a("AdActivity", "portrait");
            }
            com.vungle.ads.internal.presenter.r rVar = this.a;
            if (rVar != null) {
                rVar.f();
            }
        } catch (Exception e) {
            boolean z3 = com.vungle.ads.internal.util.u.a;
            StringBuilder a = com.iab.omid.library.vungle.internal.l.a("onConfigurationChanged: ");
            a.append(e.getLocalizedMessage());
            com.vungle.ads.internal.util.t.b("AdActivity", a.toString());
        }
    }

    @Override // android.app.Activity
    public final void onCreate(Bundle bundle) {
        String watermark$vungle_ads_release;
        View decorView;
        super.onCreate(bundle);
        requestWindowFeature(1);
        getWindow().setFlags(16777216, 16777216);
        y0 y0Var = h;
        com.vungle.ads.internal.presenter.a aVar = i;
        if (y0Var == null) {
            Intent intent = getIntent();
            Intrinsics.checkNotNullExpressionValue(intent, "intent");
            String b = a.b(intent);
            if (b == null) {
                b = "";
            }
            if (aVar != null) {
                aVar.a(new AdNotLoadedCantPlay("Can not play fullscreen ad. placement=" + b + " pendingData is null").setLogEntry$vungle_ads_release(this.e).logError$vungle_ads_release(), b);
            }
            finish();
            return;
        }
        h0 a = y0Var.a();
        i3 b2 = y0Var.b();
        com.vungle.ads.internal.presenter.z c = y0Var.c();
        this.e = a.q();
        try {
            com.vungle.ads.internal.ui.view.k kVar = new com.vungle.ads.internal.ui.view.k(this, a.h());
            WindowCompat.setDecorFitsSystemWindows(getWindow(), false);
            long j = getIntent().getBooleanExtra("ad_invisible_logged", false) ? 3L : 2L;
            AnalyticsClient analyticsClient = AnalyticsClient.INSTANCE;
            m2 m2Var = new m2(Sdk.SDKMetric.SDKMetricType.AD_VISIBILITY);
            m2Var.a(Long.valueOf(j));
            AnalyticsClient.a(analyticsClient, m2Var, this.e, 4);
            boolean z = com.vungle.ads.internal.util.u.a;
            com.vungle.ads.internal.util.t.a("AdActivity", "Log metric AD_VISIBILITY: " + j);
            LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.SYNCHRONIZED;
            Lazy lazy = LazyKt.lazy(lazyThreadSafetyMode, new d(this));
            Intent intent2 = getIntent();
            Intrinsics.checkNotNullExpressionValue(intent2, "intent");
            String a2 = a.a(intent2);
            FrameLayout frameLayout = null;
            r3 r3Var = a2 != null ? new r3(a2) : null;
            this.b = r3Var;
            if (r3Var != null) {
                ((com.vungle.ads.internal.signals.j) lazy.getValue()).a(r3Var);
            }
            kVar.setCloseDelegate(new h(this, lazy));
            kVar.setOnViewTouchListener(new i(this));
            kVar.setOrientationDelegate(new j(this));
            Lazy lazy2 = LazyKt.lazy(lazyThreadSafetyMode, new e(this));
            Lazy lazy3 = LazyKt.lazy(lazyThreadSafetyMode, new f(this));
            com.vungle.ads.internal.executor.j f = ((com.vungle.ads.internal.executor.d) ((com.vungle.ads.internal.executor.a) lazy2.getValue())).f();
            ReentrantLock reentrantLock = e0.a;
            z a3 = e0.a(a, b2, f, (com.vungle.ads.internal.platform.f) lazy3.getValue());
            com.vungle.ads.internal.omsdk.d dVar = (com.vungle.ads.internal.omsdk.d) LazyKt.lazy(lazyThreadSafetyMode, new g(this)).getValue();
            boolean C = a.C();
            dVar.getClass();
            com.vungle.ads.internal.omsdk.e a4 = com.vungle.ads.internal.omsdk.d.a(C);
            com.vungle.ads.internal.executor.j d = ((com.vungle.ads.internal.executor.d) ((com.vungle.ads.internal.executor.a) lazy2.getValue())).d();
            a3.a(a4);
            this.d.a(a3);
            com.vungle.ads.internal.presenter.r rVar = new com.vungle.ads.internal.presenter.r(kVar, a, b2, a3, d, a4, (com.vungle.ads.internal.platform.f) lazy3.getValue());
            rVar.a(aVar);
            rVar.a(c);
            rVar.a(new k(this));
            rVar.g();
            setContentView(kVar, kVar.getLayoutParams());
            try {
                Result.Companion companion = Result.INSTANCE;
                getWindow().getDecorView().setBackgroundColor(-16777216);
                Result.m8023constructorimpl(Unit.INSTANCE);
            } catch (Throwable th) {
                Result.Companion companion2 = Result.INSTANCE;
                Result.m8023constructorimpl(ResultKt.createFailure(th));
            }
            ViewCompat.setOnApplyWindowInsetsListener(kVar, new OnApplyWindowInsetsListener() { // from class: com.vungle.ads.internal.ui.l$$ExternalSyntheticLambda2
                @Override // androidx.core.view.OnApplyWindowInsetsListener
                public final WindowInsetsCompat onApplyWindowInsets(View view, WindowInsetsCompat windowInsetsCompat) {
                    return l.a(l.this, view, windowInsetsCompat);
                }
            });
            WindowInsetsControllerCompat insetsController = WindowCompat.getInsetsController(getWindow(), getWindow().getDecorView());
            Intrinsics.checkNotNullExpressionValue(insetsController, "getInsetsController(window, window.decorView)");
            insetsController.setSystemBarsBehavior(2);
            insetsController.hide(WindowInsetsCompat.Type.systemBars());
            AdConfig j2 = a.j();
            if (j2 != null && (watermark$vungle_ads_release = j2.getWatermark$vungle_ads_release()) != null) {
                Window window = getWindow();
                if (window != null && (decorView = window.getDecorView()) != null) {
                    frameLayout = (FrameLayout) decorView.findViewById(R.id.content);
                }
                if (frameLayout != null) {
                    a0 a0Var = new a0(this, watermark$vungle_ads_release);
                    frameLayout.addView(a0Var);
                    a0Var.bringToFront();
                }
            }
            this.a = rVar;
            if (Build.VERSION.SDK_INT >= 33) {
                a();
            }
            com.vungle.ads.internal.util.d dVar2 = com.vungle.ads.internal.util.d.f;
            com.vungle.ads.internal.util.a.a(this.f);
            try {
                Result.m8023constructorimpl(registerReceiver(this.d, new IntentFilter("android.media.RINGER_MODE_CHANGED")));
            } catch (Throwable th2) {
                Result.Companion companion3 = Result.INSTANCE;
                Result.m8023constructorimpl(ResultKt.createFailure(th2));
            }
        } catch (InstantiationException e) {
            if (aVar != null) {
                aVar.a(new AdCantPlayWithoutWebView(e.getMessage()).setLogEntry$vungle_ads_release(this.e).logError$vungle_ads_release(), b2.b());
            }
            finish();
        }
    }

    @Override // android.app.Activity
    public final void onDestroy() {
        OnBackInvokedDispatcher onBackInvokedDispatcher;
        if (Build.VERSION.SDK_INT >= 33) {
            Object obj = this.c;
            OnBackInvokedCallback m = l$$ExternalSyntheticApiModelOutline0.m(obj) ? AppCompatDelegateImpl$Api33Impl$$ExternalSyntheticApiModelOutline0.m(obj) : null;
            if (m != null) {
                onBackInvokedDispatcher = getOnBackInvokedDispatcher();
                onBackInvokedDispatcher.unregisterOnBackInvokedCallback(m);
            }
            this.c = null;
        }
        com.vungle.ads.internal.presenter.r rVar = this.a;
        if (rVar != null) {
            rVar.a((isChangingConfigurations() ? 1 : 0) | 2);
        }
        com.vungle.ads.internal.presenter.r rVar2 = this.a;
        if (rVar2 != null) {
            rVar2.a((k) null);
        }
        com.vungle.ads.internal.util.d dVar = com.vungle.ads.internal.util.d.f;
        com.vungle.ads.internal.util.a.b(this.f);
        try {
            Result.Companion companion = Result.INSTANCE;
            unregisterReceiver(this.d);
            Result.m8023constructorimpl(Unit.INSTANCE);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            Result.m8023constructorimpl(ResultKt.createFailure(th));
        }
        this.a = null;
        i = null;
        h = null;
        super.onDestroy();
    }

    @Override // android.app.Activity
    public final void onNewIntent(Intent intent) {
        Intrinsics.checkNotNullParameter(intent, "intent");
        super.onNewIntent(intent);
        Intent intent2 = getIntent();
        Intrinsics.checkNotNullExpressionValue(intent2, "getIntent()");
        Pair pair = TuplesKt.to(a.b(intent2), a.b(intent));
        String str = (String) pair.component1();
        String str2 = (String) pair.component2();
        Intent intent3 = getIntent();
        Intrinsics.checkNotNullExpressionValue(intent3, "getIntent()");
        Pair pair2 = TuplesKt.to(a.a(intent3), a.a(intent));
        String str3 = (String) pair2.component1();
        String str4 = (String) pair2.component2();
        if ((str == null || str2 == null || Intrinsics.areEqual(str, str2)) && (str3 == null || str4 == null || Intrinsics.areEqual(str3, str4))) {
            return;
        }
        boolean z = com.vungle.ads.internal.util.u.a;
        com.vungle.ads.internal.util.t.a("AdActivity", "Tried to play another placement " + str2 + " while playing " + str);
        VungleError logError$vungle_ads_release = new ConcurrentPlaybackUnsupported("Trying to show " + str2 + " but " + str + " is already showing").setLogEntry$vungle_ads_release(this.e).logError$vungle_ads_release();
        com.vungle.ads.internal.presenter.a aVar = i;
        if (aVar != null) {
            aVar.a(logError$vungle_ads_release, str2);
        }
        StringBuilder a = com.iab.omid.library.vungle.internal.l.a("onConcurrentPlaybackError: ");
        a.append(logError$vungle_ads_release.getLocalizedMessage());
        com.vungle.ads.internal.util.t.b("AdActivity", a.toString());
    }

    @Override // android.app.Activity
    public final void onPause() {
        super.onPause();
        com.vungle.ads.internal.presenter.r rVar = this.a;
        if (rVar != null) {
            boolean z = com.vungle.ads.internal.util.u.a;
            com.vungle.ads.internal.util.t.a("MRAIDPresenter", "stop()");
            rVar.a.b();
            rVar.d.b(false);
        }
    }

    @Override // android.app.Activity
    public final void onResume() {
        super.onResume();
        com.vungle.ads.internal.presenter.r rVar = this.a;
        if (rVar != null) {
            boolean z = com.vungle.ads.internal.util.u.a;
            com.vungle.ads.internal.util.t.a("MRAIDPresenter", "start()");
            rVar.a.d();
            rVar.d.b(true);
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        if (z) {
            WindowInsetsControllerCompat insetsController = WindowCompat.getInsetsController(getWindow(), getWindow().getDecorView());
            Intrinsics.checkNotNullExpressionValue(insetsController, "getInsetsController(window, window.decorView)");
            insetsController.setSystemBarsBehavior(2);
            insetsController.hide(WindowInsetsCompat.Type.systemBars());
        }
    }

    @Override // android.app.Activity
    public final void setRequestedOrientation(int i2) {
        super.setRequestedOrientation(i2);
    }

    public static final com.vungle.ads.internal.signals.j a(Lazy lazy) {
        return (com.vungle.ads.internal.signals.j) lazy.getValue();
    }

    public static final WindowInsetsCompat a(l this$0, View v, WindowInsetsCompat insets) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(v, "v");
        Intrinsics.checkNotNullParameter(insets, "insets");
        if (!this$0.g.get()) {
            Insets insets2 = insets.getInsets(WindowInsetsCompat.Type.systemBars() | WindowInsetsCompat.Type.displayCutout());
            Intrinsics.checkNotNullExpressionValue(insets2, "insets.getInsets(\n      …t()\n                    )");
            v.setPadding(insets2.left, insets2.top, insets2.right, insets2.bottom);
        }
        return insets;
    }

    public final void a() {
        OnBackInvokedDispatcher onBackInvokedDispatcher;
        OnBackInvokedCallback onBackInvokedCallback = new OnBackInvokedCallback() { // from class: com.vungle.ads.internal.ui.l$$ExternalSyntheticLambda1
            public final void onBackInvoked() {
                l.b(l.this);
            }
        };
        this.c = onBackInvokedCallback;
        onBackInvokedDispatcher = getOnBackInvokedDispatcher();
        onBackInvokedDispatcher.registerOnBackInvokedCallback(0, onBackInvokedCallback);
    }
}
