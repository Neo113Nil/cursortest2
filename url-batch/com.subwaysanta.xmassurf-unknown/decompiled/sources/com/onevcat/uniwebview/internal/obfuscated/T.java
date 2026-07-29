package com.onevcat.uniwebview.internal.obfuscated;

import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class T extends U {
    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public T(String webViewName, boolean z, String url) {
        super(webViewName, "ShouldUniWebViewHandleRequest", r4);
        Intrinsics.checkNotNullParameter(webViewName, "webViewName");
        Intrinsics.checkNotNullParameter(url, "url");
        String jSONObject = new JSONObject(MapsKt.mapOf(TuplesKt.to("url", url), TuplesKt.to("isMainFrame", Boolean.valueOf(z)))).toString();
        Intrinsics.checkNotNullExpressionValue(jSONObject, "obj.toString()");
    }
}
