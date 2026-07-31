package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.webview;

import androidx.compose.runtime.internal.StabilityInferred;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.w;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;

@StabilityInferred
/* loaded from: classes4.dex */
public final class i implements h {
    public static final int d = 0;

    @NotNull
    public final j a;

    @NotNull
    public final f b;

    @NotNull
    public final g c;

    public i(@NotNull j localAssetLoader, @NotNull f contentEncoder, @NotNull g cssMarginHandler) {
        Intrinsics.checkNotNullParameter(localAssetLoader, "localAssetLoader");
        Intrinsics.checkNotNullParameter(contentEncoder, "contentEncoder");
        Intrinsics.checkNotNullParameter(cssMarginHandler, "cssMarginHandler");
        this.a = localAssetLoader;
        this.b = contentEncoder;
        this.c = cssMarginHandler;
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.webview.h
    @NotNull
    public String a(@NotNull String html) {
        Intrinsics.checkNotNullParameter(html, "html");
        String a = this.a.a(w.k);
        return StringsKt.trimIndent("\n            <script>" + this.a.a("mraid-bridge.js") + "</script>\n            <iframe id=\"adFrame\"\n                style=\"width:100vw; height:100vh; border:none;\"\n                src=\"data:text/html;base64," + this.b.a(StringsKt.replace$default(this.c.a(html), "<script src=\"mraid.js\"></script>", "<script>" + a + "</script>", false, 4, (Object) null)) + "\"\n                sandbox=\"allow-scripts allow-same-origin\"\n            >\n            </iframe>\n        ");
    }

    public /* synthetic */ i(j jVar, f fVar, g gVar, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(jVar, fVar, (i & 4) != 0 ? new g() : gVar);
    }
}
