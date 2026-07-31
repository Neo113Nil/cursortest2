package yads;

import java.util.Iterator;
import java.util.List;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;

/* loaded from: classes15.dex */
public final class oj0 extends SuspendLambda implements Function2 {
    public /* synthetic */ Object b;
    public final /* synthetic */ List c;
    public final /* synthetic */ pj0 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oj0(List list, pj0 pj0Var, Continuation continuation) {
        super(2, continuation);
        this.c = list;
        this.d = pj0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        oj0 oj0Var = new oj0(this.c, this.d, continuation);
        oj0Var.b = obj;
        return oj0Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((oj0) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        CoroutineScope coroutineScope = (CoroutineScope) this.b;
        List list = this.c;
        pj0 pj0Var = this.d;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new nj0(pj0Var, (String) it.next(), null), 3, null);
        }
        return Unit.INSTANCE;
    }
}
