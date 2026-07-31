package yads;

import android.content.Context;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* loaded from: classes10.dex */
public final class vz1 extends SuspendLambda implements Function2 {
    public final /* synthetic */ zz1 b;
    public final /* synthetic */ dz1 c;
    public final /* synthetic */ ri2 d;
    public final /* synthetic */ xz1 e;
    public final /* synthetic */ wz1 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vz1(zz1 zz1Var, dz1 dz1Var, ri2 ri2Var, xz1 xz1Var, wz1 wz1Var, Continuation continuation) {
        super(2, continuation);
        this.b = zz1Var;
        this.c = dz1Var;
        this.d = ri2Var;
        this.e = xz1Var;
        this.f = wz1Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new vz1(this.b, this.c, this.d, this.e, this.f, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((vz1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        zz1 zz1Var = this.b;
        b02 b02Var = zz1Var.f;
        Context context = zz1Var.e;
        dz1 dz1Var = this.c;
        ri2 ri2Var = this.d;
        l02 l02Var = this.e.d;
        uz1 uz1Var = this.f.a;
        ez1 ez1Var = (ez1) b02Var.d.a.get(b02Var.a.f);
        if (ez1Var != null) {
            ez1Var.a(context, dz1Var, ri2Var, b02Var.c, l02Var, b02Var.b, uz1Var);
        } else {
            uz1Var.a(e8.a);
        }
        return Unit.INSTANCE;
    }
}
