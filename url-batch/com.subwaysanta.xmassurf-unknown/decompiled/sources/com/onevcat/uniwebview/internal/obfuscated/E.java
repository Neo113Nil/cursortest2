package com.onevcat.uniwebview.internal.obfuscated;

import android.webkit.JavascriptInterface;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class E {
    public final C0059o0 a;

    public E(C0059o0 downloader) {
        Intrinsics.checkNotNullParameter(downloader, "downloader");
        this.a = downloader;
    }

    @JavascriptInterface
    public final void handleDataURI(String dataURI) {
        Intrinsics.checkNotNullParameter(dataURI, "dataURI");
        C0058o c0058o = C0058o.b;
        c0058o.a(EnumC0054n.INFO, AbstractC0018e.a("Received blob fetching result. uri: ", dataURI, c0058o, "message"));
        this.a.a(dataURI, null, null, true);
    }
}
