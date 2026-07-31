package yads;

import android.content.SharedPreferences;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* loaded from: classes10.dex */
public final class iv2 extends SuspendLambda implements Function2 {
    public final /* synthetic */ pv2 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public iv2(pv2 pv2Var, Continuation continuation) {
        super(2, continuation);
        this.b = pv2Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new iv2(this.b, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new iv2(this.b, (Continuation) obj2).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        ((SharedPreferences) ((qg1) sg1.a(this.b.h, "YadPreferenceFile")).d.getValue()).getAll();
        return Unit.INSTANCE;
    }
}
