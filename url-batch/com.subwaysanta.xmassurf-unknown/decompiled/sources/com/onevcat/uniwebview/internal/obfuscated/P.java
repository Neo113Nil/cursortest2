package com.onevcat.uniwebview.internal.obfuscated;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class P extends U {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public P(String webViewName, String parameters) {
        super(webViewName, "ChannelMessage", parameters);
        Intrinsics.checkNotNullParameter(webViewName, "webViewName");
        Intrinsics.checkNotNullParameter(parameters, "parameters");
    }
}
