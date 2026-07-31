package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer;

import android.webkit.JavascriptInterface;
import androidx.compose.runtime.internal.StabilityInferred;
import com.moloco.sdk.BuildConfig;
import com.moloco.sdk.internal.MolocoLogger;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.events.handlers.e;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@StabilityInferred
/* loaded from: classes10.dex */
public final class a {

    @NotNull
    public static final C1605a b = new C1605a(null);
    public static final int c = 8;

    @NotNull
    public static final String d = "TemplateJavascript";

    @NotNull
    public final e a;

    /* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.a$a, reason: collision with other inner class name */
    public static final class C1605a {
        public /* synthetic */ C1605a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public C1605a() {
        }
    }

    public a(@NotNull e eventHandler) {
        Intrinsics.checkNotNullParameter(eventHandler, "eventHandler");
        this.a = eventHandler;
    }

    @JavascriptInterface
    public final void log(@NotNull String message) {
        Intrinsics.checkNotNullParameter(message, "message");
        MolocoLogger.info$default(MolocoLogger.INSTANCE, d, message, null, false, 12, null);
    }

    @JavascriptInterface
    public final void onEvent(@NotNull String event) {
        Intrinsics.checkNotNullParameter(event, "event");
        this.a.a(event);
    }

    @JavascriptInterface
    @NotNull
    public final String sdkVersion() {
        return BuildConfig.SDK_VERSION_NAME;
    }
}
