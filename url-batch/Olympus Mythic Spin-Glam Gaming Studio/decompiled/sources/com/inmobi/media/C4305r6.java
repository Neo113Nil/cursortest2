package com.inmobi.media;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;

/* renamed from: com.inmobi.media.r6, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C4305r6 extends SuspendLambda implements Function1 {
    public int a;
    public final /* synthetic */ C4358t6 b;
    public final /* synthetic */ boolean c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4305r6(C4358t6 c4358t6, boolean z, Continuation continuation) {
        super(1, continuation);
        this.b = c4358t6;
        this.c = z;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        return new C4305r6(this.b, this.c, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return new C4305r6(this.b, this.c, (Continuation) obj).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.a;
        try {
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                C4358t6 c4358t6 = this.b;
                boolean z = this.c;
                this.a = 1;
                if (C4358t6.a(c4358t6, z, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
        } catch (Exception unused) {
            C4358t6 c4358t62 = this.b;
            String str = c4358t62.e;
            c4358t62.f.set(false);
        }
        return Unit.INSTANCE;
    }
}
