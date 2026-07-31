package com.ogury.ad.internal;

import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* loaded from: classes6.dex */
public final class y1 {
    public String a = "";
    public int b = -1;

    public final void a(y7 webView) {
        Intrinsics.checkNotNullParameter(webView, "webView");
        if (this.a.length() == 0) {
            String userAgentString = webView.getSettings().getUserAgentString();
            Intrinsics.checkNotNullExpressionValue(userAgentString, "getUserAgentString(...)");
            this.a = userAgentString;
            int indexOf = StringsKt.indexOf((CharSequence) userAgentString, "chrome/", 0, true);
            if (indexOf == -1) {
                return;
            }
            try {
                String substring = this.a.substring(indexOf + 7, indexOf + 9);
                Intrinsics.checkNotNullExpressionValue(substring, "substring(...)");
                this.b = Integer.parseInt(substring);
            } catch (Throwable th) {
                oh.a(th);
            }
        }
    }
}
