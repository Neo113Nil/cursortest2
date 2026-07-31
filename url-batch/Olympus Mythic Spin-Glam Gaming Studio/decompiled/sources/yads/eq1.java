package yads;

import android.content.Context;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;

/* loaded from: classes8.dex */
public final class eq1 extends SuspendLambda implements Function2 {
    public /* synthetic */ Object b;
    public final /* synthetic */ ArrayList c;
    public final /* synthetic */ com.monetization.ads.mediation.base.initialize.a d;
    public final /* synthetic */ Context e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public eq1(ArrayList arrayList, com.monetization.ads.mediation.base.initialize.a aVar, Context context, Continuation continuation) {
        super(2, continuation);
        this.c = arrayList;
        this.d = aVar;
        this.e = context;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        eq1 eq1Var = new eq1(this.c, this.d, this.e, continuation);
        eq1Var.b = obj;
        return eq1Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((eq1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        CoroutineScope coroutineScope = (CoroutineScope) this.b;
        ArrayList arrayList = this.c;
        com.monetization.ads.mediation.base.initialize.a aVar = this.d;
        Context context = this.e;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new dq1(aVar, context, (er1) it.next(), null), 3, null);
        }
        return Unit.INSTANCE;
    }
}
