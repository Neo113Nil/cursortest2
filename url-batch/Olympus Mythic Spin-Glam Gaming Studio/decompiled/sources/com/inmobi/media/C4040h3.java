package com.inmobi.media;

import com.inmobi.media.core.config.models.AdConfig;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.TypeIntrinsics;

/* renamed from: com.inmobi.media.h3, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C4040h3 extends SuspendLambda implements Function2 {
    public int a;
    public final /* synthetic */ C3932d3 b;
    public final /* synthetic */ AdConfig.ImaiConfig c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4040h3(C3932d3 c3932d3, AdConfig.ImaiConfig imaiConfig, Continuation continuation) {
        super(2, continuation);
        this.b = c3932d3;
        this.c = imaiConfig;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new C4040h3(this.b, this.c, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new C4040h3(this.b, this.c, (Continuation) obj2).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.a;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            C3932d3 c3932d3 = this.b;
            int maxEventBatch = this.c.getMaxEventBatch();
            int pingInterval = this.c.getPingInterval();
            this.a = 1;
            obj = c3932d3.a(maxEventBatch, pingInterval, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.MutableList<com.inmobi.ads.core.Click>");
        return TypeIntrinsics.asMutableList(obj);
    }
}
