package com.ogury.ad.internal;

import android.webkit.WebResourceResponse;
import com.pubmatic.sdk.common.POBCommonConstants;
import java.io.ByteArrayInputStream;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;

/* loaded from: classes6.dex */
public final class u7 {
    public static final u7 a = new u7();

    public static WebResourceResponse a(String str, String str2) {
        byte[] bytes = ("javascript:" + str2 + str).getBytes(Charsets.UTF_8);
        Intrinsics.checkNotNullExpressionValue(bytes, "getBytes(...)");
        return new WebResourceResponse(POBCommonConstants.CONTENT_TYPE_JAVASCRIPT, "UTF-8", new ByteArrayInputStream(bytes));
    }
}
