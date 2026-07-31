package com.inmobi.media;

import com.inmobi.ads.AdMetaInfo;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* loaded from: classes12.dex */
public final class V6 extends SuspendLambda implements Function2 {
    public final /* synthetic */ C4154ld a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public V6(C4154ld c4154ld, Continuation continuation) {
        super(2, continuation);
        this.a = c4154ld;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new V6(this.a, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new V6(this.a, (Continuation) obj2).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        C4154ld c4154ld = this.a;
        Uc uc = c4154ld.d;
        G g = c4154ld.a.b;
        uc.onAdFetchSuccessful(new AdMetaInfo(g.e, g.l));
        return Unit.INSTANCE;
    }
}
