package com.smaato.sdk.ng.utils.browser;

import android.net.Uri;
import java.util.Map;

/* loaded from: classes4.dex */
public final class UrlCreator {
    private Uri a(Uri uri, Map<String, String> map) {
        Uri.Builder buildUpon = uri.buildUpon();
        for (Map.Entry<String, String> entry : map.entrySet()) {
            buildUpon.appendQueryParameter(entry.getKey(), entry.getValue());
        }
        return buildUpon.build();
    }

    public String createUrl(String str, Map<String, String> map) {
        if (str == null) {
            throw new NullPointerException("Url can not be null");
        }
        if (map != null) {
            return a(Uri.parse(str), map).toString();
        }
        throw new NullPointerException("queryparams can not be null");
    }

    public String extractHostname(String str) {
        if (str != null) {
            return Uri.parse(str).getHost();
        }
        throw new NullPointerException("Url can not be null");
    }

    public String extractScheme(String str) {
        if (str != null) {
            return Uri.parse(str).getScheme();
        }
        throw new NullPointerException("Url can not be null");
    }

    public boolean isInsecureScheme(String str) {
        return "http".equalsIgnoreCase(str);
    }

    public boolean isSecureScheme(String str) {
        return "https".equalsIgnoreCase(str);
    }

    public boolean isSupportedForNetworking(String str) {
        String extractScheme = extractScheme(str);
        return isSecureScheme(extractScheme) || isInsecureScheme(extractScheme);
    }
}
