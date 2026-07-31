package com.ironsource;

import android.os.Handler;
import android.os.HandlerThread;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes10.dex */
public final class S9 extends HandlerThread {

    @Nullable
    private Handler a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public S9(@NotNull String name) {
        super(name);
        Intrinsics.checkNotNullParameter(name, "name");
    }

    public final void a(@NotNull Runnable task) {
        Intrinsics.checkNotNullParameter(task, "task");
        a(this, task, 0L, 2, null);
    }

    public final void b(@NotNull Runnable task) {
        Intrinsics.checkNotNullParameter(task, "task");
        Handler handler = this.a;
        if (handler != null) {
            handler.removeCallbacks(task);
        }
    }

    public static /* synthetic */ void a(S9 s9, Runnable runnable, long j, int i, Object obj) {
        if ((i & 2) != 0) {
            j = 0;
        }
        s9.a(runnable, j);
    }

    public final void a(@NotNull Runnable task, long j) {
        Intrinsics.checkNotNullParameter(task, "task");
        Handler handler = this.a;
        if (handler != null) {
            handler.postDelayed(task, j);
        }
    }

    public final void a() {
        this.a = new Handler(getLooper());
    }
}
