package com.iab.omid.library.ogury.publisher;

import android.webkit.WebView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.iab.omid.library.ogury.adsession.AdEvents;
import com.iab.omid.library.ogury.adsession.AdSessionConfiguration;
import com.iab.omid.library.ogury.adsession.AdSessionContext;
import com.iab.omid.library.ogury.adsession.ErrorType;
import com.iab.omid.library.ogury.adsession.VerificationScriptResource;
import com.iab.omid.library.ogury.adsession.media.MediaEvents;
import com.iab.omid.library.ogury.internal.g;
import com.iab.omid.library.ogury.internal.h;
import com.iab.omid.library.ogury.utils.c;
import com.iab.omid.library.ogury.utils.d;
import com.iab.omid.library.ogury.utils.f;
import com.pubmatic.sdk.crashanalytics.POBCrashAnalyticsConstants;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes15.dex */
public abstract class AdSessionStatePublisher {
    private String a;
    private com.iab.omid.library.ogury.weakreference.b b;
    private AdEvents c;
    private MediaEvents d;
    private a e;
    private long f;

    enum a {
        AD_STATE_IDLE,
        AD_STATE_VISIBLE,
        AD_STATE_NOTVISIBLE
    }

    public AdSessionStatePublisher(String str) {
        a();
        this.a = str;
        this.b = new com.iab.omid.library.ogury.weakreference.b(null);
    }

    private JSONArray a(@NonNull List<com.iab.omid.library.ogury.attestation.b> list) {
        JSONArray jSONArray = new JSONArray();
        for (com.iab.omid.library.ogury.attestation.b bVar : list) {
            Iterator<String> it = bVar.c().iterator();
            while (it.hasNext()) {
                jSONArray.put(a(bVar, it.next()));
            }
        }
        return jSONArray;
    }

    private JSONObject a(com.iab.omid.library.ogury.attestation.b bVar, String str) {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("mechanism", bVar.a());
        jSONObject.put("executionEnvironment", bVar.b().toString());
        jSONObject.put("version", str);
        return jSONObject;
    }

    private JSONObject a(JSONArray jSONArray) {
        JSONObject jSONObject = new JSONObject();
        c.a(jSONObject, "supportedAttestationMechanisms", jSONArray);
        return jSONObject;
    }

    private void a(JSONObject jSONObject) {
        h.a().b(getWebView(), jSONObject);
    }

    public void a() {
        this.f = f.b();
        this.e = a.AD_STATE_IDLE;
    }

    public void a(float f) {
        h.a().a(getWebView(), this.a, f);
    }

    void a(WebView webView) {
        this.b = new com.iab.omid.library.ogury.weakreference.b(webView);
    }

    public void a(AdEvents adEvents) {
        this.c = adEvents;
    }

    public void a(AdSessionConfiguration adSessionConfiguration) {
        h.a().a(getWebView(), this.a, adSessionConfiguration.toJsonObject());
    }

    public void a(ErrorType errorType, String str) {
        h.a().a(getWebView(), this.a, errorType, str);
    }

    public void a(com.iab.omid.library.ogury.adsession.a aVar, AdSessionContext adSessionContext) {
        a(aVar, adSessionContext, null);
    }

