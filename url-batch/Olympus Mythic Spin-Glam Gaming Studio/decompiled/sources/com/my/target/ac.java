package com.my.target;

import android.graphics.Bitmap;
import android.graphics.Rect;
import android.net.Uri;
import android.text.TextUtils;
import android.webkit.ConsoleMessage;
import android.webkit.JsResult;
import android.webkit.WebChromeClient;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.ironsource.X3;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.my.target.fc;
import com.pubmatic.sdk.common.POBCommonConstants;
import com.safedk.android.analytics.brandsafety.BrandSafetyUtils;
import com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager;
import com.safedk.android.utils.Logger;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.net.URI;
import java.util.ArrayList;
import org.json.JSONObject;

/* compiled from: r8-map-id-376f9cbbf0a7df308b3ad5c16a6608bc59316f0ad6051cf26b365c8cc4cd0036 */
/* loaded from: classes4.dex */
public class ac {
    private final String a;
    private final WebViewClient b = new b();
    private a c;
    private fc d;
    private boolean e;
    private boolean f;

    /* compiled from: r8-map-id-376f9cbbf0a7df308b3ad5c16a6608bc59316f0ad6051cf26b365c8cc4cd0036 */
    public interface a {
        void a();

        void a(Uri uri);

        void a(ac acVar, WebView webView);

        void a(boolean z);

        boolean a(float f, float f2);

        boolean a(int i, int i2, int i3, int i4, boolean z, int i5);

        boolean a(ConsoleMessage consoleMessage, ac acVar);

        boolean a(String str);

        boolean a(String str, JsResult jsResult);

        boolean a(boolean z, cc ccVar);

        void b();

        boolean b(Uri uri);

        void c();

        boolean d();
    }

    /* compiled from: r8-map-id-376f9cbbf0a7df308b3ad5c16a6608bc59316f0ad6051cf26b365c8cc4cd0036 */
    public static class c {
        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
        /* JADX WARN: Removed duplicated region for block: B:26:0x0055 A[RETURN] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public static int a(String str) {
            if (str != null) {
                switch (str.hashCode()) {
                    case -1364013995:
                        return str.equals("center") ? 17 : 53;
                    case -1314880604:
                        str.equals(X3.e.b);
                    case -1012429441:
                        if (str.equals(X3.e.c)) {
                            return 51;
                        }
                        break;
                    case -655373719:
                        if (str.equals(X3.e.e)) {
                            return 83;
                        }
                        break;
                    case 1163912186:
                        if (str.equals(X3.e.d)) {
                            return 85;
                        }
                        break;
                    case 1288627767:
                        if (str.equals("bottom-center")) {
                            return 81;
                        }
                        break;
                    case 1755462605:
                        if (str.equals("top-center")) {
                            return 49;
                        }
                        break;
                }
            } else {
                return 53;
            }
        }
    }

    /* compiled from: r8-map-id-376f9cbbf0a7df308b3ad5c16a6608bc59316f0ad6051cf26b365c8cc4cd0036 */
    private class d extends WebChromeClient {
        private d() {
        }

        @Override // android.webkit.WebChromeClient
        public boolean onConsoleMessage(ConsoleMessage consoleMessage) {
            mi.a("MraidBridge: JS console message - " + consoleMessage.message() + " - at line " + consoleMessage.lineNumber());
            ac acVar = ac.this;
            a aVar = acVar.c;
            return aVar != null ? aVar.a(consoleMessage, acVar) : super.onConsoleMessage(consoleMessage);
        }

        @Override // android.webkit.WebChromeClient
        public boolean onJsAlert(WebView webView, String str, String str2, JsResult jsResult) {
            a aVar = ac.this.c;
            return aVar != null ? aVar.a(str2, jsResult) : super.onJsAlert(webView, str, str2, jsResult);
        }
    }

    private ac(String str) {
        this.a = str;
    }

    public static ac b(String str) {
        return new ac(str);
    }

    public void a(ec ecVar) {
        a("mraidbridge.setScreenSize(" + b(ecVar.d()) + ");window.mraidbridge.setMaxSize(" + b(ecVar.c()) + ");window.mraidbridge.setCurrentPosition(" + a(ecVar.a()) + ");window.mraidbridge.setDefaultPosition(" + a(ecVar.b()) + ")");
        StringBuilder sb = new StringBuilder();
        sb.append("mraidbridge.fireSizeChangeEvent(");
        sb.append(b(ecVar.a()));
        sb.append(")");
        a(sb.toString());
    }

