package com.my.target;

import android.text.TextUtils;
import android.webkit.URLUtil;
import java.net.URL;
import java.net.URLDecoder;
import java.net.URLEncoder;

/* compiled from: r8-map-id-376f9cbbf0a7df308b3ad5c16a6608bc59316f0ad6051cf26b365c8cc4cd0036 */
/* loaded from: classes4.dex */
public abstract class ti {
    private static final String[] a = {"http://play.google.com", "https://play.google.com", "http://market.android.com", "https://market.android.com", "https://appgallery.huawei.com/", "https://appgallery.cloud.huawei.com/", "market://", "samsungapps://", "appmarket://", "hiapplink://", "mimarket://", "https://apps.rustore.ru", "https://backapi.rustore.ru"};

    public static String a(String str) {
        try {
            return URLDecoder.decode(str, "UTF-8");
        } catch (Throwable th) {
            mi.a("UrlResolver: Unable to decode url - " + th.getMessage());
            return str;
        }
    }

    public static String b(String str) {
        try {
            return URLEncoder.encode(str, "UTF-8");
        } catch (Throwable th) {
            mi.a("UrlResolver: Unable to encode url - " + th.getMessage());
            return "";
        }
    }

    public static boolean c(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return str.startsWith("https");
    }

    public static boolean d(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        for (String str2 : a) {
            if (str.startsWith(str2)) {
                return true;
            }
        }
        return false;
    }

    public static boolean e(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        try {
            if (URLUtil.isHttpsUrl(str)) {
                return !TextUtils.isEmpty(new URL(str).getHost());
            }
        } catch (Throwable unused) {
        }
        return false;
    }
}
