package yads;

import android.content.Context;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.SupervisorKt;

/* loaded from: classes3.dex */
public final class aq1 extends SuspendLambda implements Function2 {
    public int b;
    public final /* synthetic */ com.monetization.ads.mediation.base.initialize.a c;
    public final /* synthetic */ Context d;
    public final /* synthetic */ ap e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aq1(com.monetization.ads.mediation.base.initialize.a aVar, Context context, ap apVar, Continuation continuation) {
        super(2, continuation);
        this.c = aVar;
        this.d = context;
        this.e = apVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new aq1(this.c, this.d, this.e, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((aq1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object obj2;
        Collection<rs1> emptyList;
        List list;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.b;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            com.monetization.ads.mediation.base.initialize.a aVar = this.c;
            Context context = this.d;
            ap apVar = this.e;
            this.b = 1;
            AtomicBoolean atomicBoolean = com.monetization.ads.mediation.base.initialize.a.g;
            aVar.getClass();
            if (com.monetization.ads.mediation.base.initialize.a.g.getAndSet(false)) {
                aVar.b.getClass();
                vs1 vs1Var = apVar.c;
                if (vs1Var == null || (list = vs1Var.c) == null) {
                    emptyList = CollectionsKt.emptyList();
                } else {
                    emptyList = new ArrayList();
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        CollectionsKt.addAll(emptyList, ((ms1) it.next()).c);
                    }
                }
                ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(emptyList, 10));
                for (rs1 rs1Var : emptyList) {
                    aVar.c.getClass();
                    arrayList.add(new er1(rs1Var.b, rs1Var.c, null, null, null, null, null, null));
                }
                obj2 = SupervisorKt.supervisorScope(new eq1(aVar.e.a(arrayList), aVar, context, null), this);
                if (obj2 != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                    obj2 = Unit.INSTANCE;
                }
                if (obj2 != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                    obj2 = Unit.INSTANCE;
                }
            } else {
                obj2 = Unit.INSTANCE;
            }
            if (obj2 == coroutine_suspended) {
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
