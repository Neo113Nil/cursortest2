package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.events.handlers;

import androidx.compose.runtime.internal.StabilityInferred;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.r;
import java.util.Set;
import kotlin.collections.SetsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

@StabilityInferred
/* loaded from: classes5.dex */
public final class g implements com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.events.a {
    public static final int b = 8;

    @NotNull
    public final r a;

    public g(@NotNull r externalLinkHandler) {
        Intrinsics.checkNotNullParameter(externalLinkHandler, "externalLinkHandler");
        this.a = externalLinkHandler;
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.events.a
    @NotNull
    public Set<String> a() {
        return SetsKt.setOf("launchUrl");
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.events.a
    @NotNull
    public String b() {
        return "LaunchUrlHandler";
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.events.a
    public void a(@NotNull JSONObject event) {
        Intrinsics.checkNotNullParameter(event, "event");
        String string = event.getString("url");
        r rVar = this.a;
        Intrinsics.checkNotNull(string);
        rVar.a(string);
    }
}
