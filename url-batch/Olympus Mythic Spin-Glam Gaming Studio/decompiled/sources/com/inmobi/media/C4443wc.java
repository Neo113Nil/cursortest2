package com.inmobi.media;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* renamed from: com.inmobi.media.wc, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4443wc extends SuspendLambda implements Function2 {
    public final /* synthetic */ C4496yc a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4443wc(C4496yc c4496yc, Continuation continuation) {
        super(2, continuation);
        this.a = c4496yc;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new C4443wc(this.a, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new C4443wc(this.a, (Continuation) obj2).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        C4493y9 c4493y9 = this.a.a;
        if (c4493y9 != null) {
            c4493y9.a("MediaViewManager", "destroy called");
        }
        AbstractC4223o2 abstractC4223o2 = this.a.b;
        if (abstractC4223o2 != null) {
            abstractC4223o2.a();
        }
        this.a.b = null;
        return Unit.INSTANCE;
    }
}
