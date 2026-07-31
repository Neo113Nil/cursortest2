package io.ktor.utils.io;

import androidx.concurrent.futures.AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.ExceptionsKt;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.CharsKt;
import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.io.Buffer;
import kotlinx.io.Sink;
import kotlinx.io.Source;
import org.jetbrains.annotations.NotNull;

/* compiled from: ByteChannel.kt */
/* loaded from: classes11.dex */
public final class ByteChannel implements ByteReadChannel, ByteWriteChannel {

    @NotNull
    volatile /* synthetic */ Object _closedCause;
    private final Buffer _readBuffer;
    private final Buffer _writeBuffer;
    private final boolean autoFlush;
    private final Buffer flushBuffer;
    private final Object flushBufferMutex;
    private volatile int flushBufferSize;

    @NotNull
    volatile /* synthetic */ Object suspensionSlot;
    static final /* synthetic */ AtomicReferenceFieldUpdater suspensionSlot$FU = AtomicReferenceFieldUpdater.newUpdater(ByteChannel.class, Object.class, "suspensionSlot");
    static final /* synthetic */ AtomicReferenceFieldUpdater _closedCause$FU = AtomicReferenceFieldUpdater.newUpdater(ByteChannel.class, Object.class, "_closedCause");

    public ByteChannel(boolean z) {
        this.autoFlush = z;
        this.flushBuffer = new Buffer();
        this.flushBufferMutex = new Object();
        this.suspensionSlot = Slot.Empty.INSTANCE;
        this._readBuffer = new Buffer();
        this._writeBuffer = new Buffer();
        this._closedCause = null;
    }

