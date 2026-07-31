package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.webview;

import android.content.Context;
import androidx.compose.runtime.internal.StabilityInferred;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import kotlin.io.CloseableKt;
import kotlin.io.TextStreamsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import org.jetbrains.annotations.NotNull;

@StabilityInferred
/* loaded from: classes4.dex */
public final class c implements j {
    public static final int b = 8;

    @NotNull
    public final Context a;

    public c(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.a = context;
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.webview.j
    @NotNull
    public String a(@NotNull String fileName) {
        Intrinsics.checkNotNullParameter(fileName, "fileName");
        InputStream open = this.a.getAssets().open(fileName);
        Intrinsics.checkNotNullExpressionValue(open, "open(...)");
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(open, Charsets.UTF_8), 8192);
        try {
            String readText = TextStreamsKt.readText(bufferedReader);
            CloseableKt.closeFinally(bufferedReader, null);
            return readText;
        } finally {
        }
    }
}
