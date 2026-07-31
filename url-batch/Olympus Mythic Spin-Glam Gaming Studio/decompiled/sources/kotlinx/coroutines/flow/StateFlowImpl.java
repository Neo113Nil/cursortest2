package kotlinx.coroutines.flow;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.internal.AbstractSharedFlow;
import kotlinx.coroutines.flow.internal.AbstractSharedFlowSlot;
import kotlinx.coroutines.flow.internal.FusibleFlow;
import kotlinx.coroutines.flow.internal.NullSurrogateKt;
import kotlinx.coroutines.internal.Symbol;

/* compiled from: StateFlow.kt */
/* loaded from: classes5.dex */
final class StateFlowImpl extends AbstractSharedFlow implements MutableStateFlow, CancellableFlow, FusibleFlow {
    private static final /* synthetic */ AtomicReferenceFieldUpdater _state$volatile$FU = AtomicReferenceFieldUpdater.newUpdater(StateFlowImpl.class, Object.class, "_state$volatile");
    private volatile /* synthetic */ Object _state$volatile;
    private int sequence;

    private final boolean updateState(Object obj, Object obj2) {
        int i;
        AbstractSharedFlowSlot[] slots;
        synchronized (this) {
            Object obj3 = _state$volatile$FU.get(this);
            if (obj != null && !Intrinsics.areEqual(obj3, obj)) {
                return false;
            }
            if (Intrinsics.areEqual(obj3, obj2)) {
                return true;
            }
            _state$volatile$FU.set(this, obj2);
            int i2 = this.sequence;
            if ((i2 & 1) != 0) {
                this.sequence = i2 + 2;
                return true;
            }
            int i3 = i2 + 1;
            this.sequence = i3;
            AbstractSharedFlowSlot[] slots2 = getSlots();
            Unit unit = Unit.INSTANCE;
            while (true) {
                StateFlowSlot[] stateFlowSlotArr = (StateFlowSlot[]) slots2;
                if (stateFlowSlotArr != null) {
                    for (StateFlowSlot stateFlowSlot : stateFlowSlotArr) {
                        if (stateFlowSlot != null) {
                            stateFlowSlot.makePending();
                        }
                    }
                }
                synchronized (this) {
                    i = this.sequence;
                    if (i == i3) {
                        this.sequence = i3 + 1;
                        return true;
                    }
                    slots = getSlots();
                    Unit unit2 = Unit.INSTANCE;
                }
                slots2 = slots;
                i3 = i;
            }
        }
    }

    public StateFlowImpl(Object obj) {
        this._state$volatile = obj;
    }

    @Override // kotlinx.coroutines.flow.MutableStateFlow, kotlinx.coroutines.flow.StateFlow
    public Object getValue() {
        Symbol symbol = NullSurrogateKt.NULL;
        Object obj = _state$volatile$FU.get(this);
        if (obj == symbol) {
            return null;
        }
        return obj;
    }

    @Override // kotlinx.coroutines.flow.MutableStateFlow
    public void setValue(Object obj) {
        if (obj == null) {
            obj = NullSurrogateKt.NULL;
        }
        updateState(null, obj);
    }

    @Override // kotlinx.coroutines.flow.MutableStateFlow
    public boolean compareAndSet(Object obj, Object obj2) {
        if (obj == null) {
            obj = NullSurrogateKt.NULL;
        }
        if (obj2 == null) {
            obj2 = NullSurrogateKt.NULL;
        }
        return updateState(obj, obj2);
    }

    @Override // kotlinx.coroutines.flow.MutableSharedFlow
    public boolean tryEmit(Object obj) {
        setValue(obj);
        return true;
    }

    @Override // kotlinx.coroutines.flow.MutableSharedFlow, kotlinx.coroutines.flow.FlowCollector
    public Object emit(Object obj, Continuation continuation) {
        setValue(obj);
        return Unit.INSTANCE;
    }

