package com.vungle.ads.internal.omsdk;

import android.webkit.WebView;
import com.iab.omid.library.vungle.Omid;
import com.iab.omid.library.vungle.adsession.AdSession;
import com.iab.omid.library.vungle.adsession.AdSessionConfiguration;
import com.iab.omid.library.vungle.adsession.AdSessionContext;
import com.iab.omid.library.vungle.adsession.CreativeType;
import com.iab.omid.library.vungle.adsession.ImpressionType;
import com.iab.omid.library.vungle.adsession.Owner;
import com.iab.omid.library.vungle.adsession.Partner;
import com.vungle.ads.BuildConfig;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class e implements f {
    public static final long d = TimeUnit.SECONDS.toMillis(1);
    public final boolean a;
    public boolean b;
    public AdSession c;

    public e(boolean z) {
        this.a = z;
    }

    public final void a() {
        if (this.a && Omid.isActive()) {
            this.b = true;
        }
    }

    public final void a(WebView webView) {
        Intrinsics.checkNotNullParameter(webView, "webView");
        if (this.b && this.c == null) {
            CreativeType creativeType = CreativeType.DEFINED_BY_JAVASCRIPT;
            ImpressionType impressionType = ImpressionType.DEFINED_BY_JAVASCRIPT;
            Owner owner = Owner.JAVASCRIPT;
            AdSession createAdSession = AdSession.createAdSession(AdSessionConfiguration.createAdSessionConfiguration(creativeType, impressionType, owner, owner, false), AdSessionContext.createHtmlAdSessionContext(Partner.createPartner(BuildConfig.OMSDK_PARTNER_NAME, BuildConfig.VERSION_NAME), webView, null, null));
            this.c = createAdSession;
            if (createAdSession != null) {
                createAdSession.registerAdView(webView);
            }
            AdSession adSession = this.c;
            if (adSession != null) {
                adSession.start();
            }
        }
    }
}
