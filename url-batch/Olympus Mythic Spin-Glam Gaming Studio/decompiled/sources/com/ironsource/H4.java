package com.ironsource;

import java.io.InputStream;
import java.net.URL;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes12.dex */
final class H4 implements Q3 {

    @NotNull
    public static final H4 a = new H4();

    private H4() {
    }

    @Override // com.ironsource.Q3
    @NotNull
    public InputStream a(@NotNull String url) {
        Intrinsics.checkNotNullParameter(url, "url");
        InputStream openStream = new URL(url).openStream();
        Intrinsics.checkNotNullExpressionValue(openStream, "URL(url).openStream()");
        return openStream;
    }
}
