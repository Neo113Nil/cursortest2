package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer;

import android.view.View;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.Q;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;

/* loaded from: classes5.dex */
public final class g {
    public static final Flow b(Q q, View view) {
        Flow a;
        return (view == null || (a = q.a(view)) == null) ? FlowKt.flowOf(Boolean.FALSE) : a;
    }
}
