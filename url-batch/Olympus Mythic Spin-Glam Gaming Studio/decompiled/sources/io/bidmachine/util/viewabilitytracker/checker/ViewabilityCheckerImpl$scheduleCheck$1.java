package io.bidmachine.util.viewabilitytracker.checker;

import android.view.View;
import io.bidmachine.util.Error;
import io.bidmachine.util.log.LoggerInstance;
import io.bidmachine.util.log.TagLogger;
import io.bidmachine.util.viewabilitytracker.model.ViewabilityMeasurement;
import io.bidmachine.util.viewabilitytracker.model.ViewabilityRule;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.DelayKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: ViewabilityCheckerImpl.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 7, 1}, xi = 48)
@DebugMetadata(c = "io.bidmachine.util.viewabilitytracker.checker.ViewabilityCheckerImpl$scheduleCheck$1", f = "ViewabilityCheckerImpl.kt", l = {100}, m = "invokeSuspend")
/* loaded from: classes9.dex */
final class ViewabilityCheckerImpl$scheduleCheck$1 extends SuspendLambda implements Function2 {
    final /* synthetic */ long $delayMs;
    int label;
    final /* synthetic */ ViewabilityCheckerImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ViewabilityCheckerImpl$scheduleCheck$1(long j, ViewabilityCheckerImpl viewabilityCheckerImpl, Continuation continuation) {
        super(2, continuation);
        this.$delayMs = j;
        this.this$0 = viewabilityCheckerImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation create(@Nullable Object obj, @NotNull Continuation continuation) {
        return new ViewabilityCheckerImpl$scheduleCheck$1(this.$delayMs, this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation continuation) {
        return ((ViewabilityCheckerImpl$scheduleCheck$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        View view;
        ViewabilityRule viewabilityRule;
        TagLogger tagLogger;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            long j = this.$delayMs;
            if (j > 0) {
                this.label = 1;
                if (DelayKt.delay(j, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        try {
            view = this.this$0.getView();
        } catch (Throwable unused) {
            this.this$0.processCheckFail();
        }
        if (view == null) {
            this.this$0.stopCheck();
            return Unit.INSTANCE;
        }
        if (this.this$0.check(view)) {
            viewabilityRule = this.this$0.viewabilityRule;
            ViewabilityMeasurement viewabilityMeasurement = viewabilityRule.getViewabilityMeasurement();
            if (this.this$0.getCheckCount().incrementAndGet() >= viewabilityMeasurement.getCount()) {
                this.this$0.notifyCheckSuccessful();
            } else {
                long intervalMs = viewabilityMeasurement.getIntervalMs();
                if (intervalMs > 0) {
                    this.this$0.scheduleCheck(intervalMs);
                } else {
                    Error error = new Error("Can't schedule check - intervalMs must be greater than 0");
                    tagLogger = this.this$0.logger;
                    LoggerInstance.e$default(tagLogger, (Object) null, error, 1, (Object) null);
                    this.this$0.notifyCheckFailed(error);
                }
            }
        } else {
            this.this$0.processCheckFail();
        }
        return Unit.INSTANCE;
    }
}
