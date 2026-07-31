package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.theme;

import androidx.compose.material.Typography;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.font.SystemFontFamily;
import androidx.compose.ui.unit.TextUnitKt;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes13.dex */
public final class e {

    @NotNull
    public static final Typography a;

    static {
        SystemFontFamily systemFontFamily = FontFamily.INSTANCE.getDefault();
        a = new Typography(null, null, null, null, null, null, null, null, null, new TextStyle(0L, TextUnitKt.getSp(16), FontWeight.INSTANCE.getNormal(), null, null, systemFontFamily, null, 0L, null, null, null, 0L, null, null, null, null, 0L, null, 262105, null), null, null, null, null, 15871, null);
    }

    @NotNull
    public static final Typography a() {
        return a;
    }
}
