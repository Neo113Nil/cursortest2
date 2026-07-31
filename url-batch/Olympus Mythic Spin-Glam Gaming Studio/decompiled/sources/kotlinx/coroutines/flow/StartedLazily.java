package kotlinx.coroutines.flow;

/* compiled from: SharingStarted.kt */
/* loaded from: classes8.dex */
final class StartedLazily implements SharingStarted {
    @Override // kotlinx.coroutines.flow.SharingStarted
    public Flow command(StateFlow stateFlow) {
        return FlowKt.flow(new StartedLazily$command$1(stateFlow, null));
    }

    public String toString() {
        return "SharingStarted.Lazily";
    }
}
