package com.inmobi.media;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.Deferred;

/* loaded from: classes10.dex */
public final class Go extends SuspendLambda implements Function1 {
    public int a;
    public final /* synthetic */ String b;
    public final /* synthetic */ InterfaceC4466x9 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Go(String str, InterfaceC4466x9 interfaceC4466x9, Continuation continuation) {
        super(1, continuation);
        this.b = str;
        this.c = interfaceC4466x9;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        return new Go(this.b, this.c, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return new Go(this.b, this.c, (Continuation) obj).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Deferred async$default;
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
        Io io2 = Io.a;
        String str = this.b;
        InterfaceC4466x9 interfaceC4466x9 = this.c;
        this.a = 1;
        async$default = BuildersKt__Builders_commonKt.async$default(L9.d, null, CoroutineStart.UNDISPATCHED, new Eo(str, interfaceC4466x9, null), 1, null);
        return async$default == coroutine_suspended ? coroutine_suspended : async$default;
    }
}
