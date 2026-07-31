package yads;

import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.TimeoutKt;

/* loaded from: classes5.dex */
public final class mj0 extends SuspendLambda implements Function2 {
    public int b;
    public final /* synthetic */ pj0 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mj0(pj0 pj0Var, Continuation continuation) {
        super(2, continuation);
        this.c = pj0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new mj0(this.c, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new mj0(this.c, (Continuation) obj2).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.b;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            pj0 pj0Var = this.c;
            AtomicBoolean atomicBoolean = pj0.e;
            pj0Var.getClass();
            List createListBuilder = CollectionsKt.createListBuilder();
            String a = jb3.a(pj0Var.c.a(pj0Var.b));
            if (a != null) {
                createListBuilder.add(a);
            }
            List build = CollectionsKt.build(createListBuilder);
            if (build.isEmpty()) {
                boolean z = ob1.a;
                return Unit.INSTANCE;
            }
            pj0 pj0Var2 = this.c;
            this.b = 1;
            pj0Var2.getClass();
            Object withTimeout = TimeoutKt.withTimeout(2500L, new oj0(build, pj0Var2, null), this);
            if (withTimeout != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                withTimeout = Unit.INSTANCE;
            }
            if (withTimeout == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        return Unit.INSTANCE;
    }
}
