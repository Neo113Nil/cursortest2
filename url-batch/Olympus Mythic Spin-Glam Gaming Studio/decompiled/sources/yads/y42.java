package yads;

import android.content.Context;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Deferred;
import kotlinx.coroutines.Job;

/* loaded from: classes3.dex */
public final class y42 extends SuspendLambda implements Function2 {
    public Deferred b;
    public int c;
    public /* synthetic */ Object d;
    public final /* synthetic */ Context e;
    public final /* synthetic */ uz1 f;
    public final /* synthetic */ wz1 g;
    public final /* synthetic */ z42 h;
    public final /* synthetic */ v3 i;
    public final /* synthetic */ dz1 j;
    public final /* synthetic */ z30 k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y42(Context context, uz1 uz1Var, wz1 wz1Var, z42 z42Var, v3 v3Var, dz1 dz1Var, z30 z30Var, Continuation continuation) {
        super(2, continuation);
        this.e = context;
        this.f = uz1Var;
        this.g = wz1Var;
        this.h = z42Var;
        this.i = v3Var;
        this.j = dz1Var;
        this.k = z30Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        y42 y42Var = new y42(this.e, this.f, this.g, this.h, this.i, this.j, this.k, continuation);
        y42Var.d = obj;
        return y42Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((y42) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0085  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        ri2 ri2Var;
        Deferred async$default;
        Job launch$default;
        ri2 ri2Var2;
        dz1 dz1Var;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.c;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            CoroutineScope coroutineScope = (CoroutineScope) this.d;
            ri2Var = new ri2(this.e);
            async$default = BuildersKt__Builders_commonKt.async$default(coroutineScope, null, null, new x42(this.h, this.i, this.e, this.j, ri2Var, this.k, null), 3, null);
            launch$default = BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new w42(this.h, this.j, null), 3, null);
            this.d = ri2Var;
            this.b = async$default;
            this.c = 1;
            if (launch$default.join(this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ri2 ri2Var3 = (ri2) this.d;
                ResultKt.throwOnFailure(obj);
                ri2Var2 = ri2Var3;
                dz1Var = (dz1) obj;
                if (dz1Var != null) {
                    this.f.a(e8.w);
                } else {
                    wz1 wz1Var = this.g;
                    wz1Var.b.a(h5.n);
                    xz1 xz1Var = wz1Var.c;
                    zz1 zz1Var = xz1Var.g;
                    BuildersKt__Builders_commonKt.launch$default(zz1Var.d, null, null, new vz1(zz1Var, dz1Var, ri2Var2, xz1Var, wz1Var, null), 3, null);
                }
                return Unit.INSTANCE;
            }
            Deferred deferred = this.b;
            ri2 ri2Var4 = (ri2) this.d;
            ResultKt.throwOnFailure(obj);
            async$default = deferred;
            ri2Var = ri2Var4;
        }
        this.d = ri2Var;
        this.b = null;
        this.c = 2;
        obj = async$default.await(this);
        if (obj == coroutine_suspended) {
            return coroutine_suspended;
        }
        ri2Var2 = ri2Var;
        dz1Var = (dz1) obj;
        if (dz1Var != null) {
        }
        return Unit.INSTANCE;
    }
}
