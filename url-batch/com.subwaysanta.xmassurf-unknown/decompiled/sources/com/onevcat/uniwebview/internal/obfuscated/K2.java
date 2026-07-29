package com.onevcat.uniwebview.internal.obfuscated;

import android.app.Activity;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import androidx.browser.customtabs.CustomTabsClient;
import androidx.browser.customtabs.CustomTabsIntent;
import androidx.browser.customtabs.CustomTabsSession;
import androidx.core.app.NotificationCompat;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class K2 {
    public static final List j = CollectionsKt.listOf((Object[]) new String[]{"com.android.chrome", "com.chrome.beta", "com.chrome.dev", "com.chrome.canary", "com.microsoft.emmx", "com.brave.browser", "com.opera.browser", "com.opera.mini.native", "com.sec.android.app.sbrowser", "com.yandex.browser", "com.UCMobile.intl"});
    public static final ArrayList k = new ArrayList();
    public final Activity a;
    public final String b;
    public final String c;
    public final C0034i d;
    public CustomTabsClient e;
    public CustomTabsSession f;
    public boolean g;
    public Integer h;
    public boolean i;

    public K2(Activity activity, String name, String url, C0034i messageSender) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(messageSender, "messageSender");
        this.a = activity;
        this.b = name;
        this.c = url;
        this.d = messageSender;
        r rVar = r.b;
        rVar.getClass();
        Intrinsics.checkNotNullParameter(this, "browsing");
        Intrinsics.checkNotNullParameter(name, "name");
        C0058o c0058o = C0058o.b;
        c0058o.a(EnumC0054n.DEBUG, AbstractC0018e.a("Adding safe browsing to manager: ", name, c0058o, "message"));
        rVar.a.put(name, this);
        ResolveInfo a = H2.a(activity);
        if (a == null || CustomTabsClient.bindCustomTabsService(activity, a.serviceInfo.packageName, new I2(this))) {
            return;
        }
        Intrinsics.checkNotNullParameter("Custom Tabs didn't bind to a tab service. Something goes wrong. Trying to show the browser without a session.", "message");
        c0058o.a(EnumC0054n.CRITICAL, "Custom Tabs didn't bind to a tab service. Something goes wrong. Trying to show the browser without a session.");
        CustomTabsIntent.Builder builder = new CustomTabsIntent.Builder();
        Integer num = this.h;
        if (num != null) {
            builder.setToolbarColor(num.intValue());
        }
        builder.build().launchUrl(activity, Uri.parse(url));
    }

    public static final String a(K2 k2, String str) {
        k2.getClass();
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(NotificationCompat.CATEGORY_EVENT, str);
        jSONObject.put("source", "CustomTabsCallback");
        jSONObject.put("timestamp", System.currentTimeMillis());
        String jSONObject2 = jSONObject.toString();
        Intrinsics.checkNotNullExpressionValue(jSONObject2, "payload.toString()");
        return jSONObject2;
    }
}