    public /* synthetic */ ByteChannel(boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z);
    }

    public final boolean getAutoFlush() {
        return this.autoFlush;
    }

    @Override // io.ktor.utils.io.ByteReadChannel
    public Source getReadBuffer() {
        CloseToken closeToken = (CloseToken) this._closedCause;
        if (closeToken != null) {
            closeToken.throwOrNull(ByteChannel$readBuffer$1.INSTANCE);
        }
        if (this._readBuffer.exhausted()) {
            moveFlushToReadBuffer();
        }
        return this._readBuffer;
    }

    @Override // io.ktor.utils.io.ByteWriteChannel
    public Sink getWriteBuffer() {
        CloseToken closeToken;
        if (isClosedForWrite() && ((closeToken = (CloseToken) this._closedCause) == null || closeToken.throwOrNull(ByteChannel$writeBuffer$1.INSTANCE) == null)) {
            throw new ClosedWriteChannelException(null, 1, null);
        }
        return this._writeBuffer;
    }

    @Override // io.ktor.utils.io.ByteReadChannel, io.ktor.utils.io.ByteWriteChannel
    public Throwable getClosedCause() {
        CloseToken closeToken = (CloseToken) this._closedCause;
        if (closeToken != null) {
            return CloseToken.wrapCause$default(closeToken, null, 1, null);
        }
        return null;
    }

    public boolean isClosedForWrite() {
        return this._closedCause != null;
    }

    @Override // io.ktor.utils.io.ByteReadChannel
    public boolean isClosedForRead() {
        return getClosedCause() != null || (isClosedForWrite() && this.flushBufferSize == 0 && this._readBuffer.exhausted());
    }

    /* JADX WARN: Removed duplicated region for block: B:55:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // io.ktor.utils.io.ByteReadChannel
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object awaitContent(int i, Continuation continuation) {
        ByteChannel$awaitContent$1 byteChannel$awaitContent$1;
        Object coroutine_suspended;
        int i2;
        ByteChannel byteChannel;
        long j;
        Object result;
        if (continuation instanceof ByteChannel$awaitContent$1) {
            byteChannel$awaitContent$1 = (ByteChannel$awaitContent$1) continuation;
            int i3 = byteChannel$awaitContent$1.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                byteChannel$awaitContent$1.label = i3 - Integer.MIN_VALUE;
                Object obj = byteChannel$awaitContent$1.result;
                coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i2 = byteChannel$awaitContent$1.label;
                if (i2 != 0) {
                    ResultKt.throwOnFailure(obj);
                    ByteReadChannelOperationsKt.rethrowCloseCauseIfNeeded(this);
                    if (this._readBuffer.getSize() >= i) {
                        return Boxing.boxBoolean(true);
                    }
                    byteChannel = this;
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    i = byteChannel$awaitContent$1.I$0;
                    byteChannel = (ByteChannel) byteChannel$awaitContent$1.L$0;
                    ResultKt.throwOnFailure(obj);
                }
                do {
                    j = i;
                    if (this.flushBufferSize + this._readBuffer.getSize() < j || this._closedCause != null) {
                        if (this._readBuffer.getSize() < 1048576) {
                            moveFlushToReadBuffer();
                        }
                        return Boxing.boxBoolean(this._readBuffer.getSize() >= j);
                    }
                    byteChannel$awaitContent$1.L$0 = byteChannel;
                    byteChannel$awaitContent$1.I$0 = i;
                    byteChannel$awaitContent$1.label = 1;
                    CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(IntrinsicsKt.intercepted(byteChannel$awaitContent$1), 1);
                    cancellableContinuationImpl.initCancellability();
                    Slot.Read read = new Slot.Read(cancellableContinuationImpl);
                    Slot slot = (Slot) byteChannel.suspensionSlot;
                    boolean z = slot instanceof Slot.Closed;
                    if (!z && !AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0.m(suspensionSlot$FU, byteChannel, slot, read)) {
                        read.resume();
                    } else {
                        if (slot instanceof Slot.Read) {
                            Slot.Task task = (Slot.Task) slot;
                            task.resume(new ConcurrentIOException(read.taskName(), task.getCreated()));
                        } else if (slot instanceof Slot.Task) {
                            ((Slot.Task) slot).resume();
                        } else if (z) {
                            read.resume(((Slot.Closed) slot).getCause());
                        } else if (!Intrinsics.areEqual(slot, Slot.Empty.INSTANCE)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        if (this.flushBufferSize + this._readBuffer.getSize() >= j || this._closedCause != null) {
                            Slot slot2 = (Slot) byteChannel.suspensionSlot;
                            if ((slot2 instanceof Slot.Read) && AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0.m(suspensionSlot$FU, byteChannel, slot2, Slot.Empty.INSTANCE)) {
                                ((Slot.Task) slot2).resume();
                            }
                        }
                    }
                    result = cancellableContinuationImpl.getResult();
                    if (result == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                        DebugProbesKt.probeCoroutineSuspended(byteChannel$awaitContent$1);
                    }
                } while (result != coroutine_suspended);
                return coroutine_suspended;
            }
        }
        byteChannel$awaitContent$1 = new ByteChannel$awaitContent$1(this, continuation);
        Object obj2 = byteChannel$awaitContent$1.result;
        coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i2 = byteChannel$awaitContent$1.label;
        if (i2 != 0) {
        }
        do {
            j = i;
            if (this.flushBufferSize + this._readBuffer.getSize() < j) {
            }
            if (this._readBuffer.getSize() < 1048576) {
            }
            return Boxing.boxBoolean(this._readBuffer.getSize() >= j);
        } while (result != coroutine_suspended);
        return coroutine_suspended;
    }

    private final void moveFlushToReadBuffer() {
        synchronized (this.flushBufferMutex) {
            this.flushBuffer.transferTo(this._readBuffer);
            this.flushBufferSize = 0;
            Unit unit = Unit.INSTANCE;
        }
        Slot slot = (Slot) this.suspensionSlot;
        if ((slot instanceof Slot.Write) && AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0.m(suspensionSlot$FU, this, slot, Slot.Empty.INSTANCE)) {
            ((Slot.Task) slot).resume();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00e1 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:28:? A[LOOP:0: B:11:0x0048->B:28:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00df A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    @Override // io.ktor.utils.io.ByteWriteChannel
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object flush(Continuation continuation) {
        ByteChannel$flush$1 byteChannel$flush$1;
        Object coroutine_suspended;
        int i;
        ByteChannel byteChannel;
        Slot slot;
        boolean z;
        Slot slot2;
        Object result;
        if (continuation instanceof ByteChannel$flush$1) {
            byteChannel$flush$1 = (ByteChannel$flush$1) continuation;
            int i2 = byteChannel$flush$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                byteChannel$flush$1.label = i2 - Integer.MIN_VALUE;
                Object obj = byteChannel$flush$1.result;
                coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = byteChannel$flush$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    ByteReadChannelOperationsKt.rethrowCloseCauseIfNeeded(this);
                    flushWriteBuffer();
                    if (this.flushBufferSize < 1048576) {
                        return Unit.INSTANCE;
                    }
                    byteChannel = this;
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    byteChannel = (ByteChannel) byteChannel$flush$1.L$0;
                    ResultKt.throwOnFailure(obj);
                }
                while (this.flushBufferSize >= 1048576 && this._closedCause == null) {
                    byteChannel$flush$1.L$0 = byteChannel;
                    byteChannel$flush$1.label = 1;
                    CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(IntrinsicsKt.intercepted(byteChannel$flush$1), 1);
                    cancellableContinuationImpl.initCancellability();
                    Slot.Write write = new Slot.Write(cancellableContinuationImpl);
                    slot = (Slot) byteChannel.suspensionSlot;
                    z = slot instanceof Slot.Closed;
                    if (z && !AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0.m(suspensionSlot$FU, byteChannel, slot, write)) {
                        write.resume();
                    } else {
                        if (!(slot instanceof Slot.Write)) {
                            Slot.Task task = (Slot.Task) slot;
                            task.resume(new ConcurrentIOException(write.taskName(), task.getCreated()));
                        } else if (slot instanceof Slot.Task) {
                            ((Slot.Task) slot).resume();
                        } else if (z) {
                            write.resume(((Slot.Closed) slot).getCause());
                        } else if (!Intrinsics.areEqual(slot, Slot.Empty.INSTANCE)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        if (this.flushBufferSize >= 1048576 || this._closedCause != null) {
                            slot2 = (Slot) byteChannel.suspensionSlot;
                            if ((slot2 instanceof Slot.Write) && AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0.m(suspensionSlot$FU, byteChannel, slot2, Slot.Empty.INSTANCE)) {
                                ((Slot.Task) slot2).resume();
                            }
                        }
                    }
                    result = cancellableContinuationImpl.getResult();
                    if (result != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                        DebugProbesKt.probeCoroutineSuspended(byteChannel$flush$1);
                    }
                    if (result != coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
                return Unit.INSTANCE;
            }
        }
        byteChannel$flush$1 = new ByteChannel$flush$1(this, continuation);
        Object obj2 = byteChannel$flush$1.result;
        coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = byteChannel$flush$1.label;
        if (i != 0) {
        }
        while (this.flushBufferSize >= 1048576) {
            byteChannel$flush$1.L$0 = byteChannel;
            byteChannel$flush$1.label = 1;
            CancellableContinuationImpl cancellableContinuationImpl2 = new CancellableContinuationImpl(IntrinsicsKt.intercepted(byteChannel$flush$1), 1);
            cancellableContinuationImpl2.initCancellability();
            Slot.Write write2 = new Slot.Write(cancellableContinuationImpl2);
            slot = (Slot) byteChannel.suspensionSlot;
            z = slot instanceof Slot.Closed;
            if (z) {
            }
            if (!(slot instanceof Slot.Write)) {
            }
            if (this.flushBufferSize >= 1048576) {
            }
            slot2 = (Slot) byteChannel.suspensionSlot;
            if (slot2 instanceof Slot.Write) {
                ((Slot.Task) slot2).resume();
            }
            result = cancellableContinuationImpl2.getResult();
            if (result != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            }
            if (result != coroutine_suspended) {
            }
        }
        return Unit.INSTANCE;
    }

    public void flushWriteBuffer() {
        if (this._writeBuffer.exhausted()) {
            return;
        }
        synchronized (this.flushBufferMutex) {
            int size = (int) this._writeBuffer.getSize();
            this.flushBuffer.transferFrom(this._writeBuffer);
            this.flushBufferSize += size;
            Unit unit = Unit.INSTANCE;
        }
        Slot slot = (Slot) this.suspensionSlot;
        if ((slot instanceof Slot.Read) && AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0.m(suspensionSlot$FU, this, slot, Slot.Empty.INSTANCE)) {
            ((Slot.Task) slot).resume();
        }
    }

    public void close() {
        flushWriteBuffer();
        if (AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0.m(_closedCause$FU, this, null, CloseTokenKt.getCLOSED())) {
            closeSlot(null);
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(10:0|1|(2:3|(7:5|6|7|(1:(1:10)(2:20|21))(3:22|23|(1:25))|11|12|(2:14|15)(2:17|18)))|28|6|7|(0)(0)|11|12|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0029, code lost:
    
        r5 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0047, code lost:
    
        r0 = kotlin.Result.INSTANCE;
        kotlin.Result.m8023constructorimpl(kotlin.ResultKt.createFailure(r5));
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    @Override // io.ktor.utils.io.ByteWriteChannel
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object flushAndClose(Continuation continuation) {
        ByteChannel$flushAndClose$1 byteChannel$flushAndClose$1;
        int i;
        if (continuation instanceof ByteChannel$flushAndClose$1) {
            byteChannel$flushAndClose$1 = (ByteChannel$flushAndClose$1) continuation;
            int i2 = byteChannel$flushAndClose$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                byteChannel$flushAndClose$1.label = i2 - Integer.MIN_VALUE;
                Object obj = byteChannel$flushAndClose$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = byteChannel$flushAndClose$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    Result.Companion companion = Result.INSTANCE;
                    byteChannel$flushAndClose$1.label = 1;
                    if (flush(byteChannel$flushAndClose$1) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                Result.m8023constructorimpl(Unit.INSTANCE);
                if (AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0.m(_closedCause$FU, this, null, CloseTokenKt.getCLOSED())) {
                    return Unit.INSTANCE;
                }
                closeSlot(null);
                return Unit.INSTANCE;
            }
        }
        byteChannel$flushAndClose$1 = new ByteChannel$flushAndClose$1(this, continuation);
        Object obj2 = byteChannel$flushAndClose$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = byteChannel$flushAndClose$1.label;
        if (i != 0) {
        }
        Result.m8023constructorimpl(Unit.INSTANCE);
        if (AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0.m(_closedCause$FU, this, null, CloseTokenKt.getCLOSED())) {
        }
    }

    @Override // io.ktor.utils.io.ByteReadChannel, io.ktor.utils.io.ByteWriteChannel
    public void cancel(Throwable th) {
        if (this._closedCause != null) {
            return;
        }
        CloseToken closeToken = new CloseToken(th);
        AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0.m(_closedCause$FU, this, null, closeToken);
        closeSlot(CloseToken.wrapCause$default(closeToken, null, 1, null));
    }

    public String toString() {
        return "ByteChannel[" + hashCode() + ']';
    }

    private final void closeSlot(Throwable th) {
        Slot slot = (Slot) suspensionSlot$FU.getAndSet(this, th != null ? new Slot.Closed(th) : Slot.Companion.getCLOSED());
        if (slot instanceof Slot.Task) {
            ((Slot.Task) slot).resume(th);
        }
    }

    /* compiled from: ByteChannel.kt */
    private interface Slot {
        public static final Companion Companion = Companion.$$INSTANCE;

        /* compiled from: ByteChannel.kt */
        public static final class Companion {
            static final /* synthetic */ Companion $$INSTANCE = new Companion();
            private static final Closed CLOSED = new Closed(null);
            private static final Object RESUME;

            private Companion() {
            }

            public final Closed getCLOSED() {
                return CLOSED;
            }

            static {
                Result.Companion companion = Result.INSTANCE;
                RESUME = Result.m8023constructorimpl(Unit.INSTANCE);
            }

            /* renamed from: getRESUME-d1pmJ48, reason: not valid java name */
            public final Object m8006getRESUMEd1pmJ48() {
                return RESUME;
            }
        }

        /* compiled from: ByteChannel.kt */
        public static final class Empty implements Slot {
            public static final Empty INSTANCE = new Empty();

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof Empty);
            }

            public int hashCode() {
                return -231472095;
            }

            public String toString() {
                return "Empty";
            }

            private Empty() {
            }
        }

        /* compiled from: ByteChannel.kt */
        public static final class Closed implements Slot {
            private final Throwable cause;

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof Closed) && Intrinsics.areEqual(this.cause, ((Closed) obj).cause);
            }

            public int hashCode() {
                Throwable th = this.cause;
                if (th == null) {
                    return 0;
                }
                return th.hashCode();
            }

            public String toString() {
                return "Closed(cause=" + this.cause + ')';
            }

            public Closed(Throwable th) {
                this.cause = th;
            }

            public final Throwable getCause() {
                return this.cause;
            }
        }

        /* compiled from: ByteChannel.kt */
        public interface Task extends Slot {
            Continuation getContinuation();

            Throwable getCreated();

            void resume();

            void resume(Throwable th);

            String taskName();

            /* compiled from: ByteChannel.kt */
            public static final class DefaultImpls {
                public static void resume(Task task) {
                    task.getContinuation().resumeWith(Slot.Companion.m8006getRESUMEd1pmJ48());
                }

                public static void resume(Task task, Throwable th) {
                    Object m8006getRESUMEd1pmJ48;
                    Continuation continuation = task.getContinuation();
                    if (th != null) {
                        Result.Companion companion = Result.INSTANCE;
                        m8006getRESUMEd1pmJ48 = Result.m8023constructorimpl(ResultKt.createFailure(th));
                    } else {
                        m8006getRESUMEd1pmJ48 = Slot.Companion.m8006getRESUMEd1pmJ48();
                    }
                    continuation.resumeWith(m8006getRESUMEd1pmJ48);
                }
            }
        }

        /* compiled from: ByteChannel.kt */
        public static final class Read implements Task {
            private final Continuation continuation;
            private Throwable created;

            public Read(Continuation continuation) {
                Intrinsics.checkNotNullParameter(continuation, "continuation");
                this.continuation = continuation;
                if (ByteChannel_jvmKt.getDEVELOPMENT_MODE()) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("ReadTask 0x");
                    String num = Integer.toString(getContinuation().hashCode(), CharsKt.checkRadix(16));
                    Intrinsics.checkNotNullExpressionValue(num, "toString(...)");
                    sb.append(num);
                    Throwable th = new Throwable(sb.toString());
                    ExceptionsKt.stackTraceToString(th);
                    setCreated(th);
                }
            }

            @Override // io.ktor.utils.io.ByteChannel.Slot.Task
            public Continuation getContinuation() {
                return this.continuation;
            }

            @Override // io.ktor.utils.io.ByteChannel.Slot.Task
            public void resume() {
                Task.DefaultImpls.resume(this);
            }

            @Override // io.ktor.utils.io.ByteChannel.Slot.Task
            public void resume(Throwable th) {
                Task.DefaultImpls.resume(this, th);
            }

            @Override // io.ktor.utils.io.ByteChannel.Slot.Task
            public Throwable getCreated() {
                return this.created;
            }

            public void setCreated(Throwable th) {
                this.created = th;
            }

            @Override // io.ktor.utils.io.ByteChannel.Slot.Task
            public String taskName() {
                return "read";
            }
        }

        /* compiled from: ByteChannel.kt */
        public static final class Write implements Task {
            private final Continuation continuation;
            private Throwable created;

            public Write(Continuation continuation) {
                Intrinsics.checkNotNullParameter(continuation, "continuation");
                this.continuation = continuation;
                if (ByteChannel_jvmKt.getDEVELOPMENT_MODE()) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("WriteTask 0x");
                    String num = Integer.toString(getContinuation().hashCode(), CharsKt.checkRadix(16));
                    Intrinsics.checkNotNullExpressionValue(num, "toString(...)");
                    sb.append(num);
                    Throwable th = new Throwable(sb.toString());
                    ExceptionsKt.stackTraceToString(th);
                    setCreated(th);
                }
            }

            @Override // io.ktor.utils.io.ByteChannel.Slot.Task
            public Continuation getContinuation() {
                return this.continuation;
            }

            @Override // io.ktor.utils.io.ByteChannel.Slot.Task
            public void resume() {
                Task.DefaultImpls.resume(this);
            }

            @Override // io.ktor.utils.io.ByteChannel.Slot.Task
            public void resume(Throwable th) {
                Task.DefaultImpls.resume(this, th);
            }

            @Override // io.ktor.utils.io.ByteChannel.Slot.Task
            public Throwable getCreated() {
                return this.created;
            }

            public void setCreated(Throwable th) {
                this.created = th;
            }

            @Override // io.ktor.utils.io.ByteChannel.Slot.Task
            public String taskName() {
                return "write";
            }
        }
    }
}
