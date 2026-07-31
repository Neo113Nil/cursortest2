package com.mbridge.msdk.config.dynamic.baseview.webview;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import com.mbridge.msdk.config.dynamic.baseview.cusview.XMLView;
import com.mbridge.msdk.config.dynamic.baseview.inter.a;
import com.mbridge.msdk.config.dynamic.baseview.webview.client.b;
import com.mbridge.msdk.config.dynamic.utils.d;
import com.mbridge.msdk.config.dynamic.utils.f;
import com.mbridge.msdk.foundation.tools.q0;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import com.safedk.android.internal.partials.MintegralNetworkBridge;
import com.safedk.android.utils.h;
import java.util.Map;

/* loaded from: classes4.dex */
public class ComponentWebView extends WebView implements a {
    private final String a;
    private b b;
    private com.mbridge.msdk.config.dynamic.baseview.webview.client.a c;
    private boolean d;
    private XMLView e;
    private float f;
    private float g;
    private long h;
    private String i;

    public ComponentWebView(@NonNull Context context) {
        super(context);
        this.a = "ComponentWebView";
        this.h = -1L;
        a();
    }

    private void a() {
        b();
        b bVar = new b();
        this.b = bVar;
        setWebViewClient(bVar);
        com.mbridge.msdk.config.dynamic.baseview.webview.client.a aVar = new com.mbridge.msdk.config.dynamic.baseview.webview.client.a();
        this.c = aVar;
        MintegralNetworkBridge.webviewSetWebChromeClient(this, aVar);
    }

    @SuppressLint({"SetJavaScriptEnabled"})
    private void b() {
        setHorizontalScrollBarEnabled(false);
        setVerticalScrollBarEnabled(false);
        WebSettings settings = getSettings();
        settings.setUserAgentString(settings.getUserAgentString() + " WindVane/3.0.2");
        settings.setJavaScriptEnabled(true);
        settings.setCacheMode(-1);
        settings.setAllowFileAccess(true);
        settings.setJavaScriptCanOpenWindowsAutomatically(true);
        settings.setDomStorageEnabled(true);
        settings.setSupportZoom(false);
        settings.setBuiltInZoomControls(true);
        settings.setDisplayZoomControls(false);
        settings.setSavePassword(false);
        settings.setDatabaseEnabled(true);
        settings.setUseWideViewPort(true);
        settings.setLoadWithOverviewMode(true);
        settings.setRenderPriority(WebSettings.RenderPriority.HIGH);
        if (Build.VERSION.SDK_INT >= 26) {
            settings.setSafeBrowsingEnabled(false);
        }
        settings.setMediaPlaybackRequiresUserGesture(false);
        settings.setAllowFileAccessFromFileURLs(false);
        settings.setAllowUniversalAccessFromFileURLs(false);
        settings.setMixedContentMode(0);
        settings.setDatabaseEnabled(true);
        String path = getContext().getDir("database", 0).getPath();
        settings.setDatabasePath(path);
        settings.setGeolocationEnabled(true);
        settings.setGeolocationDatabasePath(path);
    }

    @Override // android.webkit.WebView
    public void destroy() {
        if (this.d) {
            return;
        }
        try {
            this.d = true;
            setVisibility(8);
            removeAllViews();
            setDownloadListener(null);
            destroy();
        } catch (Throwable th) {
            q0.b("ComponentWebView", th.getMessage());
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent me) {
        DetectTouchUtils.viewOnTouch(h.o, this, me);
        return super.dispatchTouchEvent(me);
    }

    public long getClickTimeStamp() {
        return this.h;
    }

    public float getxInScreen() {
        return this.f;
    }

    public float getyInScreen() {
        return this.g;
    }

    public boolean hasXmlUrl() {
        return !TextUtils.isEmpty(this.i);
    }

    public boolean isDestroyed() {
        return this.d;
    }

    public void loadXMLUrl() {
        if (TextUtils.isEmpty(this.i)) {
            return;
        }
        MintegralNetworkBridge.webviewLoadUrl(this, this.i);
    }

    @Override // android.webkit.WebView, android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.e = d.a((View) this);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        destroy();
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
    public boolean onTouchEvent(MotionEvent motionEvent) {
        try {
            if (motionEvent.getAction() == 0) {
                this.f = motionEvent.getRawX();
                this.g = motionEvent.getRawY();
                this.h = System.currentTimeMillis();
            }
        } catch (Exception e) {
            q0.b("ComponentWebView", "处理触摸事件异常: " + e.getMessage());
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setViewClickListener() {
        setOnClickListener(new View.OnClickListener() { // from class: com.mbridge.msdk.config.dynamic.baseview.webview.ComponentWebView$$ExternalSyntheticLambda1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ComponentWebView.this.a(view);
            }
        });
    }

    public void setWebViewEventListener(com.mbridge.msdk.config.dynamic.baseview.webview.listener.a aVar) {
        b bVar = this.b;
        if (bVar != null) {
            bVar.a(aVar);
        }
        com.mbridge.msdk.config.dynamic.baseview.webview.client.a aVar2 = this.c;
        if (aVar2 != null) {
            aVar2.a(aVar);
        }
    }

    @Override // com.mbridge.msdk.config.dynamic.baseview.inter.a
    public void setXmlData(Map<String, Object> map) {
        if (map == null) {
            return;
        }
        try {
            String valueOf = String.valueOf(map.get("clickable"));
            if (!TextUtils.isEmpty(valueOf) && valueOf.equals("true")) {
                setViewClickListener();
            }
            Object obj = map.get("data");
            if (obj instanceof String) {
                setXmlUrl(String.valueOf(obj));
            }
        } catch (Exception e) {
            q0.b("ComponentWebView", "setXmlData异常: " + e.getMessage());
        }
    }

    public void setXmlUrl(String str) {
        this.i = str;
    }

    @Override // com.mbridge.msdk.config.dynamic.baseview.inter.a
    public void updateBindData(String str, Object obj) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(View view) {
        XMLView xMLView = this.e;
        if (xMLView != null) {
            xMLView.updateTouchView(view);
        }
        f.a(this.e, view.getTag(), null);
    }

    public ComponentWebView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context);
        this.a = "ComponentWebView";
        this.h = -1L;
        a();
    }

    public ComponentWebView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.a = "ComponentWebView";
        this.h = -1L;
        a();
    }

    @RequiresApi
    public ComponentWebView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.a = "ComponentWebView";
        this.h = -1L;
        a();
    }
}
