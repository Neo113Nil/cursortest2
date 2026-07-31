package com.iab.omid.library.pubnativenet.messagelistener;

import android.net.Uri;
import android.webkit.WebView;
import androidx.webkit.JavaScriptReplyProxy;
import androidx.webkit.WebMessageCompat;
import androidx.webkit.WebViewCompat;
import androidx.webkit.WebViewFeature;
import com.iab.omid.library.pubnativenet.utils.d;
import com.iab.omid.library.pubnativenet.utils.g;
import com.iab.omid.library.pubnativenet.utils.i;
import java.util.Arrays;
import java.util.HashSet;
import org.json.JSONException;
import org.json.JSONObject;
import org.slf4j.Marker;

/* loaded from: classes13.dex */
public class a {
    private static final i c = new i();
    private final WebView a;
    private final b b;

    /* renamed from: com.iab.omid.library.pubnativenet.messagelistener.a$a, reason: collision with other inner class name */
    class C0325a implements WebViewCompat.WebMessageListener {
        C0325a() {
        }

        @Override // androidx.webkit.WebViewCompat.WebMessageListener
        public void onPostMessage(WebView webView, WebMessageCompat webMessageCompat, Uri uri, boolean z, JavaScriptReplyProxy javaScriptReplyProxy) {
            a.this.a(webMessageCompat.getData());
        }
    }

    public a(WebView webView, b bVar) {
        g.a(webView, "WebView is null");
        this.a = webView;
        this.b = bVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            this.b.onMessageReceived(jSONObject.getString("method"), jSONObject.getJSONObject("data"));
        } catch (JSONException e) {
            d.a("Error parsing JS message", e);
        }
    }

    public void a() {
        try {
            if (!WebViewFeature.isFeatureSupported("WEB_MESSAGE_LISTENER")) {
                this.b.onWebMessageListenerUnsupported();
                return;
            }
            try {
                b();
                c.a(this.a, this.b.getListenerName(), new HashSet(Arrays.asList(Marker.ANY_MARKER)), new C0325a());
            } catch (Exception e) {
                d.a("Error adding WebView listener", e);
                this.b.onWebMessageListenerUnsupported();
            }
        } catch (NoClassDefFoundError unused) {
            this.b.onWebMessageListenerUnsupported();
        }
    }

    public void b() {
        c.a(this.a, this.b.getListenerName());
    }
}
