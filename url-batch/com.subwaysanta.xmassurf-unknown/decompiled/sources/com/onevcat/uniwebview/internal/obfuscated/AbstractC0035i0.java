package com.onevcat.uniwebview.internal.obfuscated;

import android.webkit.CookieManager;
import android.webkit.ValueCallback;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import kotlin.text.StringsKt;

/* renamed from: com.onevcat.uniwebview.internal.obfuscated.i0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0035i0 {
    public static void a(String url, String cookie, final ValueCallback callback) {
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(cookie, "cookie");
        Intrinsics.checkNotNullParameter(callback, "callback");
        C0058o c0058o = C0058o.b;
        String message = AbstractC0080v.a("Cookie set for url async: ", url, ", cookie: ", cookie, c0058o);
        Intrinsics.checkNotNullParameter(message, "message");
        c0058o.a(EnumC0054n.VERBOSE, message);
        final CookieManager cookieManager = CookieManager.getInstance();
        cookieManager.setCookie(url, cookie, new ValueCallback() { // from class: com.onevcat.uniwebview.internal.obfuscated.i0$$ExternalSyntheticLambda1
            @Override // android.webkit.ValueCallback
            public final void onReceiveValue(Object obj) {
                AbstractC0035i0.b(cookieManager, callback, (Boolean) obj);
            }
        });
    }

    public static void b(String url, String str) {
        Intrinsics.checkNotNullParameter(url, "url");
        C0058o c0058o = C0058o.b;
        String message = AbstractC0080v.a("Cookie remove for url: ", url, ", key: ", str, c0058o);
        Intrinsics.checkNotNullParameter(message, "message");
        EnumC0054n enumC0054n = EnumC0054n.VERBOSE;
        c0058o.a(enumC0054n, message);
        CookieManager cookieManager = CookieManager.getInstance();
        String cookie = cookieManager.getCookie(url);
        if (cookie == null) {
            String message2 = "The content for given url '" + url + "' is not found in cookie manager.";
            Intrinsics.checkNotNullParameter(message2, "message");
            c0058o.a(EnumC0054n.DEBUG, message2);
            return;
        }
        String message3 = "Cookie string is found: '" + cookie + "', for url: " + url;
        Intrinsics.checkNotNullParameter(message3, "message");
        c0058o.a(enumC0054n, message3);
        Iterator<String> it = new Regex(";").split(cookie, 0).iterator();
        while (it.hasNext()) {
            List<String> split = new Regex("=").split(StringsKt.trim((CharSequence) it.next()).toString(), 0);
            if (split.size() >= 2 && (str == null || Intrinsics.areEqual(str, split.get(0)))) {
                cookieManager.setCookie(url, split.get(0) + '=');
            }
        }
    }

    public static void c(String url, String cookie) {
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(cookie, "cookie");
        C0058o c0058o = C0058o.b;
        String message = AbstractC0080v.a("Cookie set for url: ", url, ", cookie: ", cookie, c0058o);
        Intrinsics.checkNotNullParameter(message, "message");
        EnumC0054n enumC0054n = EnumC0054n.VERBOSE;
        c0058o.a(enumC0054n, message);
        CookieManager cookieManager = CookieManager.getInstance();
        cookieManager.setCookie(url, cookie);
        cookieManager.flush();
        Intrinsics.checkNotNullParameter("Cookie manager flush done.", "message");
        c0058o.a(enumC0054n, "Cookie manager flush done.");
    }

    public static String a(String url, String key) {
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(key, "key");
        String cookie = CookieManager.getInstance().getCookie(url);
        if (cookie == null) {
            C0058o c0058o = C0058o.b;
            String message = "The content for given url '" + url + "' is not found in cookie manager.";
            c0058o.getClass();
            Intrinsics.checkNotNullParameter(message, "message");
            c0058o.a(EnumC0054n.DEBUG, message);
            return "";
        }
        C0058o c0058o2 = C0058o.b;
        String message2 = AbstractC0080v.a("Cookie string is found: '", cookie, "', for url: ", url, c0058o2);
        Intrinsics.checkNotNullParameter(message2, "message");
        EnumC0054n enumC0054n = EnumC0054n.VERBOSE;
        c0058o2.a(enumC0054n, message2);
        String message3 = "Trying to parse cookie to find value for key: " + key;
        Intrinsics.checkNotNullParameter(message3, "message");
        c0058o2.a(enumC0054n, message3);
        Iterator it = CollectionsKt.reversed(new Regex(";").split(cookie, 0)).iterator();
        while (it.hasNext()) {
            List<String> split = new Regex("=").split(StringsKt.trim((CharSequence) it.next()).toString(), 0);
            if (split.size() >= 2 && Intrinsics.areEqual(split.get(0), key)) {
                String str = split.get(1);
                C0058o c0058o3 = C0058o.b;
                String message4 = AbstractC0080v.a("Found cookie value: ", str, " for key: ", key, c0058o3);
                Intrinsics.checkNotNullParameter(message4, "message");
                c0058o3.a(EnumC0054n.VERBOSE, message4);
                return str;
            }
        }
        C0058o c0058o4 = C0058o.b;
        String message5 = "Did not find the key '" + key + "' in cookie.";
        c0058o4.getClass();
        Intrinsics.checkNotNullParameter(message5, "message");
        c0058o4.a(EnumC0054n.VERBOSE, message5);
        return "";
    }

    public static final void b(CookieManager cookieManager, ValueCallback callback, Boolean bool) {
        Intrinsics.checkNotNullParameter(callback, "$callback");
        cookieManager.flush();
        C0058o c0058o = C0058o.b;
        c0058o.getClass();
        Intrinsics.checkNotNullParameter("Cookie manager flush done.", "message");
        c0058o.a(EnumC0054n.VERBOSE, "Cookie manager flush done.");
        callback.onReceiveValue(Unit.INSTANCE);
    }

    public static void b() {
        CookieManager.getInstance().flush();
    }

    public static void a() {
        final CookieManager cookieManager = CookieManager.getInstance();
        cookieManager.removeAllCookies(new ValueCallback() { // from class: com.onevcat.uniwebview.internal.obfuscated.i0$$ExternalSyntheticLambda2
            @Override // android.webkit.ValueCallback
            public final void onReceiveValue(Object obj) {
                AbstractC0035i0.a(cookieManager, (Boolean) obj);
            }
        });
    }

    public static final void a(CookieManager cookieManager, Boolean bool) {
        cookieManager.flush();
        C0058o c0058o = C0058o.b;
        c0058o.getClass();
        Intrinsics.checkNotNullParameter("Cookie manager flush done.", "message");
        c0058o.a(EnumC0054n.VERBOSE, "Cookie manager flush done.");
    }

    public static void a(final ValueCallback callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        final CookieManager cookieManager = CookieManager.getInstance();
        cookieManager.removeAllCookies(new ValueCallback() { // from class: com.onevcat.uniwebview.internal.obfuscated.i0$$ExternalSyntheticLambda0
            @Override // android.webkit.ValueCallback
            public final void onReceiveValue(Object obj) {
                AbstractC0035i0.a(cookieManager, callback, (Boolean) obj);
            }
        });
    }

    public static final void a(CookieManager cookieManager, ValueCallback callback, Boolean bool) {
        Intrinsics.checkNotNullParameter(callback, "$callback");
        cookieManager.flush();
        C0058o c0058o = C0058o.b;
        c0058o.getClass();
        Intrinsics.checkNotNullParameter("Cookie manager flush done.", "message");
        c0058o.a(EnumC0054n.VERBOSE, "Cookie manager flush done.");
        callback.onReceiveValue(Unit.INSTANCE);
    }
}
