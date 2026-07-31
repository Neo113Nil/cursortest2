package com.iab.omid.library.ogury.adsession;

import android.view.View;
import android.webkit.WebView;
import androidx.annotation.Nullable;
import com.iab.omid.library.ogury.internal.e;
import com.iab.omid.library.ogury.internal.f;
import com.iab.omid.library.ogury.messagelistener.b;
import com.iab.omid.library.ogury.utils.d;
import com.iab.omid.library.ogury.utils.g;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Timer;
import java.util.TimerTask;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes10.dex */
public class JavaScriptSessionService implements b {
    private static String JS_MESSAGE_DATA_AD_SESSION_ID = "adSessionId";
    private static String JS_MESSAGE_LISTENER_JS_SESSION_SERVICE = "omidJsSessionService";
    private static String JS_MESSAGE_METHOD_FINISH_SESSION = "finishSession";
    private static String JS_MESSAGE_METHOD_START_SESSION = "startSession";
    private final HashMap<String, AdSession> adSessions = new HashMap<>();
    private final f friendlyObstructions = new f();
    private final boolean isHtmlAdView;
    private final com.iab.omid.library.ogury.messagelistener.a messageListener;
    private final Partner partner;
    private com.iab.omid.library.ogury.weakreference.a weakAdView;
    private final WebView webView;

    public interface TearDownHandler {
        void onTearDown(boolean z);
    }

    private JavaScriptSessionService(Partner partner, WebView webView, boolean z) {
        g.a();
        g.a(partner, "Partner is null");
        g.a(webView, "WebView is null");
        this.partner = partner;
        this.webView = webView;
        this.isHtmlAdView = z;
        if (z) {
            setAdView(webView);
        }
        com.iab.omid.library.ogury.messagelistener.a aVar = new com.iab.omid.library.ogury.messagelistener.a(webView, this);
        this.messageListener = aVar;
        aVar.a();
    }

    public static JavaScriptSessionService create(Partner partner, WebView webView, boolean z) {
        return new JavaScriptSessionService(partner, webView, z);
    }

    private AdSessionConfiguration createAdSessionConfiguration() {
        CreativeType creativeType = CreativeType.DEFINED_BY_JAVASCRIPT;
        ImpressionType impressionType = ImpressionType.DEFINED_BY_JAVASCRIPT;
        Owner owner = Owner.JAVASCRIPT;
        return AdSessionConfiguration.createAdSessionConfiguration(creativeType, impressionType, owner, owner, false);
    }

    private AdSessionContext createAdSessionContext() {
        return this.isHtmlAdView ? AdSessionContext.createHtmlAdSessionContext(this.partner, this.webView, null, null) : AdSessionContext.createJavascriptAdSessionContext(this.partner, this.webView, null, null);
    }

    private void finishSession(String str) {
        AdSession adSession = this.adSessions.get(str);
        if (adSession != null) {
            adSession.finish();
            this.adSessions.remove(str);
        }
    }

    private void startSession(String str) {
        a aVar = new a(createAdSessionConfiguration(), createAdSessionContext(), str);
        this.adSessions.put(str, aVar);
        aVar.registerAdView(getAdView());
        for (e eVar : this.friendlyObstructions.a()) {
            aVar.addFriendlyObstruction(eVar.c().get(), eVar.b(), eVar.a());
        }
        aVar.start();
    }

    public void addFriendlyObstruction(View view, FriendlyObstructionPurpose friendlyObstructionPurpose, @Nullable String str) {
        Iterator<AdSession> it = this.adSessions.values().iterator();
        while (it.hasNext()) {
            it.next().addFriendlyObstruction(view, friendlyObstructionPurpose, str);
        }
        this.friendlyObstructions.a(view, friendlyObstructionPurpose, str);
    }

    @Nullable
    View getAdView() {
        com.iab.omid.library.ogury.weakreference.a aVar = this.weakAdView;
        if (aVar == null) {
            return null;
        }
        return aVar.get();
    }

    @Override // com.iab.omid.library.ogury.messagelistener.b
    public String getListenerName() {
        return JS_MESSAGE_LISTENER_JS_SESSION_SERVICE;
    }

    @Override // com.iab.omid.library.ogury.messagelistener.b
    public void onMessageReceived(String str, JSONObject jSONObject) {
        try {
            String string = jSONObject.getString(JS_MESSAGE_DATA_AD_SESSION_ID);
            if (str.equals(JS_MESSAGE_METHOD_START_SESSION)) {
                startSession(string);
            } else if (str.equals(JS_MESSAGE_METHOD_FINISH_SESSION)) {
                finishSession(string);
            } else {
                d.d("Unexpected method in JavaScriptSessionService: " + str);
            }
        } catch (JSONException e) {
            d.a("Error parsing JS message in JavaScriptSessionService.", e);
        }
    }

    @Override // com.iab.omid.library.ogury.messagelistener.b
    public void onWebMessageListenerUnsupported() {
        throw new UnsupportedOperationException("The JavaScriptSessionService cannot be supported in this WebView version.");
    }

    public void removeAllFriendlyObstructions() {
        Iterator<AdSession> it = this.adSessions.values().iterator();
        while (it.hasNext()) {
            it.next().removeAllFriendlyObstructions();
        }
        this.friendlyObstructions.b();
    }

    public void removeFriendlyObstruction(View view) {
        Iterator<AdSession> it = this.adSessions.values().iterator();
        while (it.hasNext()) {
            it.next().removeFriendlyObstruction(view);
        }
        this.friendlyObstructions.c(view);
    }

    public void setAdView(@Nullable View view) {
        if (getAdView() == view) {
            return;
        }
        Iterator<AdSession> it = this.adSessions.values().iterator();
        while (it.hasNext()) {
            it.next().registerAdView(view);
        }
        this.weakAdView = new com.iab.omid.library.ogury.weakreference.a(view);
    }

    public void tearDown(final TearDownHandler tearDownHandler) {
        Iterator<AdSession> it = this.adSessions.values().iterator();
        while (it.hasNext()) {
            it.next().finish();
        }
        final Timer timer = new Timer();
        timer.schedule(new TimerTask() { // from class: com.iab.omid.library.ogury.adsession.JavaScriptSessionService.1
            @Override // java.util.TimerTask, java.lang.Runnable
            public void run() {
                JavaScriptSessionService.this.messageListener.b();
                tearDownHandler.onTearDown(true);
                timer.cancel();
            }
        }, 1000L);
    }
}
