package yads;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.ViewGroup;
import android.webkit.WebSettings;
import android.webkit.WebView;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import com.safedk.android.analytics.brandsafety.creatives.AdNetworkDiscovery;
import com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager;
import com.safedk.android.utils.Logger;
import java.util.Iterator;
import java.util.LinkedHashMap;

/* loaded from: classes3.dex */
public abstract class oo extends WebView {
    public final LinkedHashMap a;

    public oo(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.a = new LinkedHashMap();
        WebSettings settings = getSettings();
        settings.setAllowFileAccess(false);
        if (pa.a(11)) {
            settings.setAllowContentAccess(false);
            if (pa.a(16)) {
                settings.setAllowFileAccessFromFileURLs(false);
                settings.setAllowUniversalAccessFromFileURLs(false);
            }
        }
    }

    private void safedk_webview_oo_webviewAddJavascriptInterface_47e6e9afc78d975e01d6f821eca67d83(Object p1, String p2) {
        Logger.d("YandexNetwork|SafeDK: Partial-Network> Lyads/oo;->safedk_webview_oo_webviewAddJavascriptInterface_47e6e9afc78d975e01d6f821eca67d83(Ljava/lang/Object;Ljava/lang/String;)V");
        try {
            Logger.d("SafeDKNetwork", "onAddedJavascriptInterface invoked, WebView address: ", this, ", SDK_PACKAGE_NAME: ", com.safedk.android.utils.h.y, " object is: ", p1, " and name: ", p2);
            AdNetworkDiscovery j = CreativeInfoManager.j(com.safedk.android.utils.h.y);
            if (j != null) {
                j.a((WebView) this, p1);
            } else {
                Logger.d("SafeDKNetwork", "onAddedJavascriptInterface invoked, discovery not found for sdk: ", com.safedk.android.utils.h.y, ", add to pending list");
                com.safedk.android.analytics.brandsafety.creatives.discoveries.d.b((WebView) this, p1);
            }
        } catch (Throwable th) {
            Logger.e("SafeDKNetwork", "webviewAddJavascriptInterface exception", th);
        }
        super.addJavascriptInterface(p1, p2);
    }

    public final String a(String str) {
        return str + b() + "<body style='margin:0; padding:0;'>";
    }

    @Override // android.webkit.WebView
    public final void addJavascriptInterface(Object obj, String str) {
        safedk_webview_oo_webviewAddJavascriptInterface_47e6e9afc78d975e01d6f821eca67d83(obj, str);
        this.a.put(str, obj);
    }

    public String b() {
        return "";
    }

    public void c() {
        hl3.a((ViewGroup) this);
        Iterator it = this.a.keySet().iterator();
        while (it.hasNext()) {
            removeJavascriptInterface((String) it.next());
        }
        this.a.clear();
        destroy();
        getClass().toString();
        boolean z = ob1.a;
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent me) {
        DetectTouchUtils.viewOnTouch(com.safedk.android.utils.h.y, this, me);
        return super.dispatchTouchEvent(me);
    }

    @Override // android.webkit.WebView, android.widget.AbsoluteLayout, android.view.View
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        if (1 == 0) {
            setMeasuredDimension(0, 0);
        } else {
            super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        }
    }

    @Override // android.webkit.WebView
    public final void removeJavascriptInterface(String str) {
        if (pa.a(11)) {
            super.removeJavascriptInterface(str);
        }
    }

    public final void setDisplayZoomControls(boolean z) {
        if (pa.a(11)) {
            getSettings().setDisplayZoomControls(z);
        }
    }
}
