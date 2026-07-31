package com.inmobi.media;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* loaded from: classes10.dex */
public final class Co extends SuspendLambda implements Function2 {
    public int a;
    public final /* synthetic */ String b;
    public final /* synthetic */ InterfaceC4466x9 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Co(String str, InterfaceC4466x9 interfaceC4466x9, Continuation continuation) {
        super(2, continuation);
        this.b = str;
        this.c = interfaceC4466x9;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new Co(this.b, this.c, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new Co(this.b, this.c, (Continuation) obj2).invokeSuspend(Unit.INSTANCE);
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
        Io io2 = Io.a;
        String str = this.b;
        InterfaceC4466x9 interfaceC4466x9 = this.c;
        this.a = 1;
        Object a = io2.a(str, interfaceC4466x9, this);
        return a == coroutine_suspended ? coroutine_suspended : a;
    }
}
