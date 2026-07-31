package com.ogury.ad.internal;

import android.app.Activity;
import android.content.Context;
import android.content.MutableContextWrapper;
import android.view.MotionEvent;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.ogury.core.internal.LogTag;
import com.ogury.core.internal.Logger;
import com.ogury.core.internal.SourceTag;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes6.dex */
public final class y7 extends WebView {
    public final b a;
    public final MutableContextWrapper b;
    public boolean c;
    public ki d;
    public String e;
    public boolean f;
    public w6 g;
    public boolean h;
    public x7 i;
    public a8 j;
    public boolean k;
    public boolean l;
    public z7 m;
    public v6 n;
    public sh o;
    public t7 p;
    public final Regex q;
    public final Regex r;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public y7(Context context, b ad) {
        super(mutableContext);
        MutableContextWrapper mutableContext = new MutableContextWrapper(context);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(ad, "ad");
        Intrinsics.checkNotNullParameter(mutableContext, "mutableContext");
        this.a = ad;
        this.b = mutableContext;
        boolean z = true;
        this.c = true;
        this.e = "loading";
        this.g = new w6(this);
        this.i = new u0(context, this);
        this.j = new a8(this);
        this.n = v6.a;
        this.o = sh.a;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(ad, "ad");
        q0 q0Var = new q0(context);
        ch chVar = new ch(q0Var);
        Intrinsics.checkNotNullParameter(ad, "<this>");
        if (!Intrinsics.areEqual(ad.d, "portrait") && !Intrinsics.areEqual(ad.d, "landscape")) {
            z = false;
        }
        y9 y9Var = new y9(q0Var, z);
        this.p = new t7(chVar, new u4(q0Var, y9Var, ad), new z1(), y9Var);
        this.q = new Regex("bunaZiua");
        this.r = new Regex("ogyOnAdLoaded");
        setAdUnit(ad.n);
        setWebViewClient(this.j);
    }

    private final void setAdUnit(y yVar) {
        this.j.a = yVar;
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent me) {
        DetectTouchUtils.viewOnTouch("io.presage", this, me);
        return super.dispatchTouchEvent(me);
    }

    @NotNull
    public final String getAdState() {
        return this.e;
    }

    @Nullable
    public final z7 getClientAdapter() {
        return this.m;
    }

    public final boolean getContainsMraid() {
        return this.h;
    }

    @NotNull
    public final w6 getMraidCommandExecutor() {
        w6 w6Var = this.g;
        return w6Var == null ? new w6(this) : w6Var;
    }

    @NotNull
    public final x7 getMraidUrlHandler() {
        return this.i;
    }

    @NotNull
    public final a8 getMraidWebViewClient() {
        return this.j;
    }

    public final boolean getShowSdkCloseButton() {
        return this.c;
    }

    @Nullable
    public final ki getVisibilityChangedListener() {
        return this.d;
    }

    @Override // android.webkit.WebView, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.o.getClass();
        Activity activity = (Activity) sh.b.get();
        if (activity == null) {
            return;
        }
        this.b.setBaseContext(activity);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        MutableContextWrapper mutableContextWrapper = this.b;
        mutableContextWrapper.setBaseContext(mutableContextWrapper.getBaseContext().getApplicationContext());
    }

    @Override // android.webkit.WebView, android.widget.AbsoluteLayout, android.view.View
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        if (1 == 0) {
            setMeasuredDimension(0, 0);
        } else {
            super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        }
    }

    @Override // android.webkit.WebView, android.view.View
    public final void onVisibilityChanged(View changedView, int i) {
        Intrinsics.checkNotNullParameter(changedView, "changedView");
        ki kiVar = this.d;
        if (kiVar != null) {
            ((s6) kiVar).a.j.a();
        }
        super.onVisibilityChanged(changedView, i);
    }

    public final void setAdState(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.e = str;
    }

    public final void setClientAdapter(@Nullable z7 z7Var) {
        this.m = z7Var;
        this.j.e = z7Var;
    }

    public final void setContainsMraid(boolean z) {
        this.h = z;
    }

    public final void setDestroyed(boolean z) {
        this.f = z;
    }

    public final void setMraidCommandExecutor(@NotNull w6 mraidCommandExecutor) {
        Intrinsics.checkNotNullParameter(mraidCommandExecutor, "mraidCommandExecutor");
        this.g = mraidCommandExecutor;
    }

    public final void setMraidUrlHandler(@NotNull x7 x7Var) {
        Intrinsics.checkNotNullParameter(x7Var, "<set-?>");
        this.i = x7Var;
    }

    public final void setMultiBrowserOpened(boolean z) {
        this.l = z;
    }

    public final void setOnVisibilityChangedListener(@NotNull ki visibilityListener) {
        Intrinsics.checkNotNullParameter(visibilityListener, "visibilityListener");
        this.d = visibilityListener;
    }

    public final void setResumed(boolean z) {
        this.k = z;
    }

    public final void setShowSdkCloseButton(boolean z) {
        this.c = z;
    }

    public final void setTestCacheStore(@NotNull v6 mraidCacheStore) {
        Intrinsics.checkNotNullParameter(mraidCacheStore, "mraidCacheStore");
        this.n = mraidCacheStore;
    }

    public final void setTestMraidLifecycle(@NotNull t7 mraidLifecycle) {
        Intrinsics.checkNotNullParameter(mraidLifecycle, "mraidLifecycle");
        this.p = mraidLifecycle;
    }

    public final void setTestMraidViewClientWrapper(@NotNull a8 mraidWebViewClientWrapper) {
        Intrinsics.checkNotNullParameter(mraidWebViewClientWrapper, "mraidWebViewClientWrapper");
        this.j = mraidWebViewClientWrapper;
    }

    public final void setTestTopActivityMonitor(@NotNull sh topActivityMonitor) {
        Intrinsics.checkNotNullParameter(topActivityMonitor, "topActivityMonitor");
        this.o = topActivityMonitor;
    }

    public final void setVisibilityChangedListener(@Nullable ki kiVar) {
        this.d = kiVar;
    }

    @Override // android.webkit.WebView
    public void setWebViewClient(@NotNull WebViewClient client) {
        Intrinsics.checkNotNullParameter(client, "client");
        if (!Intrinsics.areEqual(this.j, client)) {
            Logger.INSTANCE.e(LogTag.INTERNAL, SourceTag.ADS, new IllegalAccessError("Cannot change the webview client for MraidWebView"));
        }
        super.setWebViewClient(client);
    }

    @Override // android.view.View
    public final String toString() {
        return "[Sending] " + Integer.toHexString(System.identityHashCode(this));
    }
}
