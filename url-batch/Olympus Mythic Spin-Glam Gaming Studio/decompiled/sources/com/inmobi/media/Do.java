package com.inmobi.media;

import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import com.ironsource.C4701ic;
import java.net.URLDecoder;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlinx.coroutines.BuildersKt__BuildersKt;

/* loaded from: classes10.dex */
public abstract class Do {
    public static WebResourceResponse a(WebResourceRequest request, InterfaceC4466x9 interfaceC4466x9) {
        Intrinsics.checkNotNullParameter(request, "request");
        Intrinsics.checkNotNullParameter(request, "<this>");
        if (!StringsKt.equals(C4701ic.a, request.getMethod(), true)) {
            return null;
        }
        String uri = request.getUrl().toString();
        Intrinsics.checkNotNullExpressionValue(uri, "toString(...)");
        return a(uri, interfaceC4466x9);
    }

    public static WebResourceResponse a(String urlRaw, InterfaceC4466x9 interfaceC4466x9) {
        String url;
        Object runBlocking$default;
        Intrinsics.checkNotNullParameter(urlRaw, "urlRaw");
        if (interfaceC4466x9 != null) {
            ((C4493y9) interfaceC4466x9).c("IMResourceCacheManager", "shouldInterceptRequest " + urlRaw);
        }
        try {
            url = URLDecoder.decode(StringsKt.trim(urlRaw).toString(), "UTF-8");
        } catch (Exception unused) {
            url = null;
        }
        if (url == null) {
            return null;
        }
        Intrinsics.checkNotNullParameter(url, "url");
        if (StringsKt.contains$default((CharSequence) url, (CharSequence) "inmobicache=true", false, 2, (Object) null)) {
            runBlocking$default = BuildersKt__BuildersKt.runBlocking$default(null, new Co(url, interfaceC4466x9, null), 1, null);
            return (WebResourceResponse) runBlocking$default;
        }
        if (interfaceC4466x9 != null) {
            ((C4493y9) interfaceC4466x9).a("IMResourceCacheManager", "Cache is not enabled for URL: " + url);
        }
        return null;
    }
}
