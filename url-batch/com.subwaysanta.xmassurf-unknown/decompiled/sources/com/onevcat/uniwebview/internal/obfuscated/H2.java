package com.onevcat.uniwebview.internal.obfuscated;

import android.app.Activity;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import androidx.browser.customtabs.CustomTabsService;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public abstract class H2 {
    public static ResolveInfo a(Activity activity) {
        Object obj;
        Object obj2;
        Object obj3;
        String str;
        ResolveInfo resolveInfo;
        Intrinsics.checkNotNullParameter(activity, "activity");
        F2 queryServices = new F2(activity);
        G2 resolveDefaultBrowser = new G2(activity);
        List userPreferredPackages = CollectionsKt.toList(K2.k);
        List<String> chromiumBasedPackages = K2.j;
        Intrinsics.checkNotNullParameter(queryServices, "queryServices");
        Intrinsics.checkNotNullParameter(resolveDefaultBrowser, "resolveDefaultBrowser");
        Intrinsics.checkNotNullParameter(userPreferredPackages, "userPreferredPackages");
        Intrinsics.checkNotNullParameter(chromiumBasedPackages, "chromiumBasedPackages");
        C0058o c0058o = C0058o.b;
        c0058o.getClass();
        Intrinsics.checkNotNullParameter("Checking CustomTabsService resolve info.", "message");
        EnumC0054n enumC0054n = EnumC0054n.DEBUG;
        c0058o.a(enumC0054n, "Checking CustomTabsService resolve info.");
        List list = (List) queryServices.invoke(new Intent(CustomTabsService.ACTION_CUSTOM_TABS_CONNECTION));
        String message = "Resolved information: " + list;
        Intrinsics.checkNotNullParameter(message, "message");
        c0058o.a(enumC0054n, message);
        Iterator it = userPreferredPackages.iterator();
        do {
            Object obj4 = null;
            if (!it.hasNext()) {
                String str2 = (String) resolveDefaultBrowser.invoke();
                if (str2 != null && chromiumBasedPackages.contains(str2)) {
                    Iterator it2 = list.iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            obj3 = null;
                            break;
                        }
                        obj3 = it2.next();
                        if (Intrinsics.areEqual(((ResolveInfo) obj3).serviceInfo.packageName, str2)) {
                            break;
                        }
                    }
                    ResolveInfo resolveInfo2 = (ResolveInfo) obj3;
                    if (resolveInfo2 != null) {
                        C0058o c0058o2 = C0058o.b;
                        String message2 = "Using default Chromium-based browser: ".concat(str2);
                        c0058o2.getClass();
                        Intrinsics.checkNotNullParameter(message2, "message");
                        c0058o2.a(EnumC0054n.DEBUG, message2);
                        return resolveInfo2;
                    }
                }
                if (str2 != null) {
                    Iterator it3 = list.iterator();
                    while (true) {
                        if (!it3.hasNext()) {
                            obj2 = null;
                            break;
                        }
                        obj2 = it3.next();
                        if (Intrinsics.areEqual(((ResolveInfo) obj2).serviceInfo.packageName, str2)) {
                            break;
                        }
                    }
                    ResolveInfo resolveInfo3 = (ResolveInfo) obj2;
                    if (resolveInfo3 != null) {
                        C0058o c0058o3 = C0058o.b;
                        String message3 = "Using default browser: ".concat(str2);
                        c0058o3.getClass();
                        Intrinsics.checkNotNullParameter(message3, "message");
                        c0058o3.a(EnumC0054n.DEBUG, message3);
                        return resolveInfo3;
                    }
                }
                if (userPreferredPackages.isEmpty()) {
                    for (String str3 : chromiumBasedPackages) {
                        Iterator it4 = list.iterator();
                        while (true) {
                            if (!it4.hasNext()) {
                                obj = null;
                                break;
                            }
                            obj = it4.next();
                            if (Intrinsics.areEqual(((ResolveInfo) obj).serviceInfo.packageName, str3)) {
                                break;
                            }
                        }
                        ResolveInfo resolveInfo4 = (ResolveInfo) obj;
                        if (resolveInfo4 != null) {
                            C0058o c0058o4 = C0058o.b;
                            c0058o4.a(EnumC0054n.DEBUG, AbstractC0018e.a("Using fallback Chromium browser: ", str3, c0058o4, "message"));
                            return resolveInfo4;
                        }
                    }
                }
                ResolveInfo resolveInfo5 = (ResolveInfo) CollectionsKt.firstOrNull(list);
                if (resolveInfo5 != null) {
                    C0058o c0058o5 = C0058o.b;
                    String message4 = "Using fallback browser: " + resolveInfo5.serviceInfo.packageName;
                    c0058o5.getClass();
                    Intrinsics.checkNotNullParameter(message4, "message");
                    c0058o5.a(EnumC0054n.DEBUG, message4);
                }
                return resolveInfo5;
            }
            str = (String) it.next();
            Iterator it5 = list.iterator();
            while (true) {
                if (!it5.hasNext()) {
                    break;
                }
                Object next = it5.next();
                if (Intrinsics.areEqual(((ResolveInfo) next).serviceInfo.packageName, str)) {
                    obj4 = next;
                    break;
                }
            }
            resolveInfo = (ResolveInfo) obj4;
        } while (resolveInfo == null);
        C0058o c0058o6 = C0058o.b;
        c0058o6.a(EnumC0054n.DEBUG, AbstractC0018e.a("Using preferred browser: ", str, c0058o6, "message"));
        return resolveInfo;
    }
}
