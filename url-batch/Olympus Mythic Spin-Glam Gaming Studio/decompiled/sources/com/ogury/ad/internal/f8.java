package com.ogury.ad.internal;

import android.webkit.WebView;
import java.util.ArrayList;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes9.dex */
public final class f8 {
    public final Map a;
    public final Map b;

    public f8(Map webViewsMap, Map webViewStates) {
        Intrinsics.checkNotNullParameter(webViewsMap, "webViewsMap");
        Intrinsics.checkNotNullParameter(webViewStates, "webViewStates");
        this.a = webViewsMap;
        this.b = webViewStates;
    }

    public final ArrayList a() {
        ArrayList arrayList = new ArrayList();
        for (y7 y7Var : this.a.values()) {
            xi xiVar = (xi) this.b.get(w1.a((WebView) y7Var));
            if (xiVar != null && xiVar.d) {
                arrayList.add(y7Var);
            }
        }
        return arrayList;
    }

    public static void a(y7 webView, String callbackId, String webViewId) {
        Intrinsics.checkNotNullParameter(webView, "webView");
        Intrinsics.checkNotNullParameter(callbackId, "callbackId");
        Intrinsics.checkNotNullParameter(webViewId, "webViewId");
        b8.a(webView, x6.b(callbackId, "{webviewId:\"" + webViewId + "\"}"));
    }
}
