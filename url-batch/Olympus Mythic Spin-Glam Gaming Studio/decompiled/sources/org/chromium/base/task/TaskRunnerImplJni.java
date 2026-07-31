package org.chromium.base.task;

import internal.org.jni_zero.GEN_JNI;
import internal.org.jni_zero.JniTestInstanceHolder;
import org.chromium.base.task.TaskRunnerImpl;

/* loaded from: classes4.dex */
class TaskRunnerImplJni implements TaskRunnerImpl.Natives {
    private static JniTestInstanceHolder sOverride;

    TaskRunnerImplJni() {
    }

    public static TaskRunnerImpl.Natives get() {
        Object obj;
        JniTestInstanceHolder jniTestInstanceHolder = sOverride;
        if (jniTestInstanceHolder != null && (obj = jniTestInstanceHolder.value) != null) {
            return (TaskRunnerImpl.Natives) obj;
        }
        return new TaskRunnerImplJni();
    }

    @Override // org.chromium.base.task.TaskRunnerImpl.Natives
    public void destroy(long j) {
        GEN_JNI.org_chromium_base_task_TaskRunnerImpl_destroy(j);
    }

    @Override // org.chromium.base.task.TaskRunnerImpl.Natives
    public long init(int i, int i2) {
        return GEN_JNI.org_chromium_base_task_TaskRunnerImpl_init(i, i2);
    }

    @Override // org.chromium.base.task.TaskRunnerImpl.Natives
    public void postDelayedTask(long j, long j2, int i) {
        GEN_JNI.org_chromium_base_task_TaskRunnerImpl_postDelayedTask(j, j2, i);
    }
}
