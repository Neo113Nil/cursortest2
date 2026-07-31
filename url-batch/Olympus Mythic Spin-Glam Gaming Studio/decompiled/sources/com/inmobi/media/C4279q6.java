package com.inmobi.media;

import java.util.ArrayList;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* renamed from: com.inmobi.media.q6, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C4279q6 extends SuspendLambda implements Function2 {
    public int a;
    public final /* synthetic */ C4358t6 b;
    public final /* synthetic */ C4173m6 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4279q6(C4358t6 c4358t6, C4173m6 c4173m6, Continuation continuation) {
        super(2, continuation);
        this.b = c4358t6;
        this.c = c4173m6;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new C4279q6(this.b, this.c, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new C4279q6(this.b, this.c, (Continuation) obj2).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.a;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            AbstractC4147l6 abstractC4147l6 = this.b.b;
            ArrayList arrayList = this.c.a;
            this.a = 1;
            if (abstractC4147l6.a(arrayList, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        return Unit.INSTANCE;
    }
}
