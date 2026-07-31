package com.vungle.ads.internal.ui.view;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.webkit.WebView;
import android.widget.RelativeLayout;
import androidx.annotation.VisibleForTesting;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import com.safedk.android.internal.partials.LiftoffMonetizeNetworkBridge;
import com.vungle.ads.internal.model.f0;
import com.vungle.ads.internal.ui.z;
import com.vungle.ads.internal.util.a0;
import com.vungle.ads.internal.util.t;
import com.vungle.ads.internal.util.u;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes4.dex */
public final class k extends RelativeLayout {
    public final String a;
    public WebView b;
    public final Lazy c;
    public h d;
    public f e;
    public i f;

    public /* synthetic */ k(Context context) {
        this(context, null);
    }

    @VisibleForTesting
    public static /* synthetic */ void getCloseDelegate$vungle_ads_release$annotations() {
    }

    @VisibleForTesting
    public static /* synthetic */ void getOnViewTouchListener$vungle_ads_release$annotations() {
    }

    @VisibleForTesting
    public static /* synthetic */ void getOrientationDelegate$vungle_ads_release$annotations() {
    }

    private final com.vungle.ads.internal.platform.f getPlatform() {
        return (com.vungle.ads.internal.platform.f) this.c.getValue();
    }

    public final void c() {
        WebView webView = this.b;
        if (webView != null) {
            webView.setLayerType(((com.vungle.ads.internal.platform.c) getPlatform()).m() ? 0 : 2, null);
            webView.setBackgroundColor(0);
            webView.setVisibility(8);
        }
    }

    public final void d() {
        WebView webView = this.b;
        if (webView != null) {
            webView.setVisibility(0);
        }
        WebView webView2 = this.b;
        if (webView2 != null) {
            webView2.onResume();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent me) {
        DetectTouchUtils.viewOnTouch(com.safedk.android.utils.h.d, this, me);
        return super.dispatchTouchEvent(me);
    }

    @Nullable
    public final f getCloseDelegate$vungle_ads_release() {
        return this.e;
    }

    @Nullable
    public final String getEventId() {
        return this.a;
    }

    @Nullable
    public final h getOnViewTouchListener$vungle_ads_release() {
        return this.d;
    }

    @Nullable
    public final i getOrientationDelegate$vungle_ads_release() {
        return this.f;
    }

    @Nullable
    public final String getUrl() {
        WebView webView = this.b;
        if (webView != null) {
            return webView.getUrl();
        }
        return null;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        ViewGroup.LayoutParams layoutParams;
        super.onAttachedToWindow();
        ViewGroup.LayoutParams layoutParams2 = getLayoutParams();
        if (layoutParams2 != null) {
            layoutParams2.height = -1;
            layoutParams2.width = -1;
        }
        WebView webView = this.b;
        if (webView == null || (layoutParams = webView.getLayoutParams()) == null) {
            return;
        }
        layoutParams.height = -1;
        layoutParams.width = -1;
    }

    @Override // android.widget.RelativeLayout, android.view.View
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        if (1 == 0) {
            setMeasuredDimension(0, 0);
        } else {
            super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        }
    }

    public final void setCloseDelegate(@NotNull f closeDelegate) {
        Intrinsics.checkNotNullParameter(closeDelegate, "closeDelegate");
        this.e = closeDelegate;
    }

    public final void setCloseDelegate$vungle_ads_release(@Nullable f fVar) {
        this.e = fVar;
    }

    public final void setOnViewTouchListener(@Nullable h hVar) {
        this.d = hVar;
    }

    public final void setOnViewTouchListener$vungle_ads_release(@Nullable h hVar) {
        this.d = hVar;
    }

    public final void setOrientation(int i) {
        i iVar = this.f;
        if (iVar != null) {
            ((com.vungle.ads.internal.ui.j) iVar).a.setRequestedOrientation(i);
        }
    }

    public final void setOrientationDelegate(@Nullable i iVar) {
        this.f = iVar;
    }

    public final void setOrientationDelegate$vungle_ads_release(@Nullable i iVar) {
        this.f = iVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(Context context, String str) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        this.a = str;
        this.c = LazyKt.lazy(LazyThreadSafetyMode.SYNCHRONIZED, new j(context));
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
        setLayoutParams(layoutParams);
        WebView a = a0.a(context, str);
        this.b = a;
        if (a != null) {
            a.setLayoutParams(layoutParams);
        }
        WebView webView = this.b;
        if (webView != null) {
            webView.setTag("VungleWebView");
        }
        addView(this.b, layoutParams);
        a();
        c();
    }

    public final void a() {
        WebView webView = this.b;
        if (webView != null) {
            webView.setOnTouchListener(new View.OnTouchListener() { // from class: com.vungle.ads.internal.ui.view.k$$ExternalSyntheticLambda0
                @Override // android.view.View.OnTouchListener
                public final boolean onTouch(View view, MotionEvent motionEvent) {
                    return k.a(k.this, view, motionEvent);
                }
            });
        }
    }

    public final void b() {
        WebView webView = this.b;
        if (webView != null) {
            webView.onPause();
        }
    }

    public static final boolean a(k this$0, View view, MotionEvent motionEvent) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        h hVar = this$0.d;
        if (hVar != null) {
            return hVar.onTouch(motionEvent);
        }
        return false;
    }

    public final void a(z vngWebViewClient, f0 f0Var) {
        Intrinsics.checkNotNullParameter(vngWebViewClient, "vngWebViewClient");
        WebView webView = this.b;
        if (webView != null) {
            com.vungle.ads.internal.platform.g.a(webView, f0Var);
            webView.setWebViewClient(vngWebViewClient);
        }
    }

    public final void a(String url) {
        Intrinsics.checkNotNullParameter(url, "url");
        boolean z = u.a;
        t.a("MRAIDAdWidget", "loadUrl: " + url);
        WebView webView = this.b;
        if (webView != null) {
            LiftoffMonetizeNetworkBridge.webviewLoadUrl(webView, url);
        }
    }

    public final void a(long j) {
        try {
            Result.Companion companion = Result.INSTANCE;
            ViewParent parent = getParent();
            Unit unit = null;
            ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
            if (viewGroup != null) {
                viewGroup.removeView(this);
                unit = Unit.INSTANCE;
            }
            Result.m8023constructorimpl(unit);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            Result.m8023constructorimpl(ResultKt.createFailure(th));
        }
        try {
            removeAllViews();
            Result.m8023constructorimpl(Unit.INSTANCE);
        } catch (Throwable th2) {
            Result.Companion companion3 = Result.INSTANCE;
            Result.m8023constructorimpl(ResultKt.createFailure(th2));
        }
        if (j <= 0) {
            new g(this).run();
        } else {
            new com.vungle.ads.internal.util.o().a(new g(this), j);
        }
    }
}
