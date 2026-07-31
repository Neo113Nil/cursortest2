package kotlinx.coroutines;

/* compiled from: CancellableContinuation.kt */
/* loaded from: classes4.dex */
final class DisposeOnCancel implements CancelHandler {
    private final DisposableHandle handle;

    public DisposeOnCancel(DisposableHandle disposableHandle) {
        this.handle = disposableHandle;
    }

    @Override // kotlinx.coroutines.CancelHandler
    public void invoke(Throwable th) {
        this.handle.dispose();
    }

    public String toString() {
        return "DisposeOnCancel[" + this.handle + ']';
    }
}
