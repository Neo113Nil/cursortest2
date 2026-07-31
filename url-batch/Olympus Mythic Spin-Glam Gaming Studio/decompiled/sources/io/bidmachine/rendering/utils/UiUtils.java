package io.bidmachine.rendering.utils;

import androidx.annotation.NonNull;
import io.bidmachine.rendering.utils.taskmanager.TaskManager;
import io.bidmachine.rendering.utils.taskmanager.UITaskManager;

/* loaded from: classes12.dex */
public class UiUtils {
    private static final TaskManager a = new UITaskManager();

    public static void cancelOnUiThread(@NonNull Runnable runnable) {
        a.cancel(runnable);
    }

    public static void onUiThread(@NonNull Runnable runnable) {
        a.execute(runnable);
    }

    @NonNull
    public static String toString(int i) {
        return i != 0 ? i != 4 ? i != 8 ? "unknown" : "GONE" : "INVISIBLE" : "VISIBLE";
    }

    public static void onUiThread(@NonNull Runnable runnable, long j) {
        a.schedule(runnable, j);
    }
}
