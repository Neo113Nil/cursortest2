package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.control.DataSendingRestrictionController;
import io.appmetrica.analytics.coreapi.internal.io.IExecutionPolicy;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes6.dex */
public final class Ci implements IExecutionPolicy {
    public final DataSendingRestrictionController a;
    public final String b = "data restriction based";

    public Ci(@NotNull DataSendingRestrictionController dataSendingRestrictionController) {
        this.a = dataSendingRestrictionController;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.io.IExecutionPolicy
    public final boolean canBeExecuted() {
        return !this.a.isRestrictedForSdk();
    }

    @Override // io.appmetrica.analytics.coreapi.internal.io.IExecutionPolicy
    @NotNull
    public final String description() {
        return this.b;
    }
}
