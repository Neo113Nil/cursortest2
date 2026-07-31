package com.ironsource;

import android.os.Handler;
import android.os.HandlerThread;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes13.dex */
final class A5 extends HandlerThread {

    @Nullable
    private Handler a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public A5(@NotNull String name) {
        super(name);
        Intrinsics.checkNotNullParameter(name, "name");
    }

    public final void a(@NotNull Runnable task) {
        Intrinsics.checkNotNullParameter(task, "task");
        Handler handler = this.a;
        if (handler != null) {
            handler.post(task);
        }
    }

    public final void a() {
        this.a = new Handler(getLooper());
    }
}
