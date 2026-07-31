package yads;

import android.content.Context;
import com.facebook.internal.NativeProtocol;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.DelayKt;

/* loaded from: classes13.dex */
public final class vn1 extends SuspendLambda implements Function2 {
    public int b;
    public final /* synthetic */ long c;
    public final /* synthetic */ wn1 d;
    public final /* synthetic */ Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vn1(long j, wn1 wn1Var, Object obj, Continuation continuation) {
        super(2, continuation);
        this.c = j;
        this.d = wn1Var;
        this.e = obj;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new vn1(this.c, this.d, this.e, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((vn1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.b;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            long j = this.c;
            this.b = 1;
            if (DelayKt.delay(j, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        wn1 wn1Var = this.d;
        d4 d4Var = e8.s;
        Object obj2 = this.e;
        wn1Var.a();
        wn1Var.b();
        wn1Var.a(wn1Var.n, MapsKt.mutableMapOf(TuplesKt.to("status", "error"), TuplesKt.to("error_code", Integer.valueOf(d4Var.a)), TuplesKt.to(NativeProtocol.BRIDGE_ARG_ERROR_DESCRIPTION, d4Var.b)));
        Context context = wn1Var.n;
        wn1Var.a(context);
        wn1Var.a(context, obj2);
        return Unit.INSTANCE;
    }
}
