package yads;

import java.util.ArrayList;
import java.util.Iterator;
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
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Deferred;

/* loaded from: classes3.dex */
public final class nv0 extends SuspendLambda implements Function2 {
    public int b;
    public /* synthetic */ Object c;
    public final /* synthetic */ List d;
    public final /* synthetic */ pv0 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nv0(List list, pv0 pv0Var, Continuation continuation) {
        super(2, continuation);
        this.d = list;
        this.e = pv0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        nv0 nv0Var = new nv0(this.d, this.e, continuation);
        nv0Var.c = obj;
        return nv0Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((nv0) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Deferred async$default;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.b;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            CoroutineScope coroutineScope = (CoroutineScope) this.c;
            List list = this.d;
            pv0 pv0Var = this.e;
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                async$default = BuildersKt__Builders_commonKt.async$default(coroutineScope, null, null, new mv0(pv0Var, (fn2) it.next(), null), 3, null);
                arrayList.add(async$default);
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
        return obj;
    }
}
