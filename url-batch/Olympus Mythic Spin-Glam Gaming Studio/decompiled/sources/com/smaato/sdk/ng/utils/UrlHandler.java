package com.smaato.sdk.ng.utils;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.pubmatic.sdk.common.POBCommonConstants;
import com.safedk.android.analytics.events.RedirectEvent;
import io.bidmachine.util.network.NetworkUtils;
import java.util.Locale;

/* loaded from: classes15.dex */
public class UrlHandler {
    private static final String b = "UrlHandler";
    private final IntentHandler a;

    public UrlHandler(Context context) {
        this.a = new IntentHandler(context);
    }

    String a(String str, String str2) {
        if (!TextUtils.isEmpty(str2) && str2.contains("vrvdl")) {
            try {
                Uri parse = Uri.parse(str2);
                String a = a(parse);
                String b2 = b(parse);
                if (!TextUtils.isEmpty(a)) {
                    Uri parse2 = Uri.parse(a);
                    String scheme = parse2.getScheme();
                    if (!"http".equalsIgnoreCase(scheme) && !"https".equalsIgnoreCase(scheme)) {
                        if (this.a.handleDeepLink(parse2)) {
                            return null;
                        }
                        if (TextUtils.isEmpty(b2)) {
                        }
                    }
                    if (this.a.canHandleIntent(parse2)) {
                        this.a.handleDeepLink(parse2);
                        return null;
                    }
                    if (TextUtils.isEmpty(b2)) {
                    }
                } else if (TextUtils.isEmpty(b2)) {
                }
                return b2;
            } catch (RuntimeException e) {
                Logger.e(b, "Error parsing deeplink url: " + e.getMessage());
            }
        }
        return str;
    }

    void b(String str, String str2) {
        Uri parse = Uri.parse(str);
        String scheme = parse.getScheme();
        if (a(scheme, parse.getHost(), parse.toString().toLowerCase(Locale.ROOT))) {
            this.a.handleDeepLink(parse);
            return;
        }
        if (!a(scheme)) {
            if (TextUtils.isEmpty(scheme)) {
                return;
            }
            this.a.handleDeepLink(parse);
        } else if (RedirectEvent.i.equalsIgnoreCase(str2)) {
            this.a.handleBrowserLinkBrowserActivity(parse);
        } else {
            this.a.handleBrowserLink(parse);
        }
    }

    public void handleUrl(String str, String str2, String str3) {
        String a = a(str, str2);
        if (TextUtils.isEmpty(a)) {
            return;
        }
        Logger.d(b, "Handling url: " + a);
        b(a, str3);
    }

    String b(Uri uri) {
        String queryParameter = uri.getQueryParameter("fallbackUrl");
        if (TextUtils.isEmpty(queryParameter) || queryParameter.equalsIgnoreCase("\"\"")) {
            return null;
        }
        return queryParameter;
    }

    boolean a(String str, String str2, String str3) {
        return POBCommonConstants.PLAY_STORE_DOMAIN.equalsIgnoreCase(str2) || "market.android.com".equalsIgnoreCase(str2) || NetworkUtils.PROTOCOL_MARKET.equalsIgnoreCase(str) || str3.startsWith(POBCommonConstants.PLAY_STORE_DOMAIN) || str3.startsWith("market.android.com/");
    }

    boolean a(String str) {
        return "http".equalsIgnoreCase(str) || "https".equalsIgnoreCase(str);
    }

    String a(Uri uri) {
        String queryParameter = uri.getQueryParameter("deeplinkUrl");
        if (TextUtils.isEmpty(queryParameter) || queryParameter.equalsIgnoreCase("\"\"")) {
            return null;
        }
        return queryParameter;
    }
}
