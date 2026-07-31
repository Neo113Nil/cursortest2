package com.inmobi.media;

import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.SharedFlowKt;

/* renamed from: com.inmobi.media.ao, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C3875ao {
    public final Ng a;
    public final C3927co b;
    public final MutableSharedFlow c;
    public final C3901bo d;
    public Job e;

    public C3875ao(Ng visibilityTracker, C3927co viewabilityTrackerConfig) {
        Intrinsics.checkNotNullParameter(visibilityTracker, "visibilityTracker");
        Intrinsics.checkNotNullParameter(viewabilityTrackerConfig, "viewabilityTrackerConfig");
        this.a = visibilityTracker;
        this.b = viewabilityTrackerConfig;
        this.c = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 6, null);
        this.d = new C3901bo();
    }
}
