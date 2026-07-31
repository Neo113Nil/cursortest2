package kotlinx.coroutines.flow;

import java.util.Arrays;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.CancellableContinuationKt;
import kotlinx.coroutines.DisposableHandle;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.internal.AbstractSharedFlow;
import kotlinx.coroutines.flow.internal.AbstractSharedFlowKt;
import kotlinx.coroutines.flow.internal.AbstractSharedFlowSlot;
import kotlinx.coroutines.flow.internal.FusibleFlow;
import kotlinx.coroutines.internal.Symbol;

/* compiled from: SharedFlow.kt */
/* loaded from: classes8.dex */
public class SharedFlowImpl extends AbstractSharedFlow implements MutableSharedFlow, CancellableFlow, FusibleFlow {
    private Object[] buffer;
    private final int bufferCapacity;
    private int bufferSize;
    private long minCollectorIndex;
    private final BufferOverflow onBufferOverflow;
    private int queueSize;
    private final int replay;
    private long replayIndex;

    /* compiled from: SharedFlow.kt */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[BufferOverflow.values().length];
            try {
                iArr[BufferOverflow.SUSPEND.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[BufferOverflow.DROP_LATEST.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[BufferOverflow.DROP_OLDEST.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @Override // kotlinx.coroutines.flow.SharedFlow, kotlinx.coroutines.flow.Flow
    public Object collect(FlowCollector flowCollector, Continuation continuation) {
        return collect$suspendImpl(this, flowCollector, continuation);
    }

    @Override // kotlinx.coroutines.flow.MutableSharedFlow, kotlinx.coroutines.flow.FlowCollector
    public Object emit(Object obj, Continuation continuation) {
        return emit$suspendImpl(this, obj, continuation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void cancelEmitter(Emitter emitter) {
        Object bufferAt;
        synchronized (this) {
            if (emitter.index < getHead()) {
                return;
            }
            Object[] objArr = this.buffer;
            Intrinsics.checkNotNull(objArr);
            bufferAt = SharedFlowKt.getBufferAt(objArr, emitter.index);
            if (bufferAt != emitter) {
                return;
            }
            SharedFlowKt.setBufferAt(objArr, emitter.index, SharedFlowKt.NO_VALUE);
            cleanupTailLocked();
            Unit unit = Unit.INSTANCE;
        }
    }

    @Override // kotlinx.coroutines.flow.MutableSharedFlow
    public void resetReplayCache() {
        synchronized (this) {
            updateBufferLocked(getBufferEndIndex(), this.minCollectorIndex, getBufferEndIndex(), getQueueEndIndex());
            Unit unit = Unit.INSTANCE;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:3:0x0006, code lost:
    
        r0 = ((kotlinx.coroutines.flow.internal.AbstractSharedFlow) r8).slots;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void correctCollectorIndexesOnDropOldest(long j) {
        int i;
        AbstractSharedFlowSlot[] abstractSharedFlowSlotArr;
        i = ((AbstractSharedFlow) this).nCollectors;
        if (i != 0 && abstractSharedFlowSlotArr != null) {
            for (AbstractSharedFlowSlot abstractSharedFlowSlot : abstractSharedFlowSlotArr) {
                if (abstractSharedFlowSlot != null) {
                    SharedFlowSlot sharedFlowSlot = (SharedFlowSlot) abstractSharedFlowSlot;
                    long j2 = sharedFlowSlot.index;
                    if (j2 >= 0 && j2 < j) {
                        sharedFlowSlot.index = j;
                    }
                }
            }
        }
        this.minCollectorIndex = j;
    }

    public SharedFlowImpl(int i, int i2, BufferOverflow bufferOverflow) {
        this.replay = i;
        this.bufferCapacity = i2;
        this.onBufferOverflow = bufferOverflow;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final long getHead() {
        return Math.min(this.minCollectorIndex, this.replayIndex);
    }

    private final int getReplaySize() {
        return (int) ((getHead() + this.bufferSize) - this.replayIndex);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int getTotalSize() {
        return this.bufferSize + this.queueSize;
    }

    private final long getBufferEndIndex() {
        return getHead() + this.bufferSize;
    }

    private final long getQueueEndIndex() {
        return getHead() + this.bufferSize + this.queueSize;
    }

    protected final Object getLastReplayedLocked() {
        Object bufferAt;
        Object[] objArr = this.buffer;
        Intrinsics.checkNotNull(objArr);
        bufferAt = SharedFlowKt.getBufferAt(objArr, (this.replayIndex + getReplaySize()) - 1);
        return bufferAt;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(10:0|1|(2:3|(7:5|6|(3:(6:(1:(1:11)(2:41|42))(1:43)|12|13|14|15|(3:16|(3:28|29|(2:31|32)(1:33))(4:18|(1:20)|21|(2:23|24)(1:26))|27))(4:44|45|46|47)|37|38)(5:53|54|55|(2:57|(1:59))|61)|48|49|15|(3:16|(0)(0)|27)))|64|6|(0)(0)|48|49|15|(3:16|(0)(0)|27)) */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00c2, code lost:
    
        r10 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00c3, code lost:
    
        r5 = r8;
        r8 = r10;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00c6 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00b1 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    static /* synthetic */ Object collect$suspendImpl(SharedFlowImpl sharedFlowImpl, FlowCollector flowCollector, Continuation continuation) {
        SharedFlowImpl$collect$1 sharedFlowImpl$collect$1;
        int i;
        SharedFlowImpl sharedFlowImpl2;
        Throwable th;
        SharedFlowSlot sharedFlowSlot;
        FlowCollector flowCollector2;
        Job job;
        Object tryTakeValue;
        Job job2;
        FlowCollector flowCollector3;
        if (continuation instanceof SharedFlowImpl$collect$1) {
            sharedFlowImpl$collect$1 = (SharedFlowImpl$collect$1) continuation;
            int i2 = sharedFlowImpl$collect$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                sharedFlowImpl$collect$1.label = i2 - Integer.MIN_VALUE;
                Object obj = sharedFlowImpl$collect$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = sharedFlowImpl$collect$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    SharedFlowSlot sharedFlowSlot2 = (SharedFlowSlot) sharedFlowImpl.allocateSlot();
                    try {
                        if (flowCollector instanceof SubscribedFlowCollector) {
                            sharedFlowImpl$collect$1.L$0 = sharedFlowImpl;
                            sharedFlowImpl$collect$1.L$1 = flowCollector;
                            sharedFlowImpl$collect$1.L$2 = sharedFlowSlot2;
                            sharedFlowImpl$collect$1.label = 1;
                            if (((SubscribedFlowCollector) flowCollector).onSubscription(sharedFlowImpl$collect$1) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                        }
                        flowCollector2 = flowCollector;
                        sharedFlowSlot = sharedFlowSlot2;
                    } catch (Throwable th2) {
                        sharedFlowImpl2 = sharedFlowImpl;
                        th = th2;
                        sharedFlowSlot = sharedFlowSlot2;
                    }
                } else {
                    if (i != 1) {
                        if (i == 2) {
                            job2 = (Job) sharedFlowImpl$collect$1.L$3;
                            sharedFlowSlot = (SharedFlowSlot) sharedFlowImpl$collect$1.L$2;
                            flowCollector3 = (FlowCollector) sharedFlowImpl$collect$1.L$1;
                            sharedFlowImpl2 = (SharedFlowImpl) sharedFlowImpl$collect$1.L$0;
                        } else {
                            if (i != 3) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            job2 = (Job) sharedFlowImpl$collect$1.L$3;
                            sharedFlowSlot = (SharedFlowSlot) sharedFlowImpl$collect$1.L$2;
                            flowCollector3 = (FlowCollector) sharedFlowImpl$collect$1.L$1;
                            sharedFlowImpl2 = (SharedFlowImpl) sharedFlowImpl$collect$1.L$0;
                        }
                        try {
                            ResultKt.throwOnFailure(obj);
                            flowCollector2 = flowCollector3;
                            job = job2;
                            sharedFlowImpl = sharedFlowImpl2;
                            while (true) {
                                tryTakeValue = sharedFlowImpl.tryTakeValue(sharedFlowSlot);
                                if (tryTakeValue == SharedFlowKt.NO_VALUE) {
                                    sharedFlowImpl$collect$1.L$0 = sharedFlowImpl;
                                    sharedFlowImpl$collect$1.L$1 = flowCollector2;
                                    sharedFlowImpl$collect$1.L$2 = sharedFlowSlot;
                                    sharedFlowImpl$collect$1.L$3 = job;
                                    sharedFlowImpl$collect$1.label = 2;
                                    if (sharedFlowImpl.awaitValue(sharedFlowSlot, sharedFlowImpl$collect$1) == coroutine_suspended) {
                                        return coroutine_suspended;
                                    }
                                } else {
                                    if (job != null) {
                                        JobKt.ensureActive(job);
                                    }
                                    sharedFlowImpl$collect$1.L$0 = sharedFlowImpl;
                                    sharedFlowImpl$collect$1.L$1 = flowCollector2;
                                    sharedFlowImpl$collect$1.L$2 = sharedFlowSlot;
                                    sharedFlowImpl$collect$1.L$3 = job;
                                    sharedFlowImpl$collect$1.label = 3;
                                    if (flowCollector2.emit(tryTakeValue, sharedFlowImpl$collect$1) == coroutine_suspended) {
                                        return coroutine_suspended;
                                    }
                                }
                            }
                        } catch (Throwable th3) {
                            th = th3;
                        }
                    } else {
                        sharedFlowSlot = (SharedFlowSlot) sharedFlowImpl$collect$1.L$2;
                        FlowCollector flowCollector4 = (FlowCollector) sharedFlowImpl$collect$1.L$1;
                        SharedFlowImpl sharedFlowImpl3 = (SharedFlowImpl) sharedFlowImpl$collect$1.L$0;
                        try {
                            ResultKt.throwOnFailure(obj);
                            flowCollector2 = flowCollector4;
                            sharedFlowImpl = sharedFlowImpl3;
                        } catch (Throwable th4) {
                            th = th4;
                            sharedFlowImpl2 = sharedFlowImpl3;
                        }
                    }
                    sharedFlowImpl2.freeSlot(sharedFlowSlot);
                    throw th;
                }
                job = (Job) sharedFlowImpl$collect$1.getContext().get(Job.Key);
                while (true) {
                    tryTakeValue = sharedFlowImpl.tryTakeValue(sharedFlowSlot);
                    if (tryTakeValue == SharedFlowKt.NO_VALUE) {
                    }
                }
            }
        }
        sharedFlowImpl$collect$1 = new SharedFlowImpl$collect$1(sharedFlowImpl, continuation);
        Object obj2 = sharedFlowImpl$collect$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = sharedFlowImpl$collect$1.label;
        if (i != 0) {
        }
        job = (Job) sharedFlowImpl$collect$1.getContext().get(Job.Key);
        while (true) {
            tryTakeValue = sharedFlowImpl.tryTakeValue(sharedFlowSlot);
            if (tryTakeValue == SharedFlowKt.NO_VALUE) {
            }
        }
    }

    @Override // kotlinx.coroutines.flow.MutableSharedFlow
    public boolean tryEmit(Object obj) {
        int i;
        boolean z;
        Continuation[] continuationArr = AbstractSharedFlowKt.EMPTY_RESUMES;
        synchronized (this) {
            if (tryEmitLocked(obj)) {
                continuationArr = findSlotsToResumeLocked(continuationArr);
                z = true;
            } else {
                z = false;
            }
        }
        for (Continuation continuation : continuationArr) {
            if (continuation != null) {
                Result.Companion companion = Result.INSTANCE;
                continuation.resumeWith(Result.m8023constructorimpl(Unit.INSTANCE));
            }
        }
        return z;
    }

    static /* synthetic */ Object emit$suspendImpl(SharedFlowImpl sharedFlowImpl, Object obj, Continuation continuation) {
        Object emitSuspend;
        return (!sharedFlowImpl.tryEmit(obj) && (emitSuspend = sharedFlowImpl.emitSuspend(obj, continuation)) == IntrinsicsKt.getCOROUTINE_SUSPENDED()) ? emitSuspend : Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean tryEmitLocked(Object obj) {
        if (getNCollectors() == 0) {
            return tryEmitNoCollectorsLocked(obj);
        }
        if (this.bufferSize >= this.bufferCapacity && this.minCollectorIndex <= this.replayIndex) {
            int i = WhenMappings.$EnumSwitchMapping$0[this.onBufferOverflow.ordinal()];
            if (i == 1) {
                return false;
            }
            if (i == 2) {
                return true;
            }
            if (i != 3) {
                throw new NoWhenBranchMatchedException();
            }
        }
        enqueueLocked(obj);
        int i2 = this.bufferSize + 1;
        this.bufferSize = i2;
        if (i2 > this.bufferCapacity) {
            dropOldestLocked();
        }
        if (getReplaySize() > this.replay) {
            updateBufferLocked(this.replayIndex + 1, this.minCollectorIndex, getBufferEndIndex(), getQueueEndIndex());
        }
        return true;
    }

    private final Object awaitValue(SharedFlowSlot sharedFlowSlot, Continuation continuation) {
        CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(IntrinsicsKt.intercepted(continuation), 1);
        cancellableContinuationImpl.initCancellability();
        synchronized (this) {
            try {
                if (tryPeekLocked(sharedFlowSlot) >= 0) {
                    Result.Companion companion = Result.INSTANCE;
                    cancellableContinuationImpl.resumeWith(Result.m8023constructorimpl(Unit.INSTANCE));
                } else {
                    sharedFlowSlot.cont = cancellableContinuationImpl;
                }
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th) {
                throw th;
            }
        }
        Object result = cancellableContinuationImpl.getResult();
        if (result == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return result == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? result : Unit.INSTANCE;
    }

    private final Object emitSuspend(Object obj, Continuation continuation) {
        Continuation[] continuationArr;
        Emitter emitter;
        CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(IntrinsicsKt.intercepted(continuation), 1);
        cancellableContinuationImpl.initCancellability();
        Continuation[] continuationArr2 = AbstractSharedFlowKt.EMPTY_RESUMES;
        synchronized (this) {
            try {
                if (tryEmitLocked(obj)) {
                    Result.Companion companion = Result.INSTANCE;
                    cancellableContinuationImpl.resumeWith(Result.m8023constructorimpl(Unit.INSTANCE));
                    continuationArr = findSlotsToResumeLocked(continuationArr2);
                    emitter = null;
                } else {
                    Emitter emitter2 = new Emitter(this, getTotalSize() + getHead(), obj, cancellableContinuationImpl);
                    enqueueLocked(emitter2);
                    this.queueSize++;
                    if (this.bufferCapacity == 0) {
                        continuationArr2 = findSlotsToResumeLocked(continuationArr2);
                    }
                    continuationArr = continuationArr2;
                    emitter = emitter2;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (emitter != null) {
            CancellableContinuationKt.disposeOnCancellation(cancellableContinuationImpl, emitter);
        }
        for (Continuation continuation2 : continuationArr) {
            if (continuation2 != null) {
                Result.Companion companion2 = Result.INSTANCE;
                continuation2.resumeWith(Result.m8023constructorimpl(Unit.INSTANCE));
            }
        }
        Object result = cancellableContinuationImpl.getResult();
        if (result == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return result == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? result : Unit.INSTANCE;
    }

    private final boolean tryEmitNoCollectorsLocked(Object obj) {
        if (this.replay == 0) {
            return true;
        }
        enqueueLocked(obj);
        int i = this.bufferSize + 1;
        this.bufferSize = i;
        if (i > this.replay) {
            dropOldestLocked();
        }
        this.minCollectorIndex = getHead() + this.bufferSize;
        return true;
    }

    private final void dropOldestLocked() {
        Object[] objArr = this.buffer;
        Intrinsics.checkNotNull(objArr);
        SharedFlowKt.setBufferAt(objArr, getHead(), null);
        this.bufferSize--;
        long head = getHead() + 1;
        if (this.replayIndex < head) {
            this.replayIndex = head;
        }
        if (this.minCollectorIndex < head) {
            correctCollectorIndexesOnDropOldest(head);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void enqueueLocked(Object obj) {
        int totalSize = getTotalSize();
        Object[] objArr = this.buffer;
        if (objArr == null) {
            objArr = growBuffer(null, 0, 2);
        } else if (totalSize >= objArr.length) {
            objArr = growBuffer(objArr, totalSize, objArr.length * 2);
        }
        SharedFlowKt.setBufferAt(objArr, getHead() + totalSize, obj);
    }

    private final Object[] growBuffer(Object[] objArr, int i, int i2) {
        Object bufferAt;
        if (i2 <= 0) {
            throw new IllegalStateException("Buffer size overflow");
        }
        Object[] objArr2 = new Object[i2];
        this.buffer = objArr2;
        if (objArr == null) {
            return objArr2;
        }
        long head = getHead();
        for (int i3 = 0; i3 < i; i3++) {
            long j = i3 + head;
            bufferAt = SharedFlowKt.getBufferAt(objArr, j);
            SharedFlowKt.setBufferAt(objArr2, j, bufferAt);
        }
        return objArr2;
    }

    public final long updateNewCollectorIndexLocked$kotlinx_coroutines_core() {
        long j = this.replayIndex;
        if (j < this.minCollectorIndex) {
            this.minCollectorIndex = j;
        }
        return j;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0024, code lost:
    
        r4 = ((kotlinx.coroutines.flow.internal.AbstractSharedFlow) r21).slots;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Continuation[] updateCollectorIndexLocked$kotlinx_coroutines_core(long j) {
        int i;
        int i2;
        long j2;
        long j3;
        Object bufferAt;
        Object bufferAt2;
        long j4;
        AbstractSharedFlowSlot[] abstractSharedFlowSlotArr;
        if (j > this.minCollectorIndex) {
            return AbstractSharedFlowKt.EMPTY_RESUMES;
        }
        long head = getHead();
        long j5 = this.bufferSize + head;
        if (this.bufferCapacity == 0 && this.queueSize > 0) {
            j5++;
        }
        i = ((AbstractSharedFlow) this).nCollectors;
        if (i != 0 && abstractSharedFlowSlotArr != null) {
            for (AbstractSharedFlowSlot abstractSharedFlowSlot : abstractSharedFlowSlotArr) {
                if (abstractSharedFlowSlot != null) {
                    long j6 = ((SharedFlowSlot) abstractSharedFlowSlot).index;
                    if (j6 >= 0 && j6 < j5) {
                        j5 = j6;
                    }
                }
            }
        }
        if (j5 <= this.minCollectorIndex) {
            return AbstractSharedFlowKt.EMPTY_RESUMES;
        }
        long bufferEndIndex = getBufferEndIndex();
        if (getNCollectors() > 0) {
            i2 = Math.min(this.queueSize, this.bufferCapacity - ((int) (bufferEndIndex - j5)));
        } else {
            i2 = this.queueSize;
        }
        Continuation[] continuationArr = AbstractSharedFlowKt.EMPTY_RESUMES;
        long j7 = this.queueSize + bufferEndIndex;
        if (i2 > 0) {
            continuationArr = new Continuation[i2];
            Object[] objArr = this.buffer;
            Intrinsics.checkNotNull(objArr);
            long j8 = bufferEndIndex;
            int i3 = 0;
            while (true) {
                if (bufferEndIndex >= j7) {
                    j2 = j5;
                    j3 = j7;
                    break;
                }
                bufferAt2 = SharedFlowKt.getBufferAt(objArr, bufferEndIndex);
                j2 = j5;
                Symbol symbol = SharedFlowKt.NO_VALUE;
                if (bufferAt2 != symbol) {
                    Intrinsics.checkNotNull(bufferAt2, "null cannot be cast to non-null type kotlinx.coroutines.flow.SharedFlowImpl.Emitter");
                    Emitter emitter = (Emitter) bufferAt2;
                    int i4 = i3 + 1;
                    j3 = j7;
                    continuationArr[i3] = emitter.cont;
                    SharedFlowKt.setBufferAt(objArr, bufferEndIndex, symbol);
                    SharedFlowKt.setBufferAt(objArr, j8, emitter.value);
                    j4 = 1;
                    j8++;
                    if (i4 >= i2) {
                        break;
                    }
                    i3 = i4;
                } else {
                    j3 = j7;
                    j4 = 1;
                }
                bufferEndIndex += j4;
                j5 = j2;
                j7 = j3;
            }
            bufferEndIndex = j8;
        } else {
            j2 = j5;
            j3 = j7;
        }
        int i5 = (int) (bufferEndIndex - head);
        long j9 = getNCollectors() == 0 ? bufferEndIndex : j2;
        long max = Math.max(this.replayIndex, bufferEndIndex - Math.min(this.replay, i5));
        if (this.bufferCapacity == 0 && max < j3) {
            Object[] objArr2 = this.buffer;
            Intrinsics.checkNotNull(objArr2);
            bufferAt = SharedFlowKt.getBufferAt(objArr2, max);
            if (Intrinsics.areEqual(bufferAt, SharedFlowKt.NO_VALUE)) {
                bufferEndIndex++;
                max++;
            }
        }
        updateBufferLocked(max, j9, bufferEndIndex, j3);
        cleanupTailLocked();
        return !(continuationArr.length == 0) ? findSlotsToResumeLocked(continuationArr) : continuationArr;
    }

    private final void updateBufferLocked(long j, long j2, long j3, long j4) {
        long min = Math.min(j2, j);
        for (long head = getHead(); head < min; head++) {
            Object[] objArr = this.buffer;
            Intrinsics.checkNotNull(objArr);
            SharedFlowKt.setBufferAt(objArr, head, null);
        }
        this.replayIndex = j;
        this.minCollectorIndex = j2;
        this.bufferSize = (int) (j3 - min);
        this.queueSize = (int) (j4 - j3);
    }

    private final void cleanupTailLocked() {
        Object bufferAt;
        if (this.bufferCapacity != 0 || this.queueSize > 1) {
            Object[] objArr = this.buffer;
            Intrinsics.checkNotNull(objArr);
            while (this.queueSize > 0) {
                bufferAt = SharedFlowKt.getBufferAt(objArr, (getHead() + getTotalSize()) - 1);
                if (bufferAt != SharedFlowKt.NO_VALUE) {
                    return;
                }
                this.queueSize--;
                SharedFlowKt.setBufferAt(objArr, getHead() + getTotalSize(), null);
            }
        }
    }

    private final Object tryTakeValue(SharedFlowSlot sharedFlowSlot) {
        Object obj;
        Continuation[] continuationArr = AbstractSharedFlowKt.EMPTY_RESUMES;
        synchronized (this) {
            try {
                long tryPeekLocked = tryPeekLocked(sharedFlowSlot);
                if (tryPeekLocked < 0) {
                    obj = SharedFlowKt.NO_VALUE;
                } else {
                    long j = sharedFlowSlot.index;
                    Object peekedValueLockedAt = getPeekedValueLockedAt(tryPeekLocked);
                    sharedFlowSlot.index = tryPeekLocked + 1;
                    continuationArr = updateCollectorIndexLocked$kotlinx_coroutines_core(j);
                    obj = peekedValueLockedAt;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        for (Continuation continuation : continuationArr) {
            if (continuation != null) {
                Result.Companion companion = Result.INSTANCE;
                continuation.resumeWith(Result.m8023constructorimpl(Unit.INSTANCE));
            }
        }
        return obj;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final long tryPeekLocked(SharedFlowSlot sharedFlowSlot) {
        long j = sharedFlowSlot.index;
        if (j < getBufferEndIndex()) {
            return j;
        }
        if (this.bufferCapacity <= 0 && j <= getHead() && this.queueSize != 0) {
            return j;
        }
        return -1L;
    }

    private final Object getPeekedValueLockedAt(long j) {
        Object bufferAt;
        Object[] objArr = this.buffer;
        Intrinsics.checkNotNull(objArr);
        bufferAt = SharedFlowKt.getBufferAt(objArr, j);
        return bufferAt instanceof Emitter ? ((Emitter) bufferAt).value : bufferAt;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:3:0x0007, code lost:
    
        r1 = ((kotlinx.coroutines.flow.internal.AbstractSharedFlow) r10).slots;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v6, types: [java.lang.Object, java.lang.Object[]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Continuation[] findSlotsToResumeLocked(Continuation[] continuationArr) {
        int i;
        AbstractSharedFlowSlot[] abstractSharedFlowSlotArr;
        SharedFlowSlot sharedFlowSlot;
        Continuation continuation;
        int length = continuationArr.length;
        i = ((AbstractSharedFlow) this).nCollectors;
        if (i != 0 && abstractSharedFlowSlotArr != null) {
            int length2 = abstractSharedFlowSlotArr.length;
            int i2 = 0;
            continuationArr = continuationArr;
            while (i2 < length2) {
                AbstractSharedFlowSlot abstractSharedFlowSlot = abstractSharedFlowSlotArr[i2];
                if (abstractSharedFlowSlot != null && (continuation = (sharedFlowSlot = (SharedFlowSlot) abstractSharedFlowSlot).cont) != null && tryPeekLocked(sharedFlowSlot) >= 0) {
                    int length3 = continuationArr.length;
                    continuationArr = continuationArr;
                    if (length >= length3) {
                        ?? copyOf = Arrays.copyOf(continuationArr, Math.max(2, continuationArr.length * 2));
                        Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(...)");
                        continuationArr = copyOf;
                    }
                    continuationArr[length] = continuation;
                    sharedFlowSlot.cont = null;
                    length++;
                }
                i2++;
                continuationArr = continuationArr;
            }
        }
        return continuationArr;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlinx.coroutines.flow.internal.AbstractSharedFlow
    public SharedFlowSlot createSlot() {
        return new SharedFlowSlot();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlinx.coroutines.flow.internal.AbstractSharedFlow
    public SharedFlowSlot[] createSlotArray(int i) {
        return new SharedFlowSlot[i];
    }

    @Override // kotlinx.coroutines.flow.internal.FusibleFlow
    public Flow fuse(CoroutineContext coroutineContext, int i, BufferOverflow bufferOverflow) {
        return SharedFlowKt.fuseSharedFlow(this, coroutineContext, i, bufferOverflow);
    }

    /* compiled from: SharedFlow.kt */
    private static final class Emitter implements DisposableHandle {
        public final Continuation cont;
        public final SharedFlowImpl flow;
        public long index;
        public final Object value;

        public Emitter(SharedFlowImpl sharedFlowImpl, long j, Object obj, Continuation continuation) {
            this.flow = sharedFlowImpl;
            this.index = j;
            this.value = obj;
            this.cont = continuation;
        }

        @Override // kotlinx.coroutines.DisposableHandle
        public void dispose() {
            this.flow.cancelEmitter(this);
        }
    }
}
