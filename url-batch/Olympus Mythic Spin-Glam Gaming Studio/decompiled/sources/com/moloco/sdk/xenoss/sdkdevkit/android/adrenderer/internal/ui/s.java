package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui;

import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.material.MaterialTheme;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.res.PainterResources_androidKt;
import com.moloco.sdk.R;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.q;
import com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function11;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes14.dex */
public final class s {
    @Composable
    @NotNull
    public static final Function11 a(@Nullable Alignment alignment, @Nullable PaddingValues paddingValues, long j, long j2, long j3, @Nullable q qVar, @Nullable Function0 function0, @Nullable com.moloco.sdk.internal.ortb.model.k kVar, @Nullable Composer composer, int i, int i2) {
        composer.startReplaceableGroup(-992573618);
        Alignment topEnd = (i2 & 1) != 0 ? Alignment.INSTANCE.getTopEnd() : alignment;
        PaddingValues m329PaddingValues0680j_4 = (i2 & 2) != 0 ? PaddingKt.m329PaddingValues0680j_4(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.utils.a.a()) : paddingValues;
        long m796getPrimary0d7_KjU = (i2 & 4) != 0 ? MaterialTheme.INSTANCE.getColors(composer, MaterialTheme.$stable).m796getPrimary0d7_KjU() : j;
        long b = (i2 & 8) != 0 ? com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.utils.a.b() : j2;
        long d = (i2 & 16) != 0 ? com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.utils.a.d() : j3;
        q a = (i2 & 32) != 0 ? a(null, 0L, null, 0L, composer, 0, 15) : qVar;
        Function0 function02 = (i2 & 64) != 0 ? null : function0;
        com.moloco.sdk.internal.ortb.model.k kVar2 = (i2 & 128) == 0 ? kVar : null;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-992573618, i, -1, "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.defaultAdCloseCountdownButton (DefaultAdCloseCountdownButton.kt:31)");
        }
        int i3 = i << 3;
        Function11 a2 = d.a(topEnd, m329PaddingValues0680j_4, m796getPrimary0d7_KjU, b, d, a, a.AbstractC1677a.c.EnumC1679a.b, function02, kVar2, composer, (i & 14) | 1572864 | (i & 112) | (i & 896) | (i & 7168) | (57344 & i) | (458752 & i) | (29360128 & i3) | (i3 & 234881024));
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return a2;
    }

    @Composable
    @NotNull
    public static final q a(@Nullable Painter painter, long j, @Nullable Shape shape, long j2, @Nullable Composer composer, int i, int i2) {
        composer.startReplaceableGroup(571957227);
        Painter painterResource = (i2 & 1) != 0 ? PainterResources_androidKt.painterResource(R.drawable.ic_round_close_24, composer, 0) : painter;
        long b = (i2 & 2) != 0 ? com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.utils.a.b() : j;
        Shape f = (i2 & 4) != 0 ? com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.utils.a.f() : shape;
        long e = (i2 & 8) != 0 ? com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.utils.a.e() : j2;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(571957227, i, -1, "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.adCloseAfterCountdownIcon (DefaultAdCloseCountdownButton.kt:49)");
        }
        q.b bVar = new q.b(painterResource, "Close", b, f, e, null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return bVar;
    }
}
