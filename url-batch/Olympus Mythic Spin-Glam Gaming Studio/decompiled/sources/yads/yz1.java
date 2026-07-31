package yads;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* loaded from: classes6.dex */
public final class yz1 extends SuspendLambda implements Function2 {
    public final /* synthetic */ zz1 b;
    public final /* synthetic */ t8 c;
    public final /* synthetic */ s12 d;
    public final /* synthetic */ l02 e;
    public final /* synthetic */ uz1 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yz1(zz1 zz1Var, t8 t8Var, s12 s12Var, l02 l02Var, uz1 uz1Var, Continuation continuation) {
        super(2, continuation);
        this.b = zz1Var;
        this.c = t8Var;
        this.d = s12Var;
        this.e = l02Var;
        this.f = uz1Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new yz1(this.b, this.c, this.d, this.e, this.f, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((yz1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        new xz1(this.b, this.c, this.d, this.e, this.f).run();
        return Unit.INSTANCE;
    }
}
