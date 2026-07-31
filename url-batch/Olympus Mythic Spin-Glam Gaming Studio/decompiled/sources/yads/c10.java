package yads;

import android.content.Context;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* loaded from: classes3.dex */
public final class c10 extends SuspendLambda implements Function2 {
    public final /* synthetic */ h10 b;
    public final /* synthetic */ d8 c;
    public final /* synthetic */ us3 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c10(h10 h10Var, d8 d8Var, us3 us3Var, Continuation continuation) {
        super(2, continuation);
        this.b = h10Var;
        this.c = d8Var;
        this.d = us3Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new c10(this.b, this.c, this.d, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((c10) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        h10 h10Var = this.b;
        Context context = h10Var.b;
        Context context2 = h10Var.a.a;
        q12 q12Var = new q12(context, pr.a(context2, context2));
        f12 f12Var = this.b.d;
        d8 d8Var = this.c;
        e52 e52Var = e52.c;
        us3 us3Var = this.d;
        f12Var.getClass();
        g12 g12Var = new g12(f12Var.a, f12Var.b, new p12(d8Var, e52Var, q12Var, 1), f12Var, f12Var.c);
        f12Var.d.add(g12Var);
        l12 l12Var = g12Var.b.z;
        l12Var.d = us3Var;
        l12Var.c.a(us3Var, null, null);
        g12Var.b();
        return Unit.INSTANCE;
    }
}
