package kotlinx.coroutines.flow;

import androidx.compose.animation.core.MutatorMutex$$ExternalSyntheticBackportWithForwarding0;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.flow.internal.AbstractSharedFlowKt;
import kotlinx.coroutines.flow.internal.AbstractSharedFlowSlot;
import kotlinx.coroutines.internal.Concurrent_commonKt;
import kotlinx.coroutines.internal.Symbol;

/* compiled from: StateFlow.kt */
/* loaded from: classes6.dex */
final class StateFlowSlot extends AbstractSharedFlowSlot {
    private final AtomicReference _state = new AtomicReference(null);

    @Override // kotlinx.coroutines.flow.internal.AbstractSharedFlowSlot
    public boolean allocateLocked(StateFlowImpl stateFlowImpl) {
        Symbol symbol;
        if (Concurrent_commonKt.getValue(this._state) != null) {
            return false;
        }
        AtomicReference atomicReference = this._state;
        symbol = StateFlowKt.NONE;
        Concurrent_commonKt.setValue(atomicReference, symbol);
        return true;
    }

    @Override // kotlinx.coroutines.flow.internal.AbstractSharedFlowSlot
    public Continuation[] freeLocked(StateFlowImpl stateFlowImpl) {
        Concurrent_commonKt.setValue(this._state, null);
        return AbstractSharedFlowKt.EMPTY_RESUMES;
    }

    public final void makePending() {
        Symbol symbol;
        Symbol symbol2;
        Symbol symbol3;
        Symbol symbol4;
        AtomicReference atomicReference = this._state;
        while (true) {
            Object value = Concurrent_commonKt.getValue(atomicReference);
            if (value == null) {
                return;
            }
            symbol = StateFlowKt.PENDING;
            if (value == symbol) {
                return;
            }
            symbol2 = StateFlowKt.NONE;
            if (value == symbol2) {
                AtomicReference atomicReference2 = this._state;
                symbol3 = StateFlowKt.PENDING;
                if (MutatorMutex$$ExternalSyntheticBackportWithForwarding0.m(atomicReference2, value, symbol3)) {
                    return;
                }
            } else {
                AtomicReference atomicReference3 = this._state;
                symbol4 = StateFlowKt.NONE;
                if (MutatorMutex$$ExternalSyntheticBackportWithForwarding0.m(atomicReference3, value, symbol4)) {
                    Result.Companion companion = Result.INSTANCE;
                    ((CancellableContinuationImpl) value).resumeWith(Result.m8023constructorimpl(Unit.INSTANCE));
                    return;
                }
            }
        }
    }

    public final boolean takePending() {
        Symbol symbol;
        Symbol symbol2;
        AtomicReference atomicReference = this._state;
        symbol = StateFlowKt.NONE;
        Object andSet = atomicReference.getAndSet(symbol);
        Intrinsics.checkNotNull(andSet);
        symbol2 = StateFlowKt.PENDING;
        return andSet == symbol2;
    }

    public final Object awaitPending(Continuation continuation) {
        Symbol symbol;
        CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(IntrinsicsKt.intercepted(continuation), 1);
        cancellableContinuationImpl.initCancellability();
        AtomicReference atomicReference = this._state;
        symbol = StateFlowKt.NONE;
        if (!MutatorMutex$$ExternalSyntheticBackportWithForwarding0.m(atomicReference, symbol, cancellableContinuationImpl)) {
            Result.Companion companion = Result.INSTANCE;
            cancellableContinuationImpl.resumeWith(Result.m8023constructorimpl(Unit.INSTANCE));
        }
        Object result = cancellableContinuationImpl.getResult();
        if (result == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return result == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? result : Unit.INSTANCE;
    }
}
