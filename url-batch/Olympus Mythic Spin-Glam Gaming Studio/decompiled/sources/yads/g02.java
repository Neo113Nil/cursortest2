package yads;

import android.content.Context;
import android.view.View;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* loaded from: classes11.dex */
public final class g02 extends SuspendLambda implements Function2 {
    public int b;
    public final /* synthetic */ h02 c;
    public final /* synthetic */ View d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g02(h02 h02Var, View view, Continuation continuation) {
        super(2, continuation);
        this.c = h02Var;
        this.d = view;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new g02(this.c, this.d, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new g02(this.c, this.d, (Continuation) obj2).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object a;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.b;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            h02 h02Var = this.c;
            r3 r3Var = h02Var.b;
            View view = this.d;
            ph phVar = h02Var.a;
            kf1 kf1Var = h02Var.e;
            a22 a22Var = h02Var.c;
            this.b = 1;
            d1 d1Var = r3Var.d.b;
            c1 c1Var = new c1(d1Var.e, d1Var.a, d1Var.b, d1Var.c, d1Var.d, kf1Var.b);
            d1Var.f = c1Var;
            w22 w22Var = d1Var.g;
            if (w22Var != null) {
                d1Var.g = w22Var;
                c1Var.b.k = w22Var;
            }
            Context context = view.getContext();
            x8 x8Var = r3Var.i.a;
            mz1 mz1Var = r3Var.g;
            hv hvVar = new hv(mz1Var.d, mz1Var.c, mz1Var.a, mz1Var.b, new nz1(phVar.a, mz1Var.e, a22Var.b));
            c63 a2 = r3Var.e.a(context, r3Var.a, r3Var.c, r3Var.b, x8Var, kf1Var.f);
            j52 j52Var = new j52(a2);
            k52 k52Var = new k52(new i52(a2), r3Var.h);
            a = r3Var.a(view, kf1Var, new s0(r3Var.c, r3Var.a, r3Var.b, hvVar, j52Var, r3Var.d, r3Var.h, k52Var, r3Var.k), k52Var, new g32(hvVar), this);
            if (a == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            a = obj;
        }
        if (((oz0) a).a) {
            this.c.f.a();
        }
        return Unit.INSTANCE;
    }
}
