package com.inmobi.media;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* renamed from: com.inmobi.media.rb, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C4310rb extends SuspendLambda implements Function2 {
    public final /* synthetic */ C4336sb a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4310rb(C4336sb c4336sb, Continuation continuation) {
        super(2, continuation);
        this.a = c4336sb;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new C4310rb(this.a, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new C4310rb(this.a, (Continuation) obj2).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        C4336sb c4336sb = this.a;
        c4336sb.f.onAdLoadFailed(c4336sb.e);
        return Unit.INSTANCE;
    }
}
