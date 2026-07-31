package com.ogury.ad.internal;

import java.util.regex.Pattern;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public class u1 extends z7 {
    public final Pattern a;
    public final String b;

    public u1(Pattern whitelistPattern) {
        Intrinsics.checkNotNullParameter(whitelistPattern, "whitelistPattern");
        this.a = whitelistPattern;
        this.b = whitelistPattern.pattern();
    }

    @Override // com.ogury.ad.internal.z7
    public final boolean b(String url) {
        Intrinsics.checkNotNullParameter(url, "url");
        String stringPattern = this.b;
        Intrinsics.checkNotNullExpressionValue(stringPattern, "stringPattern");
        return stringPattern.length() > 0 && !this.a.matcher(url).find();
    }
}
