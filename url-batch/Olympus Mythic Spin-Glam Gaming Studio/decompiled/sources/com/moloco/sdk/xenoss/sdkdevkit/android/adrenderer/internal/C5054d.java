package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal;

import android.content.Context;
import android.view.MotionEvent;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.webkit.WebView;
import androidx.compose.runtime.internal.StabilityInferred;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@StabilityInferred
/* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.d, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public class C5054d extends WebView {
    public static final int b = 0;

    @NotNull
    public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.webview.g a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5054d(@NotNull Context context) {
        super(context.getApplicationContext());
        Intrinsics.checkNotNullParameter(context, "context");
        this.a = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.webview.g();
    }

    @Override // android.webkit.WebView
    public void destroy() {
        ViewParent parent = getParent();
        ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
        if (viewGroup != null) {
            viewGroup.removeView(this);
        }
        removeAllViews();
        super.destroy();
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent me) {
        DetectTouchUtils.viewOnTouch(com.safedk.android.utils.h.D, this, me);
        return super.dispatchTouchEvent(me);
    }

    @NotNull
    public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.webview.g getHtmlCssFixer() {
        return this.a;
    }

    @Override // android.webkit.WebView, android.widget.AbsoluteLayout, android.view.View
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        if (1 == 0) {
            setMeasuredDimension(0, 0);
        } else {
            super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        }
    }
}
