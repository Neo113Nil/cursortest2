package io.bidmachine.util.taskmanager;

import com.pubmatic.sdk.common.ctaoverlay.POBCTAOverlayData;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: TaskManager.kt */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0018\u0010\t\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u000bH&J \u0010\t\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000eH\u0016J\u0018\u0010\u000f\u001a\u00020\b2\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u000bH\u0016J \u0010\u000f\u001a\u00020\b2\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000eH\u0016ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0010À\u0006\u0001"}, d2 = {"Lio/bidmachine/util/taskmanager/TaskManager;", "", "cancel", "", "task", "Ljava/lang/Runnable;", "execute", "executeSafely", "", "schedule", "delayMs", "", POBCTAOverlayData.KEY_CTA_DELAY, "timeUnit", "Ljava/util/concurrent/TimeUnit;", "scheduleSafely", "bidmachine-android-sdk_bd_3_7_1"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes6.dex */
public interface TaskManager {
    void cancel(@NotNull Runnable task);

    void schedule(@NotNull Runnable task, long delayMs) throws Throwable;

    default void execute(@NotNull Runnable task) throws Throwable {
        Intrinsics.checkNotNullParameter(task, "task");
        schedule(task, 0L);
    }

    default boolean executeSafely(@NotNull Runnable task) {
        Boolean bool;
        Intrinsics.checkNotNullParameter(task, "task");
        try {
            execute(task);
            bool = Boolean.TRUE;
        } catch (Throwable unused) {
            bool = null;
        }
        return Intrinsics.areEqual(bool, Boolean.TRUE);
    }

    default boolean scheduleSafely(@NotNull Runnable task, long delayMs) {
        Boolean bool;
        Intrinsics.checkNotNullParameter(task, "task");
        try {
            schedule(task, delayMs);
            bool = Boolean.TRUE;
        } catch (Throwable unused) {
            bool = null;
        }
        return Intrinsics.areEqual(bool, Boolean.TRUE);
    }

    default void schedule(@NotNull Runnable task, long delay, @NotNull TimeUnit timeUnit) throws Throwable {
        Intrinsics.checkNotNullParameter(task, "task");
        Intrinsics.checkNotNullParameter(timeUnit, "timeUnit");
        schedule(task, timeUnit.toMillis(delay));
    }

    default boolean scheduleSafely(@NotNull Runnable task, long delay, @NotNull TimeUnit timeUnit) {
        Boolean bool;
        Intrinsics.checkNotNullParameter(task, "task");
        Intrinsics.checkNotNullParameter(timeUnit, "timeUnit");
        try {
            schedule(task, delay, timeUnit);
            bool = Boolean.TRUE;
        } catch (Throwable unused) {
            bool = null;
        }
        return Intrinsics.areEqual(bool, Boolean.TRUE);
    }
}
