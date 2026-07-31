package com.inmobi.media;

import java.util.Map;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* renamed from: com.inmobi.media.f0, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C3983f0 extends SuspendLambda implements Function2 {
    public final /* synthetic */ C4167m0 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3983f0(C4167m0 c4167m0, Continuation continuation) {
        super(2, continuation);
        this.a = c4167m0;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new C3983f0(this.a, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new C3983f0(this.a, (Continuation) obj2).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        Map a = Hk.a(this.a.b);
        a.put("networkType", F5.o());
        C4425vk c4425vk = C4425vk.a;
        C4425vk.b("AdLoadCalled", a, EnumC4530zk.a);
        return Unit.INSTANCE;
    }
}
