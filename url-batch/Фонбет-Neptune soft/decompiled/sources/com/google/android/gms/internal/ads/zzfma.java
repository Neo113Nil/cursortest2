package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.webkit.WebView;
import androidx.webkit.JavaScriptReplyProxy;
import androidx.webkit.WebMessageCompat;
import androidx.webkit.WebViewCompat;
import com.google.firebase.messaging.Constants;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
final class zzfma implements WebViewCompat.WebMessageListener {
    final /* synthetic */ zzfmb zza;

    zzfma(zzfmb zzfmbVar) {
        this.zza = zzfmbVar;
    }

    @Override // androidx.webkit.WebViewCompat.WebMessageListener
    public final void onPostMessage(WebView webView, WebMessageCompat webMessageCompat, Uri uri, boolean z, JavaScriptReplyProxy javaScriptReplyProxy) {
        try {
            JSONObject jSONObject = new JSONObject(webMessageCompat.getData());
            String string = jSONObject.getString("method");
            String string2 = jSONObject.getJSONObject(Constants.ScionAnalytics.MessageType.DATA_MESSAGE).getString("adSessionId");
            if (string.equals("startSession")) {
                zzfmb.zzd(this.zza, string2);
            } else if (string.equals("finishSession")) {
                zzfmb.zzb(this.zza, string2);
            } else {
                zzfln.zza.booleanValue();
            }
        } catch (JSONException e) {
            zzfng.zza("Error parsing JS message in JavaScriptSessionService.", e);
        }
    }
}
