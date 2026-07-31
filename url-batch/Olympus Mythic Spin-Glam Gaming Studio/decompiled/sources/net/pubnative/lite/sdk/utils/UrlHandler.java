package net.pubnative.lite.sdk.utils;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.pubmatic.sdk.common.POBCommonConstants;
import com.safedk.android.analytics.events.RedirectEvent;
import io.bidmachine.util.network.NetworkUtils;
import java.util.Locale;

/* loaded from: classes3.dex */
public class UrlHandler {
    private static final String DEEPLINK_PARAM = "deeplinkUrl";
    private static final String DEEPLINK_URL_SCHEMA = "vrvdl";
    private static final String FALLBACK_PARAM = "fallbackUrl";
    private static final String TAG = "UrlHandler";
    private final IntentHandler mIntentHandler;

    public UrlHandler(Context context) {
        this.mIntentHandler = new IntentHandler(context);
    }

    String getDeeplinkUrl(Uri uri) {
        String queryParameter = uri.getQueryParameter(DEEPLINK_PARAM);
        if (TextUtils.isEmpty(queryParameter) || queryParameter.equalsIgnoreCase("\"\"")) {
            return null;
        }
        return queryParameter;
    }

    String getFallbackUrl(Uri uri) {
        String queryParameter = uri.getQueryParameter(FALLBACK_PARAM);
        if (TextUtils.isEmpty(queryParameter) || queryParameter.equalsIgnoreCase("\"\"")) {
            return null;
        }
        return queryParameter;
    }

    String handleDeeplinkIfPresent(String str, String str2) {
        if (!TextUtils.isEmpty(str2) && str2.contains(DEEPLINK_URL_SCHEMA)) {
            try {
                Uri parse = Uri.parse(str2);
                String deeplinkUrl = getDeeplinkUrl(parse);
                String fallbackUrl = getFallbackUrl(parse);
                if (!TextUtils.isEmpty(deeplinkUrl)) {
                    Uri parse2 = Uri.parse(deeplinkUrl);
                    String scheme = parse2.getScheme();
                    if (!"http".equalsIgnoreCase(scheme) && !"https".equalsIgnoreCase(scheme)) {
                        if (this.mIntentHandler.handleDeepLink(parse2)) {
                            return null;
                        }
                        if (TextUtils.isEmpty(fallbackUrl)) {
                        }
                    }
                    if (this.mIntentHandler.canHandleIntent(parse2)) {
                        this.mIntentHandler.handleDeepLink(parse2);
                        return null;
                    }
                    if (TextUtils.isEmpty(fallbackUrl)) {
                    }
                } else if (TextUtils.isEmpty(fallbackUrl)) {
                }
                return fallbackUrl;
            } catch (RuntimeException e) {
                Logger.e(TAG, "Error parsing deeplink url: " + e.getMessage());
            }
        }
        return str;
    }

    void handleNavigation(String str, String str2) {
        Uri parse = Uri.parse(str);
        String scheme = parse.getScheme();
        if (isPlayStoreLink(scheme, parse.getHost(), parse.toString().toLowerCase(Locale.ROOT))) {
            this.mIntentHandler.handleDeepLink(parse);
            return;
        }
        if (!isHttpOrHttps(scheme)) {
            if (TextUtils.isEmpty(scheme)) {
                return;
            }
            this.mIntentHandler.handleDeepLink(parse);
        } else if (RedirectEvent.i.equalsIgnoreCase(str2)) {
            this.mIntentHandler.handleBrowserLinkBrowserActivity(parse);
        } else {
            this.mIntentHandler.handleBrowserLink(parse);
        }
    }

    public void handleUrl(String str, String str2, String str3) {
        String handleDeeplinkIfPresent = handleDeeplinkIfPresent(str, str2);
        if (TextUtils.isEmpty(handleDeeplinkIfPresent)) {
            return;
        }
        Logger.d(TAG, "Handling url: " + handleDeeplinkIfPresent);
        handleNavigation(handleDeeplinkIfPresent, str3);
    }

    boolean isHttpOrHttps(String str) {
        return "http".equalsIgnoreCase(str) || "https".equalsIgnoreCase(str);
    }

    boolean isPlayStoreLink(String str, String str2, String str3) {
        return POBCommonConstants.PLAY_STORE_DOMAIN.equalsIgnoreCase(str2) || "market.android.com".equalsIgnoreCase(str2) || NetworkUtils.PROTOCOL_MARKET.equalsIgnoreCase(str) || str3.startsWith(POBCommonConstants.PLAY_STORE_DOMAIN) || str3.startsWith("market.android.com/");
    }
}
