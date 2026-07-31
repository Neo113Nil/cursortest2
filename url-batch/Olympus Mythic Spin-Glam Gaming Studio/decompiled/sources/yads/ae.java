package yads;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CompletableDeferred;
import kotlinx.coroutines.CompletableDeferredKt;
import kotlinx.coroutines.TimeoutKt;

/* loaded from: classes5.dex */
public final class ae extends SuspendLambda implements Function2 {
    public int b;
    public final /* synthetic */ be c;
    public final /* synthetic */ long d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ae(be beVar, long j, Continuation continuation) {
        super(2, continuation);
        this.c = beVar;
        this.d = j;
    }

    public static final void a(CompletableDeferred completableDeferred) {
        completableDeferred.complete(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ae(this.c, this.d, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new ae(this.c, this.d, (Continuation) obj2).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.b;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            final CompletableDeferred CompletableDeferred$default = CompletableDeferredKt.CompletableDeferred$default(null, 1, null);
            this.c.b.post(new Runnable() { // from class: yads.ae$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    ae.a(CompletableDeferred.this);
                }
            });
            long j = this.d;
            zd zdVar = new zd(CompletableDeferred$default, null);
            this.b = 1;
            obj = TimeoutKt.withTimeoutOrNull(j, zdVar, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        return Boxing.boxBoolean(obj != null);
    }
}
