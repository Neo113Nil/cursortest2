package yads;

import android.content.Context;
import android.os.Build;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* loaded from: classes4.dex */
public final class yg extends SuspendLambda implements Function2 {
    public final /* synthetic */ Context b;
    public final /* synthetic */ nt3 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yg(Context context, Continuation continuation, nt3 nt3Var) {
        super(2, continuation);
        this.b = context;
        this.c = nt3Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new yg(this.b, continuation, this.c);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new yg(this.b, (Continuation) obj2, this.c).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        ua3.a(this.b, this.c.a());
        pe.a(this.b, this.c.a());
        if (Build.VERSION.SDK_INT >= 30) {
            AtomicBoolean atomicBoolean = kh.a;
            kh.a(this.b, this.c.a());
        }
        rh1 rh1Var = new rh1();
        Boolean a = rh1.a(this.b);
        if (a != null) {
            jv1.b(a.booleanValue());
        }
        Boolean b = rh1.b(this.b);
        if (b != null) {
            jv1.a(b.booleanValue());
        }
        if (pa.a(this.b)) {
            nu1 a2 = ou1.a(this.b);
            if (a2 instanceof mu1) {
                ab1.a(new cb1().a((mu1) a2), new Object[0]);
            } else if (a2 instanceof lu1) {
                ab1.b("Yandex Mobile Ads 8.1.0 integrated successfully", new Object[0]);
            }
            rr1 rr1Var = new rr1();
            String str = dr1.d;
            fs1.a(new is1(rr1Var).a(new ds1().a(br1.a())));
        }
        ww2 ww2Var = new ww2(rh1Var, this.c);
        h1.a(this.b);
        ww2Var.a(this.b);
        return Unit.INSTANCE;
    }
}
