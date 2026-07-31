package com.inmobi.media;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Deferred;

/* loaded from: classes12.dex */
public final class Ho extends SuspendLambda implements Function2 {
    public int a;
    public final /* synthetic */ InterfaceC4466x9 b;
    public final /* synthetic */ String c;
    public final /* synthetic */ Deferred d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Ho(InterfaceC4466x9 interfaceC4466x9, String str, Deferred deferred, Continuation continuation) {
        super(2, continuation);
        this.b = interfaceC4466x9;
        this.c = str;
        this.d = deferred;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new Ho(this.b, this.c, this.d, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((Ho) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
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
        InterfaceC4466x9 interfaceC4466x9 = this.b;
        if (interfaceC4466x9 != null) {
            ((C4493y9) interfaceC4466x9).c("WebResourceHandler", "Waiting for response to finish download: " + this.c);
        }
        Deferred deferred = this.d;
        this.a = 1;
        Object await = deferred.await(this);
        return await == coroutine_suspended ? coroutine_suspended : await;
    }
}
