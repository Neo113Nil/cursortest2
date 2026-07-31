package com.ironsource;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: com.ironsource.zf, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public class C5012zf extends Wg {

    @NotNull
    private final Wc d;

    @NotNull
    private final Qg e;

    @NotNull
    private final H f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5012zf(@NotNull V0 adTools, @NotNull Wc outcomeReporter, @NotNull Qg waterfallInstances, @NotNull H adInstanceLoadStrategy) {
        super(adTools, outcomeReporter);
        Intrinsics.checkNotNullParameter(adTools, "adTools");
        Intrinsics.checkNotNullParameter(outcomeReporter, "outcomeReporter");
        Intrinsics.checkNotNullParameter(waterfallInstances, "waterfallInstances");
        Intrinsics.checkNotNullParameter(adInstanceLoadStrategy, "adInstanceLoadStrategy");
        this.d = outcomeReporter;
        this.e = waterfallInstances;
        this.f = adInstanceLoadStrategy;
    }

    @Override // com.ironsource.Wg
    public void a(@NotNull B instance) {
        B a;
        Intrinsics.checkNotNullParameter(instance, "instance");
        if (this.f.a(instance)) {
            this.d.a(this.e.b(), instance);
        } else {
            if (!this.f.a() || (a = this.f.c().a()) == null) {
                return;
            }
            this.d.a(this.e.b(), a);
        }
    }

    @Override // com.ironsource.Wg
    public void b(@NotNull B instance) {
        Intrinsics.checkNotNullParameter(instance, "instance");
    }

    @Override // com.ironsource.Wg
    public void c(@NotNull B instanceToShow) {
        Intrinsics.checkNotNullParameter(instanceToShow, "instanceToShow");
        this.d.a(this.e.b(), instanceToShow);
    }

    @Override // com.ironsource.Wg
    public void a() {
        B a = this.f.c().a();
        if (a != null) {
            this.d.a(this.e.b(), a);
        }
    }
}
