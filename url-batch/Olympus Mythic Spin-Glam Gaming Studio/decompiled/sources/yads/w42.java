package yads;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CancellableContinuationImpl;

/* loaded from: classes6.dex */
public final class w42 extends SuspendLambda implements Function2 {
    public int b;
    public final /* synthetic */ z42 c;
    public final /* synthetic */ dz1 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w42(z42 z42Var, dz1 dz1Var, Continuation continuation) {
        super(2, continuation);
        this.c = z42Var;
        this.d = dz1Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new w42(this.c, this.d, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new w42(this.c, this.d, (Continuation) obj2).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.b;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            o52 o52Var = this.c.c;
            dz1 dz1Var = this.d;
            this.b = 1;
            o52Var.getClass();
            CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(IntrinsicsKt.intercepted(this), 1);
            cancellableContinuationImpl.initCancellability();
            if (o52Var.a != null) {
                o52Var.b.getClass();
                List list = dz1Var.a.a;
                ArrayList arrayList = new ArrayList();
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    CollectionsKt.addAll(arrayList, fn1.a((ry1) it.next()));
                }
                ArrayList arrayList2 = new ArrayList();
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    de3 de3Var = ((dn1) it2.next()).b;
                    List list2 = de3Var != null ? de3Var.a : null;
                    if (list2 == null) {
                        list2 = CollectionsKt.emptyList();
                    }
                    CollectionsKt.addAll(arrayList2, list2);
                }
                if (!arrayList2.isEmpty()) {
                    Iterator it3 = arrayList2.iterator();
                    while (it3.hasNext()) {
                        if (!((we3) it3.next()).b.n.isEmpty()) {
                            o52Var.a.a(new n52(cancellableContinuationImpl));
                            break;
                        }
                    }
                }
            }
            Result.Companion companion = Result.INSTANCE;
            cancellableContinuationImpl.resumeWith(Result.m8023constructorimpl(Unit.INSTANCE));
            Object result = cancellableContinuationImpl.getResult();
            if (result == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                DebugProbesKt.probeCoroutineSuspended(this);
            }
            if (result != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                result = Unit.INSTANCE;
            }
            if (result == coroutine_suspended) {
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
