package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.servicecomponents.ServiceComponentModuleReporter;
import io.appmetrica.analytics.coreapi.internal.servicecomponents.ServiceModuleCounterReport;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* renamed from: io.appmetrica.analytics.impl.rk, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C5651rk implements ServiceComponentModuleReporter {
    public final C5532n5 a;
    public final Kk b;

    public C5651rk(@NotNull C5532n5 c5532n5, @NotNull Kk kk) {
        this.a = c5532n5;
        this.b = kk;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.servicecomponents.ServiceComponentModuleReporter
    public final void handleReport(@NotNull ServiceModuleCounterReport serviceModuleCounterReport) {
        this.b.getClass();
        this.a.a(Kk.a(serviceModuleCounterReport));
    }

    public /* synthetic */ C5651rk(C5532n5 c5532n5, Kk kk, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(c5532n5, (i & 2) != 0 ? new Kk() : kk);
    }
}
