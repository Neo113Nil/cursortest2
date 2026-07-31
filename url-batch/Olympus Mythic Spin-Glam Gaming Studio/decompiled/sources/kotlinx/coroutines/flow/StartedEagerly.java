package kotlinx.coroutines.flow;

/* compiled from: SharingStarted.kt */
/* loaded from: classes14.dex */
final class StartedEagerly implements SharingStarted {
    @Override // kotlinx.coroutines.flow.SharingStarted
    public Flow command(StateFlow stateFlow) {
        return FlowKt.flowOf(SharingCommand.START);
    }

    public String toString() {
        return "SharingStarted.Eagerly";
    }
}