    @Override // kotlinx.coroutines.flow.MutableSharedFlow
    public void resetReplayCache() {
        throw new UnsupportedOperationException("MutableStateFlow.resetReplayCache is not supported");
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x00be, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.areEqual(r11, r12) == false) goto L42;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00b5 A[Catch: all -> 0x0043, TryCatch #0 {all -> 0x0043, blocks: (B:13:0x003e, B:14:0x00ab, B:16:0x00b5, B:18:0x00ba, B:20:0x00db, B:22:0x00e1, B:26:0x00c0, B:29:0x00c7, B:38:0x0060, B:40:0x0073, B:41:0x009c), top: B:7:0x0024 }] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00ba A[Catch: all -> 0x0043, TryCatch #0 {all -> 0x0043, blocks: (B:13:0x003e, B:14:0x00ab, B:16:0x00b5, B:18:0x00ba, B:20:0x00db, B:22:0x00e1, B:26:0x00c0, B:29:0x00c7, B:38:0x0060, B:40:0x0073, B:41:0x009c), top: B:7:0x0024 }] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00e1 A[Catch: all -> 0x0043, TRY_LEAVE, TryCatch #0 {all -> 0x0043, blocks: (B:13:0x003e, B:14:0x00ab, B:16:0x00b5, B:18:0x00ba, B:20:0x00db, B:22:0x00e1, B:26:0x00c0, B:29:0x00c7, B:38:0x0060, B:40:0x0073, B:41:0x009c), top: B:7:0x0024 }] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00d9 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0026  */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v14 */
    /* JADX WARN: Type inference failed for: r6v15 */
    /* JADX WARN: Type inference failed for: r6v16 */
    /* JADX WARN: Type inference failed for: r6v17 */
    /* JADX WARN: Type inference failed for: r6v2, types: [kotlinx.coroutines.flow.internal.AbstractSharedFlowSlot] */
    /* JADX WARN: Type inference failed for: r6v3 */
    /* JADX WARN: Type inference failed for: r6v7, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v1, types: [kotlinx.coroutines.flow.internal.AbstractSharedFlow] */
    /* JADX WARN: Type inference failed for: r8v13 */
    /* JADX WARN: Type inference failed for: r8v14 */
    /* JADX WARN: Type inference failed for: r8v15 */
    /* JADX WARN: Type inference failed for: r8v16 */
    /* JADX WARN: Type inference failed for: r8v2 */
    /* JADX WARN: Type inference failed for: r8v6, types: [java.lang.Object] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:21:0x00df -> B:14:0x00ab). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x00f1 -> B:14:0x00ab). Please report as a decompilation issue!!! */
    @Override // kotlinx.coroutines.flow.SharedFlow, kotlinx.coroutines.flow.Flow
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object collect(FlowCollector flowCollector, Continuation continuation) {
        StateFlowImpl$collect$1 stateFlowImpl$collect$1;
        Object coroutine_suspended;
        int i;
        ?? r8;
        StateFlowImpl stateFlowImpl;
        StateFlowSlot stateFlowSlot;
        FlowCollector flowCollector2;
        Job job;
        Object obj;
        StateFlowImpl stateFlowImpl2;
        StateFlowSlot stateFlowSlot2;
        boolean takePending;
        Object obj2;
        try {
            if (continuation instanceof StateFlowImpl$collect$1) {
                stateFlowImpl$collect$1 = (StateFlowImpl$collect$1) continuation;
                int i2 = stateFlowImpl$collect$1.label;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    stateFlowImpl$collect$1.label = i2 - Integer.MIN_VALUE;
                    Object obj3 = stateFlowImpl$collect$1.result;
                    coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = stateFlowImpl$collect$1.label;
                    ?? r6 = 1;
                    if (i != 0) {
                        ResultKt.throwOnFailure(obj3);
                        StateFlowSlot stateFlowSlot3 = (StateFlowSlot) allocateSlot();
                        try {
                            if (flowCollector instanceof SubscribedFlowCollector) {
                                stateFlowImpl$collect$1.L$0 = this;
                                stateFlowImpl$collect$1.L$1 = flowCollector;
                                stateFlowImpl$collect$1.L$2 = stateFlowSlot3;
                                stateFlowImpl$collect$1.label = 1;
                                if (((SubscribedFlowCollector) flowCollector).onSubscription(stateFlowImpl$collect$1) == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                            }
                            stateFlowImpl = this;
                            stateFlowSlot = stateFlowSlot3;
                        } catch (Throwable th) {
                            th = th;
                            r8 = this;
                            r6 = stateFlowSlot3;
                            r8.freeSlot(r6);
                            throw th;
                        }
                    } else if (i == 1) {
                        StateFlowSlot stateFlowSlot4 = (StateFlowSlot) stateFlowImpl$collect$1.L$2;
                        flowCollector = (FlowCollector) stateFlowImpl$collect$1.L$1;
                        StateFlowImpl stateFlowImpl3 = (StateFlowImpl) stateFlowImpl$collect$1.L$0;
                        ResultKt.throwOnFailure(obj3);
                        stateFlowSlot = stateFlowSlot4;
                        stateFlowImpl = stateFlowImpl3;
                    } else if (i == 2) {
                        obj = stateFlowImpl$collect$1.L$4;
                        job = (Job) stateFlowImpl$collect$1.L$3;
                        StateFlowSlot stateFlowSlot5 = (StateFlowSlot) stateFlowImpl$collect$1.L$2;
                        flowCollector2 = (FlowCollector) stateFlowImpl$collect$1.L$1;
                        StateFlowImpl stateFlowImpl4 = (StateFlowImpl) stateFlowImpl$collect$1.L$0;
                        ResultKt.throwOnFailure(obj3);
                        stateFlowSlot2 = stateFlowSlot5;
                        stateFlowImpl2 = stateFlowImpl4;
                        takePending = stateFlowSlot2.takePending();
                        r6 = stateFlowSlot2;
                        r8 = stateFlowImpl2;
                        if (!takePending) {
                        }
                        Object obj4 = _state$volatile$FU.get(r8);
                        if (job != null) {
                        }
                        if (obj != null) {
                        }
                        if (obj4 == NullSurrogateKt.NULL) {
                        }
                        stateFlowImpl$collect$1.L$0 = r8;
                        stateFlowImpl$collect$1.L$1 = flowCollector2;
                        stateFlowImpl$collect$1.L$2 = r6;
                        stateFlowImpl$collect$1.L$3 = job;
                        stateFlowImpl$collect$1.L$4 = obj4;
                        stateFlowImpl$collect$1.label = 2;
                        if (flowCollector2.emit(obj2, stateFlowImpl$collect$1) == coroutine_suspended) {
                        }
                    } else {
                        if (i != 3) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        obj = stateFlowImpl$collect$1.L$4;
                        job = (Job) stateFlowImpl$collect$1.L$3;
                        StateFlowSlot stateFlowSlot6 = (StateFlowSlot) stateFlowImpl$collect$1.L$2;
                        flowCollector2 = (FlowCollector) stateFlowImpl$collect$1.L$1;
                        StateFlowImpl stateFlowImpl5 = (StateFlowImpl) stateFlowImpl$collect$1.L$0;
                        ResultKt.throwOnFailure(obj3);
                        r6 = stateFlowSlot6;
                        r8 = stateFlowImpl5;
                        Object obj42 = _state$volatile$FU.get(r8);
                        if (job != null) {
                            JobKt.ensureActive(job);
                        }
                        if (obj != null) {
                            stateFlowSlot2 = r6;
                            stateFlowImpl2 = r8;
                        }
                        obj2 = obj42 == NullSurrogateKt.NULL ? null : obj42;
                        stateFlowImpl$collect$1.L$0 = r8;
                        stateFlowImpl$collect$1.L$1 = flowCollector2;
                        stateFlowImpl$collect$1.L$2 = r6;
                        stateFlowImpl$collect$1.L$3 = job;
                        stateFlowImpl$collect$1.L$4 = obj42;
                        stateFlowImpl$collect$1.label = 2;
                        if (flowCollector2.emit(obj2, stateFlowImpl$collect$1) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        obj = obj42;
                        stateFlowSlot2 = r6;
                        stateFlowImpl2 = r8;
                        takePending = stateFlowSlot2.takePending();
                        r6 = stateFlowSlot2;
                        r8 = stateFlowImpl2;
                        if (!takePending) {
                            stateFlowImpl$collect$1.L$0 = stateFlowImpl2;
                            stateFlowImpl$collect$1.L$1 = flowCollector2;
                            stateFlowImpl$collect$1.L$2 = stateFlowSlot2;
                            stateFlowImpl$collect$1.L$3 = job;
                            stateFlowImpl$collect$1.L$4 = obj;
                            stateFlowImpl$collect$1.label = 3;
                            Object awaitPending = stateFlowSlot2.awaitPending(stateFlowImpl$collect$1);
                            r6 = stateFlowSlot2;
                            r8 = stateFlowImpl2;
                            if (awaitPending == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                        }
                        Object obj422 = _state$volatile$FU.get(r8);
                        if (job != null) {
                        }
                        if (obj != null) {
                        }
                        if (obj422 == NullSurrogateKt.NULL) {
                        }
                        stateFlowImpl$collect$1.L$0 = r8;
                        stateFlowImpl$collect$1.L$1 = flowCollector2;
                        stateFlowImpl$collect$1.L$2 = r6;
                        stateFlowImpl$collect$1.L$3 = job;
                        stateFlowImpl$collect$1.L$4 = obj422;
                        stateFlowImpl$collect$1.label = 2;
                        if (flowCollector2.emit(obj2, stateFlowImpl$collect$1) == coroutine_suspended) {
                        }
                    }
                    flowCollector2 = flowCollector;
                    job = (Job) stateFlowImpl$collect$1.getContext().get(Job.Key);
                    obj = null;
                    r6 = stateFlowSlot;
                    r8 = stateFlowImpl;
                    Object obj4222 = _state$volatile$FU.get(r8);
                    if (job != null) {
                    }
                    if (obj != null) {
                    }
                    if (obj4222 == NullSurrogateKt.NULL) {
                    }
                    stateFlowImpl$collect$1.L$0 = r8;
                    stateFlowImpl$collect$1.L$1 = flowCollector2;
                    stateFlowImpl$collect$1.L$2 = r6;
                    stateFlowImpl$collect$1.L$3 = job;
                    stateFlowImpl$collect$1.L$4 = obj4222;
                    stateFlowImpl$collect$1.label = 2;
                    if (flowCollector2.emit(obj2, stateFlowImpl$collect$1) == coroutine_suspended) {
                    }
                }
            }
            if (i != 0) {
            }
            flowCollector2 = flowCollector;
            job = (Job) stateFlowImpl$collect$1.getContext().get(Job.Key);
            obj = null;
            r6 = stateFlowSlot;
            r8 = stateFlowImpl;
            Object obj42222 = _state$volatile$FU.get(r8);
            if (job != null) {
            }
            if (obj != null) {
            }
            if (obj42222 == NullSurrogateKt.NULL) {
            }
            stateFlowImpl$collect$1.L$0 = r8;
            stateFlowImpl$collect$1.L$1 = flowCollector2;
            stateFlowImpl$collect$1.L$2 = r6;
            stateFlowImpl$collect$1.L$3 = job;
            stateFlowImpl$collect$1.L$4 = obj42222;
            stateFlowImpl$collect$1.label = 2;
            if (flowCollector2.emit(obj2, stateFlowImpl$collect$1) == coroutine_suspended) {
            }
        } catch (Throwable th2) {
            th = th2;
        }
        stateFlowImpl$collect$1 = new StateFlowImpl$collect$1(this, continuation);
        Object obj32 = stateFlowImpl$collect$1.result;
        coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = stateFlowImpl$collect$1.label;
        ?? r62 = 1;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlinx.coroutines.flow.internal.AbstractSharedFlow
    public StateFlowSlot createSlot() {
        return new StateFlowSlot();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlinx.coroutines.flow.internal.AbstractSharedFlow
    public StateFlowSlot[] createSlotArray(int i) {
        return new StateFlowSlot[i];
    }

    @Override // kotlinx.coroutines.flow.internal.FusibleFlow
    public Flow fuse(CoroutineContext coroutineContext, int i, BufferOverflow bufferOverflow) {
        return StateFlowKt.fuseStateFlow(this, coroutineContext, i, bufferOverflow);
    }
}
