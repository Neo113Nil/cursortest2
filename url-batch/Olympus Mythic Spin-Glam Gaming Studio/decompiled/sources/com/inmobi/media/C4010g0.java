package com.inmobi.media;

import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.util.Map;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* renamed from: com.inmobi.media.g0, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C4010g0 extends SuspendLambda implements Function2 {
    public final /* synthetic */ C4167m0 a;
    public final /* synthetic */ short b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4010g0(C4167m0 c4167m0, short s, Continuation continuation) {
        super(2, continuation);
        this.a = c4167m0;
        this.b = s;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new C4010g0(this.a, this.b, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new C4010g0(this.a, this.b, (Continuation) obj2).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        Map a = Hk.a(this.a.b);
        a.put(IronSourceConstants.EVENTS_ERROR_CODE, Boxing.boxShort(this.b));
        C4425vk c4425vk = C4425vk.a;
        C4425vk.b("AdLoadDroppedAtSDK", a, EnumC4530zk.a);
        return Unit.INSTANCE;
    }
}
