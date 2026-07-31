package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.theme;

import androidx.compose.foundation.DarkThemeKt;
import androidx.compose.material.Colors;
import androidx.compose.material.ColorsKt;
import androidx.compose.material.MaterialThemeKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableInferredTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes13.dex */
public final class d {

    @NotNull
    public static final Colors a;

    @NotNull
    public static final Colors b;

    static {
        Colors m817lightColors2qZNXz8;
        long f = a.f();
        long f2 = a.f();
        Color.Companion companion = Color.INSTANCE;
        a = ColorsKt.m816darkColors2qZNXz8$default(f, f2, companion.m1462getWhite0d7_KjU(), 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 4088, null);
        m817lightColors2qZNXz8 = ColorsKt.m817lightColors2qZNXz8((r43 & 1) != 0 ? ColorKt.Color(4284612846L) : a.f(), (r43 & 2) != 0 ? ColorKt.Color(4281794739L) : a.f(), (r43 & 4) != 0 ? ColorKt.Color(4278442694L) : companion.m1462getWhite0d7_KjU(), (r43 & 8) != 0 ? ColorKt.Color(4278290310L) : 0L, (r43 & 16) != 0 ? Color.INSTANCE.m1462getWhite0d7_KjU() : 0L, (r43 & 32) != 0 ? Color.INSTANCE.m1462getWhite0d7_KjU() : 0L, (r43 & 64) != 0 ? ColorKt.Color(4289724448L) : 0L, (r43 & 128) != 0 ? Color.INSTANCE.m1462getWhite0d7_KjU() : 0L, (r43 & 256) != 0 ? Color.INSTANCE.m1456getBlack0d7_KjU() : 0L, (r43 & 512) != 0 ? Color.INSTANCE.m1456getBlack0d7_KjU() : 0L, (r43 & 1024) != 0 ? Color.INSTANCE.m1456getBlack0d7_KjU() : 0L, (r43 & 2048) != 0 ? Color.INSTANCE.m1462getWhite0d7_KjU() : 0L);
        b = m817lightColors2qZNXz8;
    }

    public static final Unit a(boolean z, Function2 function2, int i, int i2, Composer composer, int i3) {
        a(z, function2, composer, i | 1, i2);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x005b, code lost:
    
        if ((r12 & 1) != 0) goto L35;
     */
    @Composable
    @ComposableInferredTarget
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void a(final boolean z, @NotNull final Function2 content, @Nullable Composer composer, final int i, final int i2) {
        int i3;
        Intrinsics.checkNotNullParameter(content, "content");
        Composer startRestartGroup = composer.startRestartGroup(156854067);
        if ((i & 6) == 0) {
            i3 = (((i2 & 1) == 0 && startRestartGroup.changed(z)) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= startRestartGroup.changed(content) ? 32 : 16;
        }
        if ((i3 & 19) == 18 && startRestartGroup.getSkipping()) {
            startRestartGroup.skipToGroupEnd();
        } else {
            startRestartGroup.startDefaults();
            if ((i & 1) == 0 || startRestartGroup.getDefaultsInvalid()) {
                if ((i2 & 1) != 0) {
                    z = DarkThemeKt.isSystemInDarkTheme(startRestartGroup, 0);
                    i3 &= -15;
                }
                startRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(156854067, i3, -1, "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.theme.Theme (Theme.kt:31)");
                }
                MaterialThemeKt.MaterialTheme(z ? a : b, e.a(), c.a(), content, startRestartGroup, ((i3 << 6) & 7168) | 432, 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            } else {
                startRestartGroup.skipToGroupEnd();
            }
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.theme.d$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return d.a(z, content, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
