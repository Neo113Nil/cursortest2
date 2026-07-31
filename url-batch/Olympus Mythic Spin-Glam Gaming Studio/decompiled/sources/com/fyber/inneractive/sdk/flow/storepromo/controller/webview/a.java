package com.fyber.inneractive.sdk.flow.storepromo.controller.webview;

import android.view.MotionEvent;
import com.fyber.inneractive.sdk.web.m;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import com.safedk.android.utils.h;

/* loaded from: classes3.dex */
public final class a extends m {
    public final b h;

    public a(b bVar) {
        this.h = bVar;
        setWebViewClient(bVar);
        getSettings().setJavaScriptEnabled(true);
        setHorizontalScrollBarEnabled(false);
        setHorizontalScrollbarOverlay(false);
        setVerticalScrollBarEnabled(false);
        setVerticalScrollbarOverlay(false);
        getSettings().setSupportZoom(false);
        setOverScrollMode(2);
    }

    @Override // com.fyber.inneractive.sdk.web.m, android.webkit.WebView
    public final void destroy() {
        b bVar = this.h;
        bVar.a = null;
        bVar.b = null;
        super.destroy();
    }

    @Override // com.fyber.inneractive.sdk.web.m, android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent me) {
        DetectTouchUtils.viewOnTouch(h.p, this, me);
        return super.dispatchTouchEvent(me);
    }

    @Override // com.fyber.inneractive.sdk.web.m, android.webkit.WebView, android.widget.AbsoluteLayout, android.view.View
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        if (1 == 0) {
            setMeasuredDimension(0, 0);
        } else {
            super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        }
    }
}
