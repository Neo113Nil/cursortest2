package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.networktasks.internal.NetworkTask;

/* loaded from: classes6.dex */
public final class Co implements NetworkTask.ShouldTryNextHostCondition {
    @Override // io.appmetrica.analytics.networktasks.internal.NetworkTask.ShouldTryNextHostCondition
    public final boolean shouldTryNextHost(int i) {
        return !(i == 400);
    }
}
