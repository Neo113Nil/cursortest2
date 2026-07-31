package kotlinx.coroutines.scheduling;

import kotlinx.coroutines.DebugStringsKt;

/* compiled from: Tasks.kt */
/* loaded from: classes11.dex */
final class TaskImpl extends Task {
    public final Runnable block;

    public TaskImpl(Runnable runnable, long j, boolean z) {
        super(j, z);
        this.block = runnable;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.block.run();
    }

    public String toString() {
        String taskContextString;
        StringBuilder sb = new StringBuilder();
        sb.append("Task[");
        sb.append(DebugStringsKt.getClassSimpleName(this.block));
        sb.append('@');
        sb.append(DebugStringsKt.getHexAddress(this.block));
        sb.append(", ");
        sb.append(this.submissionTime);
        sb.append(", ");
        taskContextString = TasksKt.taskContextString(this.taskContext);
        sb.append(taskContextString);
        sb.append(']');
        return sb.toString();
    }
}
