package com.moloco.sdk.internal.services;

import android.content.Context;
import androidx.compose.runtime.internal.StabilityInferred;
import com.moloco.sdk.common_adapter_internal.ScreenData;
import kotlin.Deprecated;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@StabilityInferred
/* loaded from: classes15.dex */
public final class G implements F {
    public static final int b = 8;

    @NotNull
    public final Context a;

    public G(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.a = context;
    }

    @Override // com.moloco.sdk.internal.services.F
    @NotNull
    public E a() {
        ScreenData invoke = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.r.a(this.a).invoke();
        float widthDp = invoke.getWidthDp();
        return new E(invoke.getWidthPx(), widthDp, invoke.getHeightPx(), invoke.getHeightDp(), invoke.getPxRatio(), invoke.getDpi(), this.a.getResources().getDisplayMetrics().xdpi, this.a.getResources().getDisplayMetrics().ydpi);
    }

    @Override // com.moloco.sdk.internal.services.F
    @NotNull
    public H b() {
        int i = this.a.getResources().getConfiguration().orientation;
        return i != 1 ? i != 2 ? H.a : H.c : H.b;
    }

    @NotNull
    public final Context c() {
        return this.a;
    }

    @Override // com.moloco.sdk.internal.services.F
    @Deprecated
    @NotNull
    public E invoke() {
        return a();
    }
}
