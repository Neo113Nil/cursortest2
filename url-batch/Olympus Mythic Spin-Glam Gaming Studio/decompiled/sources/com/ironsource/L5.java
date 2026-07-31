package com.ironsource;

import com.ironsource.environment.thread.IronSourceThreadManager;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes12.dex */
final class L5 implements InterfaceC4722jg {
    @Override // com.ironsource.InterfaceC4722jg
    public void a(@NotNull Runnable task) {
        Intrinsics.checkNotNullParameter(task, "task");
        IronSourceThreadManager.INSTANCE.getLevelPlayThread().submit(task);
    }

    @Override // com.ironsource.InterfaceC4722jg
    public boolean a() {
        return IronSourceThreadManager.INSTANCE.getLevelPlayThread().a();
    }
}
