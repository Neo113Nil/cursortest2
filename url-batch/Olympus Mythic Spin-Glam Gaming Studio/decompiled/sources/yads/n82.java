package yads;

import java.util.ArrayList;
import java.util.List;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.AwaitKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CompletableDeferredKt;
import kotlinx.coroutines.CoroutineScope;

/* loaded from: classes6.dex */
public final class n82 extends SuspendLambda implements Function2 {
    public int b;
    public /* synthetic */ Object c;
    public final /* synthetic */ List d;
    public final /* synthetic */ o82 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n82(List list, o82 o82Var, Continuation continuation) {
        super(2, continuation);
        this.d = list;
        this.e = o82Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        n82 n82Var = new n82(this.d, this.e, continuation);
        n82Var.c = obj;
        return n82Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((n82) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.b;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            CoroutineScope coroutineScope = (CoroutineScope) this.c;
            List<we3> list = this.d;
            o82 o82Var = this.e;
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
            for (we3 we3Var : list) {
                arrayList.add(we3Var.b.a ? BuildersKt__Builders_commonKt.async$default(coroutineScope, null, null, new m82(o82Var, we3Var, null), 3, null) : CompletableDeferredKt.CompletableDeferred(CollectionsKt.listOf(we3Var)));
            }
            this.b = 1;
            obj = AwaitKt.awaitAll(arrayList, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        return CollectionsKt.flatten((Iterable) obj);
    }
}
