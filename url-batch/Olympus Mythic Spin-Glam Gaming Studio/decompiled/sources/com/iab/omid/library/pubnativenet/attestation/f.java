package com.iab.omid.library.pubnativenet.attestation;

import android.webkit.WebView;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes6.dex */
public class f implements com.iab.omid.library.pubnativenet.messagelistener.b {
    private final com.iab.omid.library.pubnativenet.messagelistener.a a;

    private f(WebView webView) {
        com.iab.omid.library.pubnativenet.messagelistener.a aVar = new com.iab.omid.library.pubnativenet.messagelistener.a(webView, this);
        this.a = aVar;
        aVar.a();
    }

    public static f a(WebView webView) {
        return new f(webView);
    }

    private void a(JSONObject jSONObject) {
        try {
            String string = jSONObject.getString("mechanism");
            String string2 = jSONObject.getString("version");
            Map<String, String> b = com.iab.omid.library.pubnativenet.utils.c.b(jSONObject.getJSONObject("attestationArgs"));
            b.put("version", string2);
            e.a(com.iab.omid.library.pubnativenet.internal.g.b().a().getApplicationContext(), string, new a(b));
        } catch (Exception e) {
            com.iab.omid.library.pubnativenet.utils.d.a("Error processing attestation request", e);
        }
    }

    @Override // com.iab.omid.library.pubnativenet.messagelistener.b
    public String getListenerName() {
        return "omidJsAttestationListener";
    }

    @Override // com.iab.omid.library.pubnativenet.messagelistener.b
    public void onMessageReceived(String str, JSONObject jSONObject) {
        if ("attest".equals(str)) {
            a(jSONObject);
            return;
        }
        com.iab.omid.library.pubnativenet.utils.d.b("Unexpected method in AttestationMessageListener: " + str);
    }

    @Override // com.iab.omid.library.pubnativenet.messagelistener.b
    public void onWebMessageListenerUnsupported() {
        com.iab.omid.library.pubnativenet.utils.d.b("The Attestation Webview Listener cannot be supported in this WebView version.");
    }
}
