package yads;

import android.os.Handler;
import android.text.TextUtils;
import android.webkit.WebView;
import java.util.Collections;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class gv3 extends i9 {
    public WebView g;
    public Long h;
    public final Map i;
    public final String j;

    public gv3(String str, Map map, String str2) {
        super(str);
        this.h = null;
        this.i = map;
        this.j = str2;
    }

    @Override // yads.i9
    public final void a(av3 av3Var, g9 g9Var) {
        JSONObject jSONObject = new JSONObject();
        Map unmodifiableMap = Collections.unmodifiableMap(g9Var.c);
        for (String str : unmodifiableMap.keySet()) {
            xd3 xd3Var = (xd3) unmodifiableMap.get(str);
            xd3Var.getClass();
            JSONObject jSONObject2 = new JSONObject();
            ov3.a(jSONObject2, "vendorKey", xd3Var.a);
            ov3.a(jSONObject2, "resourceUrl", xd3Var.b.toString());
            ov3.a(jSONObject2, "verificationParameters", xd3Var.c);
            ov3.a(jSONObject, str, jSONObject2);
        }
        a(av3Var, g9Var, jSONObject);
    }

    @Override // yads.i9
    public final void b() {
        WebView webView = new WebView(hw3.b.a);
        this.g = webView;
        webView.getSettings().setJavaScriptEnabled(true);
        this.g.getSettings().setAllowContentAccess(false);
        this.g.getSettings().setAllowFileAccess(false);
        this.g.setWebViewClient(new bv3(this));
        this.b = new kv3(this.g);
        kw3.a(this.g, this.j);
        for (String str : this.i.keySet()) {
            String externalForm = ((xd3) this.i.get(str)).b.toExternalForm();
            WebView webView2 = this.g;
            if (externalForm != null && !TextUtils.isEmpty(str)) {
                kw3.a(webView2, "(function() {this.omidVerificationProperties = this.omidVerificationProperties || {};Object.defineProperty(this.omidVerificationProperties, 'injectionId', {get: function() {var currentScript = document && document.currentScript;return currentScript && currentScript.getAttribute('data-injection-id');}, configurable: true});var script = document.createElement('script');script.setAttribute(\"type\",\"text/javascript\");script.setAttribute(\"src\",\"%SCRIPT_SRC%\");script.setAttribute(\"data-injection-id\",\"%INJECTION_ID%\");document.body.appendChild(script);})();".replace("%SCRIPT_SRC%", externalForm).replace("%INJECTION_ID%", str));
            }
        }
        this.h = Long.valueOf(System.nanoTime());
    }

    @Override // yads.i9
    public final void a() {
        this.b.clear();
        new Handler().postDelayed(new cv3(this), Math.max(4000 - (this.h == null ? 4000L : TimeUnit.MILLISECONDS.convert(System.nanoTime() - this.h.longValue(), TimeUnit.NANOSECONDS)), 2000L));
        this.g = null;
    }
}
