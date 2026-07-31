package com.ironsource;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes12.dex */
public final class J4 extends Wg {

    @NotNull
    private final Wc d;

    @NotNull
    private final Qg e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public J4(@NotNull V0 adTools, @NotNull Wc outcomeReporter, @NotNull Qg waterfallInstances) {
        super(adTools, outcomeReporter);
        Intrinsics.checkNotNullParameter(adTools, "adTools");
        Intrinsics.checkNotNullParameter(outcomeReporter, "outcomeReporter");
        Intrinsics.checkNotNullParameter(waterfallInstances, "waterfallInstances");
        this.d = outcomeReporter;
        this.e = waterfallInstances;
    }

    @Override // com.ironsource.Wg
    public void a() {
    }

    @Override // com.ironsource.Wg
    public void a(@NotNull B instance) {
        Intrinsics.checkNotNullParameter(instance, "instance");
    }

    @Override // com.ironsource.Wg
    public void b(@NotNull B instance) {
        Intrinsics.checkNotNullParameter(instance, "instance");
        this.d.a(this.e.b(), instance);
    }

    @Override // com.ironsource.Wg
    public void c(@NotNull B instanceToShow) {
        Intrinsics.checkNotNullParameter(instanceToShow, "instanceToShow");
    }
}
