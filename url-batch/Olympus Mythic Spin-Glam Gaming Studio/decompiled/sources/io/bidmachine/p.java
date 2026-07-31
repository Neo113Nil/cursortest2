package io.bidmachine;

import io.bidmachine.utils.task.BackgroundTaskManager;
import io.bidmachine.utils.task.TaskManager;

/* loaded from: classes5.dex */
abstract class p {
    private static volatile TaskManager a;

    public static TaskManager a() {
        TaskManager taskManager = a;
        if (taskManager == null) {
            synchronized (p.class) {
                try {
                    taskManager = a;
                    if (taskManager == null) {
                        taskManager = new BackgroundTaskManager();
                        a = taskManager;
                    }
                } finally {
                }
            }
        }
        return taskManager;
    }
}
