package org.chromium.base.task;

import java.util.concurrent.Executor;

/* loaded from: classes4.dex */
public interface TaskRunner extends Executor {
    void postDelayedTask(Runnable runnable, long j);
}
