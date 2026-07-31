package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer;

import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.StabilityInferred;
import com.moloco.sdk.internal.ortb.model.C5019a;
import com.moloco.sdk.internal.ortb.model.C5020b;
import kotlin.jvm.functions.Function10;
import kotlin.jvm.functions.Function11;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred
/* loaded from: classes9.dex */
public final class f implements c {
    public static final int g = 0;
    public final int a;

    @NotNull
    public final Function10 b;
    public final int c;

    @NotNull
    public final Function2 d;

    @Nullable
    public final C5019a e;

    @Nullable
    public final C5020b f;

    public static final class a implements Function2 {
        public static final a a = new a();

        @Composable
        public final Function11 a(Composer composer, int i) {
            composer.startReplaceableGroup(48977993);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(48977993, i, -1, "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.AdWebViewOptions.<init>.<anonymous> (AdRenderingOptions.kt:27)");
            }
            Function11 a2 = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.s.a(null, null, 0L, 0L, 0L, null, null, null, composer, 0, 255);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            composer.endReplaceableGroup();
            return a2;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return a((Composer) obj, ((Number) obj2).intValue());
        }
    }

    public f() {
        this(0, null, 0, null, null, null, 63, null);
    }

    @NotNull
    public final Function10 a() {
        return this.b;
    }

    @Nullable
    public final C5019a b() {
        return this.e;
    }

    @Nullable
    public final C5020b c() {
        return this.f;
    }

    public final int d() {
        return this.a;
    }

    @NotNull
    public final Function2 e() {
        return this.d;
    }

    public final int f() {
        return this.c;
    }

    public f(int i, @NotNull Function10 adWebViewRenderer, int i2, @NotNull Function2 decClose, @Nullable C5019a c5019a, @Nullable C5020b c5020b) {
        Intrinsics.checkNotNullParameter(adWebViewRenderer, "adWebViewRenderer");
        Intrinsics.checkNotNullParameter(decClose, "decClose");
        this.a = i;
        this.b = adWebViewRenderer;
        this.c = i2;
        this.d = decClose;
        this.e = c5019a;
        this.f = c5020b;
    }

    public /* synthetic */ f(int i, Function10 function10, int i2, Function2 function2, C5019a c5019a, C5020b c5020b, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? 5 : i, (i3 & 2) != 0 ? com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.webview.b.a(0L, null, 3, null) : function10, (i3 & 4) == 0 ? i2 : 5, (i3 & 8) != 0 ? a.a : function2, (i3 & 16) != 0 ? null : c5019a, (i3 & 32) != 0 ? null : c5020b);
    }
}
