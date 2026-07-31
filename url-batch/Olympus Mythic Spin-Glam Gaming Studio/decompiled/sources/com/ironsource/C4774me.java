package com.ironsource;

import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadFactory;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: com.ironsource.me, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C4774me extends ScheduledThreadPoolExecutor {
    /* JADX WARN: Multi-variable type inference failed */
    public C4774me() {
        this(0, null, 3, 0 == true ? 1 : 0);
    }

    @Override // java.util.concurrent.ThreadPoolExecutor
    protected void afterExecute(@Nullable Runnable runnable, @Nullable Throwable th) {
        super.afterExecute(runnable, th);
        if (th == null && (runnable instanceof Future) && ((Future) runnable).isDone()) {
            try {
                ((Future) runnable).get();
            } catch (InterruptedException e) {
                C4782n4.d().a(e);
                Thread.currentThread().interrupt();
            } catch (CancellationException e2) {
                C4782n4.d().a(e2);
            } catch (ExecutionException e3) {
                C4782n4.d().a(e3);
            }
        }
    }

    public /* synthetic */ C4774me(int i, ThreadFactory threadFactory, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? C4792ne.a : i, (i2 & 2) != 0 ? new ThreadFactoryC4645fa() : threadFactory);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4774me(int i, @NotNull ThreadFactory threadFactory) {
        super(i, threadFactory);
        Intrinsics.checkNotNullParameter(threadFactory, "threadFactory");
    }
}
