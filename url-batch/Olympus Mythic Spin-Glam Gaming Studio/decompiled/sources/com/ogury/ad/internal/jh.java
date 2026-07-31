package com.ogury.ad.internal;

import java.util.Locale;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* loaded from: classes8.dex */
public abstract class jh {
    public static final String a(String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Locale US = Locale.US;
        Intrinsics.checkNotNullExpressionValue(US, "US");
        String lowerCase = str.toLowerCase(US);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
        String substring = str.substring(((StringsKt.startsWith$default(lowerCase, "http://ogymraid", false, 2, (Object) null) ? "http://ogymraid" : "https://ogymraid") + "/?q=").length());
        Intrinsics.checkNotNullExpressionValue(substring, "substring(...)");
        return substring;
    }
}