    protected void a(com.iab.omid.library.ogury.adsession.a aVar, AdSessionContext adSessionContext, JSONObject jSONObject) {
        String c = aVar.c();
        JSONObject jSONObject2 = new JSONObject();
        c.a(jSONObject2, "environment", "app");
        c.a(jSONObject2, "adSessionType", adSessionContext.getAdSessionContextType());
        c.a(jSONObject2, POBCrashAnalyticsConstants.DEVICE_INFO_KEY, com.iab.omid.library.ogury.utils.b.d());
        c.a(jSONObject2, "deviceCategory", com.iab.omid.library.ogury.utils.a.a().toString());
        JSONArray jSONArray = new JSONArray();
        jSONArray.put("clid");
        jSONArray.put("vlid");
        c.a(jSONObject2, "supports", jSONArray);
        JSONObject jSONObject3 = new JSONObject();
        c.a(jSONObject3, HandleInvocationsFromAdViewer.KEY_OM_PARTNER, adSessionContext.getPartner().getName());
        c.a(jSONObject3, HandleInvocationsFromAdViewer.KEY_OM_PARTNER_VERSION, adSessionContext.getPartner().getVersion());
        c.a(jSONObject2, "omidNativeInfo", jSONObject3);
        JSONObject jSONObject4 = new JSONObject();
        c.a(jSONObject4, "libraryVersion", "1.6.2-Ogury");
        c.a(jSONObject4, "appId", g.b().a().getApplicationContext().getPackageName());
        c.a(jSONObject2, "app", jSONObject4);
        if (adSessionContext.getContentUrl() != null) {
            c.a(jSONObject2, "contentUrl", adSessionContext.getContentUrl());
        }
        if (adSessionContext.getCustomReferenceData() != null) {
            c.a(jSONObject2, "customReferenceData", adSessionContext.getCustomReferenceData());
        }
        if (adSessionContext.getUniversalAdId() != null) {
            c.a(jSONObject2, "universalAdId", adSessionContext.getUniversalAdId());
        }
        JSONObject jSONObject5 = new JSONObject();
        for (VerificationScriptResource verificationScriptResource : adSessionContext.getVerificationScriptResources()) {
            c.a(jSONObject5, verificationScriptResource.getVendorKey(), verificationScriptResource.getVerificationParameters());
        }
        h.a().a(getWebView(), c, jSONObject2, jSONObject5, jSONObject);
    }

    public void a(MediaEvents mediaEvents) {
        this.d = mediaEvents;
    }

    public void a(String str) {
        a(str, (JSONObject) null);
    }

    public void a(String str, long j) {
        if (j >= this.f) {
            a aVar = this.e;
            a aVar2 = a.AD_STATE_NOTVISIBLE;
            if (aVar != aVar2) {
                this.e = aVar2;
                h.a().b(getWebView(), this.a, str);
            }
        }
    }

    public void a(String str, @Nullable JSONObject jSONObject) {
        h.a().a(getWebView(), this.a, str, jSONObject);
    }

    public void a(@NonNull Date date) {
        if (date == null) {
            return;
        }
        JSONObject jSONObject = new JSONObject();
        c.a(jSONObject, "timestamp", Long.valueOf(date.getTime()));
        h.a().a(getWebView(), jSONObject);
    }

    public void a(boolean z) {
        if (e()) {
            h.a().c(getWebView(), this.a, z ? "foregrounded" : "backgrounded");
        }
    }

    public void b() {
        this.b.clear();
    }

    public void b(String str, long j) {
        if (j >= this.f) {
            this.e = a.AD_STATE_VISIBLE;
            h.a().b(getWebView(), this.a, str);
        }
    }

    public void b(@NonNull List<com.iab.omid.library.ogury.attestation.b> list) {
        try {
            a(a(a(list)));
        } catch (JSONException e) {
            d.a("Error creating JSON object publishSupportedAttestationMechanisms", e);
        }
    }

    public void b(@Nullable JSONObject jSONObject) {
        h.a().b(getWebView(), this.a, jSONObject);
    }

    public void b(boolean z) {
        if (e()) {
            h.a().a(getWebView(), this.a, z ? "locked" : "unlocked");
        }
    }

    public AdEvents c() {
        return this.c;
    }

    public MediaEvents d() {
        return this.d;
    }

    public boolean e() {
        return this.b.get() != null;
    }

    public void f() {
        h.a().a(getWebView(), this.a);
    }

    public void g() {
        h.a().b(getWebView(), this.a);
    }

    public WebView getWebView() {
        return this.b.get();
    }

    public void h() {
        b((JSONObject) null);
    }

    public void i() {
    }
}
