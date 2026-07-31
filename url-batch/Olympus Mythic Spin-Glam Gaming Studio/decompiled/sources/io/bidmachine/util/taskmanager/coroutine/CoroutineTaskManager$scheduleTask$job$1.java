package io.bidmachine.util.taskmanager.coroutine;

import io.bidmachine.util.taskmanager.SuspendCancellableTask;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.DelayKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: CoroutineTaskManager.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 7, 1}, xi = 48)
@DebugMetadata(c = "io.bidmachine.util.taskmanager.coroutine.CoroutineTaskManager$scheduleTask$job$1", f = "CoroutineTaskManager.kt", l = {25, 29}, m = "invokeSuspend")
/* loaded from: classes9.dex */
final class CoroutineTaskManager$scheduleTask$job$1 extends SuspendLambda implements Function2 {
    final /* synthetic */ long $delayMs;
    final /* synthetic */ Runnable $task;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ CoroutineTaskManager this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CoroutineTaskManager$scheduleTask$job$1(long j, Runnable runnable, CoroutineTaskManager coroutineTaskManager, Continuation continuation) {
        super(2, continuation);
        this.$delayMs = j;
        this.$task = runnable;
        this.this$0 = coroutineTaskManager;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation create(@Nullable Object obj, @NotNull Continuation continuation) {
        CoroutineTaskManager$scheduleTask$job$1 coroutineTaskManager$scheduleTask$job$1 = new CoroutineTaskManager$scheduleTask$job$1(this.$delayMs, this.$task, this.this$0, continuation);
        coroutineTaskManager$scheduleTask$job$1.L$0 = obj;
        return coroutineTaskManager$scheduleTask$job$1;
    }

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation continuation) {
        return ((CoroutineTaskManager$scheduleTask$job$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(14:0|1|(1:2)|(1:(1:(8:6|7|8|9|10|11|12|13)(2:18|19))(2:20|21))(3:30|31|(2:33|(1:35)))|22|23|(2:25|(1:27))(1:28)|8|9|10|11|12|13|(1:(0))) */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(@NotNull Object obj) {
        CoroutineScope coroutineScope;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        try {
            try {
            } finally {
                try {
                    this.this$0.cancelTask(this.$task);
                    Unit unit = Unit.INSTANCE;
                } catch (Throwable unused) {
                }
            }
        } catch (Throwable unused2) {
        }
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            coroutineScope = (CoroutineScope) this.L$0;
            long j = this.$delayMs;
            if (j > 0) {
                this.L$0 = coroutineScope;
                this.label = 1;
                if (DelayKt.delay(j, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
        } else {
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                Unit unit2 = Unit.INSTANCE;
                this.this$0.cancelTask(this.$task);
                Unit unit3 = Unit.INSTANCE;
                return Unit.INSTANCE;
            }
            coroutineScope = (CoroutineScope) this.L$0;
            ResultKt.throwOnFailure(obj);
        }
        Runnable runnable = this.$task;
        if (runnable instanceof SuspendCancellableTask) {
            CoroutineContext coroutineContext = coroutineScope.getCoroutineContext();
            this.L$0 = coroutineScope;
            this.label = 2;
            if (((SuspendCancellableTask) runnable).runSuspend(coroutineContext, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            runnable.run();
        }
        Unit unit22 = Unit.INSTANCE;
        this.this$0.cancelTask(this.$task);
        Unit unit32 = Unit.INSTANCE;
        return Unit.INSTANCE;
    }
}
