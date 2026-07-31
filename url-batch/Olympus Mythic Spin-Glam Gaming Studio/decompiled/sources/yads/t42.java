package yads;

import android.content.Context;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Deferred;
import kotlinx.coroutines.Job;

/* loaded from: classes10.dex */
public final class t42 extends SuspendLambda implements Function2 {
    public Deferred b;
    public int c;
    public /* synthetic */ Object d;
    public final /* synthetic */ v3 e;
    public final /* synthetic */ u42 f;
    public final /* synthetic */ Context g;
    public final /* synthetic */ dz1 h;
    public final /* synthetic */ z30 i;
    public final /* synthetic */ ri2 j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t42(v3 v3Var, u42 u42Var, Context context, dz1 dz1Var, z30 z30Var, ri2 ri2Var, Continuation continuation) {
        super(2, continuation);
        this.e = v3Var;
        this.f = u42Var;
        this.g = context;
        this.h = dz1Var;
        this.i = z30Var;
        this.j = ri2Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        t42 t42Var = new t42(this.e, this.f, this.g, this.h, this.i, this.j, continuation);
        t42Var.d = obj;
        return t42Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((t42) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x009d A[RETURN] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Job launch$default;
        Job launch$default2;
        Deferred async$default;
        Deferred deferred;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.c;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            CoroutineScope coroutineScope = (CoroutineScope) this.d;
            if (!this.e.m) {
                n62 n62Var = this.f.c;
                Context context = this.g;
                dz1 dz1Var = this.h;
                z30 z30Var = this.i;
                this.c = 4;
                obj = n62Var.a(false, context, dz1Var, z30Var, (ContinuationImpl) this);
                return obj == coroutine_suspended ? coroutine_suspended : obj;
            }
            launch$default = BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new q42(this.f, this.h, this.j, null), 3, null);
            launch$default2 = BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new s42(this.f, this.g, this.h, null), 3, null);
            async$default = BuildersKt__Builders_commonKt.async$default(coroutineScope, null, null, new r42(this.f, this.g, this.h, this.i, null), 3, null);
            this.d = launch$default2;
            this.b = async$default;
            this.c = 1;
            if (launch$default.join(this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            deferred = async$default;
            this.d = deferred;
            this.b = null;
            this.c = 2;
            if (launch$default2.join(this) == coroutine_suspended) {
            }
        } else if (i == 1) {
            deferred = this.b;
            launch$default2 = (Job) this.d;
            ResultKt.throwOnFailure(obj);
            this.d = deferred;
            this.b = null;
            this.c = 2;
            if (launch$default2.join(this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 2) {
                if (i == 3) {
                    ResultKt.throwOnFailure(obj);
                }
                if (i == 4) {
                    ResultKt.throwOnFailure(obj);
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            deferred = (Deferred) this.d;
            ResultKt.throwOnFailure(obj);
        }
        this.d = null;
        this.c = 3;
        obj = deferred.await(this);
        return obj == coroutine_suspended ? coroutine_suspended : obj;
    }
}
