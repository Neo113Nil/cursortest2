package com.inmobi.media;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* renamed from: com.inmobi.media.u8, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4386u8 extends SuspendLambda implements Function2 {
    public final /* synthetic */ C4439w8 a;
    public final /* synthetic */ InterfaceC4057hk b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4386u8(C4439w8 c4439w8, InterfaceC4057hk interfaceC4057hk, Continuation continuation) {
        super(2, continuation);
        this.a = c4439w8;
        this.b = interfaceC4057hk;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new C4386u8(this.a, this.b, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new C4386u8(this.a, this.b, (Continuation) obj2).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        C4439w8 c4439w8 = this.a;
        c4439w8.f = this.b;
        c4439w8.d.a(c4439w8.h);
        return Unit.INSTANCE;
    }
}
