package yads;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.MainCoroutineDispatcher;

/* loaded from: classes3.dex */
public final class mm extends SuspendLambda implements Function2 {
    public int b;
    public final /* synthetic */ wm c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mm(wm wmVar, Continuation continuation) {
        super(2, continuation);
        this.c = wmVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new mm(this.c, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new mm(this.c, (Continuation) obj2).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object obj2;
        vw2 vw2Var;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.b;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            pv2 pv2Var = this.c.j;
            k51 k51Var = k51.d;
            this.b = 1;
            obj = pv2Var.a(k51Var, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    return Unit.INSTANCE;
                }
                ResultKt.throwOnFailure(obj);
                wm wmVar = this.c;
                wmVar.a((db3) wmVar.g);
                return Unit.INSTANCE;
            }
            ResultKt.throwOnFailure(obj);
        }
        dv2 dv2Var = (dv2) obj;
        if (!(dv2Var instanceof cv2)) {
            if (dv2Var instanceof bv2) {
                MainCoroutineDispatcher immediate = Dispatchers.getMain().getImmediate();
                lm lmVar = new lm(this.c, (bv2) dv2Var, null);
                this.b = 3;
                if (BuildersKt.withContext(immediate, lmVar, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            return Unit.INSTANCE;
        }
        wm wmVar2 = this.c;
        cv2 cv2Var = (cv2) dv2Var;
        v3 v3Var = wmVar2.c;
        ic icVar = cv2Var.a;
        jx jxVar = v3Var.b;
        jxVar.b = icVar;
        jxVar.a = cv2Var.b;
        this.b = 2;
        vw2 vw2Var2 = vw2.l;
        if (vw2Var2 == null) {
            synchronized (vw2.k) {
                vw2Var = vw2.l;
                if (vw2Var == null) {
                    vw2Var = new vw2();
                    vw2.l = vw2Var;
                }
            }
            vw2Var2 = vw2Var;
        }
        bu2 a = vw2Var2.a(wmVar2.a);
        ap apVar = a != null ? a.d0 : null;
        if (apVar != null) {
            obj2 = wmVar2.a(apVar, this);
            if (obj2 != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                obj2 = Unit.INSTANCE;
            }
        } else {
            obj2 = Unit.INSTANCE;
        }
        if (obj2 == coroutine_suspended) {
            return coroutine_suspended;
        }
        wm wmVar3 = this.c;
        wmVar3.a((db3) wmVar3.g);
        return Unit.INSTANCE;
    }
}
