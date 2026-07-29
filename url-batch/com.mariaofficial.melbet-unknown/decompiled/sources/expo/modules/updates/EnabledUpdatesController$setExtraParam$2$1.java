package expo.modules.updates;

import expo.modules.kotlin.exception.CodedException;
import expo.modules.kotlin.exception.UnexpectedException;
import expo.modules.updates.manifest.ManifestMetadata;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CancellableContinuation;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: EnabledUpdatesController.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "expo.modules.updates.EnabledUpdatesController$setExtraParam$2$1", f = "EnabledUpdatesController.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes2.dex */
final class EnabledUpdatesController$setExtraParam$2$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ CancellableContinuation<Unit> $continuation;
    final /* synthetic */ String $key;
    final /* synthetic */ String $value;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ EnabledUpdatesController this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    EnabledUpdatesController$setExtraParam$2$1(EnabledUpdatesController enabledUpdatesController, String str, String str2, CancellableContinuation<? super Unit> cancellableContinuation, Continuation<? super EnabledUpdatesController$setExtraParam$2$1> continuation) {
        super(2, continuation);
        this.this$0 = enabledUpdatesController;
        this.$key = str;
        this.$value = str2;
        this.$continuation = cancellableContinuation;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        EnabledUpdatesController$setExtraParam$2$1 enabledUpdatesController$setExtraParam$2$1 = new EnabledUpdatesController$setExtraParam$2$1(this.this$0, this.$key, this.$value, this.$continuation, continuation);
        enabledUpdatesController$setExtraParam$2$1.L$0 = obj;
        return enabledUpdatesController$setExtraParam$2$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((EnabledUpdatesController$setExtraParam$2$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object m790constructorimpl;
        UnexpectedException unexpectedException;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        EnabledUpdatesController enabledUpdatesController = this.this$0;
        String str = this.$key;
        String str2 = this.$value;
        CancellableContinuation<Unit> cancellableContinuation = this.$continuation;
        try {
            Result.Companion companion = Result.INSTANCE;
            ManifestMetadata.INSTANCE.setExtraParam(enabledUpdatesController.databaseHolder.getDatabase(), enabledUpdatesController.updatesConfiguration, str, str2);
            Result.Companion companion2 = Result.INSTANCE;
            cancellableContinuation.resumeWith(Result.m790constructorimpl(Unit.INSTANCE));
            m790constructorimpl = Result.m790constructorimpl(Unit.INSTANCE);
        } catch (Throwable th) {
            Result.Companion companion3 = Result.INSTANCE;
            m790constructorimpl = Result.m790constructorimpl(ResultKt.createFailure(th));
        }
        CancellableContinuation<Unit> cancellableContinuation2 = this.$continuation;
        Throwable m793exceptionOrNullimpl = Result.m793exceptionOrNullimpl(m790constructorimpl);
        if (m793exceptionOrNullimpl != null) {
            CancellableContinuation<Unit> cancellableContinuation3 = cancellableContinuation2;
            if (m793exceptionOrNullimpl == null) {
                unexpectedException = new UnexpectedException("Unknown error");
            } else if (m793exceptionOrNullimpl instanceof CodedException) {
                unexpectedException = (CodedException) m793exceptionOrNullimpl;
            } else if (m793exceptionOrNullimpl instanceof expo.modules.core.errors.CodedException) {
                expo.modules.core.errors.CodedException codedException = (expo.modules.core.errors.CodedException) m793exceptionOrNullimpl;
                String code = codedException.getCode();
                Intrinsics.checkNotNullExpressionValue(code, "getCode(...)");
                unexpectedException = new CodedException(code, codedException.getMessage(), codedException.getCause());
            } else {
                unexpectedException = new UnexpectedException(m793exceptionOrNullimpl);
            }
            Result.Companion companion4 = Result.INSTANCE;
            cancellableContinuation3.resumeWith(Result.m790constructorimpl(ResultKt.createFailure(unexpectedException)));
        }
        return Unit.INSTANCE;
    }
}
