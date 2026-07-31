package com.fyber.inneractive.sdk.web.remoteui;

import android.view.MotionEvent;
import com.fyber.inneractive.sdk.util.IAlog;
import com.fyber.inneractive.sdk.web.m;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import com.safedk.android.utils.h;
import java.util.HashMap;

/* loaded from: classes4.dex */
public final class b extends m implements a, com.fyber.inneractive.sdk.player.ui.remote.a {
    public a h;
    public com.fyber.inneractive.sdk.player.ui.remote.a i;
    public boolean j = false;
    public final c k;

    public b() {
        c cVar = new c(this, this);
        this.k = cVar;
        setWebViewClient(cVar);
        getSettings().setJavaScriptEnabled(true);
        setHorizontalScrollBarEnabled(false);
        setHorizontalScrollbarOverlay(false);
        setVerticalScrollBarEnabled(false);
        setVerticalScrollbarOverlay(false);
        getSettings().setSupportZoom(false);
        setBackgroundColor(0);
    }

    @Override // com.fyber.inneractive.sdk.web.remoteui.a
    public final void a(com.fyber.inneractive.sdk.network.events.b bVar, String str, boolean z, HashMap hashMap) {
        this.j = false;
        a aVar = this.h;
        if (aVar != null) {
            aVar.a(bVar, str, z, hashMap);
        }
    }

    @Override // com.fyber.inneractive.sdk.web.m, android.webkit.WebView
    public final void destroy() {
        this.h = null;
        this.i = null;
        c cVar = this.k;
        cVar.getClass();
        IAlog.a("%s: destroy()", "RemoteUiWebViewClient");
        cVar.b = null;
        cVar.a = null;
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

    public void setCommandHandler(com.fyber.inneractive.sdk.player.ui.remote.a aVar) {
        this.i = aVar;
    }

    public void setResultFailureListener(a aVar) {
        this.h = aVar;
    }

    public void setUiReady(boolean z) {
        this.j = z;
    }

    @Override // com.fyber.inneractive.sdk.player.ui.remote.a
    public final void a(String str, HashMap hashMap) {
        com.fyber.inneractive.sdk.player.ui.remote.a aVar = this.i;
        if (aVar != null) {
            aVar.a(str, hashMap);
        }
    }
}