    public boolean c() {
        fc fcVar = this.d;
        return fcVar != null && fcVar.h();
    }

    public void d(String str) {
        a("mraidbridge.setPlacementType(" + JSONObject.quote(str) + ")");
    }

    public void e(String str) {
        a("mraidbridge.setState(" + JSONObject.quote(str) + ")");
    }

    public void f(String str) {
        fc fcVar = this.d;
        if (fcVar == null) {
            mi.a("MraidBridge: MRAID bridge called setContentHtml before WebView was attached");
        } else {
            this.e = false;
            fcVar.a("https://ad.mail.ru/", str, POBCommonConstants.CONTENT_TYPE_HTML, "UTF-8", null);
        }
    }

    /* compiled from: r8-map-id-376f9cbbf0a7df308b3ad5c16a6608bc59316f0ad6051cf26b365c8cc4cd0036 */
    private class b extends pc {
        private b() {
        }

        @Override // com.my.target.pc, android.webkit.WebViewClient
        public void onLoadResource(WebView view, String url) {
            super.onLoadResource(view, url);
            CreativeInfoManager.onResourceLoaded(com.safedk.android.utils.h.r, view, url);
        }

        @Override // android.webkit.WebViewClient
        public void onPageFinished(WebView webView, String str) {
            ac.this.b();
        }

        @Override // com.my.target.pc, android.webkit.WebViewClient
        public void onPageStarted(WebView view, String url, Bitmap favicon) {
            super.onPageStarted(view, url, favicon);
            BrandSafetyUtils.onWebViewPageStarted(com.safedk.android.utils.h.r, view, url);
        }

        @Override // com.my.target.pc, android.webkit.WebViewClient
        public void onReceivedError(WebView webView, int i, String str, String str2) {
            Logger.d("MyTarget|SafeDK: Execution> Lcom/my/target/ac$b;->onReceivedError(Landroid/webkit/WebView;ILjava/lang/String;Ljava/lang/String;)V");
            BrandSafetyUtils.onWebViewReceivedError(com.safedk.android.utils.h.r, webView, i, str, str2);
            safedk_ac$b_onReceivedError_da78cb9798ed308dee9a81197b89bec4(webView, i, str, str2);
        }

        public void safedk_ac$b_onReceivedError_da78cb9798ed308dee9a81197b89bec4(WebView p0, int p1, String p2, String p3) {
            mi.a("MraidBridge: Error - " + p2);
            super.onReceivedError(p0, p1, p2, p3);
        }

        public boolean safedk_ac$b_shouldOverrideUrlLoading_ecf67b77bcdc3792338f777f977eeeaa(WebView p0, String p1) {
            ac.this.a(Uri.parse(p1));
            return true;
        }

        @Override // com.my.target.pc, android.webkit.WebViewClient
        public WebResourceResponse shouldInterceptRequest(WebView view, WebResourceRequest webResourceRequest) {
            return CreativeInfoManager.onWebViewResponseWithHeaders(com.safedk.android.utils.h.r, view, webResourceRequest, super.shouldInterceptRequest(view, webResourceRequest));
        }

        @Override // android.webkit.WebViewClient
        public boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
            Logger.d("MyTarget|SafeDK: Execution> Lcom/my/target/ac$b;->shouldOverrideUrlLoading(Landroid/webkit/WebView;Landroid/webkit/WebResourceRequest;)Z");
            boolean safedk_ac$b_shouldOverrideUrlLoading_11557d455607d86b29bc7af12666cf7c = safedk_ac$b_shouldOverrideUrlLoading_11557d455607d86b29bc7af12666cf7c(webView, webResourceRequest);
            BrandSafetyUtils.onShouldOverrideUrlLoading(com.safedk.android.utils.h.r, webView, webResourceRequest, safedk_ac$b_shouldOverrideUrlLoading_11557d455607d86b29bc7af12666cf7c);
            return safedk_ac$b_shouldOverrideUrlLoading_11557d455607d86b29bc7af12666cf7c;
        }

