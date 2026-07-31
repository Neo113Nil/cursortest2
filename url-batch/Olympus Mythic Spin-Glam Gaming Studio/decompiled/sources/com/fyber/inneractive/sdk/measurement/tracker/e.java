package com.fyber.inneractive.sdk.measurement.tracker;

import android.webkit.WebView;
import com.fyber.inneractive.sdk.web.m;
import com.iab.omid.library.fyber.adsession.AdEvents;
import com.iab.omid.library.fyber.adsession.AdSession;
import com.iab.omid.library.fyber.adsession.AdSessionConfiguration;
import com.iab.omid.library.fyber.adsession.AdSessionContext;
import com.iab.omid.library.fyber.adsession.Partner;

/* loaded from: classes5.dex */
public abstract class e {
    public AdSession a;
    public AdEvents b;
    public boolean c = false;
    public final Partner d;
    public WebView e;

    public e(Partner partner, m mVar) {
        this.d = partner;
        this.e = mVar;
    }

    public abstract void a();

    public void a(m mVar) {
        AdSessionContext adSessionContext;
        try {
            AdSessionConfiguration b = b();
            try {
                adSessionContext = AdSessionContext.createHtmlAdSessionContext(this.d, mVar, "", "");
            } catch (Throwable unused) {
                adSessionContext = null;
            }
            AdSession createAdSession = AdSession.createAdSession(b, adSessionContext);
            this.a = createAdSession;
            createAdSession.registerAdView(mVar);
            this.a.start();
        } catch (Throwable unused2) {
        }
    }

    public abstract AdSessionConfiguration b();

    public abstract void c();
}
