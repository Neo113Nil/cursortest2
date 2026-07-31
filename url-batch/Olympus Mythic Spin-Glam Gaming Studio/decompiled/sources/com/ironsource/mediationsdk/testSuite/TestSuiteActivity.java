package com.ironsource.mediationsdk.testSuite;

import android.app.Activity;
import android.graphics.Insets;
import android.os.Build;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.view.WindowInsets;
import android.widget.RelativeLayout;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import com.ironsource.C4615dg;
import com.ironsource.C4782n4;
import com.ironsource.Pf;
import com.ironsource.S8;
import com.ironsource.Yf;
import com.ironsource.mediationsdk.logger.IronLog;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import com.safedk.android.internal.partials.IronSourceNetworkBridge;
import com.safedk.android.utils.h;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* loaded from: classes11.dex */
public final class TestSuiteActivity extends Activity implements S8 {
    private RelativeLayout a;
    private C4615dg b;
    private Yf c;

    @Nullable
    private OnBackInvokedCallback d;

    /* JADX INFO: Access modifiers changed from: private */
    public static final WindowInsets a(View view, WindowInsets insets) {
        int systemBars;
        Insets insets2;
        int i;
        int i2;
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(insets, "insets");
        systemBars = WindowInsets.Type.systemBars();
        insets2 = insets.getInsets(systemBars);
        Intrinsics.checkNotNullExpressionValue(insets2, "insets.getInsets(WindowInsets.Type.systemBars())");
        i = insets2.top;
        i2 = insets2.bottom;
        view.setPadding(0, i, 0, i2);
        return insets;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b() {
    }

    private final String c() {
        Bundle extras;
        if (getIntent() == null || getIntent().getExtras() == null || (extras = getIntent().getExtras()) == null) {
            return null;
        }
        return extras.getString("controllerUrl");
    }

    private final JSONObject d() {
        JSONObject jsonObjectInit;
        String b = new Pf().b(this);
        if (b != null) {
            try {
                if (b.length() != 0) {
                    jsonObjectInit = IronSourceNetworkBridge.jsonObjectInit(b);
                    return jsonObjectInit;
                }
            } catch (Exception unused) {
                return IronSourceNetworkBridge.jsonObjectInit();
            }
        }
        jsonObjectInit = IronSourceNetworkBridge.jsonObjectInit();
        return jsonObjectInit;
    }

    private final RelativeLayout.LayoutParams e() {
        return new RelativeLayout.LayoutParams(-1, -1);
    }

    private final void f() {
        OnBackInvokedCallback onBackInvokedCallback;
        OnBackInvokedDispatcher onBackInvokedDispatcher;
        if (Build.VERSION.SDK_INT < 33 || (onBackInvokedCallback = this.d) == null) {
            return;
        }
        try {
            onBackInvokedDispatcher = getOnBackInvokedDispatcher();
            onBackInvokedDispatcher.unregisterOnBackInvokedCallback(onBackInvokedCallback);
            this.d = null;
        } catch (Exception e) {
            C4782n4.d().a(e);
            IronLog.INTERNAL.error("Failed to unregister OnBackInvokedCallback: " + e);
        }
    }

    private final void g() {
        if (Build.VERSION.SDK_INT >= 35) {
            RelativeLayout relativeLayout = this.a;
            RelativeLayout relativeLayout2 = null;
            if (relativeLayout == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mContainer");
                relativeLayout = null;
            }
            relativeLayout.setOnApplyWindowInsetsListener(new View.OnApplyWindowInsetsListener() { // from class: com.ironsource.mediationsdk.testSuite.TestSuiteActivity$$ExternalSyntheticLambda0
                @Override // android.view.View.OnApplyWindowInsetsListener
                public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
                    WindowInsets a;
                    a = TestSuiteActivity.a(view, windowInsets);
                    return a;
                }
            });
            RelativeLayout relativeLayout3 = this.a;
            if (relativeLayout3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mContainer");
            } else {
                relativeLayout2 = relativeLayout3;
            }
            relativeLayout2.requestApplyInsets();
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean dispatchTouchEvent(MotionEvent me) {
        DetectTouchUtils.activityOnTouch(this, h.f, me);
        return super.dispatchTouchEvent(me);
    }

    @NotNull
    public final RelativeLayout getContainer() {
        RelativeLayout relativeLayout = this.a;
        if (relativeLayout != null) {
            return relativeLayout;
        }
        Intrinsics.throwUninitializedPropertyAccessException("mContainer");
        return null;
    }

    @Override // android.app.Activity
    public void onBackPressed() {
    }

    @Override // com.ironsource.S8
    public void onClosed() {
        runOnUiThread(new Runnable() { // from class: com.ironsource.mediationsdk.testSuite.TestSuiteActivity$$ExternalSyntheticLambda2
            @Override // java.lang.Runnable
            public final void run() {
                TestSuiteActivity.a(TestSuiteActivity.this);
            }
        });
    }

    @Override // android.app.Activity
    protected void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        RelativeLayout relativeLayout = new RelativeLayout(this);
        this.a = relativeLayout;
        setContentView(relativeLayout, e());
        g();
        C4615dg c4615dg = new C4615dg(this, this, d(), c());
        this.b = c4615dg;
        Yf yf = new Yf(c4615dg);
        this.c = yf;
        yf.d();
        RelativeLayout relativeLayout2 = this.a;
        C4615dg c4615dg2 = null;
        if (relativeLayout2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mContainer");
            relativeLayout2 = null;
        }
        C4615dg c4615dg3 = this.b;
        if (c4615dg3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mWebViewWrapper");
        } else {
            c4615dg2 = c4615dg3;
        }
        relativeLayout2.addView(c4615dg2.d(), e());
        a();
    }

    @Override // android.app.Activity
    protected void onDestroy() {
        f();
        Yf yf = this.c;
        C4615dg c4615dg = null;
        if (yf == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mNativeBridge");
            yf = null;
        }
        yf.a();
        RelativeLayout relativeLayout = this.a;
        if (relativeLayout == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mContainer");
            relativeLayout = null;
        }
        relativeLayout.removeAllViews();
        C4615dg c4615dg2 = this.b;
        if (c4615dg2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mWebViewWrapper");
        } else {
            c4615dg = c4615dg2;
        }
        c4615dg.a();
        super.onDestroy();
    }

    @Override // com.ironsource.S8
    public void onUIReady() {
        runOnUiThread(new Runnable() { // from class: com.ironsource.mediationsdk.testSuite.TestSuiteActivity$$ExternalSyntheticLambda3
            @Override // java.lang.Runnable
            public final void run() {
                TestSuiteActivity.b(TestSuiteActivity.this);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(TestSuiteActivity this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        C4615dg c4615dg = this$0.b;
        C4615dg c4615dg2 = null;
        if (c4615dg == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mWebViewWrapper");
            c4615dg = null;
        }
        if (c4615dg.c().getParent() == null) {
            RelativeLayout relativeLayout = this$0.a;
            if (relativeLayout == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mContainer");
                relativeLayout = null;
            }
            C4615dg c4615dg3 = this$0.b;
            if (c4615dg3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mWebViewWrapper");
                c4615dg3 = null;
            }
            relativeLayout.removeView(c4615dg3.d());
            RelativeLayout relativeLayout2 = this$0.a;
            if (relativeLayout2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mContainer");
                relativeLayout2 = null;
            }
            C4615dg c4615dg4 = this$0.b;
            if (c4615dg4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mWebViewWrapper");
                c4615dg4 = null;
            }
            relativeLayout2.addView(c4615dg4.c(), this$0.e());
            C4615dg c4615dg5 = this$0.b;
            if (c4615dg5 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mWebViewWrapper");
            } else {
                c4615dg2 = c4615dg5;
            }
            c4615dg2.b();
        }
    }

    private final void a() {
        OnBackInvokedDispatcher onBackInvokedDispatcher;
        if (Build.VERSION.SDK_INT >= 33) {
            OnBackInvokedCallback onBackInvokedCallback = new OnBackInvokedCallback() { // from class: com.ironsource.mediationsdk.testSuite.TestSuiteActivity$$ExternalSyntheticLambda1
                public final void onBackInvoked() {
                    TestSuiteActivity.b();
                }
            };
            this.d = onBackInvokedCallback;
            onBackInvokedDispatcher = getOnBackInvokedDispatcher();
            onBackInvokedDispatcher.registerOnBackInvokedCallback(0, onBackInvokedCallback);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(TestSuiteActivity this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.finish();
    }
}