        @Override // com.my.target.pc, android.webkit.WebViewClient
        public boolean shouldOverrideUrlLoading(WebView webView, String str) {
            Logger.d("MyTarget|SafeDK: Execution> Lcom/my/target/ac$b;->shouldOverrideUrlLoading(Landroid/webkit/WebView;Ljava/lang/String;)Z");
            boolean safedk_ac$b_shouldOverrideUrlLoading_ecf67b77bcdc3792338f777f977eeeaa = safedk_ac$b_shouldOverrideUrlLoading_ecf67b77bcdc3792338f777f977eeeaa(webView, str);
            BrandSafetyUtils.onShouldOverrideUrlLoading(com.safedk.android.utils.h.r, webView, str, safedk_ac$b_shouldOverrideUrlLoading_ecf67b77bcdc3792338f777f977eeeaa);
            return safedk_ac$b_shouldOverrideUrlLoading_ecf67b77bcdc3792338f777f977eeeaa;
        }

        public boolean safedk_ac$b_shouldOverrideUrlLoading_11557d455607d86b29bc7af12666cf7c(WebView p0, WebResourceRequest p1) {
            ac.this.a(p1.getUrl());
            return true;
        }
    }

    /* compiled from: r8-map-id-376f9cbbf0a7df308b3ad5c16a6608bc59316f0ad6051cf26b365c8cc4cd0036 */
    private class e implements fc.a {
        private e() {
        }

        @Override // com.my.target.fc.a
        public void a(boolean z) {
            a aVar = ac.this.c;
            if (aVar != null) {
                aVar.a(z);
            }
        }

