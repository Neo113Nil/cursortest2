package yads;

import android.content.Context;
import java.util.ArrayList;
import java.util.List;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Deferred;

/* loaded from: classes4.dex */
public final class ph2 extends SuspendLambda implements Function2 {
    public /* synthetic */ Object b;
    public final /* synthetic */ List c;
    public final /* synthetic */ rh2 d;
    public final /* synthetic */ Context e;
    public final /* synthetic */ e00 f;
    public final /* synthetic */ l03 g;
    public final /* synthetic */ long h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ph2(long j, Context context, List list, Continuation continuation, e00 e00Var, rh2 rh2Var, l03 l03Var) {
        super(2, continuation);
        this.c = list;
        this.d = rh2Var;
        this.e = context;
        this.f = e00Var;
        this.g = l03Var;
        this.h = j;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        List list = this.c;
        rh2 rh2Var = this.d;
        ph2 ph2Var = new ph2(this.h, this.e, list, continuation, this.f, rh2Var, this.g);
        ph2Var.b = obj;
        return ph2Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((ph2) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Deferred async$default;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        CoroutineScope coroutineScope = (CoroutineScope) this.b;
        List<rs1> list = this.c;
        rh2 rh2Var = this.d;
        Context context = this.e;
        e00 e00Var = this.f;
        l03 l03Var = this.g;
        long j = this.h;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        for (rs1 rs1Var : list) {
            rh2Var.getClass();
            ArrayList arrayList2 = arrayList;
            async$default = BuildersKt__Builders_commonKt.async$default(coroutineScope, null, null, new mh2(rh2Var, rs1Var, context, e00Var, j, l03Var, null), 3, null);
            arrayList2.add(async$default);
            arrayList = arrayList2;
            j = j;
        }
        return arrayList;
    }
}
