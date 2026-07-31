package yads;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Deferred;

/* loaded from: classes4.dex */
public final class sm extends SuspendLambda implements Function2 {
    public v3 b;
    public int c;
    public /* synthetic */ Object d;
    public final /* synthetic */ wm e;
    public final /* synthetic */ ap f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sm(wm wmVar, ap apVar, Continuation continuation) {
        super(2, continuation);
        this.e = wmVar;
        this.f = apVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        sm smVar = new sm(this.e, this.f, continuation);
        smVar.d = obj;
        return smVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((sm) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Deferred async$default;
        Deferred async$default2;
        Deferred deferred;
        v3 v3Var;
        v3 v3Var2;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.c;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            CoroutineScope coroutineScope = (CoroutineScope) this.d;
            async$default = BuildersKt__Builders_commonKt.async$default(coroutineScope, null, null, new rm(this.e, this.f, null), 3, null);
            async$default2 = BuildersKt__Builders_commonKt.async$default(coroutineScope, null, null, new qm(this.e, this.f, null), 3, null);
            v3 v3Var3 = this.e.c;
            this.d = async$default;
            this.b = v3Var3;
            this.c = 1;
            obj = async$default2.await(this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
            deferred = async$default;
            v3Var = v3Var3;
        } else {
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                v3Var2 = (v3) this.d;
                ResultKt.throwOnFailure(obj);
                v3Var2.i = (String) obj;
                return Unit.INSTANCE;
            }
            v3Var = this.b;
            deferred = (Deferred) this.d;
            ResultKt.throwOnFailure(obj);
        }
        v3Var.h = (String) obj;
        v3 v3Var4 = this.e.c;
        this.d = v3Var4;
        this.b = null;
        this.c = 2;
        Object await = deferred.await(this);
        if (await == coroutine_suspended) {
            return coroutine_suspended;
        }
        v3Var2 = v3Var4;
        obj = await;
        v3Var2.i = (String) obj;
        return Unit.INSTANCE;
    }
}