        @Override // com.my.target.fc.a
        public void a() {
            a aVar = ac.this.c;
            if (aVar != null) {
                aVar.a();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b() {
        fc fcVar;
        if (this.e || (fcVar = this.d) == null) {
            return;
        }
        this.e = true;
        a aVar = this.c;
        if (aVar != null) {
            aVar.a(this, fcVar.getWebView());
        }
    }

    private void c(String str) {
        a("mraidbridge.nativeComplete(" + JSONObject.quote(str) + ")");
    }

    public void d() {
        a("mraidbridge.fireReadyEvent()");
    }

    private String b(Rect rect) {
        return rect.width() + StringUtils.COMMA + rect.height();
    }

    public void a(ArrayList arrayList) {
        a("mraidbridge.setSupports(" + TextUtils.join(StringUtils.COMMA, arrayList) + ")");
    }

    public void a(a aVar) {
        this.c = aVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void a(fc fcVar) {
        this.d = fcVar;
        WebSettings settings = fcVar.getSettings();
        if (settings != null) {
            settings.setJavaScriptEnabled(true);
            if ("interstitial".equals(this.a)) {
                settings.setMediaPlaybackRequiresUserGesture(false);
            }
        }
        this.d.setScrollContainer(false);
        this.d.setVerticalScrollBarEnabled(false);
        this.d.setHorizontalScrollBarEnabled(false);
        this.d.setWebViewClient(this.b);
        this.d.setWebChromeClient(new d());
        this.d.setVisibilityChangedListener(new e());
    }

    public void a() {
        this.d = null;
    }

    public void a(boolean z) {
        if (z != this.f) {
            a("mraidbridge.setIsViewable(" + z + ")");
        }
        this.f = z;
    }

    public void a(String str, String str2) {
        a("mraidbridge.fireErrorEvent(" + JSONObject.quote(str2) + ", " + JSONObject.quote(str) + ")");
    }

    void a(Uri uri) {
        a aVar;
        JSONObject jSONObject;
        String scheme = uri.getScheme();
        String host = uri.getHost();
        if ("mytarget".equals(scheme)) {
            if ("onloadmraidjs".equals(host)) {
                mi.a("MraidBridge: JS call onLoad");
            }
            mi.a("MraidBridge: Got mytarget scheme - " + uri);
            return;
        }
        if ("mraid".equals(scheme)) {
            if (host.contains(StringUtils.COMMA)) {
                host = host.substring(0, host.indexOf(StringUtils.COMMA)).trim();
            }
            mi.a("MraidBridge: Got mraid command - " + uri);
            String uri2 = uri.toString();
            bc bcVar = new bc(host, this.a);
            c(bcVar.toString());
            int indexOf = uri2.indexOf("{");
            int lastIndexOf = uri2.lastIndexOf("}") + 1;
            if (indexOf >= 0 && lastIndexOf > 0 && indexOf < lastIndexOf) {
                try {
                    if (lastIndexOf <= uri2.length()) {
                        jSONObject = new JSONObject(uri2.substring(indexOf, lastIndexOf));
                        a(bcVar, jSONObject);
                        return;
                    }
                } catch (Throwable th) {
                    a(bcVar.toString(), th.getMessage());
                    return;
                }
            }
            jSONObject = null;
            a(bcVar, jSONObject);
            return;
        }
        try {
            new URI(uri.toString());
            fc fcVar = this.d;
            if (fcVar == null || !fcVar.g() || (aVar = this.c) == null) {
                return;
            }
            aVar.a(uri);
        } catch (Throwable unused) {
            mi.a("MraidBridge: Invalid MRAID URL - " + uri);
            a("", "Mraid command sent an invalid URL");
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    boolean a(bc bcVar, JSONObject jSONObject) {
        fc fcVar;
        String bcVar2 = bcVar.toString();
        if (bcVar.a && (fcVar = this.d) != null && !fcVar.g()) {
            a(bcVar2, "Cannot execute this command unless the user clicks");
            return false;
        }
        if (this.c == null) {
            a(bcVar2, "Invalid state to execute this command");
            return false;
        }
        if (this.d == null) {
            a(bcVar2, "The current WebView is being destroyed");
            return false;
        }
        bcVar2.getClass();
        switch (bcVar2) {
            case "vpaidInit":
                this.c.c();
                return true;
            case "playVideo":
                mi.a("MraidBridge: playVideo is currently unsupported");
                return false;
            case "expand":
                return this.c.b(jSONObject != null ? Uri.parse(jSONObject.getString("url")) : null);
            case "resize":
                return this.c.d();
            case "createCalendarEvent":
                mi.a("MraidBridge: createCalendarEvent is currently unsupported");
                return false;
            case "":
                a(bcVar2, "Unspecified MRAID Javascript command");
                return false;
            case "open":
                if (jSONObject == null) {
                    a(bcVar2, "open params cannot be null");
                    return false;
                }
                this.c.a(Uri.parse(jSONObject.getString("url")));
                return true;
            case "close":
                this.c.b();
                return true;
            case "setOrientationProperties":
                if (jSONObject == null) {
                    a(bcVar2, "setOrientationProperties params cannot be null");
                    return false;
                }
                boolean z = jSONObject.getBoolean("allowOrientationChange");
                String string = jSONObject.getString("forceOrientation");
                cc a2 = cc.a(string);
                if (a2 == null) {
                    a(bcVar2, "wrong orientation " + string);
                    return false;
                }
                return this.c.a(z, a2);
            case "storePicture":
                mi.a("MraidBridge: storePicture is currently unsupported");
                return false;
            case "setResizeProperties":
                if (jSONObject == null) {
                    a(bcVar2, "setResizeProperties params cannot be null");
                    return false;
                }
                return this.c.a(jSONObject.getInt("width"), jSONObject.getInt("height"), jSONObject.getInt("offsetX"), jSONObject.getInt("offsetY"), jSONObject.optBoolean("allowOffscreen", false), c.a(jSONObject.optString("customClosePosition")));
            case "vpaidEvent":
                if (jSONObject == null) {
                    a(bcVar2, "vpaidEvent params cannot be null");
                    return false;
                }
                return this.c.a(jSONObject.getString("event"));
            case "playheadEvent":
                if (jSONObject == null) {
                    a(bcVar2, "playheadEvent params cannot be null");
                    return false;
                }
                return this.c.a((float) jSONObject.getDouble("remain"), (float) jSONObject.getDouble(IronSourceConstants.EVENTS_DURATION));
            default:
                return true;
        }
    }

    private void a(String str) {
        if (this.d == null) {
            mi.a("MraidBridge: Attempted to inject Javascript into MRAID WebView while was not attached - \n\t" + str);
            return;
        }
        String str2 = "javascript:window." + str + ";";
        mi.a("MraidBridge: Injecting Javascript into MRAID WebView " + hashCode() + " - " + str2);
        this.d.a(str2);
    }

    private String a(Rect rect) {
        return rect.left + StringUtils.COMMA + rect.top + StringUtils.COMMA + rect.width() + StringUtils.COMMA + rect.height();
    }
}
