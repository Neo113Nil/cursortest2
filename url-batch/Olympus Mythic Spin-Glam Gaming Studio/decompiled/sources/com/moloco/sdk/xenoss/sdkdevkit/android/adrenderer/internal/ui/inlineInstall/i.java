package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.inlineInstall;

import androidx.compose.runtime.internal.StabilityInferred;
import com.moloco.sdk.acm.recorder.MetricsRecorder;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.r;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred
/* loaded from: classes14.dex */
public final class i {
    public static final int h = 8;
    public final boolean a;
    public final boolean b;
    public final boolean c;
    public final boolean d;

    @Nullable
    public final String e;

    @Nullable
    public final String f;

    @Nullable
    public final MetricsRecorder g;

    public i(boolean z, boolean z2, boolean z3, boolean z4, @Nullable String str, @Nullable String str2, @Nullable MetricsRecorder metricsRecorder) {
        this.a = z;
        this.b = z2;
        this.c = z3;
        this.d = z4;
        this.e = str;
        this.f = str2;
        this.g = metricsRecorder;
    }

    @NotNull
    public final k a(@NotNull r externalLinkHandler, @Nullable g gVar) {
        Intrinsics.checkNotNullParameter(externalLinkHandler, "externalLinkHandler");
        return ((this.a || this.c || this.b) && gVar != null) ? new e(gVar, externalLinkHandler, this.a, this.b, this.c, this.d, this.e, this.f, this.g) : new f(externalLinkHandler);
    }
}
