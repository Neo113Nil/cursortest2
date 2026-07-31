package com.inmobi.media;

import com.safedk.android.internal.partials.InMobiNetworkBridge;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CancellableContinuationImpl;
import okhttp3.Call;
import okhttp3.OkHttpClient;
import okhttp3.Request;

/* loaded from: classes10.dex */
public final class E4 extends SuspendLambda implements Function2 {
    public int a;
    public final /* synthetic */ OkHttpClient b;
    public final /* synthetic */ Request c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public E4(OkHttpClient okHttpClient, Request request, Continuation continuation) {
        super(2, continuation);
        this.b = okHttpClient;
        this.c = request;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new E4(this.b, this.c, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new E4(this.b, this.c, (Continuation) obj2).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.a;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return obj;
        }
        ResultKt.throwOnFailure(obj);
        Call newCall = this.b.newCall(this.c);
        Intrinsics.checkNotNullExpressionValue(newCall, "newCall(...)");
        this.a = 1;
        CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(IntrinsicsKt.intercepted(this), 1);
        cancellableContinuationImpl.initCancellability();
        cancellableContinuationImpl.invokeOnCancellation(new Bl(newCall));
        InMobiNetworkBridge.okhttp3CallEnqueue(newCall, new Cl(cancellableContinuationImpl));
        Object result = cancellableContinuationImpl.getResult();
        if (result == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(this);
        }
        return result == coroutine_suspended ? coroutine_suspended : result;
    }
}
