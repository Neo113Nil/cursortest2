package com.ironsource;

import com.ironsource.If;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes11.dex */
public final class M5 implements If {

    @NotNull
    private final ScheduledExecutorService a;

    public M5(@NotNull ScheduledExecutorService executor) {
        Intrinsics.checkNotNullParameter(executor, "executor");
        this.a = executor;
    }

    @Override // com.ironsource.If
    @NotNull
    public If.a a(long j, @NotNull Runnable runnable) {
        Intrinsics.checkNotNullParameter(runnable, "runnable");
        final ScheduledFuture<?> schedule = this.a.schedule(runnable, j, TimeUnit.MILLISECONDS);
        return new If.a() { // from class: com.ironsource.M5$$ExternalSyntheticLambda0
            @Override // com.ironsource.If.a
            public final void cancel() {
                M5.a(schedule);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(ScheduledFuture scheduledFuture) {
        scheduledFuture.cancel(false);
    }
}
