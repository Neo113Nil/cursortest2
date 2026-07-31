package net.pubnative.lite.sdk.utils;

import android.util.Patterns;
import android.webkit.URLUtil;
import com.ironsource.X3;

/* loaded from: classes14.dex */
public class URLValidator {
    public static boolean isValidURL(String str) {
        if (str != null && !str.trim().isEmpty()) {
            String replace = str.replace(X3.j.d, "%5B").replace(X3.j.e, "%5D");
            if (URLUtil.isValidUrl(replace) && Patterns.WEB_URL.matcher(replace).matches()) {
                return true;
            }
        }
        return false;
    }
}
