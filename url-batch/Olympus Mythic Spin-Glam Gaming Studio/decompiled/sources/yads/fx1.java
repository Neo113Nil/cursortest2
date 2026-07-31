package yads;

import android.content.Context;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.CoroutineScope;

/* loaded from: classes14.dex */
public final class fx1 extends SuspendLambda implements Function2 {
    public int b;
    public final /* synthetic */ Context c;
    public final /* synthetic */ ij1 d;
    public final /* synthetic */ al1 e;
    public final /* synthetic */ gx1 f;
    public final /* synthetic */ t8 g;
    public final /* synthetic */ boolean h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fx1(Context context, ij1 ij1Var, al1 al1Var, gx1 gx1Var, t8 t8Var, boolean z, Continuation continuation) {
        super(2, continuation);
        this.c = context;
        this.d = ij1Var;
        this.e = al1Var;
        this.f = gx1Var;
        this.g = t8Var;
        this.h = z;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new fx1(this.c, this.d, this.e, this.f, this.g, this.h, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((fx1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        xn3 xn3Var;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.b;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            ix1 a = ix1.c.a(this.c);
            if (a.b.size() != a.a) {
                if (!a.b.containsKey(this.d) && this.e != null) {
                    rs2 rs2Var = this.f.a;
                    Context context = this.c;
                    String str = this.g.G;
                    if (str != null) {
                        xn3.c.getClass();
                        xn3Var = (xn3) xn3.d.get(str);
                        if (xn3Var == null) {
                            xn3Var = xn3.e;
                        }
                    } else {
                        xn3Var = xn3.e;
                    }
                    vn3 vn3Var = new vn3(xn3Var);
                    xw1 xw1Var = null;
                    try {
                        xw1Var = new xw1(context, vn3Var, null);
                    } catch (Throwable unused) {
                    }
                    if (xw1Var == null) {
                        return Unit.INSTANCE;
                    }
                    ij1 ij1Var = this.d;
                    al1 al1Var = this.e;
                    boolean z = this.h;
                    this.b = 1;
                    CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(IntrinsicsKt.intercepted(this), 1);
                    cancellableContinuationImpl.initCancellability();
                    dx1 dx1Var = new dx1(a, ij1Var, new ex1(z, cancellableContinuationImpl));
                    if (a.b.size() < a.a) {
                        a.b.put(ij1Var, xw1Var);
                    }
                    if (al1Var instanceof yk1) {
                        xw1Var.a(((yk1) al1Var).a, (ww1) dx1Var);
                    } else if (al1Var instanceof zk1) {
                        xw1Var.a(((zk1) al1Var).a, dx1Var);
                    }
                    if (!z && cancellableContinuationImpl.isActive()) {
                        Result.Companion companion = Result.INSTANCE;
                        cancellableContinuationImpl.resumeWith(Result.m8023constructorimpl(Unit.INSTANCE));
                    }
                    Object result = cancellableContinuationImpl.getResult();
                    if (result == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                        DebugProbesKt.probeCoroutineSuspended(this);
                    }
                    if (result == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
            }
            return Unit.INSTANCE;
        }
        if (i != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        return Unit.INSTANCE;
    }
}
