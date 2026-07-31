package com.ironsource;

import com.ironsource.mediationsdk.logger.IronLog;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes10.dex */
public final class T7 implements P1 {
    @Override // com.ironsource.P1
    public void a(@NotNull InterfaceC4716ja observer) {
        Intrinsics.checkNotNullParameter(observer, "observer");
        IronLog.INTERNAL.verbose("Adding lifecycle event observer");
        com.ironsource.lifecycle.b.d().a(observer);
    }

    @Override // com.ironsource.P1
    public void b(@NotNull InterfaceC4716ja observer) {
        Intrinsics.checkNotNullParameter(observer, "observer");
        IronLog.INTERNAL.verbose("Removing lifecycle event observer");
        com.ironsource.lifecycle.b.d().b(observer);
    }
}
