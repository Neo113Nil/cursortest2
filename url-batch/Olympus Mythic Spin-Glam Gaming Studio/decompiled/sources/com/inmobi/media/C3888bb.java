package com.inmobi.media;

import java.util.LinkedHashMap;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* renamed from: com.inmobi.media.bb, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C3888bb extends SuspendLambda implements Function2 {
    public final /* synthetic */ LinkedHashMap a;
    public final /* synthetic */ String b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3888bb(LinkedHashMap linkedHashMap, String str, Continuation continuation) {
        super(2, continuation);
        this.a = linkedHashMap;
        this.b = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new C3888bb(this.a, this.b, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new C3888bb(this.a, this.b, (Continuation) obj2).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        this.a.put("networkType", F5.o());
        String str = this.b;
        LinkedHashMap linkedHashMap = this.a;
        C4425vk c4425vk = C4425vk.a;
        C4425vk.b(str, linkedHashMap, EnumC4530zk.a);
        return Unit.INSTANCE;
    }
}
