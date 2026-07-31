package org.chromium.base.task;

import org.chromium.base.ThreadUtils;

/* loaded from: classes12.dex */
public class UiThreadTaskRunnerImpl extends TaskRunnerImpl implements TaskRunner {
    public UiThreadTaskRunnerImpl(int i) {
        super(i, "UiThreadTaskRunner", 2);
    }

    @Override // org.chromium.base.task.TaskRunnerImpl
    protected void schedulePreNativeTask() {
        if (PostTask.canRunUiTaskBeforeNativeInit(this.mTaskTraits)) {
            ThreadUtils.getUiThreadHandler().post(this.mRunPreNativeTaskClosure);
        }
    }

    @Override // org.chromium.base.task.TaskRunnerImpl
    protected boolean schedulePreNativeDelayedTask(Runnable runnable, long j) {
        if (!PostTask.canRunUiTaskBeforeNativeInit(this.mTaskTraits)) {
            return false;
        }
        ThreadUtils.getUiThreadHandler().postDelayed(runnable, j);
        return true;
    }
}
