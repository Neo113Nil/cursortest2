package expo.modules.updates.procedures;

import expo.modules.updates.procedures.StateMachineSerialExecutorQueue;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CompletableDeferred;
import kotlinx.coroutines.CompletableDeferredKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.channels.Channel;
import kotlinx.coroutines.sync.Mutex;

/* compiled from: StateMachineSerialExecutorQueue.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "expo.modules.updates.procedures.StateMachineSerialExecutorQueue$queueExecution$1", f = "StateMachineSerialExecutorQueue.kt", i = {0, 1}, l = {95, 84}, m = "invokeSuspend", n = {"$this$withLock_u24default$iv", "$this$withLock_u24default$iv"}, s = {"L$0", "L$0"})
/* loaded from: classes2.dex */
final class StateMachineSerialExecutorQueue$queueExecution$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ StateMachineProcedure $stateMachineProcedure;
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ StateMachineSerialExecutorQueue this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    StateMachineSerialExecutorQueue$queueExecution$1(StateMachineSerialExecutorQueue stateMachineSerialExecutorQueue, StateMachineProcedure stateMachineProcedure, Continuation<? super StateMachineSerialExecutorQueue$queueExecution$1> continuation) {
        super(2, continuation);
        this.this$0 = stateMachineSerialExecutorQueue;
        this.$stateMachineProcedure = stateMachineProcedure;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new StateMachineSerialExecutorQueue$queueExecution$1(this.this$0, this.$stateMachineProcedure, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((StateMachineSerialExecutorQueue$queueExecution$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x004e, code lost:
    
        if (r9.lock(null, r8) == r0) goto L19;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Mutex mutex;
        StateMachineSerialExecutorQueue stateMachineSerialExecutorQueue;
        StateMachineProcedure stateMachineProcedure;
        Mutex mutex2;
        Throwable th;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        try {
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                mutex = this.this$0.mutex;
                stateMachineSerialExecutorQueue = this.this$0;
                stateMachineProcedure = this.$stateMachineProcedure;
                this.L$0 = mutex;
                this.L$1 = stateMachineSerialExecutorQueue;
                this.L$2 = stateMachineProcedure;
                this.label = 1;
            } else {
                if (i != 1) {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    mutex2 = (Mutex) this.L$0;
                    try {
                        ResultKt.throwOnFailure(obj);
                        Unit unit = Unit.INSTANCE;
                        mutex2.unlock(null);
                        return Unit.INSTANCE;
                    } catch (Throwable th2) {
                        th = th2;
                        mutex2.unlock(null);
                        throw th;
                    }
                }
                stateMachineProcedure = (StateMachineProcedure) this.L$2;
                stateMachineSerialExecutorQueue = (StateMachineSerialExecutorQueue) this.L$1;
                Mutex mutex3 = (Mutex) this.L$0;
                ResultKt.throwOnFailure(obj);
                mutex = mutex3;
            }
            CompletableDeferred CompletableDeferred$default = CompletableDeferredKt.CompletableDeferred$default(null, 1, null);
            Channel channel = stateMachineSerialExecutorQueue.procedureChannel;
            StateMachineSerialExecutorQueue.ProcedureHolder procedureHolder = new StateMachineSerialExecutorQueue.ProcedureHolder(stateMachineProcedure, CompletableDeferred$default);
            this.L$0 = mutex;
            this.L$1 = null;
            this.L$2 = null;
            this.label = 2;
            if (channel.send(procedureHolder, this) != coroutine_suspended) {
                mutex2 = mutex;
                Unit unit2 = Unit.INSTANCE;
                mutex2.unlock(null);
                return Unit.INSTANCE;
            }
            return coroutine_suspended;
        } catch (Throwable th3) {
            mutex2 = mutex;
            th = th3;
            mutex2.unlock(null);
            throw th;
        }
    }
}
