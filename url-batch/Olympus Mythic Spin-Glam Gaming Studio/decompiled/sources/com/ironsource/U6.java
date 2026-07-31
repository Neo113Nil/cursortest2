package com.ironsource;

import android.os.Handler;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes10.dex */
final class U6 implements InterfaceC4722jg {

    @NotNull
    private final Handler a;

    public U6(@NotNull Handler handler) {
        Intrinsics.checkNotNullParameter(handler, "handler");
        this.a = handler;
    }

    @Override // com.ironsource.InterfaceC4722jg
    public void a(@NotNull Runnable task) {
        Intrinsics.checkNotNullParameter(task, "task");
        this.a.post(task);
    }

    @Override // com.ironsource.InterfaceC4722jg
    public boolean a() {
        return Thread.currentThread() == this.a.getLooper().getThread();
    }
}
