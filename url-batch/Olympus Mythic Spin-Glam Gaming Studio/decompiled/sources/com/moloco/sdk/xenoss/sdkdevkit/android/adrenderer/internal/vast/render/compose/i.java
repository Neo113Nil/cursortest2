package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose;

import android.content.Context;
import androidx.lifecycle.Lifecycle;
import com.moloco.sdk.acm.recorder.MetricsRecorder;
import com.moloco.sdk.service_locator.a;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.Q;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.C;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes4.dex */
public final class i implements C.b {

    @NotNull
    public final Context a;
    public final boolean b;

    @NotNull
    public final Q c;

    public i(@NotNull Context context, boolean z, @NotNull Q viewVisibilityTracker) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(viewVisibilityTracker, "viewVisibilityTracker");
        this.a = context;
        this.b = z;
        this.c = viewVisibilityTracker;
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.C.b
    @NotNull
    public com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.e a(@NotNull Lifecycle lifecycle) {
        Intrinsics.checkNotNullParameter(lifecycle, "lifecycle");
        return new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.f(new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.c(this.a, this.b, a.g.a.a(), lifecycle, MetricsRecorder.INSTANCE.withNoMediation()), this.c);
    }
}
