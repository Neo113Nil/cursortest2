package com.inmobi.media;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.DelayKt;

/* renamed from: com.inmobi.media.c7, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C3910c7 extends SuspendLambda implements Function2 {
    public int a;
    public /* synthetic */ Object b;
    public final /* synthetic */ C3936d7 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3910c7(C3936d7 c3936d7, Continuation continuation) {
        super(2, continuation);
        this.c = c3936d7;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        C3910c7 c3910c7 = new C3910c7(this.c, continuation);
        c3910c7.b = obj;
        return c3910c7;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        C3910c7 c3910c7 = new C3910c7(this.c, (Continuation) obj2);
        c3910c7.b = (CoroutineScope) obj;
        return c3910c7.invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineScope coroutineScope;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.a;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            coroutineScope = (CoroutineScope) this.b;
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            coroutineScope = (CoroutineScope) this.b;
            ResultKt.throwOnFailure(obj);
        }
        while (CoroutineScopeKt.isActive(coroutineScope)) {
            C3936d7 c3936d7 = this.c;
            c3936d7.d.setValue(Boxing.boxBoolean(c3936d7.b.getWindowVisibility() == 0));
            long j = this.c.c;
            this.b = coroutineScope;
            this.a = 1;
            if (DelayKt.delay(j, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        return Unit.INSTANCE;
    }
}
