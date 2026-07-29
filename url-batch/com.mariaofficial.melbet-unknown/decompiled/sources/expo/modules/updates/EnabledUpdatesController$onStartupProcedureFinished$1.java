package expo.modules.updates;

import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CompletableDeferred;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.sync.Mutex;

/* compiled from: EnabledUpdatesController.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "expo.modules.updates.EnabledUpdatesController$onStartupProcedureFinished$1", f = "EnabledUpdatesController.kt", i = {0}, l = {319}, m = "invokeSuspend", n = {"$this$withLock_u24default$iv"}, s = {"L$0"})
/* loaded from: classes2.dex */
final class EnabledUpdatesController$onStartupProcedureFinished$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ EnabledUpdatesController this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    EnabledUpdatesController$onStartupProcedureFinished$1(EnabledUpdatesController enabledUpdatesController, Continuation<? super EnabledUpdatesController$onStartupProcedureFinished$1> continuation) {
        super(2, continuation);
        this.this$0 = enabledUpdatesController;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new EnabledUpdatesController$onStartupProcedureFinished$1(this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((EnabledUpdatesController$onStartupProcedureFinished$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Mutex mutex;
        EnabledUpdatesController enabledUpdatesController;
        CompletableDeferred completableDeferred;
        CompletableDeferred completableDeferred2;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            mutex = this.this$0.startupFinishedMutex;
            EnabledUpdatesController enabledUpdatesController2 = this.this$0;
            this.L$0 = mutex;
            this.L$1 = enabledUpdatesController2;
            this.label = 1;
            if (mutex.lock(null, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            enabledUpdatesController = enabledUpdatesController2;
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            enabledUpdatesController = (EnabledUpdatesController) this.L$1;
            mutex = (Mutex) this.L$0;
            ResultKt.throwOnFailure(obj);
        }
        try {
            completableDeferred = enabledUpdatesController.startupFinishedDeferred;
            if (!completableDeferred.isCompleted()) {
                completableDeferred2 = enabledUpdatesController.startupFinishedDeferred;
                completableDeferred2.complete(Unit.INSTANCE);
            }
            Unit unit = Unit.INSTANCE;
            mutex.unlock(null);
            return Unit.INSTANCE;
        } catch (Throwable th) {
            mutex.unlock(null);
            throw th;
        }
    }
}
