package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.utils;

import androidx.compose.foundation.shape.RoundedCornerShape;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.DpKt;
import androidx.compose.ui.unit.TextUnit;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes6.dex */
public final class a {
    public static final float a;
    public static final float b;
    public static final long c;
    public static final long d;
    public static final long e;

    @NotNull
    public static final RoundedCornerShape f;

    @NotNull
    public static final RoundedCornerShape g;

    static {
        float m2507constructorimpl = Dp.m2507constructorimpl(24);
        a = m2507constructorimpl;
        b = Dp.m2507constructorimpl(4);
        c = TextUnit.INSTANCE.m2583getUnspecifiedXSAIIZE();
        d = DpKt.m2517DpSizeYgX7TsA(m2507constructorimpl, m2507constructorimpl);
        e = Color.m1445copywmQWz5c$default(Color.INSTANCE.m1458getGray0d7_KjU(), 0.2f, 0.0f, 0.0f, 0.0f, 14, null);
        f = RoundedCornerShapeKt.getCircleShape();
        g = RoundedCornerShapeKt.m510RoundedCornerShape0680j_4(Dp.m2507constructorimpl(8));
    }

    public static final float a() {
        return b;
    }

    public static final long b() {
        return d;
    }

    public static final float c() {
        return a;
    }

    public static final long d() {
        return c;
    }

    public static final long e() {
        return e;
    }

    @NotNull
    public static final RoundedCornerShape f() {
        return f;
    }

    @NotNull
    public static final RoundedCornerShape g() {
        return g;
    }
}
