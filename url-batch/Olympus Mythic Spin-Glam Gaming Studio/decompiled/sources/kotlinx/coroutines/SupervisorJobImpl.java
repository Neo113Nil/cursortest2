package kotlinx.coroutines;

/* compiled from: Supervisor.kt */
/* loaded from: classes5.dex */
final class SupervisorJobImpl extends JobImpl {
    @Override // kotlinx.coroutines.JobSupport
    public boolean childCancelled(Throwable th) {
        return false;
    }

    public SupervisorJobImpl(Job job) {
        super(job);
    }
}
